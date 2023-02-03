/**
 * Represents a {@code <PhoneNumber> } or {@code <SipUri> } element inside a BXML Transfer or Forward verb
 */

package org.openapitools.client.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public interface OutboundDestination {
    String getUsername();

    String getPassword();

    String getTransferAnswerUrl();

    String getTransferAnswerMethod();

    String getTransferDisconnectUrl();

    String getTransferDisconnectMethod();

    String getFallbackUsername();

    String getFallbackPassword();

    String getTransferAnswerFallbackUrl();

    String getTransferAnswerFallbackMethod();

    String getTag();
}
