package com.bandwidth;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

import java.util.ArrayList;

import com.bandwidth.*;
import com.bandwidth.messaging.models.*;
import com.bandwidth.messaging.controllers.*;
import com.bandwidth.messaging.exceptions.*;
import com.bandwidth.exceptions.ApiException;
import com.bandwidth.http.response.ApiResponse;

/**
 * Integration tests for API interactions
 */
public class ApiTest {

    private BandwidthClient client;
    private com.bandwidth.messaging.controllers.APIController messagingController;

    @Before
    public void init() {
        this.client = new BandwidthClient.Builder()
            .messagingBasicAuthCredentials(System.getenv("BW_USERNAME"), System.getenv("BW_PASSWORD"))
            .build();
        this.messagingController = client.getMessagingClient().getAPIController();
    }

    @Test
    public void testCreateMessage() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = System.getenv("PHONE_NUMBER_INBOUND");
        ArrayList<String> toNumbers = new ArrayList<String>();
        toNumbers.add(to);
        String from = System.getenv("PHONE_NUMBER_OUTBOUND");
        String applicationId = System.getenv("MESSAGING_APPLICATION_ID");
        String text = "Java Test";

        MessageRequest body = new MessageRequest();
        body.setTo(toNumbers);
        body.setFrom(from);
        body.setText(text);
        body.setApplicationId(applicationId);

        ApiResponse<BandwidthMessage> response = messagingController.createMessage(accountId, body);
        assertEquals("Application ID not equal", applicationId, response.getResult().getApplicationId());
        assertEquals("To phone number not equal", to, response.getResult().getTo().get(0));
        assertEquals("From phone number not equal", from, response.getResult().getFrom());
        assertEquals("Text not equal", text, response.getResult().getText());
    }

    @Test(expected = MessagingException.class)
    public void testCreateMessageInvalidPhoneNumber() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = "+1invalid";
        ArrayList<String> toNumbers = new ArrayList<String>();
        toNumbers.add(to);
        String from = System.getenv("PHONE_NUMBER_OUTBOUND");
        String applicationId = System.getenv("MESSAGING_APPLICATION_ID");
        String text = "Java Test";

        MessageRequest body = new MessageRequest();
        body.setTo(toNumbers);
        body.setFrom(from);
        body.setText(text);
        body.setApplicationId(applicationId);

        messagingController.createMessage(accountId, body);
    }

    @Test
    public void testUploadDownloadMedia() {

    }

    @Test
    public void testCreateCallAndGetCallState() {

    }

    @Test
    public void testCreateCallInvalidPhoneNumber() {

    }

    @Test
    public void testMfaMessaging() {

    }

    @Test
    public void testMfaVerify() {

    }
}
