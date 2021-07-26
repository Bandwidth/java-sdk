/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.voice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * CallbackMethodEnum to be used.
 */
public enum CallbackMethodEnum {
    POST,

    GET;


    private static TreeMap<String, CallbackMethodEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        POST.value = "POST";
        GET.value = "GET";

        valueMap.put("POST", POST);
        valueMap.put("GET", GET);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CallbackMethodEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of CallbackMethodEnum values to list of string values.
     * @param toConvert The list of CallbackMethodEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CallbackMethodEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CallbackMethodEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 