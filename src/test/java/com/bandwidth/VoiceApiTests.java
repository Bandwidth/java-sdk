package com.bandwidth;

import com.bandwidth.voice.controllers.APIController;

import com.bandwidth.voice.exceptions.ApiErrorException;
import com.bandwidth.voice.models.*;
import org.junit.*;
import static org.junit.Assert.*;

import static com.bandwidth.TestingEnvironmentVariables.*;

/*
 * Integration tests between the SDK and Voice API
 */
public class VoiceApiTests {

    private APIController controller;

    @Before
    public void initTest(){
        BandwidthClient client = new BandwidthClient.Builder()
                .voiceBasicAuthCredentials(USERNAME, PASSWORD)
                .build();

        controller = client.getVoiceClient().getAPIController();
    }

    @Test
    public void testCreateCallAndGetCallState() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest();
        body.setTo(USER_NUMBER);
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setAnswerUrl(answerUrl);

        CreateCallResponse createCallResponse = controller.createCall(ACCOUNT_ID, body).getResult();
        assertEquals("Application ID for create call not equal", VOICE_APPLICATION_ID, createCallResponse.getApplicationId());
        assertEquals("To phone number for create call not equal", USER_NUMBER, createCallResponse.getTo());
        assertEquals("From phone number for create call not equal", BW_NUMBER, createCallResponse.getFrom());

        //get call state
        String callId = createCallResponse.getCallId();
        CallState callStateResponse = controller.getCall(ACCOUNT_ID, callId).getResult();
        assertEquals("Application ID for call state not equal", VOICE_APPLICATION_ID, callStateResponse.getApplicationId());
        assertEquals("To phone number for call state not equal", USER_NUMBER, callStateResponse.getTo());
        assertEquals("From phone number for call state not equal", BW_NUMBER, callStateResponse.getFrom());
        assertEquals("Call ID not equal", callId, callStateResponse.getCallId());
    }

    @Test
    public void testCreateCallWithAmdAndGetCallState() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");
        final String machineDetectionUrl = BASE_CALLBACK_URL.concat("/callbacks/machineDetection");

        MachineDetectionConfiguration machineDetection = new MachineDetectionConfiguration();
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

        CreateCallResponse createCallResponse = controller.createCall(ACCOUNT_ID, body).getResult();
        assertEquals("Application ID for create call not equal", VOICE_APPLICATION_ID, createCallResponse.getApplicationId());
        assertEquals("To phone number for create call not equal", USER_NUMBER, createCallResponse.getTo());
        assertEquals("From phone number for create call not equal", BW_NUMBER, createCallResponse.getFrom());

        //get call state
        CallState callStateResponse = controller.getCall(ACCOUNT_ID, createCallResponse.getCallId()).getResult();
        assertEquals("Application ID for call state not equal", VOICE_APPLICATION_ID, callStateResponse.getApplicationId());
        assertEquals("To phone number for call state not equal", USER_NUMBER, callStateResponse.getTo());
        assertEquals("From phone number for call state not equal", BW_NUMBER, callStateResponse.getFrom());
        assertEquals("Call ID not equal", createCallResponse.getCallId(), callStateResponse.getCallId());
    }

    @Test(expected = ApiErrorException.class)
    public void testCreateCallInvalidPhoneNumber() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest();
        body.setTo("+1invalid");
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setAnswerUrl(answerUrl);

        controller.createCall(ACCOUNT_ID, body);
    }
}
