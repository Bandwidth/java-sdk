package org.openapitools.client.api;

import org.openapitools.client.ApiResponse;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.CallbackMethodEnum;
import org.openapitools.client.model.CreateCall;
import org.openapitools.client.model.CreateCallResponse;
import org.openapitools.client.model.MachineDetectionConfiguration;
import org.openapitools.client.model.MachineDetectionModeEnum;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.rules.ExpectedException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.matchesRegex;
import static org.hamcrest.Matchers.contains;

import static org.openapitools.client.utils.TestingEnvironmentVariables.*;

public class CallsApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final CallsApi api = new CallsApi(defaultClient);

    private List<String> callIdList;
    private String callId;
    private static URI answerUrl;
    private static URI fallbackUrl;
    private static URI disconnectUrl;
    private static URI machineDetectionUrl;
    private static URI machineDetectionCompleteUrl;
    private CallbackMethodEnum callbackMethod = CallbackMethodEnum.POST;
    private String testCallId = "Call-Id";
    private String testXmlBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Bxml><SpeakSentence locale=\"en_US\" gender=\"female\" voice=\"susan\">This is a test bxml response</SpeakSentence><Pause duration=\"3\"/></Bxml>";
    private int TEST_SLEEP = 3;
    private int TEST_SLEEP_LONG = 15;

    @BeforeClass
    public static void setupBeforeClass() throws URISyntaxException {
        System.out.println("@BeforeClass");
        answerUrl = new URI(BASE_CALLBACK_URL);
        fallbackUrl = new URI("https://www.myFallbackServer.com/webhooks/answer");
        disconnectUrl = new URI("https://myServer.com/bandwidth/webhooks/disconnectUrl");
        machineDetectionUrl = new URI("https://myServer.com/bandwidth/webhooks/machineDetectionComplete");
        machineDetectionCompleteUrl = new URI(
                "https://myFallbackServer.com/bandwidth/webhooks/machineDetectionComplete");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("@AfterClass");
    }

    /**
     * Validates that an exception matches the expected format
     *
     * @param context            Exception to validate
     * @param expectedException  Expected exception type
     * @param expectedStatusCode Expected Status Code
     */
    public void assertApiException(ApiException context, ApiException expectedException, Integer expectedStatusCode) {

    }

    @Test
    @Order(1)
    public void createCall() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        System.out.println("Answer URL: " + this.answerUrl);
        MachineDetectionConfiguration machineDetection = new MachineDetectionConfiguration();
        machineDetection.setMode(MachineDetectionModeEnum.ASYNC);
        machineDetection.setDetectionTimeout(15.0);
        machineDetection.setSilenceTimeout(10.0);
        machineDetection.setSpeechThreshold(10.0);
        machineDetection.setSpeechEndThreshold(5.0);
        machineDetection.setMachineSpeechEndThreshold(5.0);
        machineDetection.setDelayResult(false);
        machineDetection.setCallbackUrl(this.machineDetectionUrl);
        machineDetection.setCallbackMethod(this.callbackMethod);
        machineDetection.setUsername("mySecretUsername");
        machineDetection.setPassword("mySecretPassword1!");
        machineDetection.setFallbackUrl(this.machineDetectionCompleteUrl);
        machineDetection.setFallbackMethod(this.callbackMethod);
        machineDetection.setFallbackUsername("mySecretUsername");
        machineDetection.setFallbackPassword("mySecretPassword1!");

        CreateCall createCallBody = new CreateCall();
        createCallBody.setTo(USER_NUMBER);
        createCallBody.setFrom(BW_NUMBER);
        createCallBody.setApplicationId(BW_VOICE_APPLICATION_ID);
        createCallBody.setAnswerUrl(this.answerUrl);
        createCallBody.setAnswerMethod(this.callbackMethod);
        createCallBody.setUsername("mySecretUsername");
        createCallBody.setPassword("mySecretPassword1!");
        createCallBody.setAnswerFallbackUrl(this.fallbackUrl);
        createCallBody.setAnswerFallbackMethod(this.callbackMethod);
        createCallBody.setFallbackUsername("mySecretUsername");
        createCallBody.setFallbackPassword("mySecretPassword1!");
        createCallBody.setDisconnectUrl(this.disconnectUrl);
        createCallBody.setDisconnectMethod(this.callbackMethod);
        createCallBody.setCallTimeout(30.0);
        createCallBody.setCallbackTimeout(15.0);
        createCallBody.setMachineDetection(machineDetection);
        createCallBody.setPriority(5);
        createCallBody.setTag("tag_example");

        System.out.println(createCallBody.toString());

        // ApiResponse<CreateCallResponse> response =
        // api.createCallWithHttpInfo(BW_ACCOUNT_ID, createCallBody);
        // this.callIdList.add(response.getData().getCallId());

        // assertThat(response.getStatusCode(), is(201));
    }

    @Test
    public void createCallBadREquest() throws ApiException {

    }

    @Test
    public void createCallUnauthorized() throws ApiException {

    }

    @Test
    public void createCallForbidden() throws ApiException {

    }

    @Test
    public void getCallState() throws ApiException {

    }

    @Test
    public void getCallStateUnauthorized() throws ApiException {

    }

    @Test
    public void getCallStateForbidden() throws ApiException {

    }

    @Test
    public void getCallStateNotFound() throws ApiException {

    }

    @Test
    public void updateCall() throws ApiException {

    }

    @Test
    public void updateCallBadRequest() throws ApiException {

    }

    @Test
    public void updateCallUnauthorized() throws ApiException {

    }

    @Test
    public void updateCallForbidden() throws ApiException {

    }

    @Test
    public void updateCallNotFound() throws ApiException {

    }

    @Test
    public void updateCallBxml() throws ApiException {

    }

    @Test
    public void updateCallBxmlBadRequest() throws ApiException {

    }

    @Test
    public void updateCallBxmlUnauthorized() throws ApiException {

    }

    @Test
    public void updateCallBxmlForbidden() throws ApiException {

    }

    @Test
    public void updateCallBxmlNotFound() throws ApiException {

    }
}
