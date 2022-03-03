package com.bandwidth;

import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.messaging.controllers.APIController;

import com.bandwidth.messaging.models.MessageRequest;
import com.bandwidth.messaging.models.BandwidthMessage;
import com.bandwidth.messaging.exceptions.MessagingException;
import com.bandwidth.utilities.FileWrapper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import org.junit.*;
import static org.junit.Assert.*;

import static com.bandwidth.TestingEnvironmentVariables.*;

/*
 * Integration tests between the SDK and Messaging API
 */
public class MessagingApiTest {

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

        MessageRequest body = new MessageRequest.Builder()
                .to(Collections.singletonList(USER_NUMBER))
                .from(BW_NUMBER)
                .text(text)
                .applicationId(MESSAGING_APPLICATION_ID)
                .build();

        ApiResponse<BandwidthMessage> apiResponse = controller.createMessage(ACCOUNT_ID, body);
        assertEquals("Response Code is not 202", 202, apiResponse.getStatusCode());
        BandwidthMessage response = apiResponse.getResult();
        assertNotNull("Message ID is null", response.getId());
        assertFalse("Message ID is empty", response.getId().isEmpty());
        assertEquals("Message ID is not 29 characters", 29, response.getId().length());
        assertEquals("Application ID not equal", MESSAGING_APPLICATION_ID, response.getApplicationId());
        assertEquals("To phone number not equal", USER_NUMBER, response.getTo().get(0));
        assertEquals("From phone number not equal", BW_NUMBER, response.getFrom());
        assertEquals("Text not equal", text, response.getText());
    }

    @Test
    public void testCreateMessageInvalidPhoneNumber() throws Exception {
        MessageRequest body = new MessageRequest.Builder()
                .to(Collections.singletonList("+1invalid"))
                .from(BW_NUMBER)
                .text("Java Test")
                .applicationId(MESSAGING_APPLICATION_ID)
                .build();

        MessagingException e = assertThrows(
                "Messaging Exception not thrown",
                MessagingException.class,
                () -> controller.createMessage(ACCOUNT_ID, body)
        );
        assertEquals("Response Code is not 400", 400, e.getResponseCode());
    }

    @Test
    public void testUploadDownloadDeleteMedia() throws Exception {
        final String fileName = "src/test/resources/mediaUpload.png";
        final String contentType = "image/png";

        File file = new File(fileName);
        byte[] fileContents = Files.readAllBytes(file.toPath());
        FileWrapper body = new FileWrapper(file, contentType);

        final String mediaId = "java-media-test_" + java.util.UUID.randomUUID();

        ApiResponse<Void> uploadMediaApiResponse = controller.uploadMedia(ACCOUNT_ID, mediaId, body, contentType, "no-cache");
        assertEquals("Response Code is not 204", 204, uploadMediaApiResponse.getStatusCode());

        ApiResponse<InputStream> downloadMediaApiResponse = controller.getMedia(ACCOUNT_ID, mediaId);
        assertEquals("Response Code is not 200", 200, downloadMediaApiResponse.getStatusCode());

        InputStream downloadMediaResponse = downloadMediaApiResponse.getResult();

        int bRead;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((bRead = downloadMediaResponse.read()) != -1){
            byteArrayOutputStream.write(bRead);
        }
        byte[] responseContents = byteArrayOutputStream.toByteArray();

        assertArrayEquals("Media download not equal to media upload", fileContents, responseContents);

        ApiResponse<Void> deleteMediaApiResponse = controller.deleteMedia(ACCOUNT_ID, mediaId);
        assertEquals("Response Code is not 204", 204, deleteMediaApiResponse.getStatusCode());
    }

    @Test
    public void testUploadDownloadDeleteBinaryMedia() throws Exception {
        final String fileName = "src/test/resources/mediaUpload.png";
        final String contentType = "image/png";

        File file = new File(fileName);
        byte[] fileContents = Files.readAllBytes(file.toPath());
        FileWrapper body = new FileWrapper(fileContents, contentType);

        final String mediaId = "java-media-test_" + java.util.UUID.randomUUID();

        ApiResponse<Void> uploadMediaApiResponse = controller.uploadMedia(ACCOUNT_ID, mediaId, body, contentType, "no-cache");
        assertEquals("Response Code is not 204", 204, uploadMediaApiResponse.getStatusCode());

        ApiResponse<InputStream> downloadMediaApiResponse = controller.getMedia(ACCOUNT_ID, mediaId);
        assertEquals("Response Code is not 200", 200, downloadMediaApiResponse.getStatusCode());

        InputStream downloadMediaResponse = downloadMediaApiResponse.getResult();

        int bRead;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((bRead = downloadMediaResponse.read()) != -1){
            byteArrayOutputStream.write(bRead);
        }
        byte[] responseContents = byteArrayOutputStream.toByteArray();

        assertArrayEquals("Media download not equal to media upload", fileContents, responseContents);

        ApiResponse<Void> deleteMediaApiResponse = controller.deleteMedia(ACCOUNT_ID, mediaId);
        assertEquals("Response Code is not 204", 204, deleteMediaApiResponse.getStatusCode());
    }

     @Test
     public void testUploadDownloadDeleteMediaAsync() throws Exception {
         final String fileName = "src/test/resources/mediaUpload.png";
         final String contentType = "image/png";

         File file = new File(fileName);
         byte[] fileContents = Files.readAllBytes(file.toPath());
         FileWrapper body = new FileWrapper(file, contentType);

         final String mediaId = "java-media-test_" + java.util.UUID.randomUUID();

         CompletableFuture<ApiResponse<Void>> uploadMediaApiResponseAsync = controller.uploadMediaAsync(ACCOUNT_ID, mediaId, body, contentType, "no-cache");
         assertEquals("Response Code is not 204", 204, uploadMediaApiResponseAsync.get().getStatusCode());

         CompletableFuture<ApiResponse<InputStream>> asyncDownloadMediaAPiResponse = controller.getMediaAsync(ACCOUNT_ID, mediaId);
         assertEquals("Response Code is not 200", 200, asyncDownloadMediaAPiResponse.get().getStatusCode());

         InputStream asyncDownloadMediaResponse = asyncDownloadMediaAPiResponse.get().getResult();
        
         int asyncBRead;
         ByteArrayOutputStream asyncByteArrayOutputStream = new ByteArrayOutputStream();
         while ((asyncBRead = asyncDownloadMediaResponse.read()) != -1){
             asyncByteArrayOutputStream.write(asyncBRead);
         }
         byte[] asyncResponseContents = asyncByteArrayOutputStream.toByteArray();

         assertArrayEquals("Media download not equal to media upload", fileContents, asyncResponseContents);

         CompletableFuture<ApiResponse<Void>> deleteMediaApiResponseAsync = controller.deleteMediaAsync(ACCOUNT_ID, mediaId);
         assertEquals("Response Code is not 204", 204, deleteMediaApiResponseAsync.get().getStatusCode());
     }
}
