/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.messaging.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for BandwidthMessage type.
 */
public class BandwidthMessage {
    /**
     * Default constructor
     */
    public BandwidthMessage() {
    }

    /**
     * Initialization constructor.
     * @param id
     * @param owner
     * @param applicationId
     * @param time
     * @param segmentCount
     * @param direction
     * @param to
     * @param from
     * @param media
     * @param text
     * @param tag
     */
    public BandwidthMessage(
            String id,
            String owner,
            String applicationId,
            String time,
            Integer segmentCount,
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
    private Integer segmentCount;
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
    public void setId(String id) {
        this.id = id;
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
    public void setOwner(String owner) {
        this.owner = owner;
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
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
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
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Getter for SegmentCount.
     */
    @JsonGetter("segmentCount")
    public Integer getSegmentCount() {
        return this.segmentCount;
    }
    /**
     * Setter for SegmentCount.
     */
    @JsonSetter("segmentCount")
    public void setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
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
    public void setDirection(String direction) {
        this.direction = direction;
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
    public void setTo(List<String> to) {
        this.to = to;
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
    public void setFrom(String from) {
        this.from = from;
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
    public void setMedia(List<String> media) {
        this.media = media;
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
    public void setText(String text) {
        this.text = text;
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
    public void setTag(String tag) {
        this.tag = tag;
    }

 

    /**
     * Builds a new {@link BandwidthMessage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BandwidthMessage.Builder} object
     */
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

    /**
     * Class to build instances of {@link BandwidthMessage}
     */
    public static class Builder {
        private String id;
        private String owner;
        private String applicationId;
        private String time;
        private Integer segmentCount;
        private String direction;
        private List<String> to;
        private String from;
        private List<String> media;
        private String text;
        private String tag;



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
         * Setter for owner
         * @param owner
         * @return Builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Setter for applicationId
         * @param applicationId
         * @return Builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Setter for time
         * @param time
         * @return Builder
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * Setter for segmentCount
         * @param segmentCount
         * @return Builder
         */
        public Builder segmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }

        /**
         * Setter for direction
         * @param direction
         * @return Builder
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for to
         * @param to
         * @return Builder
         */
        public Builder to(List<String> to) {
            this.to = to;
            return this;
        }

        /**
         * Setter for from
         * @param from
         * @return Builder
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Setter for media
         * @param media
         * @return Builder
         */
        public Builder media(List<String> media) {
            this.media = media;
            return this;
        }

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
         * Setter for tag
         * @param tag
         * @return Builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds a new {@link BandwidthMessage} object using the set fields.
         * @return {@link BandwidthMessage}
         */
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
