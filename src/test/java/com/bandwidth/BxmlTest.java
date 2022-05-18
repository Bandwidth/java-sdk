package com.bandwidth;

import com.bandwidth.voice.bxml.verbs.*;
import com.bandwidth.voice.bxml.verbs.Record;
import com.bandwidth.webrtc.utils.WebRtcTransfer;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;


/**
 * Unit tests for BXML
 */
public class BxmlTest {

    @Test
    public void testBridge() {
        Bridge bridge = Bridge.builder()
            .callId("c-95ac8d6e-1a31c52e-b38f-4198-93c1-51633ec68f8d")
            .bridgeCompleteUrl("https://test.com")
            .bridgeCompleteMethod("GET")
            .bridgeTargetCompleteUrl("https://test2.com")
            .bridgeTargetCompleteMethod("POST")
            .username("user")
            .password("pass")
            .tag("custom tag")
            .bridgeCompleteFallbackUrl("https://test3.com")
            .bridgeCompleteFallbackMethod("GET")
            .bridgeTargetCompleteFallbackUrl("https://test4.com")
            .bridgeTargetCompleteFallbackMethod("POST")
            .fallbackUsername("fuser")
            .fallbackPassword("fpass")
            .build();

        String response = new Response()
            .add(bridge)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Bridge bridgeCompleteFallbackUrl=\"https://test3.com\" bridgeCompleteFallbackMethod=\"GET\" bridgeTargetCompleteFallbackUrl=\"https://test4.com\" bridgeTargetCompleteFallbackMethod=\"POST\" fallbackUsername=\"fuser\" fallbackPassword=\"fpass\" bridgeCompleteUrl=\"https://test.com\" bridgeCompleteMethod=\"GET\" bridgeTargetCompleteUrl=\"https://test2.com\" bridgeTargetCompleteMethod=\"POST\" username=\"user\" password=\"pass\" tag=\"custom tag\">c-95ac8d6e-1a31c52e-b38f-4198-93c1-51633ec68f8d</Bridge></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testConference() {
        ArrayList<String> callIdsToCoach = new ArrayList<String>();
        callIdsToCoach.add("id1");
        callIdsToCoach.add("id2");
        Conference conference = Conference.builder()
            .hold(true)
            .mute(true)
            .tag("tag1")
            .username("user")
            .password("pass")
            .callIdsToCoach(callIdsToCoach)
            .conferenceEventMethod("POST")
            .conferenceEventUrl("https://example.com")
            .name("my conference")
            .build();

        String response = new Response()
            .add(conference)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Conference mute=\"true\" hold=\"true\" callIdsToCoach=\"id1,id2\" conferenceEventUrl=\"https://example.com\" conferenceEventMethod=\"POST\" username=\"user\" password=\"pass\" tag=\"tag1\">my conference</Conference></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testSpeakSentence() {
        SpeakSentence speakSentence = SpeakSentence.builder()
            .text("test")
            .voice("susan")
            .gender("female")
            .locale("en_US")
            .build();

        String response = new Response()
            .add(speakSentence)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><SpeakSentence voice=\"susan\" gender=\"female\" locale=\"en_US\">test</SpeakSentence></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testSpeakSentenceWithSsml() {
        SpeakSentence speakSentence = SpeakSentence.builder()
            .text("Hello, you have reached the home of <lang xml:lang=\"es-MX\">Antonio Mendoza</lang>.Please leave a message.")
            .build();

        String response = new Response()
            .add(speakSentence)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><SpeakSentence>Hello, you have reached the home of <lang xml:lang=\"es-MX\">Antonio Mendoza</lang>.Please leave a message.</SpeakSentence></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testPlayAudio() {
        PlayAudio playAudio = PlayAudio.builder()
            .audioUri("https://test.com")
            .username("user")
            .password("pass")
            .build();

        String response = new Response()
            .add(playAudio)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><PlayAudio username=\"user\" password=\"pass\">https://test.com</PlayAudio></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testGather() {
        Gather gather = Gather.builder()
            .gatherUrl("https://test.com")
            .gatherMethod("GET")
            .username("user")
            .password("pass")
            .tag("tag")
            .terminatingDigits("123")
            .maxDigits(3)
            .interDigitTimeout(4.0)
            .firstDigitTimeout(5.0)
            .repeatCount(6)
            .gatherFallbackUrl("https://test2.com")
            .gatherFallbackMethod("POST")
            .fallbackUsername("fuser")
            .fallbackPassword("fpass")
            .build();

        String response = new Response()
            .add(gather)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Gather gatherUrl=\"https://test.com\" gatherMethod=\"GET\" username=\"user\" password=\"pass\" tag=\"tag\" terminatingDigits=\"123\" maxDigits=\"3\" interDigitTimeout=\"4.0\" firstDigitTimeout=\"5.0\" repeatCount=\"6\" fallbackUsername=\"fuser\" fallbackPassword=\"fpass\" gatherFallbackUrl=\"https://test2.com\" gatherFallbackMethod=\"POST\"/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testNestedGatherMultipleVerbs() {
        SpeakSentence speakSentence = SpeakSentence.builder()
            .text("test")
            .build();
        PlayAudio playAudio = PlayAudio.builder()
            .audioUri("https://test.com")
            .build();
        ArrayList<AudioProducer> audioProducers = new ArrayList<AudioProducer>();
        audioProducers.add(speakSentence);
        audioProducers.add(playAudio);

        Gather gather = Gather.builder()
            .audioProducer(audioProducers)
            .build();

        String response = new Response()
            .add(gather)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Gather><SpeakSentence>test</SpeakSentence><PlayAudio>https://test.com</PlayAudio></Gather></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testNestedGatherSingleVerb() {
        SpeakSentence speakSentence = SpeakSentence.builder()
            .text("test")
            .build();

        Gather gather = Gather.builder()
            .audioProducer(speakSentence)
            .build();

        String response = new Response()
            .add(gather)
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Gather><SpeakSentence>test</SpeakSentence></Gather></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testResponse() {
        String response = new Response()
            .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response/>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testBxml() {
        String bxml = new Bxml()
                .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Bxml/>";

        assertEquals("BXML strings not equal", expected, bxml);
    }

    @Test
    public void testBxmlSpeakSentence() {
        SpeakSentence speakSentence = SpeakSentence.builder()
                .text("test")
                .voice("susan")
                .gender("female")
                .locale("en_US")
                .build();

        String bxml = new Bxml()
                .add(speakSentence)
                .toBXML();
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Bxml><SpeakSentence voice=\"susan\" gender=\"female\" locale=\"en_US\">test</SpeakSentence></Bxml>";

        assertEquals("BXML strings not equal", expected, bxml);
    }

    @Test
    public void testHangup() {
        Hangup hangup = Hangup.builder().build();

        String response = new Response()
            .add(hangup)
            .toBXML();

         String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Hangup/></Response>";

         assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testSendDtmf() {
        SendDtmf sendDtmf = SendDtmf.builder()
            .digits("321")
            .toneDuration(75.0)
            .toneInterval(50.0)
            .build();

        String response = new Response()
            .add(sendDtmf)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><SendDtmf toneDuration=\"75.0\" toneInterval=\"50.0\">321</SendDtmf></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testForward() {
        Forward forward = Forward.builder()
            .to("+18887775555")
            .from("+8887779999")
            .callTimeout(3)
            .diversionTreatment("none")
            .diversionReason("away")
            .build();

        String response = new Response()
            .add(forward)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Forward to=\"+18887775555\" from=\"+8887779999\" callTimeout=\"3\" diversionTreatment=\"none\" diversionReason=\"away\"/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testPause() {
        Pause pause = Pause.builder()
            .duration(3.0)
            .build();

        String response = new Response()
            .add(pause)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Pause duration=\"3.0\"/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testRedirect() {
        Redirect redirect = Redirect.builder()
            .username("user")
            .password("pass")
            .redirectUrl("https://test.com")
            .redirectMethod("GET")
            .tag("tag")
            .redirectFallbackUrl("https://test2.com")
            .redirectFallbackMethod("POST")
            .fallbackUsername("fuser")
            .fallbackPassword("fpass")
            .build();

        String response = new Response()
            .add(redirect)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Redirect redirectUrl=\"https://test2.com\" redirectMethod=\"GET\" tag=\"tag\" username=\"user\" password=\"pass\" fallbackUsername=\"fuser\" fallbackPassword=\"fpass\" redirectFallbackMethod=\"POST\"/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testTransfer() {
        PhoneNumber phoneNumber = PhoneNumber.builder()
            .phoneNumber("+17776665555")
            .transferAnswerUrl("https://test.com")
            .transferAnswerMethod("GET")
            .username("user")
            .password("pass")
            .tag("tag")
            .transferAnswerFallbackUrl("https://test2.com")
            .transferAnswerFallbackMethod("POST")
            .fallbackUsername("fuser")
            .fallbackPassword("fpass")
            .build();
        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
        phoneNumbers.add(phoneNumber);
        SipUri sipUri = SipUri.builder()
            .sipUri("sip-uri")
            .uui("uui")
            .transferAnswerUrl("https://test3.com")
            .transferAnswerMethod("POST")
            .username("user2")
            .password("pass2")
            .tag("tag2")
            .transferAnswerFallbackUrl("https://test4.com")
            .transferAnswerFallbackMethod("POST")
            .fallbackUsername("fuser2")
            .fallbackPassword("fpass2")
            .build();
        ArrayList<SipUri> sipUris = new ArrayList<SipUri>();
        sipUris.add(sipUri);
        Transfer transfer = Transfer.builder()
            .transferCallerId("+18888888888")
            .callTimeout(3.0)
            .tag("tag3")
            .transferCompleteUrl("https://testtransfer.com")
            .transferCompleteMethod("GET")
            .username("usertransfer")
            .password("passtransfer")
            .diversionTreatment("none")
            .diversionReason("away")
            .transferCompleteFallbackUrl("https://test7.com")
            .transferCompleteFallbackMethod("POST")
            .fallbackUsername("fuser7")
            .fallbackPassword("fpass7")
            .phoneNumbers(phoneNumbers)
            .sipUris(sipUris)
            .build();

        String response = new Response()
            .add(transfer)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Transfer transferCallerId=\"+18888888888\" callTimeout=\"3.0\" transferCompleteUrl=\"https://testtransfer.com\" transferCompleteMethod=\"GET\" username=\"usertransfer\" password=\"passtransfer\" tag=\"tag3\" diversionTreatment=\"none\" diversionReason=\"away\" fallbackUsername=\"fuser7\" fallbackPassword=\"fpass7\" transferCompleteFallbackUrl=\"https://test7.com\" transferCompleteFallbackMethod=\"POST\"><PhoneNumber transferAnswerUrl=\"https://test.com\" transferAnswerMethod=\"GET\" username=\"user\" password=\"pass\" tag=\"tag\" fallbackUsername=\"fuser\" fallbackPassword=\"fpass\" transferAnswerFallbackUrl=\"https://test2.com\" transferAnswerFallbackMethod=\"POST\">+17776665555</PhoneNumber><SipUri uui=\"uui\" transferAnswerUrl=\"https://test3.com\" transferAnswerMethod=\"POST\" transferAnswerFallbackUrl=\"https://test4.com\" transferAnswerFallbackMethod=\"POST\" username=\"user2\" password=\"pass2\" fallbackUsername=\"fuser2\" fallbackPassword=\"fpass2\" tag=\"tag2\">sip-uri</SipUri></Transfer></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testRecord() {
        Record record = Record.builder()
            .recordCompleteUrl("https://url.com")
            .recordCompleteMethod("POST")
            .recordingAvailableUrl("https://url.com")
            .recordingAvailableMethod("POST")
            .username("user")
            .password("pass")
            .tag("tag")
            .terminatingDigits("123")
            .maxDuration(3)
            .fileFormat("wav")
            .recordCompleteFallbackUrl("https://test.com")
            .recordCompleteFallbackMethod("GET")
            .fallbackUsername("fuser")
            .fallbackPassword("fpass")
            .build();

        String response = new Response()
            .add(record)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Record transcribe=\"false\" recordCompleteUrl=\"https://url.com\" recordCompleteMethod=\"POST\" recordingAvailableUrl=\"https://url.com\" recordingAvailableMethod=\"POST\" tag=\"tag\" username=\"user\" password=\"pass\" terminatingDigits=\"123\" maxDuration=\"3\" fileFormat=\"wav\" fallbackUsername=\"fuser\" fallbackPassword=\"fpass\" recordCompleteFallbackUrl=\"https://test.com\" recordCompleteFallbackMethod=\"GET\"/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testStartRecording() {
        StartRecording startRecording = StartRecording.builder()
            .recordingAvailableUrl("https://url.com")
            .recordingAvailableMethod("POST")
            .username("user")
            .password("pass")
            .tag("tag")
            .fileFormat("wav")
            .multiChannel(false)
            .build();

        String response = new Response()
            .add(startRecording)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><StartRecording transcribe=\"false\" recordingAvailableUrl=\"https://url.com\" recordingAvailableMethod=\"POST\" tag=\"tag\" username=\"user\" password=\"pass\" multiChannel=\"false\" fileFormat=\"wav\"/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testPauseRecording() {
        PauseRecording pauseRecording = PauseRecording.builder().build();

        String response = new Response()
            .add(pauseRecording)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><PauseRecording/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testResumeRecording() {
        ResumeRecording resumeRecording = ResumeRecording.builder().build();

        String response = new Response()
            .add(resumeRecording)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><ResumeRecording/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testStopRecording() {
        StopRecording stopRecording = StopRecording.builder().build();

        String response = new Response()
            .add(stopRecording)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><StopRecording/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testRing() {
        Ring ring = Ring.builder()
                .duration(3.0)
                .answerCall(false)
                .build();

        String response = new Response()
            .add(ring)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Ring duration=\"3.0\" answerCall=\"false\"/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testRingDefault() {
        Ring ring = Ring.builder().build();
        String response = new Response().add(ring).toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><Ring/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testStopGather() {
        StopGather stopGather = StopGather.builder().build();

        String response = new Response()
            .add(stopGather)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><StopGather/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testStartGather() {
        StartGather startGather = StartGather.builder().build();

        String response = new Response()
            .add(startGather)
            .toBXML();

        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Response><StartGather/></Response>";

        assertEquals("BXML strings not equal", expected, response);
    }

    @Test
    public void testGenerateBxmlTwoParams() {
        String response = WebRtcTransfer.generateBxml("asdf","c-93d6f3c0-be584596-0b74-4fa2-8015-d8ede84bd1a4");
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<Response><Transfer>\n"
                + "\t<SipUri uui=\"93d6f3c0be5845960b744fa28015d8ede84bd1a4;encoding=base64,asdf;encoding=jwt\">sip:sipx.webrtc.bandwidth.com:5060</SipUri>\n"
                + "</Transfer></Response>\n";
        assertEquals("BXML strings are equal", expected, response);
    }

    @Test
    public void testGenerateBxmlThreeParams() {
        String response = WebRtcTransfer.generateBxml("asdf","c-93d6f3c0-be584596-0b74-4fa2-8015-d8ede84bd1a4", "sip1:sipx.webrtc.bandwidth.com:5060");
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<Response><Transfer>\n"
                + "\t<SipUri uui=\"93d6f3c0be5845960b744fa28015d8ede84bd1a4;encoding=base64,asdf;encoding=jwt\">sip1:sipx.webrtc.bandwidth.com:5060</SipUri>\n"
                + "</Transfer></Response>\n";
        assertEquals("BXML strings are equal", expected, response);
    }

    @Test
    public void testGenerateBxmlVerb() {
        String response = WebRtcTransfer.generateTransferVerb("asdf","c-93d6f3c0-be584596-0b74-4fa2-8015-d8ede84bd1a4", "sip:sipx.webrtc.bandwidth.com:5060");
        String expected = "<Transfer>\n"
                + "\t<SipUri uui=\"93d6f3c0be5845960b744fa28015d8ede84bd1a4;encoding=base64,asdf;encoding=jwt\">sip:sipx.webrtc.bandwidth.com:5060</SipUri>\n"
                + "</Transfer>";
        assertEquals("BXML strings are equal", expected, response);
    }
}
