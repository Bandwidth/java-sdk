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

import java.util.Arrays;
import java.util.ArrayList;
import com.bandwidth.sdk.model.CallTranscription;
import com.bandwidth.sdk.model.CallTranscriptionResponse;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Model tests for CallTranscriptionResponse
 */
public class CallTranscriptionResponseTest {
    private final CallTranscriptionResponse model = new CallTranscriptionResponse()
            .accountId("accountId")
            .callId("callId")
            .transcriptionId("transcriptionId")
            .tracks(new ArrayList<CallTranscription>(Arrays.asList(new CallTranscription())));

    /**
     * Model tests for CallTranscriptionResponse
     */
    @Test
    public void testCallTranscriptionResponse() {
        assertThat(model, instanceOf(CallTranscriptionResponse.class));
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        assertThat(model.getAccountId(), instanceOf(String.class));
    }

    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
        assertThat(model.getCallId(), instanceOf(String.class));
    }

    /**
     * Test the property 'transcriptionId'
     */
    @Test
    public void transcriptionIdTest() {
        assertThat(model.getTranscriptionId(), instanceOf(String.class));
    }

    /**
     * Test the property 'tracks'
     */
    @Test
    public void tracksTest() {
        assertThat(model.getTracks(), instanceOf(ArrayList.class));
    }

}
