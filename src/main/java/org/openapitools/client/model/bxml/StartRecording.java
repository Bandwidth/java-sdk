/**
 * The {@code <StartRecording>} verb allows a segment of a call or conference to be recorded while other verbs are executing.
 */

package org.openapitools.client.model.bxml;

import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_RECORD_AUDIO_FORMAT;

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
@XmlType(name = StartRecording.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class StartRecording implements TranscriptionProducer {
    /**
     * 
     * @param recordingAvailableUrl (str, optional): URL to send the Recording Available event to once it has been processed. Does not accept BXML. May be a relative URL. Defaults to None.
     * @param recordingAvailableMethod (str, optional): The HTTP method to use for the request to recordingAvailableUrl. GET or POST. Default value is POST.
     * @param transcribe (str, optional): A boolean value to indicate that recording should be transcribed. Transcription can succeed only for recordings of length greater than 500 milliseconds and less than 4 hours. Default is false. Defaults to None.
     * @param transcriptionAvailableUrl (str, optional): URL to send the Transcription Available event to once it has been processed. Does not accept BXML. May be a relative URL. Defaults to None.
     * @param transcriptionAvailableMethod (str, optional): The HTTP method to use for the request to transcriptionAvailableUrl. GET or POST. Default value is POST. Defaults to None.
     * @param username (str, optional): The username to send in the HTTP request to recordCompleteUrl, recordingAvailableUrl or transcriptionAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https). Defaults to None.
     * @param password (str, optional): The password to send in the HTTP request to recordCompleteUrl, recordingAvailableUrl or transcriptionAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https). Defaults to None.
     * @param tag (str, optional): A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or <Tag> verb, or cleared. May be cleared by setting tag="". Max length 256 characters. Defaults to None.
     * @param fileFormat (str, optional): The audio format that the recording will be saved as: mp3 or wav. Default value is wav. Defaults to None.            max_duration (str, optional): Maximum length of recording (in seconds). Max 10800 (3 hours). Default value is 60. Defaults to None.
     * @param multiChannel (str, optional): A boolean value indicating whether or not the recording file should separate each side of the call into its own audio channel. Default value is false.
     *
     */        

    public static final String TYPE_NAME = "StartRecording";

    @XmlAttribute
    protected String recordingAvailableUrl;

    @XmlAttribute
    @Default
    protected String recordingAvailableMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected Boolean transcribe;

    @XmlAttribute
    protected String transcriptionAvailableUrl;

    @XmlAttribute
    protected String transcriptionAvailableMethod;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String tag;

    @XmlAttribute
    @Default
    protected String fileFormat = DEFAULT_RECORD_AUDIO_FORMAT;

    @XmlAttribute
    @Default
    protected Boolean multiChannel = false;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
