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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The format that the recording is stored in.
 */
@JsonAdapter(FileFormatEnum.Adapter.class)
public enum FileFormatEnum {
  
  MP3("mp3"),
  
  WAV("wav");

  private String value;

  FileFormatEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileFormatEnum fromValue(String value) {
    for (FileFormatEnum b : FileFormatEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileFormatEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileFormatEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileFormatEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileFormatEnum.fromValue(value);
    }
  }
}

