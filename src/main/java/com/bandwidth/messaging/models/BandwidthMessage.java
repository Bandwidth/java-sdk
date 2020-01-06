/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.messaging.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BandwidthMessage {
    /**
     * Default constructor
     */
    public BandwidthMessage() {
    }

    public BandwidthMessage(
            String id,
            String owner,
            String applicationId,
            String time,
            String segmentCount,
            String direction,
            List<String> to,
            String from,
            List<String> media,
            String text,
            String tag) {
        this.id = id;
        this.owner = owner;
        this.applicationId = applicationId;
        this.time = time;
        this.segmentCount = segmentCount;
        this.direction = direction;
        this.to = to;
        this.from = from;
        this.media = media;
        this.text = text;
        this.tag = tag;
    }

    private String id;
    private String owner;
    private String applicationId;
    private String time;
    private String segmentCount;
    private String direction;
    private List<String> to;
    private String from;
    private List<String> media;
    private String text;
    private String tag;
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
     * Getter for Owner.
     */
    @JsonGetter("owner")
    public String getOwner() { 
        return this.owner;
    }
    /**
     * Setter for Owner.
     */
    @JsonSetter("owner")
    public void setOwner(String value) { 
        this.owner = value;
    }

    /**
     * Getter for ApplicationId.
     */
    @JsonGetter("applicationId")
    public String getApplicationId() { 
        return this.applicationId;
    }
    /**
     * Setter for ApplicationId.
     */
    @JsonSetter("applicationId")
    public void setApplicationId(String value) { 
        this.applicationId = value;
    }

    /**
     * Getter for Time.
     */
    @JsonGetter("time")
    public String getTime() { 
        return this.time;
    }
    /**
     * Setter for Time.
     */
    @JsonSetter("time")
    public void setTime(String value) { 
        this.time = value;
    }

    /**
     * Getter for SegmentCount.
     */
    @JsonGetter("segmentCount")
    public String getSegmentCount() { 
        return this.segmentCount;
    }
    /**
     * Setter for SegmentCount.
     */
    @JsonSetter("segmentCount")
    public void setSegmentCount(String value) { 
        this.segmentCount = value;
    }

    /**
     * Getter for Direction.
     */
    @JsonGetter("direction")
    public String getDirection() { 
        return this.direction;
    }
    /**
     * Setter for Direction.
     */
    @JsonSetter("direction")
    public void setDirection(String value) { 
        this.direction = value;
    }

    /**
     * Getter for To.
     */
    @JsonGetter("to")
    public List<String> getTo() { 
        return this.to;
    }
    /**
     * Setter for To.
     */
    @JsonSetter("to")
    public void setTo(List<String> value) { 
        this.to = value;
    }

    /**
     * Getter for From.
     */
    @JsonGetter("from")
    public String getFrom() { 
        return this.from;
    }
    /**
     * Setter for From.
     */
    @JsonSetter("from")
    public void setFrom(String value) { 
        this.from = value;
    }

    /**
     * Getter for Media.
     */
    @JsonGetter("media")
    public List<String> getMedia() { 
        return this.media;
    }
    /**
     * Setter for Media.
     */
    @JsonSetter("media")
    public void setMedia(List<String> value) { 
        this.media = value;
    }

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
     * Getter for Tag.
     */
    @JsonGetter("tag")
    public String getTag() { 
        return this.tag;
    }
    /**
     * Setter for Tag.
     */
    @JsonSetter("tag")
    public void setTag(String value) { 
        this.tag = value;
    }

 
    public Builder toBuilder() {
        Builder builder = new Builder()
            .id(getId())
            .owner(getOwner())
            .applicationId(getApplicationId())
            .time(getTime())
            .segmentCount(getSegmentCount())
            .direction(getDirection())
            .to(getTo())
            .from(getFrom())
            .media(getMedia())
            .text(getText())
            .tag(getTag());
            return builder;
    }

    public static class Builder {
        private String id;
        private String owner;
        private String applicationId;
        private String time;
        private String segmentCount;
        private String direction;
        private List<String> to;
        private String from;
        private List<String> media;
        private String text;
        private String tag;

        public Builder() { }

        public Builder id(String value) {
            id = value;
            return this;
        }
        public Builder owner(String value) {
            owner = value;
            return this;
        }
        public Builder applicationId(String value) {
            applicationId = value;
            return this;
        }
        public Builder time(String value) {
            time = value;
            return this;
        }
        public Builder segmentCount(String value) {
            segmentCount = value;
            return this;
        }
        public Builder direction(String value) {
            direction = value;
            return this;
        }
        public Builder to(List<String> value) {
            to = value;
            return this;
        }
        public Builder from(String value) {
            from = value;
            return this;
        }
        public Builder media(List<String> value) {
            media = value;
            return this;
        }
        public Builder text(String value) {
            text = value;
            return this;
        }
        public Builder tag(String value) {
            tag = value;
            return this;
        }

        public BandwidthMessage build() {
            return new BandwidthMessage(id,
                owner,
                applicationId,
                time,
                segmentCount,
                direction,
                to,
                from,
                media,
                text,
                tag);
        }
    }
}
