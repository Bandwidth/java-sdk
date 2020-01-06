/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.bandwidth.DateTimeHelper;
import java.time.ZonedDateTime;

public class ApiGetAccountRecordingsMetadataRequest {
    /**
     * Default constructor
     */
    public ApiGetAccountRecordingsMetadataRequest() {
    }

    public ApiGetAccountRecordingsMetadataRequest(
            String from,
            String to,
            ZonedDateTime minStartTime,
            ZonedDateTime maxStartTime) {
        this.from = from;
        this.to = to;
        this.minStartTime = minStartTime;
        this.maxStartTime = maxStartTime;
    }

    private String from;
    private String to;
    private ZonedDateTime minStartTime;
    private ZonedDateTime maxStartTime;
    /**
     * Getter for From.
     * Format is E164
     */
    @JsonGetter("from")
    public String getFrom() { 
        return this.from;
    }
    /**
     * Setter for From.
     * Format is E164
     */
    @JsonSetter("from")
    public void setFrom(String value) { 
        this.from = value;
    }

    /**
     * Getter for To.
     * Format is E164
     */
    @JsonGetter("to")
    public String getTo() { 
        return this.to;
    }
    /**
     * Setter for To.
     * Format is E164
     */
    @JsonSetter("to")
    public void setTo(String value) { 
        this.to = value;
    }

    /**
     * Getter for MinStartTime.
     * ISO8601 format
     */
    @JsonGetter("minStartTime")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getMinStartTime() { 
        return this.minStartTime;
    }
    /**
     * Setter for MinStartTime.
     * ISO8601 format
     */
    @JsonSetter("minStartTime")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMinStartTime(ZonedDateTime value) { 
        this.minStartTime = value;
    }

    /**
     * Getter for MaxStartTime.
     * ISO8601 format
     */
    @JsonGetter("maxStartTime")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getMaxStartTime() { 
        return this.maxStartTime;
    }
    /**
     * Setter for MaxStartTime.
     * ISO8601 format
     */
    @JsonSetter("maxStartTime")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMaxStartTime(ZonedDateTime value) { 
        this.maxStartTime = value;
    }

 
    public Builder toBuilder() {
        Builder builder = new Builder(from,
            to,
            minStartTime,
            maxStartTime);
            return builder;
    }

    public static class Builder {
        private String from;
        private String to;
        private ZonedDateTime minStartTime;
        private ZonedDateTime maxStartTime;

        public Builder() {
                    }

        public Builder(String from,
                String to,
                ZonedDateTime minStartTime,
                ZonedDateTime maxStartTime) {
            this.from = from;
            this.to = to;
            this.minStartTime = minStartTime;
            this.maxStartTime = maxStartTime;
        }

        public Builder from(String value) {
            from = value;
            return this;
        }
        public Builder to(String value) {
            to = value;
            return this;
        }
        public Builder minStartTime(ZonedDateTime value) {
            minStartTime = value;
            return this;
        }
        public Builder maxStartTime(ZonedDateTime value) {
            maxStartTime = value;
            return this;
        }

        public ApiGetAccountRecordingsMetadataRequest build() {
            return new ApiGetAccountRecordingsMetadataRequest(from,
                to,
                minStartTime,
                maxStartTime);
        }
    }
}
