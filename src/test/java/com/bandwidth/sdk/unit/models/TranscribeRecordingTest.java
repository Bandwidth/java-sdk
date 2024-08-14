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
import com.bandwidth.sdk.model.TranscribeRecording;
import com.bandwidth.sdk.model.CallbackMethodEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for TranscribeRecording
 */
public class TranscribeRecordingTest {
    private final TranscribeRecording model = new TranscribeRecording()
            .callbackUrl(URI.create("https://example.com"))
            .callbackMethod(CallbackMethodEnum.POST)
            .username("username")
            .password("password")
            .tag("tag")
            .callbackTimeout(30.0)
            .detectLanguage(true);

    /**
     * Model tests for TranscribeRecording
     */
    @Test
    public void testTranscribeRecording() {
        assertThat(model, instanceOf(TranscribeRecording.class));
    }

    /**
     * Test the property 'callbackUrl'
     */
    @Test
    public void callbackUrlTest() {
        assertThat(model.getCallbackUrl(), instanceOf(URI.class));
    }

    /**
     * Test the property 'callbackMethod'
     */
    @Test
    public void callbackMethodTest() {
        assertThat(model.getCallbackMethod(), instanceOf(CallbackMethodEnum.class));
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        assertThat(model.getUsername(), instanceOf(String.class));
    }

    /**
     * Test the property 'password'
     */
    @Test
    public void passwordTest() {
        assertThat(model.getPassword(), instanceOf(String.class));
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        assertThat(model.getTag(), instanceOf(String.class));
    }

    /**
     * Test the property 'callbackTimeout'
     */
    @Test
    public void callbackTimeoutTest() {
        assertThat(model.getCallbackTimeout(), instanceOf(Double.class));
    }

    /**
     * Test the property 'detectLanguage'
     */
    @Test
    public void detectLanguageTest() {
        assertThat(model.getDetectLanguage(), instanceOf(Boolean.class));
    }

}
