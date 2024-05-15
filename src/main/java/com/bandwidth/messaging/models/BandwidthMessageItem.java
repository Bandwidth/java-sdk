/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.messaging.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BandwidthMessageItem type.
 */
public class BandwidthMessageItem {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accountId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sourceTn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String destinationTn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageDirection;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageType;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer segmentCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer errorCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiveTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String carrierName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer messageSize;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer messageLength;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer attachmentCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer recipientCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String campaignClass;

    /**
     * Default constructor.
     */
    public BandwidthMessageItem() {
    }

    /**
     * Initialization constructor.
     * @param  messageId  String value for messageId.
     * @param  accountId  String value for accountId.
     * @param  sourceTn  String value for sourceTn.
     * @param  destinationTn  String value for destinationTn.
     * @param  messageStatus  String value for messageStatus.
     * @param  messageDirection  String value for messageDirection.
     * @param  messageType  String value for messageType.
     * @param  segmentCount  Integer value for segmentCount.
     * @param  errorCode  Integer value for errorCode.
     * @param  receiveTime  String value for receiveTime.
     * @param  carrierName  String value for carrierName.
     * @param  messageSize  Integer value for messageSize.
     * @param  messageLength  Integer value for messageLength.
     * @param  attachmentCount  Integer value for attachmentCount.
     * @param  recipientCount  Integer value for recipientCount.
     * @param  campaignClass  String value for campaignClass.
     */
    public BandwidthMessageItem(
            String messageId,
            String accountId,
            String sourceTn,
            String destinationTn,
            String messageStatus,
            String messageDirection,
            String messageType,
            Integer segmentCount,
            Integer errorCode,
            String receiveTime,
            String carrierName,
            Integer messageSize,
            Integer messageLength,
            Integer attachmentCount,
            Integer recipientCount,
            String campaignClass) {
        this.messageId = messageId;
        this.accountId = accountId;
        this.sourceTn = sourceTn;
        this.destinationTn = destinationTn;
        this.messageStatus = messageStatus;
        this.messageDirection = messageDirection;
        this.messageType = messageType;
        this.segmentCount = segmentCount;
        this.errorCode = errorCode;
        this.receiveTime = receiveTime;
        this.carrierName = carrierName;
        this.messageSize = messageSize;
        this.messageLength = messageLength;
        this.attachmentCount = attachmentCount;
        this.recipientCount = recipientCount;
        this.campaignClass = campaignClass;
    }

