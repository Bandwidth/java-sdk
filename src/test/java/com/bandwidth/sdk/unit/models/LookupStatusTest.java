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

import java.util.Arrays;
import java.util.ArrayList;
import com.bandwidth.sdk.model.LookupStatus;
import com.bandwidth.sdk.model.LookupResult;
import com.bandwidth.sdk.model.LookupStatusEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for LookupStatus
 */
public class LookupStatusTest {
    private final LookupStatus model = new LookupStatus()
            .requestId("requestId")
            .status(LookupStatusEnum.COMPLETE)
            .result(new ArrayList<LookupResult>(Arrays.asList(new LookupResult())))
            .failedTelephoneNumbers(new ArrayList<String>(Arrays.asList("failedTelephoneNumbers")));

    /**
     * Model tests for LookupStatus
     */
    @Test
    public void testLookupStatus() {
        assertThat(model, instanceOf(LookupStatus.class));
    }

    /**
     * Test the property 'requestId'
     */
    @Test
    public void requestIdTest() {
        assertThat(model.getRequestId(), instanceOf(String.class));
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        assertThat(model.getStatus(), instanceOf(LookupStatusEnum.class));
    }

    /**
     * Test the property 'result'
     */
    @Test
    public void resultTest() {
        assertThat(model.getResult(), instanceOf(ArrayList.class));
    }

    /**
     * Test the property 'failedTelephoneNumbers'
     */
    @Test
    public void failedTelephoneNumbersTest() {
        assertThat(model.getFailedTelephoneNumbers(), instanceOf(ArrayList.class));
    }

}
