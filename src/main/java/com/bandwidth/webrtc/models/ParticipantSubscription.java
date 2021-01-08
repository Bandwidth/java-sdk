/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.webrtc.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ParticipantSubscription type.
 */
public class ParticipantSubscription {
    private String participantId;

    /**
     * Default constructor.
     */
    public ParticipantSubscription() {
    }

    /**
     * Initialization constructor.
     * @param participantId String value for participantId.
     */
    public ParticipantSubscription(
            String participantId) {
        this.participantId = participantId;
    }

    /**
     * Getter for ParticipantId.
     * Participant the subscriber should be subscribed to
     * @return Returns the String
     */
    @JsonGetter("participantId")
    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * Setter for ParticipantId.
     * Participant the subscriber should be subscribed to
     * @param participantId Value for String
     */
    @JsonSetter("participantId")
    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * Converts this ParticipantSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ParticipantSubscription [" + "participantId=" + participantId + "]";
    }

    /**
     * Builds a new {@link ParticipantSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ParticipantSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(participantId);
        return builder;
    }

    /**
     * Class to build instances of {@link ParticipantSubscription}.
     */
    public static class Builder {
        private String participantId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param participantId String value for participantId.
         */
        public Builder(String participantId) {
            this.participantId = participantId;
        }

        /**
         * Setter for participantId.
         * @param participantId String value for participantId.
         * @return Builder
         */
        public Builder participantId(String participantId) {
            this.participantId = participantId;
            return this;
        }

        /**
         * Builds a new {@link ParticipantSubscription} object using the set fields.
         * @return {@link ParticipantSubscription}
         */
        public ParticipantSubscription build() {
            return new ParticipantSubscription(participantId);
        }
    }
}
