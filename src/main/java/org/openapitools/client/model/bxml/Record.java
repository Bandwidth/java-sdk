/**
 * The root {@code <Record>} verb is used to allow a segment of audio to be recorded during a call. At the end of the recording, a Record Complete event is generated.
 * This verb should probably be used if you are building a voice mail system or conference member introduction. For different use cases, you might want to take a look at {@code <StartRecording>}.
 */

package org.openapitools.client.model.bxml;

import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_RECORD_AUDIO_FORMAT;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_RECORD_MAX_DURATION;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_RECORD_SILENCE_TIMEOUT;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_TERMINATING_DIGITS;

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
@XmlType(name = Record.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Record implements TranscriptionProducer {
    /**
     *      
     * @param recordCompleteUrl (str, optional): URL to send the Record Complete event to once the recording has ended. Accepts BXML, and may be a relative URL. This callback will not be sent if the recording ended due to the call hanging up. Defaults to None.
     * @param recordCompleteMethod (str, optional): The HTTP method to use for the request to recordCompleteUrl. GET or POST. Default value is POST. Defaults to None.
     * @param recordCompleteFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Record Complete callback delivery in case recordCompleteUrl fails to respond. Defaults to None.
     * @param recordCompleteFallbackMethod (str, optional): The HTTP method to use to deliver the Record Complete callback to recordCompleteFallbackUrl. GET or POST. Default value is POST. Defaults to None.
     * @param recordingAvailableUrl (str, optional): URL to send the Recording Available event to once it has been processed. Does not accept BXML. May be a relative URL. Defaults to None.
     * @param recordingAvailableMethod (str, optional): The HTTP method to use for the request to recordingAvailableUrl. GET or POST. Default value is POST. Defaults to None.
     * @param transcribe (str, optional): A boolean value to indicate that recording should be transcribed. Transcription can succeed only for recordings of length greater than 500 milliseconds and less than 4 hours. Default is false. Defaults to None.
     * @param transcriptionAvailableUrl (str, optional): URL to send the Transcription Available event to once it has been processed. Does not accept BXML. May be a relative URL. Defaults to None.
     * @param transcriptionAvailableMethod (str, optional): The HTTP method to use for the request to transcriptionAvailableUrl. GET or POST. Default value is POST. Defaults to None.
     * @param username (str, optional): The username to send in the HTTP request to recordCompleteUrl, recordingAvailableUrl or transcriptionAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https). Defaults to None.
     * @param password (str, optional): The password to send in the HTTP request to recordCompleteUrl, recordingAvailableUrl or transcriptionAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https). Defaults to None.
     * @param fallbackUsername (str, optional): The username to send in the HTTP request to recordCompleteFallbackUrl. If specified, the URLs must be TLS-encrypted (i.e., https). Defaults to None.
     * @param fallbackPassword (str, optional): The password to send in the HTTP request to recordCompleteFallbackUrl. If specified, the URLs must be TLS-encrypted (i.e., https). Defaults to None.
     * @param tag (str, optional): A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or <Tag> verb, or cleared. May be cleared by setting tag="". Max length 256 characters. Defaults to None.
     * @param terminatingDigits (str, optional): When pressed, this digit will terminate the recording. Default value is “#”. This feature can be disabled with "". Defaults to None.
     * @param maxDuration (int, optional): Maximum length of recording (in seconds). Max 10800 (3 hours). Default value is 60. Defaults to None.
     * @param silenceTimeout (str, optional): Length of silence after which to end the recording (in seconds). Max is equivalent to the maximum maxDuration value. Default value is 0, which means no timeout. Defaults to None.
     * @param fileFormat (str, optional): The audio format that the recording will be saved as: mp3 or wav. Default value is wav. Defaults to None.
     * 
     */         

    public static final String TYPE_NAME = "Record";

    @XmlAttribute
    protected String recordCompleteUrl;

    @XmlAttribute
    protected String recordCompleteFallbackUrl;

    @XmlAttribute
    @Default
    protected String recordCompleteMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    @Default
    protected String recordCompleteFallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String tag;

    @XmlAttribute
    @Default
    protected String terminatingDigits = DEFAULT_TERMINATING_DIGITS;

    @XmlAttribute
    @Default
    protected Integer maxDuration = DEFAULT_RECORD_MAX_DURATION;

    @XmlAttribute
    @Default
    protected String fileFormat = DEFAULT_RECORD_AUDIO_FORMAT;

    @XmlAttribute
    protected String recordingAvailableUrl;

    @XmlAttribute
    @Default
    protected String recordingAvailableMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected Boolean transcribe;

    @XmlAttribute
    @Default
    protected Double silenceTimeout = DEFAULT_RECORD_SILENCE_TIMEOUT;

    @XmlAttribute
    protected String transcriptionAvailableUrl;

    @XmlAttribute
    protected String transcriptionAvailableMethod;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
