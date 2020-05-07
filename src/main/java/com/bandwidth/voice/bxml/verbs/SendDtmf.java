
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * The SendDtmf verb is used to play DTMF digits in the call.
 *
 * <ul>
 * <li>The , and lowercase w characters introduce a half-second pause into the
 * DTMF sequence.</li>
 * <li>An uppercase W character introduces a one-second pause into the DTMF
 * sequence.</li>
 * <li>*, #, a-d, and A-D are also supported in addition to the numeric
 * characters 0-9.</li>
 * </ul>
 */
@Builder
@XmlType(name = SendDtmf.TYPE_NAME)
public class SendDtmf implements Verb {

    public static final String TYPE_NAME = "SendDtmf";

    @XmlValue
    private String digits;

    /**
     * (optional) The length (in milliseconds) of each DTMF tone. Default value is
     * 200. Range: decimal values between 50 - 5000.
     */
    @XmlAttribute
    private Double toneDuration;

    /**
     * (optional) The duration of silence (in milliseconds) following each DTMF
     * tone. Default value is 400. Range: decimal values between 50 - 5000.
     */
    @XmlAttribute
    private Double toneInterval;
}
