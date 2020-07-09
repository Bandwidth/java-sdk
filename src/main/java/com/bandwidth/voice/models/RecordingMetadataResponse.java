/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for RecordingMetadataResponse type.
 */
public class RecordingMetadataResponse {
    /**
     * Default constructor
     */
    public RecordingMetadataResponse() {
    }

    /**
     * Initialization constructor.
     * @param applicationId
     * @param accountId
     * @param callId
     * @param recordingId
     * @param to
     * @param from
     * @param duration
     * @param direction
     * @param channels
     * @param startTime
     * @param endTime
     * @param fileFormat
     * @param status
     * @param mediaUrl
     * @param transcription
     */
    public RecordingMetadataResponse(
            String applicationId,
            String accountId,
            String callId,
            String recordingId,
            String to,
            String from,
            String duration,
            DirectionEnum direction,
            Integer channels,
            Long startTime,
            Long endTime,
            FileFormatEnum fileFormat,
            Status1Enum status,
            String mediaUrl,
            Transcription transcription) {
        this.applicationId = applicationId;
        this.accountId = accountId;
        this.callId = callId;
        this.recordingId = recordingId;
        this.to = to;
        this.from = from;
        this.duration = duration;
        this.direction = direction;
        this.channels = channels;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fileFormat = fileFormat;
        this.status = status;
        this.mediaUrl = mediaUrl;
        this.transcription = transcription;
    }

    private String applicationId;
    private String accountId;
    private String callId;
    private String recordingId;
    private String to;
    private String from;
    private String duration;
    private DirectionEnum direction;
    private Integer channels;
    private Long startTime;
    private Long endTime;
    private FileFormatEnum fileFormat;
    private Status1Enum status;
    private String mediaUrl;
    private Transcription transcription;
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
     * Getter for AccountId.
     */
    @JsonGetter("accountId")
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Setter for AccountId.
     */
    @JsonSetter("accountId")
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Getter for CallId.
     */
    @JsonGetter("callId")
    public String getCallId() {
        return this.callId;
    }
    /**
     * Setter for CallId.
     */
    @JsonSetter("callId")
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Getter for RecordingId.
     */
    @JsonGetter("recordingId")
    public String getRecordingId() {
        return this.recordingId;
    }
    /**
     * Setter for RecordingId.
     */
    @JsonSetter("recordingId")
    public void setRecordingId(String value) {
        this.recordingId = value;
    }

