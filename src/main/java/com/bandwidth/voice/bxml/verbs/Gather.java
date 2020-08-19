
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * The Gather verb is used to collect digits for some period of time.
 */
@Builder
@XmlType(name = Gather.TYPE_NAME)
public class Gather implements Verb {
    public static final String TYPE_NAME = "Gather";

    /**
     * <i>(optional)</i> Using the AudioProducer inside the Gather verb will play the media until a digit is received.
     */
    @XmlElements({@XmlElement(name = PlayAudio.TYPE_NAME, type = PlayAudio.class),
                  @XmlElement(name = SpeakSentence.TYPE_NAME, type = SpeakSentence.class)})
    private List<AudioProducer> audioProducer;


    /**
     * <i>(optional)</i> URL to send <i>Gather event</i> to and request new BXML.
     */
    @XmlAttribute
    private URI gatherUrl;

    /**
     * <i>(optional)</i> he HTTP method to use for the request to gatherUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    private Method gatherMethod;

    /**
     * <i>(optional)</i> The username to send in the HTTP request to gatherUrl.
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to gatherUrl.
     */
    @XmlAttribute
    protected String password;

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
     * <i>(optional)</i> When any of these digits are pressed, it will terminate the Gather. Default value is none.
     */
    @XmlAttribute
    private String terminatingDigits;

    /**
     * <i>(optional)</i> Max number of digits to collect. Default value is 50.
     */
    @XmlAttribute
    private Integer maxDigits;

    /**
     * <i>(optional)</i> Time (in seconds) allowed between digit presses before automatically terminating the Gather. Default value is 5. Range: decimal values between 1 - 60.
     */
    @XmlAttribute
    private Double interDigitTimeout;

    /**
     * <i>(optional)</i> Time (in seconds) to pause after any audio from nested <SpeakSentence> or <PlayAudio> verb is played (in seconds) before terminating the Gather. Can use decimal values.
     */
    @XmlAttribute
    private Double firstDigitTimeout;

    /**
     * <i>(optional)</i> The number of times the audio prompt should be repeated if no digits are pressed. For example, if this value is 3, the nested audio clip will be played a maximum of three times. The delay between repetitions will be equal to firstDigitTimeout. Default value is 1. Range: 1-25.
     */
    @XmlAttribute
    private Integer repeatCount;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @XmlAttribute
    protected URI gatherFallbackUrl;

    @XmlAttribute
    protected Method gatherFallbackMethod;

    public static class GatherBuilder{

        /**
         * <i>(optional)</i> URL to send <i>Gather event</i> to and request new BXML. Converts string using URI.create(url).
         */
        public GatherBuilder gatherUrl(String url){
            return this.gatherUrl(URI.create(url));
        }

        /**
         * <i>(optional)</i> URL to send <i>Gather event</i> to and request new BXML.
         */
        public GatherBuilder gatherUrl(URI url){
            this.gatherUrl = url;
            return this;
        }

        public GatherBuilder gatherFallbackUrl(String url){
            return this.gatherFallbackUrl(URI.create(url));
        }

        public GatherBuilder gatherFallbackUrl(URI url){
            this.gatherFallbackUrl = url;
            return this;
        }

        public GatherBuilder gatherFallbackMethod(String method){
            return this.gatherFallbackMethod(Method.fromValue(method));
        }

        public GatherBuilder gatherFallbackMethod(Method method){
            this.gatherFallbackMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> Using the AudioProducers inside the Gather verb will play the media(s) until a digit is received.
         */
        public GatherBuilder audioProducer(List<AudioProducer> audioProducers){
            this.audioProducer = audioProducers;
            return this;
        }

        /**
         * <i>(optional)</i> Using the AudioProducer inside the Gather verb will play the media until a digit is received.
         */
        public GatherBuilder audioProducer(AudioProducer audioProducer){
            List<AudioProducer> list = new ArrayList<>();
            list.add(audioProducer);
            return this.audioProducer(list);
        }

        /**
         * <i>(optional)</i> he HTTP method to use for the request to gatherUrl. GET or POST. Default value is POST. Converts String to Method using Method.fromValue(method)
         */
        public GatherBuilder gatherMethod(String method){
            return this.gatherMethod(Method.fromValue(method));
        }

        /**
         * <i>(optional)</i> he HTTP method to use for the request to gatherUrl. GET or POST. Default value is POST.
         */
        public GatherBuilder gatherMethod(Method method){
            this.gatherMethod = method;
            return this;
        }
    }

}
