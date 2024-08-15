package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.CallsApi;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.model.CallbackMethodEnum;
import com.bandwidth.sdk.model.CreateCall;
import com.bandwidth.sdk.model.CreateCallResponse;
import com.bandwidth.sdk.model.CallDirectionEnum;
import com.bandwidth.sdk.model.CallState;
import com.bandwidth.sdk.model.CallStateEnum;
import com.bandwidth.sdk.model.MachineDetectionConfiguration;
import com.bandwidth.sdk.model.MachineDetectionModeEnum;
import com.bandwidth.sdk.model.UpdateCall;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static com.bandwidth.sdk.utils.CallCleanup.Cleanup;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CallsApiTest {
    public ApiClient defaultClient = Configuration.getDefaultApiClient();
    public HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    public final CallsApi api = new CallsApi(defaultClient);

    private static List<String> callIdList = new ArrayList<String>();
    private static MachineDetectionConfiguration machineDetection = new MachineDetectionConfiguration();
    private static CreateCall createCallBody = new CreateCall();
    private static CreateCall createMantecaCallBody = new CreateCall();
    private static UpdateCall updateMantecaCallBody = new UpdateCall();
    private static UpdateCall completeMantecaCallBody = new UpdateCall();
    private static URI answerUrl;
    private static URI mantecaAnswerUrl;
    private static URI mantecaRedirectUrl;
    private static URI fallbackUrl;
    private static URI disconnectUrl;
    private static URI machineDetectionUrl;
    private static URI machineDetectionCompleteUrl;
    private static CallbackMethodEnum callbackMethod = CallbackMethodEnum.POST;
    private static String testCallId = "Call-Id";
    private static String testXmlBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Bxml><SpeakSentence locale=\"en_US\" gender=\"female\" voice=\"susan\">This is a test bxml response</SpeakSentence><Pause duration=\"3\"/></Bxml>";
    private static int TEST_SLEEP = 6;

    @BeforeAll
    public static void setupBeforeClass() throws URISyntaxException {
        answerUrl = new URI(BASE_CALLBACK_URL);
        mantecaAnswerUrl = new URI(MANTECA_BASE_URL + "/bxml/pause");
        mantecaRedirectUrl = new URI(MANTECA_BASE_URL + "/bxml/pause");
        fallbackUrl = new URI("https://www.myFallbackServer.com/webhooks/answer");
        disconnectUrl = new URI("https://myServer.com/bandwidth/webhooks/disconnectUrl");
        machineDetectionUrl = new URI("https://myServer.com/bandwidth/webhooks/machineDetectionComplete");
        machineDetectionCompleteUrl = new URI(
                "https://myFallbackServer.com/bandwidth/webhooks/machineDetectionComplete");

        machineDetection.setMode(MachineDetectionModeEnum.ASYNC);
        machineDetection.setDetectionTimeout(15.0);
        machineDetection.setSilenceTimeout(10.0);
        machineDetection.setSpeechThreshold(10.0);
        machineDetection.setSpeechEndThreshold(5.0);
        machineDetection.setMachineSpeechEndThreshold(5.0);
        machineDetection.setDelayResult(false);
        machineDetection.setCallbackUrl(machineDetectionUrl);
        machineDetection.setCallbackMethod(callbackMethod);
        machineDetection.setUsername("mySecretUsername");
        machineDetection.setPassword("mySecretPassword1!");
        machineDetection.setFallbackUrl(machineDetectionCompleteUrl);
        machineDetection.setFallbackMethod(callbackMethod);
        machineDetection.setFallbackUsername("mySecretUsername");
        machineDetection.setFallbackPassword("mySecretPassword1!");

        createCallBody.setTo(USER_NUMBER);
        createCallBody.setFrom(BW_NUMBER);
        createCallBody.setApplicationId(BW_VOICE_APPLICATION_ID);
        createCallBody.setAnswerUrl(answerUrl);
        createCallBody.setAnswerMethod(callbackMethod);
        createCallBody.setUsername("mySecretUsername");
        createCallBody.setPassword("mySecretPassword1!");
        createCallBody.setAnswerFallbackUrl(fallbackUrl);
        createCallBody.setAnswerFallbackMethod(callbackMethod);
        createCallBody.setFallbackUsername("mySecretUsername");
        createCallBody.setFallbackPassword("mySecretPassword1!");
        createCallBody.setDisconnectUrl(disconnectUrl);
        createCallBody.setDisconnectMethod(callbackMethod);
        createCallBody.setCallTimeout(30.0);
        createCallBody.setCallbackTimeout(15.0);
        createCallBody.setMachineDetection(machineDetection);
        createCallBody.setPriority(5);
        createCallBody.setPrivacy(false);
        createCallBody.setTag("tag_example");

        createMantecaCallBody.setFrom(MANTECA_ACTIVE_NUMBER);
        createMantecaCallBody.setTo(MANTECA_IDLE_NUMBER);
        createMantecaCallBody.setApplicationId(MANTECA_APPLICATION_ID);
        createMantecaCallBody.setAnswerUrl(mantecaAnswerUrl);

        updateMantecaCallBody.setState(CallStateEnum.ACTIVE);
        updateMantecaCallBody.setRedirectUrl(mantecaRedirectUrl);

        completeMantecaCallBody.setState(CallStateEnum.COMPLETED);
    }

    @AfterAll
    public void tearDownAfterClass() throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        Cleanup(this, callIdList);
    }

    @Test
    @Order(1)
    public void createCall() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<CreateCallResponse> response = api.createCallWithHttpInfo(BW_ACCOUNT_ID, createCallBody);
        callIdList.add(response.getData().getCallId());

        assertThat(response.getStatusCode(), is(201));
        assertThat(response.getData(), hasProperty("callId", is(instanceOf(String.class))));
        assertThat(response.getData(), hasProperty("accountId", is(BW_ACCOUNT_ID)));
        assertThat(response.getData(), hasProperty("applicationId", is(BW_VOICE_APPLICATION_ID)));
        assertThat(response.getData(), hasProperty("to", is(USER_NUMBER)));
        assertThat(response.getData(), hasProperty("from", is(BW_NUMBER)));
    }

    @Test
    public void createCallBadRequest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        CreateCall badCallRequest = new CreateCall();
        createCallBody.setTo("invalid_number");
        createCallBody.setFrom(BW_NUMBER);
        createCallBody.setApplicationId(BW_VOICE_APPLICATION_ID);
        createCallBody.setAnswerUrl(answerUrl);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createCallWithHttpInfo(BW_ACCOUNT_ID, badCallRequest));

        assertThat(exception.getCode(), is(400));
    }

    @Test
    public void createCallUnauthorized() throws ApiException {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        CreateCall badCallRequest = new CreateCall();
        createCallBody.setTo("invalid_number");
        createCallBody.setFrom(BW_NUMBER);
        createCallBody.setApplicationId(BW_VOICE_APPLICATION_ID);
        createCallBody.setAnswerUrl(answerUrl);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createCallWithHttpInfo(BW_ACCOUNT_ID, badCallRequest));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void createCallForbidden() throws ApiException {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        CreateCall badCallRequest = new CreateCall();
        createCallBody.setTo("invalid_number");
        createCallBody.setFrom(BW_NUMBER);
        createCallBody.setApplicationId(BW_VOICE_APPLICATION_ID);
        createCallBody.setAnswerUrl(answerUrl);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createCallWithHttpInfo(BW_ACCOUNT_ID, badCallRequest));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void getCalls() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<List<CallState>> response = api.listCallsWithHttpInfo(BW_ACCOUNT_ID, USER_NUMBER, BW_NUMBER, null,
                null, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), is(instanceOf(List.class)));
        assertThat(response.getData().get(0), hasProperty("accountId", is(instanceOf(String.class))));
        assertThat(response.getData().get(0), hasProperty("applicationId", is(instanceOf(String.class))));
        assertThat(response.getData().get(0), hasProperty("callId", is(instanceOf(String.class))));
        assertThat(response.getData().get(0), hasProperty("state", is(instanceOf(String.class))));
        assertThat(response.getData().get(0), hasProperty("direction", is(instanceOf(CallDirectionEnum.class))));
        assertThat(response.getData().get(0), hasProperty("startTime", is(instanceOf(OffsetDateTime.class))));
        assertThat(response.getData().get(0), hasProperty("endTime", is(instanceOf(OffsetDateTime.class))));
        assertThat(response.getData().get(0), hasProperty("errorMessage", is(instanceOf(String.class))));
        assertThat(response.getData().get(0), hasProperty("errorId", is(instanceOf(String.class))));

    }

    @Test
    @Order(2)
    public void getCallState() throws ApiException, InterruptedException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        TimeUnit.SECONDS.sleep(40);
        ApiResponse<CallState> response = api.getCallStateWithHttpInfo(BW_ACCOUNT_ID, callIdList.get(0));

        assertThat(response.getStatusCode(), anyOf(is(200), is(404)));
        assertThat(response.getData(), hasProperty("callId", is(instanceOf(String.class))));
        assertThat(response.getData(), hasProperty("state", is(instanceOf(String.class))));
        assertThat(response.getData(), hasProperty("direction", is(CallDirectionEnum.OUTBOUND)));
    }

    @Test
    public void getCallStateUnauthorized() throws ApiException {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.getCallStateWithHttpInfo(BW_ACCOUNT_ID, "not a call id"));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void getCallStateForbidden() throws ApiException {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.getCallStateWithHttpInfo(BW_ACCOUNT_ID, "not a call id"));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void getCallStateNotFound() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.getCallStateWithHttpInfo(BW_ACCOUNT_ID, "not a call id"));

        assertThat(exception.getCode(), is(404));
    }

    @Test
    @Order(3)
    public void updateCall() throws ApiException, InterruptedException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        // Create call
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<CreateCallResponse> createCallResponse = api.createCallWithHttpInfo(BW_ACCOUNT_ID,
                createMantecaCallBody);
        callIdList.add(createCallResponse.getData().getCallId());

        assertThat(createCallResponse.getStatusCode(), is(201));

        // Redirect call to different url
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<Void> updateCallResponse = api.updateCallWithHttpInfo(BW_ACCOUNT_ID,
                createCallResponse.getData().getCallId(), updateMantecaCallBody);

        assertThat(updateCallResponse.getStatusCode(), is(200));

        // Complete call
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<Void> completeCallResponse = api.updateCallWithHttpInfo(BW_ACCOUNT_ID,
                createCallResponse.getData().getCallId(), completeMantecaCallBody);

        assertThat(completeCallResponse.getStatusCode(), is(200));
    }

    @Test
    public void updateCallBadRequest() throws ApiException, InterruptedException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        UpdateCall badRequest = new UpdateCall();
        badRequest.state(null);

        // Create call
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<CreateCallResponse> createCallResponse = api.createCallWithHttpInfo(BW_ACCOUNT_ID,
                createMantecaCallBody);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.updateCallWithHttpInfo(BW_ACCOUNT_ID, createCallResponse.getData().getCallId(),
                        badRequest));

        assertThat(exception.getCode(), is(400));
    }

    @Test
    public void updateCallUnauthorized() throws ApiException {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.updateCallWithHttpInfo(BW_ACCOUNT_ID, testCallId,
                        new UpdateCall().state(CallStateEnum.COMPLETED)));

        assertThat(exception.getCode(), is(401));

    }

    @Test
    public void updateCallForbidden() throws ApiException {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.updateCallWithHttpInfo(BW_ACCOUNT_ID, testCallId,
                        new UpdateCall().state(CallStateEnum.COMPLETED)));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void updateCallNotFound() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.updateCallWithHttpInfo(BW_ACCOUNT_ID, testCallId,
                        new UpdateCall().state(CallStateEnum.COMPLETED)));

        assertThat(exception.getCode(), is(404));
    }

    @Test
    @Order(4)
    public void updateCallBxml() throws ApiException, InterruptedException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        // Create call
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<CreateCallResponse> createCallResponse = api.createCallWithHttpInfo(BW_ACCOUNT_ID,
                createMantecaCallBody);
        callIdList.add(createCallResponse.getData().getCallId());

        assertThat(createCallResponse.getStatusCode(), is(201));

        // Redirect call to different url
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<Void> updateCallResponse = api.updateCallBxmlWithHttpInfo(BW_ACCOUNT_ID,
                createCallResponse.getData().getCallId(), testXmlBody);

        assertThat(updateCallResponse.getStatusCode(), is(204));

        // Complete call
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<Void> completeCallResponse = api.updateCallWithHttpInfo(BW_ACCOUNT_ID,
                createCallResponse.getData().getCallId(), completeMantecaCallBody);

        assertThat(completeCallResponse.getStatusCode(), is(200));
    }

    @Test
    public void updateCallBxmlBadRequest() throws ApiException {

    }

    @Test
    public void updateCallBxmlUnauthorized() throws ApiException {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.updateCallBxmlWithHttpInfo(BW_ACCOUNT_ID, testCallId,
                        testXmlBody));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void updateCallBxmlForbidden() throws ApiException {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.updateCallBxmlWithHttpInfo(BW_ACCOUNT_ID, testCallId,
                        testXmlBody));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void updateCallBxmlNotFound() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.updateCallBxmlWithHttpInfo(BW_ACCOUNT_ID, testCallId,
                        testXmlBody));

        assertThat(exception.getCode(), is(404));
    }
}
