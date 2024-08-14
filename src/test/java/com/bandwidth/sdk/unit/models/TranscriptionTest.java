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

import com.bandwidth.sdk.model.Transcription;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for Transcription
 */
public class TranscriptionTest {
    private final Transcription model = new Transcription()
            .text("text")
            .confidence(0.5);

    /**
     * Model tests for Transcription
     */
    @Test
    public void testTranscription() {
        assertThat(model, instanceOf(Transcription.class));
    }

    /**
     * Test the property 'text'
     */
    @Test
    public void textTest() {
        assertThat(model.getText(), instanceOf(String.class));
    }

    /**
     * Test the property 'confidence'
     */
    @Test
    public void confidenceTest() {
        assertThat(model.getConfidence(), instanceOf(Double.class));
    }

}