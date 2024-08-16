package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.StatisticsApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.model.AccountStatistics;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

/**
 * API tests for StatisticsApi
 */
public class StatisticsApiTest {
    public ApiClient defaultClient = Configuration.getDefaultApiClient();
    public HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final StatisticsApi api = new StatisticsApi(defaultClient);

    /**
     * Get Account Statistics
     *
     * Returns details about the current state of the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsTest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        AccountStatistics response = api.getStatistics(BW_ACCOUNT_ID);

        assertThat(response, instanceOf(AccountStatistics.class));
        assertThat(response.getCurrentCallQueueSize(), instanceOf(Integer.class));
        assertThat(response.getMaxCallQueueSize(), instanceOf(Integer.class));
        // TODO: test validations
    }

}
