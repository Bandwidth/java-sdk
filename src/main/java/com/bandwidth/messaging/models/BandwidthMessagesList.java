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
 * This is a model class for BandwidthMessagesList type.
 */
public class BandwidthMessagesList {
    private Integer totalCount;
    private PageInfo pageInfo;
    private List<BandwidthMessageItem> messages;

    /**
     * Default constructor.
     */
    public BandwidthMessagesList() {
    }

    /**
     * Initialization constructor.
     * @param totalCount Integer value for totalCount.
     * @param pageInfo PageInfo value for pageInfo.
     * @param messages List of BandwidthMessageItem value for messages.
     */
    public BandwidthMessagesList(
            Integer totalCount,
            PageInfo pageInfo,
            List<BandwidthMessageItem> messages) {
        this.totalCount = totalCount;
        this.pageInfo = pageInfo;
        this.messages = messages;
    }

    /**
     * Getter for TotalCount.
     * Total number of messages matched by the search
     * @return Returns the Integer
     */
    @JsonGetter("totalCount")
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * Setter for TotalCount.
     * Total number of messages matched by the search
     * @param totalCount Value for Integer
     */
    @JsonSetter("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for PageInfo.
     * @return Returns the PageInfo
     */
    @JsonGetter("pageInfo")
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * Setter for PageInfo.
     * @param pageInfo Value for PageInfo
     */
    @JsonSetter("pageInfo")
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * Getter for Messages.
     * @return Returns the List of BandwidthMessageItem
     */
    @JsonGetter("messages")
    public List<BandwidthMessageItem> getMessages() {
        return this.messages;
    }

    /**
     * Setter for Messages.
     * @param messages Value for List of BandwidthMessageItem
     */
    @JsonSetter("messages")
    public void setMessages(List<BandwidthMessageItem> messages) {
        this.messages = messages;
    }

    /**
     * Converts this BandwidthMessagesList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BandwidthMessagesList [" + "totalCount=" + totalCount + ", pageInfo=" + pageInfo
                + ", messages=" + messages + "]";
    }

    /**
     * Builds a new {@link BandwidthMessagesList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BandwidthMessagesList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalCount(getTotalCount())
                .pageInfo(getPageInfo())
                .messages(getMessages());
        return builder;
    }

    /**
     * Class to build instances of {@link BandwidthMessagesList}.
     */
    public static class Builder {
        private Integer totalCount;
        private PageInfo pageInfo;
        private List<BandwidthMessageItem> messages;



        /**
         * Setter for totalCount.
         * @param totalCount Integer value for totalCount.
         * @return Builder
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for pageInfo.
         * @param pageInfo PageInfo value for pageInfo.
         * @return Builder
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * Setter for messages.
         * @param messages List of BandwidthMessageItem value for messages.
         * @return Builder
         */
        public Builder messages(List<BandwidthMessageItem> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * Builds a new {@link BandwidthMessagesList} object using the set fields.
         * @return {@link BandwidthMessagesList}
         */
        public BandwidthMessagesList build() {
            return new BandwidthMessagesList(totalCount, pageInfo, messages);
        }
    }
}
