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

import com.bandwidth.sdk.model.TfvError;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for TfvError
 */
public class TfvErrorTest {
    private final TfvError model = new TfvError()
            .type("type")
            .description("description")
            .errors(new Object());

    /**
     * Model tests for TfvError
     */
    @Test
    public void testTfvError() {
        assertThat(model, instanceOf(TfvError.class));
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
     * Test the property 'errors'
     */
    @Test
    public void errorsTest() {
        assertThat(model.getErrors(), instanceOf(Object.class));
    }

}
