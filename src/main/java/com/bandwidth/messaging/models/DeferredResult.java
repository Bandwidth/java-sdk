/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.messaging.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DeferredResult type.
 */
public class DeferredResult {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean setOrExpired;

    /**
     * Default constructor.
     */
    public DeferredResult() {
    }

    /**
     * Initialization constructor.
     * @param  result  Object value for result.
     * @param  setOrExpired  Boolean value for setOrExpired.
     */
    public DeferredResult(
            Object result,
            Boolean setOrExpired) {
        this.result = result;
        this.setOrExpired = setOrExpired;
    }

    /**
     * Getter for Result.
     * @return Returns the Object
     */
    @JsonGetter("result")
    public Object getResult() {
        return result;
    }

    /**
     * Setter for Result.
     * @param result Value for Object
     */
    @JsonSetter("result")
    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * Getter for SetOrExpired.
     * @return Returns the Boolean
     */
    @JsonGetter("setOrExpired")
    public Boolean getSetOrExpired() {
        return setOrExpired;
    }

    /**
     * Setter for SetOrExpired.
     * @param setOrExpired Value for Boolean
     */
    @JsonSetter("setOrExpired")
    public void setSetOrExpired(Boolean setOrExpired) {
        this.setOrExpired = setOrExpired;
    }

    /**
     * Converts this DeferredResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeferredResult [" + "result=" + result + ", setOrExpired=" + setOrExpired + "]";
    }

    /**
     * Builds a new {@link DeferredResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeferredResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .result(getResult())
                .setOrExpired(getSetOrExpired());
        return builder;
    }

    /**
     * Class to build instances of {@link DeferredResult}.
     */
    public static class Builder {
        private Object result;
        private Boolean setOrExpired;



        /**
         * Setter for result.
         * @param  result  Object value for result.
         * @return Builder
         */
        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        /**
         * Setter for setOrExpired.
         * @param  setOrExpired  Boolean value for setOrExpired.
         * @return Builder
         */
        public Builder setOrExpired(Boolean setOrExpired) {
            this.setOrExpired = setOrExpired;
            return this;
        }

        /**
         * Builds a new {@link DeferredResult} object using the set fields.
         * @return {@link DeferredResult}
         */
        public DeferredResult build() {
            return new DeferredResult(result, setOrExpired);
        }
    }
}
