/**
 * The {@code <SipUri>} verb is used within the <Transfer> tag to define the called parties. Between 1 and 8 {@code <PhoneNumber>}or {@code <SipUri>}tags must be nested
 * If more than one destination is specified, called parties will ring simultaneously and the first to answer will be bridged to the original call.
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;

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
@XmlType(name = SipUri.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class SipUri implements OutboundDestination {
    /**
     * 
     * @param uri (str): A SIP URI to transfer the call to (e.g. sip:user@server.com)
     * @param uui (str, optional): he value of the User-To-User header to send within the initial INVITE. Must include the encoding parameter as specified in RFC 7433. Only base64 and jwt encoding are currently allowed. 
     *      This value, including the encoding specifier, may not exceed 256 characters. Defaults to None. 
     * @param number (str): A phone number to transfer the call to. Value must be in E.164 format (e.g. +15555555555).
     * @param transferAnswerUrl (str, optional): URL, if any, to send the Transfer Answer event to and request BXML to be executed for the called party before the call is bridged. May be a relative URL. Defaults to None.
     * @param transferAnswerMethod (str, optional): The HTTP method to use for the request to transferAnswerUrl. GET or POST. Default value is POST. Defaults to None.
     * @param transferAnswerFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Transfer Answer callback delivery in case transferAnswerUrl fails to respond. Defaults to None.
     * @param transferAnswerFallbackMethod (str, optional): The HTTP method to use to deliver the Transfer Answer callback to transferAnswerFallbackUrl. GET or POST. Default value is POST. Defaults to None.
     * @param transferDisconnectUrl (str, optional): URL, if any, to send the Transfer Disconnect event to. This event will be sent regardless of how the transfer ends and may not be responded to with BXML. May be a relative URL. Defaults to None.
     * @param transferDisconnectMethod (str, optional): The HTTP method to use for the request to transferDisconnectUrl. GET or POST. Default value is POST. Defaults to Defaults to Defaults to None.
     * @param username (str, optional): The username to send in the HTTP request to transferAnswerUrl and transferDisconnectUrl. Defaults to Defaults to None.
     * @param password (str, optional): The password to send in the HTTP request to transferAnswerUrl and transferDisconnectUrl. Defaults to Defaults to None.
     * @param fallbackUsername (str, optional): The username to send in the HTTP request to transferAnswerFallbackUrl. Defaults to None.
     * @param fallbackPassword (str, optional): The password to send in the HTTP request to transferAnswerFallbackUrl. Defaults to None.
     * @param tag (str, optional):  A custom string that will be sent with these and all future callbacks unless overwritten by a future tag attribute or cleared. May be cleared by setting tag="" Max length 256 characters. Defaults to None.
     *
     */        

    public static final String TYPE_NAME = "SipUri";

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String uri;

    @XmlAttribute
    protected String uui;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @XmlAttribute
    protected String transferAnswerUrl;

    @XmlAttribute
    @Default
    protected String transferAnswerMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String transferAnswerFallbackUrl;

    @XmlAttribute
    @Default
    protected String transferAnswerFallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String transferDisconnectUrl;

    @XmlAttribute
    @Default
    protected String transferDisconnectMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String tag;
}
