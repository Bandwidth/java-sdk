/**
 * The {@code <SpeakSentence>} verb is used to play speech audio on the call.
 */

package com.bandwidth.sdk.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

import com.bandwidth.sdk.model.bxml.utils.TtsGender;
import com.bandwidth.sdk.model.bxml.utils.TtsLocale;
import com.bandwidth.sdk.model.bxml.utils.TtsVoice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = SpeakSentence.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class SpeakSentence implements AudioProducer {
    /**
     * 
     * @param text (str): The text to speak. Cannot be blank. Can be a mixture of plain text and SSML tags. 
     *     You can find a list of supported SSML tags here: https://dev.bandwidth.com/docs/voice/bxml/speakSentence/#supported-ssml-tags
     * @param voice (str, optional): Selects the voice of the speaker. Consult the voice column in the below table for valid values.
     *     If the voice attribute is present, gender and locale are ignored. You can find a list of supported voices here: https://dev.bandwidth.com/docs/voice/bxml/speakSentence/#supported-voices
     * @param gender (str, optional): Selects the gender of the speaker. Valid values are "male" or "female". Default "female".
     * @param locale (str, optional): Selects the locale of the speaker. Consult the locale column in the below table for valid values. Default "en_US"
     * 
     */       

    public static final String TYPE_NAME = "SpeakSentence";

    @XmlMixed
    @XmlAnyElement
    protected List<Object> innerTags;

    @XmlAttribute
    @Default
    protected TtsGender gender = TtsGender.FEMALE;

    @XmlAttribute
    @Default
    protected TtsLocale locale = TtsLocale.EN_US;

    @XmlAttribute
    protected TtsVoice voice;

    public SpeakSentence(String text) {
        this.innerTags = List.of(text);
        this.gender = TtsGender.FEMALE;
        this.locale = TtsLocale.EN_US;
    }

    public SpeakSentence(String text, TtsGender gender, TtsLocale locale, TtsVoice voice) {
        this.innerTags = List.of(text);
        this.gender = gender;
        this.locale = locale;
        this.voice = voice;
    }

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
