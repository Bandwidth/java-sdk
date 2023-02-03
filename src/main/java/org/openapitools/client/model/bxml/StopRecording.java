/**
 * The {@code <StopRecording>} verb is used to stop a recording that was previously started by a {@code <StartRecording>} verb.
 */

package org.openapitools.client.model.bxml;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class StopRecording implements Verb {

    public static final String TYPE_NAME = "StopRecording";

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
