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

import com.bandwidth.sdk.model.MessageDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for MessageDirectionEnum
 */
public class MessageDirectionEnumTest {
    /**
     * Model tests for MessageDirectionEnum
     */
    @Test
    public void testMessageDirectionEnum() {
        assertThat(MessageDirectionEnum.IN.toString(), equalTo("in"));
        assertThat(MessageDirectionEnum.OUT.toString(), equalTo("out"));
    }

}
