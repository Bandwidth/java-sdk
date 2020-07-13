/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for ConferenceDetail type.
 */
public class ConferenceDetail {
    /**
     * Default constructor
     */
    public ConferenceDetail() {
    }

    /**
     * Initialization constructor.
     * @param id
     * @param name
     * @param createdTime
     * @param completedTime
     * @param conferenceEventUrl
     * @param conferenceEventMethod
     * @param tag
     * @param activeMembers
     */
    public ConferenceDetail(
            String id,
            String name,
            Long createdTime,
            Long completedTime,
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

    private String id;
    private String name;
    private Long createdTime;
    private Long completedTime;
    private String conferenceEventUrl;
    private ConferenceEventMethodEnum conferenceEventMethod;
    private String tag;
    private List<ConferenceMemberDetail> activeMembers;
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
     * Getter for Name.
     */
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    /**
     * Setter for Name.
     */
    @JsonSetter("name")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Getter for CreatedTime.
     */
    @JsonGetter("createdTime")
    public Long getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Setter for CreatedTime.
     */
    @JsonSetter("createdTime")
    public void setCreatedTime(Long value) {
        this.createdTime = value;
    }

    /**
     * Getter for CompletedTime.
     */
    @JsonGetter("completedTime")
    public Long getCompletedTime() {
        return this.completedTime;
    }
    /**
     * Setter for CompletedTime.
     */
    @JsonSetter("completedTime")
    public void setCompletedTime(Long value) {
        this.completedTime = value;
    }

    /**
     * Getter for ConferenceEventUrl.
     */
    @JsonGetter("conferenceEventUrl")
    public String getConferenceEventUrl() {
        return this.conferenceEventUrl;
    }
    /**
     * Setter for ConferenceEventUrl.
     */
    @JsonSetter("conferenceEventUrl")
    public void setConferenceEventUrl(String value) {
        this.conferenceEventUrl = value;
    }

    /**
     * Getter for ConferenceEventMethod.
     */
    @JsonGetter("conferenceEventMethod")
    public ConferenceEventMethodEnum getConferenceEventMethod() {
        return this.conferenceEventMethod;
    }
    /**
     * Setter for ConferenceEventMethod.
     */
    @JsonSetter("conferenceEventMethod")
    public void setConferenceEventMethod(ConferenceEventMethodEnum value) {
        this.conferenceEventMethod = value;
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

    /**
     * Getter for ActiveMembers.
     */
    @JsonGetter("activeMembers")
    public List<ConferenceMemberDetail> getActiveMembers() {
        return this.activeMembers;
    }
    /**
     * Setter for ActiveMembers.
     */
    @JsonSetter("activeMembers")
    public void setActiveMembers(List<ConferenceMemberDetail> value) {
        this.activeMembers = value;
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
     * Class to build instances of {@link ConferenceDetail}
     */
    public static class Builder {
        private String id;
        private String name;
        private Long createdTime;
        private Long completedTime;
        private String conferenceEventUrl;
        private ConferenceEventMethodEnum conferenceEventMethod;
        private String tag;
        private List<ConferenceMemberDetail> activeMembers;



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
         * Setter for name
         * @param name
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for createdTime
         * @param createdTime
         * @return Builder
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Setter for completedTime
         * @param completedTime
         * @return Builder
         */
        public Builder completedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * Setter for conferenceEventUrl
         * @param conferenceEventUrl
         * @return Builder
         */
        public Builder conferenceEventUrl(String conferenceEventUrl) {
            this.conferenceEventUrl = conferenceEventUrl;
            return this;
        }

        /**
         * Setter for conferenceEventMethod
         * @param conferenceEventMethod
         * @return Builder
         */
        public Builder conferenceEventMethod(ConferenceEventMethodEnum conferenceEventMethod) {
            this.conferenceEventMethod = conferenceEventMethod;
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
         * Setter for activeMembers
         * @param activeMembers
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
            return new ConferenceDetail(id,
                name,
                createdTime,
                completedTime,
                conferenceEventUrl,
                conferenceEventMethod,
                tag,
                activeMembers);
        }
    }
}