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
 * StatusEnum to be used.
 */
public enum StatusEnum {
    PROCESSING,

    PARTIAL,

    COMPLETE,

    DELETED,

    ERROR;


    private static TreeMap<String, StatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PROCESSING.value = "processing";
        PARTIAL.value = "partial";
        COMPLETE.value = "complete";
        DELETED.value = "deleted";
        ERROR.value = "error";

        valueMap.put("processing", PROCESSING);
        valueMap.put("partial", PARTIAL);
        valueMap.put("complete", COMPLETE);
        valueMap.put("deleted", DELETED);
        valueMap.put("error", ERROR);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StatusEnum fromString(String toConvert) {
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
     * Convert list of StatusEnum values to list of string values
     * @param toConvert The list of StatusEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<StatusEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<>();
        for (StatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 