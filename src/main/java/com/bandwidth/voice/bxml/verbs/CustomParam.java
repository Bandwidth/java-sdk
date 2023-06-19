
package com.bandwidth.voice.bxml.verbs;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Builder;

/**
 * You may specify up to 12 <CustomParam/> elements nested within a <StartTranscription> tag. These elements define optional user specified parameters that will be sent to the destination URL when the real-time transcription is first started.
 */
@Builder
@XmlType(name = CustomParam.TYPE_NAME)
public class CustomParam implements Verb {
    public static final String TYPE_NAME = "CustomParam";

    /**
     * <b>(required)</b> The name of this parameter, up to 256 characters.
     */
    @XmlAttribute
    private String name;

    /**
     * <b>(required)</b> The value of this parameter, up to 2048 characters.
     */
    @XmlAttribute
    private String value;
}
