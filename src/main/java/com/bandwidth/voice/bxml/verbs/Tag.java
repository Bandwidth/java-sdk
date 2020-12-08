
package com.bandwidth.voice.bxml.verbs;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import lombok.Builder;

/**
 * The Tag verb is used to set a new tag value without executing a callback. This new tag will be sent with all future callbacks unless overwritten by a future tag attribute or <Tag> verb, or cleared.
 */
@Builder
@XmlType(name = Tag.TYPE_NAME)
public class Tag implements Verb {
    public static final String TYPE_NAME = "Tag";

    /**
     * The new tag value. Leading and trailing whitespace is trimmed. Leave blank to clear the tag.
     */
    @XmlValue
    private String value;
}
