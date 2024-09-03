package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.ConferencesApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CallbackMethodEnum;
import com.bandwidth.sdk.model.Conference;
import com.bandwidth.sdk.model.ConferenceMember;
import com.bandwidth.sdk.model.ConferenceRecordingMetadata;
import com.bandwidth.sdk.model.ConferenceStateEnum;
import com.bandwidth.sdk.model.FileFormatEnum;
import com.bandwidth.sdk.model.RedirectMethodEnum;
import com.bandwidth.sdk.model.UpdateConference;
import com.bandwidth.sdk.model.UpdateConferenceMember;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import java.io.File;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("null")
public class ConferencesApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static ConferencesApi api = new ConferencesApi(defaultClient);

    private static String callId = "c-1234";
    private static String conferenceId = "c-4321";
    private static String recordingId = "r-1234";

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testListConferences() throws ApiException {
        ApiResponse<List<Conference>> response = api.listConferencesWithHttpInfo(BW_ACCOUNT_ID, conferenceId, null,
                null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().get(0), instanceOf(Conference.class));
        assertThat(response.getData().get(0).getId().length(), is(50));
        assertThat(response.getData().get(0).getName(), instanceOf(String.class));
        assertThat(response.getData().get(0).getCreatedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getCompletedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getConferenceEventUrl(), instanceOf(URI.class));
        assertThat(response.getData().get(0).getConferenceEventMethod(), instanceOf(CallbackMethodEnum.class));
        assertThat(response.getData().get(0).getTag(), instanceOf(String.class));
    }

    @Test
    public void testGetConference() throws ApiException {
        ApiResponse<Conference> response = api.getConferenceWithHttpInfo(BW_ACCOUNT_ID, conferenceId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(Conference.class));
        assertThat(response.getData().getId().length(), is(50));
        assertThat(response.getData().getName(), instanceOf(String.class));
        assertThat(response.getData().getCreatedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getCompletedTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getConferenceEventUrl(), instanceOf(URI.class));
        assertThat(response.getData().getConferenceEventMethod(), instanceOf(CallbackMethodEnum.class));
        assertThat(response.getData().getTag(), instanceOf(String.class));
    }

    @Test
    public void testGetConferenceMember() throws ApiException {
        ApiResponse<ConferenceMember> response = api.getConferenceMemberWithHttpInfo(BW_ACCOUNT_ID, conferenceId,
                callId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(ConferenceMember.class));
        assertThat(response.getData().getCallId().length(), is(47));
        assertThat(response.getData().getConferenceId().length(), is(50));
        assertThat(response.getData().getMemberUrl(), instanceOf(URI.class));
        assertThat(response.getData().getMute(), instanceOf(Boolean.class));
        assertThat(response.getData().getHold(), instanceOf(Boolean.class));
        assertThat(response.getData().getCallIdsToCoach(), instanceOf(List.class));
    }

    @Test
    public void testUpdateConferenceMember() throws ApiException {
        UpdateConferenceMember conferenceMember = new UpdateConferenceMember()
                .mute(true)
                .hold(true)
                .callIdsToCoach(new ArrayList<String>());

        ApiResponse<Void> response = api.updateConferenceMemberWithHttpInfo(BW_ACCOUNT_ID, conferenceId, callId,
                conferenceMember);

        assertThat(response.getStatusCode(), is(204));
    }

    @Test
    public void testUpdateConference() throws ApiException {
        UpdateConference conference = new UpdateConference()
                .status(ConferenceStateEnum.ACTIVE)
                .redirectUrl(URI.create(BASE_CALLBACK_URL))
                .redirectMethod(RedirectMethodEnum.POST)
                .username("username")
                .password("password")
                .redirectFallbackUrl(URI.create(BASE_CALLBACK_URL))
                .redirectFallbackMethod(RedirectMethodEnum.POST)
                .fallbackUsername("username")
                .fallbackPassword("password");

        ApiResponse<Void> response = api.updateConferenceWithHttpInfo(BW_ACCOUNT_ID, conferenceId, conference);

        assertThat(response.getStatusCode(), is(204));
    }

    @Test
    public void testUpdateConferenceBxml() throws ApiException {
        String updateConferenceBxml = "<Response><Hangup/></Response>";

        ApiResponse<Void> response = api.updateConferenceBxmlWithHttpInfo(BW_ACCOUNT_ID, conferenceId,
                updateConferenceBxml);

        assertThat(response.getStatusCode(), is(204));
    }

    @Test
    public void testListConferenceRecordings() throws ApiException {
        ApiResponse<List<ConferenceRecordingMetadata>> response = api
                .listConferenceRecordingsWithHttpInfo(BW_ACCOUNT_ID, conferenceId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().get(0), instanceOf(ConferenceRecordingMetadata.class));
        assertThat(response.getData().get(0).getAccountId().length(), is(7));
        assertThat(response.getData().get(0).getConferenceId().length(), is(50));
        assertThat(response.getData().get(0).getName(), instanceOf(String.class));
        assertThat(response.getData().get(0).getRecordingId().length(), is(47));
        assertThat(response.getData().get(0).getDuration(), instanceOf(String.class));
        assertThat(response.getData().get(0).getChannels(), instanceOf(Integer.class));
        assertThat(response.getData().get(0).getStartTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getEndTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().get(0).getFileFormat(), instanceOf(FileFormatEnum.class));
        assertThat(response.getData().get(0).getStatus(), instanceOf(String.class));
        assertThat(response.getData().get(0).getMediaUrl(), instanceOf(URI.class));
    }

    @Test
    public void testGetConferenceRecording() throws ApiException {
        ApiResponse<ConferenceRecordingMetadata> response = api.getConferenceRecordingWithHttpInfo(BW_ACCOUNT_ID,
                conferenceId, recordingId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(ConferenceRecordingMetadata.class));
        assertThat(response.getData().getAccountId().length(), is(7));
        assertThat(response.getData().getConferenceId().length(), is(50));
        assertThat(response.getData().getName(), instanceOf(String.class));
        assertThat(response.getData().getRecordingId().length(), is(47));
        assertThat(response.getData().getDuration(), instanceOf(String.class));
        assertThat(response.getData().getChannels(), instanceOf(Integer.class));
        assertThat(response.getData().getStartTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getEndTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getFileFormat(), instanceOf(FileFormatEnum.class));
        assertThat(response.getData().getStatus(), instanceOf(String.class));
        assertThat(response.getData().getMediaUrl(), instanceOf(URI.class));
    }

    @Test
    @Disabled // Can't set the correct Accept header for Prism
    public void testDownloadConferenceRecording() throws ApiException {
        ApiResponse<File> response = api.downloadConferenceRecordingWithHttpInfo(BW_ACCOUNT_ID, conferenceId,
                recordingId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(File.class));
    }
}
