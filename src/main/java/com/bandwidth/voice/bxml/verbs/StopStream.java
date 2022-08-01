
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;

/**
 *  The StopStream verb is used to stop a stream previously started by a `<StartStream>` verb.
 */
@Builder
@XmlType(name = StopStream.TYPE_NAME)
public class StopStream implements Verb {
    public static final String TYPE_NAME = "StopStream";

}
