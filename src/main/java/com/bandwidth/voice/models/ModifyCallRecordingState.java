/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ModifyCallRecordingState type.
 */
public class ModifyCallRecordingState {
    private State2Enum state;

    /**
     * Default constructor.
     */
    public ModifyCallRecordingState() {
    }

    /**
     * Initialization constructor.
     * @param state State2Enum value for state.
     */
    public ModifyCallRecordingState(
            State2Enum state) {
        this.state = state;
    }

    /**
     * Getter for State.
     * @return Returns the State2Enum
     */
    @JsonGetter("state")
    public State2Enum getState() {
        return this.state;
    }

    /**
     * Setter for State.
     * @param state Value for State2Enum
     */
    @JsonSetter("state")
    public void setState(State2Enum state) {
        this.state = state;
    }

    /**
     * Converts this ModifyCallRecordingState into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ModifyCallRecordingState [" + "state=" + state + "]";
    }

    /**
     * Builds a new {@link ModifyCallRecordingState.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ModifyCallRecordingState.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(state);
        return builder;
    }

    /**
     * Class to build instances of {@link ModifyCallRecordingState}.
     */
    public static class Builder {
        private State2Enum state;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param state State2Enum value for state.
         */
        public Builder(State2Enum state) {
            this.state = state;
        }

        /**
         * Setter for state.
         * @param state State2Enum value for state.
         * @return Builder
         */
        public Builder state(State2Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Builds a new {@link ModifyCallRecordingState} object using the set fields.
         * @return {@link ModifyCallRecordingState}
         */
        public ModifyCallRecordingState build() {
            return new ModifyCallRecordingState(state);
        }
    }
}
