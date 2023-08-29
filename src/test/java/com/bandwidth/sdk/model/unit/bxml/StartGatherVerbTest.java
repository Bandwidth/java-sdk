/**
 * 
 * Unit tests for StartGather Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.StartGather;

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


    @Test
    public void startGatherVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><StartGather dtmfUrl=\"https://example.com/startgather\" dtmfMethod=\"POST\" username=\"user\" password=\"pass\" tag=\"tag\"/></Bxml>";

        assertThat(new Bxml().with(startGather).toBxml(jaxbContext), is(expectedBxml));
    }
};
