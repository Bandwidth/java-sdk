package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.StatisticsApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.AccountStatistics;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

public class StatisticsApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static StatisticsApi api = new StatisticsApi(defaultClient);

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testGetStatistics() throws ApiException {
        ApiResponse<AccountStatistics> response = api.getStatisticsWithHttpInfo(BW_ACCOUNT_ID);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(AccountStatistics.class));
        assertThat(response.getData().getCurrentCallQueueSize(), instanceOf(Integer.class));
        assertThat(response.getData().getMaxCallQueueSize(), instanceOf(Integer.class));
    }
}
