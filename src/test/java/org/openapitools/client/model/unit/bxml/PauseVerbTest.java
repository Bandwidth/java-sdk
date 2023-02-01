/**
 * 
 * Unit tests for Pause Verb class
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.Pause;
 
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class PauseVerbTest {
    public JAXBContext jaxbContext;

    @Test
    public void pauseVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Pause duration=\"2.0\"/></Bxml>";

        assertThat(new Bxml().with(new Pause(2d)).toBxml(jaxbContext), is(expectedBxml));
    };
};
 