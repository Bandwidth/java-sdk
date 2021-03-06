/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.webrtc.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * DeviceApiVersionEnum to be used.
 */
public enum DeviceApiVersionEnum {
    V3,

    V2;


    private static TreeMap<String, DeviceApiVersionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        V3.value = "V3";
        V2.value = "V2";

        valueMap.put("V3", V3);
        valueMap.put("V2", V2);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeviceApiVersionEnum fromString(String toConvert) {
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
     * Convert list of DeviceApiVersionEnum values to list of string values.
     * @param toConvert The list of DeviceApiVersionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DeviceApiVersionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DeviceApiVersionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 