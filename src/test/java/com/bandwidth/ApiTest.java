package com.bandwidth;

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

import com.bandwidth.voice.models.*;
import com.bandwidth.voice.exceptions.*;
import com.bandwidth.messaging.models.*;
import com.bandwidth.messaging.exceptions.*;
import com.bandwidth.multifactorauth.models.*;
import com.bandwidth.multifactorauth.exceptions.*;
import com.bandwidth.webrtc.models.*;
import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.utilities.FileWrapper;
import com.bandwidth.phonenumberlookup.models.*;

/**
 * Integration tests for API interactions
 */
public class ApiTest {

    private BandwidthClient client;
    private com.bandwidth.messaging.controllers.APIController messagingController;
    private com.bandwidth.voice.controllers.APIController voiceController;
    private com.bandwidth.multifactorauth.controllers.MFAController mfaController;
    private com.bandwidth.webrtc.controllers.APIController webrtcController;
    private com.bandwidth.phonenumberlookup.controllers.APIController phoneNumberLookupController;

    @Before
    public void init() {
        this.client = new BandwidthClient.Builder()
            .messagingBasicAuthCredentials(System.getenv("BW_USERNAME"), System.getenv("BW_PASSWORD"))
            .voiceBasicAuthCredentials(System.getenv("BW_USERNAME"), System.getenv("BW_PASSWORD"))
            .multiFactorAuthBasicAuthCredentials(System.getenv("BW_USERNAME"), System.getenv("BW_PASSWORD"))
            .webRtcBasicAuthCredentials(System.getenv("BW_USERNAME"), System.getenv("BW_PASSWORD"))
            .phoneNumberLookupBasicAuthCredentials(System.getenv("BW_USERNAME"), System.getenv("BW_PASSWORD"))
            .build();
        this.messagingController = client.getMessagingClient().getAPIController();
        this.voiceController = client.getVoiceClient().getAPIController();
        this.mfaController = client.getMultiFactorAuthClient().getMFAController();
        this.webrtcController = client.getWebRtcClient().getAPIController();
        this.phoneNumberLookupController = client.getPhoneNumberLookupClient().getAPIController();
    }

    @Test
    public void testCreateMessage() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = System.getenv("USER_NUMBER");
        ArrayList<String> toNumbers = new ArrayList<String>();
        toNumbers.add(to);
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_MESSAGING_APPLICATION_ID");
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
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_MESSAGING_APPLICATION_ID");
        String text = "Java Test";

        MessageRequest body = new MessageRequest();
        body.setTo(toNumbers);
        body.setFrom(from);
        body.setText(text);
        body.setApplicationId(applicationId);

