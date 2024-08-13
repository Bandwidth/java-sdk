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

import com.bandwidth.sdk.model.LookupStatusEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for LookupStatusEnum
 */
public class LookupStatusEnumTest {
    /**
     * Model tests for LookupStatusEnum
     */
    @Test
    public void testLookupStatusEnum() {
        assertThat(LookupStatusEnum.COMPLETE.toString(), equalTo("COMPLETE"));
        assertThat(LookupStatusEnum.FAILED.toString(), equalTo("FAILED"));
        assertThat(LookupStatusEnum.IN_PROGRESS.toString(), equalTo("IN_PROGRESS"));
        assertThat(LookupStatusEnum.PARTIAL_COMPLETE.toString(), equalTo("PARTIAL_COMPLETE"));
    }

}
