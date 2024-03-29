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
 * The HTTP method to use to deliver the callback. GET or POST. Default value is POST.
 */
@JsonAdapter(CallbackMethodEnum.Adapter.class)
public enum CallbackMethodEnum {
  
  GET("GET"),
  
  POST("POST");

  private String value;

  CallbackMethodEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CallbackMethodEnum fromValue(String value) {
    for (CallbackMethodEnum b : CallbackMethodEnum.values()) {
      if (b.value.equalsIgnoreCase(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CallbackMethodEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CallbackMethodEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CallbackMethodEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CallbackMethodEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CallbackMethodEnum.fromValue(value);
  }
}

