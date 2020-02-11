/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Transcription {
    /**
     * Default constructor
     */
    public Transcription() {
    }

    public Transcription(
            String id,
            Status1Enum status,
            String completedTime,
            String url) {
        this.id = id;
        this.status = status;
        this.completedTime = completedTime;
        this.url = url;
    }

    private String id;
    private Status1Enum status;
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
    public void setId(String value) { 
        this.id = value;
    }

    /**
     * Getter for Status.
     */
    @JsonGetter("status")
    public Status1Enum getStatus() { 
        return this.status;
    }
    /**
     * Setter for Status.
     */
    @JsonSetter("status")
    public void setStatus(Status1Enum value) { 
        this.status = value;
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
    public void setCompletedTime(String value) { 
        this.completedTime = value;
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
    public void setUrl(String value) { 
        this.url = value;
    }

 
    public Builder toBuilder() {
        Builder builder = new Builder()
            .id(getId())
            .status(getStatus())
            .completedTime(getCompletedTime())
            .url(getUrl());
            return builder;
    }

    public static class Builder {
        private String id;
        private Status1Enum status;
        private String completedTime;
        private String url;

        public Builder() { }

        public Builder id(String value) {
            id = value;
            return this;
        }
        public Builder status(Status1Enum value) {
            status = value;
            return this;
        }
        public Builder completedTime(String value) {
            completedTime = value;
            return this;
        }
        public Builder url(String value) {
            url = value;
            return this;
        }

        public Transcription build() {
            return new Transcription(id,
                status,
                completedTime,
                url);
        }
    }
}
