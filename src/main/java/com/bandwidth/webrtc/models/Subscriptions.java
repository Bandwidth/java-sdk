/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.webrtc.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Subscriptions type.
 */
public class Subscriptions {
    private String sessionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ParticipantSubscription> participants;

    /**
     * Default constructor.
     */
    public Subscriptions() {
    }

    /**
     * Initialization constructor.
     * @param  sessionId  String value for sessionId.
     * @param  participants  List of ParticipantSubscription value for participants.
     */
    public Subscriptions(
            String sessionId,
            List<ParticipantSubscription> participants) {
        this.sessionId = sessionId;
        this.participants = participants;
    }

    /**
     * Getter for SessionId.
     * Session the subscriptions are associated with If this is the only field, the subscriber will
     * be subscribed to all participants in the session (including any participants that are later
     * added to the session)
     * @return Returns the String
     */
    @JsonGetter("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Setter for SessionId.
     * Session the subscriptions are associated with If this is the only field, the subscriber will
     * be subscribed to all participants in the session (including any participants that are later
     * added to the session)
     * @param sessionId Value for String
     */
    @JsonSetter("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Getter for Participants.
     * Subset of participants to subscribe to in the session. Optional.
     * @return Returns the List of ParticipantSubscription
     */
    @JsonGetter("participants")
    public List<ParticipantSubscription> getParticipants() {
        return participants;
    }

    /**
     * Setter for Participants.
     * Subset of participants to subscribe to in the session. Optional.
     * @param participants Value for List of ParticipantSubscription
     */
    @JsonSetter("participants")
    public void setParticipants(List<ParticipantSubscription> participants) {
        this.participants = participants;
    }

    /**
     * Converts this Subscriptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Subscriptions [" + "sessionId=" + sessionId + ", participants=" + participants
                + "]";
    }

    /**
     * Builds a new {@link Subscriptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Subscriptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(sessionId)
                .participants(getParticipants());
        return builder;
    }

    /**
     * Class to build instances of {@link Subscriptions}.
     */
    public static class Builder {
        private String sessionId;
        private List<ParticipantSubscription> participants;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  sessionId  String value for sessionId.
         */
        public Builder(String sessionId) {
            this.sessionId = sessionId;
        }

        /**
         * Setter for sessionId.
         * @param  sessionId  String value for sessionId.
         * @return Builder
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Setter for participants.
         * @param  participants  List of ParticipantSubscription value for participants.
         * @return Builder
         */
        public Builder participants(List<ParticipantSubscription> participants) {
            this.participants = participants;
            return this;
        }

        /**
         * Builds a new {@link Subscriptions} object using the set fields.
         * @return {@link Subscriptions}
         */
        public Subscriptions build() {
            return new Subscriptions(sessionId, participants);
        }
    }
}
