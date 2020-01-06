
package com.bandwidth.voice.bxml.verbs;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import lombok.Builder;

/**
 * The SpeakSentence verb translates text to speech and plays the resulting audio on the call
 * <br/>
 * Attributes of the speaker may be changed using these values. The default speaker is a female speaker with locale en_US.
 * <br/>
 * If a voice is chosen then gender and locale are over-written
 *
 *@author bandwidth
 */
@Builder
@XmlType(name = SpeakSentence.TYPE_NAME)
public class SpeakSentence implements Verb, AudioProducer {

    public static final String TYPE_NAME = "SpeakSentence";

    /**
     * String representation of audio to speak
     */
    @XmlValue
    private String text;

    /**
     * Selects the voice of the speaker.
     */
    @XmlAttribute
    private String voice;

    /**
     * Selects the gender of the speaker. Valid values are "male" or "female".
     * <br/>
     * Default "female"
     */
    @XmlAttribute
    private String gender;

    /**
     *Selects the locale of the speaker.
     * <br/>
     * Default "en_US"
     */
    @XmlAttribute
    private String locale;
}
