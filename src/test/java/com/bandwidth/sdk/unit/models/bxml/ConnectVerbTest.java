/**
 *
 * Unit tests for Connect Verb class
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

    Endpoint endpoint = Endpoint.builder()
            .endpointId("test-endpoint-id")
            .build();

    Connect connectWithCallback = Connect.builder()
            .endpoints(List.of(endpoint))
            .eventCallbackUrl(URI.create("https://example.com/callback"))
            .build();

    Connect connectWithoutCallback = Connect.builder()
            .endpoints(List.of(endpoint))
            .build();

    @Test
    public void connectVerbWithCallbackWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect eventCallbackUrl=\"https://example.com/callback\"><Endpoint>test-endpoint-id</Endpoint></Connect></Bxml>";

        assertThat(new Bxml().with(connectWithCallback).toBxml(jaxbContext), is(expected));
    }

    @Test
    public void connectVerbWithoutCallbackWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Connect><Endpoint>test-endpoint-id</Endpoint></Connect></Bxml>";

        assertThat(new Bxml().with(connectWithoutCallback).toBxml(jaxbContext), is(expected));
    }
}
