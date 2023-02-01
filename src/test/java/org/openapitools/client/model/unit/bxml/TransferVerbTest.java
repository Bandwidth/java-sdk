/**
 * 
 * Unit tests for Transfer Verb class
 * Because they are part of the Transfer Verb, there are also tests for PhoneNumber and SipURI
 *
 * @throws JAXBException if the test fails
 */

package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Bxml;
import org.openapitools.client.model.bxml.Transfer;
import org.openapitools.client.model.bxml.PhoneNumber;
import org.openapitools.client.model.bxml.SipUri;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class TransferVerbTest {
    /**
    * Setting up Variables
    */
    SipUri sipUri = new SipUri().builder()
                               .uri("sip@bw.com")
                               .uui("test")
                               .transferAnswerUrl("https://example.com/webhooks/transfer_answer")
                               .tag("test")
                               .transferAnswerMethod("POST")
                               .build();
    PhoneNumber phonenumber = new PhoneNumber().builder()
                               .number("+19195551234")
                               .transferAnswerUrl("https://example.com/webhooks/transfer_answer")
                               .tag("test")
                               .transferAnswerMethod("POST")
                               .build();
    Transfer transfer1 = new Transfer().builder()
                               .callTimeout(15d)
                               .destinations(List.of(sipUri))
                               .transferCallerId("+19195554321")
                               .tag("test")
                               .build();
    Transfer transfer2 = new Transfer().builder()
                               .callTimeout(15d)
                               .destinations(List.of(phonenumber))
                               .transferCallerId("+19195554321")
                               .tag("test")
                               .build();
    public JAXBContext jaxbContext;

    @Test
    public void transferVerbWorks() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedSipUriBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Transfer transferCallerId=\"+19195554321\" callTimeout=\"15.0\" transferCompleteMethod=\"POST\" transferCompleteFallbackMethod=\"POST\" tag=\"test\" diversionTreatment=\"NONE\" diversionReason=\"UNKNOWN\"><SipUri uui=\"test\" transferAnswerUrl=\"https://example.com/webhooks/transfer_answer\" transferAnswerMethod=\"POST\" transferAnswerFallbackMethod=\"POST\" transferDisconnectMethod=\"POST\" tag=\"test\">sip@bw.com</SipUri></Transfer></Bxml>";
        String expectedPhoneNumberBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Transfer transferCallerId=\"+19195554321\" callTimeout=\"15.0\" transferCompleteMethod=\"POST\" transferCompleteFallbackMethod=\"POST\" tag=\"test\" diversionTreatment=\"NONE\" diversionReason=\"UNKNOWN\"><PhoneNumber transferAnswerUrl=\"https://example.com/webhooks/transfer_answer\" transferAnswerMethod=\"POST\" transferAnswerFallbackMethod=\"POST\" transferDisconnectMethod=\"POST\" tag=\"test\">+19195551234</PhoneNumber></Transfer></Bxml>";

        assertThat(new Bxml().with(transfer1).toBxml(jaxbContext), is(expectedSipUriBxml));
        assertThat(new Bxml().with(transfer2).toBxml(jaxbContext), is(expectedPhoneNumberBxml));
    }
};
