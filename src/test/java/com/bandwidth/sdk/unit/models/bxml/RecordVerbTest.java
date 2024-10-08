/**
 * 
 * Unit tests for Record Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Record;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RecordVerbTest {
    /**
     * Setting up Variables
     */
    Record record = Record.builder()
            .maxDuration(10)
            .build();

    @Test
    public void recordVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Record recordCompleteMethod=\"POST\" recordCompleteFallbackMethod=\"POST\" terminatingDigits=\"#\" maxDuration=\"10\" fileFormat=\"wav\" recordingAvailableMethod=\"POST\" silenceTimeout=\"0.0\"/></Bxml>";

        assertThat(new Bxml().with(record).toBxml(jaxbContext), is(expectedBxml));
    }
};
