/**
 * The {@code <PauseRecording>} verb is used to pause a recording that was previously started by a <StartRecording> verb.
 * Audio that occurs between a <PauseRecording> verb and a <ResumeRecording> verb will not be present in the recording.
 * The paused period will not be included in the duration of the recording and therefore will not contribute to the recording portion of the bill.
 * If there is not an ongoing recording at the time of this verb's execution, it has no effect.
 */
package org.openapitools.client.model.bxml;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
public class PauseRecording implements Verb {

    public static final String TYPE_NAME = "PauseRecording";

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
