/**
 * 
 * Unit tests for StartRecording Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.StartRecording;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StartRecordingVerbTest {
    /**
     * Setting up Variables
     */
    StartRecording startRecording = StartRecording.builder()
            .recordingAvailableUrl("https://example.com")
            .recordingAvailableMethod("POST")
            .transcribe(true)
            .transcriptionAvailableUrl("transcription-example.com")
            .recordingAvailableMethod("POST")
            .username("user")
            .password("pass")
            .tag("tag")
            .fileFormat("wav")
            .multiChannel(true)
            .build();

    @Test
    public void startRecordingVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><StartRecording recordingAvailableUrl=\"https://example.com\" recordingAvailableMethod=\"POST\" transcribe=\"true\" transcriptionAvailableUrl=\"transcription-example.com\" username=\"user\" password=\"pass\" tag=\"tag\" fileFormat=\"wav\" multiChannel=\"true\"/></Bxml>";

        assertThat(new Bxml().with(startRecording).toBxml(jaxbContext), is(expectedBxml));
    }
};
