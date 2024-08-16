/**
 * The {@code <Pause>} verb is used to delay verb execution for a period of time, during which the call will be silent.
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_PAUSE_DURATION;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Pause.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
/**
 *
 * @param duration (str, optional): The time in seconds to pause. Default value is 1.
 */
public class Pause implements Verb {

    public static final String TYPE_NAME = "Pause";

    @XmlAttribute
    @Default
    protected Double duration = DEFAULT_PAUSE_DURATION;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
