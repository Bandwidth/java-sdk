package com.bandwidth.sdk.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The outcome of the SIP REFER attempt.
 */
@JsonAdapter(ReferCallStatusEnum.Adapter.class)
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

    public static class Adapter extends TypeAdapter<ReferCallStatusEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final ReferCallStatusEnum enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReferCallStatusEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReferCallStatusEnum.fromValue(value);
        }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        String value = jsonElement.getAsString();
        ReferCallStatusEnum.fromValue(value);
    }
}