    /**
     * Getter for MessageId.
     * The message id
     * @return Returns the String
     */
    @JsonGetter("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Setter for MessageId.
     * The message id
     * @param messageId Value for String
     */
    @JsonSetter("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Getter for AccountId.
     * The account id of the message
     * @return Returns the String
     */
    @JsonGetter("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * The account id of the message
     * @param accountId Value for String
     */
    @JsonSetter("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for SourceTn.
     * The source phone number of the message
     * @return Returns the String
     */
    @JsonGetter("sourceTn")
    public String getSourceTn() {
        return sourceTn;
    }

    /**
     * Setter for SourceTn.
     * The source phone number of the message
     * @param sourceTn Value for String
     */
    @JsonSetter("sourceTn")
    public void setSourceTn(String sourceTn) {
        this.sourceTn = sourceTn;
    }

    /**
     * Getter for DestinationTn.
     * The recipient phone number of the message
     * @return Returns the String
     */
    @JsonGetter("destinationTn")
    public String getDestinationTn() {
        return destinationTn;
    }

    /**
     * Setter for DestinationTn.
     * The recipient phone number of the message
     * @param destinationTn Value for String
     */
    @JsonSetter("destinationTn")
    public void setDestinationTn(String destinationTn) {
        this.destinationTn = destinationTn;
    }

    /**
     * Getter for MessageStatus.
     * The status of the message
     * @return Returns the String
     */
    @JsonGetter("messageStatus")
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * Setter for MessageStatus.
     * The status of the message
     * @param messageStatus Value for String
     */
    @JsonSetter("messageStatus")
    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    /**
     * Getter for MessageDirection.
     * The direction of the message relative to Bandwidth. INBOUND or OUTBOUND
     * @return Returns the String
     */
    @JsonGetter("messageDirection")
    public String getMessageDirection() {
        return messageDirection;
    }

    /**
     * Setter for MessageDirection.
     * The direction of the message relative to Bandwidth. INBOUND or OUTBOUND
     * @param messageDirection Value for String
     */
    @JsonSetter("messageDirection")
    public void setMessageDirection(String messageDirection) {
        this.messageDirection = messageDirection;
    }

    /**
     * Getter for MessageType.
     * The type of message. sms or mms
     * @return Returns the String
     */
    @JsonGetter("messageType")
    public String getMessageType() {
        return messageType;
    }

    /**
     * Setter for MessageType.
     * The type of message. sms or mms
     * @param messageType Value for String
     */
    @JsonSetter("messageType")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * Getter for SegmentCount.
     * The number of segments the message was sent as
     * @return Returns the Integer
     */
    @JsonGetter("segmentCount")
    public Integer getSegmentCount() {
        return segmentCount;
    }

    /**
     * Setter for SegmentCount.
     * The number of segments the message was sent as
     * @param segmentCount Value for Integer
     */
    @JsonSetter("segmentCount")
    public void setSegmentCount(Integer segmentCount) {
        this.segmentCount = segmentCount;
    }

    /**
     * Getter for ErrorCode.
     * The numeric error code of the message
     * @return Returns the Integer
     */
    @JsonGetter("errorCode")
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Setter for ErrorCode.
     * The numeric error code of the message
     * @param errorCode Value for Integer
     */
    @JsonSetter("errorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for ReceiveTime.
     * The ISO 8601 datetime of the message
     * @return Returns the String
     */
    @JsonGetter("receiveTime")
    public String getReceiveTime() {
        return receiveTime;
    }

    /**
     * Setter for ReceiveTime.
     * The ISO 8601 datetime of the message
     * @param receiveTime Value for String
     */
    @JsonSetter("receiveTime")
    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * Getter for CarrierName.
     * The name of the carrier. Not currently supported for MMS, coming soon
     * @return Returns the String
     */
    @JsonGetter("carrierName")
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Setter for CarrierName.
     * The name of the carrier. Not currently supported for MMS, coming soon
     * @param carrierName Value for String
     */
    @JsonSetter("carrierName")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Getter for MessageSize.
     * The size of the message including message content and headers
     * @return Returns the Integer
     */
    @JsonGetter("messageSize")
    public Integer getMessageSize() {
        return messageSize;
    }

    /**
     * Setter for MessageSize.
     * The size of the message including message content and headers
     * @param messageSize Value for Integer
     */
    @JsonSetter("messageSize")
    public void setMessageSize(Integer messageSize) {
        this.messageSize = messageSize;
    }

    /**
     * Getter for MessageLength.
     * The length of the message content
     * @return Returns the Integer
     */
    @JsonGetter("messageLength")
    public Integer getMessageLength() {
        return messageLength;
    }

    /**
     * Setter for MessageLength.
     * The length of the message content
     * @param messageLength Value for Integer
     */
    @JsonSetter("messageLength")
    public void setMessageLength(Integer messageLength) {
        this.messageLength = messageLength;
    }

    /**
     * Getter for AttachmentCount.
     * The number of attachments the message has
     * @return Returns the Integer
     */
    @JsonGetter("attachmentCount")
    public Integer getAttachmentCount() {
        return attachmentCount;
    }

    /**
     * Setter for AttachmentCount.
     * The number of attachments the message has
     * @param attachmentCount Value for Integer
     */
    @JsonSetter("attachmentCount")
    public void setAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    /**
     * Getter for RecipientCount.
     * The number of recipients the message has
     * @return Returns the Integer
     */
    @JsonGetter("recipientCount")
    public Integer getRecipientCount() {
        return recipientCount;
    }

    /**
     * Setter for RecipientCount.
     * The number of recipients the message has
     * @param recipientCount Value for Integer
     */
    @JsonSetter("recipientCount")
    public void setRecipientCount(Integer recipientCount) {
        this.recipientCount = recipientCount;
    }

    /**
     * Getter for CampaignClass.
     * The campaign class of the message, if it has one
     * @return Returns the String
     */
    @JsonGetter("campaignClass")
    public String getCampaignClass() {
        return campaignClass;
    }

    /**
     * Setter for CampaignClass.
     * The campaign class of the message, if it has one
     * @param campaignClass Value for String
     */
    @JsonSetter("campaignClass")
    public void setCampaignClass(String campaignClass) {
        this.campaignClass = campaignClass;
    }

    /**
     * Converts this BandwidthMessageItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BandwidthMessageItem [" + "messageId=" + messageId + ", accountId=" + accountId
                + ", sourceTn=" + sourceTn + ", destinationTn=" + destinationTn + ", messageStatus="
                + messageStatus + ", messageDirection=" + messageDirection + ", messageType="
                + messageType + ", segmentCount=" + segmentCount + ", errorCode=" + errorCode
                + ", receiveTime=" + receiveTime + ", carrierName=" + carrierName + ", messageSize="
                + messageSize + ", messageLength=" + messageLength + ", attachmentCount="
                + attachmentCount + ", recipientCount=" + recipientCount + ", campaignClass="
                + campaignClass + "]";
    }

    /**
     * Builds a new {@link BandwidthMessageItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BandwidthMessageItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .messageId(getMessageId())
                .accountId(getAccountId())
                .sourceTn(getSourceTn())
                .destinationTn(getDestinationTn())
                .messageStatus(getMessageStatus())
                .messageDirection(getMessageDirection())
                .messageType(getMessageType())
                .segmentCount(getSegmentCount())
                .errorCode(getErrorCode())
                .receiveTime(getReceiveTime())
                .carrierName(getCarrierName())
                .messageSize(getMessageSize())
                .messageLength(getMessageLength())
                .attachmentCount(getAttachmentCount())
                .recipientCount(getRecipientCount())
                .campaignClass(getCampaignClass());
        return builder;
    }

    /**
     * Class to build instances of {@link BandwidthMessageItem}.
     */
    public static class Builder {
        private String messageId;
        private String accountId;
        private String sourceTn;
        private String destinationTn;
        private String messageStatus;
        private String messageDirection;
        private String messageType;
        private Integer segmentCount;
        private Integer errorCode;
        private String receiveTime;
        private String carrierName;
        private Integer messageSize;
        private Integer messageLength;
        private Integer attachmentCount;
        private Integer recipientCount;
        private String campaignClass;



        /**
         * Setter for messageId.
         * @param  messageId  String value for messageId.
         * @return Builder
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Setter for accountId.
         * @param  accountId  String value for accountId.
         * @return Builder
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Setter for sourceTn.
         * @param  sourceTn  String value for sourceTn.
         * @return Builder
         */
        public Builder sourceTn(String sourceTn) {
            this.sourceTn = sourceTn;
            return this;
        }

        /**
         * Setter for destinationTn.
         * @param  destinationTn  String value for destinationTn.
         * @return Builder
         */
        public Builder destinationTn(String destinationTn) {
            this.destinationTn = destinationTn;
            return this;
        }

        /**
         * Setter for messageStatus.
         * @param  messageStatus  String value for messageStatus.
         * @return Builder
         */
        public Builder messageStatus(String messageStatus) {
            this.messageStatus = messageStatus;
            return this;
        }

        /**
         * Setter for messageDirection.
         * @param  messageDirection  String value for messageDirection.
         * @return Builder
         */
        public Builder messageDirection(String messageDirection) {
            this.messageDirection = messageDirection;
            return this;
        }

        /**
         * Setter for messageType.
         * @param  messageType  String value for messageType.
         * @return Builder
         */
        public Builder messageType(String messageType) {
            this.messageType = messageType;
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
         * Setter for errorCode.
         * @param  errorCode  Integer value for errorCode.
         * @return Builder
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Setter for receiveTime.
         * @param  receiveTime  String value for receiveTime.
         * @return Builder
         */
        public Builder receiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }

        /**
         * Setter for carrierName.
         * @param  carrierName  String value for carrierName.
         * @return Builder
         */
        public Builder carrierName(String carrierName) {
            this.carrierName = carrierName;
            return this;
        }

        /**
         * Setter for messageSize.
         * @param  messageSize  Integer value for messageSize.
         * @return Builder
         */
        public Builder messageSize(Integer messageSize) {
            this.messageSize = messageSize;
            return this;
        }

        /**
         * Setter for messageLength.
         * @param  messageLength  Integer value for messageLength.
         * @return Builder
         */
        public Builder messageLength(Integer messageLength) {
            this.messageLength = messageLength;
            return this;
        }

        /**
         * Setter for attachmentCount.
         * @param  attachmentCount  Integer value for attachmentCount.
         * @return Builder
         */
        public Builder attachmentCount(Integer attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }

        /**
         * Setter for recipientCount.
         * @param  recipientCount  Integer value for recipientCount.
         * @return Builder
         */
        public Builder recipientCount(Integer recipientCount) {
            this.recipientCount = recipientCount;
            return this;
        }

        /**
         * Setter for campaignClass.
         * @param  campaignClass  String value for campaignClass.
         * @return Builder
         */
        public Builder campaignClass(String campaignClass) {
            this.campaignClass = campaignClass;
            return this;
        }

        /**
         * Builds a new {@link BandwidthMessageItem} object using the set fields.
         * @return {@link BandwidthMessageItem}
         */
        public BandwidthMessageItem build() {
            return new BandwidthMessageItem(messageId, accountId, sourceTn, destinationTn,
                    messageStatus, messageDirection, messageType, segmentCount, errorCode,
                    receiveTime, carrierName, messageSize, messageLength, attachmentCount,
                    recipientCount, campaignClass);
        }
    }
}