
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The StartStream verb allows a segment of a call to be streamed to an external destination.
 */
@Builder
@XmlType(name = StartStream.TYPE_NAME)
public class StartStream implements Verb {
    public static final String TYPE_NAME = "StartRecording";


    /**
     * <i>(optional)</i> A name to refer to this stream by. Used when sending [`<StopStream>`][1]. If not provided, a random name will be generated and sent in the [`Media Stream Started`][2] webook. 
     */
    @XmlAttribute
    private String name;

    /**
     * <i>(optional)</i> The part of the call to send a stream from. `inbound`, `outbound` or `both`. Default is `inbound`. 
     */
    @XmlAttribute
    private String tracks;

    /**
     * <i>(required)</i> A websocket URI to send the stream to. The audio from the specified tracks will be sent via websocket to this URL encoded as base64 encoded PCMU/G711 audio. See below for more details on the websocket packet format.
     */
    @XmlAttribute
    private URI destination;

    /**
     * <i>(optional)</i> URL to send the associated Webhook events to during this stream's lifetime. Does not accept BXML. May be a relative URL. 
     */
    @XmlAttribute
    private URI streamEventUrl;

    /**
     * <i>(optional)</i> The HTTP method to use for the request to `streamEventUrl`. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method streamEventMethod;

    /**
     * <i>(optional)</i> The username to send in the HTTP request to `streamEventUrl`. If specified, the URLs must be TLS-encrypted (i.e., `https`). 
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to `streamEventUrl`. If specified, the URLs must be TLS-encrypted (i.e., `https`).
     */
    @XmlAttribute
    protected String password;


    public static class StartStreamBuilder {

        /**
         * <b>(optional)</b> URL to send the associated Webhook events to during this stream's lifetime. Does not accept BXML. May be a relative URL.
         */
        public StartStreamBuilder streamEventUrl(URI uri ){
            this.streamEventUrl = uri;
            return this;
        }

        /**
         * <b>(optional)</b> URL to send the associated Webhook events to during this stream's lifetime. Does not accept BXML. May be a relative URL.
         */
        public StartStreamBuilder streamEventUrl(String uri ){
            return streamEventUrl(URI.create(uri));
        } 

        /**
         * <b>(required)</b> A websocket URI to send the stream to. The audio from the specified tracks will be sent via websocket to this URL encoded as base64 encoded PCMU/G711 audio. See below for more details on the websocket packet format.
         */
        public StartStreamBuilder destination(URI uri ){
            this.destination = uri;
            return this;
        }

        /**
         * <b>(optional)</b> A websocket URI to send the stream to. The audio from the specified tracks will be sent via websocket to this URL encoded as base64 encoded PCMU/G711 audio. See below for more details on the websocket packet format.
         */
        public StartStreamBuilder destination(String uri ){
            return destination(URI.create(uri));
        }        

        /**
         * <i>(optional)</i> The HTTP method to use for the request to `streamEventUrl`. GET or POST. Default value is POST.
         */
        public StartStreamBuilder streamEventMethod(Method method){
            this.streamEventMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to `streamEventUrl`. GET or POST. Default value is POST.
         */
        public StartStreamBuilder streamEventMethod(String method){
            return streamEventMethod(Method.fromValue(method));
        }
    }

}
