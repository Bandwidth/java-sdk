package com.bandwidth.sdk.api;

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
import com.bandwidth.sdk.model.UpdateCall;
import com.bandwidth.sdk.model.CallTranscription;
import com.bandwidth.sdk.model.CallTranscriptionMetadata;
import com.bandwidth.sdk.model.CallTranscriptionResponse;
import com.bandwidth.sdk.model.VoiceApiError;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)


/**
 * API tests for TranscriptionsApi
 */

public class TranscriptionsApiTest {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final CallsApi callsApi = new CallsApi(defaultClient);
    private final TranscriptionsApi transcriptionsApi = new TranscriptionsApi(defaultClient);


    private static CreateCall createMantecaCallBody = new CreateCall();
    private static UpdateCall completeMantecaCallBody = new UpdateCall();
    private static URI mantecaAnswerUrl;
    private static String bxmlBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Bxml><SpeakSentence locale=\"en_US\" gender=\"female\" voice=\"susan\">This is a bxml start transcription test.</SpeakSentence><StartTranscription tracks=\"outbound\"></StartTranscription><SpeakSentence voice=\"bridget\">Ideally this part is being transcribed.</SpeakSentence><Pause duration=\"3\"/></Bxml>";
    private static int TEST_SLEEP = 10;
    private static int TEST_SLEEP_LONG = 60;


    @Test
    public void getAndDeleteRealTimeTranscriptionsTest() throws ApiException, InterruptedException, URISyntaxException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        mantecaAnswerUrl = new URI(MANTECA_BASE_URL + "/bxml/pause");

        createMantecaCallBody.setFrom(MANTECA_ACTIVE_NUMBER);
        createMantecaCallBody.setTo(MANTECA_IDLE_NUMBER);
        createMantecaCallBody.setApplicationId(MANTECA_APPLICATION_ID);
        createMantecaCallBody.setAnswerUrl(mantecaAnswerUrl);
        completeMantecaCallBody.setState(CallStateEnum.COMPLETED);


        // This is just creating the call, modifying with StartTranscript, and ending it so we can test the transcription below.

        ApiResponse<CreateCallResponse> createCallResponse = callsApi.createCallWithHttpInfo(BW_ACCOUNT_ID, createMantecaCallBody);


        String callId = createCallResponse.getData().getCallId();
        assertThat(createCallResponse.getStatusCode(), is(201));


        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        // Redirect call to different url
        ApiResponse<Void> updateCallResponse = callsApi.updateCallBxmlWithHttpInfo(BW_ACCOUNT_ID, callId, bxmlBody);

        assertThat(updateCallResponse.getStatusCode(), is(204));

        // Complete call
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        ApiResponse<Void> completeCallResponse = callsApi.updateCallWithHttpInfo(BW_ACCOUNT_ID,
                createCallResponse.getData().getCallId(), completeMantecaCallBody);

        assertThat(completeCallResponse.getStatusCode(), is(200));


        TimeUnit.SECONDS.sleep(TEST_SLEEP_LONG);
	// The Transcriptions API tests start here
        ApiResponse<List<CallTranscriptionMetadata>> listRealTimeTranscriptionResponse = transcriptionsApi.listRealTimeTranscriptionsWithHttpInfo(BW_ACCOUNT_ID, createCallResponse.getData().getCallId());

        String transcriptionId = listRealTimeTranscriptionResponse.getData().get(0).getTranscriptionId();
        TimeUnit.SECONDS.sleep(TEST_SLEEP);

        ApiResponse<CallTranscriptionResponse> getRealTimeTranscriptionResponse = transcriptionsApi.getRealTimeTranscriptionWithHttpInfo(BW_ACCOUNT_ID, callId, transcriptionId);

        assertThat(getRealTimeTranscriptionResponse.getStatusCode(), is(200));
        assertThat(getRealTimeTranscriptionResponse.getData(), hasProperty("transcriptionId", is(instanceOf(String.class))));
        assertThat(getRealTimeTranscriptionResponse.getData().getTracks().get(0), is(instanceOf(CallTranscription.class)));
        assertThat(getRealTimeTranscriptionResponse.getData().getTracks().get(0).getTrack(), is(instanceOf(CallTranscription.TrackEnum.class)));
        assertThat(getRealTimeTranscriptionResponse.getData().getTracks().get(0).getTranscript(), is(instanceOf(String.class)));
        assertThat(getRealTimeTranscriptionResponse.getData().getTracks().get(0).getConfidence(), is(0.0));


        ApiResponse<Void> deleteRealTimeTranscriptionResponse = transcriptionsApi.deleteRealTimeTranscriptionWithHttpInfo(BW_ACCOUNT_ID, createCallResponse.getData().getCallId(), transcriptionId);

        assertThat(deleteRealTimeTranscriptionResponse.getStatusCode(), is(200)); // This should be 204 but there is currently a bug in the API to be fixed in VAPI-1863

    }
}


