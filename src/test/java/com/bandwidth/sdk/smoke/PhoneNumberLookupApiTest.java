package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.PhoneNumberLookupApi;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.model.AsyncLookupRequest;
import com.bandwidth.sdk.model.CompletedLookupStatusEnum;
import com.bandwidth.sdk.model.CreateAsyncBulkLookupResponse;
import com.bandwidth.sdk.model.CreateAsyncBulkLookupResponseData;
import com.bandwidth.sdk.model.CreateSyncLookupResponse;
import com.bandwidth.sdk.model.CreateSyncLookupResponseData;
import com.bandwidth.sdk.model.GetAsyncBulkLookupResponse;
import com.bandwidth.sdk.model.GetAsyncBulkLookupResponseData;
import com.bandwidth.sdk.model.InProgressLookupStatusEnum;
import com.bandwidth.sdk.model.LineTypeEnum;
import com.bandwidth.sdk.model.LinkSchema;
import com.bandwidth.sdk.model.LookupResult;
import com.bandwidth.sdk.model.SyncLookupRequest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

@SuppressWarnings("null")
public class PhoneNumberLookupApiTest {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final PhoneNumberLookupApi api = new PhoneNumberLookupApi(defaultClient);
    private final List<String> phoneNumbers = Arrays.asList(BW_NUMBER, VZW_NUMBER, ATT_NUMBER, T_MOBILE_NUMBER);

    @Test
    public void createSyncLookupTest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        SyncLookupRequest lookupRequest = new SyncLookupRequest()
                .phoneNumbers(phoneNumbers);

        ApiResponse<CreateSyncLookupResponse> response = api.createSyncLookupWithHttpInfo(BW_ACCOUNT_ID, lookupRequest);
        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(CreateSyncLookupResponse.class));
        CreateSyncLookupResponse lookupResponse = response.getData();
        assertThat(lookupResponse.getLinks(), instanceOf(List.class));
        assertThat(lookupResponse.getLinks().get(0), instanceOf(LinkSchema.class));
        assertThat(lookupResponse.getData(), instanceOf(CreateSyncLookupResponseData.class));
        assertThat(lookupResponse.getData().getRequestId(), instanceOf(UUID.class));
        assertThat(lookupResponse.getData().getStatus(), instanceOf(CompletedLookupStatusEnum.class));
        assertThat(lookupResponse.getData().getResults(), instanceOf(List.class));
        LookupResult firstResult = lookupResponse.getData().getResults().get(0);
        assertThat(firstResult.getPhoneNumber(), instanceOf(String.class));
        assertThat(firstResult.getLineType(), instanceOf(LineTypeEnum.class));
        assertThat(firstResult.getMessagingProvider(), instanceOf(String.class));
        assertThat(firstResult.getVoiceProvider(), instanceOf(String.class));
        assertThat(firstResult.getCountryCodeA3(), instanceOf(String.class));
    }

    @Test
    public void createGetAsyncLookupTest() throws ApiException, InterruptedException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        AsyncLookupRequest lookupRequest = new AsyncLookupRequest()
                .phoneNumbers(phoneNumbers);

        ApiResponse<CreateAsyncBulkLookupResponse> createResponse
                = api.createAsyncBulkLookupWithHttpInfo(BW_ACCOUNT_ID, lookupRequest);

        assertThat(createResponse.getStatusCode(), is(202));
        assertThat(createResponse.getData(), instanceOf(CreateAsyncBulkLookupResponse.class));
        assertThat(createResponse.getData().getData(), instanceOf(CreateAsyncBulkLookupResponseData.class));
        assertThat(createResponse.getData().getData().getRequestId(), instanceOf(UUID.class));
        assertThat(createResponse.getData().getData().getStatus(), instanceOf(InProgressLookupStatusEnum.class));
        UUID requestId = createResponse.getData().getData().getRequestId();

        TimeUnit.SECONDS.sleep(30);

        ApiResponse<GetAsyncBulkLookupResponse> getResponse
                = api.getAsyncBulkLookupWithHttpInfo(BW_ACCOUNT_ID, requestId);

        assertThat(getResponse.getStatusCode(), is(200));
        assertThat(getResponse.getData(), instanceOf(GetAsyncBulkLookupResponse.class));
        GetAsyncBulkLookupResponse lookupResponse = getResponse.getData();
        assertThat(lookupResponse.getLinks(), instanceOf(List.class));
        assertThat(lookupResponse.getLinks().get(0), instanceOf(LinkSchema.class));
        assertThat(lookupResponse.getData(), instanceOf(GetAsyncBulkLookupResponseData.class));
        assertThat(lookupResponse.getData().getRequestId(), equalTo(requestId));
        assertThat(lookupResponse.getData().getStatus(), instanceOf(InProgressLookupStatusEnum.class));
        assertThat(lookupResponse.getData().getResults(), instanceOf(List.class));
        LookupResult firstResult = lookupResponse.getData().getResults().get(0);
        assertThat(firstResult.getPhoneNumber(), instanceOf(String.class));
        assertThat(firstResult.getLineType(), instanceOf(LineTypeEnum.class));
        assertThat(firstResult.getMessagingProvider(), instanceOf(String.class));
        assertThat(firstResult.getVoiceProvider(), instanceOf(String.class));
        assertThat(firstResult.getCountryCodeA3(), instanceOf(String.class));
    }
}