        messagingController.createMessage(accountId, body);
    }

    @Test
    public void testUploadDownloadMedia() throws Exception {
        String fileName = "src/test/resources/mediaUpload.png";
        File file = new File(fileName);
        FileInputStream inStream = new FileInputStream(fileName);
        String fileContents = ApiTest.convertInputStreamToString(inStream);
        FileWrapper body = new FileWrapper(file, "image/png");
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String mediaId = "java-media-test";
        String fileType = "image/png";
        String cache = "no-cache";

        messagingController.uploadMedia(accountId, mediaId, body, fileType, cache);

        ApiResponse<InputStream> response = messagingController.getMedia(accountId, mediaId);
        String resultString = ApiTest.convertInputStreamToString(response.getResult());

        assertEquals("Media download not equal to media upload", fileContents, resultString);
    }

    @Test
    public void testCreateCallAndGetCallState() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = System.getenv("USER_NUMBER");
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_VOICE_APPLICATION_ID");
        String answerUrl = System.getenv("BASE_CALLBACK_URL").concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest();
        body.setTo(to);
        body.setFrom(from);
        body.setApplicationId(applicationId);
        body.setAnswerUrl(answerUrl);

        ApiResponse<CreateCallResponse> createCallResponse = voiceController.createCall(accountId, body);
        assertEquals("Application ID for create call not equal", applicationId, createCallResponse.getResult().getApplicationId());
        assertEquals("To phone number for create call not equal", to, createCallResponse.getResult().getTo());
        assertEquals("From phone number for create call not equal", from, createCallResponse.getResult().getFrom());

        //get call state
        String callId = createCallResponse.getResult().getCallId();
        ApiResponse<CallState> callStateResponse = voiceController.getCall(accountId, callId);
        assertEquals("Application ID for call state not equal", applicationId, callStateResponse.getResult().getApplicationId());
        assertEquals("To phone number for call state not equal", to, callStateResponse.getResult().getTo());
        assertEquals("From phone number for call state not equal", from, callStateResponse.getResult().getFrom());
        assertEquals("Call ID not equal", callId, callStateResponse.getResult().getCallId());
    }

    @Test
    public void testCreateCallWithAmdAndGetCallState() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = System.getenv("USER_NUMBER");
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_VOICE_APPLICATION_ID");
        String answerUrl = System.getenv("BASE_CALLBACK_URL").concat("/callbacks/outbound");
        String machineDetectionUrl = System.getenv("BASE_CALLBACK_URL").concat("/callbacks/machineDetection");

        MachineDetectionConfiguration machineDetection = new MachineDetectionConfiguration();
        machineDetection.setMode(ModeEnum.ASYNC);
        machineDetection.setCallbackUrl(machineDetectionUrl);
        machineDetection.setCallbackMethod(CallbackMethodEnum.POST);
        machineDetection.setDetectionTimeout(5.0);
        machineDetection.setSilenceTimeout(5.0);
        machineDetection.setSpeechThreshold(5.0);
        machineDetection.setSpeechEndThreshold(5.0);
        machineDetection.setDelayResult(Boolean.TRUE);

        CreateCallRequest body = new CreateCallRequest();
        body.setTo(to);
        body.setFrom(from);
        body.setApplicationId(applicationId);
        body.setAnswerUrl(answerUrl);
        body.setMachineDetection(machineDetection);

        ApiResponse<CreateCallResponse> createCallResponse = voiceController.createCall(accountId, body);
        assertEquals("Application ID for create call not equal", applicationId, createCallResponse.getResult().getApplicationId());
        assertEquals("To phone number for create call not equal", to, createCallResponse.getResult().getTo());
        assertEquals("From phone number for create call not equal", from, createCallResponse.getResult().getFrom());

        //get call state
        String callId = createCallResponse.getResult().getCallId();
        ApiResponse<CallState> callStateResponse = voiceController.getCall(accountId, callId);
        assertEquals("Application ID for call state not equal", applicationId, callStateResponse.getResult().getApplicationId());
        assertEquals("To phone number for call state not equal", to, callStateResponse.getResult().getTo());
        assertEquals("From phone number for call state not equal", from, callStateResponse.getResult().getFrom());
        assertEquals("Call ID not equal", callId, callStateResponse.getResult().getCallId());
    }

    @Test(expected = ApiErrorException.class)
    public void testCreateCallInvalidPhoneNumber() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = "+1invalid";
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_VOICE_APPLICATION_ID");
        String answerUrl = System.getenv("BASE_CALLBACK_URL").concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest();
        body.setTo(to);
        body.setFrom(from);
        body.setApplicationId(applicationId);
        body.setAnswerUrl(answerUrl);

        voiceController.createCall(accountId, body);
    }

    @Test
    public void testMfaMessaging() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = System.getenv("USER_NUMBER");
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_MESSAGING_APPLICATION_ID");
        String scope = "scope";
        int digits = 6;
        String message = "Your temporary {NAME} {SCOPE} code is {CODE}";
        
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(to);
        body.setFrom(from);
        body.setApplicationId(applicationId);
        body.setScope(scope);
        body.setDigits(digits);
        body.setMessage(message);

        ApiResponse<TwoFactorMessagingResponse> response = mfaController.createMessagingTwoFactor(accountId, body);
        assertTrue("Message ID not defined", response.getResult().getMessageId().length() > 0);
    }

    @Test
    public void testMfaVoice() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = System.getenv("USER_NUMBER");
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_VOICE_APPLICATION_ID");
        String scope = "scope";
        int digits = 6;
        String message = "Your temporary {NAME} {SCOPE} code is {CODE}";
        
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(to);
        body.setFrom(from);
        body.setApplicationId(applicationId);
        body.setScope(scope);
        body.setDigits(digits);
        body.setMessage(message);

        ApiResponse<TwoFactorVoiceResponse> response = mfaController.createVoiceTwoFactor(accountId, body);
        assertTrue("Call ID not defined", response.getResult().getCallId().length() > 0);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaMessagingInvalidPhoneNumber() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = "+1invalid";
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_MESSAGING_APPLICATION_ID");
        String scope = "scope";
        int digits = 6;
        String message = "Your temporary {NAME} {SCOPE} code is {CODE}";
        
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(to);
        body.setFrom(from);
        body.setApplicationId(applicationId);
        body.setScope(scope);
        body.setDigits(digits);
        body.setMessage(message);

        mfaController.createMessagingTwoFactor(accountId, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVoiceInvalidPhoneNumber() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = "+1invalid";
        String from = System.getenv("BW_NUMBER");
        String applicationId = System.getenv("BW_VOICE_APPLICATION_ID");
        String scope = "scope";
        int digits = 6;
        String message = "Your temporary {NAME} {SCOPE} code is {CODE}";
        
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(to);
        body.setFrom(from);
        body.setApplicationId(applicationId);
        body.setScope(scope);
        body.setDigits(digits);
        body.setMessage(message);

        mfaController.createVoiceTwoFactor(accountId, body);
    }

    @Test
    public void testMfaVerify() throws Exception {
        java.util.Random wheelOfPhoneNumbers = new java.util.Random(System.currentTimeMillis());
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = "+1000" + wheelOfPhoneNumbers.nextInt(10000000);
        String applicationId = System.getenv("BW_VOICE_APPLICATION_ID");
        String scope = "scope";
        String code = "123456";
        int expirationTimeInMinutes = 3;

        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
        body.setTo(to);
        body.setApplicationId(applicationId);
        body.setScope(scope);
        body.setCode(code);
        body.setExpirationTimeInMinutes(expirationTimeInMinutes);

        ApiResponse<TwoFactorVerifyCodeResponse> response = mfaController.createVerifyTwoFactor(accountId, body);
        assertTrue("Valid not defined as a boolean", response.getResult().getValid() == true || response.getResult().getValid() == false);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVerifyInvalidPhoneNumber() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String to = "+1invalid";
        String applicationId = System.getenv("BW_VOICE_APPLICATION_ID");
        String scope = "scope";
        String code = "123456";
        int expirationTimeInMinutes = 3;

        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
        body.setTo(to);
        body.setApplicationId(applicationId);
        body.setScope(scope);
        body.setCode(code);
        body.setExpirationTimeInMinutes(expirationTimeInMinutes);

        mfaController.createVerifyTwoFactor(accountId, body);
    }

    @Test
    public void testWebRtcParticipantSessionManagement() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");

        Session createSessionBody = new Session();
        createSessionBody.setTag("new-session");

        ApiResponse<Session> createSessionResponse = webrtcController.createSession(accountId, createSessionBody);
        String sessionId = createSessionResponse.getResult().getId();

        Participant createParticipantBody = new Participant();
        createParticipantBody.setCallbackUrl("https://sample.com");
        ArrayList<PublishPermissionEnum> publishPermissions = new ArrayList<PublishPermissionEnum>();
        publishPermissions.add(PublishPermissionEnum.AUDIO);
        publishPermissions.add(PublishPermissionEnum.VIDEO);

        ApiResponse<AccountsParticipantsResponse> createParticipantResponse = webrtcController.createParticipant(accountId, createParticipantBody);
        String participantId = createParticipantResponse.getResult().getParticipant().getId();

        webrtcController.addParticipantToSession(accountId, sessionId, participantId, null);
    }

    @Test
    public void testPhoneNumberLookup() throws Exception {
        String accountId = System.getenv("BW_ACCOUNT_ID");
        String checkNumber = System.getenv("USER_NUMBER");
        ArrayList<String> checkNumbers = new ArrayList<String>();
        checkNumbers.add(checkNumber);

        OrderRequest body = new OrderRequest();
        body.setTns(checkNumbers);
        ApiResponse<OrderResponse> orderResponse = phoneNumberLookupController.createLookupRequest(accountId, body);
        String requestId = orderResponse.getResult().getRequestId();
        
        assertTrue("requestId not defined properly", requestId.length() > 0);

        ApiResponse<OrderStatus> orderStatusResponse = phoneNumberLookupController.getLookupRequestStatus(accountId, requestId);
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
