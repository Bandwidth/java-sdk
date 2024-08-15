/**
 * The {@code <StartStream>} verb allows a segment of a call to be sent off to another destination for additional processing.
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.UUID;

import com.bandwidth.sdk.model.CallDirectionEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = StartStream.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class StartStream implements Verb {
    /**
     *
     * @param name (str, optional): A name to refer to this stream by. Used when sending <StopStream>. If not provided, it will default to the generated stream id as sent in the Media Stream Started webhook.
     * @param tracks (str, optional): The part of the call to send a stream from. inbound, outbound or both. Default is inbound.
     * @param destination (str, optional): A websocket URI to send the stream to. The audio from the specified tracks will be sent via websocket to this URL as base64-encoded PCMU/G711 audio. See below for more details on the websocket packet format.
     * @param streamEventUrl (str, optional): URL to send the associated Webhook events to during this stream's lifetime. Does not accept BXML. May be a relative URL.
     * @param streamEventMethod (str, optional): The HTTP method to use for the request to streamEventUrl. GET or POST. Default value is POST.
     * @param username (str, optional): The username to send in the HTTP request to streamEventUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
     * @param password (str, optional): The password to send in the HTTP request to streamEventUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
     *
     *        Nested Verbs:
     *        @param  StreamParam: (optional) You may specify up to 12 <StreamParam/> elements nested within a <StartStream> tag.
     *          These elements define optional user specified parameters that will be sent to the destination URL when the stream is first started.
     *
     */

    public static final String TYPE_NAME = "StartStream";

    @XmlAttribute
    protected String name;

    @XmlAttribute
    @Default
    protected CallDirectionEnum tracks = CallDirectionEnum.INBOUND;

    @XmlAttribute
    protected String destination;

    @XmlAttribute
    @Getter
    protected String streamEventUrl;

    @XmlAttribute
    @Default
    protected String streamEventMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlElements({
            @XmlElement(name = StreamParam.TYPE_NAME, type = StreamParam.class)
    })
    protected List<StreamParam> streamParams;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
