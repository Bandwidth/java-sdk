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

import com.bandwidth.sdk.model.CallTranscriptionTrackEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for CallTranscriptionTrackEnum
 */
public class CallTranscriptionTrackEnumTest {
    /**
     * Model tests for CallTranscriptionTrackEnum
     */
    @Test
    public void testCallTranscriptionTrackEnum() {
        assertThat(CallTranscriptionTrackEnum.INBOUND.toString(), equalTo("inbound"));
        assertThat(CallTranscriptionTrackEnum.OUTBOUND.toString(), equalTo("outbound"));
    }

}