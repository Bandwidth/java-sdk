/**
 * 
 * Unit tests for StopGather Verb class
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.StopGather;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StopGatherVerbTest {

    @Test
    public void stopGatherVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><StopGather/></Bxml>";

        assertThat(new Bxml().with(new StopGather()).toBxml(jaxbContext), is(expectedBxml));
    };
};
