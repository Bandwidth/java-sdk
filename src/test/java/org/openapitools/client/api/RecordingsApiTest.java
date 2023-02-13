package org.openapitools.client.api;

import org.openapitools.client.ApiResponse;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.CallRecordingMetadata;
import org.openapitools.client.model.CallStateEnum;
import org.openapitools.client.model.CreateCall;
import org.openapitools.client.model.CreateCallResponse;
import org.openapitools.client.model.RecordingStateEnum;
import org.openapitools.client.model.TranscribeRecording;
import org.openapitools.client.model.TranscriptionList;
import org.openapitools.client.model.TranscriptionMetadata;
import org.openapitools.client.model.UpdateCall;
import org.openapitools.client.model.UpdateCallRecording;
import org.openapitools.client.utils.MantecaStatusResponse;

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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.openapitools.client.utils.TestingEnvironmentVariables.*;
import static org.openapitools.client.utils.CallCleanup.Cleanup;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RecordingsApiTest {
    public ApiClient defaultClient = Configuration.getDefaultApiClient();
    public HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    public final CallsApi callsApi = new CallsApi(defaultClient);
    public final RecordingsApi recordingsApi = new RecordingsApi(defaultClient);

    private static final OkHttpClient mantecaClient = new OkHttpClient();
    public static final MediaType jsonMediaType = MediaType.get("application/json; charset=utf-8");

    private static String testId;
    private static URI answerUrl;
    private static URI updateAnswerUrl;
    private static List<String> callIdList = new ArrayList<String>();
    private static int TEST_SLEEP = 3;
    private static int TEST_SLEEP_LONG = 10;
    private static int MAX_RETRIES = 40;

    private static CreateCall createCallBody = new CreateCall();

    @BeforeAll
    public static void setUpBeforeClass() throws URISyntaxException {
        // answerUrl = new URI(MANTECA_BASE_URL + "/bxml/startRecording");
        answerUrl = new URI(MANTECA_BASE_URL + "/bxml/startLongRecording");
        updateAnswerUrl = new URI(MANTECA_BASE_URL + "/bxml/startLongRecording");
    }

    @AfterAll
    public void tearDownAfterClass() throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        Cleanup(this, callIdList);
    }

    static final String constructMantecaJsonBody(String os, String language) {
        return "{\"os\": \"" + os + "\", \"language\":\"JAVA" + JAVA_VERSION + "\", \"type\":\"CALL\"}";
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

        String mantecaJsonBody = constructMantecaJsonBody(OPERATING_SYSTEM, JAVA_VERSION);
        RequestBody mantecaRequestBody = RequestBody.create(mantecaJsonBody, jsonMediaType);

        try {
            // Setup the test with Manteca
            Request mantecaRequest = new Request.Builder()
                    .url(MANTECA_BASE_URL + "/tests")
                    .post(mantecaRequestBody)
                    .build();
            Call mantecaApiCall = mantecaClient.newCall(mantecaRequest);
            testId = mantecaApiCall.execute().body().string().replace("\"", "");
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new Exception("Failed to initialize conference tests with Manteca, aborting test run :(");
        }

        createCallBody.setTo(MANTECA_IDLE_NUMBER);
        createCallBody.setFrom(MANTECA_ACTIVE_NUMBER);
        createCallBody.setApplicationId(MANTECA_APPLICATION_ID);
        createCallBody.setAnswerUrl(answerUrl);
        createCallBody.setTag(testId);

        System.out.println(testId);

        // Create Call
        CreateCallResponse callResponse = callsApi.createCall(BW_ACCOUNT_ID, createCallBody);
        System.out.println(callResponse.getCallId());
        String shortRecordingCallId = callResponse.getCallId();
        callIdList.add(callResponse.getCallId());

        // Update Recording
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        UpdateCallRecording updateRecording = new UpdateCallRecording();
        updateRecording.setState(RecordingStateEnum.PAUSED);

        ApiResponse<Void> pauseRecordingResponse = recordingsApi.updateCallRecordingStateWithHttpInfo(BW_ACCOUNT_ID,
                shortRecordingCallId, updateRecording);
        assertThat(pauseRecordingResponse.getStatusCode(), is(200));

        // Update Recording
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        updateRecording.setState(RecordingStateEnum.RECORDING);

        ApiResponse<Void> resumeRecordingResponse = recordingsApi.updateCallRecordingStateWithHttpInfo(BW_ACCOUNT_ID,
                shortRecordingCallId, updateRecording);
        assertThat(resumeRecordingResponse.getStatusCode(), is(200));

        // Terminate the call
        UpdateCall updateCall = new UpdateCall();
        updateCall.setState(CallStateEnum.COMPLETED);
        ApiResponse<Void> updateCallResponse = callsApi.updateCallWithHttpInfo(BW_ACCOUNT_ID, shortRecordingCallId,
                updateCall);
        assertThat(updateCallResponse.getStatusCode(), is(200));

        // Make sure its been recorded by fetching the status from Manteca
        Boolean testRecordingStatus = false;
        for (int i = 0; i < MAX_RETRIES; i++) {
            while (testRecordingStatus != true) {
                TimeUnit.SECONDS.sleep(TEST_SLEEP);
                testRecordingStatus = getTestStatus(testId).callRecorded;
            }
        }
        assertThat(testRecordingStatus, is(true));

        // Validate the recording metadata endpoint
        ApiResponse<List<CallRecordingMetadata>> listRecordingMetadataResponse = recordingsApi
                .listCallRecordingsWithHttpInfo(BW_ACCOUNT_ID, shortRecordingCallId);
        assertThat(listRecordingMetadataResponse.getStatusCode(), is(200));
        String shortRecordingId = listRecordingMetadataResponse.getData().get(0).getRecordingId();

        ApiResponse<CallRecordingMetadata> recordingMetadataResponse = recordingsApi.getCallRecordingWithHttpInfo(
                BW_ACCOUNT_ID, shortRecordingCallId, shortRecordingId);
        assertThat(recordingMetadataResponse.getStatusCode(), is(200));

        // Create a transcription request for the recording
        TranscribeRecording transcribeRecordingBody = new TranscribeRecording();
        transcribeRecordingBody.callbackUrl(new URI(MANTECA_BASE_URL + "/transcriptions"));
        transcribeRecordingBody.setTag(testId);

        ApiResponse<Void> requestTranscriptionResponse = recordingsApi.transcribeCallRecordingWithHttpInfo(
                BW_ACCOUNT_ID, shortRecordingCallId, shortRecordingId, transcribeRecordingBody);
        assertThat(requestTranscriptionResponse.getStatusCode(), is(204));

        // Make sure its been transcribed by fetching status from manteca
        Boolean testTranscriptionStatus = false;
        for (int i = 0; i < MAX_RETRIES; i++) {
            while (testTranscriptionStatus != true) {
                TimeUnit.SECONDS.sleep(TEST_SLEEP);
                testTranscriptionStatus = getTestStatus(testId).callTranscribed;
            }
        }
        assertThat(testTranscriptionStatus, is(true));

        // Validate the transcription metadata endpoint
        ApiResponse<TranscriptionList> listTranscriptionsResponse = recordingsApi
                .getCallTranscriptionWithHttpInfo(BW_ACCOUNT_ID, shortRecordingCallId, shortRecordingId);
        assertThat(listTranscriptionsResponse.getStatusCode(), is(200));

        // Delete transcription
        ApiResponse<Void> deleteTranscriptionResponse = recordingsApi.deleteCallTranscriptionWithHttpInfo(BW_ACCOUNT_ID,
                shortRecordingCallId, shortRecordingId);
        assertThat(deleteTranscriptionResponse.getStatusCode(), is(204));

        // Delete recording media
        ApiResponse<Void> deleteRecordingMediaResponse = recordingsApi.deleteRecordingMediaWithHttpInfo(BW_ACCOUNT_ID,
                shortRecordingCallId, shortRecordingId);
        assertThat(deleteRecordingMediaResponse.getStatusCode(), is(204));

        // Delete recording metadata
        ApiResponse<Void> deleteRecordingMetadataResponse = recordingsApi.deleteRecordingWithHttpInfo(BW_ACCOUNT_ID,
                shortRecordingCallId, shortRecordingId);
        assertThat(deleteRecordingMetadataResponse.getStatusCode(), is(204));
    }
}
