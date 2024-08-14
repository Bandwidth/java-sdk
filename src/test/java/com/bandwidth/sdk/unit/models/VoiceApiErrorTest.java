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

import com.bandwidth.sdk.model.VoiceApiError;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for VoiceApiError
 */
public class VoiceApiErrorTest {
    private final VoiceApiError model = new VoiceApiError()
            .type("type")
            .description("description")
            .id("id");

    /**
     * Model tests for VoiceApiError
     */
    @Test
    public void testVoiceApiError() {
        assertThat(model, instanceOf(VoiceApiError.class));
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertThat(model.getType(), instanceOf(String.class));
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        assertThat(model.getDescription(), instanceOf(String.class));
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        assertThat(model.getId(), instanceOf(String.class));
    }

}
