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

import com.bandwidth.sdk.model.CallTranscription;
import com.bandwidth.sdk.model.CallTranscriptionDetectedLanguageEnum;
import com.bandwidth.sdk.model.CallTranscriptionTrackEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for CallTranscription
 */
public class CallTranscriptionTest {
    private final CallTranscription model = new CallTranscription()
            .detectedLanguage(CallTranscriptionDetectedLanguageEnum.EN_US)
            .track(CallTranscriptionTrackEnum.INBOUND)
            .transcript("transcript")
            .confidence(0.5);

    /**
     * Model tests for CallTranscription
     */
    @Test
    public void testCallTranscription() {
        assertThat(model, instanceOf(CallTranscription.class));
    }

    /**
     * Test the property 'detectedLanguage'
     */
    @Test
    public void detectedLanguageTest() {
        assertThat(model.getDetectedLanguage(), instanceOf(CallTranscriptionDetectedLanguageEnum.class));
    }

    /**
     * Test the property 'track'
     */
    @Test
    public void trackTest() {
        assertThat(model.getTrack(), instanceOf(CallTranscriptionTrackEnum.class));
    }

    /**
     * Test the property 'transcript'
     */
    @Test
    public void transcriptTest() {
        assertThat(model.getTranscript(), instanceOf(String.class));
    }

    /**
     * Test the property 'confidence'
     */
    @Test
    public void confidenceTest() {
        assertThat(model.getConfidence(), instanceOf(Double.class));
    }

}
