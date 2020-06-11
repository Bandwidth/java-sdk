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
 * Status2Enum to be used.
 */
public enum Status2Enum {
    NONE,

    PROCESSING,

    AVAILABLE,

    ERROR,

    TIMEOUT,

    FILESIZETOOBIG,

    FILESIZETOOSMALL;


    private static TreeMap<String, Status2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        NONE.value = "none";
        PROCESSING.value = "processing";
        AVAILABLE.value = "available";
        ERROR.value = "error";
        TIMEOUT.value = "timeout";
        FILESIZETOOBIG.value = "file-size-too-big";
        FILESIZETOOSMALL.value = "file-size-too-small";

        valueMap.put("none", NONE);
        valueMap.put("processing", PROCESSING);
        valueMap.put("available", AVAILABLE);
        valueMap.put("error", ERROR);
        valueMap.put("timeout", TIMEOUT);
        valueMap.put("file-size-too-big", FILESIZETOOBIG);
        valueMap.put("file-size-too-small", FILESIZETOOSMALL);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Status2Enum fromString(String toConvert) {
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
     * Convert list of Status2Enum values to list of string values
     * @param toConvert The list of Status2Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Status2Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<>();
        for (Status2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 