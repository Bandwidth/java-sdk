/**
 * 
 * Unit tests for ResumeRecording Verb class
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.ResumeRecording;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ResumeRecordingVerbTest {

    @Test
    public void resumeRecordingVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><ResumeRecording/></Bxml>";

        assertThat(new Bxml().with(new ResumeRecording()).toBxml(jaxbContext), is(expectedBxml));
    };
};
