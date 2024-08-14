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

import com.bandwidth.sdk.model.Diversion;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for Diversion
 */
public class DiversionTest {
    private final Diversion model = new Diversion()
            .reason("reason")
            .privacy("privacy")
            .screen("screen")
            .counter("counter")
            .limit("limit")
            .unknown("unknown")
            .origTo("origTo");

    /**
     * Model tests for Diversion
     */
    @Test
    public void testDiversion() {
        assertThat(model, instanceOf(Diversion.class));
    }

    /**
     * Test the property 'reason'
     */
    @Test
    public void reasonTest() {
        assertThat(model.getReason(), instanceOf(String.class));
    }

    /**
     * Test the property 'privacy'
     */
    @Test
    public void privacyTest() {
        assertThat(model.getPrivacy(), instanceOf(String.class));
    }

    /**
     * Test the property 'screen'
     */
    @Test
    public void screenTest() {
        assertThat(model.getScreen(), instanceOf(String.class));
    }

    /**
     * Test the property 'counter'
     */
    @Test
    public void counterTest() {
        assertThat(model.getCounter(), instanceOf(String.class));
    }

    /**
     * Test the property 'limit'
     */
    @Test
    public void limitTest() {
        assertThat(model.getLimit(), instanceOf(String.class));
    }

    /**
     * Test the property 'unknown'
     */
    @Test
    public void unknownTest() {
        assertThat(model.getUnknown(), instanceOf(String.class));
    }

    /**
     * Test the property 'origTo'
     */
    @Test
    public void origToTest() {
        assertThat(model.getOrigTo(), instanceOf(String.class));
    }

}