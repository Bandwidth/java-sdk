/**
 * 
 * Unit tests for Forward Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Forward;
import com.bandwidth.sdk.model.DiversionReason;
import com.bandwidth.sdk.model.DiversionTreatment;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ForwardVerbTest {
    /**
    * Setting up Variables
    */
    Forward forward = new Forward().builder()
                               .to("+19195554321")
                               .from("19195554322")
                               .callTimeout(15d)
                               .diversionTreatment(DiversionTreatment.PROPAGATE)
                               .diversionReason(DiversionReason.AWAY)
                               .uui("93d6f3c0be5845960b744fa28015d8ede84bd1a4;encoding=base64,asdf;encoding=jwt")
                               .build();

    @Test
    public void forwardVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Forward to=\"+19195554321\" from=\"19195554322\" uui=\"93d6f3c0be5845960b744fa28015d8ede84bd1a4;encoding=base64,asdf;encoding=jwt\" callTimeout=\"15.0\" diversionTreatment=\"PROPAGATE\" diversionReason=\"AWAY\"/></Bxml>";

        assertThat(new Bxml().with(forward).toBxml(jaxbContext), is(expectedBxml));
    }
};
