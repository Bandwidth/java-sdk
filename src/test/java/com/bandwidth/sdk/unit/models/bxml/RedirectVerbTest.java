/**
 * 
 * Unit tests for Redirect Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Redirect;

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

    @Test
    public void redirectVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Redirect redirectUrl=\"https://example.com/redirect\" redirectFallbackUrl=\"fallback-url.com\" redirectMethod=\"POST\" redirectFallbackMethod=\"POST\"/></Bxml>";

        assertThat(new Bxml().with(redirect).toBxml(jaxbContext), is(expectedBxml));
    }
};
