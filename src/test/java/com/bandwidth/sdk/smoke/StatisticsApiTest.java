package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.StatisticsApi;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.model.AccountStatistics;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

/**
 * API tests for StatisticsApi
 */
@Disabled
public class StatisticsApiTest {
    private static ApiClient oauthClient = new ApiClient(BW_CLIENT_ID, BW_CLIENT_SECRET, null);
    private final StatisticsApi api = new StatisticsApi(oauthClient);
    /**
     * Get Account Statistics
     *
     * Returns details about the current state of the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsTest() throws ApiException {
        AccountStatistics response = api.getStatistics(BW_ACCOUNT_ID);

        assertThat(response, instanceOf(AccountStatistics.class));
        assertThat(response.getCurrentCallQueueSize(), instanceOf(Integer.class));
        assertThat(response.getMaxCallQueueSize(), instanceOf(Integer.class));
        // TODO: test validations
    }

}
