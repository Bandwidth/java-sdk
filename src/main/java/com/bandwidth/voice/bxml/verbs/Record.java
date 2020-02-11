
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The Record verb is used to Record the current XML execution to another URL.
 */
@Builder
@XmlType(name = Record.TYPE_NAME)
public class Record implements Verb {

    public static final String TYPE_NAME = "Record";

    /**
     * <i>(optional)</i> A boolean value.  If true, the recording will be submitted for transcription upon completion.  Defaults to false.
     */
    @XmlAttribute
    private boolean transcribe;

    /**
     * <i>(optional)</i> URL to send the transcriptionAvailable event to.
     */
    @XmlAttribute
    private URI transcriptionAvailableUrl;

    /**
     * <i>(optional)</i> The HTTP method to use for the request to transcriptionAvailableUrl. GET or POST. Default Value is POST.
     */
    @XmlAttribute
    private Method transcriptionAvailableMethod;

    /**
     * <i>(optional)</i> URL to send the Record Complete event to once it has ended. Accepts BXML.
     */
    @XmlAttribute
    private URI recordCompleteUrl;

    /**
     * <i>(optional)</i> The HTTP method to use for the request to recordCompleteUrl. GET or POST. Default Value is POST.
     */
    @XmlAttribute
    private Method recordCompleteMethod;

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
     * <i>(optional)</i> When pressed, this digit will terminate the recording. Default value is “#”.
     */
    @XmlAttribute
    protected String terminatingDigits;

    /**
     * <i>(optional)</i> Maximum length of recording (in seconds). Max 10800 (3 hours). Default value is 60.
     */
    @XmlAttribute
    protected int maxDuration;

    /**
     * <i>(optional)</i> The audio format that the recording will be saved as: mp3 or wav. Default value is wav.
     */
    @XmlAttribute
    protected String fileFormat;

    public static class RecordBuilder {

        /**
         * <b>(required)</b> URL to send the transcriptionAvailable event to.
         */
        public RecordBuilder transcriptionAvailableUrl(URI uri ){
            this.transcriptionAvailableUrl = uri;
            return this;
        }

        /**
         * <b>(required)</b> URL to send the transcriptionAvailable event to.
         */
        public RecordBuilder transcriptionAvailableUrl(String uri){
            return transcriptionAvailableUrl(URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transcriptionAvailableUrl. GET or POST. Default Value is POST.
         */
        public RecordBuilder transcriptionAvailableMethod(Method method){
            this.transcriptionAvailableMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to transcriptionAvailableUrl. GET or POST. Default Value is POST.  Converts String to Method using Method.fromValue(method)
         */
        public RecordBuilder transcriptionAvailableMethod(String method){
            return transcriptionAvailableMethod(Method.fromValue(method));
        }

        /**
         * <b>(required)</b> URL to send the Record Complete event to once it has ended. Accepts BXML.
         */
        public RecordBuilder recordCompleteUrl(URI uri ){
            this.recordCompleteUrl = uri;
            return this;
        }

        /**
         * <b>(required)</b> URL to request new BXML from. A Record event will be sent to this endpoint.  Converts to URI using URI.create(url)
         */
        public RecordBuilder recordCompleteUrl(String uri){
            return recordCompleteUrl(URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to recordCompleteUrl. GET or POST. Default Value is POST.
         */
        public RecordBuilder recordCompleteMethod(Method method){
            this.recordCompleteMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to recordCompleteUrl. GET or POST. Default Value is POST.  Converts String to Method using Method.fromValue(method)
         */
        public RecordBuilder recordCompleteMethod(String method){
            return recordCompleteMethod(Method.fromValue(method));
        }

        /**
         * <b>(required)</b> URL to send the Recording Available event to once it has been processed. Does not accept BXML.
         */
        public RecordBuilder recordingAvailableUrl(URI uri ){
            this.recordingAvailableUrl = uri;
            return this;
        }

        /**
         * <b>(required)</b> URL to send the Recording Available event to once it has been processed. Does not accept BXML.
         */
        public RecordBuilder recordingAvailableUrl(String uri){
            return recordingAvailableUrl(URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to recordingAvailableUrl. GET or POST. Default Value is POST.
         */
        public RecordBuilder recordingAvailableMethod(Method method){
            this.recordingAvailableMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to recordingAvailableUrl. GET or POST. Default Value is POST.  Converts String to Method using Method.fromValue(method)
         */
        public RecordBuilder recordingAvailableMethod(String method){
            return recordingAvailableMethod(Method.fromValue(method));
        }
    }
}
