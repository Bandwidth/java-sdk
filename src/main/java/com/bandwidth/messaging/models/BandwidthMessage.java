/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.messaging.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BandwidthMessage type.
 */
public class BandwidthMessage {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String owner;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String applicationId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String time;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer segmentCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String direction;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> to;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String from;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> media;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String text;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tag;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String priority;

    /**
     * Default constructor.
     */
    public BandwidthMessage() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  owner  String value for owner.
     * @param  applicationId  String value for applicationId.
     * @param  time  String value for time.
     * @param  segmentCount  Integer value for segmentCount.
     * @param  direction  String value for direction.
     * @param  to  List of String value for to.
     * @param  from  String value for from.
     * @param  media  List of String value for media.
     * @param  text  String value for text.
     * @param  tag  String value for tag.
     * @param  priority  String value for priority.
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
            String tag,
            String priority) {
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
        this.priority = priority;
    }

    /**
     * Getter for Id.
     * The id of the message
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the message
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Owner.
     * The Bandwidth phone number associated with the message
     * @return Returns the String
     */
    @JsonGetter("owner")
    public String getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * The Bandwidth phone number associated with the message
     * @param owner Value for String
     */
    @JsonSetter("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Getter for ApplicationId.
     * The application ID associated with the message
     * @return Returns the String
     */
    @JsonGetter("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Setter for ApplicationId.
     * The application ID associated with the message
     * @param applicationId Value for String
     */
    @JsonSetter("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Getter for Time.
     * The datetime stamp of the message in ISO 8601
     * @return Returns the String
     */
    @JsonGetter("time")
    public String getTime() {
        return time;
    }

    /**
     * Setter for Time.
     * The datetime stamp of the message in ISO 8601
     * @param time Value for String
     */
    @JsonSetter("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Getter for SegmentCount.
     * The number of segments the original message from the user is broken into before sending over
     * to carrier networks
     * @return Returns the Integer
     */
    @JsonGetter("segmentCount")
    public Integer getSegmentCount() {
        return segmentCount;
    }

    /**
     * Setter for SegmentCount.
     * The number of segments the original message from the user is broken into before sending over
     * to carrier networks
     * @param segmentCount Value for Integer
     */
    @JsonSetter("segmentCount")
    public void setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
    }

    /**
     * Getter for Direction.
     * The direction of the message relative to Bandwidth. Can be in or out
     * @return Returns the String
     */
    @JsonGetter("direction")
    public String getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * The direction of the message relative to Bandwidth. Can be in or out
     * @param direction Value for String
     */
    @JsonSetter("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * Getter for To.
     * The phone number recipients of the message
     * @return Returns the List of String
     */
    @JsonGetter("to")
    public List<String> getTo() {
        return to;
    }

    /**
     * Setter for To.
     * The phone number recipients of the message
     * @param to Value for List of String
     */
    @JsonSetter("to")
    public void setTo(List<String> to) {
        this.to = to;
    }

    /**
     * Getter for From.
     * The phone number the message was sent from
     * @return Returns the String
     */
    @JsonGetter("from")
    public String getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * The phone number the message was sent from
     * @param from Value for String
     */
    @JsonSetter("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Getter for Media.
     * The list of media URLs sent in the message. Including a `filename` field in the
     * `Content-Disposition` header of the media linked with a URL will set the displayed file name.
     * This is a best practice to ensure that your media has a readable file name.
     * @return Returns the List of String
     */
    @JsonGetter("media")
    public List<String> getMedia() {
        return media;
    }

    /**
     * Setter for Media.
     * The list of media URLs sent in the message. Including a `filename` field in the
     * `Content-Disposition` header of the media linked with a URL will set the displayed file name.
     * This is a best practice to ensure that your media has a readable file name.
     * @param media Value for List of String
     */
    @JsonSetter("media")
    public void setMedia(List<String> media) {
        this.media = media;
    }

    /**
     * Getter for Text.
     * The contents of the message
     * @return Returns the String
     */
    @JsonGetter("text")
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * The contents of the message
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Tag.
     * The custom string set by the user
     * @return Returns the String
     */
    @JsonGetter("tag")
    public String getTag() {
        return tag;
    }

    /**
     * Setter for Tag.
     * The custom string set by the user
     * @param tag Value for String
     */
    @JsonSetter("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Getter for Priority.
     * The priority specified by the user
     * @return Returns the String
     */
    @JsonGetter("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * Setter for Priority.
     * The priority specified by the user
     * @param priority Value for String
     */
    @JsonSetter("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * Converts this BandwidthMessage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BandwidthMessage [" + "id=" + id + ", owner=" + owner + ", applicationId="
                + applicationId + ", time=" + time + ", segmentCount=" + segmentCount
                + ", direction=" + direction + ", to=" + to + ", from=" + from + ", media=" + media
                + ", text=" + text + ", tag=" + tag + ", priority=" + priority + "]";
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
                .tag(getTag())
                .priority(getPriority());
        return builder;
    }

    /**
     * Class to build instances of {@link BandwidthMessage}.
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
        private String priority;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  String value for owner.
         * @return Builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Setter for applicationId.
         * @param  applicationId  String value for applicationId.
         * @return Builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Setter for time.
         * @param  time  String value for time.
         * @return Builder
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * Setter for segmentCount.
         * @param  segmentCount  Integer value for segmentCount.
         * @return Builder
         */
        public Builder segmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  String value for direction.
         * @return Builder
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for to.
         * @param  to  List of String value for to.
         * @return Builder
         */
        public Builder to(List<String> to) {
            this.to = to;
            return this;
        }

        /**
         * Setter for from.
         * @param  from  String value for from.
         * @return Builder
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Setter for media.
         * @param  media  List of String value for media.
         * @return Builder
         */
        public Builder media(List<String> media) {
            this.media = media;
            return this;
        }

        /**
         * Setter for text.
         * @param  text  String value for text.
         * @return Builder
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Setter for tag.
         * @param  tag  String value for tag.
         * @return Builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Setter for priority.
         * @param  priority  String value for priority.
         * @return Builder
         */
        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Builds a new {@link BandwidthMessage} object using the set fields.
         * @return {@link BandwidthMessage}
         */
        public BandwidthMessage build() {
            return new BandwidthMessage(id, owner, applicationId, time, segmentCount, direction, to,
                    from, media, text, tag, priority);
        }
    }
}
