/**
 * The {@code <Redirect>} verb is used to redirect the current XML execution to another URL.
 */

package org.openapitools.client.model.bxml;

import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Redirect.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Redirect implements Verb {
    /**
     *      
     * @param redirectUrl (str): URL to request new BXML from. A Redirect event will be sent to this endpoint. May be a relative URL. Defaults to None.
     * @param redirectMethod (str, optional): The HTTP method to use for the request to redirectUrl. GET or POST. Defaults to None.
     * @param redirectFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Redirect callback delivery in case redirectUrl fails to respond. Defaults to None.
     * @param redirectFallbackMethod (str, optional): The HTTP method to use to deliver the Redirect callback to redirectFallbackUrl. GET or POST. Default value is POST. Defaults to None.
     * @param username (str, optional): The username to send in the HTTP request to redirectUrl. Defaults to None.
     * @param password (str, optional): The password to send in the HTTP request to redirectUrl. Defaults to None.
     * @param fallbackUsername (str, optional): The username to send in the HTTP request to redirectFallbackUrl. Defaults to None.
     * @param fallbackPassword (str, optional): The password to send in the HTTP request to redirectFallbackUrl. Defaults to None.
     * @param tag (str, optional): A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or <Tag> verb, or cleared. May be cleared by setting tag="". Max length 256 characters. Defaults to None.
     *
     */            

    public static final String TYPE_NAME = "Redirect";

    @XmlTransient
    private String eventType;

    @XmlAttribute(required = true)
    protected String redirectUrl;

    @XmlAttribute
    protected String redirectFallbackUrl;

    @XmlAttribute
    @Default
    protected String redirectMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    @Default
    protected String redirectFallbackMethod = DEFAULT_CALLBACK_METHOD;

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
