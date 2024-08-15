/**
 * The {@code <CustomParam>} verb is used to define optional user specified parameters that will be sent to the destination URL when the real-time transcription is first started.
 * You may specify up to 12 {@code <CustomParam>} elements nested within a {@code <StartTranscription>} tag.
 */

package com.bandwidth.sdk.model.bxml;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = CustomParam.TYPE_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
/**
 *
 * @param name (str): The name of this parameter, up to 256 characters.
 * @param value (str): The value of this parameter, up to 2048 characters.
 *
 */
public class CustomParam {

    public static final String TYPE_NAME = "CustomParam";

    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String value;
}
