
package com.bandwidth.voice.bxml.verbs;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import lombok.Builder;

/**
 * The Bridge verb is used to bridge another party (target call) onto the current call.
 * When the target call is bridged, any BXML being executed in it will be cancelled.
 * The bridge ends when one of the calls leaves the bridge. A call leaves the bridge when it is hung up or when it gets redirected to another BXML.
 * The Bridge Complete and Bridge Target Complete callbacks are sent when the bridge ends, to allow the call that remained in the bridge to execute new BXML.
 *
 *@author bandwidth
 */
@Builder
@XmlType(name = Bridge.TYPE_NAME)
public class Bridge implements Verb {

    public static final String TYPE_NAME = "Bridge";

    /**
     * String containing the callId of the call to be bridged.
     */
    @XmlValue
    private String callId;

    /**
     * (optional) URL to send the Bridge Complete event to and request new BXML.
     * If this attribute is specified, then Verbs following the <Bridge> verb will be ignored and the BXML returned in this callback is executed on the call.
     * If this attribute is not specified then no callback will be sent, and execution of the verbs following the <Bridge> verb continues.
     */
    @XmlAttribute
    private URI bridgeCompleteUrl;

    /**
     * <i>(optional)</i> he HTTP method to use for the request to bridgeCompleteUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method bridgeCompleteMethod;

    /**
     * (optional) URL to send the Bridge Target Complete event to and request new BXML.  If this attribute is specified, then the BXML returned in this callback is executed on the target call.
     * If this attribute is not specified then no callback will be sent, and the target call will be hung up.
     */
    @XmlAttribute
    private URI bridgeTargetCompleteUrl;

    /**
     * <i>(optional)</i> he HTTP method to use for the request to bridgeTargetCompleteUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method bridgeTargetCompleteMethod;

    /**
     * username to authenticate at the bridgeCompleteUrl & bridgeTargetCompleteUrl endpoints
     */
    @XmlAttribute
    protected String username;

    /**
     * password to use to authenticate at the bridgeCompleteUrl & bridgeTargetCompleteUrl endpoints
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

    public static class BridgeBuilder{

        /**
         * (optional) URL to send the Bridge Complete event to and request new BXML.
         * If this attribute is specified, then Verbs following the <Bridge> verb will be ignored and the BXML returned in this callback is executed on the call.
         * If this attribute is not specified then no callback will be sent, and execution of the verbs following the <Bridge> verb continues.
         */
        public BridgeBuilder bridgeCompleteUrl(String url){
            return this.bridgeCompleteUrl(URI.create(url));
        }

        /**
         * (optional) URL to send the Bridge Complete event to and request new BXML.
         * If this attribute is specified, then Verbs following the <Bridge> verb will be ignored and the BXML returned in this callback is executed on the call.
         * If this attribute is not specified then no callback will be sent, and execution of the verbs following the <Bridge> verb continues.
         */
        public BridgeBuilder bridgeCompleteUrl(URI url){
            this.bridgeCompleteUrl = url;
            return this;
        }


        /**
         * <i>(optional)</i> he HTTP method to use for the request to bridgeCompleteUrl. GET or POST. Default value is POST. Converts String to Method using Method.fromValue(method)
         */
        public BridgeBuilder bridgeCompleteMethod(String method){
            return this.bridgeCompleteMethod(Method.fromValue(method));
        }

        /**
         * <i>(optional)</i> he HTTP method to use for the request to bridgeCompleteUrl. GET or POST. Default value is POST.
         */
        public BridgeBuilder bridgeCompleteMethod(Method method){
            this.bridgeCompleteMethod = method;
            return this;
        }

        /**
         * (optional) URL to send the Bridge Target Complete event to and request new BXML.  If this attribute is specified, then the BXML returned in this callback is executed on the target call.
         * If this attribute is not specified then no callback will be sent, and the target call will be hung up.
         */
        public BridgeBuilder bridgeTargetCompleteUrl(String url){
            return this.bridgeTargetCompleteUrl(URI.create(url));
        }

        /**
         * (optional) URL to send the Bridge Target Complete event to and request new BXML.  If this attribute is specified, then the BXML returned in this callback is executed on the target call.
         * If this attribute is not specified then no callback will be sent, and the target call will be hung up.
         */
        public BridgeBuilder bridgeTargetCompleteUrl(URI url){
            this.bridgeTargetCompleteUrl = url;
            return this;
        }


        /**
         * <i>(optional)</i> he HTTP method to use for the request to bridgeTargetCompleteUrl. GET or POST. Default value is POST. Converts String to Method using Method.fromValue(method)
         */
        public BridgeBuilder bridgeTargetCompleteMethod(String method){
            return this.bridgeTargetCompleteMethod(Method.fromValue(method));
        }

        /**
         * <i>(optional)</i> he HTTP method to use for the request to bridgeTargetCompleteUrl. GET or POST. Default value is POST.
         */
        public BridgeBuilder bridgeTargetCompleteMethod(Method method){
            this.bridgeTargetCompleteMethod = method;
            return this;
        }
    }
}
