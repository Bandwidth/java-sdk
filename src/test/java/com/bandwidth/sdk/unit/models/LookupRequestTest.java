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

import com.bandwidth.sdk.model.LookupRequest;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for LookupRequest
 */
public class LookupRequestTest {
    private final LookupRequest model = new LookupRequest()
            .tns(new ArrayList<String>(Arrays.asList("tns")));

    /**
     * Model tests for LookupRequest
     */
    @Test
    public void testLookupRequest() {
        assertThat(model, instanceOf(LookupRequest.class));
    }

    /**
     * Test the property 'tns'
     */
    @Test
    public void tnsTest() {
        assertThat(model.getTns(), instanceOf(ArrayList.class));
    }

}
