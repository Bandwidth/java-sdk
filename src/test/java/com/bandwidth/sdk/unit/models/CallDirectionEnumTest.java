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

import com.bandwidth.sdk.model.CallDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for CallDirectionEnum
 */
public class CallDirectionEnumTest {
    /**
     * Model tests for CallDirectionEnum
     */
    @Test
    public void testCallDirectionEnum() {
        assertThat(CallDirectionEnum.INBOUND.toString(), equalTo("inbound"));
        assertThat(CallDirectionEnum.OUTBOUND.toString(), equalTo("outbound"));
    }

}
