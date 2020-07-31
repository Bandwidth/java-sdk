
package com.bandwidth.webrtc.utils;

public class WebRtcTransfer {
    public static String generateBxml(String deviceToken) {
        return WebRtcTransfer.generateBxml(deviceToken, "sip:sipx.webrtc.bandwidth.com:5060");
    }

    public static String generateBxml(String deviceToken, String sipUri) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
            + "<Transfer>\n"
            + "\t<SipUri uui=\"" + deviceToken + ";encoding=jwt\">" + sipUri + "</SipUri>\n"
            + "</Transfer>\n";
    }
}
