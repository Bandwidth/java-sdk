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

import com.bandwidth.sdk.model.MessageStatusEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for MessageStatusEnum
 */
public class MessageStatusEnumTest {
    /**
     * Model tests for MessageStatusEnum
     */
    @Test
    public void testMessageStatusEnum() {
        assertThat(MessageStatusEnum.RECEIVED.toString(), equalTo("RECEIVED"));
        assertThat(MessageStatusEnum.QUEUED.toString(), equalTo("QUEUED"));
        assertThat(MessageStatusEnum.SENDING.toString(), equalTo("SENDING"));
        assertThat(MessageStatusEnum.SENT.toString(), equalTo("SENT"));
        assertThat(MessageStatusEnum.FAILED.toString(), equalTo("FAILED"));
        assertThat(MessageStatusEnum.DELIVERED.toString(), equalTo("DELIVERED"));
        assertThat(MessageStatusEnum.ACCEPTED.toString(), equalTo("ACCEPTED"));
        assertThat(MessageStatusEnum.UNDELIVERED.toString(), equalTo("UNDELIVERED"));
    }

}
