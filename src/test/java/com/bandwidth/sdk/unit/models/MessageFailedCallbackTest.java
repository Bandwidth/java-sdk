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

import java.time.OffsetDateTime;
import com.bandwidth.sdk.model.MessageFailedCallback;
import com.bandwidth.sdk.model.MessageFailedCallbackMessage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for MessageFailedCallback
 */
public class MessageFailedCallbackTest {
    private final MessageFailedCallback model = new MessageFailedCallback()
            .time(OffsetDateTime.now())
            .type("type")
            .to("to")
            .description("description")
            .message(new MessageFailedCallbackMessage())
            .errorCode(123);

    /**
     * Model tests for MessageFailedCallback
     */
    @Test
    public void testMessageFailedCallback() {
        assertThat(model, instanceOf(MessageFailedCallback.class));
    }

    /**
     * Test the property 'time'
     */
    @Test
    public void timeTest() {
        assertThat(model.getTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        assertThat(model.getType(), instanceOf(String.class));
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        assertThat(model.getTo(), instanceOf(String.class));
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        assertThat(model.getDescription(), instanceOf(String.class));
    }

    /**
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
        assertThat(model.getMessage(), instanceOf(MessageFailedCallbackMessage.class));
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    public void errorCodeTest() {
        assertThat(model.getErrorCode(), instanceOf(Integer.class));
    }

}