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
import com.bandwidth.sdk.model.CallDirectionEnum;
import com.bandwidth.sdk.model.CallRecordingMetadata;
import com.bandwidth.sdk.model.FileFormatEnum;
import com.bandwidth.sdk.model.RecordingTranscriptionMetadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for CallRecordingMetadata
 */
public class CallRecordingMetadataTest {
    private final CallRecordingMetadata model = new CallRecordingMetadata()
            .applicationId("04e88489-df02-4e34-a0ee-27a91849555f")
            .accountId("accountId")
            .callId("callId")
            .parentCallId("parentCallId")
            .recordingId("recordingId")
            .to("to")
            .from("from")
            .transferCallerId("transferCallerId")
            .transferTo("transferTo")
            .duration("duration")
            .direction(CallDirectionEnum.INBOUND)
            .channels(0)
            .startTime(OffsetDateTime.now())
            .endTime(OffsetDateTime.now())
            .fileFormat(FileFormatEnum.WAV)
            .status("status")
            .mediaUrl(URI.create("https://bandwidth.com"))
            .transcription(new RecordingTranscriptionMetadata()
                    .id("id")
                    .status("status")
                    .completedTime(OffsetDateTime.now())
                    .url(URI.create("https://bandwidth.com")))
            .recordingName("recordingName");

    /**
     * Model tests for CallRecordingMetadata
     */
    @Test
    public void testCallRecordingMetadata() {
        assertThat(model, instanceOf(CallRecordingMetadata.class));
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        assertThat(model.getApplicationId(), instanceOf(String.class));
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        assertThat(model.getAccountId(), instanceOf(String.class));
    }

    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
        assertThat(model.getCallId(), instanceOf(String.class));
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
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        assertThat(model.getTo(), instanceOf(String.class));
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {
        assertThat(model.getFrom(), instanceOf(String.class));
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
     * Test the property 'duration'
     */
    @Test
    public void durationTest() {
        assertThat(model.getDuration(), instanceOf(String.class));
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        assertThat(model.getDirection(), instanceOf(CallDirectionEnum.class));
    }

    /**
     * Test the property 'channels'
     */
    @Test
    public void channelsTest() {
        assertThat(model.getChannels(), instanceOf(Integer.class));
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
     * Test the property 'fileFormat'
     */
    @Test
    public void fileFormatTest() {
        assertThat(model.getFileFormat(), instanceOf(FileFormatEnum.class));
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        assertThat(model.getStatus(), instanceOf(String.class));
    }

    /**
     * Test the property 'mediaUrl'
     */
    @Test
    public void mediaUrlTest() {
        assertThat(model.getMediaUrl(), instanceOf(URI.class));
    }

    /**
     * Test the property 'transcription'
     */
    @Test
    public void transcriptionTest() {
        assertThat(model.getTranscription(), instanceOf(RecordingTranscriptionMetadata.class));
    }

    /**
     * Test the property 'recordingName'
     */
    @Test
    public void recordingNameTest() {
        assertThat(model.getRecordingName(), instanceOf(String.class));
    }

}
