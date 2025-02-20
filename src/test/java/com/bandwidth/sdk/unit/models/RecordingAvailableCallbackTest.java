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
import com.bandwidth.sdk.model.RecordingAvailableCallback;
import com.bandwidth.sdk.model.FileFormatEnum;
import com.bandwidth.sdk.model.CallDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for RecordingAvailableCallback
 */
public class RecordingAvailableCallbackTest {
    private final RecordingAvailableCallback model = new RecordingAvailableCallback()
            .eventType("eventType")
            .eventTime(OffsetDateTime.now())
            .accountId("accountId")
            .applicationId("applicationId")
            .from("from")
            .to("to")
            .direction(CallDirectionEnum.INBOUND)
            .callId("callId")
            .callUrl(URI.create("https://bandwidth.com"))
            .parentCallId("parentCallId")
            .recordingId("recordingId")
            .mediaUrl(URI.create("https://example.com"))
            .enqueuedTime(OffsetDateTime.now())
            .startTime(OffsetDateTime.now())
            .endTime(OffsetDateTime.now())
            .duration("duration")
            .fileFormat(FileFormatEnum.WAV)
            .channels(1)
            .tag("tag")
            .status("status")
            .transferCallerId("transferCallerId")
            .transferTo("transferTo");

    /**
     * Model tests for RecordingAvailableCallback
     */
    @Test
    public void testRecordingAvailableCallback() {
        assertThat(model, instanceOf(RecordingAvailableCallback.class));
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
     * Test the property 'callUrl'
     */
    @Test
    public void callUrlTest() {
        assertThat(model.getCallUrl(), instanceOf(URI.class));
    }

    /**
     * Test the property 'parentCallId'
     */
    @Test
    public void parentCallIdTest() {
        assertThat(model.getParentCallId(), instanceOf(String.class));
    }

    /**
     * Test the property 'recordingId'
     */
    @Test
    public void recordingIdTest() {
        assertThat(model.getRecordingId(), instanceOf(String.class));
    }

    /**
     * Test the property 'mediaUrl'
     */
    @Test
    public void mediaUrlTest() {
        assertThat(model.getMediaUrl(), instanceOf(URI.class));
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
     * Test the property 'endTime'
     */
    @Test
    public void endTimeTest() {
        assertThat(model.getEndTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'duration'
     */
    @Test
    public void durationTest() {
        assertThat(model.getDuration(), instanceOf(String.class));
    }

    /**
     * Test the property 'fileFormat'
     */
    @Test
    public void fileFormatTest() {
        assertThat(model.getFileFormat(), instanceOf(FileFormatEnum.class));
    }

    /**
     * Test the property 'channels'
     */
    @Test
    public void channelsTest() {
        assertThat(model.getChannels(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        assertThat(model.getTag(), instanceOf(String.class));
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        assertThat(model.getStatus(), instanceOf(String.class));
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

}
