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

import com.bandwidth.sdk.model.MfaRequestError;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for MfaRequestError
 */
public class MfaRequestErrorTest {
    private final MfaRequestError model = new MfaRequestError()
            .error("error")
            .requestId("requestId");

    /**
     * Model tests for MfaRequestError
     */
    @Test
    public void testMfaRequestError() {
        assertThat(model, instanceOf(MfaRequestError.class));
    }

    /**
     * Test the property 'error'
     */
    @Test
    public void errorTest() {
        assertThat(model.getError(), instanceOf(String.class));
    }

    /**
     * Test the property 'requestId'
     */
    @Test
    public void requestIdTest() {
        assertThat(model.getRequestId(), instanceOf(String.class));
    }

}