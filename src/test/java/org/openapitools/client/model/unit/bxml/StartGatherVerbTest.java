/**
 * 
 * Unit tests for StartGather Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.StartGather;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class StartGatherVerbTest {
    /**
    * Setting up Variables
    */
    StartGather startGather = new StartGather().builder()
                               .dtmfUrl("https://example.com/startgather")
                               .dtmfMethod("POST")
                               .username("user")
                               .password("pass")
                               .tag("tag")
                               .build();

    public JAXBContext jaxbContext;

    @Test
    public void startGatherVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><StartGather dtmfUrl=\"https://example.com/startgather\" dtmfMethod=\"POST\" username=\"user\" password=\"pass\" tag=\"tag\"/></Bxml>";

        assertThat(new Bxml().with(startGather).toBxml(jaxbContext), is(expectedBxml));
    }
};
