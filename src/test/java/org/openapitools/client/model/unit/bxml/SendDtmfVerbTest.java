/**
 * 
 * Unit tests for SendDtmf Verb class
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.SendDtmf;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class SendDtmfVerbTest {
    public JAXBContext jaxbContext;

    @Test
    public void sendDtmfVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><SendDtmf toneDuration=\"3\" toneInterval=\"5\">1234</SendDtmf></Bxml>";

        assertThat(new Bxml().with(new SendDtmf("1234", 3,5)).toBxml(jaxbContext), is(expectedBxml));
    };
};
