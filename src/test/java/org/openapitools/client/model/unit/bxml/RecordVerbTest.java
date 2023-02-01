/**
 * 
 * Unit tests for Record Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.Record;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RecordVerbTest {
    /**
    * Setting up Variables
    */
    Record record = new Record().builder()
                               .maxDuration(10)
                               .build();
    public JAXBContext jaxbContext;

    @Test
    public void recordVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Record recordCompleteMethod=\"POST\" recordCompleteFallbackMethod=\"POST\" terminatingDigits=\"#\" maxDuration=\"10\" fileFormat=\"wav\" recordingAvailableMethod=\"POST\" silenceTimeout=\"0.0\"/></Bxml>";

        assertThat(new Bxml().with(record).toBxml(jaxbContext), is(expectedBxml));
    }
};
