/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.messaging.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for MessageRequest type.
 */
public class MessageRequest {
    private String applicationId;
    private List<String> to;
    private String from;
    private String text;
    private List<String> media;
    private String tag;

    /**
     * Default constructor.
     */
    public MessageRequest() {
    }

    /**
     * Initialization constructor.
     * @param applicationId String value for applicationId.
     * @param to List of String value for to.
     * @param from String value for from.
     * @param text String value for text.
     * @param media List of String value for media.
     * @param tag String value for tag.
     */
    public MessageRequest(
            String applicationId,
            List<String> to,
            String from,
            String text,
            List<String> media,
            String tag) {
        this.applicationId = applicationId;
        this.to = to;
        this.from = from;
        this.text = text;
        this.media = media;
        this.tag = tag;
    }

    /**
     * Getter for ApplicationId.
     * The ID of the Application your from number is associated with in the Bandwidth Phone Number
     * Dashboard.
     * @return Returns the String
     */
    @JsonGetter("applicationId")
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Setter for ApplicationId.
     * The ID of the Application your from number is associated with in the Bandwidth Phone Number
     * Dashboard.
     * @param applicationId Value for String
     */
    @JsonSetter("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Getter for To.
     * The phone number(s) the message should be sent to in E164 format
     * @return Returns the List of String
     */
    @JsonGetter("to")
    public List<String> getTo() {
        return this.to;
    }

    /**
     * Setter for To.
     * The phone number(s) the message should be sent to in E164 format
     * @param to Value for List of String
     */
    @JsonSetter("to")
    public void setTo(List<String> to) {
        this.to = to;
    }

    /**
     * Getter for From.
     * One of your telephone numbers the message should come from in E164 format
     * @return Returns the String
     */
    @JsonGetter("from")
    public String getFrom() {
        return this.from;
    }

    /**
     * Setter for From.
     * One of your telephone numbers the message should come from in E164 format
     * @param from Value for String
     */
    @JsonSetter("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Getter for Text.
     * The contents of the text message. Must be 2048 characters or less.
     * @return Returns the String
     */
    @JsonGetter("text")
    public String getText() {
        return this.text;
    }

    /**
     * Setter for Text.
     * The contents of the text message. Must be 2048 characters or less.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Media.
     * A list of URLs to include as media attachments as part of the message.
     * @return Returns the List of String
     */
    @JsonGetter("media")
    public List<String> getMedia() {
        return this.media;
    }

    /**
     * Setter for Media.
     * A list of URLs to include as media attachments as part of the message.
     * @param media Value for List of String
     */
    @JsonSetter("media")
    public void setMedia(List<String> media) {
        this.media = media;
    }

    /**
     * Getter for Tag.
     * A custom string that will be included in callback events of the message. Max 1024 characters
     * @return Returns the String
     */
    @JsonGetter("tag")
    public String getTag() {
        return this.tag;
    }

    /**
     * Setter for Tag.
     * A custom string that will be included in callback events of the message. Max 1024 characters
     * @param tag Value for String
     */
    @JsonSetter("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Converts this MessageRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MessageRequest [" + "applicationId=" + applicationId + ", to=" + to + ", from="
                + from + ", text=" + text + ", media=" + media + ", tag=" + tag + "]";
    }

    /**
     * Builds a new {@link MessageRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MessageRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(applicationId, to, from)
                .text(getText())
                .media(getMedia())
                .tag(getTag());
        return builder;
    }

    /**
     * Class to build instances of {@link MessageRequest}.
     */
    public static class Builder {
        private String applicationId;
        private List<String> to;
        private String from;
        private String text;
        private List<String> media;
        private String tag;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param applicationId String value for applicationId.
         * @param to List of String value for to.
         * @param from String value for from.
         */
        public Builder(String applicationId,
                List<String> to,
                String from) {
            this.applicationId = applicationId;
            this.to = to;
            this.from = from;
        }

        /**
         * Setter for applicationId.
         * @param applicationId String value for applicationId.
         * @return Builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Setter for to.
         * @param to List of String value for to.
         * @return Builder
         */
        public Builder to(List<String> to) {
            this.to = to;
            return this;
        }

        /**
         * Setter for from.
         * @param from String value for from.
         * @return Builder
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Setter for text.
         * @param text String value for text.
         * @return Builder
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Setter for media.
         * @param media List of String value for media.
         * @return Builder
         */
        public Builder media(List<String> media) {
            this.media = media;
            return this;
        }

        /**
         * Setter for tag.
         * @param tag String value for tag.
         * @return Builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds a new {@link MessageRequest} object using the set fields.
         * @return {@link MessageRequest}
         */
        public MessageRequest build() {
            return new MessageRequest(applicationId, to, from, text, media, tag);
        }
    }
}
