/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.bandwidth.sdk.unit.models;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import com.bandwidth.sdk.model.ConferenceMember;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for ConferenceMember
 */
public class ConferenceMemberTest {
    private final ConferenceMember model = new ConferenceMember()
            .callId("callId")
            .conferenceId("conferenceId")
            .memberUrl(URI.create("https://bandwidth.com"))
            .mute(true)
            .hold(true)
            .callIdsToCoach(new ArrayList<String>(Arrays.asList("callIdsToCoach")));

    /**
     * Model tests for ConferenceMember
     */
    @Test
    public void testConferenceMember() {
        assertThat(model, instanceOf(ConferenceMember.class));
    }

    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
        assertThat(model.getCallId(), instanceOf(String.class));
    }

    /**
     * Test the property 'conferenceId'
     */
    @Test
    public void conferenceIdTest() {
        assertThat(model.getConferenceId(), instanceOf(String.class));
    }

    /**
     * Test the property 'memberUrl'
     */
    @Test
    public void memberUrlTest() {
        assertThat(model.getMemberUrl(), instanceOf(URI.class));
    }

    /**
     * Test the property 'mute'
     */
    @Test
    public void muteTest() {
        assertThat(model.getMute(), instanceOf(Boolean.class));
    }

    /**
     * Test the property 'hold'
     */
    @Test
    public void holdTest() {
        assertThat(model.getHold(), instanceOf(Boolean.class));
    }

    /**
     * Test the property 'callIdsToCoach'
     */
    @Test
    public void callIdsToCoachTest() {
        assertThat(model.getCallIdsToCoach(), instanceOf(List.class));
    }

}
