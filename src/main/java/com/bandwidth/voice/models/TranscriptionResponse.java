/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for TranscriptionResponse type.
 */
public class TranscriptionResponse {
    /**
     * Default constructor
     */
    public TranscriptionResponse() {
    }

    /**
     * Initialization constructor.
     * @param transcripts
     */
    public TranscriptionResponse(
            List<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    private List<Transcript> transcripts;
    /**
     * Getter for Transcripts.
     */
    @JsonGetter("transcripts")
    public List<Transcript> getTranscripts() {
        return this.transcripts;
    }
    /**
     * Setter for Transcripts.
     */
    @JsonSetter("transcripts")
    public void setTranscripts(List<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

 

    /**
     * Builds a new {@link TranscriptionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TranscriptionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .transcripts(getTranscripts());
        return builder;
    }

    /**
     * Class to build instances of {@link TranscriptionResponse}
     */
    public static class Builder {
        private List<Transcript> transcripts;



        /**
         * Setter for transcripts
         * @param transcripts
         * @return Builder
         */
        public Builder transcripts(List<Transcript> transcripts) {
            this.transcripts = transcripts;
            return this;
        }

        /**
         * Builds a new {@link TranscriptionResponse} object using the set fields.
         * @return {@link TranscriptionResponse}
         */
        public TranscriptionResponse build() {
            return new TranscriptionResponse(transcripts);
        }
    }
}
