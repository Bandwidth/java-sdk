/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CallRecordingMetadata;
import java.io.File;
import org.openapitools.client.model.TranscribeRecording;
import org.openapitools.client.model.TranscriptionList;
import org.openapitools.client.model.UpdateCallRecording;
import org.openapitools.client.model.VoiceApiError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecordingsApi
 */
@Disabled
public class RecordingsApiTest {

    private final RecordingsApi api = new RecordingsApi();

    /**
     * Delete Transcription
     *
     * Deletes the specified recording&#39;s transcription.  Note: After the deletion is requested and a &#x60;204&#x60; is returned, the transcription will not be accessible anymore. However, it is not deleted immediately. This deletion process, while transparent and irreversible, can take an additional 24 to 48 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCallTranscriptionTest() throws ApiException {
        String accountId = null;
        String callId = null;
        String recordingId = null;
        api.deleteCallTranscription(accountId, callId, recordingId);
        // TODO: test validations
    }

    /**
     * Delete Recording
     *
     * Delete the recording information, media and transcription.  Note: After the deletion is requested and a &#x60;204&#x60; is returned, neither the recording metadata nor the actual media nor its transcription will be accessible anymore. However, the media of the specified recording is not deleted immediately. This deletion process, while transparent and irreversible, can take an additional 24 to 48 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRecordingTest() throws ApiException {
        String accountId = null;
        String callId = null;
        String recordingId = null;
        api.deleteRecording(accountId, callId, recordingId);
        // TODO: test validations
    }

    /**
     * Delete Recording Media
     *
     * Deletes the specified recording&#39;s media.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRecordingMediaTest() throws ApiException {
        String accountId = null;
        String callId = null;
        String recordingId = null;
        api.deleteRecordingMedia(accountId, callId, recordingId);
        // TODO: test validations
    }

    /**
     * Download Recording
     *
     * Downloads the specified recording.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadCallRecordingTest() throws ApiException {
        String accountId = null;
        String callId = null;
        String recordingId = null;
        File response = api.downloadCallRecording(accountId, callId, recordingId);
        // TODO: test validations
    }

    /**
     * Get Call Recording
     *
     * Returns metadata for the specified recording.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCallRecordingTest() throws ApiException {
        String accountId = null;
        String callId = null;
        String recordingId = null;
        CallRecordingMetadata response = api.getCallRecording(accountId, callId, recordingId);
        // TODO: test validations
    }

    /**
     * Get Transcription
     *
     * Downloads the specified transcription.  If the transcribed recording was multi-channel, then there will be 2 transcripts. The caller/called party transcript will be the first item while [&#x60;&lt;PlayAudio&gt;&#x60;](/docs/voice/bxml/playAudio) and [&#x60;&lt;SpeakSentence&gt;&#x60;](/docs/voice/bxml/speakSentence) transcript will be the second item. During a [&#x60;&lt;Transfer&gt;&#x60;](/docs/voice/bxml/transfer) the A-leg transcript will be the first item while the B-leg transcript will be the second item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCallTranscriptionTest() throws ApiException {
        String accountId = null;
        String callId = null;
        String recordingId = null;
        TranscriptionList response = api.getCallTranscription(accountId, callId, recordingId);
        // TODO: test validations
    }

    /**
     * Get Call Recordings
     *
     * Returns a list of metadata for the recordings associated with the specified account. The list can be filtered by the optional from, to, minStartTime, and maxStartTime arguments. The list is capped at 1000 entries and may be empty if no recordings match the specified criteria.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAccountCallRecordingsTest() throws ApiException {
        String accountId = null;
        String to = null;
        String from = null;
        String minStartTime = null;
        String maxStartTime = null;
        List<CallRecordingMetadata> response = api.listAccountCallRecordings(accountId, to, from, minStartTime, maxStartTime);
        // TODO: test validations
    }

    /**
     * List Call Recordings
     *
     * Returns a (potentially empty) list of metadata for the recordings that took place during the specified call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCallRecordingsTest() throws ApiException {
        String accountId = null;
        String callId = null;
        List<CallRecordingMetadata> response = api.listCallRecordings(accountId, callId);
        // TODO: test validations
    }

    /**
     * Create Transcription Request
     *
     * Generate the transcription for a specific recording. Transcription can succeed only for recordings of length greater than 500 milliseconds and less than 4 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void transcribeCallRecordingTest() throws ApiException {
        String accountId = null;
        String callId = null;
        String recordingId = null;
        TranscribeRecording transcribeRecording = null;
        api.transcribeCallRecording(accountId, callId, recordingId, transcribeRecording);
        // TODO: test validations
    }

    /**
     * Update Recording
     *
     * Pause or resume a recording on an active phone call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCallRecordingStateTest() throws ApiException {
        String accountId = null;
        String callId = null;
        UpdateCallRecording updateCallRecording = null;
        api.updateCallRecordingState(accountId, callId, updateCallRecording);
        // TODO: test validations
    }

}
