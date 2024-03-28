/**
 * The {@code <Transfer>} verb is used to transfer a party onto an existing call.
 */

 package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;
import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALL_TIMEOUT;

import com.bandwidth.sdk.model.DiversionReason;
import com.bandwidth.sdk.model.DiversionTreatment;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.net.URI;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Transfer.TYPE_NAME)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Transfer implements Verb {
    /**
     * 
     * @param destinations (list[PhoneNumber, SipUri], optional): List of recipients to transfer a call to. Defaults to [].
     * @param transferCallerId (str, optional): The caller ID to use when the call is transferred, if different. Must be in E.164 format (e.g. +15555555555) or be one of the following strings Restricted, Anonymous, Private, or Unavailable. Leave as default to pass along the number of the remote party. Defaults to None.
     * @param transferCallerDisplayName (str, optional): The caller display name to use when the call is transferred. May not exceed 256 characters nor contain control characters such as new lines.
     * @param callTimeout (double, optional):The timeout (in seconds) for the callee to answer the call after it starts ringing. If the call does not start ringing within 30s, the call will be cancelled regardless of this value. Range: decimal values between 1 - 300. Default value is 30 seconds. Defaults to None.
     * @param transferCompleteUrl (str, optional): URL to send the Transfer Complete event to and request new BXML. Optional but recommended. See below for further details. May be a relative URL. Defaults to None.
     * @param transferCompleteMethod (str, optional): The HTTP method to use for the request to transferCompleteUrl. GET or POST. Default value is POST. Defaults to None.
     * @param transferCompleteFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Transfer Complete callback delivery in case transferCompleteUrl fails to respond. Defaults to None.
     * @param transferCompleteFallbackMethod (str, optional): The HTTP method to use to deliver the Transfer Complete callback to transferCompleteFallbackUrl. GET or POST. Default value is POST. Defaults to None.
     * @param username (str, optional): The username to send in the HTTP request to transferCompleteUrl. Defaults to None.
     * @param password (str, optional): The password to send in the HTTP request to transferCompleteUrl. Defaults to None.
     * @param fallbackUsername (str, optional): The username to send in the HTTP request to transferCompleteFallbackUrl. Defaults to None.
     * @param fallbackPassword (str, optional): The password to send in the HTTP request to transferCompleteFallbackUrl. Defaults to None.
     * @param tag (str, optional): A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or cleared. May be cleared by setting tag="" Max length 256 characters. Defaults to None.
     * @param diversionTreatment (str, optional): Can be any of the following:
     *          none: No diversion headers are sent on the outbound leg of the transferred call.
     *          propagate: Copy the Diversion header from the inbound leg to the outbound leg. Ignored if there is no Diversion header present on the inbound leg.
     *          stack: After propagating any Diversion header from the inbound leg to the outbound leg, stack on top another Diversion header based on the Request-URI of the inbound call.
     *          Defaults to none. If diversionTreatment is not specified, no diversion header will be included for the transfer even if one came with the inbound call. Defaults to None.
     * @param diversionReason (str, optional): Can be any of the following values:
     *          unknown
     *          user-busy
     *          no-answer
     *          unavailable
     *          unconditional
     *          time-of-day
     *          do-not-disturb
     *          deflection
     *          follow-me
     *          out-of-service
     *          away
     *
     *       This parameter is considered only when diversionTreatment is set to stack. Defaults is unknown.
     *       Defaults to None.
     *
     */         

    public static final String TYPE_NAME = "Transfer";

    @XmlElements({
            @XmlElement(name = PhoneNumber.TYPE_NAME, type = PhoneNumber.class),
            @XmlElement(name = SipUri.TYPE_NAME, type = SipUri.class)
    })
    protected List<OutboundDestination> destinations;

    @XmlAttribute
    protected String transferCallerId;

    @XmlAttribute
    protected String transferCallerDisplayName;

    /**
     * Call timeout in seconds.
     */
    @XmlAttribute
    @Default
    protected Double callTimeout = DEFAULT_CALL_TIMEOUT;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @XmlAttribute
    protected URI transferCompleteUrl;

    @XmlAttribute
    @Default
    protected String transferCompleteMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected URI transferCompleteFallbackUrl;

    @XmlAttribute
    @Default
    protected String transferCompleteFallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String tag;

    @XmlAttribute
    @Default
    protected DiversionTreatment diversionTreatment = DiversionTreatment.none;

    @XmlAttribute
    @Default
    protected DiversionReason diversionReason = DiversionReason.unknown;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
