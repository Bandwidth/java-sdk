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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The detected language for this transcription.
 */
@JsonAdapter(CallTranscriptionDetectedLanguageEnum.Adapter.class)
public enum CallTranscriptionDetectedLanguageEnum {
  
  EN_US("en-US"),
  
  ES_US("es-US"),
  
  FR_FR("fr-FR");

  private String value;

  CallTranscriptionDetectedLanguageEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CallTranscriptionDetectedLanguageEnum fromValue(String value) {
    for (CallTranscriptionDetectedLanguageEnum b : CallTranscriptionDetectedLanguageEnum.values()) {
      if (b.value.equalsIgnoreCase(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CallTranscriptionDetectedLanguageEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CallTranscriptionDetectedLanguageEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CallTranscriptionDetectedLanguageEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CallTranscriptionDetectedLanguageEnum.fromValue(value);
    }
  }
}
