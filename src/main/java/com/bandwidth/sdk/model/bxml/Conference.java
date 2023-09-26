/**
 * The {@code <Conference>} verb is used to join the current call into a conference.
 * Conference names are created and specified by your application. Conferences are implicitly created the first time your application uses a conference name, 
 * and they are implicitly deleted when the last member leaves the conference. We will create a unique ID for the conference, 
 * so your conference names can be whatever you want. If the conference ends and then you later use the same conference name, a new unique ID will be created.
 */

package com.bandwidth.sdk.model.bxml;

import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_CALLBACK_METHOD;
import static com.bandwidth.sdk.model.bxml.utils.BxmlConstants.DEFAULT_EMPTY_STRING;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Conference implements Verb {

    /**
     *      
     * @param name (str): The name of the conference. Can contain up to 100 characters of letters, numbers, and the symbols -, _, and .
     * @param mute (str, optional): A boolean value to indicate whether the member should be on mute in the conference. When muted, a member can hear others speak, but others cannot hear them speak. Defaults to false.
     * @param hold (str, optional): A boolean value to indicate whether the member should be on hold in the conference. When on hold, a member cannot hear others, and they cannot be heard. Defaults to false.
     * @param callIdsToCoach (str, optional): A comma-separated list of call ids to coach. When a call joins a conference with this attribute set, it will coach the listed calls.
     *          Those calls will be able to hear and be heard by the coach, but other calls in the conference will not hear the coach.
     * @param conferenceEventUrl (str, optional): URL to send Conference events to. The URL, method, username, and password are set by the BXML document that creates the conference,
     *          and all events related to that conference will be delivered to that same endpoint. If more calls join afterwards and also have this property (or any other webhook related properties like username and password),
     *          they will be ignored and the original webhook information will be used. This URL may be a relative endpoint.
     * @param conferenceEventMethod (str, optional): The HTTP method to use for the request to conferenceEventUrl. GET or POST. Default value is POST.
     * @param conferenceEventFallbackUrl (str, optional): A fallback url which, if provided, will be used to retry the conference webhook deliveries in case conferenceEventUrl fails to respond.
     * @param conferenceEventFallbackMethod (str, optional): The HTTP method to use to deliver the conference webhooks to conferenceEventFallbackUrl. GET or POST. Default value is POST.
     * @param username (str, optional):The username to send in the HTTP request to conferenceEventUrl.
     * @param password (str, optional): The password to send in the HTTP request to conferenceEventUrl.
     * @param fallbackUsername (str, optional): The username to send in the HTTP request to conferenceEventFallbackUrl.
     * @param fallbackPassword (str, optional): The password to send in the HTTP request to conferenceEventFallbackUrl.
     * @param tag (str, optional): A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or <Tag> verb, or cleared. May be cleared by setting tag="".
     *          Max length 256 characters. Defaults to None.
     * @param callbackTimeout (str, optional): This is the timeout (in seconds) to use when delivering webhooks for the conference.
     *          If not set, it will inherit the webhook timeout from the call that creates the conference. Can be any numeric value (including decimals) between 1 and 25 * @parameter 
     *         Nested Verbs:
     * @param     PlayAudio: (optional)
     * @param     SpeakSentence: (optional)
     * @param     StartRecording: (optional)
     * @param     StopRecording: (optional)
     * @param     PauseRecording: (optional)
     * @param     ResumeRecording: (optional)
     */

    public static final String TYPE_NAME = "Conference";

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    @XmlAttribute
    @Default
    protected Boolean mute = false;

    @XmlAttribute
    @Default
    protected Boolean hold = false;

    @XmlAttribute
    protected String conferenceEventUrl;

    @XmlAttribute
    @Default
    protected String conferenceEventMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected String conferenceEventFallbackUrl;

    @XmlAttribute
    @Default
    protected String conferenceEventFallbackMethod = DEFAULT_CALLBACK_METHOD;

    @XmlAttribute
    protected Double callbackTimeout;

    @XmlAttribute
    protected String tag;

    @XmlAttribute
    protected String username;

    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @XmlAttribute
    @Default
    protected String callIdsToCoach = DEFAULT_EMPTY_STRING;

    @Override
    public String getVerbName() {
        return TYPE_NAME;
    }
}
