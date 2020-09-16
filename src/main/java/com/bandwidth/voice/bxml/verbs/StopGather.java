
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;

/**
 * Stop Gather Verb
 */
@Builder
@XmlType(name = StopGather.TYPE_NAME)
public class StopGather implements Verb {
    public static final String TYPE_NAME = "StopGather";

}
