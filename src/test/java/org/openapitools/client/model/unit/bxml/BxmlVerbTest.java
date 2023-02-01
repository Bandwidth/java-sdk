/**
 * Unit tests for Bxml Verb Class
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.Forward;
import org.openapitools.client.model.bxml.Tag;
import org.openapitools.client.model.bxml.Pause;
import org.openapitools.client.model.bxml.SendDtmf;
import org.openapitools.client.model.DiversionReason;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;;
public class BxmlVerbTest {

    /**
     * Setting up Variables
     */

    Bxml bxml = new Bxml().with(new Tag("Test"));
    Tag tag = new Tag("Test Tag Content");
    Bxml bxml2 = new Bxml().with(tag);

    public JAXBContext jaxbContext;

    @Test
    public void toBxmlWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
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

    @Test
    public void toBxmlWithDiversionWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        Bxml bxml = new Bxml().with(Forward.builder()
                .diversionReason(DiversionReason.DO_NOT_DISTURB)
                .build());
        assertThat(bxml.toBxml(jaxbContext), 
                containsString("diversionReason=\"do-not-disturb\""));
    }

};
