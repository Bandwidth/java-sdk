/**
 * The {@code <ResumeRecording>} verb is used to resume a recording that was previously paused by a {@code <PauseRecording>} verb.
 */

package org.openapitools.client.model.bxml;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
public class ResumeRecording implements Verb {

    public static final String TYPE_NAME = "ResumeRecording";

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
