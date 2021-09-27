package com.bandwidth;

import com.bandwidth.webrtc.controllers.APIController;

import com.bandwidth.webrtc.models.Participant;
import com.bandwidth.webrtc.models.Session;
import org.junit.*;

import static com.bandwidth.TestingEnvironmentVariables.*;

public class WebRtcApiTests {

    private APIController controller;

    @Before
    public void initTest(){
        BandwidthClient client = new BandwidthClient.Builder()
                .webRtcBasicAuthCredentials(USERNAME, PASSWORD)
                .build();

        controller = client.getWebRtcClient().getAPIController();
    }

    @Test
    public void testWebRtcParticipantSessionManagement() throws Exception {

        Session session = new Session();
        session.setTag("new-session");

        session = controller.createSession(ACCOUNT_ID, session).getResult();

        Participant participant = new Participant();
        participant.setCallbackUrl(BASE_CALLBACK_URL.concat("/callbacks/webRtc"));

        participant = controller.createParticipant(ACCOUNT_ID, participant).getResult().getParticipant();

        controller.addParticipantToSession(ACCOUNT_ID, session.getId(), participant.getId(), null);
    }
}
