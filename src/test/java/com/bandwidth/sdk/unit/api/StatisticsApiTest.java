package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.api.StatisticsApi;
import com.bandwidth.sdk.model.AccountStatistics;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

@SuppressWarnings("null")
public class StatisticsApiTest {
    private static ApiClient oauthClient = new ApiClient(BW_CLIENT_ID, BW_CLIENT_SECRET, null);
    private static StatisticsApi api = new StatisticsApi(oauthClient);

    @BeforeAll
    public static void setUp() {
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
