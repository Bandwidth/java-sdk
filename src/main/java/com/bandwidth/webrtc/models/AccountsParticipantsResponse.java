/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.webrtc.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for AccountsParticipantsResponse type.
 */
public class AccountsParticipantsResponse {
    /**
     * Default constructor
     */
    public AccountsParticipantsResponse() {
    }

    /**
     * Initialization constructor.
     * @param participant
     * @param token
     */
    public AccountsParticipantsResponse(
            Participant participant,
            String token) {
        this.participant = participant;
        this.token = token;
    }

    private Participant participant;
    private String token;
    /**
     * Getter for Participant.
     * A participant object
     */
    @JsonGetter("participant")
    public Participant getParticipant() {
        return this.participant;
    }
    /**
     * Setter for Participant.
     * A participant object
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
     * Builds a new {@link AccountsParticipantsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountsParticipantsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .participant(getParticipant())
            .token(getToken());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountsParticipantsResponse}
     */
    public static class Builder {
        private Participant participant;
        private String token;



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
         * Builds a new {@link AccountsParticipantsResponse} object using the set fields.
         * @return {@link AccountsParticipantsResponse}
         */
        public AccountsParticipantsResponse build() {
            return new AccountsParticipantsResponse(participant,
                token);
        }
    }
}
