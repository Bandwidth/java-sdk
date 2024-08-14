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

import java.time.OffsetDateTime;
import com.bandwidth.sdk.model.ListMessageItem;
import com.bandwidth.sdk.model.MessageTypeEnum;
import com.bandwidth.sdk.model.MessageStatusEnum;
import com.bandwidth.sdk.model.ListMessageDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for ListMessageItem
 */
public class ListMessageItemTest {
    private final ListMessageItem model = new ListMessageItem()
            .messageId("messageId")
            .accountId("accountId")
            .sourceTn("sourceTn")
            .destinationTn("destinationTn")
            .messageStatus(MessageStatusEnum.ACCEPTED)
            .messageDirection(ListMessageDirectionEnum.INBOUND)
            .messageType(MessageTypeEnum.SMS)
            .segmentCount(10)
            .errorCode(123)
            .receiveTime(OffsetDateTime.now())
            .carrierName("carrierName")
            .messageSize(10)
            .messageLength(10)
            .attachmentCount(10)
            .recipientCount(10)
            .campaignClass("campaignClass")
            .campaignId("campaignId");

    /**
     * Model tests for ListMessageItem
     */
    @Test
    public void testListMessageItem() {
        assertThat(model, instanceOf(ListMessageItem.class));
    }

    /**
     * Test the property 'messageId'
     */
    @Test
    public void messageIdTest() {
        assertThat(model.getMessageId(), instanceOf(String.class));
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        assertThat(model.getAccountId(), instanceOf(String.class));
    }

    /**
     * Test the property 'sourceTn'
     */
    @Test
    public void sourceTnTest() {
        assertThat(model.getSourceTn(), instanceOf(String.class));
    }

    /**
     * Test the property 'destinationTn'
     */
    @Test
    public void destinationTnTest() {
        assertThat(model.getDestinationTn(), instanceOf(String.class));
    }

    /**
     * Test the property 'messageStatus'
     */
    @Test
    public void messageStatusTest() {
        assertThat(model.getMessageStatus(), instanceOf(MessageStatusEnum.class));
    }

    /**
     * Test the property 'messageDirection'
     */
    @Test
    public void messageDirectionTest() {
        assertThat(model.getMessageDirection(), instanceOf(ListMessageDirectionEnum.class));
    }

    /**
     * Test the property 'messageType'
     */
    @Test
    public void messageTypeTest() {
        assertThat(model.getMessageType(), instanceOf(MessageTypeEnum.class));
    }

    /**
     * Test the property 'segmentCount'
     */
    @Test
    public void segmentCountTest() {
        assertThat(model.getSegmentCount(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    public void errorCodeTest() {
        assertThat(model.getErrorCode(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'receiveTime'
     */
    @Test
    public void receiveTimeTest() {
        assertThat(model.getReceiveTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'carrierName'
     */
    @Test
    public void carrierNameTest() {
        assertThat(model.getCarrierName(), instanceOf(String.class));
    }

    /**
     * Test the property 'messageSize'
     */
    @Test
    public void messageSizeTest() {
        assertThat(model.getMessageSize(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'messageLength'
     */
    @Test
    public void messageLengthTest() {
        assertThat(model.getMessageLength(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'attachmentCount'
     */
    @Test
    public void attachmentCountTest() {
        assertThat(model.getAttachmentCount(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'recipientCount'
     */
    @Test
    public void recipientCountTest() {
        assertThat(model.getRecipientCount(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'campaignClass'
     */
    @Test
    public void campaignClassTest() {
        assertThat(model.getCampaignClass(), instanceOf(String.class));
    }

    /**
     * Test the property 'campaignId'
     */
    @Test
    public void campaignIdTest() {
        assertThat(model.getCampaignId(), instanceOf(String.class));
    }

}