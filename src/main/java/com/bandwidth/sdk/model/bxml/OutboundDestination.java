/**
 * Represents a {@code <PhoneNumber> } or {@code <SipUri> } element inside a BXML Transfer or Forward verb
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.experimental.SuperBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@EqualsAndHashCode(callSuper = false)

@XmlTransient
abstract public class OutboundDestination {
    @XmlAttribute
    protected String uui;
    public String getUui() {
        return uui;
    }

    @XmlAttribute
    protected String username;
    public String getUsername() {
        return username;
    }

    @XmlAttribute
    protected String password;
    public String getPassword() {
        return password;
    }

    @XmlAttribute
    protected String fallbackUsername;
    public String getFallbackUsername() {
        return fallbackUsername;
    }

    @XmlAttribute
    protected String fallbackPassword;
    public String getFallbackPassword() {
        return fallbackPassword;
    }

    @XmlAttribute
    protected String transferAnswerUrl;
    public String getTransferAnswerUrl() {
        return transferAnswerUrl;
    }

    @XmlAttribute
    @Default
    protected String transferAnswerMethod = DEFAULT_CALLBACK_METHOD;
    public String getTransferAnswerMethod() {
        return transferAnswerMethod;
    }

    @XmlAttribute
    protected String transferAnswerFallbackUrl;
    public String getTransferAnswerFallbackUrl() {
        return transferAnswerFallbackUrl;
    }

    @XmlAttribute
    @Default
    protected String transferAnswerFallbackMethod = DEFAULT_CALLBACK_METHOD;
    public String getTransferAnswerFallbackMethod() {
        return transferAnswerFallbackMethod;
    }

    @XmlAttribute
    protected String transferDisconnectUrl;
    public String getTransferDisconnectUrl() {
        return transferDisconnectUrl;
    }

    @XmlAttribute
    @Default
    protected String transferDisconnectMethod = DEFAULT_CALLBACK_METHOD;
    public String getTransferDisconnectMethod() {
        return transferDisconnectMethod;
    }

    @XmlAttribute
    protected String tag;
    public String getTag() {
        return tag;
    }
}
