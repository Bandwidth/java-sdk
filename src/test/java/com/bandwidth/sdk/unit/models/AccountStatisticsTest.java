/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.bandwidth.sdk.unit.models;

import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.model.AccountStatistics;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for AccountStatistics
 */
public class AccountStatisticsTest {
    private static AccountStatistics model = new AccountStatistics()
            .currentCallQueueSize(10)
            .maxCallQueueSize(10);

    /**
     * Model tests for AccountStatistics
     */
    @Test
    public void testAccountStatistics() {
        assertThat(model, instanceOf(AccountStatistics.class));
    }

    /**
     * Test the property 'currentCallQueueSize'
     */
    @Test
    public void currentCallQueueSizeTest() {
        assertThat(model.getCurrentCallQueueSize(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'maxCallQueueSize'
     */
    @Test
    public void maxCallQueueSizeTest() {
        assertThat(model.getMaxCallQueueSize(), instanceOf(Integer.class));
    }

}