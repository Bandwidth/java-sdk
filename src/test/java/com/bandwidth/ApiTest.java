package com.bandwidth;

import com.bandwidth.voice.controllers.APIController;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;

import com.bandwidth.*;
import com.bandwidth.Environment;
import com.bandwidth.voice.models.*;
import com.bandwidth.voice.controllers.*;
import com.bandwidth.voice.exceptions.*;
import com.bandwidth.messaging.models.*;
import com.bandwidth.messaging.controllers.*;
import com.bandwidth.messaging.exceptions.*;
import com.bandwidth.multifactorauth.models.*;
import com.bandwidth.multifactorauth.controllers.*;
import com.bandwidth.multifactorauth.exceptions.*;
import com.bandwidth.webrtc.models.*;
import com.bandwidth.webrtc.controllers.*;
import com.bandwidth.exceptions.ApiException;
import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.utilities.FileWrapper;
import com.bandwidth.phonenumberlookup.models.*;
import com.bandwidth.phonenumberlookup.controllers.*;

/**
 * Integration tests for API interactions
 */
public class ApiTest {

    private static final String USERNAME = System.getenv("BW_USERNAME");
    private static final String PASSWORD = System.getenv("BW_PASSWORD");
    private static final String ACCOUNT_ID = System.getenv("BW_ACCOUNT_ID");
    private static final String USER_NUMBER = System.getenv("USER_NUMBER");
    private static final String BW_NUMBER = System.getenv("BW_NUMBER");
    private static final String MESSAGING_APPLICATION_ID = System.getenv("BW_MESSAGING_APPLICATION_ID");
    private static final String VOICE_APPLICATION_ID = System.getenv("BW_VOICE_APPLICATION_ID");
    private static final String BASE_CALLBACK_URL = System.getenv("BASE_CALLBACK_URL");

    private com.bandwidth.messaging.controllers.APIController messagingController;
    private com.bandwidth.voice.controllers.APIController voiceController;
    private com.bandwidth.multifactorauth.controllers.MFAController mfaController;
    private com.bandwidth.webrtc.controllers.APIController webrtcController;
    private com.bandwidth.phonenumberlookup.controllers.APIController phoneNumberLookupController;

    @Before
    public void initTest() {
        BandwidthClient client = new BandwidthClient.Builder()
                .messagingBasicAuthCredentials(USERNAME, PASSWORD)
                .voiceBasicAuthCredentials(USERNAME, PASSWORD)
                .multiFactorAuthBasicAuthCredentials(USERNAME, PASSWORD)
                .webRtcBasicAuthCredentials(USERNAME, PASSWORD)
                .phoneNumberLookupBasicAuthCredentials(USERNAME, PASSWORD)
                .build();
        this.messagingController = client.getMessagingClient().getAPIController();
        this.voiceController = client.getVoiceClient().getAPIController();
        this.mfaController = client.getMultiFactorAuthClient().getMFAController();
        this.webrtcController = client.getWebRtcClient().getAPIController();
        this.phoneNumberLookupController = client.getPhoneNumberLookupClient().getAPIController();
    }

    @Test
    public void testCreateMessage() throws Exception {
        ArrayList<String> toNumbers = new ArrayList<>();
        toNumbers.add(USER_NUMBER);

        final String text = "Java Test";

        MessageRequest body = new MessageRequest();
        body.setTo(toNumbers);
        body.setFrom(BW_NUMBER);
        body.setText(text);
        body.setApplicationId(MESSAGING_APPLICATION_ID);

        ApiResponse<BandwidthMessage> response = messagingController.createMessage(ACCOUNT_ID, body);
        assertEquals("Application ID not equal", MESSAGING_APPLICATION_ID, response.getResult().getApplicationId());
        assertEquals("To phone number not equal", USER_NUMBER, response.getResult().getTo().get(0));
        assertEquals("From phone number not equal", BW_NUMBER, response.getResult().getFrom());
        assertEquals("Text not equal", text, response.getResult().getText());
    }

    @Test(expected = MessagingException.class)
    public void testCreateMessageInvalidPhoneNumber() throws Exception {
        ArrayList<String> toNumbers = new ArrayList<>();
        toNumbers.add("+1invalid");

        MessageRequest body = new MessageRequest();
        body.setTo(toNumbers);
        body.setFrom(BW_NUMBER);
        body.setText("Java Test");
        body.setApplicationId(MESSAGING_APPLICATION_ID);

        messagingController.createMessage(ACCOUNT_ID, body);
    }

    @Test
    public void testUploadDownloadMedia() throws Exception {
        final String fileName = "src/test/resources/mediaUpload.png";
        File file = new File(fileName);
        FileInputStream inStream = new FileInputStream(fileName);
        String fileContents = ApiTest.convertInputStreamToString(inStream);
        FileWrapper body = new FileWrapper(file, "image/png");
        String mediaId = "java-media-test";
        String fileType = "image/png";
        String cache = "no-cache";

        messagingController.uploadMedia(ACCOUNT_ID, mediaId, body, fileType, cache);

        ApiResponse<InputStream> response = messagingController.getMedia(ACCOUNT_ID, mediaId);
        String resultString = ApiTest.convertInputStreamToString(response.getResult());

        assertEquals("Media download not equal to media upload", fileContents, resultString);
    }

