/**
 * The {@code <Tag>} verb is used to set a new tag value without executing a callback. 
 * This new tag will be sent with all future callbacks unless overwritten by a future tag attribute or {@code <Tag>} verb, or cleared.
 */

package com.bandwidth.sdk.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Tag.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Tag implements Verb {
    /**
     * 
     * @param tag (str, optional): Custom tag value. Defaults to "".
     *
     */       

    public static final String TYPE_NAME = "Tag";

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tag;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
