package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.CallsApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CallDirectionEnum;
import com.bandwidth.sdk.model.CallState;
import com.bandwidth.sdk.model.CallStateEnum;
import com.bandwidth.sdk.model.CallbackMethodEnum;
import com.bandwidth.sdk.model.CreateCall;
import com.bandwidth.sdk.model.CreateCallResponse;
import com.bandwidth.sdk.model.MachineDetectionConfiguration;
import com.bandwidth.sdk.model.MachineDetectionModeEnum;
import com.bandwidth.sdk.model.UpdateCall;
import com.google.gson.internal.LinkedTreeMap;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("null")
public class CallsApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static CallsApi api = new CallsApi(defaultClient);

    private static String callId = "c-1234";
    private static String displayName = "Java SDK";
    private static CallbackMethodEnum answerMethod = CallbackMethodEnum.POST;
    private static URI answerUrl = URI.create(BASE_CALLBACK_URL);
    private static CallbackMethodEnum disconnectMethod = CallbackMethodEnum.GET;
    private static URI disconnectUrl = URI.create(BASE_CALLBACK_URL);
    private static Double callTimeout = 30.0;
    private static Double callbackTimeout = 15.0;

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testCreateCall() throws ApiException {
        MachineDetectionConfiguration machineDetectionConfiguration = new MachineDetectionConfiguration()
                .mode(MachineDetectionModeEnum.ASYNC)
                .detectionTimeout(5.0)
                .silenceTimeout(5.0)
                .speechThreshold(5.0)
                .speechEndThreshold(5.0)
                .delayResult(true)
                .callbackUrl(URI.create(BASE_CALLBACK_URL))
                .callbackMethod(CallbackMethodEnum.POST);

        CreateCall createCall = new CreateCall()
                .applicationId(BW_VOICE_APPLICATION_ID)
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .privacy(false)
                .displayName(displayName)
                .answerUrl(answerUrl)
                .answerMethod(answerMethod)
                .disconnectUrl(disconnectUrl)
                .disconnectMethod(disconnectMethod)
                .machineDetection(machineDetectionConfiguration)
                .callTimeout(callTimeout)
                .callbackTimeout(callbackTimeout);

        ApiResponse<CreateCallResponse> response = api.createCallWithHttpInfo(BW_ACCOUNT_ID, createCall);

        assertThat(response.getStatusCode(), is(201));
        assertThat(response.getData(), instanceOf(CreateCallResponse.class));
        assertThat(response.getData().getApplicationId().length(), is(36));
        assertThat(response.getData().getAccountId().length(), is(7));
        assertThat(response.getData().getCallId().length(), is(47));
        assertThat(response.getData().getTo().length(), is(12));
        assertThat(response.getData().getFrom().length(), is(12));
        assertThat(response.getData().getEnqueuedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getCallUrl(), instanceOf(URI.class));
        assertThat(response.getData().getCallTimeout(), instanceOf(Double.class));
        assertThat(response.getData().getCallbackTimeout(), instanceOf(Double.class));
        assertThat(response.getData().getTag(), instanceOf(String.class));
        assertThat(response.getData().getAnswerMethod(), instanceOf(CallbackMethodEnum.class));
        assertThat(response.getData().getAnswerUrl(), instanceOf(URI.class));
        assertThat(response.getData().getAnswerFallbackMethod(), instanceOf(CallbackMethodEnum.class));
        assertThat(response.getData().getAnswerFallbackUrl(), instanceOf(URI.class));
        assertThat(response.getData().getDisconnectMethod(), instanceOf(CallbackMethodEnum.class));
        assertThat(response.getData().getDisconnectUrl(), instanceOf(URI.class));
        assertThat(response.getData().getUsername(), instanceOf(String.class));
        assertThat(response.getData().getPassword(), instanceOf(String.class));
        assertThat(response.getData().getFallbackUsername(), instanceOf(String.class));
        assertThat(response.getData().getFallbackPassword(), instanceOf(String.class));
        assertThat(response.getData().getPriority(), instanceOf(Integer.class));
    }

    @Test
    public void testGetCall() throws ApiException {
        ApiResponse<CallState> response = api.getCallStateWithHttpInfo(BW_ACCOUNT_ID, callId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(CallState.class));
        assertThat(response.getData().getApplicationId().length(), is(36));
        assertThat(response.getData().getAccountId().length(), is(7));
        assertThat(response.getData().getCallId().length(), is(47));
        assertThat(response.getData().getParentCallId().length(), is(47));
        assertThat(response.getData().getTo().length(), is(12));
        assertThat(response.getData().getFrom().length(), is(12));
        assertThat(response.getData().getDirection(), instanceOf(CallDirectionEnum.class));
        assertThat(response.getData().getState(), instanceOf(String.class));
        assertThat(response.getData().getStirShaken(), instanceOf(LinkedTreeMap.class));
        assertThat(response.getData().getIdentity(), instanceOf(String.class));
        assertThat(response.getData().getEnqueuedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getStartTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getAnswerTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getEndTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getDisconnectCause(), instanceOf(String.class));
        assertThat(response.getData(), hasProperty("errorMessage"));
        assertThat(response.getData(), hasProperty("errorId"));
        assertThat(response.getData().getLastUpdate(), instanceOf(OffsetDateTime.class));
    }

    @Test
    public void testListCalls() throws ApiException {
        ApiResponse<List<CallState>> response = api.listCallsWithHttpInfo(BW_ACCOUNT_ID, USER_NUMBER, BW_NUMBER, null,
                null, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().get(0), instanceOf(CallState.class));
        assertThat(response.getData().get(0).getApplicationId().length(), is(36));
        assertThat(response.getData().get(0).getAccountId().length(), is(7));
        assertThat(response.getData().get(0).getCallId().length(), is(47));
        assertThat(response.getData().get(0).getParentCallId().length(), is(47));
        assertThat(response.getData().get(0).getTo().length(), is(12));
        assertThat(response.getData().get(0).getFrom().length(), is(12));
        assertThat(response.getData().get(0).getDirection(), instanceOf(CallDirectionEnum.class));
        assertThat(response.getData().get(0).getState(), instanceOf(String.class));
        assertThat(response.getData().get(0).getStirShaken(), instanceOf(LinkedTreeMap.class));
        assertThat(response.getData().get(0).getIdentity(), instanceOf(String.class));
        assertThat(response.getData().get(0).getEnqueuedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getStartTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getAnswerTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getEndTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getDisconnectCause(), instanceOf(String.class));
        assertThat(response.getData().get(0), hasProperty("errorMessage"));
        assertThat(response.getData().get(0), hasProperty("errorId"));
        assertThat(response.getData().get(0).getLastUpdate(), instanceOf(OffsetDateTime.class));
    }

    @Test
    public void testUpdateCall() throws ApiException {
        UpdateCall updateCall = new UpdateCall()
                .state(CallStateEnum.ACTIVE);
        ApiResponse<Void> response = api.updateCallWithHttpInfo(BW_ACCOUNT_ID, callId, updateCall);

        assertThat(response.getStatusCode(), is(200));
    }

    @Test
    public void testUpdateCallBxml() throws ApiException {
        String updateCallBxml = "<Response><Hangup/></Response>";
        ApiResponse<Void> response = api.updateCallBxmlWithHttpInfo(BW_ACCOUNT_ID, callId, updateCallBxml);

        assertThat(response.getStatusCode(), is(204));
    }
}
