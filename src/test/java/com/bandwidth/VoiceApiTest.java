package com.bandwidth;

import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.internal.OptionalNullable;
import com.bandwidth.voice.controllers.APIController;

import com.bandwidth.voice.exceptions.ApiErrorException;
import com.bandwidth.voice.models.*;
import org.junit.*;

import javax.swing.text.html.Option;

import static org.junit.Assert.*;

import static com.bandwidth.TestingEnvironmentVariables.*;

/*
 * Integration tests between the SDK and Voice API
 */
public class VoiceApiTest {

    private APIController controller;

    @Before
    public void initTest(){
        BandwidthClient client = new BandwidthClient.Builder()
                .voiceBasicAuthCredentials(USERNAME, PASSWORD)
//                .environment(com.bandwidth.Environment.CUSTOM) // Optional - sets the enviroment to a custom base URL
//                .baseUrl("https://42c9be22ebc6a0c3bdfb7248922a6687.m.pipedream.net/java") // Optional - sets the base Url
                .build();

        controller = client.getVoiceClient().getAPIController();
    }

    @Test
    public void testCreateCallAndGetCallState() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest.Builder()
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .answerUrl(answerUrl)
                .build();

        ApiResponse<CreateCallResponse> createCallApiResponse = controller.createCall(ACCOUNT_ID, body);
        assertEquals("Response Code is not 201", 201, createCallApiResponse.getStatusCode());

        CreateCallResponse createCallResponse = createCallApiResponse.getResult();
        assertNotNull("Call ID is null", createCallResponse.getCallId());
        assertFalse("Call ID is empty", createCallResponse.getCallId().isEmpty());
        assertEquals("Call ID is not 47 characters", 47, createCallResponse.getCallId().length());
        assertEquals("Application ID for create call not equal", VOICE_APPLICATION_ID, createCallResponse.getApplicationId());
        assertEquals("To phone number for create call not equal", USER_NUMBER, createCallResponse.getTo());
        assertEquals("From phone number for create call not equal", BW_NUMBER, createCallResponse.getFrom());

        //get call state
        Thread.sleep(750); // Wait to get Call because of current system latency issues
        ApiResponse<CallState> callStateApiResponse = controller.getCall(ACCOUNT_ID, createCallResponse.getCallId());
        assertEquals("Response Code is not 200", 200, callStateApiResponse.getStatusCode());

        CallState callStateResponse = callStateApiResponse.getResult();
        assertEquals("Application ID for call state not equal", VOICE_APPLICATION_ID, callStateResponse.getApplicationId());
        assertEquals("To phone number for call state not equal", USER_NUMBER, callStateResponse.getTo());
        assertEquals("From phone number for call state not equal", BW_NUMBER, callStateResponse.getFrom());
        assertEquals("Call ID not equal", createCallResponse.getCallId(), callStateResponse.getCallId());
    }

    @Test
    public void testCreateCallWithAmdAndGetCallState() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");
        final String machineDetectionUrl = BASE_CALLBACK_URL.concat("/callbacks/machineDetection");

        MachineDetectionConfiguration machineDetectionConfiguration = new MachineDetectionConfiguration.Builder()
                .mode(ModeEnum.ASYNC)
                .callbackUrl(machineDetectionUrl)
                .callbackMethod(CallbackMethodEnum.POST)
                .detectionTimeout(5.0)
                .silenceTimeout(5.0)
                .speechThreshold(5.0)
                .speechEndThreshold(5.0)
                .delayResult(true)
                .build();

        CreateCallRequest body = new CreateCallRequest.Builder()
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .answerUrl(answerUrl)
                .machineDetection(machineDetectionConfiguration)
                .build();

        ApiResponse<CreateCallResponse> createCallApiResponse = controller.createCall(ACCOUNT_ID, body);
        assertEquals("Response Code is not 201", 201, createCallApiResponse.getStatusCode());

        CreateCallResponse createCallResponse = createCallApiResponse.getResult();
        assertNotNull("Call ID is null", createCallResponse.getCallId());
        assertFalse("Call ID is empty", createCallResponse.getCallId().isEmpty());
        assertEquals("Call ID is not 47 characters", 47, createCallResponse.getCallId().length());
        assertEquals("Application ID for create call not equal", VOICE_APPLICATION_ID, createCallResponse.getApplicationId());
        assertEquals("To phone number for create call not equal", USER_NUMBER, createCallResponse.getTo());
        assertEquals("From phone number for create call not equal", BW_NUMBER, createCallResponse.getFrom());

        //get call state
        Thread.sleep(750); // Wait to get Call because of current system latency issues
        ApiResponse<CallState> callStateApiResponse = controller.getCall(ACCOUNT_ID, createCallResponse.getCallId());
        CallState callStateResponse = callStateApiResponse.getResult();
        assertEquals("Application ID for call state not equal", VOICE_APPLICATION_ID, callStateResponse.getApplicationId());
        assertEquals("To phone number for call state not equal", USER_NUMBER, callStateResponse.getTo());
        assertEquals("From phone number for call state not equal", BW_NUMBER, callStateResponse.getFrom());
        assertEquals("Call ID not equal", createCallResponse.getCallId(), callStateResponse.getCallId());
    }

    @Test
    public void testCreateCallWithPriorityAndGetCallState() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");
        final Integer priority = 4;

        CreateCallRequest body = new CreateCallRequest.Builder()
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .answerUrl(answerUrl)
                .priority(priority)
                .tag("the tag")
                .build();

        ApiResponse<CreateCallResponse> createCallApiResponse = controller.createCall(ACCOUNT_ID, body);
        assertEquals("Response Code is not 201", 201, createCallApiResponse.getStatusCode());

        CreateCallResponse createCallResponse = createCallApiResponse.getResult();
        assertNotNull("Call ID is null", createCallResponse.getCallId());
        assertFalse("Call ID is empty", createCallResponse.getCallId().isEmpty());
        assertEquals("Call ID is not 47 characters", 47, createCallResponse.getCallId().length());
        assertEquals("Application ID for create call not equal", VOICE_APPLICATION_ID, createCallResponse.getApplicationId());
        assertEquals("To phone number for create call not equal", USER_NUMBER, createCallResponse.getTo());
        assertEquals("From phone number for create call not equal", BW_NUMBER, createCallResponse.getFrom());
        assertEquals("Priority is not equal", priority, createCallResponse.getPriority());
        assertEquals("Tag is missing", "the tag", createCallResponse.getTag());
    }

    @Test
    public void testCreateCallInvalidPhoneNumber() throws Exception {
        final String answerUrl = BASE_CALLBACK_URL.concat("/callbacks/outbound");

        CreateCallRequest body = new CreateCallRequest.Builder()
                .to("+1invalid")
                .from(BW_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .answerUrl(answerUrl)
                .build();

        ApiErrorException e = assertThrows(
                "ApiError Exception not thrown",
                ApiErrorException.class,
                ()->controller.createCall(ACCOUNT_ID, body)
                );
        assertEquals("Response Code is not 400", 400, e.getResponseCode());
    }
}
