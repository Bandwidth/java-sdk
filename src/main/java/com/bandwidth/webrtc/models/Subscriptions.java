/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.webrtc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for Subscriptions type.
 */
public class Subscriptions {
    /**
     * Default constructor
     */
    public Subscriptions() {
    }

    /**
     * Initialization constructor.
     * @param sessionId
     * @param participants
     */
    public Subscriptions(
            String sessionId,
            List<ParticipantSubscription> participants) {
        this.sessionId = sessionId;
        this.participants = participants;
    }

    private String sessionId;
    private List<ParticipantSubscription> participants;
    /**
     * Getter for SessionId.
     * Session the subscriptions are associated with
     * If this is the only field, the subscriber will be subscribed to all participants in the session (including any participants that are later added to the session)
     */
    @JsonGetter("sessionId")
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Setter for SessionId.
     * Session the subscriptions are associated with
     * If this is the only field, the subscriber will be subscribed to all participants in the session (including any participants that are later added to the session)
     */
    @JsonSetter("sessionId")
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Getter for Participants.
     * Subset of participants to subscribe to in the session. Optional.
     */
    @JsonGetter("participants")
    public List<ParticipantSubscription> getParticipants() {
        return this.participants;
    }
    /**
     * Setter for Participants.
     * Subset of participants to subscribe to in the session. Optional.
     */
    @JsonSetter("participants")
    public void setParticipants(List<ParticipantSubscription> value) {
        this.participants = value;
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
     * Class to build instances of {@link Subscriptions}
     */
    public static class Builder {
        private String sessionId;
        private List<ParticipantSubscription> participants;

        /**
         * Initialization constructor
         */
        public Builder() {
        }

        /**
         * Initialization constructor
         */
        public Builder(String sessionId) {
            this.sessionId = sessionId;
        }

        /**
         * Setter for sessionId
         * @param sessionId
         * @return Builder
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Setter for participants
         * @param participants
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
            return new Subscriptions(sessionId,
                participants);
        }
    }
}
