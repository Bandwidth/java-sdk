/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.messaging.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PageInfo type.
 */
public class PageInfo {
    private String prevPage;
    private String nextPage;
    private String prevPageToken;
    private String nextPageToken;

    /**
     * Default constructor.
     */
    public PageInfo() {
    }

    /**
     * Initialization constructor.
     * @param prevPage String value for prevPage.
     * @param nextPage String value for nextPage.
     * @param prevPageToken String value for prevPageToken.
     * @param nextPageToken String value for nextPageToken.
     */
    public PageInfo(
            String prevPage,
            String nextPage,
            String prevPageToken,
            String nextPageToken) {
        this.prevPage = prevPage;
        this.nextPage = nextPage;
        this.prevPageToken = prevPageToken;
        this.nextPageToken = nextPageToken;
    }

    /**
     * Getter for PrevPage.
     * The link to the previous page for pagination
     * @return Returns the String
     */
    @JsonGetter("prevPage")
    public String getPrevPage() {
        return this.prevPage;
    }

    /**
     * Setter for PrevPage.
     * The link to the previous page for pagination
     * @param prevPage Value for String
     */
    @JsonSetter("prevPage")
    public void setPrevPage(String prevPage) {
        this.prevPage = prevPage;
    }

    /**
     * Getter for NextPage.
     * The link to the next page for pagination
     * @return Returns the String
     */
    @JsonGetter("nextPage")
    public String getNextPage() {
        return this.nextPage;
    }

    /**
     * Setter for NextPage.
     * The link to the next page for pagination
     * @param nextPage Value for String
     */
    @JsonSetter("nextPage")
    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    /**
     * Getter for PrevPageToken.
     * The isolated pagination token for the previous page
     * @return Returns the String
     */
    @JsonGetter("prevPageToken")
    public String getPrevPageToken() {
        return this.prevPageToken;
    }

    /**
     * Setter for PrevPageToken.
     * The isolated pagination token for the previous page
     * @param prevPageToken Value for String
     */
    @JsonSetter("prevPageToken")
    public void setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    /**
     * Getter for NextPageToken.
     * The isolated pagination token for the next page
     * @return Returns the String
     */
    @JsonGetter("nextPageToken")
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * Setter for NextPageToken.
     * The isolated pagination token for the next page
     * @param nextPageToken Value for String
     */
    @JsonSetter("nextPageToken")
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * Converts this PageInfo into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PageInfo [" + "prevPage=" + prevPage + ", nextPage=" + nextPage + ", prevPageToken="
                + prevPageToken + ", nextPageToken=" + nextPageToken + "]";
    }

    /**
     * Builds a new {@link PageInfo.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PageInfo.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .prevPage(getPrevPage())
                .nextPage(getNextPage())
                .prevPageToken(getPrevPageToken())
                .nextPageToken(getNextPageToken());
        return builder;
    }

    /**
     * Class to build instances of {@link PageInfo}.
     */
    public static class Builder {
        private String prevPage;
        private String nextPage;
        private String prevPageToken;
        private String nextPageToken;



        /**
         * Setter for prevPage.
         * @param prevPage String value for prevPage.
         * @return Builder
         */
        public Builder prevPage(String prevPage) {
            this.prevPage = prevPage;
            return this;
        }

        /**
         * Setter for nextPage.
         * @param nextPage String value for nextPage.
         * @return Builder
         */
        public Builder nextPage(String nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * Setter for prevPageToken.
         * @param prevPageToken String value for prevPageToken.
         * @return Builder
         */
        public Builder prevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
            return this;
        }

        /**
         * Setter for nextPageToken.
         * @param nextPageToken String value for nextPageToken.
         * @return Builder
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * Builds a new {@link PageInfo} object using the set fields.
         * @return {@link PageInfo}
         */
        public PageInfo build() {
            return new PageInfo(prevPage, nextPage, prevPageToken, nextPageToken);
        }
    }
}
