
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;

/**
 * The PauseRecording verb is used to pause a recording that was previously started by a <StartRecording> verb.
 *<br/>
 * Audio that occurs between a <PauseRecording> verb and a <ResumeRecording> verb will not be present in the recording.
 *<br/>
 * The paused period will not be included in the duration of the recording and therefore will not contribute to the recording portion of the bill.
 *<br/>
 * If there is not an ongoing recording at the time of this verb's execution, it has no effect.
 *<br/>
 * The Hangup verb is also used to reject incoming calls either explicitly or implicitly.
 */
@Builder
@XmlType(name = PauseRecording.TYPE_NAME)
public class PauseRecording implements Verb {
    public static final String TYPE_NAME = "PauseRecording";

}
