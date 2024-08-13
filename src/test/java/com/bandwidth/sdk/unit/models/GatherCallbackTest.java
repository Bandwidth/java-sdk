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
import com.bandwidth.sdk.model.GatherCallback;
import com.bandwidth.sdk.model.CallDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for GatherCallback
 */
public class GatherCallbackTest {
    private final GatherCallback model = new GatherCallback()
            .eventType("eventType")
            .eventTime(OffsetDateTime.now())
            .accountId("accountId")
            .applicationId("applicationId")
            .from("from")
            .to("to")
            .direction(CallDirectionEnum.INBOUND)
            .callId("callId")
            .digits("digits")
            .callUrl("callUrl")
            .enqueuedTime(OffsetDateTime.now())
            .startTime(OffsetDateTime.now())
            .answerTime(OffsetDateTime.now())
            .parentCallId("parentCallId")
            .terminatingDigit("terminatingDigit")
            .transferCallerId("transferCallerId")
            .transferTo("transferTo")
            .tag("tag");

    /**
     * Model tests for GatherCallback
     */
    @Test
    public void testGatherCallback() {
        assertThat(model, instanceOf(GatherCallback.class));
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
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        assertThat(model.getDirection(), instanceOf(CallDirectionEnum.class));
    }

    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
        assertThat(model.getCallId(), instanceOf(String.class));
    }

    /**
     * Test the property 'digits'
     */
    @Test
    public void digitsTest() {
        assertThat(model.getDigits(), instanceOf(String.class));
    }

    /**
     * Test the property 'callUrl'
     */
    @Test
    public void callUrlTest() {
        assertThat(model.getCallUrl(), instanceOf(String.class));
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
     * Test the property 'parentCallId'
     */
    @Test
    public void parentCallIdTest() {
        assertThat(model.getParentCallId(), instanceOf(String.class));
    }

    /**
     * Test the property 'terminatingDigit'
     */
    @Test
    public void terminatingDigitTest() {
        assertThat(model.getTerminatingDigit(), instanceOf(String.class));
    }

    /**
     * Test the property 'transferCallerId'
     */
    @Test
    public void transferCallerIdTest() {
        assertThat(model.getTransferCallerId(), instanceOf(String.class));
    }

    /**
     * Test the property 'transferTo'
     */
    @Test
    public void transferToTest() {
        assertThat(model.getTransferTo(), instanceOf(String.class));
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        assertThat(model.getTag(), instanceOf(String.class));
    }

}
