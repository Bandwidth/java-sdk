
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The Ring verb is used to play ringing audio on a call.
 */
@Builder
@XmlType(name = Ring.TYPE_NAME)
public class Ring implements Verb {
    public static final String TYPE_NAME = "Ring";

    /**
     * (optional) How many seconds to play ringing on the call. Default value is 5. Range: decimal values between 0.1 - 86400.
     */
    @XmlAttribute
    private Double duration;

    /**
     * (optional) A boolean indicating whether or not to answer the call when Ring is executed on an unanswered
     * incoming call. Default value is 'true'.
     */
    @XmlAttribute
    private boolean answerCall;
}
