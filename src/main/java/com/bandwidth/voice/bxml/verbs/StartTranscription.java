
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;


/**
 * The StartTranscription verb allows a segment of a call to be transcribed and optionally for the live transcription to be sent off to another destination for additional processing.
 */
@Builder
@XmlType(name = StartTranscription.TYPE_NAME)
public class StartTranscription implements Verb {
    public static final String TYPE_NAME = "StartTranscription";

    @XmlElement(name = CustomParam.TYPE_NAME)
    private final List<CustomParam> customParams;

    /**
     * <i>(optional)</i> A name to refer to this transcription by. Used when sending <StopTranscription>. If not provided, it will default to the generated transcription id as sent in the Real-Time Transcription Started webhook.
     */
    @XmlAttribute
    private String name;

    /**
     * <i>(optional)</i> the part of the call to send a transcription from. `inbound`, `outbound` or `both`. default is `inbound`. 
     */
    @XmlAttribute
    private String tracks;

    /**
     * <i>(optional)</i> a websocket uri to send the real-time transcription to. the audio from the specified tracks will be sent via websocket to this url encoded as base64 encoded pcmu/g711 audio. see below for more details on the websocket packet format.
     */
    @XmlAttribute
    private URI destination;

    /**
     * <i>(optional)</i> Whether to send transcription update events to the specified destination only after they have become stable. Requires destination. Defaults to true.
     */
    @XmlAttribute
    private Boolean stabilized;

    /**
     * <i>(optional)</i> url to send the associated webhook events to during this real-time transcription's lifetime. Does not accept bxml. May be a relative URL. 
     */
    @XmlAttribute
    private URI transcriptionEventUrl;

    /**
     * <i>(optional)</i> the http method to use for the request to `transcriptioneventurl`. get or post. default value is post.
     */
    @XmlAttribute
    private Method transcriptionEventMethod;

    /**
     * <i>(optional)</i> the username to send in the http request to `transcriptioneventurl`. if specified, the urls must be tls-encrypted (i.e., `https`). 
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> the password to send in the http request to `transcriptioneventurl`. if specified, the urls must be tls-encrypted (i.e., `https`).
     */
    @XmlAttribute
    protected String password;


    public static class StartTranscriptionBuilder {

        /**
         * <b>(optional)</b> url to send the associated webhook events to during this real-time transcription's lifetime. does not accept bxml. may be a relative url.
         */
        public StartTranscriptionBuilder transcriptionEventUrl(URI uri ){
            this.transcriptionEventUrl = uri;
            return this;
        }

        /**
         * <b>(optional)</b> url to send the associated webhook events to during this real-time transcription's lifetime. does not accept bxml. may be a relative url.
         */
        public StartTranscriptionBuilder transcriptionEventUrl(String uri ){
            return transcriptionEventUrl(URI.create(uri));
        } 

        /**
         * <b>(required)</b> a websocket uri to send the real-time transcription to. the audio from the specified tracks will be sent via websocket to this url encoded as base64 encoded pcmu/g711 audio. see below for more details on the websocket packet format.
         */
        public StartTranscriptionBuilder destination(URI uri ){
            this.destination = uri;
            return this;
        }

        /**
         * <b>(optional)</b> a websocket uri to send the real-time transcription to. the audio from the specified tracks will be sent via websocket to this url encoded as base64 encoded pcmu/g711 audio. see below for more details on the websocket packet format.
         */
        public StartTranscriptionBuilder destination(String uri ){
            return destination(URI.create(uri));
        }        

        /**
         * <i>(optional)</i> the http method to use for the request to `transcriptioneventurl`. get or post. default value is post.
         */
        public StartTranscriptionBuilder transcriptionEventMethod(Method method){
            this.transcriptionEventMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> the http method to use for the request to `transcriptionEventUrl`. GET or POST. Default value is POST.
         */
        public StartTranscriptionBuilder transcriptionEventMethod(String method){
            return transcriptionEventMethod(Method.fromValue(method));
        }

        /**
         * <i>(optional)</i> you may specify up to 12 <customParam/> elements nested within a <startTranscription> tag. these elements define optional user specified parameters that will be sent to the destination url when the real-time transcription is first started.
         */
        public StartTranscriptionBuilder customParams(CustomParam ... customParams){
            this.customParams = Arrays.asList(customParams);
            return this;
        }

        /**
         * <i>(optional)</i> you may specify up to 12 <customParam/> elements nested within a <startTranscription> tag. these elements define optional user specified parameters that will be sent to the destination url when the real-time transcription is first started.
         */
        public StartTranscriptionBuilder customParams(List<CustomParam> customParams){
            this.customParams = customParams;
            return this;
        }        
    }
}
