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

import java.net.URI;
import java.time.OffsetDateTime;
import com.bandwidth.sdk.model.DisconnectCallback;
import com.bandwidth.sdk.model.CallDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for DisconnectCallback
 */
public class DisconnectCallbackTest {
    private final DisconnectCallback model = new DisconnectCallback()
            .eventType("disconnect")
            .eventTime(OffsetDateTime.now())
            .accountId("accountId")
            .applicationId("applicationId")
            .from("from")
            .to("to")
            .callId("callId")
            .direction(CallDirectionEnum.INBOUND)
            .callUrl(URI.create("https://bandwidth.com"))
            .enqueuedTime(OffsetDateTime.now())
            .startTime(OffsetDateTime.now())
            .answerTime(OffsetDateTime.now())
            .endTime(OffsetDateTime.now())
            .cause("cause")
            .errorMessage("errorMessage")
            .errorId("errorId")
            .tag("tag");

    /**
     * Model tests for DisconnectCallback
     */
    @Test
    public void testDisconnectCallback() {
        assertThat(model, instanceOf(DisconnectCallback.class));
    }

    /**
     * Test the property 'eventType'
     */
    @Test
    public void eventTypeTest() {
        assertThat(model.getEventType(), instanceOf(String.class));
    }

    /**
     * Test the property 'eventTime'
     */
    @Test
    public void eventTimeTest() {
        assertThat(model.getEventTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        assertThat(model.getAccountId(), instanceOf(String.class));
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        assertThat(model.getApplicationId(), instanceOf(String.class));
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {
        assertThat(model.getFrom(), instanceOf(String.class));
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        assertThat(model.getTo(), instanceOf(String.class));
    }

    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
        assertThat(model.getCallId(), instanceOf(String.class));
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        assertThat(model.getDirection(), instanceOf(CallDirectionEnum.class));
    }

    /**
     * Test the property 'callUrl'
     */
    @Test
    public void callUrlTest() {
        assertThat(model.getCallUrl(), instanceOf(URI.class));
    }

    /**
     * Test the property 'enqueuedTime'
     */
    @Test
    public void enqueuedTimeTest() {
        assertThat(model.getEnqueuedTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'startTime'
     */
    @Test
    public void startTimeTest() {
        assertThat(model.getStartTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'answerTime'
     */
    @Test
    public void answerTimeTest() {
        assertThat(model.getAnswerTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'endTime'
     */
    @Test
    public void endTimeTest() {
        assertThat(model.getEndTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'cause'
     */
    @Test
    public void causeTest() {
        assertThat(model.getCause(), instanceOf(String.class));
    }

    /**
     * Test the property 'errorMessage'
     */
    @Test
    public void errorMessageTest() {
        assertThat(model.getErrorMessage(), instanceOf(String.class));
    }

    /**
     * Test the property 'errorId'
     */
    @Test
    public void errorIdTest() {
        assertThat(model.getErrorId(), instanceOf(String.class));
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        assertThat(model.getTag(), instanceOf(String.class));
    }

}
