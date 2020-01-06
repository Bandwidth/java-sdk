/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum FileFormatEnum {
    MP3,

    WAV;


    private static TreeMap<String, FileFormatEnum> valueMap = new TreeMap<String, FileFormatEnum>();
    private String value;

    static {
        MP3.value = "mp3";
        WAV.value = "wav";

        valueMap.put("mp3", MP3);
        valueMap.put("wav", WAV);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static FileFormatEnum fromString(String toConvert) {
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
     * Convert list of FileFormatEnum values to list of string values
     * @param toConvert The list of FileFormatEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<FileFormatEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (FileFormatEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 