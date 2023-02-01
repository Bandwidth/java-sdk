/**
 * The {@code <Ring>} verb is used to play ringing audio on a call.
 */

package org.openapitools.client.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Ring.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Ring implements Verb {
    /**
     *      
     * @param duration (double, optional): How many seconds to play ringing on the call. Default value is 5. Range: decimal values between 0.1 - 86400.
     * @param answerCall (bool, optional): A boolean indicating whether or not to answer the call when Ring is executed on an unanswered incoming call. Default value is 'true'.
     * 
     */        

    public static final String TYPE_NAME = "Ring";

    @XmlAttribute
    @Default
    protected Double duration = 2d;

    @XmlAttribute
    @Default
    protected Boolean answerCall = true;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}