/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum CallbackMethodEnum {
    GET,

    HEAD,

    POST,

    PUT,

    PATCH,

    DELETE,

    OPTIONS,

    TRACE;


    private static TreeMap<String, CallbackMethodEnum> valueMap = new TreeMap<String, CallbackMethodEnum>();
    private String value;

    static {
        GET.value = "GET";
        HEAD.value = "HEAD";
        POST.value = "POST";
        PUT.value = "PUT";
        PATCH.value = "PATCH";
        DELETE.value = "DELETE";
        OPTIONS.value = "OPTIONS";
        TRACE.value = "TRACE";

        valueMap.put("GET", GET);
        valueMap.put("HEAD", HEAD);
        valueMap.put("POST", POST);
        valueMap.put("PUT", PUT);
        valueMap.put("PATCH", PATCH);
        valueMap.put("DELETE", DELETE);
        valueMap.put("OPTIONS", OPTIONS);
        valueMap.put("TRACE", TRACE);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CallbackMethodEnum fromString(String toConvert) {
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
     * Convert list of CallbackMethodEnum values to list of string values
     * @param toConvert The list of CallbackMethodEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<CallbackMethodEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (CallbackMethodEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 