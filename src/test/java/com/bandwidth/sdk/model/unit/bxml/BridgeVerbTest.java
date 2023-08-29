/**
 * 
 * Unit tests for Bridge Verb class
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Bridge;

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

    @Test
    public void bridgeVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Bridge bridgeCompleteUrl=\"https://example.com\" bridgeCompleteMethod=\"POST\" bridgeCompleteFallbackMethod=\"POST\" bridgeTargetCompleteMethod=\"POST\" bridgeTargetCompleteFallbackMethod=\"POST\" tag=\"test\">+19198675309</Bridge></Bxml>";

        assertThat(new Bxml().with(bridge).toBxml(jaxbContext), is(expectedBxml));
    }
};
