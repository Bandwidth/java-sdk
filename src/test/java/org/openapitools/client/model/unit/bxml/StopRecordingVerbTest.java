/**
 * 
 * Unit tests for StopRecording Verb class
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.StopRecording;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StopRecordingVerbTest {
    public JAXBContext jaxbContext;

    @Test
    public void stopRecordingVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><StopRecording/></Bxml>";

        assertThat(new Bxml().with(new StopRecording()).toBxml(jaxbContext), is(expectedBxml));
    };
};
