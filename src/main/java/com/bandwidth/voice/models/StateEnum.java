/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * StateEnum to be used.
 */
public enum StateEnum {
    DISCONNECTED,

    ANSWERED,

    INITIATED;


    private static TreeMap<String, StateEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DISCONNECTED.value = "disconnected";
        ANSWERED.value = "answered";
        INITIATED.value = "initiated";

        valueMap.put("disconnected", DISCONNECTED);
        valueMap.put("answered", ANSWERED);
        valueMap.put("initiated", INITIATED);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StateEnum fromString(String toConvert) {
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
     * Convert list of StateEnum values to list of string values
     * @param toConvert The list of StateEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<StateEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<>();
        for (StateEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 