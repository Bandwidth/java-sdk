
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;

/**
 * The StopRecording verb is used to stop a recording that was previously started by a <StartRecording> verb.
 * <br/>
 *  If there is not an ongoing recording at the time of this verb's execution, it has no effect. If a previous recording was paused, will end it.
 */
@Builder
@XmlType(name = StopRecording.TYPE_NAME)
public class StopRecording implements Verb {
    public static final String TYPE_NAME = "StopRecording";

}
