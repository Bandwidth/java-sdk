/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TranscriptionsItem type.
 */
public class TranscriptionsItem {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transcriptionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transcriptionUrl;
    /**
     * Default constructor.
     */
    public TranscriptionsItem() {
    }

    /**
     * Initialization constructor.
     * @param  transcriptionId  String value for transcriptionId.
     * @param  transcriptionUrl  String value for transcriptionUrl.
     */
    public TranscriptionsItem(
            String transcriptionId,
            String transcriptionUrl) {
        this.transcriptionId = transcriptionId;
        this.transcriptionUrl = transcriptionUrl;
    }

    /**
     * Getter for TranscriptionId.
     * The transcription id
     * @return Returns the String
     */
    @JsonGetter("transcriptionId")
    public String getTranscriptionId() {
        return transcriptionId;
    }

    /**
     * Setter for TranscriptionId.
     * The transcription id
     * @param transcriptionId Value for String
     */
    @JsonSetter("transcriptionId")
    public void setTranscriptionId(String transcriptionId) {
        this.transcriptionId = transcriptionId;
    }

    /**
     * Getter for TranscriptionUrl.
     * The account id of the transcription
     * @return Returns the String
     */
    @JsonGetter("transcriptionUrl")
    public String getTranscriptionUrl() {
        return transcriptionUrl;
    }

    /**
     * Setter for TranscriptionUrl.
     * The account id of the transcription
     * @param transcriptionUrl Value for String
     */
    @JsonSetter("transcriptionUrl")
    public void setTranscriptionUrl(String transcriptionUrl) {
        this.transcriptionUrl = transcriptionUrl;
    }

    /**
     * Converts this TranscriptionsItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TranscriptionsItem [" + "transcriptionId=" + transcriptionId + ", transcriptionUrl=" + transcriptionUrl + "]";
    }

    /**
     * Builds a new {@link TranscriptionsItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TranscriptionsItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transcriptionId(getTranscriptionId())
      	        .transcriptionUrl(getTranscriptionUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link TranscriptionsItem}.
     */
    public static class Builder {
        private String transcriptionId;
        private String transcriptionUrl;


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
         * Setter for transcriptionUrl.
         * @param  transcriptionUrl  String value for transcriptionUrl.
         * @return Builder
         */
        public Builder transcriptionUrl(String transcriptionUrl) {
            this.transcriptionUrl = transcriptionUrl;
            return this;
        }

        /**
         * Builds a new {@link TranscriptionsItem} object using the set fields.
         * @return {@link TranscriptionsItem}
         */
        public TranscriptionsItem build() {
            return new TranscriptionsItem(transcriptionId, transcriptionUrl);
        }
    }
}