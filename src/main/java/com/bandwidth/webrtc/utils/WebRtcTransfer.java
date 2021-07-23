
package com.bandwidth.webrtc.utils;

public class WebRtcTransfer {
    public static String generateBxml(String deviceToken, String voiceCallId) {
        return WebRtcTransfer.generateBxml(deviceToken, voiceCallId, "sip:sipx.webrtc.bandwidth.com:5060");
    }

    public static String generateBxml(String deviceToken, String voiceCallId, String sipUri) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<Response>"
                + generateTransferVerb(deviceToken, voiceCallId, sipUri)
                + "</Response>\n";
    }

    public static String generateTransferVerb(String deviceToken, String voiceCallId, String sipUri) {
        return "<Transfer>\n"
                + "\t<SipUri uui=\"" + voiceCallId + ";encoding=base64," + deviceToken + ";encoding=jwt\">" + sipUri + "</SipUri>\n"
                + "</Transfer>";
    }
}
