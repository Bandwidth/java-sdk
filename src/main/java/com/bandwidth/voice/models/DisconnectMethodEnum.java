/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum DisconnectMethodEnum {
    POST,

    GET;


    private static TreeMap<String, DisconnectMethodEnum> valueMap = new TreeMap<String, DisconnectMethodEnum>();
    private String value;

    static {
        POST.value = "POST";
        GET.value = "GET";

        valueMap.put("POST", POST);
        valueMap.put("GET", GET);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DisconnectMethodEnum fromString(String toConvert) {
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
     * Convert list of DisconnectMethodEnum values to list of string values
     * @param toConvert The list of DisconnectMethodEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<DisconnectMethodEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (DisconnectMethodEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 