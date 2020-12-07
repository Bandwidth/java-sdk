
package com.bandwidth.voice.bxml.verbs;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import lombok.Builder;

/**
 */
@Builder
@XmlType(name = SipUri.TYPE_NAME)
public class SipUri implements Verb {
    public static final String TYPE_NAME = "SipUri";

    /**
     * SipUri to transfer to
     */
    @XmlValue
    private String sipUri;

    /**
     * (optional) The value of the User-To-User header to send within the initial INVITE. Must include the encoding parameter as specified in RFC 7433. Only base64 and jwt encoding are currently allowed. This value, including the encoding specifier, may not exceed 256 characters.
     */
    @XmlAttribute
    private String uui;

    /**
     * (optional) URL, if any, to send the Transfer Answer event to and request BXML to be executed for the called party before the call is bridged. May be a relative URL.
     */
    @XmlAttribute
    private URI transferAnswerUrl;

    /**
     * (optional) The HTTP method to use for the request to transferAnswerUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method transferAnswerMethod;

    /**
     * (optional) A fallback url which, if provided, will be used to retry the Transfer Answer callback delivery in case transferAnswerUrl fails to respond.
     */
    @XmlAttribute
    private URI transferAnswerFallbackUrl;

    /**
     * (optional) The HTTP method to use to deliver the Transfer Answer callback to transferAnswerFallbackUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method transferAnswerFallbackMethod;

    /**
     * (optional) URL, if any, to send the Transfer Disconnect event to. This event will be sent regardless of how the transfer ends and may not be responded to with BXML. May be a relative URL.
     */
    @XmlAttribute
    private URI transferDisconnectUrl;

    /**
     * (optional) The HTTP method to use for the request to transferDisconnectUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method transferDisconnectMethod;

    /**
     * (optional) The username to send in the HTTP request to transferAnswerUrl and transferDisconnectUrl.
     */
    @XmlAttribute
    private String username;

    /**
     * (optional) The password to send in the HTTP request to transferAnswerUrl and transferDisconnectUrl.
     */
    @XmlAttribute
    private String password;

    /**
     * (optional) The username to send in the HTTP request to transferAnswerFallbackUrl.
     */
    @XmlAttribute
    private String fallbackUsername;

    /**
     * (optional) The password to send in the HTTP request to transferAnswerFallbackUrl.
     */
    @XmlAttribute
    private String fallbackPassword;

    /**
     * (optional) A custom string that will be sent with these and all future callbacks unless overwritten by a future tag attribute or cleared.
     *
     * May be cleared by setting tag=""
     *
     * Max length 256 characters.
     */
    @XmlAttribute
    private String tag;

    public static class SipUriBuilder {


        public SipUri.SipUriBuilder transferAnswerUrl(URI uri){
            this.transferAnswerUrl = uri;
            return this;
        }

        public SipUri.SipUriBuilder transferAnswerUrl(String uri){
            return transferAnswerUrl(URI.create(uri));
        }

        public SipUri.SipUriBuilder transferAnswerMethod(Method method){
            this.transferAnswerMethod = method;
            return this;
        }

        public SipUri.SipUriBuilder transferAnswerMethod(String method){
            return transferAnswerMethod(Method.fromValue(method));
        }

        public SipUri.SipUriBuilder transferAnswerFallbackUrl(URI uri){
            this.transferAnswerFallbackUrl = uri;
            return this;
        }

        public SipUri.SipUriBuilder transferAnswerFallbackUrl(String uri){
            return transferAnswerFallbackUrl(URI.create(uri));
        }

        public SipUri.SipUriBuilder transferAnswerFallbackMethod(Method method){
            this.transferAnswerFallbackMethod = method;
            return this;
        }

        public SipUri.SipUriBuilder transferAnswerFallbackMethod(String method){
            return transferAnswerFallbackMethod(Method.fromValue(method));
        }

        public SipUri.SipUriBuilder transferDisconnectUrl(URI uri){
            this.transferDisconnectUrl = uri;
            return this;
        }

        public SipUri.SipUriBuilder transferDisconnectUrl(String uri){
            return transferDisconnectUrl(URI.create(uri));
        }

        public SipUri.SipUriBuilder transferDisconnectMethod(Method method){
            this.transferDisconnectMethod = method;
            return this;
        }

        public SipUri.SipUriBuilder transferDisconnectMethod(String method){
            return transferDisconnectMethod(Method.fromValue(method));
        }
    }
}
