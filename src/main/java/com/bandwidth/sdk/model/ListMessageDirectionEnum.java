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
 * The direction of the message. One of INBOUND OUTBOUND.
 */
@JsonAdapter(ListMessageDirectionEnum.Adapter.class)
public enum ListMessageDirectionEnum {
  
  INBOUND("INBOUND"),
  
  OUTBOUND("OUTBOUND");

  private String value;

  ListMessageDirectionEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ListMessageDirectionEnum fromValue(String value) {
    for (ListMessageDirectionEnum b : ListMessageDirectionEnum.values()) {
      if (b.value.equalsIgnoreCase(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ListMessageDirectionEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ListMessageDirectionEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ListMessageDirectionEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ListMessageDirectionEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ListMessageDirectionEnum.fromValue(value);
  }
}

