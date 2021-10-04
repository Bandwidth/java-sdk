package com.bandwidth;

import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.webrtc.controllers.APIController;

import com.bandwidth.webrtc.models.*;

import org.junit.*;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

import static com.bandwidth.TestingEnvironmentVariables.*;

/*
 * Integration tests between the SDK and WebRTC API
 */
public class WebRtcApiTest {

    private APIController controller;

    @Before
    public void initTest(){
        BandwidthClient client = new BandwidthClient.Builder()
                .webRtcBasicAuthCredentials(USERNAME, PASSWORD)
                .build();

        controller = client.getWebRtcClient().getAPIController();
    }

    // Break this into multiple tests when our test environment is more robust and there aren't dependency issues
    @Test
    public void testWebRtcParticipantSessionManagement() throws Exception {
        // Create a participant
        Participant participantCreationRequest = new Participant.Builder()
                .callbackUrl(BASE_CALLBACK_URL + "/callbacks/webrtc")
                .publishPermissions(Arrays.asList(PublishPermissionEnum.AUDIO, PublishPermissionEnum.VIDEO))
                .tag("test")
                .deviceApiVersion(DeviceApiVersionEnum.V3)
                .build();

        ApiResponse<AccountsParticipantsResponse> participantCreationApiResponse =
                controller.createParticipant(ACCOUNT_ID, participantCreationRequest);
        assertEquals("Response Code is not 200", 200, participantCreationApiResponse.getStatusCode());

        AccountsParticipantsResponse participantCreationResponse = participantCreationApiResponse.getResult();
        assertNotNull("Participant is null", participantCreationResponse.getParticipant());
        assertNotNull("Participant ID is null", participantCreationResponse.getParticipant().getId());
        assertFalse("Participant ID is empty", participantCreationResponse.getParticipant().getId().isEmpty());
        assertEquals("Participant ID is not 36 characters", 36, participantCreationResponse.getParticipant().getId().length());
        assertEquals(
                "Publish Permissions do not match",
                new HashSet<>(participantCreationRequest.getPublishPermissions()),
                new HashSet<>(participantCreationResponse.getParticipant().getPublishPermissions())
                );
        assertEquals(
                "Tags do not match",
                participantCreationRequest.getTag(),
                participantCreationResponse.getParticipant().getTag()
                );
        assertEquals(
                "DeviceApiVersions do not match",
                participantCreationRequest.getDeviceApiVersion(),
                participantCreationResponse.getParticipant().getDeviceApiVersion()
                );
        assertNotNull("Token is null", participantCreationResponse.getToken());
        assertFalse("Token is empty", participantCreationResponse.getToken().isEmpty());

        // Get a participant
        ApiResponse<Participant> participantFetchApiResponse =
                controller.getParticipant(ACCOUNT_ID, participantCreationResponse.getParticipant().getId());
        assertEquals("Response Code is not 200", 200, participantFetchApiResponse.getStatusCode());

        Participant participantFetchResponse = participantFetchApiResponse.getResult();
        assertNotNull("Participant is null", participantFetchResponse);
        assertNotNull("Participant ID is null", participantFetchResponse.getId());
        assertFalse("Participant ID is empty", participantFetchResponse.getId().isEmpty());
        assertEquals("Participant ID is not 36 characters", 36, participantFetchResponse.getId().length());
        assertEquals(
                "Publish Permissions do not match",
                // convert the two lists to HashSets to ignore ordering
                new HashSet<>(participantCreationResponse.getParticipant().getPublishPermissions()),
                new HashSet<>(participantFetchResponse.getPublishPermissions())
                );
        assertEquals(
                "Tags do not match",
                participantCreationRequest.getTag(),
                participantFetchResponse.getTag()
        );
        assertEquals(
                "DeviceApiVersions do not match",
                participantCreationRequest.getDeviceApiVersion(),
                participantFetchResponse.getDeviceApiVersion()
        );

        // Create a session
        Session sessionCreationRequest = new Session.Builder()
                .tag("test")
                .build();

        ApiResponse<Session> sessionCreationApiResponse = controller.createSession(ACCOUNT_ID, sessionCreationRequest);
        assertEquals("Response Code is not 200", 200, sessionCreationApiResponse.getStatusCode());

        Session sessionCreationResponse = sessionCreationApiResponse.getResult();
        assertNotNull("Session ID is null", sessionCreationResponse.getId());
        assertFalse("Session ID is empty", sessionCreationResponse.getId().isEmpty());
        assertEquals("Session ID is not 36 characters", 36, sessionCreationResponse.getId().length());
        assertEquals("Session Tags do not match", sessionCreationRequest.getTag(), sessionCreationResponse.getTag());

        // Get a session
        ApiResponse<Session> sessionFetchApiResponse = controller.getSession(ACCOUNT_ID, sessionCreationResponse.getId());
        assertEquals("Response Code is not 200", 200, sessionFetchApiResponse.getStatusCode());

        Session sessionFetchResponse = sessionFetchApiResponse.getResult();
        assertEquals("Session IDs do not match", sessionCreationResponse.getId(), sessionFetchResponse.getId());
        assertEquals("Session Tags do not match", sessionCreationResponse.getTag(), sessionFetchResponse.getTag());

        // Add a participant to a session
        ApiResponse<Void> addParticipantApiResponse =
                controller.addParticipantToSession(ACCOUNT_ID, sessionCreationResponse.getId(), participantCreationResponse.getParticipant().getId(), null);
        assertEquals("Response Code is not 204", 204, addParticipantApiResponse.getStatusCode());

        // Get session participants
        /* Service currently broken - uncomment once it sends a proper response
        ApiResponse<java.util.List<Participant>> sessionParticipantFetchApiResponse =
                controller.listSessionParticipants(ACCOUNT_ID, sessionCreationResponse.getId());
        assertEquals("Response Code is not 200", 200, sessionParticipantFetchApiResponse.getStatusCode());

        java.util.List<Participant> sessionParticipantFetchResponse = sessionParticipantFetchApiResponse.getResult();
        assertFalse("List of Participants is empty", sessionParticipantFetchResponse.isEmpty());
        assertEquals("List of Participants should only contain a single item", 1, sessionParticipantFetchResponse.size());
        assertEquals(
                "Participant IDs do not match",
                participantCreationResponse.getParticipant().getId(),
                sessionParticipantFetchResponse.get(0).getId()
                );
        // This functionality hasn't been implemented yet, so Callback URLs aren't stored and null is returned
        assertEquals(
                "Callback URLs do not match",
                participantCreationRequest.getCallbackUrl(),
                sessionParticipantFetchResponse.get(0).getCallbackUrl()
                );
        assertEquals(
                "Publish Permissions do not match",
                new HashSet<>(participantCreationResponse.getParticipant().getPublishPermissions()),
                new HashSet<>(sessionParticipantFetchResponse.get(0).getPublishPermissions())
                );
        assertEquals(
                "Tags do not match",
                participantCreationRequest.getTag(),
                sessionParticipantFetchResponse.get(0).getTag()
                );
        assertEquals(
                "Device API Versions do not match",
                participantCreationRequest.getDeviceApiVersion(),
                sessionParticipantFetchResponse.get(0).getDeviceApiVersion()
                );
        */

        // Remove session participant
        ApiResponse<Void> removeSessionParticipantApiResponse =
                controller.removeParticipantFromSession(
                        ACCOUNT_ID,
                        sessionCreationResponse.getId(),
                        participantCreationResponse.getParticipant().getId()
                        );
        assertEquals("Response Code is not 204", 204, removeSessionParticipantApiResponse.getStatusCode());

        // Delete session
        ApiResponse<Void> deleteSessionApiResponse =
                controller.deleteSession(ACCOUNT_ID, sessionCreationResponse.getId());
        assertEquals("Response Code is not 204", 204, deleteSessionApiResponse.getStatusCode());

        // Delete participant
        ApiResponse<Void> deleteParticipantApiResponse =
                controller.deleteParticipant(ACCOUNT_ID, participantCreationResponse.getParticipant().getId());
        assertEquals("Response Code is not 204", 204, deleteParticipantApiResponse.getStatusCode());
    }
}
