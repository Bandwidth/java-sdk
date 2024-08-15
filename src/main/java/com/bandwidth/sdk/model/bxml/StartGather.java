/**
 * The {@code <StartGather>} verb is used to get asynchronous notifications of DTMF digits collected in the call while other verbs are executed.
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;

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
@XmlType(name = StartGather.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
/**
 *
 * @param dtmfUrl (str): URL to send the DTMF event to. May be a relative URL..
 * @param dtmfMethod (str, optional): The HTTP method to use for the request to dtmfUrl. GET or POST. Default value is POST. Defaults to None.
 * @param username (str, optional): The username to send in the HTTP request to dtmfUrl. Defaults to None.
 * @param password (str, optional): The password to send in the HTTP request to dtmfUrl. Defaults to None.
 * @param tag (str, optional):  A custom string that will be sent with these and all future callbacks unless overwritten by a future tag attribute or cleared. May be cleared by setting tag="" Max length 256 characters. Defaults to None.
 *
 */
public class StartGather implements Verb {

    public static final String TYPE_NAME = "StartGather";

    @XmlAttribute
    @Getter
    protected String dtmfUrl;

    @XmlAttribute
    @Default
    protected String dtmfMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String tag;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
