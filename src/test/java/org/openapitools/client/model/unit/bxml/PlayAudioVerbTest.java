/**
 * 
 * Unit tests for PlayAudio Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.PlayAudio;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PlayAudioVerbTest {
    /**
    * Setting up Variables
    */
    PlayAudio playAudio = new PlayAudio().builder()
                               .audioUri("test.com")
                               .username("user")
                               .password("pass")
                               .build();
    public JAXBContext jaxbContext;

    @Test
    public void playAudioVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><PlayAudio username=\"user\" password=\"pass\">test.com</PlayAudio></Bxml>";

        assertThat(new Bxml().with(playAudio).toBxml(jaxbContext), is(expectedBxml));
    }
};
