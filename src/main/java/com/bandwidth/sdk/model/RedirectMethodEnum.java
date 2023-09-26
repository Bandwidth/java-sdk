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
 * The HTTP method to use for the request to &#x60;redirectUrl&#x60;. GET or POST. Default value is POST.&lt;br&gt;&lt;br&gt;Not allowed if &#x60;state&#x60; is &#x60;completed&#x60;.
 */
@JsonAdapter(RedirectMethodEnum.Adapter.class)
public enum RedirectMethodEnum {
  
  GET("GET"),
  
  POST("POST");

  private String value;

  RedirectMethodEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RedirectMethodEnum fromValue(String value) {
    for (RedirectMethodEnum b : RedirectMethodEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RedirectMethodEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final RedirectMethodEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RedirectMethodEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RedirectMethodEnum.fromValue(value);
    }
  }
}

