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
import com.bandwidth.sdk.model.RbmCardContent;
import com.bandwidth.sdk.model.RbmStandaloneCard;
import com.bandwidth.sdk.model.StandaloneCardOrientationEnum;
import com.bandwidth.sdk.model.ThumbnailAlignmentEnum;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for RbmStandaloneCard
 */
public class RbmStandaloneCardTest {
    private final RbmStandaloneCard model = new RbmStandaloneCard()
            .orientation(StandaloneCardOrientationEnum.VERTICAL)
            .thumbnailImageAlignment(ThumbnailAlignmentEnum.LEFT)
            .cardContent(new RbmCardContent())
            .suggestions(new ArrayList<MultiChannelAction>(Arrays.asList(new MultiChannelAction())));

    /**
     * Model tests for RbmStandaloneCard
     */
    @Test
    public void testRbmStandaloneCard() {
        assertThat(model, instanceOf(RbmStandaloneCard.class));
    }

    /**
     * Test the property 'orientation'
     */
    @Test
    public void orientationTest() {
        assertThat(model.getOrientation(), instanceOf(StandaloneCardOrientationEnum.class));
    }

    /**
     * Test the property 'thumbnailImageAlignment'
     */
    @Test
    public void thumbnailImageAlignmentTest() {
        assertThat(model.getThumbnailImageAlignment(), instanceOf(ThumbnailAlignmentEnum.class));
    }

    /**
     * Test the property 'cardContent'
     */
    @Test
    public void cardContentTest() {
        assertThat(model.getCardContent(), instanceOf(RbmCardContent.class));
    }

    /**
     * Test the property 'suggestions'
     */
    @Test
    public void suggestionsTest() {
        assertThat(model.getSuggestions(), instanceOf(ArrayList.class));
    }

}
