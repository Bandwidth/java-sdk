/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.voice.models;

import com.bandwidth.DateTimeHelper;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for ConferenceDetail type.
 */
public class ConferenceDetail {
    private String id;
    private String name;
    private LocalDateTime createdTime;
    private LocalDateTime completedTime;
    private String conferenceEventUrl;
    private ConferenceEventMethodEnum conferenceEventMethod;
    private String tag;
    private List<ConferenceMemberDetail> activeMembers;

    /**
     * Default constructor.
     */
    public ConferenceDetail() {
    }

    /**
     * Initialization constructor.
     * @param id String value for id.
     * @param name String value for name.
     * @param createdTime LocalDateTime value for createdTime.
     * @param completedTime LocalDateTime value for completedTime.
     * @param conferenceEventUrl String value for conferenceEventUrl.
     * @param conferenceEventMethod ConferenceEventMethodEnum value for conferenceEventMethod.
     * @param tag String value for tag.
     * @param activeMembers List of ConferenceMemberDetail value for activeMembers.
     */
    public ConferenceDetail(
            String id,
            String name,
            LocalDateTime createdTime,
            LocalDateTime completedTime,
            String conferenceEventUrl,
            ConferenceEventMethodEnum conferenceEventMethod,
            String tag,
            List<ConferenceMemberDetail> activeMembers) {
        this.id = id;
        this.name = name;
        this.createdTime = createdTime;
        this.completedTime = completedTime;
        this.conferenceEventUrl = conferenceEventUrl;
        this.conferenceEventMethod = conferenceEventMethod;
        this.tag = tag;
        this.activeMembers = activeMembers;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CreatedTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("createdTime")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for CreatedTime.
     * @param createdTime Value for LocalDateTime
     */
    @JsonSetter("createdTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Getter for CompletedTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("completedTime")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCompletedTime() {
        return this.completedTime;
    }

    /**
     * Setter for CompletedTime.
     * @param completedTime Value for LocalDateTime
     */
    @JsonSetter("completedTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCompletedTime(LocalDateTime completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * Getter for ConferenceEventUrl.
     * @return Returns the String
     */
    @JsonGetter("conferenceEventUrl")
    public String getConferenceEventUrl() {
        return this.conferenceEventUrl;
    }

    /**
     * Setter for ConferenceEventUrl.
     * @param conferenceEventUrl Value for String
     */
    @JsonSetter("conferenceEventUrl")
    public void setConferenceEventUrl(String conferenceEventUrl) {
        this.conferenceEventUrl = conferenceEventUrl;
    }

    /**
     * Getter for ConferenceEventMethod.
     * @return Returns the ConferenceEventMethodEnum
     */
    @JsonGetter("conferenceEventMethod")
    public ConferenceEventMethodEnum getConferenceEventMethod() {
        return this.conferenceEventMethod;
    }

    /**
     * Setter for ConferenceEventMethod.
     * @param conferenceEventMethod Value for ConferenceEventMethodEnum
     */
    @JsonSetter("conferenceEventMethod")
    public void setConferenceEventMethod(ConferenceEventMethodEnum conferenceEventMethod) {
        this.conferenceEventMethod = conferenceEventMethod;
    }

    /**
     * Getter for Tag.
     * @return Returns the String
     */
    @JsonGetter("tag")
    public String getTag() {
        return this.tag;
    }

    /**
     * Setter for Tag.
     * @param tag Value for String
     */
    @JsonSetter("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Getter for ActiveMembers.
     * @return Returns the List of ConferenceMemberDetail
     */
    @JsonGetter("activeMembers")
    public List<ConferenceMemberDetail> getActiveMembers() {
        return this.activeMembers;
    }

    /**
     * Setter for ActiveMembers.
     * @param activeMembers Value for List of ConferenceMemberDetail
     */
    @JsonSetter("activeMembers")
    public void setActiveMembers(List<ConferenceMemberDetail> activeMembers) {
        this.activeMembers = activeMembers;
    }

    /**
     * Converts this ConferenceDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConferenceDetail [" + "id=" + id + ", name=" + name + ", createdTime=" + createdTime
                + ", completedTime=" + completedTime + ", conferenceEventUrl=" + conferenceEventUrl
                + ", conferenceEventMethod=" + conferenceEventMethod + ", tag=" + tag
                + ", activeMembers=" + activeMembers + "]";
    }

    /**
     * Builds a new {@link ConferenceDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConferenceDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .createdTime(getCreatedTime())
                .completedTime(getCompletedTime())
                .conferenceEventUrl(getConferenceEventUrl())
                .conferenceEventMethod(getConferenceEventMethod())
                .tag(getTag())
                .activeMembers(getActiveMembers());
        return builder;
    }

    /**
     * Class to build instances of {@link ConferenceDetail}.
     */
    public static class Builder {
        private String id;
        private String name;
        private LocalDateTime createdTime;
        private LocalDateTime completedTime;
        private String conferenceEventUrl;
        private ConferenceEventMethodEnum conferenceEventMethod;
        private String tag;
        private List<ConferenceMemberDetail> activeMembers;



        /**
         * Setter for id.
         * @param id String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param name String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for createdTime.
         * @param createdTime LocalDateTime value for createdTime.
         * @return Builder
         */
        public Builder createdTime(LocalDateTime createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Setter for completedTime.
         * @param completedTime LocalDateTime value for completedTime.
         * @return Builder
         */
        public Builder completedTime(LocalDateTime completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * Setter for conferenceEventUrl.
         * @param conferenceEventUrl String value for conferenceEventUrl.
         * @return Builder
         */
        public Builder conferenceEventUrl(String conferenceEventUrl) {
            this.conferenceEventUrl = conferenceEventUrl;
            return this;
        }

        /**
         * Setter for conferenceEventMethod.
         * @param conferenceEventMethod ConferenceEventMethodEnum value for conferenceEventMethod.
         * @return Builder
         */
        public Builder conferenceEventMethod(ConferenceEventMethodEnum conferenceEventMethod) {
            this.conferenceEventMethod = conferenceEventMethod;
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
         * Setter for activeMembers.
         * @param activeMembers List of ConferenceMemberDetail value for activeMembers.
         * @return Builder
         */
        public Builder activeMembers(List<ConferenceMemberDetail> activeMembers) {
            this.activeMembers = activeMembers;
            return this;
        }

        /**
         * Builds a new {@link ConferenceDetail} object using the set fields.
         * @return {@link ConferenceDetail}
         */
        public ConferenceDetail build() {
            return new ConferenceDetail(id, name, createdTime, completedTime, conferenceEventUrl,
                    conferenceEventMethod, tag, activeMembers);
        }
    }
}
