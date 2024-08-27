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
import com.bandwidth.sdk.model.CallTranscription;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * CallTranscriptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class CallTranscriptionResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_TRANSCRIPTION_ID = "transcriptionId";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPTION_ID)
  private String transcriptionId;

  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private List<CallTranscription> tracks = new ArrayList<>();

  public CallTranscriptionResponse() {
  }

  public CallTranscriptionResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The user account associated with the call.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CallTranscriptionResponse callId(String callId) {
    this.callId = callId;
    return this;
  }

  /**
   * The call id associated with the event.
   * @return callId
   */
  @javax.annotation.Nullable
  public String getCallId() {
    return callId;
  }

  public void setCallId(String callId) {
    this.callId = callId;
  }


  public CallTranscriptionResponse transcriptionId(String transcriptionId) {
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

  public void setTranscriptionId(String transcriptionId) {
    this.transcriptionId = transcriptionId;
  }


  public CallTranscriptionResponse tracks(List<CallTranscription> tracks) {
    this.tracks = tracks;
    return this;
  }

  public CallTranscriptionResponse addTracksItem(CallTranscription tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

  /**
   * Get tracks
   * @return tracks
   */
  @javax.annotation.Nullable
  public List<CallTranscription> getTracks() {
    return tracks;
  }

  public void setTracks(List<CallTranscription> tracks) {
    this.tracks = tracks;
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
   * @return the CallTranscriptionResponse instance itself
   */
  public CallTranscriptionResponse putAdditionalProperty(String key, Object value) {
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
    CallTranscriptionResponse callTranscriptionResponse = (CallTranscriptionResponse) o;
    return Objects.equals(this.accountId, callTranscriptionResponse.accountId) &&
        Objects.equals(this.callId, callTranscriptionResponse.callId) &&
        Objects.equals(this.transcriptionId, callTranscriptionResponse.transcriptionId) &&
        Objects.equals(this.tracks, callTranscriptionResponse.tracks)&&
        Objects.equals(this.additionalProperties, callTranscriptionResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, callId, transcriptionId, tracks, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallTranscriptionResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    transcriptionId: ").append(toIndentedString(transcriptionId)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("callId");
    openapiFields.add("transcriptionId");
    openapiFields.add("tracks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallTranscriptionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallTranscriptionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallTranscriptionResponse is not found in the empty JSON string", CallTranscriptionResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("callId") != null && !jsonObj.get("callId").isJsonNull()) && !jsonObj.get("callId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callId").toString()));
      }
      if ((jsonObj.get("transcriptionId") != null && !jsonObj.get("transcriptionId").isJsonNull()) && !jsonObj.get("transcriptionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcriptionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcriptionId").toString()));
      }
      if (jsonObj.get("tracks") != null && !jsonObj.get("tracks").isJsonNull()) {
        JsonArray jsonArraytracks = jsonObj.getAsJsonArray("tracks");
        if (jsonArraytracks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tracks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tracks` to be an array in the JSON string but got `%s`", jsonObj.get("tracks").toString()));
          }

          // validate the optional field `tracks` (array)
          for (int i = 0; i < jsonArraytracks.size(); i++) {
            CallTranscription.validateJsonElement(jsonArraytracks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallTranscriptionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallTranscriptionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallTranscriptionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallTranscriptionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CallTranscriptionResponse>() {
           @Override
           public void write(JsonWriter out, CallTranscriptionResponse value) throws IOException {
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
           public CallTranscriptionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CallTranscriptionResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CallTranscriptionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallTranscriptionResponse
   * @throws IOException if the JSON string is invalid with respect to CallTranscriptionResponse
   */
  public static CallTranscriptionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallTranscriptionResponse.class);
  }

  /**
   * Convert an instance of CallTranscriptionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

