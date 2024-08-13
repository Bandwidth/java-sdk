package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.StatisticsApi;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.model.AccountStatistics;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for StatisticsApi
 */
@Disabled
public class StatisticsApiTest {

    private final StatisticsApi api = new StatisticsApi();

    /**
     * Get Account Statistics
     *
     * Returns details about the current state of the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsTest() throws ApiException {
        String accountId = null;
        AccountStatistics response = api.getStatistics(accountId);
        // TODO: test validations
    }

}
