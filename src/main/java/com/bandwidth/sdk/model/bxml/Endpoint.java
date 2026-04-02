/**
 * The {@code <Endpoint>} element is used within the {@code <Connect>} verb to define the endpoint to connect to.
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
@XmlType(name = Endpoint.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
/**
 *
 * @param endpointId (str): The ID of the endpoint to connect to.
 *
 */
public class Endpoint {

    public static final String TYPE_NAME = "Endpoint";

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String endpointId;
}
