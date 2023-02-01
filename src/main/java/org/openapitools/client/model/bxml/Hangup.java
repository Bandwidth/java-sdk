/**
 * The {@code <Hangup>} verb is used to hang up the current call.
 */

package org.openapitools.client.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Hangup.TYPE_NAME)
@NoArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Hangup implements Verb {

    public static final String TYPE_NAME = "Hangup";

    @Override
    public String toString() {
        return TYPE_NAME;
    }

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}