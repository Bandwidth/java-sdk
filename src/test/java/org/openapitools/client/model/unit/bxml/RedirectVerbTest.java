/**
 * 
 * Unit tests for Redirect Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.Redirect;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RedirectVerbTest {
    /**
    * Setting up Variables
    */
    Redirect redirect = new Redirect().builder()
                               .redirectUrl("https://example.com/redirect")
                               .redirectFallbackUrl("fallback-url.com")
                               .redirectMethod("POST")
                               .build();
    public JAXBContext jaxbContext;

    @Test
    public void redirectVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Redirect redirectUrl=\"https://example.com/redirect\" redirectFallbackUrl=\"fallback-url.com\" redirectMethod=\"POST\" redirectFallbackMethod=\"POST\"/></Bxml>";

        assertThat(new Bxml().with(redirect).toBxml(jaxbContext), is(expectedBxml));
    }
};
