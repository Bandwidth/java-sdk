/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.voice.models;

import com.bandwidth.DateTimeHelper;
import com.bandwidth.internal.OptionalNullable;
import com.bandwidth.voice.models.Tracks;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is a model class for RealTimeTranscription type.
 */
public class RealTimeTranscription {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accountId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String callId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transcriptionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Tracks tracks;
    /**
     * Default constructor.
     */
    public RealTimeTranscription() {
    }

    /**
     * Initialization constructor.
     * @param  accountId  String value for accountId.
     * @param  callId  String value for callId.
     * @param  transcriptionId  String value for transcriptionId.
     * @param  tracks  Object value for tracks.
     */
    public RealTimeTranscription(
            String accountId,
            String callId,
            String transcriptionId,
	    Tracks tracks) {
        this.accountId = accountId;
        this.callId = callId;
        this.transcriptionId = transcriptionId;
        this.tracks = tracks;
    }

    /**
     * Internal initialization constructor.
     */
    protected RealTimeTranscription(String accountId, String callId, String transcriptionId, Tracks tracks) {
        this.accountId = accountId;
        this.callId = callId;
        this.transcriptionId = transcriptionId;
        this.tracks = tracks;
    }

    /**
     * Getter for AccountId.
     * @return Returns the String
     */
    @JsonGetter("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * @param accountId Value for String
     */
    @JsonSetter("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for CallId.
     * @return Returns the String
     */
    @JsonGetter("callId")
    public String getCallId() {
        return callId;
    }

    /**
     * Setter for CallId.
     * @param callId Value for String
     */
    @JsonSetter("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Getter for TranscriptionId.
     * @return Returns the String
     */
    @JsonGetter("transcriptionId")
    public String getTranscriptionId() {
        return transcriptionId;
    }

    /**
     * Setter for TranscriptionId.
     * @param transcriptionId Value for String
     */
    @JsonSetter("transcriptionId")
    public void setTranscriptionId(String transcriptionId) {
        this.transcriptionId = transcriptionId;
    }

    /**
     * Getter for Tracks.
     * @return Returns the String
     */
    @JsonGetter("tracks")
    public tracks getTracks() {
        return tracks;
    }

    /**
     * Setter for Tracks.
     * @param tracks Value for String
     */
    @JsonSetter("tracks")
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    /**
     * Converts this RealTimeTranscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RealTimeTranscription [" + "accountId=" + accountId + ", callId=" + callId + ", transcriptionId=" + transcriptionId + ", tracks=" + tracks + "]";
    }

    /**
     * Builds a new {@link RealTimeTranscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RealTimeTranscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountId(getAccountId())
                .callId(getCallId())
                .transcriptionId(getTranscriptionId())
	        .tracks(getTracks());
        return builder;
    }

    /**
     * Class to build instances of {@link RealTimeTranscription}.
     */
    public static class Builder {
        private String accountId;
        private String callId;
        private String transcriptionId;
        private Tracks tracks;

        /**
         * Setter for accountId.
         * @param  accountId  String value for accountId.
         * @return Builder
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Setter for callId.
         * @param  callId  String value for callId.
         * @return Builder
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Setter for transcriptionId.
         * @param  transcriptionId  String value for transcriptionId.
         * @return Builder
         */
        public Builder transcriptionId(String transcriptionId) {
            this.transcriptionId = transcriptionId;
            return this;
        }

        /**
         * Setter for tracks.
         * @param  tracks  tracks value for tracks.
         * @return Builder
         */
        public Builder tracks(Tracks tracks) {
            this.tracks = tracks;
            return this;
        }

        /**
         * Builds a new {@link RealTimeTranscription} object using the set fields.
         * @return {@link RealTimeTranscription}
         */
        public RealTimeTranscription build() {
            return new RealTimeTranscription(accountId, callId, transcriptionId, tracks);
        }
    }
}
