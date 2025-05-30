package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.CallsApi;
import com.bandwidth.sdk.api.ConferencesApi;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.model.ConferenceRecordingMetadata;
import com.bandwidth.sdk.model.ConferenceStateEnum;
import com.bandwidth.sdk.model.CreateCall;
import com.bandwidth.sdk.model.CreateCallResponse;
import com.bandwidth.sdk.model.FileFormatEnum;
import com.bandwidth.sdk.model.Conference;
import com.bandwidth.sdk.model.ConferenceMember;
import com.bandwidth.sdk.model.RedirectMethodEnum;
import com.bandwidth.sdk.model.UpdateConference;
import com.bandwidth.sdk.model.UpdateConferenceMember;
import com.bandwidth.sdk.utils.MantecaStatusResponse;

import com.google.gson.Gson;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
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
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static com.bandwidth.sdk.utils.CallCleanup.Cleanup;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ConferencesApiTest {
    public ApiClient defaultClient = Configuration.getDefaultApiClient();
    public HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    public final CallsApi callsApi = new CallsApi(defaultClient);
    public final ConferencesApi conferencesApi = new ConferencesApi(defaultClient);

    private static final OkHttpClient mantecaClient = new OkHttpClient();
    public static final MediaType jsonMediaType = MediaType.get("application/json; charset=utf-8");

    private static String testId;
    private static String callId;
    private static String conferenceId;
    private static URI answerUrl;
    private static URI conferenceRedirectUrl;
    private static String updateRecordingBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Bxml><StartRecording/><SpeakSentence locale=\"en_US\" gender=\"female\" voice=\"susan\">This should be a conference recording.</SpeakSentence><StopRecording/></Bxml>";
    private static int TEST_SLEEP = 6;
    private static int MAX_RETRIES = 60;

    @BeforeAll
    public static void setUpBeforeClass() throws URISyntaxException {
        answerUrl = new URI(MANTECA_BASE_URL + "/bxml/joinConferencePause");
        conferenceRedirectUrl = new URI(MANTECA_BASE_URL + "/bxml/pause");
    }

    @AfterAll
    public void tearDownAfterClass() throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        Cleanup(this, callId);
    }

    static final String constructMantecaJsonBody(String os, String language) {
        return "{\"os\": \"" + os + "\", \"language\":\"JAVA" + JAVA_VERSION + "\", \"type\":\"conference\"}";
    }

    public void validateRecording(ConferenceRecordingMetadata recording, String conferenceId) {

    }

    public Boolean getTestRecordedStatus(String mantecaTestId) throws Exception {
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
                return mantecaStatus.callRecorded;
            } else {
                System.out.println(mantecaStatusResponse.body().string());
                throw new Exception(
                        "Received HTTP " + String.valueOf(mantecaStatusResponse.code())
                                + " status code from Manteca");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new Exception("Failed to get test status from Manteca, aborting test run :(");
        }
    }

    @Test
    @Order(1)
    public void testCreateAndFetchConference() throws Exception {
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
            testId = mantecaApiCall.execute().body().string();
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new Exception("Failed to initialize conference tests with Manteca, aborting test run :(");
        }

        CreateCall conferenceCallBody = new CreateCall();
        conferenceCallBody.setTo(MANTECA_IDLE_NUMBER);
        conferenceCallBody.setFrom(MANTECA_ACTIVE_NUMBER);
        conferenceCallBody.setApplicationId(MANTECA_APPLICATION_ID);
        conferenceCallBody.setAnswerUrl(answerUrl);
        conferenceCallBody.setTag(testId);

        ApiResponse<CreateCallResponse> createCallResponse = callsApi.createCallWithHttpInfo(BW_ACCOUNT_ID,
                conferenceCallBody);

        assertThat(createCallResponse.getStatusCode(), is(201));
        callId = createCallResponse.getData().getCallId();

        // TODO: Remove after successful test in GHA runners
        System.out.println("TestId: " + testId);
        System.out.println("CallId: " + callId);

        TimeUnit.SECONDS.sleep(TEST_SLEEP);

        ApiResponse<List<Conference>> listConferencesResponse = conferencesApi
                .listConferencesWithHttpInfo(BW_ACCOUNT_ID, testId, null, null, null, null);
        assertThat(listConferencesResponse.getStatusCode(), is(200));

        conferenceId = listConferencesResponse.getData().get(0).getId();

        ApiResponse<Conference> getConferenceResponse = conferencesApi.getConferenceWithHttpInfo(BW_ACCOUNT_ID,
                conferenceId);
        assertThat(getConferenceResponse.getStatusCode(), is(200));

    }

    @Test
    @Order(2)
    public void testConferenceAndMembers() throws Exception {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<ConferenceMember> listConferenceMembersResponse = conferencesApi
                .getConferenceMemberWithHttpInfo(BW_ACCOUNT_ID, conferenceId, callId);
        assertThat(listConferenceMembersResponse.getStatusCode(), is(200));

        UpdateConferenceMember updateMember = new UpdateConferenceMember();
        updateMember.setMute(false);

        ApiResponse<Void> updateConferenceMemberResponse = conferencesApi
                .updateConferenceMemberWithHttpInfo(BW_ACCOUNT_ID, conferenceId, callId, updateMember);
        assertThat(updateConferenceMemberResponse.getStatusCode(), is(204));

        UpdateConference updateConference = new UpdateConference();
        updateConference.setStatus(ConferenceStateEnum.ACTIVE);
        updateConference.setRedirectUrl(conferenceRedirectUrl);
        updateConference.setRedirectMethod(RedirectMethodEnum.POST);
        updateConference.setUsername("myUsername");
        updateConference.setPassword("myPassword1!");
        updateConference.setRedirectFallbackUrl(conferenceRedirectUrl);
        updateConference.setRedirectFallbackMethod(RedirectMethodEnum.POST);
        updateConference.setFallbackUsername("myUsername");
        updateConference.setFallbackPassword("myPassword1!");

        ApiResponse<Void> updateConferenceResponse = conferencesApi.updateConferenceWithHttpInfo(BW_ACCOUNT_ID,
                conferenceId, updateConference);
        assertThat(updateConferenceResponse.getStatusCode(), is(204));

        ApiResponse<Void> updateConferenceBxmlResponse = conferencesApi.updateConferenceBxmlWithHttpInfo(
                BW_ACCOUNT_ID,
                conferenceId, updateRecordingBxml);
        assertThat(updateConferenceBxmlResponse.getStatusCode(), is(204));
    }

    @Test
    @Order(3)
    @Disabled // issues with PV API, can re-enable after fixed
    public void testConferenceRecordings() throws Exception {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        Boolean testRecordingStatus = false;
        for (int i = 0; i < MAX_RETRIES; i++) {
            TimeUnit.SECONDS.sleep(TEST_SLEEP);
            testRecordingStatus = getTestRecordedStatus(testId);
        }
        assertThat(testRecordingStatus, is(true));

        ApiResponse<List<ConferenceRecordingMetadata>> listConferenceRecordingsResponse = conferencesApi
                .listConferenceRecordingsWithHttpInfo(BW_ACCOUNT_ID, conferenceId);
        assertThat(listConferenceRecordingsResponse.getStatusCode(), is(200));

        ConferenceRecordingMetadata conferenceRecording = listConferenceRecordingsResponse.getData().get(0);

        ApiResponse<ConferenceRecordingMetadata> conferenceRecordingMetadataResponse = conferencesApi
                .getConferenceRecordingWithHttpInfo(BW_ACCOUNT_ID, conferenceId,
                        conferenceRecording.getRecordingId());
        assertThat(conferenceRecordingMetadataResponse.getStatusCode(), is(200));
        assertThat(conferenceRecordingMetadataResponse.getData().getStatus(), is("complete"));
        assertThat(conferenceRecordingMetadataResponse.getData().getFileFormat(), is(FileFormatEnum.WAV));

        ApiResponse<File> downloadRecordingResponse = conferencesApi.downloadConferenceRecordingWithHttpInfo(
                BW_ACCOUNT_ID, conferenceId,
                conferenceRecording.getRecordingId());
        assertThat(downloadRecordingResponse.getStatusCode(), is(200));
    }
}
