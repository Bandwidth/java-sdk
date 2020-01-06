
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * The SendDtmf verb is used to play DTMF digits in the call.
 *
 * <ul>
 *     <li>The , and lowercase w characters introduce a half-second pause into the DTMF sequence.</li>
 *     <li>An uppercase W character introduces a one-second pause into the DTMF sequence.</li>
 *     <li>*, #, a-d, and A-D are also supported in addition to the numeric characters 0-9.</li>
 * </ul>
 */
@Builder
@XmlType(name = SendDtmf.TYPE_NAME)
public class SendDtmf implements Verb {

    public static final String TYPE_NAME = "SendDtmf";

    /**
     * String containing the DTMF characters to be sent in a call. Allows a maximum of 50 characters. The digits will be sent one-by-one with a marginal delay.
     */
    @XmlValue
    private String digits;
}
