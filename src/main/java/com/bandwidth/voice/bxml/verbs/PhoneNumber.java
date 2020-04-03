
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Object representation of a Phonenumber
 */
@Builder
@XmlType(name = PhoneNumber.TYPE_NAME)
public class PhoneNumber {
    public static final String TYPE_NAME = "PhoneNumber";

    /**
     * The phone number that will be the text content of the <PhoneNumber /> tag
     */
    @XmlValue
    private String phoneNumber;

    /**
     * <i>(optional)</i> URL, if any, to send the <i>Transfer Answer</i> event to and request BXML to be executed for the called party before the call is bridged
     */
    @XmlAttribute
    private URI transferAnswerUrl;

    /**
     * <i>(optional)</i> The HTTP method to use for the request to transferAnswerMethod . GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method transferAnswerMethod;

    /**
     * <i>(optional)</i> URL, if any, to send the <i>Transfer Disconnect</i> event to and request BXML to be executed for the called party before the call is bridged
     */
    @XmlAttribute
    private URI transferDisconnectUrl ;

    /**
     * <i>(optional)</i> URL, if any, to send the <i>Transfer Answer</i> event to and request BXML to be executed for the called party before the call is bridged
     */
    @XmlAttribute
    private Method transferDisconnectMethod  ;

    /**
     * <i>(optional)</i>  The username to send in the HTTP request to transferAnswerUrl.
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to transferAnswerUrl.
     */
    @XmlAttribute
    protected String password;

    /**
     * <i>(optional)</i> A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or cleared.
     * <br/>
     * May be cleared by setting tag=""
     * <br/>
     * Max length 256 characters.
     */
    @XmlAttribute
    private String tag;

    public static class PhoneNumberBuilder{

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferAnswerUrl. GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferAnswerUrl(String uri){
            return this.transferAnswerUrl(URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferAnswerUrl. GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferAnswerUrl(URI uri){
            this.transferAnswerUrl = uri;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferDisconnectUrl . GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferDisconnectUrl (String uri){
            return this.transferDisconnectUrl (URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferDisconnectUrl . GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferDisconnectUrl (URI uri){
            this.transferDisconnectUrl  = uri;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferAnswerUrl. GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferAnswerMethod(String method){
            return this.transferAnswerMethod(Method.fromValue(method));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferAnswerUrl. GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferAnswerMethod(Method method){
            this.transferAnswerMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferDisconnectUrl. GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferDisconnectMethod (String method){
            return this.transferDisconnectMethod (Method.fromValue(method));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferDisconnectUrl. GET or POST. Default value is POST.
         */
        public PhoneNumberBuilder transferDisconnectMethod (Method method){
            this.transferDisconnectMethod  = method;
            return this;
        }
    }
}
