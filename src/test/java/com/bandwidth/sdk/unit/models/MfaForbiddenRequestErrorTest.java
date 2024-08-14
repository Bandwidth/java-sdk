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

import com.bandwidth.sdk.model.MfaForbiddenRequestError;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for MfaForbiddenRequestError
 */
public class MfaForbiddenRequestErrorTest {
    private final MfaForbiddenRequestError model = new MfaForbiddenRequestError()
            .message("message");

    /**
     * Model tests for MfaForbiddenRequestError
     */
    @Test
    public void testMfaForbiddenRequestError() {
        assertThat(model, instanceOf(MfaForbiddenRequestError.class));
    }

    /**
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
        assertThat(model.getMessage(), instanceOf(String.class));
    }

}
