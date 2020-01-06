/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum State1Enum {
    NOT_RECORDING,

    PAUSED,

    RECORDING;


    private static TreeMap<String, State1Enum> valueMap = new TreeMap<String, State1Enum>();
    private String value;

    static {
        NOT_RECORDING.value = "NOT_RECORDING";
        PAUSED.value = "PAUSED";
        RECORDING.value = "RECORDING";

        valueMap.put("NOT_RECORDING", NOT_RECORDING);
        valueMap.put("PAUSED", PAUSED);
        valueMap.put("RECORDING", RECORDING);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static State1Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of State1Enum values to list of string values
     * @param toConvert The list of State1Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<State1Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (State1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 