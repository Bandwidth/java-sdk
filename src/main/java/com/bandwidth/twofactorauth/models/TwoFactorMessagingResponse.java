/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.twofactorauth.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TwoFactorMessagingResponse type.
 */
public class TwoFactorMessagingResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageId;

    /**
     * Default constructor.
     */
    public TwoFactorMessagingResponse() {
    }

    /**
     * Initialization constructor.
     * @param  messageId  String value for messageId.
     */
    public TwoFactorMessagingResponse(
            String messageId) {
        this.messageId = messageId;
    }

    /**
     * Getter for MessageId.
     * @return Returns the String
     */
    @JsonGetter("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Setter for MessageId.
     * @param messageId Value for String
     */
    @JsonSetter("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Converts this TwoFactorMessagingResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TwoFactorMessagingResponse [" + "messageId=" + messageId + "]";
    }

    /**
     * Builds a new {@link TwoFactorMessagingResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TwoFactorMessagingResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .messageId(getMessageId());
        return builder;
    }

    /**
     * Class to build instances of {@link TwoFactorMessagingResponse}.
     */
    public static class Builder {
        private String messageId;



        /**
         * Setter for messageId.
         * @param  messageId  String value for messageId.
         * @return Builder
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Builds a new {@link TwoFactorMessagingResponse} object using the set fields.
         * @return {@link TwoFactorMessagingResponse}
         */
        public TwoFactorMessagingResponse build() {
            return new TwoFactorMessagingResponse(messageId);
        }
    }
}
