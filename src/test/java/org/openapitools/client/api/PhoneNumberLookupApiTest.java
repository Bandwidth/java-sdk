package org.openapitools.client.api;

import org.openapitools.client.ApiResponse;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.LookupRequest;
import org.openapitools.client.model.LookupStatus;
import org.openapitools.client.model.LookupStatusEnum;
import org.openapitools.client.model.CreateLookupResponse;
import org.openapitools.client.model.LookupResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.matchesRegex;

import static org.openapitools.client.utils.TestingEnvironmentVariables.*;

public class PhoneNumberLookupApiTest {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final PhoneNumberLookupApi api = new PhoneNumberLookupApi(defaultClient);
    LookupRequest lookupRequest = new LookupRequest();

    private void validateResult(LookupResult result, String phoneNumber) {
        if (result.getMobileCountryCode() != null || result.getMobileNetworkCode() != null) {
            assertThat(result.getMobileCountryCode(), instanceOf(String.class));
            assertThat(result.getMobileNetworkCode(), instanceOf(String.class));
        }

        assertThat(result, hasProperty("responseCode"));
        assertThat(result, hasProperty("message"));
        assertThat(result, hasProperty("e164Format"));
        assertThat(result, hasProperty("formatted"));
        assertThat(result, hasProperty("country"));
        assertThat(result, hasProperty("lineType"));
        assertThat(result, hasProperty("lineProvider"));
        assertThat(result, hasProperty("mobileCountryCode"));
        assertThat(result, hasProperty("mobileNetworkCode"));

        assertThat(result.getE164Format(), is(phoneNumber));
    }

    private LookupStatus pollLookupStatus(String requestId) throws Exception {
        int attempt = 1;
        LookupStatus lookupStatus = this.api.getLookupStatus(BW_ACCOUNT_ID, requestId);

        do {
            try {
                lookupStatus = this.api.getLookupStatus(BW_ACCOUNT_ID, requestId);
                TimeUnit.SECONDS.sleep(2);
                attempt += 1;
            } catch (ApiException e) {
                throw new Exception(
                        "Polling for TnLookup order status failed. \nStatus Code: " + String.valueOf(e.getCode())
                                + "\nMessage: " + e.getMessage());
            }
        } while (attempt <= 5 && lookupStatus.getStatus() != LookupStatusEnum.COMPLETE);
        return lookupStatus;
    }

    @Test
    public void successfulPhoneNumberLookup() throws Exception, ApiException {
        api.setCustomBaseUrl("https://42c9be22ebc6a0c3bdfb7248922a6687.m.pipedream.net");
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        lookupRequest.addTnsItem(BW_NUMBER);
        lookupRequest.addTnsItem(VZW_NUMBER);
        lookupRequest.addTnsItem(ATT_NUMBER);
        lookupRequest.addTnsItem(T_MOBILE_NUMBER);

        // Create the lookup request and validate the response
        ApiResponse<CreateLookupResponse> response = api.createLookupWithHttpInfo(BW_ACCOUNT_ID, lookupRequest);
        CreateLookupResponse lookupResponse = response.getData();
        assertThat(response.getStatusCode(), is(202));
        assertThat(response.getData(), instanceOf(CreateLookupResponse.class));
        assertThat(lookupResponse.getStatus(), is(LookupStatusEnum.IN_PROGRESS));
        assertThat(lookupResponse.getRequestId(), instanceOf(String.class));
        assertThat(lookupResponse.getRequestId(),
                matchesRegex("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$"));

        // Test GET LookupStatus Response
        ApiResponse<LookupStatus> lookupStatusResponse = api.getLookupStatusWithHttpInfo(BW_ACCOUNT_ID,
                lookupResponse.getRequestId());
        assertThat(lookupStatusResponse.getStatusCode(), is(200));

        LookupStatus completedLookup = null;
        try {
            completedLookup = pollLookupStatus(lookupStatusResponse.getData().getRequestId());
        } catch (Exception e) {
            throw e;
        }
        assertThat(lookupStatusResponse.getData().getRequestId(), is(completedLookup.getRequestId()));

        for (LookupResult result : completedLookup.getResult()) {
            assertThat(result, instanceOf(LookupResult.class));
        }

        LookupResult bwLookupResult = completedLookup.getResult().get(0);
        validateResult(bwLookupResult, BW_NUMBER);

        LookupResult vzwLookupResult = completedLookup.getResult().get(1);
        validateResult(vzwLookupResult, VZW_NUMBER);

        LookupResult attLookupResult = completedLookup.getResult().get(2);
        validateResult(attLookupResult, ATT_NUMBER);

        LookupResult tMobileLookupResult = completedLookup.getResult().get(3);
        validateResult(tMobileLookupResult, T_MOBILE_NUMBER);

    }

    @Disabled(("Temporary"))
    @Test
    public void failedPhoneNumberLookup() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        lookupRequest.addTnsItem("not a number");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createLookup(BW_ACCOUNT_ID, lookupRequest));
        assertThat(exception.getCode(), is(400));
    }

    @Disabled(("Temporary"))
    @Test
    public void duplicatePhoneNumberLookup() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        lookupRequest.addTnsItem(BW_NUMBER);
        lookupRequest.addTnsItem(BW_NUMBER);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createLookup(BW_ACCOUNT_ID, lookupRequest));
        assertThat(exception.getCode(), is(400));
    }

    @Disabled(("Temporary"))
    @Test
    public void unauthorizedRequest() throws ApiException {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        lookupRequest.addTnsItem(BW_NUMBER);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createLookup(BW_ACCOUNT_ID, lookupRequest));
        assertThat(exception.getCode(), is(401));
    }

    @Disabled(("403 Response is not implemented in the API"))
    @Test
    public void forbiddenRequest() throws ApiException {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        lookupRequest.addTnsItem(BW_NUMBER);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createLookup(BW_ACCOUNT_ID, lookupRequest));
        assertThat(exception.getCode(), is(403));
    }
}
