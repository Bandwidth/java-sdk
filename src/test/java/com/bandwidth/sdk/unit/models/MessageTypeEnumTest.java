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

import com.bandwidth.sdk.model.MessageTypeEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for MessageTypeEnum
 */
public class MessageTypeEnumTest {
    /**
     * Model tests for MessageTypeEnum
     */
    @Test
    public void testMessageTypeEnum() {
        assertThat(MessageTypeEnum.SMS.toString(), equalTo("sms"));
        assertThat(MessageTypeEnum.MMS.toString(), equalTo("mms"));
    }

}
