/**
 *
 * Unit tests for Refer Verb class
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Refer;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.net.URI;

public class ReferVerbTest {

        Refer.ReferSipUri sipUri = Refer.ReferSipUri.builder()
                .uri("sip:alice@atlanta.example.com")
                .build();

        Refer refer = Refer.builder()
                        .sipUri(sipUri)
                        .referCompleteUrl(URI.create("https://example.com/webhooks/refer_complete"))
                        .referCompleteMethod("POST")
                        .tag("test-tag")
                        .build();

        Refer referMinimal = Refer.builder()
                        .sipUri(sipUri)
                        .build();

        @Test
        public void referVerbWithAllAttributes() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Refer referCompleteUrl=\"https://example.com/webhooks/refer_complete\" referCompleteMethod=\"POST\" tag=\"test-tag\"><SipUri>sip:alice@atlanta.example.com</SipUri></Refer></Bxml>";
                assertThat(new Bxml().with(refer).toBxml(jaxbContext), is(expectedBxml));
        }

        @Test
        public void referVerbMinimal() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Refer referCompleteMethod=\"POST\"><SipUri>sip:alice@atlanta.example.com</SipUri></Refer></Bxml>";
                assertThat(new Bxml().with(referMinimal).toBxml(jaxbContext), is(expectedBxml));
        }
}

