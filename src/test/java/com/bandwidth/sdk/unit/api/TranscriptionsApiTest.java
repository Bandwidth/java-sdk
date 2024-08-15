package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.TranscriptionsApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CallTranscription;
import com.bandwidth.sdk.model.CallTranscriptionDetectedLanguageEnum;
import com.bandwidth.sdk.model.CallTranscriptionMetadata;
import com.bandwidth.sdk.model.CallTranscriptionResponse;
import com.bandwidth.sdk.model.CallTranscriptionTrackEnum;

import java.util.List;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

@SuppressWarnings("null")
public class TranscriptionsApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static TranscriptionsApi api = new TranscriptionsApi(defaultClient);

    private static String callId = "c-1234";
    private static String transcriptionId = "t-1234";

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testListRealTimeTranscriptions() throws ApiException {
        ApiResponse<List<CallTranscriptionMetadata>> response = api
                .listRealTimeTranscriptionsWithHttpInfo(BW_ACCOUNT_ID, callId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().get(0), instanceOf(CallTranscriptionMetadata.class));
        assertThat(response.getData().get(0).getTranscriptionId(), instanceOf(String.class));
        assertThat(response.getData().get(0).getTranscriptionUrl(), instanceOf(String.class));
        assertThat(response.getData().get(0).getTranscriptionName(), instanceOf(String.class));
    }

    @Test
    public void testGetRealTimeTranscription() throws ApiException {
        ApiResponse<CallTranscriptionResponse> response = api.getRealTimeTranscriptionWithHttpInfo(BW_ACCOUNT_ID,
                callId,
                transcriptionId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(CallTranscriptionResponse.class));
        assertThat(response.getData().getAccountId().length(), is(7));
        assertThat(response.getData().getCallId().length(), is(47));
        assertThat(response.getData().getTranscriptionId(), instanceOf(String.class));
        assertThat(response.getData().getTracks(), instanceOf(List.class));
        assertThat(response.getData().getTracks().get(0), instanceOf(CallTranscription.class));
        assertThat(response.getData().getTracks().get(0).getDetectedLanguage(),
                instanceOf(CallTranscriptionDetectedLanguageEnum.class));
        assertThat(response.getData().getTracks().get(0).getTrack(), instanceOf(CallTranscriptionTrackEnum.class));
        assertThat(response.getData().getTracks().get(0).getTranscript(), instanceOf(String.class));
        assertThat(response.getData().getTracks().get(0).getConfidence(), instanceOf(Double.class));
    }

    @Test
    public void testDeleteRealTimeTranscription() throws ApiException {
        ApiResponse<Void> response = api.deleteRealTimeTranscriptionWithHttpInfo(BW_ACCOUNT_ID, callId,
                transcriptionId);

        // This is a bug in the API, it should return 204. VAPI-1863 should fix this.
        assertThat(response.getStatusCode(), is(200));
    }
}
