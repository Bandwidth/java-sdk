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

import com.bandwidth.sdk.model.AdditionalDenialReason;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for AdditionalDenialReason
 */
public class AdditionalDenialReasonTest {
    private final AdditionalDenialReason model = new AdditionalDenialReason()
            .statusCode(403)
            .reason("Forbidden")
            .resubmitAllowed(true);

    /**
     * Model tests for AdditionalDenialReason
     */
    @Test
    public void testAdditionalDenialReason() {
        assertThat(model, instanceOf(AdditionalDenialReason.class));
    }

    /**
     * Test the property 'statusCode'
     */
    @Test
    public void statusCodeTest() {
        assertThat(model.getStatusCode(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'reason'
     */
    @Test
    public void reasonTest() {
        assertThat(model.getReason(), instanceOf(String.class));
    }

    /**
     * Test the property 'resubmitAllowed'
     */
    @Test
    public void resubmitAllowedTest() {
        assertThat(model.getResubmitAllowed(), instanceOf(Boolean.class));
    }

}
