/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for Transcription type.
 */
public class Transcription {
    /**
     * Default constructor
     */
    public Transcription() {
    }

    /**
     * Initialization constructor.
     * @param id
     * @param status
     * @param completedTime
     * @param url
     */
    public Transcription(
            String id,
            Status3Enum status,
            String completedTime,
            String url) {
        this.id = id;
        this.status = status;
        this.completedTime = completedTime;
        this.url = url;
    }

    private String id;
    private Status3Enum status;
    private String completedTime;
    private String url;
    /**
     * Getter for Id.
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }
    /**
     * Setter for Id.
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Status.
     */
    @JsonGetter("status")
    public Status3Enum getStatus() {
        return this.status;
    }
    /**
     * Setter for Status.
     */
    @JsonSetter("status")
    public void setStatus(Status3Enum status) {
        this.status = status;
    }

    /**
     * Getter for CompletedTime.
     */
    @JsonGetter("completedTime")
    public String getCompletedTime() {
        return this.completedTime;
    }
    /**
     * Setter for CompletedTime.
     */
    @JsonSetter("completedTime")
    public void setCompletedTime(String completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * Getter for Url.
     */
    @JsonGetter("url")
    public String getUrl() {
        return this.url;
    }
    /**
     * Setter for Url.
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

 

    /**
     * Builds a new {@link Transcription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Transcription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .id(getId())
            .status(getStatus())
            .completedTime(getCompletedTime())
            .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link Transcription}
     */
    public static class Builder {
        private String id;
        private Status3Enum status;
        private String completedTime;
        private String url;



        /**
         * Setter for id
         * @param id
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for status
         * @param status
         * @return Builder
         */
        public Builder status(Status3Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for completedTime
         * @param completedTime
         * @return Builder
         */
        public Builder completedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * Setter for url
         * @param url
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Transcription} object using the set fields.
         * @return {@link Transcription}
         */
        public Transcription build() {
            return new Transcription(id,
                status,
                completedTime,
                url);
        }
    }
}