    /**
     * Getter for To.
     */
    @JsonGetter("to")
    public String getTo() {
        return this.to;
    }
    /**
     * Setter for To.
     */
    @JsonSetter("to")
    public void setTo(String value) {
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
     * Getter for Duration.
     * Format is ISO-8601
     */
    @JsonGetter("duration")
    public String getDuration() {
        return this.duration;
    }
    /**
     * Setter for Duration.
     * Format is ISO-8601
     */
    @JsonSetter("duration")
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Getter for Direction.
     */
    @JsonGetter("direction")
    public DirectionEnum getDirection() {
        return this.direction;
    }
    /**
     * Setter for Direction.
     */
    @JsonSetter("direction")
    public void setDirection(DirectionEnum value) {
        this.direction = value;
    }

    /**
     * Getter for Channels.
     */
    @JsonGetter("channels")
    public Integer getChannels() {
        return this.channels;
    }
    /**
     * Setter for Channels.
     */
    @JsonSetter("channels")
    public void setChannels(Integer value) {
        this.channels = value;
    }

    /**
     * Getter for StartTime.
     */
    @JsonGetter("startTime")
    public Long getStartTime() {
        return this.startTime;
    }
    /**
     * Setter for StartTime.
     */
    @JsonSetter("startTime")
    public void setStartTime(Long value) {
        this.startTime = value;
    }

    /**
     * Getter for EndTime.
     */
    @JsonGetter("endTime")
    public Long getEndTime() {
        return this.endTime;
    }
    /**
     * Setter for EndTime.
     */
    @JsonSetter("endTime")
    public void setEndTime(Long value) {
        this.endTime = value;
    }

    /**
     * Getter for FileFormat.
     */
    @JsonGetter("fileFormat")
    public FileFormatEnum getFileFormat() {
        return this.fileFormat;
    }
    /**
     * Setter for FileFormat.
     */
    @JsonSetter("fileFormat")
    public void setFileFormat(FileFormatEnum value) {
        this.fileFormat = value;
    }

    /**
     * Getter for Status.
     */
    @JsonGetter("status")
    public Status1Enum getStatus() {
        return this.status;
    }
    /**
     * Setter for Status.
     */
    @JsonSetter("status")
    public void setStatus(Status1Enum value) {
        this.status = value;
    }

    /**
     * Getter for MediaUrl.
     */
    @JsonGetter("mediaUrl")
    public String getMediaUrl() {
        return this.mediaUrl;
    }
    /**
     * Setter for MediaUrl.
     */
    @JsonSetter("mediaUrl")
    public void setMediaUrl(String value) {
        this.mediaUrl = value;
    }

    /**
     * Getter for Transcription.
     */
    @JsonGetter("transcription")
    public Transcription getTranscription() {
        return this.transcription;
    }
    /**
     * Setter for Transcription.
     */
    @JsonSetter("transcription")
    public void setTranscription(Transcription value) {
        this.transcription = value;
    }

 

    /**
     * Builds a new {@link RecordingMetadataResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RecordingMetadataResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .applicationId(getApplicationId())
            .accountId(getAccountId())
            .callId(getCallId())
            .recordingId(getRecordingId())
            .to(getTo())
            .from(getFrom())
            .duration(getDuration())
            .direction(getDirection())
            .channels(getChannels())
            .startTime(getStartTime())
            .endTime(getEndTime())
            .fileFormat(getFileFormat())
            .status(getStatus())
            .mediaUrl(getMediaUrl())
            .transcription(getTranscription());
        return builder;
    }

    /**
     * Class to build instances of {@link RecordingMetadataResponse}
     */
    public static class Builder {
        private String applicationId;
        private String accountId;
        private String callId;
        private String recordingId;
        private String to;
        private String from;
        private String duration;
        private DirectionEnum direction;
        private Integer channels;
        private Long startTime;
        private Long endTime;
        private FileFormatEnum fileFormat;
        private Status1Enum status;
        private String mediaUrl;
        private Transcription transcription;



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
         * Setter for accountId
         * @param accountId
         * @return Builder
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Setter for callId
         * @param callId
         * @return Builder
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Setter for recordingId
         * @param recordingId
         * @return Builder
         */
        public Builder recordingId(String recordingId) {
            this.recordingId = recordingId;
            return this;
        }

        /**
         * Setter for to
         * @param to
         * @return Builder
         */
        public Builder to(String to) {
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
         * Setter for duration
         * @param duration
         * @return Builder
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Setter for direction
         * @param direction
         * @return Builder
         */
        public Builder direction(DirectionEnum direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for channels
         * @param channels
         * @return Builder
         */
        public Builder channels(Integer channels) {
            this.channels = channels;
            return this;
        }

        /**
         * Setter for startTime
         * @param startTime
         * @return Builder
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setter for endTime
         * @param endTime
         * @return Builder
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Setter for fileFormat
         * @param fileFormat
         * @return Builder
         */
        public Builder fileFormat(FileFormatEnum fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * Setter for status
         * @param status
         * @return Builder
         */
        public Builder status(Status1Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for mediaUrl
         * @param mediaUrl
         * @return Builder
         */
        public Builder mediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }

        /**
         * Setter for transcription
         * @param transcription
         * @return Builder
         */
        public Builder transcription(Transcription transcription) {
            this.transcription = transcription;
            return this;
        }

        /**
         * Builds a new {@link RecordingMetadataResponse} object using the set fields.
         * @return {@link RecordingMetadataResponse}
         */
        public RecordingMetadataResponse build() {
            return new RecordingMetadataResponse(applicationId,
                accountId,
                callId,
                recordingId,
                to,
                from,
                duration,
                direction,
                channels,
                startTime,
                endTime,
                fileFormat,
                status,
                mediaUrl,
                transcription);
        }
    }
}
