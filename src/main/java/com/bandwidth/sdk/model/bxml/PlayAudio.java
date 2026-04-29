/**
 * The {@code <PlayAudio>} verb is used to play an audio file in the call.
 * The URL of an audio file should be included in the body of the {@code <PlayAudio>} tag. If a relative URL is given, it is resolved relative to the endpoint that returned the BXML.
 */
package com.bandwidth.sdk.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = PlayAudio.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
/**
 *
 * @param audioUri (str): The URL of the audio file to play. May be a relative URL.
 * @param username (str, optional): The username to send in the HTTP request to audio_uri.
 * @param password (str, optional): The password to send in the HTTP request to audio_uri.
 *
 */
public class PlayAudio implements AudioProducer {

    public static final String TYPE_NAME = "PlayAudio";

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlValue
    protected String audioUri;

    public PlayAudio(String audioUri) {
        this.audioUri = audioUri;
    }

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
