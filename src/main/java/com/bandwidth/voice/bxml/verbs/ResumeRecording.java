
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;

/**
 * The ResumeRecording verb is used to resume a recording that was previously paused by a <PauseRecording> verb.
 *<br/>
 * Audio that occurs between a <PauseRecording> verb and a <ResumeRecording> verb will not be present in the recording.
 *<br/>
 * The paused period will not be included in the duration of the recording and therefore will not contribute to the recording portion of the bill.
 *<br/>
 * If there is not an ongoing recording at the time of this verb's execution, it has no effect.
 */
@Builder
@XmlType(name = ResumeRecording.TYPE_NAME)
public class ResumeRecording implements Verb {
    public static final String TYPE_NAME = "ResumeRecording";

}
