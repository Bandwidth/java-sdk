package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.RecordingsApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CallDirectionEnum;
import com.bandwidth.sdk.model.CallRecordingMetadata;
import com.bandwidth.sdk.model.FileFormatEnum;
import com.bandwidth.sdk.model.RecordingStateEnum;
import com.bandwidth.sdk.model.RecordingTranscriptionMetadata;
import com.bandwidth.sdk.model.UpdateCallRecording;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import java.io.File;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("null")
public class RecordingsApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static RecordingsApi api = new RecordingsApi(defaultClient);

    private static String callId = "c-1234";
    private static String recordingId = "r-1234";

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testUpdateCallRecordingState() throws ApiException {
        UpdateCallRecording updateCallRecording = new UpdateCallRecording()
                .state(RecordingStateEnum.PAUSED);
        ApiResponse<Void> response = api.updateCallRecordingStateWithHttpInfo(BW_ACCOUNT_ID, callId,
                updateCallRecording);

        assertThat(response.getStatusCode(), is(200));
    }

    @Test
    public void testListAccountCallRecordings() throws ApiException {
        ApiResponse<List<CallRecordingMetadata>> response = api.listAccountCallRecordingsWithHttpInfo(BW_ACCOUNT_ID,
                null, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().get(0), instanceOf(CallRecordingMetadata.class));
        assertThat(response.getData().get(0).getApplicationId().length(), is(36));
        assertThat(response.getData().get(0).getAccountId().length(), is(7));
        assertThat(response.getData().get(0).getCallId().length(), is(47));
        assertThat(response.getData().get(0).getParentCallId().length(), is(47));
        assertThat(response.getData().get(0).getRecordingId().length(), is(47));
        assertThat(response.getData().get(0).getTo().length(), is(12));
        assertThat(response.getData().get(0).getFrom().length(), is(12));
        assertThat(response.getData().get(0).getTransferCallerId().length(), is(12));
        assertThat(response.getData().get(0).getTransferTo().length(), is(12));
        assertThat(response.getData().get(0).getDuration(), instanceOf(String.class));
        assertThat(response.getData().get(0).getDirection(), instanceOf(CallDirectionEnum.class));
        assertThat(response.getData().get(0).getChannels(), instanceOf(Integer.class));
        assertThat(response.getData().get(0).getStartTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getEndTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getFileFormat(), instanceOf(FileFormatEnum.class));
        assertThat(response.getData().get(0).getStatus(), instanceOf(String.class));
        assertThat(response.getData().get(0).getMediaUrl(), instanceOf(URI.class));
        assertThat(response.getData().get(0).getTranscription(), instanceOf(RecordingTranscriptionMetadata.class));
        assertThat(response.getData().get(0).getTranscription().getId().length(), is(38));
        assertThat(response.getData().get(0).getTranscription().getStatus(), instanceOf(String.class));
        assertThat(response.getData().get(0).getTranscription().getCompletedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getTranscription().getUrl(), instanceOf(URI.class));
        assertThat(response.getData().get(0).getRecordingName(), instanceOf(String.class));
    }

    @Test
    public void testListCallRecordings() throws ApiException {
        ApiResponse<List<CallRecordingMetadata>> response = api.listCallRecordingsWithHttpInfo(BW_ACCOUNT_ID, callId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().get(0), instanceOf(CallRecordingMetadata.class));
        assertThat(response.getData().get(0).getApplicationId().length(), is(36));
        assertThat(response.getData().get(0).getAccountId().length(), is(7));
        assertThat(response.getData().get(0).getCallId().length(), is(47));
        assertThat(response.getData().get(0).getParentCallId().length(), is(47));
        assertThat(response.getData().get(0).getRecordingId().length(), is(47));
        assertThat(response.getData().get(0).getTo().length(), is(12));
        assertThat(response.getData().get(0).getFrom().length(), is(12));
        assertThat(response.getData().get(0).getTransferCallerId().length(), is(12));
        assertThat(response.getData().get(0).getTransferTo().length(), is(12));
        assertThat(response.getData().get(0).getDuration(), instanceOf(String.class));
        assertThat(response.getData().get(0).getDirection(), instanceOf(CallDirectionEnum.class));
        assertThat(response.getData().get(0).getChannels(), instanceOf(Integer.class));
        assertThat(response.getData().get(0).getStartTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getEndTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getFileFormat(), instanceOf(FileFormatEnum.class));
        assertThat(response.getData().get(0).getStatus(), instanceOf(String.class));
        assertThat(response.getData().get(0).getMediaUrl(), instanceOf(URI.class));
        assertThat(response.getData().get(0).getTranscription(), instanceOf(RecordingTranscriptionMetadata.class));
        assertThat(response.getData().get(0).getTranscription().getId().length(), is(38));
        assertThat(response.getData().get(0).getTranscription().getStatus(), instanceOf(String.class));
        assertThat(response.getData().get(0).getTranscription().getCompletedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getTranscription().getUrl(), instanceOf(URI.class));
        assertThat(response.getData().get(0).getRecordingName(), instanceOf(String.class));
    }

    @Test
    @Disabled // Prism Error
    public void testGetCallRecording() throws ApiException {
        ApiResponse<CallRecordingMetadata> response = api.getCallRecordingWithHttpInfo(BW_ACCOUNT_ID, callId,
                recordingId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(CallRecordingMetadata.class));
        assertThat(response.getData().getApplicationId().length(), is(36));
        assertThat(response.getData().getAccountId().length(), is(7));
        assertThat(response.getData().getCallId().length(), is(47));
        assertThat(response.getData().getParentCallId().length(), is(47));
        assertThat(response.getData().getRecordingId().length(), is(47));
        assertThat(response.getData().getTo().length(), is(12));
        assertThat(response.getData().getFrom().length(), is(12));
        assertThat(response.getData().getTransferCallerId().length(), is(12));
        assertThat(response.getData().getTransferTo().length(), is(12));
        assertThat(response.getData().getDuration(), instanceOf(String.class));
        assertThat(response.getData().getDirection(), instanceOf(CallDirectionEnum.class));
        assertThat(response.getData().getChannels(), instanceOf(Integer.class));
        assertThat(response.getData().getStartTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getEndTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getFileFormat(), instanceOf(FileFormatEnum.class));
        assertThat(response.getData().getStatus(), instanceOf(String.class));
        assertThat(response.getData().getMediaUrl(), instanceOf(URI.class));
        assertThat(response.getData().getTranscription(), instanceOf(RecordingTranscriptionMetadata.class));
        assertThat(response.getData().getTranscription().getId().length(), is(38));
        assertThat(response.getData().getTranscription().getStatus(), instanceOf(String.class));
        assertThat(response.getData().getTranscription().getCompletedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getTranscription().getUrl(), instanceOf(URI.class));
        assertThat(response.getData().getRecordingName(), instanceOf(String.class));
    }

    @Test
    @Disabled // Can't set the correct Accept header for Prism
    public void testDownloadCallRecording() throws ApiException {
        ApiResponse<File> response = api.downloadCallRecordingWithHttpInfo(BW_ACCOUNT_ID, callId, recordingId);

        assertThat(response.getStatusCode(), is(204));
        assertThat(response.getData(), instanceOf(File.class));
    }
}
