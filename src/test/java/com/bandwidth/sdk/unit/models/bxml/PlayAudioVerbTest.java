/**
 * 
 * Unit tests for PlayAudio Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.PlayAudio;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PlayAudioVerbTest {
    /**
     * Setting up Variables
     */
    PlayAudio playAudio = PlayAudio.builder()
            .audioUri("test.com")
            .username("user")
            .password("pass")
            .build();

    @Test
    public void playAudioVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><PlayAudio username=\"user\" password=\"pass\">test.com</PlayAudio></Bxml>";

        assertThat(new Bxml().with(playAudio).toBxml(jaxbContext), is(expectedBxml));
    }
};
