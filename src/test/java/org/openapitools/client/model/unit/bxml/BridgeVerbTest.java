/**
 * 
 * Unit tests for Bridge Verb class
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.Bridge;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class BridgeVerbTest {
    /**
    * Setting up Variables
    */
    Bridge bridge = new Bridge().builder()
    .targetCallId("+19198675309")
    .bridgeCompleteUrl("https://example.com")
    .tag("test")
    .build();
    public JAXBContext jaxbContext;

    @Test
    public void bridgeVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Bridge bridgeCompleteUrl=\"https://example.com\" bridgeCompleteMethod=\"POST\" bridgeCompleteFallbackMethod=\"POST\" bridgeTargetCompleteMethod=\"POST\" bridgeTargetCompleteFallbackMethod=\"POST\" tag=\"test\">+19198675309</Bridge></Bxml>";

        assertThat(new Bxml().with(bridge).toBxml(jaxbContext), is(expectedBxml));
    }
};