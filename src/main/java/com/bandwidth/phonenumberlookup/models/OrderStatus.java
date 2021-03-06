/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.phonenumberlookup.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for OrderStatus type.
 */
public class OrderStatus {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String requestId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> failedTelephoneNumbers;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Result> result;

    /**
     * Default constructor.
     */
    public OrderStatus() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     * @param  failedTelephoneNumbers  List of String value for failedTelephoneNumbers.
     * @param  result  List of Result value for result.
     */
    public OrderStatus(
            String requestId,
            String status,
            List<String> failedTelephoneNumbers,
            List<Result> result) {
        this.requestId = requestId;
        this.status = status;
        this.failedTelephoneNumbers = failedTelephoneNumbers;
        this.result = result;
    }

    /**
     * Getter for RequestId.
     * The requestId.
     * @return Returns the String
     */
    @JsonGetter("requestId")
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * The requestId.
     * @param requestId Value for String
     */
    @JsonSetter("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * The status of the request (IN_PROGRESS, COMPLETE, PARTIAL_COMPLETE, or FAILED).
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the request (IN_PROGRESS, COMPLETE, PARTIAL_COMPLETE, or FAILED).
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for FailedTelephoneNumbers.
     * The telephone numbers whose lookup failed
     * @return Returns the List of String
     */
    @JsonGetter("failedTelephoneNumbers")
    public List<String> getFailedTelephoneNumbers() {
        return failedTelephoneNumbers;
    }

    /**
     * Setter for FailedTelephoneNumbers.
     * The telephone numbers whose lookup failed
     * @param failedTelephoneNumbers Value for List of String
     */
    @JsonSetter("failedTelephoneNumbers")
    public void setFailedTelephoneNumbers(List<String> failedTelephoneNumbers) {
        this.failedTelephoneNumbers = failedTelephoneNumbers;
    }

    /**
     * Getter for Result.
     * The carrier information results for the specified telephone number.
     * @return Returns the List of Result
     */
    @JsonGetter("result")
    public List<Result> getResult() {
        return result;
    }

    /**
     * Setter for Result.
     * The carrier information results for the specified telephone number.
     * @param result Value for List of Result
     */
    @JsonSetter("result")
    public void setResult(List<Result> result) {
        this.result = result;
    }

    /**
     * Converts this OrderStatus into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderStatus [" + "requestId=" + requestId + ", status=" + status
                + ", failedTelephoneNumbers=" + failedTelephoneNumbers + ", result=" + result + "]";
    }

    /**
     * Builds a new {@link OrderStatus.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderStatus.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .status(getStatus())
                .failedTelephoneNumbers(getFailedTelephoneNumbers())
                .result(getResult());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderStatus}.
     */
    public static class Builder {
        private String requestId;
        private String status;
        private List<String> failedTelephoneNumbers;
        private List<Result> result;



        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for failedTelephoneNumbers.
         * @param  failedTelephoneNumbers  List of String value for failedTelephoneNumbers.
         * @return Builder
         */
        public Builder failedTelephoneNumbers(List<String> failedTelephoneNumbers) {
            this.failedTelephoneNumbers = failedTelephoneNumbers;
            return this;
        }

        /**
         * Setter for result.
         * @param  result  List of Result value for result.
         * @return Builder
         */
        public Builder result(List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Builds a new {@link OrderStatus} object using the set fields.
         * @return {@link OrderStatus}
         */
        public OrderStatus build() {
            return new OrderStatus(requestId, status, failedTelephoneNumbers, result);
        }
    }
}
