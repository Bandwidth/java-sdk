package com.bandwidth;

import com.bandwidth.voice.controllers.APIController;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

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

import static com.bandwidth.TestingEnvironmentVariables.*;

/**
 * Integration tests for API interactions
 * ---
 * In Progress: Breaking out into separate test classes for each API
 */
public class ApiTest {

    private com.bandwidth.messaging.controllers.APIController messagingController;
    private com.bandwidth.voice.controllers.APIController voiceController;
    private com.bandwidth.multifactorauth.controllers.MFAController mfaController;
    private com.bandwidth.webrtc.controllers.APIController webrtcController;
    private com.bandwidth.phonenumberlookup.controllers.APIController phoneNumberLookupController;

    /*
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
    */

    /* Moved to MessagingApiTests.java
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
    */

    /* Moved to MessagingApiTests.java
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
    */

    /* Moved to MessagingApiTests.java
    @Test
    public void testUploadDownloadMedia() throws Exception {
        final String fileName = "src/test/resources/mediaUpload.png";
        final String contentType = "image/png";
        final File file = new File(fileName);
        final byte[] fileContents = Files.readAllBytes(file.toPath());
        FileWrapper body = new FileWrapper(file, contentType);
        String mediaId = "java-media-test";

        messagingController.uploadMedia(ACCOUNT_ID, mediaId, body, contentType, "no-cache");

        ApiResponse<InputStream> response = messagingController.getMedia(ACCOUNT_ID, mediaId);
        InputStream responseBody = response.getResult();

        int bRead;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((bRead = responseBody.read()) != -1){
            byteArrayOutputStream.write(bRead);
        }
        byte[] responseContents = byteArrayOutputStream.toByteArray();

        assertArrayEquals("Media download not equal to media upload", fileContents, responseContents);
    }
    */

    /* Moved to VoiceApiTests.java
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
    */

    /* Moved to VoiceApiTests.java
    @Test
    public void testCreateCallWithAmdAndGetCallState() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");
        final String machineDetectionUrl = BASE_CALLBACK_URL.concat("/callbacks/machineDetection");

        MachineDetectionRequest machineDetection = new MachineDetectionRequest();
        machineDetection.setMode(ModeEnum.ASYNC);
        machineDetection.setCallbackUrl(machineDetectionUrl);
        machineDetection.setCallbackMethod(CallbackMethodEnum.POST);
        machineDetection.setDetectionTimeout(5.0);
        machineDetection.setSilenceTimeout(5.0);
        machineDetection.setSpeechThreshold(5.0);
        machineDetection.setSpeechEndThreshold(5.0);
        machineDetection.setDelayResult(true);

        CreateCallRequest body = new CreateCallRequest();
        body.setTo(USER_NUMBER);
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setAnswerUrl(answerUrl);
        body.setMachineDetection(machineDetection);

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
    */

    /* Moved to VoiceApi.java
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
    */

    /* Moved to MfaApiTests.java
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
    }
    */

    /* Moved to MfaApiTests.java
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
    }
    */

    /* Moved to MfaTests.java
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
    */

    /* Moved to MfaApiTests.java
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
    */

    /* Moved to MfaApiTests.java
    @Test
    public void testMfaVerify() throws Exception {

        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
        body.setTo(USER_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setCode("1234567");
        body.setExpirationTimeInMinutes(3);

        ApiResponse<TwoFactorVerifyCodeResponse> response = mfaController.createVerifyTwoFactor(ACCOUNT_ID, body);
    }
    */

    /* Moved to MfaApiTests.java
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
    */

    /* Moved to WebRtcApiTests.java
    @Test
    public void testWebRtcParticipantSessionManagement() throws Exception {

        Session createSessionBody = new Session();
        createSessionBody.setTag("new-session");

        ApiResponse<Session> createSessionResponse = webrtcController.createSession(ACCOUNT_ID, createSessionBody);
        String sessionId = createSessionResponse.getResult().getId();

        Participant createParticipantBody = new Participant();
        createParticipantBody.setCallbackUrl(BASE_CALLBACK_URL.concat("/callbacks/webRtc"));

        ApiResponse<AccountsParticipantsResponse> createParticipantResponse = webrtcController.createParticipant(ACCOUNT_ID, createParticipantBody);
        String participantId = createParticipantResponse.getResult().getParticipant().getId();

        webrtcController.addParticipantToSession(ACCOUNT_ID, sessionId, participantId, null);
    }
    */

    /* Moved to TnLookupApiTests.java
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
    */
}
