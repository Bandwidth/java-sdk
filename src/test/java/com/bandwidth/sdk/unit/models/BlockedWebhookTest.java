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

import java.util.UUID;
import com.bandwidth.sdk.model.BlockedWebhook;
import com.bandwidth.sdk.model.TfvCallbackStatusEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for BlockedWebhook
 */
public class BlockedWebhookTest {
    private final BlockedWebhook model = new BlockedWebhook()
            .accountId("accountId")
            .phoneNumber("phoneNumber")
            .status(TfvCallbackStatusEnum.VERIFIED)
            .internalTicketNumber(UUID.randomUUID())
            .blocked(true)
            .blockedReason("blockedReason");

    /**
     * Model tests for BlockedWebhook
     */
    @Test
    public void testBlockedWebhook() {
        assertThat(model, instanceOf(BlockedWebhook.class));
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        assertThat(model.getAccountId(), instanceOf(String.class));
    }

    /**
     * Test the property 'phoneNumber'
     */
    @Test
    public void phoneNumberTest() {
        assertThat(model.getPhoneNumber(), instanceOf(String.class));
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        assertThat(model.getStatus(), instanceOf(TfvCallbackStatusEnum.class));
    }

    /**
     * Test the property 'internalTicketNumber'
     */
    @Test
    public void internalTicketNumberTest() {
        assertThat(model.getInternalTicketNumber(), instanceOf(UUID.class));
    }

    /**
     * Test the property 'blocked'
     */
    @Test
    public void blockedTest() {
        assertThat(model.getBlocked(), instanceOf(Boolean.class));
    }

    /**
     * Test the property 'blockedReason'
     */
    @Test
    public void blockedReasonTest() {
        assertThat(model.getBlockedReason(), instanceOf(String.class));
    }

}
