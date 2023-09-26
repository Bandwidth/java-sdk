package com.bandwidth.sdk.api;

import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.model.CallRecordingMetadata;
import com.bandwidth.sdk.model.CallStateEnum;
import com.bandwidth.sdk.model.CreateCall;
import com.bandwidth.sdk.model.CreateCallResponse;
import com.bandwidth.sdk.model.RecordingStateEnum;
import com.bandwidth.sdk.model.TranscribeRecording;
import com.bandwidth.sdk.model.TranscriptionList;
import com.bandwidth.sdk.model.UpdateCall;
import com.bandwidth.sdk.model.UpdateCallRecording;
import com.bandwidth.sdk.utils.MantecaStatusResponse;

import com.google.gson.Gson;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static com.bandwidth.sdk.utils.CallCleanup.Cleanup;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RecordingsApiTest {
    public ApiClient defaultClient = Configuration.getDefaultApiClient();
    public HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    public final CallsApi callsApi = new CallsApi(defaultClient);
    public final RecordingsApi recordingsApi = new RecordingsApi(defaultClient);

    private static final OkHttpClient mantecaClient = new OkHttpClient();
    public static final MediaType jsonMediaType = MediaType.get("application/json; charset=utf-8");

    public static TranscribeRecording transcribeRecording = new TranscribeRecording();

    private static String testId;
    private static URI answerUrl;
    private static String callId;
    private static String recordingId;
    private static int TEST_SLEEP = 3;
    private static int MAX_RETRIES = 40;

    private static CreateCall createCallBody = new CreateCall();

    @BeforeAll
    public static void setUpBeforeClass() throws URISyntaxException {
        // answerUrl = new URI(MANTECA_BASE_URL + "/bxml/startRecording");
        answerUrl = new URI(MANTECA_BASE_URL + "/bxml/startLongRecording");
    }

    @AfterAll
    public void tearDownAfterClass() throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        Cleanup(this, callId);
    }

    static final String constructMantecaJsonBody() {
        return "{\"os\": \"" + OPERATING_SYSTEM + "\", \"language\":\"JAVA" + JAVA_VERSION + "_" + DISTRIBUTION
                + "\", \"type\":\"CALL\"}";
    }

    public MantecaStatusResponse getTestStatus(String mantecaTestId) throws Exception {
        try {
            // Setup the test with Manteca
            Request mantecaStatusRequest = new Request.Builder()
                    .url(MANTECA_STATUS_URL + mantecaTestId)
                    .build();
            Call mantecaStatusApiCall = mantecaClient.newCall(mantecaStatusRequest);
            Response mantecaStatusResponse = mantecaStatusApiCall.execute();

            Gson gson = new Gson();
            MantecaStatusResponse mantecaStatus = gson.fromJson(
                    mantecaStatusResponse.peekBody(2048).string(),
                    MantecaStatusResponse.class);
            if (mantecaStatusResponse.isSuccessful()) {
                return mantecaStatus;
            } else {
                System.out.println(mantecaStatusResponse.body().string());
                throw new Exception(
                        "Received HTTP " + String.valueOf(mantecaStatusResponse.code()) + " status code from Manteca");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new Exception("Failed to get test status from Manteca, aborting test run :(");
        }
    }

    @Test
    @Order(1)
    public void testCallRecordingAndTranscription() throws Exception {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        String mantecaJsonBody = constructMantecaJsonBody();
        RequestBody mantecaRequestBody = RequestBody.create(mantecaJsonBody, jsonMediaType);

        try {
            // Setup the test with Manteca
            Request mantecaRequest = new Request.Builder()
                    .url(MANTECA_BASE_URL + "/tests")
                    .post(mantecaRequestBody)
                    .build();
            Call mantecaApiCall = mantecaClient.newCall(mantecaRequest);
            testId = mantecaApiCall.execute().body().string();
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new Exception("Failed to initialize conference tests with Manteca, aborting test run :(");
        }

        createCallBody.setTo(MANTECA_IDLE_NUMBER);
        createCallBody.setFrom(MANTECA_ACTIVE_NUMBER);
        createCallBody.setApplicationId(MANTECA_APPLICATION_ID);
        createCallBody.setAnswerUrl(answerUrl);
        createCallBody.setTag(testId);

        // Create Call
        CreateCallResponse callResponse = callsApi.createCall(BW_ACCOUNT_ID, createCallBody);
        callId = callResponse.getCallId();

        // Update Recording
        TimeUnit.SECONDS.sleep(TEST_SLEEP * 2);
        UpdateCallRecording updateRecording = new UpdateCallRecording();
        updateRecording.setState(RecordingStateEnum.PAUSED);

        ApiResponse<Void> pauseRecordingResponse = recordingsApi.updateCallRecordingStateWithHttpInfo(BW_ACCOUNT_ID,
                callId, updateRecording);
        assertThat(pauseRecordingResponse.getStatusCode(), is(200));

        // Update Recording
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        updateRecording.setState(RecordingStateEnum.RECORDING);

        ApiResponse<Void> resumeRecordingResponse = recordingsApi.updateCallRecordingStateWithHttpInfo(BW_ACCOUNT_ID,
                callId, updateRecording);
        assertThat(resumeRecordingResponse.getStatusCode(), is(200));

        // Terminate the call
        UpdateCall updateCall = new UpdateCall();
        updateCall.setState(CallStateEnum.COMPLETED);
        ApiResponse<Void> updateCallResponse = callsApi.updateCallWithHttpInfo(BW_ACCOUNT_ID, callId,
                updateCall);
        assertThat(updateCallResponse.getStatusCode(), is(200));

        // Make sure its been recorded by fetching the status from Manteca
        int x = 0;
        Boolean recordingStatus = false;
        while (recordingStatus != true && x < MAX_RETRIES) {
            TimeUnit.SECONDS.sleep(TEST_SLEEP);
            recordingStatus = getTestStatus(testId).callRecorded;
            x++;
        }
        assertThat(recordingStatus, is(true));

        // Validate the recording metadata endpoint
        ApiResponse<List<CallRecordingMetadata>> listRecordingMetadataResponse = recordingsApi
                .listCallRecordingsWithHttpInfo(BW_ACCOUNT_ID, callId);
        assertThat(listRecordingMetadataResponse.getStatusCode(), is(200));
        recordingId = listRecordingMetadataResponse.getData().get(0).getRecordingId();

        ApiResponse<CallRecordingMetadata> recordingMetadataResponse = recordingsApi.getCallRecordingWithHttpInfo(
                BW_ACCOUNT_ID, callId, recordingId);
        assertThat(recordingMetadataResponse.getStatusCode(), is(200));

        // Pass the tag to transcribeRecording to receive the callback
        transcribeRecording.callbackUrl(new URI(MANTECA_BASE_URL + "/transcriptions"));
        transcribeRecording.setTag(testId);

        ApiResponse<Void> requestTranscriptionResponse = recordingsApi.transcribeCallRecordingWithHttpInfo(
                BW_ACCOUNT_ID, callId, recordingId, transcribeRecording);
        assertThat(requestTranscriptionResponse.getStatusCode(), is(204));

        // Make sure its been transcribed by fetching status from manteca
        int i = 0;
        Boolean transcriptionStatus = false;
        while (transcriptionStatus != true && i < MAX_RETRIES) {
            TimeUnit.SECONDS.sleep(TEST_SLEEP);
            transcriptionStatus = getTestStatus(testId).callTranscribed;
            i++;
        }
        assertThat(transcriptionStatus, is(true));

        // Validate the transcription metadata endpoint
        ApiResponse<TranscriptionList> listTranscriptionsResponse = recordingsApi
                .getCallTranscriptionWithHttpInfo(BW_ACCOUNT_ID, callId, recordingId);
        assertThat(listTranscriptionsResponse.getStatusCode(), is(200));

        // Delete transcription
        ApiResponse<Void> deleteTranscriptionResponse = recordingsApi.deleteCallTranscriptionWithHttpInfo(BW_ACCOUNT_ID,
                callId, recordingId);
        assertThat(deleteTranscriptionResponse.getStatusCode(), is(204));

        // Delete recording media
        ApiResponse<Void> deleteRecordingMediaResponse = recordingsApi.deleteRecordingMediaWithHttpInfo(BW_ACCOUNT_ID,
                callId, recordingId);
        assertThat(deleteRecordingMediaResponse.getStatusCode(), is(204));

        // Delete recording metadata
        ApiResponse<Void> deleteRecordingMetadataResponse = recordingsApi.deleteRecordingWithHttpInfo(BW_ACCOUNT_ID,
                callId, recordingId);
        assertThat(deleteRecordingMetadataResponse.getStatusCode(), is(204));
    }

    @Test
    public void testGetAccountRecordings() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<List<CallRecordingMetadata>> response = recordingsApi
                .listAccountCallRecordingsWithHttpInfo(BW_ACCOUNT_ID, null, null, null,
                        null);

        assertThat(response.getStatusCode(), is(200));
    }

    @Test
    public void testGetAccountRecordingsUnauthorized() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.listAccountCallRecordingsWithHttpInfo(BW_ACCOUNT_ID,
                        null, null, null, null));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testGetAccountRecordingsForbidden() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.listAccountCallRecordingsWithHttpInfo(BW_ACCOUNT_ID,
                        null, null, null, null));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void testRecordingNotFound() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.getCallRecording(BW_ACCOUNT_ID, "not a call", "not a recording"));

        assertThat(exception.getCode(), is(404));
    }

    @Test
    public void testUnauthorizedGetRecording() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.getCallRecording(BW_ACCOUNT_ID, callId, recordingId));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testForbiddenGetRecording() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.getCallRecording(BW_ACCOUNT_ID, callId, recordingId));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void testUnauthorizedDeleteRecording() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteRecording(BW_ACCOUNT_ID, callId, recordingId));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testForbiddenDeleteRecording() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteRecording(BW_ACCOUNT_ID, callId, recordingId));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void testUnauthorizedDownloadRecording() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.downloadCallRecording(BW_ACCOUNT_ID, callId,
                        recordingId));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testForbiddenDownloadRecording() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.downloadCallRecording(BW_ACCOUNT_ID, callId,
                        recordingId));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void testUnauthorizedDeleteRecordingMedia() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteRecording(BW_ACCOUNT_ID, callId, recordingId));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testForbiddenDeleteRecordingMedia() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteRecording(BW_ACCOUNT_ID, callId, recordingId));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void testUnauthorizedGetTranscription() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteCallTranscription(BW_ACCOUNT_ID, callId,
                        recordingId));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testForbiddenGetTranscription() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteCallTranscription(BW_ACCOUNT_ID, callId,
                        recordingId));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void testUnauthorizedCreateTranscriptionRequest() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.transcribeCallRecording(BW_ACCOUNT_ID, callId,
                        recordingId, transcribeRecording));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testForbiddenCreateTranscriptionRequest() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.transcribeCallRecording(BW_ACCOUNT_ID, callId,
                        recordingId, transcribeRecording));

        assertThat(exception.getCode(), is(403));
    }

    @Test
    public void testUnauthorizedDeleteTranscription() throws ApiException {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteCallTranscription(BW_ACCOUNT_ID, callId,
                        recordingId));

        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void testForbiddenDeleteTranscription() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> recordingsApi.deleteCallTranscription(BW_ACCOUNT_ID, callId,
                        recordingId));

        assertThat(exception.getCode(), is(403));
    }
}
