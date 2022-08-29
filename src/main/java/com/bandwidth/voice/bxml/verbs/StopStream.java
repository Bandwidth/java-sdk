
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  The StopStream verb is used to stop a stream previously started by a `<StartStream>` verb.
 */
@Builder
@XmlType(name = StopStream.TYPE_NAME)
public class StopStream implements Verb {
    public static final String TYPE_NAME = "StopStream";

    /**
     * <i>(required)</i> A name to refer to this stream by. Used when sending [`<StopStream>`][1]. If not provided, a random name will be generated and sent in the [`Media Stream Started`][2] webook. 
     */
    @XmlAttribute
    private String name;
}
