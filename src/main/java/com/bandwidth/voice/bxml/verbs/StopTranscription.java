
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  The Stoptranscription verb is used to stop the real-time transcription previously started by a `<StartTranscriptionm>` verb.
 */
@Builder
@XmlType(name = StopTranscription.TYPE_NAME)
public class StopTranscription implements Verb {
    public static final String TYPE_NAME = "StopTranscription";

    /**
     * <i>(required)</i> The name of the real-time transcription to stop. This is either the user selected name when sending the <StartTranscription> verb, or the system generated name returned in the Real-Time Transcription Started webhook if <StartTranscription> was sent with no name attribute. If no name is specified, then all active call transcriptions will be stopped.
     */
    @XmlAttribute
    private String name;
}
