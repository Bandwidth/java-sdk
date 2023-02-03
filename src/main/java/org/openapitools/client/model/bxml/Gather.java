/**
 * The {@code <Gather>} verb is used to collect digits for some period of time.
 */

package org.openapitools.client.model.bxml;

import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_FIRSTDIGIT_TIMEOUT;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_INTERDIGIT_TIMEOUT;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_MAX_DIGITS;
import static org.openapitools.client.model.bxml.utils.BxmlConstants.DEFAULT_REPEAT_COUNT;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = Gather.TYPE_NAME)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Gather implements Verb {
    /**
     *      
     * @param gatherUrl (str, optional): URL to send Gather event to and request new BXML. May be a relative URL.
     * @param gatherMethod (str, optional): The HTTP method to use for the request to gather_url. GET or POST. Default value is POST.
     * @param gatherFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the Gather event callback delivery in case gather_url fails to respond.
     * @param gatherFallbackMethod (str, optional): The HTTP method to use to deliver the Gather event callback to gather_fallback_url. GET or POST. Default value is POST.
     * @param username (str, optional): The username to send in the HTTP request to gather_url.
     * @param password (str, optional): The password to send in the HTTP request to gather_url.
     * @param fallbackUsername (str, optional): The username to send in the HTTP request to gather_fallback_url.
     * @param fallbackPassword (str, optional): The password to send in the HTTP request to gather_fallback_url.
     * @param tag (str, optional): A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or <Tag> verb, or cleared.
     *     May be cleared by setting tag="". Max length 256 characters.
     * @param terminatingDigits (str, optional): When any of these digits are pressed, it will terminate the Gather. Default value is "", which disables this feature.
     * @param maxDigits (int, optional): Max number of digits to collect. Default value is 50. Range: decimal values between 1 - 50.
     * @param interDigitTimeout (int, optional): Time (in seconds) allowed between digit presses before automatically terminating the Gather. Default value is 5. Range: decimal values between 1 - 60.
     * @param firstDigitTimeout (int, optional): Time (in seconds) to pause after any audio from nested <SpeakSentence> or <PlayAudio> verb is played (in seconds) before terminating the Gather.
     *     Default value is 5. Range: decimal values between 0 - 60.
     * @param repeatCount (int, optional): The number of times the audio prompt should be played if no digits are pressed. For example, if this value is 3, the nested audio clip will be played a maximum of three times.
     *     The delay between repetitions will be equal to first_digit_timeout. Default value is 1. repeat_count * number of verbs must not be greater than 20.
     * 
     * Nested Verbs:
     *     @param PlayAudio: (optional) Using the PlayAudio inside the Gather verb will play the media until a digit is received.
     *     @param SpeakSentence: (optional) Using the SpeakSentence inside the Gather verb will speak the text until a digit is received.
     */       

    public static final String TYPE_NAME = "Gather";

    @XmlElements({
            @XmlElement(name = SpeakSentence.TYPE_NAME, type = SpeakSentence.class),
            @XmlElement(name = PlayAudio.TYPE_NAME, type = PlayAudio.class)
    })
    protected List<AudioProducer> children;

    @XmlAttribute
    @Getter
    protected String gatherUrl;

    @XmlAttribute
    @Getter
    protected String gatherFallbackUrl;

    @XmlAttribute
    @Default
    protected String gatherMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    @Default
    protected String gatherFallbackMethod = DEFAULT_CALLBACK_METHOD;

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

    @XmlAttribute
    protected String terminatingDigits;

    @XmlAttribute
    @Default
    protected Integer maxDigits = DEFAULT_MAX_DIGITS;

    @XmlAttribute
    @Default
    protected Double firstDigitTimeout = DEFAULT_FIRSTDIGIT_TIMEOUT;

    @XmlAttribute
    @Default
    protected Double interDigitTimeout = DEFAULT_INTERDIGIT_TIMEOUT;

    @XmlAttribute
    @Default
    protected int repeatCount = DEFAULT_REPEAT_COUNT;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
