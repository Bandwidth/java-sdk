/**
 * 
 * Unit tests for Ring Verb class
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.Ring;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class RingVerbTest {
    public JAXBContext jaxbContext;

    @Test
    public void ringVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Ring duration=\"30.0\" answerCall=\"true\"/></Bxml>";

        assertThat(new Bxml().with(new Ring(30d, true)).toBxml(jaxbContext), is(expectedBxml));
    };
};
 