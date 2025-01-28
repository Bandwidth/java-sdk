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

import com.bandwidth.sdk.model.VerificationDenialWebhook;
import com.bandwidth.sdk.model.AdditionalDenialReason;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for VerificationDenialWebhook
 */
public class VerificationDenialWebhookTest {
    private final VerificationDenialWebhook model = new VerificationDenialWebhook()
            .accountId("accountId")
            .additionalDenialReasons(new ArrayList<AdditionalDenialReason>(Arrays.asList(new AdditionalDenialReason())))
            .declineReasonDescription("declineReasonDescription")
            .denialStatusCode(1234)
            .internalTicketNumber(UUID.randomUUID())
            .phoneNumber("phoneNumber")
            .resubmitAllowed(true)
            .status("status");

    /**
     * Model tests for VerificationDenialWebhook
     */
    @Test
    public void testVerificationDenialWebhook() {
        assertThat(model, instanceOf(VerificationDenialWebhook.class));
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        assertThat(model.getAccountId(), instanceOf(String.class));
    }

    /**
     * Test the property 'additionalDenialReasons'
     */
    @Test
    public void additionalDenialReasonsTest() {
        assertThat(model.getAdditionalDenialReasons(), instanceOf(List.class));
    }

    /**
     * Test the property 'declineReasonDescription'
     */
    @Test
    public void declineReasonDescriptionTest() {
        assertThat(model.getDeclineReasonDescription(), instanceOf(String.class));
    }

    /**
     * Test the property 'denialStatusCode'
     */
    @Test
    public void denialStatusCodeTest() {
        assertThat(model.getDenialStatusCode(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'internalTicketNumber'
     */
    @Test
    public void internalTicketNumberTest() {
        assertThat(model.getInternalTicketNumber(), instanceOf(UUID.class));
    }

    /**
     * Test the property 'phoneNumber'
     */
    @Test
    public void phoneNumberTest() {
        assertThat(model.getPhoneNumber(), instanceOf(String.class));
    }

    /**
     * Test the property 'resubmitAllowed'
     */
    @Test
    public void resubmitAllowedTest() {
        assertThat(model.getResubmitAllowed(), instanceOf(Boolean.class));
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        assertThat(model.getStatus(), instanceOf(String.class));
    }

}
