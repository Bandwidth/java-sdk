package com.bandwidth.sdk.model;

import com.google.gson.annotations.SerializedName;

public enum ReferCallStatusEnum {
    
    @SerializedName("success")
    SUCCESS("success"),

    @SerializedName("failure")
    FAILURE("failure");

    private String value;

    ReferCallStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReferCallStatusEnum fromValue(String value) {
        for (ReferCallStatusEnum b : ReferCallStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static void validateJsonElement(com.google.gson.JsonElement jsonElement) throws java.io.IOException {
        String value = jsonElement.getAsString();
        ReferCallStatusEnum.fromValue(value);
    }
}