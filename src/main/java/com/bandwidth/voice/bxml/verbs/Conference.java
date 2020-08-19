
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import java.util.List;

/**
 * The PlayAudio verb is used to play an audio file in the call. The URL of an audio file should be included in the body of the <PlayAudio> tag. If a relative URL is given, it is resolved relative to the endpoint that returned the BXML.
 *<br/>
 * <b>NOTE:</b> .wav files encoded as PCM or G711 are supported.
 */
@Builder
@XmlType(name = Conference.TYPE_NAME)
public class Conference implements Verb {

    public static final String TYPE_NAME = "Conference";

    /**
     * The name of the conference with alphanumeric characters and the symbols -, _, and . with maximum length of 100 characters.
     */
    @XmlValue
    private String name;

    /**
     * (optional) A boolean value to indicate whether the member should be on mute in the conference. When muted, a member can hear others speak, but others cannot hear them speak. Defaults to false
     */
    @XmlAttribute
    protected boolean mute;

    /**
     * (optional) A boolean value to indicate whether the member should be on hold in the conference. When on hold, a member cannot hear others, and they cannot be heard. Defaults to false
     */
    @XmlAttribute
    protected boolean hold;

    /**
     * (optional) A comma-separated list of call ids to coach. When a call joins a conference with this attribute set, it will coach the listed calls. Those calls will be able to hear and be heard by the coach, but other calls in the conference will not hear the coach.
     * 
     * Calls may be added to the conference in any order - if the matching calls are not already in the conference, then once the matching calls are added, the coach will be able to hear and speak to the matching calls. Note that this will not add the matching calls to the conference; each call must individually execute a <Conference> verb to join.
     * 
     * A conference may only have one coach.
     */
    @XmlAttribute
    protected String callIdsToCoach;

    /**
     * (optional) URL to send Conference events to. The URL, method, username, and password are set by the BXML document that creates the conference, and all events related to that conference will be delivered to that same endpoint. If more calls join afterwards and also have this property (or any other callback related properties like username and password), they will be ignored and the original callback information will be used.
     */
    @XmlAttribute
    protected URI conferenceEventUrl;

    /**
     * (optional) The HTTP method to use for the request to conferenceEventUrl. GET or POST. Default value is POST.
     */
    @XmlAttribute
    protected Method conferenceEventMethod;

    /**
     * <i>(optional)</i> The username to send in the HTTP request to conferenceEventUrl.
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to conferenceEventUrl.
     */
    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected String fallbackUsername;

    @XmlAttribute
    protected String fallbackPassword;

    @XmlAttribute
    protected URI conferenceEventFallbackUrl;

    @XmlAttribute
    protected Method conferenceEventFallbackMethod;


    /**
     * <i>(optional)</i> A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or cleared.
     * <br/>
     * May be cleared by setting tag=""
     * <br/>
     * Max length 256 characters.
     */
    @XmlAttribute
    private String tag;

    public static class ConferenceBuilder{

        /**
         */
        public ConferenceBuilder conferenceEventUrl(String uri){
            return this.conferenceEventUrl(URI.create(uri));
        }

        /**
         */
        public ConferenceBuilder conferenceEventUrl(URI uri){
            this.conferenceEventUrl = uri;
            return this;
        }

        /**
         * <i>(optional)</i> he HTTP method to use for the request to conferenceEventMethod. GET or POST. Default value is POST. Converts String to Method using Method.fromValue(method)
         */
        public ConferenceBuilder conferenceEventMethod(String method){
            return this.conferenceEventMethod(Method.fromValue(method));
        }

        /**
         * <i>(optional)</i> he HTTP method to use for the request to conferenceEventMethod. GET or POST. Default value is POST.
         */
        public ConferenceBuilder conferenceEventMethod(Method method){
            this.conferenceEventMethod = method;
            return this;
        }


        public ConferenceBuilder conferenceEventFallbackUrl(String uri){
            return this.conferenceEventFallbackUrl(URI.create(uri));
        }

        public ConferenceBuilder conferenceEventFallbackUrl(URI uri){
            this.conferenceEventFallbackUrl = uri;
            return this;
        }

        public ConferenceBuilder conferenceEventFallbackMethod(String method){
            return this.conferenceEventFallbackMethod(Method.fromValue(method));
        }

        public ConferenceBuilder conferenceEventFallbackMethod(Method method){
            this.conferenceEventFallbackMethod = method;
            return this;
        }

        /**
         * (optional) A list of call ids to coach. When a call joins a conference with this attribute set, it will coach the listed calls. Those calls will be able to hear and be heard by the coach, but other calls in the conference will not hear the coach.
         * 
         * Calls may be added to the conference in any order - if the matching calls are not already in the conference, then once the matching calls are added, the coach will be able to hear and speak to the matching calls. Note that this will not add the matching calls to the conference; each call must individually execute a <Conference> verb to join.
         * 
         * A conference may only have one coach.
         */
        public ConferenceBuilder callIdsToCoach(List<String> callIds){
            this.callIdsToCoach = String.join(",", callIds);
            return this;
        }
    }
}
