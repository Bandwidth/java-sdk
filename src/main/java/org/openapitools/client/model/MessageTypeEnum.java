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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of message. Either SMS or MMS.
 */
@JsonAdapter(MessageTypeEnum.Adapter.class)
public enum MessageTypeEnum {
  
  SMS("sms"),
  
  MMS("mms");

  private String value;

  MessageTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MessageTypeEnum fromValue(String value) {
    for (MessageTypeEnum b : MessageTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MessageTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final MessageTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MessageTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MessageTypeEnum.fromValue(value);
    }
  }
}

