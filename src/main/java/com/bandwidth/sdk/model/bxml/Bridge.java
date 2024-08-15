/**
 * The {@code <Bridge>} verb is used to bridge another party (target call) onto the current call.
 * When the target call is bridged, any BXML being executed in it will be cancelled.
 * The bridge ends when one of the calls leaves the bridge. A call leaves the bridge when it is hung up or when it gets redirected to another BXML.
 * The Bridge Complete and Bridge Target Complete callbacks are sent when the bridge ends, to allow the call that remained in the bridge to execute new BXML.
 *
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

/**
 *
 *   @param targetCallId (str): String containing the callId of the call to be bridged.
 *   @param bridgeCompleteUrl (str, optional): URL to send the Bridge Complete event to and request new BXML.
 *        If this attribute is specified, then Verbs following the <Bridge> verb will be ignored and the BXML returned in this webhook is executed on the call.
 *        If this attribute is not specified then no webhook will be sent, and execution of the verbs following the <Bridge> verb continues. May be a relative URL. Defaults to None.
 *   @param bridgeCompleteMethod (str, optional): The HTTP method to use for the request to bridgeCompleteUrl. GET or POST. Default value is POST.
 *   @param bridgeCompleteFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Bridge Complete webhook delivery in case bridgeCompleteUrl fails to respond. Defaults to None.
 *   @param bridgeCompleteFallbackMethod (str, optional): The HTTP method to use to deliver the Bridge Complete webhook to bridgeCompleteFallbackUrl. GET or POST. Default value is POST.
 *   @param bridgeTargetCompleteUrl (str, optional):URL to send the Bridge Target Complete event to and request new BXML.
 *        If this attribute is specified, then the BXML returned in this webhook is executed on the target call.
 *        If this attribute is not specified then no webhook will be sent, and the target call will be hung up. May be a relative URL. Defaults to None.
 *   @param bridgeTargetCompleteMethod (str, optional): The HTTP method to use for the request to bridgeTargetCompleteUrl. GET or POST. Default value is POST.
 *   @param bridgeTargetCompleteFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Bridge Target Complete webhook delivery in case bridgeTargetCompleteUrl fails to respond. Defaults to None.
 *   @param bridgeTargetCompleteFallbackMethod (str, optional): The HTTP method to use to deliver the Bridge Target Complete webhook to bridgeTargetCompleteFallbackUrl. GET or POST. Default value is POST.
 *   @param username (str, optional): The username to send in the HTTP request to bridgeCompleteUrl and to bridgeTargetCompleteUrl. Defaults to None.
 *   @param password (str, optional): The password to send in the HTTP request to bridgeCompleteUrl and to bridgeTargetCompleteUrl. Defaults to None.
 *   @param fallbackUsername (str, optional): The username to send in the HTTP request to bridgeCompleteFallbackUrl and to bridgeTargetCompleteFallbackUrl. Defaults to None.
 *   @param fallbackPassword (str, optional): The password to send in the HTTP request to bridgeCompleteFallbackUrl and to bridgeTargetCompleteFallbackUrl. Defaults to None.
 *   @param tag (str, optional): A custom string that will be sent with the bridgeComplete webhook and all future webhooks of the call unless overwritten by a future tag attribute or <Tag> verb, or cleared. May be cleared by setting tag="". Max length 256 characters. Defaults to None.
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Bridge implements Verb {

    public static final String TYPE_NAME = "Bridge";

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String targetCallId;

    @XmlAttribute
    protected String bridgeCompleteUrl;

    @XmlAttribute
    @Default
    protected String bridgeCompleteMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String bridgeCompleteFallbackUrl;

    @XmlAttribute
    @Default
    protected String bridgeCompleteFallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String bridgeTargetCompleteUrl;

    @XmlAttribute
    @Default
    protected String bridgeTargetCompleteMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String bridgeTargetCompleteFallbackUrl;

    @XmlAttribute
    @Default
    protected String bridgeTargetCompleteFallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String tag;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
