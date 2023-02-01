/**
 * The {@code <SendDtmf>} verb is used to play DTMF digits in the call.
 *      The , and lowercase w characters introduce a half-second pause into the DTMF sequence.
 *      An uppercase W character introduces a one-second pause into the DTMF sequence.
 *      *, #, a-d, and A-D are also supported in addition to the numeric characters 0-9.
 */

package org.openapitools.client.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = SendDtmf.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class SendDtmf implements Verb {
    /**
     *      
     * @param digits (str): String containing the DTMF characters to be sent in a call. Allows a maximum of 50 characters. The digits will be sent one-by-one with a marginal delay.
     * @param toneDuration (int, optional): The length (in milliseconds) of each DTMF tone. Default value is 200. Range: decimal values between 50 - 5000.
     * @param toneInterval (int, optional): The duration of silence (in milliseconds) following each DTMF tone. Default value is 400. Range: decimal values between 50 - 5000.
     * 
     */      

    public static final String TYPE_NAME = "SendDtmf";

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String digits;

    @XmlAttribute
    @Default
    protected Integer toneDuration = 200;

    @XmlAttribute
    @Default
    protected Integer toneInterval = 400;

    public SendDtmf(String digits) {
        this.digits = digits;
        this.toneDuration = 200;
        this.toneInterval = 400;
    }

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
