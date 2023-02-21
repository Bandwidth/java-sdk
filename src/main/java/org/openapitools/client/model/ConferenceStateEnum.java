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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Setting the conference state to &#x60;completed&#x60; ends the conference and ejects all members
 */
@JsonAdapter(ConferenceStateEnum.Adapter.class)
public enum ConferenceStateEnum {
  
  ACTIVE("active"),
  
  COMPLETED("completed");

  private String value;

  ConferenceStateEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConferenceStateEnum fromValue(String value) {
    for (ConferenceStateEnum b : ConferenceStateEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConferenceStateEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConferenceStateEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConferenceStateEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConferenceStateEnum.fromValue(value);
    }
  }
}

