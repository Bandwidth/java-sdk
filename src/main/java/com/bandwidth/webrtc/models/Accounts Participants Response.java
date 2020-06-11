/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.webrtc.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for Accounts Participants Response type.
 */
public class Accounts Participants Response {
    /**
     * Default constructor
     */
    public Accounts Participants Response() {
    }

    /**
     * Initialization constructor.
     * @param participant
     * @param token
     */
    public Accounts Participants Response(
            Participant participant,
            String token) {
        this.participant = participant;
        this.token = token;
    }

    private Participant participant;
    private String token;
    /**
     * Getter for Participant.
     */
    @JsonGetter("participant")
    public Participant getParticipant() {
        return this.participant;
    }
    /**
     * Setter for Participant.
     */
    @JsonSetter("participant")
    public void setParticipant(Participant value) {
        this.participant = value;
    }

    /**
     * Getter for Token.
     * Auth token for the returned participant
     * This should be passed to the participant so that they can connect to the platform
     */
    @JsonGetter("token")
    public String getToken() {
        return this.token;
    }
    /**
     * Setter for Token.
     * Auth token for the returned participant
     * This should be passed to the participant so that they can connect to the platform
     */
    @JsonSetter("token")
    public void setToken(String value) {
        this.token = value;
    }

 

    /**
     * Builds a new {@link Accounts Participants Response.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Accounts Participants Response.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .participant(getParticipant())
            .token(getToken());
            return builder;
    }

    /**
     * Class to build instances of {@link Accounts Participants Response}
     */
    public static class Builder {
        private Participant participant;
        private String token;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for participant
         * @param participant
         * @return Builder
         */
        public Builder participant(Participant participant) {
            this.participant = participant;
            return this;
        }
        /**
         * Setter for token
         * @param token
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Builds a new {@link Accounts Participants Response} object using the set fields.
         * @return {@link Accounts Participants Response}
         */
        public Accounts Participants Response build() {
            return new Accounts Participants Response(participant,
                token);
        }
    }
}
