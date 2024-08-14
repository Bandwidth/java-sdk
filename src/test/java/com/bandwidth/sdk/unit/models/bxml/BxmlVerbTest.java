/**
 * Unit tests for Bxml Verb Class
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Tag;
import com.bandwidth.sdk.model.bxml.Pause;
import com.bandwidth.sdk.model.bxml.SendDtmf;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;

public class BxmlVerbTest {

    /**
     * Setting up Variables
     */

    Bxml bxml = new Bxml().with(new Tag("Test"));
    Tag tag = new Tag("Test Tag Content");
    Bxml bxml2 = new Bxml().with(tag);

    @Test
    public void toBxmlWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        Bxml bxml = new Bxml().with(new Tag("Test"));
        Tag tag = new Tag("Test Tag Content");
        Bxml bxml2 = new Bxml().with(tag);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Tag>Test</Tag></Bxml>";
        String expectedBxml2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Tag>Test Tag Content</Tag></Bxml>";

        assertThat(bxml.toBxml(jaxbContext), is(expectedBxml));
        assertThat(bxml2.toBxml(jaxbContext), is(expectedBxml2));
    };

    @Test
    public void withWorks() {
        Pause pause = new Pause(2d);
        Bxml bxml = new Bxml().with(pause);
        assertThat(bxml.getVerbs(), contains(pause));
    }

    @Test
    public void withVerbsWorks() {
        Pause pause = new Pause(2d);
        SendDtmf sendDtmf = new SendDtmf("1");
        Bxml bxml = new Bxml().withVerbs(pause, sendDtmf);
        assertThat(bxml.getVerbs().get(0), is(pause));
        assertThat(bxml.getVerbs().get(1), is(sendDtmf));
    }
};
