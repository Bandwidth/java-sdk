/**
 *
 * Unit tests for Endpoint Verb class
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Connect;
import com.bandwidth.sdk.model.bxml.Endpoint;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.net.URI;
import java.util.List;

public class EndpointVerbTest {
        /**
         * Setting up Variables
         */
        Endpoint endpointWithAllFields = Endpoint.builder()
                        .endpointId("test-endpoint-id")
                        .type("webrtc")
                        .tag("test-tag")
                        .build();

        Endpoint endpointWithIdOnly = Endpoint.builder()
                        .endpointId("test-endpoint-id")
                        .build();

        Endpoint endpointWithType = Endpoint.builder()
                        .endpointId("test-endpoint-id")
                        .type("webrtc")
                        .build();

        @Test
        public void endpointVerbWithAllFieldsWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                // Endpoint must be nested inside Connect for BXML serialization
                Connect connect = Connect.builder()
                                .endpoints(List.of(endpointWithAllFields))
                                .connectCallbackUrl(URI.create("https://example.com/webhooks/connect"))
                                .build();
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect connectCallbackUrl=\"https://example.com/webhooks/connect\" connectCallbackMethod=\"POST\" connectCallbackFallbackMethod=\"POST\"><Endpoint type=\"webrtc\" tag=\"test-tag\">test-endpoint-id</Endpoint></Connect></Bxml>";

                assertThat(new Bxml().with(connect).toBxml(jaxbContext), is(expectedBxml));
        }

        @Test
        public void endpointVerbWithIdOnlyWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                Connect connect = Connect.builder()
                                .endpoints(List.of(endpointWithIdOnly))
                                .connectCallbackUrl(URI.create("https://example.com/webhooks/connect"))
                                .build();
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect connectCallbackUrl=\"https://example.com/webhooks/connect\" connectCallbackMethod=\"POST\" connectCallbackFallbackMethod=\"POST\"><Endpoint>test-endpoint-id</Endpoint></Connect></Bxml>";

                assertThat(new Bxml().with(connect).toBxml(jaxbContext), is(expectedBxml));
        }

        @Test
        public void endpointVerbWithTypeWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                Connect connect = Connect.builder()
                                .endpoints(List.of(endpointWithType))
                                .connectCallbackUrl(URI.create("https://example.com/webhooks/connect"))
                                .build();
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect connectCallbackUrl=\"https://example.com/webhooks/connect\" connectCallbackMethod=\"POST\" connectCallbackFallbackMethod=\"POST\"><Endpoint type=\"webrtc\">test-endpoint-id</Endpoint></Connect></Bxml>";

                assertThat(new Bxml().with(connect).toBxml(jaxbContext), is(expectedBxml));
        }

        @Test
        public void endpointFieldsAccessibleDirectly() {
                assertThat(endpointWithAllFields.getEndpointId(), is("test-endpoint-id"));
                assertThat(endpointWithAllFields.getType(), is("webrtc"));
                assertThat(endpointWithAllFields.getTag(), is("test-tag"));
        }
}
