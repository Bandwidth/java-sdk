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

import com.bandwidth.sdk.model.MultiChannelAction;
import com.bandwidth.sdk.model.RbmMessageContentText;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for RbmMessageContentText
 */
public class RbmMessageContentTextTest {
    private final RbmMessageContentText model = new RbmMessageContentText()
            .text("Sample text")
            .suggestions(new ArrayList<MultiChannelAction>(Arrays.asList(new MultiChannelAction())));

    /**
     * Model tests for RbmMessageContentText
     */
    @Test
    public void testRbmMessageContentText() {
        assertThat(model, instanceOf(RbmMessageContentText.class));
    }

    /**
     * Test the property 'text'
     */
    @Test
    public void textTest() {
        assertThat(model.getText(), instanceOf(String.class));
    }

    /**
     * Test the property 'suggestions'
     */
    @Test
    public void suggestionsTest() {
        assertThat(model.getSuggestions(), instanceOf(ArrayList.class));
    }

}
