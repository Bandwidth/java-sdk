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

import com.bandwidth.sdk.model.CallbackMethodEnum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Model tests for CallbackMethodEnum
 */
public class CallbackMethodEnumTest {
    /**
     * Model tests for CallbackMethodEnum
     */
    @Test
    public void testCallbackMethodEnum() {
        assertThat(CallbackMethodEnum.GET.toString(), equalTo("GET"));
        assertThat(CallbackMethodEnum.POST.toString(), equalTo("POST"));
    }

}
