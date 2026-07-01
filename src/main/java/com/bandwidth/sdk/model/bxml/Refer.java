/**
 * The {@code <Refer>} verb is used to initiate a SIP REFER on an existing call,
 * instructing the remote SIP endpoint to contact a third party directly.
 * On success the call is terminated — the remote endpoint redirects away from Bandwidth entirely.
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import java.net.URI;

import lombok.*;
import lombok.Builder.Default;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Refer.TYPE_NAME)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
/**
 *
 * @param sipUri (SipUri, required): The SIP URI to refer the call to. Must start with "sip:".
 * @param referCompleteUrl (str, optional): URL to send the Refer Complete event to and request new BXML for failure recovery. May be a relative URL. Defaults to None.
 * @param referCompleteMethod (str, optional): The HTTP method to use for the request to referCompleteUrl. GET or POST. Default value is POST.
 * @param tag (str, optional): A custom string that will be sent with these and all future callbacks unless overwritten by a future tag attribute or cleared. May be cleared by setting tag="". Max length 256 characters. Defaults to None.
 *
 */
public class Refer implements Verb {

    public static final String TYPE_NAME = "Refer";

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "ReferSipUri")
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    @EqualsAndHashCode
    public static class ReferSipUri {
        @XmlValue
        protected String uri;
    }

    @XmlElement(name = "SipUri", type = ReferSipUri.class)
    @NonNull
    protected ReferSipUri sipUri;

    @XmlAttribute
    protected URI referCompleteUrl;

    @XmlAttribute
    @Default
    protected String referCompleteMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String tag;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}

