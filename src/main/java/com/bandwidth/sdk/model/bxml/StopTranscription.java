/**
 * The {@code <StopTranscription>} verb is used to stop a real-time transcription that was started with a previous {@code <StartTranscription>} verb.
 */

package com.bandwidth.sdk.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = StopTranscription.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class StopTranscription implements Verb {
    /**
     *
     * @param name (str, optional): The name of the real-time transcription to stop.
     *      This is either the user selected name when sending the <StartTranscription> verb, or the system generated name returned in the Media Transcription Started webhook if <StartTranscription> was sent with no name attribute.
     */

    public static final String TYPE_NAME = "StopTranscription";

    @XmlAttribute
    protected String name;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
