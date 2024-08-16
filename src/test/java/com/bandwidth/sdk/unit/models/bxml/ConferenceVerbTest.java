/**
 * 
 * Unit tests for Conference Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Conference;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConferenceVerbTest {
    /**
     * Setting up Variables
     */
    Conference conference = Conference.builder()
            .name("conf1")
            .mute(true)
            .hold(false)
            .callIdsToCoach("example-call-id")
            .conferenceEventUrl("example.com/eventurl")
            .conferenceEventMethod("POST")
            .conferenceEventFallbackUrl("backupexample.com/eventurl")
            .conferenceEventFallbackMethod("POST")
            .username("user")
            .password("pass")
            .fallbackUsername("user")
            .fallbackPassword("pass")
            .tag("tag")
            .callbackTimeout(5d)
            .build();

    @Test
    public void conferenceVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Conference mute=\"true\" hold=\"false\" conferenceEventUrl=\"example.com/eventurl\" conferenceEventMethod=\"POST\" conferenceEventFallbackUrl=\"backupexample.com/eventurl\" conferenceEventFallbackMethod=\"POST\" callbackTimeout=\"5.0\" tag=\"tag\" username=\"user\" password=\"pass\" fallbackUsername=\"user\" fallbackPassword=\"pass\" callIdsToCoach=\"example-call-id\">conf1</Conference></Bxml>";

        assertThat(new Bxml().with(conference).toBxml(jaxbContext), is(expectedBxml));
    }
};
