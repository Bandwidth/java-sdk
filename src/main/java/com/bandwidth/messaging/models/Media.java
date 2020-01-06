/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.messaging.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Media {
    /**
     * Default constructor
     */
    public Media() {
    }

    public Media(
            Object inputStream,
            String content,
            String url,
            String contentLength,
            String contentType,
            List<Tag> tags,
            String userId,
            String mediaName,
            String mediaId,
            String cacheControl) {
        this.inputStream = inputStream;
        this.content = content;
        this.url = url;
        this.contentLength = contentLength;
        this.contentType = contentType;
        this.tags = tags;
        this.userId = userId;
        this.mediaName = mediaName;
        this.mediaId = mediaId;
        this.cacheControl = cacheControl;
    }

    private Object inputStream;
    private String content;
    private String url;
    private String contentLength;
    private String contentType;
    private List<Tag> tags;
    private String userId;
    private String mediaName;
    private String mediaId;
    private String cacheControl;
    /**
     * Getter for InputStream.
     */
    @JsonGetter("inputStream")
    public Object getInputStream() { 
        return this.inputStream;
    }
    /**
     * Setter for InputStream.
     */
    @JsonSetter("inputStream")
    public void setInputStream(Object value) { 
        this.inputStream = value;
    }

    /**
     * Getter for Content.
     */
    @JsonGetter("content")
    public String getContent() { 
        return this.content;
    }
    /**
     * Setter for Content.
     */
    @JsonSetter("content")
    public void setContent(String value) { 
        this.content = value;
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

    /**
     * Getter for ContentLength.
     */
    @JsonGetter("contentLength")
    public String getContentLength() { 
        return this.contentLength;
    }
    /**
     * Setter for ContentLength.
     */
    @JsonSetter("contentLength")
    public void setContentLength(String value) { 
        this.contentLength = value;
    }

    /**
     * Getter for ContentType.
     */
    @JsonGetter("contentType")
    public String getContentType() { 
        return this.contentType;
    }
    /**
     * Setter for ContentType.
     */
    @JsonSetter("contentType")
    public void setContentType(String value) { 
        this.contentType = value;
    }

    /**
     * Getter for Tags.
     */
    @JsonGetter("tags")
    public List<Tag> getTags() { 
        return this.tags;
    }
    /**
     * Setter for Tags.
     */
    @JsonSetter("tags")
    public void setTags(List<Tag> value) { 
        this.tags = value;
    }

    /**
     * Getter for UserId.
     */
    @JsonGetter("userId")
    public String getUserId() { 
        return this.userId;
    }
    /**
     * Setter for UserId.
     */
    @JsonSetter("userId")
    public void setUserId(String value) { 
        this.userId = value;
    }

    /**
     * Getter for MediaName.
     */
    @JsonGetter("mediaName")
    public String getMediaName() { 
        return this.mediaName;
    }
    /**
     * Setter for MediaName.
     */
    @JsonSetter("mediaName")
    public void setMediaName(String value) { 
        this.mediaName = value;
    }

    /**
     * Getter for MediaId.
     */
    @JsonGetter("mediaId")
    public String getMediaId() { 
        return this.mediaId;
    }
    /**
     * Setter for MediaId.
     */
    @JsonSetter("mediaId")
    public void setMediaId(String value) { 
        this.mediaId = value;
    }

    /**
     * Getter for CacheControl.
     */
    @JsonGetter("cacheControl")
    public String getCacheControl() { 
        return this.cacheControl;
    }
    /**
     * Setter for CacheControl.
     */
    @JsonSetter("cacheControl")
    public void setCacheControl(String value) { 
        this.cacheControl = value;
    }

 
    public Builder toBuilder() {
        Builder builder = new Builder()
            .inputStream(getInputStream())
            .content(getContent())
            .url(getUrl())
            .contentLength(getContentLength())
            .contentType(getContentType())
            .tags(getTags())
            .userId(getUserId())
            .mediaName(getMediaName())
            .mediaId(getMediaId())
            .cacheControl(getCacheControl());
            return builder;
    }

    public static class Builder {
        private Object inputStream;
        private String content;
        private String url;
        private String contentLength;
        private String contentType;
        private List<Tag> tags;
        private String userId;
        private String mediaName;
        private String mediaId;
        private String cacheControl;

        public Builder() { }

        public Builder inputStream(Object value) {
            inputStream = value;
            return this;
        }
        public Builder content(String value) {
            content = value;
            return this;
        }
        public Builder url(String value) {
            url = value;
            return this;
        }
        public Builder contentLength(String value) {
            contentLength = value;
            return this;
        }
        public Builder contentType(String value) {
            contentType = value;
            return this;
        }
        public Builder tags(List<Tag> value) {
            tags = value;
            return this;
        }
        public Builder userId(String value) {
            userId = value;
            return this;
        }
        public Builder mediaName(String value) {
            mediaName = value;
            return this;
        }
        public Builder mediaId(String value) {
            mediaId = value;
            return this;
        }
        public Builder cacheControl(String value) {
            cacheControl = value;
            return this;
        }

        public Media build() {
            return new Media(inputStream,
                content,
                url,
                contentLength,
                contentType,
                tags,
                userId,
                mediaName,
                mediaId,
                cacheControl);
        }
    }
}
