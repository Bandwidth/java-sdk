/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for Transcript type.
 */
public class Transcript {
    /**
     * Default constructor
     */
    public Transcript() {
    }

    /**
     * Initialization constructor.
     * @param text
     * @param confidence
     */
    public Transcript(
            String text,
            Double confidence) {
        this.text = text;
        this.confidence = confidence;
    }

    private String text;
    private Double confidence;
    /**
     * Getter for Text.
     */
    @JsonGetter("text")
    public String getText() {
        return this.text;
    }
    /**
     * Setter for Text.
     */
    @JsonSetter("text")
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Getter for Confidence.
     */
    @JsonGetter("confidence")
    public Double getConfidence() {
        return this.confidence;
    }
    /**
     * Setter for Confidence.
     */
    @JsonSetter("confidence")
    public void setConfidence(Double value) {
        this.confidence = value;
    }

 

    /**
     * Builds a new {@link Transcript.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Transcript.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .text(getText())
            .confidence(getConfidence());
        return builder;
    }

    /**
     * Class to build instances of {@link Transcript}
     */
    public static class Builder {
        private String text;
        private Double confidence;



        /**
         * Setter for text
         * @param text
         * @return Builder
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Setter for confidence
         * @param confidence
         * @return Builder
         */
        public Builder confidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * Builds a new {@link Transcript} object using the set fields.
         * @return {@link Transcript}
         */
        public Transcript build() {
            return new Transcript(text,
                confidence);
        }
    }
}
