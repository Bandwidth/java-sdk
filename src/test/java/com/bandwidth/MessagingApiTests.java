package com.bandwidth;

import com.bandwidth.messaging.controllers.APIController;

import com.bandwidth.messaging.models.MessageRequest;
import com.bandwidth.messaging.models.BandwidthMessage;
import com.bandwidth.messaging.exceptions.MessagingException;
import com.bandwidth.utilities.FileWrapper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Collections;

import org.junit.*;
import static org.junit.Assert.*;

import static com.bandwidth.TestingEnvironmentVariables.*;

/*
 * Integration tests between the SDK and Messaging API
 */
public class MessagingApiTests {

    private APIController controller;

    @Before
    public void initTest(){
        BandwidthClient client = new BandwidthClient.Builder()
                .messagingBasicAuthCredentials(USERNAME, PASSWORD)
                .build();

        controller = client.getMessagingClient().getAPIController();
    }

    @Test
    public void testCreateMessage() throws Exception {
        final String text = "Java Test";

        MessageRequest body = new MessageRequest();
        body.setTo(Collections.singletonList(USER_NUMBER));
        body.setFrom(BW_NUMBER);
        body.setText(text);
        body.setApplicationId(MESSAGING_APPLICATION_ID);

        BandwidthMessage response = controller.createMessage(ACCOUNT_ID, body).getResult();
        assertEquals("Application ID not equal", MESSAGING_APPLICATION_ID, response.getApplicationId());
        assertEquals("To phone number not equal", USER_NUMBER, response.getTo().get(0));
        assertEquals("From phone number not equal", BW_NUMBER, response.getFrom());
        assertEquals("Text not equal", text, response.getText());
    }

    @Test(expected = MessagingException.class)
    public void testCreateMessageInvalidPhoneNumber() throws Exception {
        MessageRequest body = new MessageRequest();
        body.setTo(Collections.singletonList("+1invalid"));
        body.setFrom(BW_NUMBER);
        body.setText("Java Test");
        body.setApplicationId(MESSAGING_APPLICATION_ID);

        controller.createMessage(ACCOUNT_ID, body);
    }

    @Test
    public void testUploadDownloadMedia() throws Exception {
        final String fileName = "src/test/resources/mediaUpload.png";
        final String contentType = "image/png";

        File file = new File(fileName);
        byte[] fileContents = Files.readAllBytes(file.toPath());
        FileWrapper body = new FileWrapper(file, contentType);

        String mediaId = "java-media-test";

        controller.uploadMedia(ACCOUNT_ID, mediaId, body, contentType, "no-cache");

        InputStream response = controller.getMedia(ACCOUNT_ID, mediaId).getResult();

        int bRead;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((bRead = response.read()) != -1){
            byteArrayOutputStream.write(bRead);
        }
        byte[] responseContents = byteArrayOutputStream.toByteArray();

        assertArrayEquals("Media download not equal to media upload", fileContents, responseContents);
    }
}