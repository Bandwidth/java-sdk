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
 * DisconnectCauseEnum to be used.
 */
public enum DisconnectCauseEnum {
    BUSY,

    CALLBACKERROR,

    CANCEL,

    ERROR,

    HANGUP,

    INVALIDBXML,

    REJECTED,

    TIMEOUT,

    ACCOUNTLIMIT,

    NODECAPACITYEXCEEDED,

    UNKNOWN;


    private static TreeMap<String, DisconnectCauseEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        BUSY.value = "busy";
        CALLBACKERROR.value = "callback-error";
        CANCEL.value = "cancel";
        ERROR.value = "error";
        HANGUP.value = "hangup";
        INVALIDBXML.value = "invalid-bxml";
        REJECTED.value = "rejected";
        TIMEOUT.value = "timeout";
        ACCOUNTLIMIT.value = "account-limit";
        NODECAPACITYEXCEEDED.value = "node-capacity-exceeded";
        UNKNOWN.value = "unknown";

        valueMap.put("busy", BUSY);
        valueMap.put("callback-error", CALLBACKERROR);
        valueMap.put("cancel", CANCEL);
        valueMap.put("error", ERROR);
        valueMap.put("hangup", HANGUP);
        valueMap.put("invalid-bxml", INVALIDBXML);
        valueMap.put("rejected", REJECTED);
        valueMap.put("timeout", TIMEOUT);
        valueMap.put("account-limit", ACCOUNTLIMIT);
        valueMap.put("node-capacity-exceeded", NODECAPACITYEXCEEDED);
        valueMap.put("unknown", UNKNOWN);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DisconnectCauseEnum fromString(String toConvert) {
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
     * Convert list of DisconnectCauseEnum values to list of string values
     * @param toConvert The list of DisconnectCauseEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<DisconnectCauseEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<>();
        for (DisconnectCauseEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 