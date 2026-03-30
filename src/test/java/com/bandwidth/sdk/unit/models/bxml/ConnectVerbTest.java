/**
 *
 * Unit tests for Connect Verb class
 * Because they are part of the Connect Verb, there are also tests for Endpoint
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

public class ConnectVerbTest {
        /**
         * Setting up Variables
         */
        Endpoint endpoint = Endpoint.builder()
                        .endpointId("test-endpoint-id")
                        .type("webrtc")
                        .tag("test")
                        .build();
        Connect connect1 = Connect.builder()
                        .endpoints(List.of(endpoint))
                        .connectCallbackUrl(URI.create("https://example.com/webhooks/connect"))
                        .tag("test")
                        .build();
        Connect connect2 = Connect.builder()
                        .endpoints(List.of(endpoint))
                        .connectCallbackUrl(URI.create("https://example.com/webhooks/connect"))
                        .username("user")
                        .password("pass")
                        .tag("test")
                        .build();
        Connect connect3 = Connect.builder()
                        .endpoints(List.of(endpoint))
                        .connectCallbackUrl(URI.create("https://example.com/webhooks/connect"))
                        .connectCallbackFallbackUrl(URI.create("https://example.com/webhooks/connect-fallback"))
                        .fallbackUsername("fallbackUser")
                        .fallbackPassword("fallbackPass")
                        .tag("test")
                        .build();

        @Test
        public void connectVerbWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedConnectBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect connectCallbackUrl=\"https://example.com/webhooks/connect\" connectCallbackMethod=\"POST\" connectCallbackFallbackMethod=\"POST\" tag=\"test\"><Endpoint type=\"webrtc\" tag=\"test\">test-endpoint-id</Endpoint></Connect></Bxml>";
                String expectedConnectWithCredsBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect connectCallbackUrl=\"https://example.com/webhooks/connect\" connectCallbackMethod=\"POST\" connectCallbackFallbackMethod=\"POST\" username=\"user\" password=\"pass\" tag=\"test\"><Endpoint type=\"webrtc\" tag=\"test\">test-endpoint-id</Endpoint></Connect></Bxml>";

                assertThat(new Bxml().with(connect1).toBxml(jaxbContext), is(expectedConnectBxml));
                assertThat(new Bxml().with(connect2).toBxml(jaxbContext), is(expectedConnectWithCredsBxml));
        }

        @Test
        public void connectVerbWithFallbackFieldsWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedConnectWithFallbackBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect connectCallbackUrl=\"https://example.com/webhooks/connect\" connectCallbackMethod=\"POST\" connectCallbackFallbackUrl=\"https://example.com/webhooks/connect-fallback\" connectCallbackFallbackMethod=\"POST\" fallbackUsername=\"fallbackUser\" fallbackPassword=\"fallbackPass\" tag=\"test\"><Endpoint type=\"webrtc\" tag=\"test\">test-endpoint-id</Endpoint></Connect></Bxml>";

                assertThat(new Bxml().with(connect3).toBxml(jaxbContext), is(expectedConnectWithFallbackBxml));
        }
}