    @Test
    public void testCreateCallAndGetCallState() throws Exception {
        String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest();
        body.setTo(USER_NUMBER);
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setAnswerUrl(answerUrl);

        ApiResponse<CreateCallResponse> createCallResponse = voiceController.createCall(ACCOUNT_ID, body);
        assertEquals("Application ID for create call not equal", VOICE_APPLICATION_ID, createCallResponse.getResult().getApplicationId());
        assertEquals("To phone number for create call not equal", USER_NUMBER, createCallResponse.getResult().getTo());
        assertEquals("From phone number for create call not equal", BW_NUMBER, createCallResponse.getResult().getFrom());

        //get call state
        String callId = createCallResponse.getResult().getCallId();
        ApiResponse<CallState> callStateResponse = voiceController.getCall(ACCOUNT_ID, callId);
        assertEquals("Application ID for call state not equal", VOICE_APPLICATION_ID, callStateResponse.getResult().getApplicationId());
        assertEquals("To phone number for call state not equal", USER_NUMBER, callStateResponse.getResult().getTo());
        assertEquals("From phone number for call state not equal", BW_NUMBER, callStateResponse.getResult().getFrom());
        assertEquals("Call ID not equal", callId, callStateResponse.getResult().getCallId());
    }

    @Test(expected = ApiErrorException.class)
    public void testCreateCallInvalidPhoneNumber() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest();
        body.setTo("+1invalid");
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setAnswerUrl(answerUrl);

        voiceController.createCall(ACCOUNT_ID, body);
    }

    @Test
    public void testMfaMessaging() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(USER_NUMBER);
        body.setFrom(BW_NUMBER);
        body.setApplicationId(MESSAGING_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        ApiResponse<TwoFactorMessagingResponse> response = mfaController.createMessagingTwoFactor(ACCOUNT_ID, body);
        assertTrue("Message ID not defined", response.getResult().getMessageId().length() > 0);
    }

    @Test
    public void testMfaVoice() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(USER_NUMBER);
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        ApiResponse<TwoFactorVoiceResponse> response = mfaController.createVoiceTwoFactor(ACCOUNT_ID, body);
        assertTrue("Call ID not defined", response.getResult().getCallId().length() > 0);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaMessagingInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo("+1invalid");
        body.setFrom(BW_NUMBER);
        body.setApplicationId(MESSAGING_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        mfaController.createMessagingTwoFactor(ACCOUNT_ID, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVoiceInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo("+1invalid");
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        mfaController.createVoiceTwoFactor(ACCOUNT_ID, body);
    }

    @Test
    public void testMfaVerify() throws Exception {

        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
        body.setTo(USER_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setCode("123456");
        body.setExpirationTimeInMinutes(3);

        ApiResponse<TwoFactorVerifyCodeResponse> response = mfaController.createVerifyTwoFactor(ACCOUNT_ID, body);
        assertTrue("Valid not defined as a boolean", response.getResult().getValid() == true || response.getResult().getValid() == false);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVerifyInvalidPhoneNumber() throws Exception {
        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
        body.setTo("+1invalid");
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setCode("123456");
        body.setExpirationTimeInMinutes(3);

        mfaController.createVerifyTwoFactor(ACCOUNT_ID, body);
    }

    @Test
    public void testWebRtcParticipantSessionManagement() throws Exception {

        Session createSessionBody = new Session();
        createSessionBody.setTag("new-session");

        ApiResponse<Session> createSessionResponse = webrtcController.createSession(ACCOUNT_ID, createSessionBody);
        String sessionId = createSessionResponse.getResult().getId();

        Participant createParticipantBody = new Participant();
        createParticipantBody.setCallbackUrl("https://sample.com");

        ApiResponse<AccountsParticipantsResponse> createParticipantResponse = webrtcController.createParticipant(ACCOUNT_ID, createParticipantBody);
        String participantId = createParticipantResponse.getResult().getParticipant().getId();

        webrtcController.addParticipantToSession(ACCOUNT_ID, sessionId, participantId, null);
    }

    @Test
    public void testPhoneNumberLookup() throws Exception {
        ArrayList<String> checkNumbers = new ArrayList<>();
        checkNumbers.add(USER_NUMBER);

        OrderRequest body = new OrderRequest();
        body.setTns(checkNumbers);
        ApiResponse<OrderResponse> orderResponse = phoneNumberLookupController.createLookupRequest(ACCOUNT_ID, body);
        String requestId = orderResponse.getResult().getRequestId();
        
        assertTrue("requestId not defined properly", requestId.length() > 0);

        ApiResponse<OrderStatus> orderStatusResponse = phoneNumberLookupController.getLookupRequestStatus(ACCOUNT_ID, requestId);
        String status = orderStatusResponse.getResult().getStatus();

        assertTrue("status not defined properly", status.length() > 0);
    }

    /*
     * Taken from https://mkyong.com/java/how-to-convert-inputstream-to-string-in-java/
     */
    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
      final char[] buffer = new char[8192];
      final StringBuilder result = new StringBuilder();

      // InputStream -> Reader
      try (Reader reader = new InputStreamReader(inputStream)) {
          int charsRead;
          while ((charsRead = reader.read(buffer, 0, buffer.length)) > 0) {
              result.append(buffer, 0, charsRead);
          }
      }

      return result.toString();
    }
}
