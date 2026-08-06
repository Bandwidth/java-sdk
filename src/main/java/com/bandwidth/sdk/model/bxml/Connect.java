/**
 * The {@code <Connect>} verb is used to connect a call to a BRTC endpoint.
 */

package com.bandwidth.sdk.model.bxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.net.URI;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Connect.TYPE_NAME)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
/**
 *
 * @param endpoints (list[Endpoint], optional): List of endpoints to connect the call to.
 * @param eventCallbackUrl (str, optional): URL to send events to during the connection lifecycle. May be a relative URL.
 *
 */
public class Connect implements Verb {

    public static final String TYPE_NAME = "Connect";

    @XmlElement(name = Endpoint.TYPE_NAME)
    protected List<Endpoint> endpoints;

    @XmlAttribute
    protected URI eventCallbackUrl;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
