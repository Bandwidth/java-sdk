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

import com.bandwidth.sdk.model.MultiChannelMessageChannelEnum;
import com.bandwidth.sdk.model.MultiChannelMessageData;
import com.bandwidth.sdk.model.MultiChannelMessageDirectionEnum;
import com.bandwidth.sdk.model.MultiChannelStatusEnum;

import java.time.OffsetDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for MultiChannelMessageData
 */
public class MultiChannelMessageDataTest {
    private final MultiChannelMessageData model = new MultiChannelMessageData()
            .messageId("messageId")
            .status(MultiChannelStatusEnum.DELIVERED)
            .time(OffsetDateTime.now())
            .direction(MultiChannelMessageDirectionEnum.INBOUND)
            .from("from")
            .to("to")
            .applicationId("applicationId")
            .channel(MultiChannelMessageChannelEnum.SMS)
            .tag("tag");

    /**
     * Model tests for MultiChannelMessageData
     */
    @Test
    public void testMultiChannelMessageData() {
        assertThat(model, instanceOf(MultiChannelMessageData.class));
    }

    /**
     * Test the property 'messageId'
     */
    @Test
    public void messageIdTest() {
        assertThat(model.getMessageId(), instanceOf(String.class));
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        assertThat(model.getStatus(), instanceOf(MultiChannelStatusEnum.class));
    }

    /**
     * Test the property 'time'
     */
    @Test
    public void timeTest() {
        assertThat(model.getTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        assertThat(model.getDirection(), instanceOf(MultiChannelMessageDirectionEnum.class));
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {
        assertThat(model.getFrom(), instanceOf(String.class));
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        assertThat(model.getTo(), instanceOf(String.class));
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        assertThat(model.getApplicationId(), instanceOf(String.class));
    }

    /**
     * Test the property 'channel'
     */
    @Test
    public void channelTest() {
        assertThat(model.getChannel(), instanceOf(MultiChannelMessageChannelEnum.class));
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        assertThat(model.getTag(), instanceOf(String.class));
    }

}
