
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Object representation of a StreamParam
 */
@Builder
@XmlType(name = StreamParam.TYPE_NAME)
public class StreamParam {
    public static final String TYPE_NAME = "StreamParam";

    /**
     * <i>(required)</i> The name of this parameter, up to 256 characters.
     */
    @XmlAttribute
    private String name;

    /**
     * <i>(required)</i> The value of this parameter, up to 2048 characters.
     */
    @XmlAttribute
    private String value;
}
