/**
 * 
 * Unit tests for Transfer Verb class
 * Because they are part of the Transfer Verb, there are also tests for PhoneNumber and SipURI
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Transfer;
import com.bandwidth.sdk.model.bxml.PhoneNumber;
import com.bandwidth.sdk.model.bxml.SipUri;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class TransferVerbTest {
        /**
         * Setting up Variables
         */
        SipUri sipUri = SipUri.builder()
                        .uri("sip@bw.com")
                        .uui("test")
                        .transferAnswerUrl("https://example.com/webhooks/transfer_answer")
                        .tag("test")
                        .transferAnswerMethod("POST")
                        .build();
        PhoneNumber phonenumber = PhoneNumber.builder()
                        .number("+19195551234")
                        .transferAnswerUrl("https://example.com/webhooks/transfer_answer")
                        .tag("test")
                        .transferAnswerMethod("POST")
                        .build();
        Transfer transfer1 = Transfer.builder()
                        .callTimeout(15d)
                        .destinations(List.of(sipUri))
                        .transferCallerId("+19195554321")
                        .tag("test")
                        .build();
        Transfer transfer2 = Transfer.builder()
                        .callTimeout(15d)
                        .destinations(List.of(phonenumber))
                        .transferCallerId("+19195554321")
                        .transferCallerDisplayName("Clark Kent")
                        .tag("test")
                        .build();

        @Test
        public void transferVerbWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedSipUriBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Transfer transferCallerId=\"+19195554321\" callTimeout=\"15.0\" transferCompleteMethod=\"POST\" transferCompleteFallbackMethod=\"POST\" tag=\"test\" diversionTreatment=\"none\" diversionReason=\"unknown\"><SipUri uui=\"test\" transferAnswerUrl=\"https://example.com/webhooks/transfer_answer\" transferAnswerMethod=\"POST\" transferAnswerFallbackMethod=\"POST\" transferDisconnectMethod=\"POST\" tag=\"test\">sip@bw.com</SipUri></Transfer></Bxml>";
                String expectedPhoneNumberBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Transfer transferCallerId=\"+19195554321\" transferCallerDisplayName=\"Clark Kent\" callTimeout=\"15.0\" transferCompleteMethod=\"POST\" transferCompleteFallbackMethod=\"POST\" tag=\"test\" diversionTreatment=\"none\" diversionReason=\"unknown\"><PhoneNumber transferAnswerUrl=\"https://example.com/webhooks/transfer_answer\" transferAnswerMethod=\"POST\" transferAnswerFallbackMethod=\"POST\" transferDisconnectMethod=\"POST\" tag=\"test\">+19195551234</PhoneNumber></Transfer></Bxml>"; //

                assertThat(new Bxml().with(transfer1).toBxml(jaxbContext), is(expectedSipUriBxml));
                assertThat(new Bxml().with(transfer2).toBxml(jaxbContext), is(expectedPhoneNumberBxml));
        }
};
