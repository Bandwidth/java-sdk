/**
 * The {@code <Connect>} verb is used to connect a call to a BRTC endpoint.
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.net.URI;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
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
 * @param endpoints (list[Endpoint], optional): List of endpoints to connect. Defaults to [].
 * @param connectCallbackUrl (str, optional): URL to send the Connect event to. May be a relative URL. Defaults to None.
 * @param connectCallbackMethod (str, optional): The HTTP method to use for the request to connectCallbackUrl. GET or POST. Default value is POST. Defaults to None.
 * @param connectCallbackFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Connect callback delivery in case connectCallbackUrl fails to respond. Defaults to None.
 * @param connectCallbackFallbackMethod (str, optional): The HTTP method to use for the request to connectCallbackFallbackUrl. GET or POST. Default value is POST. Defaults to None.
 * @param username (str, optional): The username to send in the HTTP request to connectCallbackUrl. Defaults to None.
 * @param password (str, optional): The password to send in the HTTP request to connectCallbackUrl. Defaults to None.
 * @param fallbackUsername (str, optional): The username to send in the HTTP request to connectCallbackFallbackUrl. Defaults to None.
 * @param fallbackPassword (str, optional): The password to send in the HTTP request to connectCallbackFallbackUrl. Defaults to None.
 * @param tag (str, optional): A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or cleared. May be cleared by setting tag="" Max length 256 characters. Defaults to None.
 *
 */
public class Connect implements Verb {

    public static final String TYPE_NAME = "Connect";

    @XmlElements({
            @XmlElement(name = Endpoint.TYPE_NAME, type = Endpoint.class)
    })
    protected List<Endpoint> endpoints;

    @XmlAttribute
    protected URI connectCallbackUrl;

    @XmlAttribute
    @Default
    protected String connectCallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected URI connectCallbackFallbackUrl;

    @XmlAttribute
    @Default
    protected String connectCallbackFallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @XmlAttribute
    protected String tag;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
