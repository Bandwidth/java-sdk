/*
 * MessagingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.messaging.models;

import java.util.*;

public class MessageRequestBuilder {
    //the instance to build
    private MessageRequest messageRequest;

    /**
     * Default constructor to initialize the instance
     */
    public MessageRequestBuilder() {
        messageRequest = new MessageRequest();
    }

    public MessageRequestBuilder applicationId(String applicationId) {
        messageRequest.setApplicationId(applicationId);
        return this;
    }

    public MessageRequestBuilder to(List<String> to) {
        messageRequest.setTo(to);
        return this;
    }

    public MessageRequestBuilder from(String from) {
        messageRequest.setFrom(from);
        return this;
    }

    public MessageRequestBuilder text(String text) {
        messageRequest.setText(text);
        return this;
    }

    public MessageRequestBuilder media(List<String> media) {
        messageRequest.setMedia(media);
        return this;
    }

    public MessageRequestBuilder tag(String tag) {
        messageRequest.setTag(tag);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MessageRequest build() {
        return messageRequest;
    }
}