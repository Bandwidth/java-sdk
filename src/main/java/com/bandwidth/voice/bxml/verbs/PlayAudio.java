
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * The PlayAudio verb is used to play an audio file in the call. The URL of an audio file should be included in the body of the <PlayAudio> tag. If a relative URL is given, it is resolved relative to the endpoint that returned the BXML.
 *<br/>
 * <b>NOTE:</b> .wav files encoded as PCM or G711 are supported.
 */
@Builder
@XmlType(name = PlayAudio.TYPE_NAME)
public class PlayAudio implements Verb, AudioProducer {

    public static final String TYPE_NAME = "PlayAudio";

    /**
     * URL of audio to play
     */
    @XmlValue
    private URI audioUri;

    /**
     * username to authenticate at the audioUri endpoint
     */
    @XmlAttribute
    protected String username;

    /**
     * password to use to authenticate at the audioUri endpoint
     */
    @XmlAttribute
    protected String password;

    public static class PlayAudioBuilder{

        /**
         * URL of audio to play
         */
        public PlayAudioBuilder audioUri(String uri){
            return this.audioUri(URI.create(uri));
        }

        /**
         * URL of audio to play
         */
        public PlayAudioBuilder audioUri(URI uri){
            this.audioUri = uri;
            return this;
        }
    }
}
