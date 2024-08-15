/**
 * The {@code <StopStream>} verb is used to stop a stream that was started with a previous {@code <StartStream>} verb.
 */

package com.bandwidth.sdk.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = StopStream.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class StopStream implements Verb {
    /**
     *
     * @param name (str, optional): The name of the stream to stop.
     *      This is either the user selected name when sending the <StartStream> verb, or the system generated name returned in the Media Stream Started webhook if <StartStream> was sent with no name attribute.
     */

    public static final String TYPE_NAME = "StopStream";

    @XmlAttribute
    protected String name;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
