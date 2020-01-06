
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The Pause verb is used to delay for a set period of time. Silence will be heard.
 */
@Builder
@XmlType(name = Pause.TYPE_NAME)
public class Pause implements Verb {
    public static final String TYPE_NAME = "Pause";

    /**
     * <i>(optional)</i> The 'duration' attribute specifies how many seconds Bandwidth will wait silently before continuing on. Default value is 1. Range: decimal values between 0.1 - 86400.
     */
    @XmlAttribute
    private Double duration;
}
