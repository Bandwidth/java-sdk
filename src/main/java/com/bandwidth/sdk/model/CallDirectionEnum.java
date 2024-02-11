/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bandwidth.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The direction of the call.
 */
@JsonAdapter(CallDirectionEnum.Adapter.class)
public enum CallDirectionEnum {
  
  INBOUND("inbound"),
  
  OUTBOUND("outbound");

  private String value;

  CallDirectionEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CallDirectionEnum fromValue(String value) {
    for (CallDirectionEnum b : CallDirectionEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CallDirectionEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CallDirectionEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CallDirectionEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CallDirectionEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CallDirectionEnum.fromValue(value);
  }
}

