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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bandwidth.sdk.JSON;

/**
 * CallTranscriptionMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CallTranscriptionMetadata {
  public static final String SERIALIZED_NAME_TRANSCRIPTION_ID = "transcriptionId";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPTION_ID)
  @javax.annotation.Nullable
  private String transcriptionId;

  public static final String SERIALIZED_NAME_TRANSCRIPTION_NAME = "transcriptionName";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPTION_NAME)
  @javax.annotation.Nullable
  private String transcriptionName;

  public static final String SERIALIZED_NAME_TRANSCRIPTION_URL = "transcriptionUrl";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPTION_URL)
  @javax.annotation.Nullable
  private String transcriptionUrl;

  public CallTranscriptionMetadata() {
  }

  public CallTranscriptionMetadata transcriptionId(@javax.annotation.Nullable String transcriptionId) {
    this.transcriptionId = transcriptionId;
    return this;
  }

  /**
   * The programmable voice API transcription ID.
   * @return transcriptionId
   */
  @javax.annotation.Nullable
  public String getTranscriptionId() {
    return transcriptionId;
  }

  public void setTranscriptionId(@javax.annotation.Nullable String transcriptionId) {
    this.transcriptionId = transcriptionId;
  }


  public CallTranscriptionMetadata transcriptionName(@javax.annotation.Nullable String transcriptionName) {
    this.transcriptionName = transcriptionName;
    return this;
  }

  /**
   * The programmable voice API transcription name. This name could be provided by the user when creating the transcription.
   * @return transcriptionName
   */
  @javax.annotation.Nullable
  public String getTranscriptionName() {
    return transcriptionName;
  }

  public void setTranscriptionName(@javax.annotation.Nullable String transcriptionName) {
    this.transcriptionName = transcriptionName;
  }


  public CallTranscriptionMetadata transcriptionUrl(@javax.annotation.Nullable String transcriptionUrl) {
    this.transcriptionUrl = transcriptionUrl;
    return this;
  }

  /**
   * A URL that may be used to retrieve the transcription itself. This points to the [Get Call Transcription](/apis/voice/#operation/getCallTranscription) endpoint.
   * @return transcriptionUrl
   */
  @javax.annotation.Nullable
  public String getTranscriptionUrl() {
    return transcriptionUrl;
  }

  public void setTranscriptionUrl(@javax.annotation.Nullable String transcriptionUrl) {
    this.transcriptionUrl = transcriptionUrl;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CallTranscriptionMetadata instance itself
   */
  public CallTranscriptionMetadata putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallTranscriptionMetadata callTranscriptionMetadata = (CallTranscriptionMetadata) o;
    return Objects.equals(this.transcriptionId, callTranscriptionMetadata.transcriptionId) &&
        Objects.equals(this.transcriptionName, callTranscriptionMetadata.transcriptionName) &&
        Objects.equals(this.transcriptionUrl, callTranscriptionMetadata.transcriptionUrl)&&
        Objects.equals(this.additionalProperties, callTranscriptionMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcriptionId, transcriptionName, transcriptionUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallTranscriptionMetadata {\n");
    sb.append("    transcriptionId: ").append(toIndentedString(transcriptionId)).append("\n");
    sb.append("    transcriptionName: ").append(toIndentedString(transcriptionName)).append("\n");
    sb.append("    transcriptionUrl: ").append(toIndentedString(transcriptionUrl)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("transcriptionId");
    openapiFields.add("transcriptionName");
    openapiFields.add("transcriptionUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallTranscriptionMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallTranscriptionMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallTranscriptionMetadata is not found in the empty JSON string", CallTranscriptionMetadata.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transcriptionId") != null && !jsonObj.get("transcriptionId").isJsonNull()) && !jsonObj.get("transcriptionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcriptionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcriptionId").toString()));
      }
      if ((jsonObj.get("transcriptionName") != null && !jsonObj.get("transcriptionName").isJsonNull()) && !jsonObj.get("transcriptionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcriptionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcriptionName").toString()));
      }
      if ((jsonObj.get("transcriptionUrl") != null && !jsonObj.get("transcriptionUrl").isJsonNull()) && !jsonObj.get("transcriptionUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcriptionUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcriptionUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallTranscriptionMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallTranscriptionMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallTranscriptionMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallTranscriptionMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<CallTranscriptionMetadata>() {
           @Override
           public void write(JsonWriter out, CallTranscriptionMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CallTranscriptionMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CallTranscriptionMetadata instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CallTranscriptionMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallTranscriptionMetadata
   * @throws IOException if the JSON string is invalid with respect to CallTranscriptionMetadata
   */
  public static CallTranscriptionMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallTranscriptionMetadata.class);
  }

  /**
   * Convert an instance of CallTranscriptionMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

