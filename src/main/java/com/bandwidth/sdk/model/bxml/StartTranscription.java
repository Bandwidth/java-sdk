/**
 * The {@code <StartTranscription>} verb allows a segment of a call to be transcribed and optionally for the live transcription to be sent off to another destination for additional processing.
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

import com.bandwidth.sdk.model.CallDirectionEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = StartTranscription.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
/**
 *
 * @param name (str, optional): A name to refer to this transcription by. Used when sending <StopTranscription>. If not provided, it will default to the generated transcription id as sent in the Real-Time Transcription Started webhook.
 * @param tracks (str, optional): The part of the call to send a transcription from. inbound, outbound or both. Default is inbound.
 * @param destination (str, optional): A websocket URI to send the stream to. The audio from the specified tracks will be sent via websocket to this URL as base64-encoded PCMU/G711 audio. See below for more details on the websocket packet format.
 * @param transcriptionEventUrl (str, optional): URL to send the associated Webhook events to during this real-time transcription's lifetime. Does not accept BXML. May be a relative URL.
 * @param transcriptionEventMethod (str, optional): The HTTP method to use for the request to transcriptionEventUrl. GET or POST. Default value is POST.
 * @param username (str, optional): The username to send in the HTTP request to transcriptionEventUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
 * @param password (str, optional): The password to send in the HTTP request to transcriptionEventUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
 * @param stabilized (str, optional): Whether to send transcription update events to the specified destination only after they have become stable. Requires destination. Defaults to true.
 *
 *        Nested Verbs:
 *        @param  CustomParam: (optional) You may specify up to 12 <CustomParam/> elements nested within a <StartTranscription> tag.
 *          These elements define optional user specified parameters that will be sent to the destination URL when the real-time transcription is first started.
 *
 */
public class StartTranscription implements Verb {

    public static final String TYPE_NAME = "StartTranscription";

    @XmlAttribute
    protected String name;

    @XmlAttribute
    @Default
    protected CallDirectionEnum tracks = CallDirectionEnum.INBOUND;

    @XmlAttribute
    protected String destination;

    @XmlAttribute
    @Getter
    protected String transcriptionEventUrl;

    @XmlAttribute
    @Default
    protected String transcriptionEventMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

   @XmlAttribute
   @Default
   protected Boolean stabilized = true;

    @XmlElements({
            @XmlElement(name = CustomParam.TYPE_NAME, type = CustomParam.class)
    })
    protected List<CustomParam> customParams;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
