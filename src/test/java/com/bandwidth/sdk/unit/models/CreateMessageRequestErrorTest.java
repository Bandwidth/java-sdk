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

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import com.bandwidth.sdk.model.CreateMessageRequestError;
import com.bandwidth.sdk.model.FieldError;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for CreateMessageRequestError
 */
public class CreateMessageRequestErrorTest {
    private final CreateMessageRequestError model = new CreateMessageRequestError()
            .type("type")
            .description("description")
            .fieldErrors(new ArrayList<FieldError>(Arrays.asList(new FieldError())));

    /**
     * Model tests for CreateMessageRequestError
     */
    @Test
    public void testCreateMessageRequestError() {
        assertThat(model, instanceOf(CreateMessageRequestError.class));
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
     * Test the property 'fieldErrors'
     */
    @Test
    public void fieldErrorsTest() {
        assertThat(model.getFieldErrors(), instanceOf(List.class));
    }

}
