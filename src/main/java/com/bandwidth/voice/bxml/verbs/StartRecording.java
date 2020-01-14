
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The StartRecording verb allows a segment of a call to be recorded while other verbs are executing.
 *<br/>
 * All audio on both sides of the call will be recorded until the call ends or the <StopRecording> verb is used or the <PauseRecording> verb is used.
 */
@Builder
@XmlType(name = StartRecording.TYPE_NAME)
public class StartRecording implements Verb {
    public static final String TYPE_NAME = "StartRecording";

    /**
     * <i>(optional)</i> URL to send the Record Complete event to once it has ended. Accepts BXML.
     */
    @XmlAttribute
    private URI recordingAvailableUrl;

    /**
     * <i>(optional)</i> The HTTP method to use for the request to recordingAvailableUrl. GET or POST. Default Value is POST.
     */
    @XmlAttribute
    private Method recordingAvailableMethod;

    /**
     * <i>(optional)</i> A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or cleared.
     * <br/>
     * May be cleared by setting tag=""
     * <br/>
     * Max length 256 characters.
     */
    @XmlAttribute
    private String tag;

    /**
     * <i>(optional)</i> The username to send in the HTTP request to recordCompleteUrl or recordingAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to recordCompleteUrl or recordingAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
     */
    @XmlAttribute
    protected String password;

    /**
     * <i>(optional)</i> A boolean value indicating whether or not the recording file should separate each side of the call into its own audio channel. Default value is false. true results in two channels.
     */
    @XmlAttribute
    protected boolean multiChannel;

    /**
     * <i>(optional)</i> The audio format that the recording will be saved as: mp3 or wav. Default value is wav.
     */
    @XmlAttribute
    protected String fileFormat;

    public static class StartRecordingBuilder {

        /**
         * <b>(required)</b> URL to send the Recording Available event to once it has been processed. Does not accept BXML.
         */
        public StartRecordingBuilder recordingAvailableUrl(URI uri ){
            this.recordingAvailableUrl = uri;
            return this;
        }

        /**
         * <b>(required)</b> URL to send the Recording Available event to once it has been processed. Does not accept BXML.
         */
        public StartRecordingBuilder recordingAvailableUrl(String uri){
            return recordingAvailableUrl(URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to recordingAvailableUrl. GET or POST. Default Value is POST.
         */
        public StartRecordingBuilder recordingAvailableMethod(Method method){
            this.recordingAvailableMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to recordingAvailableUrl. GET or POST. Default Value is POST.  Converts String to Method using Method.fromValue(method)
         */
        public StartRecordingBuilder recordingAvailableMethod(String method){
            return recordingAvailableMethod(Method.fromValue(method));
        }
    }

}
