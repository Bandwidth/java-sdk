
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Transfer verb is used to bridge another party onto the current call.
 */
@Builder
@XmlType(name = Transfer.TYPE_NAME)
public class Transfer implements Verb {

    public static final String TYPE_NAME = "Transfer";

    /**
     * A collection of phone numbers to transfer the call to. The first to answer will be transferred.
     */
    @XmlElement(name = PhoneNumber.TYPE_NAME)
    private final List<PhoneNumber> phoneNumbers;

    /**
     * A collection of SipUrs to transfer the call to. The first to answer will be transferred.
     */
    @XmlElement(name = SipUri.TYPE_NAME)
    private final List<SipUri> sipUris;

    /**
     * 	(optional) The caller ID to use when the call is transferred, if different. Must be in E.164 format (e.g. +15555555555).
     * <br/>
     * Note: Leave blank to pass along the number of the remote party
     */
    @XmlAttribute
    private String transferCallerId;

    /**
     * <i>(optional)</i> This is the timeout (in seconds) for the callee to answer the call. Range: decimal values between 1 - 300
     */
    @XmlAttribute
    private Double callTimeout;

    /**
     * <i>(optional)</i> URL to send the Transfer Complete event to and request new BXML.
     */
    @XmlAttribute
    private URI transferCompleteUrl;

    /**
     * <i>(optional)</i> The HTTP method to use for the request to transferCompleteUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method transferCompleteMethod;

    /**
     * <i>(optional)</i> The username to send in the HTTP request to transferCompleteUrl.
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to transferCompleteUrl.
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

    /**
     * <i>(optional)</i> Can be any of the following:
     * <br/>
     * <b>none</b>: No diversion headers are sent on the outbound leg of the transferred call.
     * <br/>
     * <b>propagate</b>: Copy the Diversion header from the inbound leg to the outbound leg. Ignored if there is no Diversion header present on the inbound leg.
     * <br/>
     * <b>stack</b>: After propagating any Diversion header from the inbound leg to the outbound leg, stack on top another Diversion header based on the Request-URI of the inbound call.
     *
     */
    @XmlAttribute
    private String diversionTreatment;

    /**
     * <i>(optional)</i> This parameter is considered only when diversionTreatment is set to stack.
     *<br/>
     * Can be any of the following Strings:
     * <br/>
     * unknown
     * <br/>
     * user-busy
     * <br/>
     * no-answer
     * <br/>
     * unavailable
     * <br/>
     * unconditional
     * <br/>
     * time-of-day
     * <br/>
     * do-not-disturb
     * <br/>
     * deflection
     * <br/>
     * follow-me
     * <br/>
     * out-of-service
     * <br/>
     * away
     *
     */
    @XmlAttribute
    private String diversionReason;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @XmlAttribute
    protected URI transferCompleteFallbackUrl;

    @XmlAttribute
    protected Method transferCompleteFallbackMethod;

    public static class TransferBuilder {

        /**
         * <i>(optional)</i> URL to send the Transfer Complete event to and request new BXML.
         */
        public TransferBuilder transferCompleteUrl(URI uri){
            this.transferCompleteUrl = uri;
            return this;
        }

        /**
         * <i>(optional)</i> URL to send the Transfer Complete event to and request new BXML. Converts String using URI.create(uri)
         */
        public TransferBuilder transferCompleteUrl(String uri){
            return transferCompleteUrl(URI.create(uri));
        }

        public TransferBuilder transferCompleteFallbackUrl(URI uri){
            this.transferCompleteFallbackUrl = uri;
            return this;
        }

        public TransferBuilder transferCompleteFallbackUrl(String uri){
            return transferCompleteFallbackUrl(URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferCompleteUrl. GET or POST. Default value is POST.
         */
        public TransferBuilder transferCompleteMethod(Method method){
            this.transferCompleteMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transferCompleteUrl. GET or POST. Default value is POST. Converts from String using Method.fromValue(method)
         */
        public TransferBuilder transferCompleteMethod(String method){
            return transferCompleteMethod(Method.fromValue(method));
        }

        public TransferBuilder transferCompleteFallbackMethod(Method method){
            this.transferCompleteFallbackMethod = method;
            return this;
        }

        public TransferBuilder transferCompleteFallbackMethod(String method){
            return transferCompleteFallbackMethod(Method.fromValue(method));
        }

        /**
         * A collection of phone numbers to transfer the call to. The first to answer will be transferred.
         */
        public TransferBuilder phoneNumbers(PhoneNumber ... phoneNumbers){
            this.phoneNumbers = Arrays.asList(phoneNumbers);
            return this;
        }

        /**
         * A collection of phone numbers to transfer the call to. The first to answer will be transferred.
         */
        public TransferBuilder phoneNumbers(List<PhoneNumber> phoneNumbers){
            this.phoneNumbers = phoneNumbers;
            return this;
        }
    }
}
