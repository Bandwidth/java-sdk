/**
 * The {@code <Forward>} verb is used to forward an unanswered incoming call to another number. Unlike {@code <Transfer>}, once your call is forwarded, 
 * your application will not have any control over either leg of the call. When either leg hangs up, a Disconnect event will be sent to your Call status webhook URL.
 */

package org.openapitools.client.model.bxml;

import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_CALL_TIMEOUT;

import org.openapitools.client.model.DiversionReason;
import org.openapitools.client.model.DiversionTreatment;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Forward.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Forward implements Verb {
    /**
     *      
     * @param to (str): The phone number destination of the call.
     * @param from_ (str, optional): The phone number that the recipient will receive the call from.
     * @param callTimeout (str, optional): The number of seconds to wait before timing out the call.
     * @param diversionTreatment (str, optional): Can be any of the following:
     *     none: No diversion headers are sent on the outbound leg of the transferred call.
     *     propagate: Copy the Diversion header from the inbound leg to the outbound leg. Ignored if there is no Diversion header present on the inbound leg.
     *     stack: After propagating any Diversion header from the inbound leg to the outbound leg, stack on top another Diversion header based on the Request-URI of the inbound call.
     *     Defaults to none. If diversionTreatment is not specified, no diversion header will be included for the transfer even if one came with the inbound call. Defaults to None.
     * @param diversionReason (str, optional): Can be any of the following values:
     *     unknown
     *     user-busy
     *     no-answer
     *     unavailable
     *     unconditional
     *     time-of-day
     *     do-not-disturb
     *     deflection
     *     follow-me
     *     out-of-service
     *     away
     *     This parameter is considered only when diversionTreatment is set to stack. Defaults is unknown. 
     *     Defaults to None.
     * @param uui (str, optional): The value of the User-To-User header to send within the outbound INVITE when forwarding to a SIP URI. 
     *     Must include the encoding parameter as specified in RFC 7433. Only base64 and jwt encoding are currently allowed. 
     *     This value, including the encoding specifier, may not exceed 256 characters.
     */   

    public static final String TYPE_NAME = "Forward";

    @XmlAttribute
    private String to;

    @XmlAttribute
    private String from;

    @XmlAttribute
    private String uui;

    @XmlAttribute
    @Builder.Default
    private Double callTimeout = DEFAULT_CALL_TIMEOUT;

    @XmlAttribute
    @Builder.Default
    private DiversionTreatment diversionTreatment = DiversionTreatment.NONE;

    @XmlAttribute
    @Builder.Default
    private DiversionReason diversionReason = DiversionReason.UNKNOWN;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
