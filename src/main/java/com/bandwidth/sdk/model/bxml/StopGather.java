/**
 * The {@code <StopGather>} verb is used to stop the DTMF detection that was previously started by a {@code <StartGather>} verb.
 */

package org.openapitools.client.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = StopGather.TYPE_NAME)
@NoArgsConstructor
@EqualsAndHashCode
public class StopGather implements Verb {

    public static final String TYPE_NAME = "StopGather";

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
