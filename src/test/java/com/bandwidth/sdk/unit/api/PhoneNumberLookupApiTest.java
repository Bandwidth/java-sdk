package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.PhoneNumberLookupApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CreateLookupResponse;
import com.bandwidth.sdk.model.LookupRequest;
import com.bandwidth.sdk.model.LookupStatus;
import com.bandwidth.sdk.model.LookupStatusEnum;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

@SuppressWarnings("null")
public class PhoneNumberLookupApiTest {
    public static ApiClient defaultClient = Configuration.getDefaultApiClient();
    public static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static PhoneNumberLookupApi api = new PhoneNumberLookupApi(defaultClient);

    private static String lookupRequestId = "1234";

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testCreateLookup() throws ApiException {
        LookupRequest lookupRequest = new LookupRequest()
                .tns(new ArrayList<String>(Arrays.asList(USER_NUMBER)));

        ApiResponse<CreateLookupResponse> response = api.createLookupWithHttpInfo(BW_ACCOUNT_ID, lookupRequest);

        assertThat(response.getStatusCode(), is(202));
        assertThat(response.getData(), instanceOf(CreateLookupResponse.class));
        assertThat(response.getData().getRequestId().length(), is(36));
        assertThat(response.getData().getStatus(), instanceOf(LookupStatusEnum.class));
    }

    @Test // Can't do more asserts because we can't specify the example using headers
    public void testGetLookupStatus() throws ApiException {
        ApiResponse<LookupStatus> response = api.getLookupStatusWithHttpInfo(BW_ACCOUNT_ID, lookupRequestId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(LookupStatus.class));
        assertThat(response.getData().getRequestId().length(), is(36));
        assertThat(response.getData().getStatus(), instanceOf(LookupStatusEnum.class));
    }
}
