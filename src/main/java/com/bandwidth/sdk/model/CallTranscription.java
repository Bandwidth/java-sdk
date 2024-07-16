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
import com.bandwidth.sdk.model.CallTranscriptionDetectedLanguageEnum;
import com.bandwidth.sdk.model.CallTranscriptionTrackEnum;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bandwidth.sdk.JSON;

/**
 * CallTranscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallTranscription {
  public static final String SERIALIZED_NAME_DETECTED_LANGUAGE = "detectedLanguage";
  @SerializedName(SERIALIZED_NAME_DETECTED_LANGUAGE)
  private CallTranscriptionDetectedLanguageEnum detectedLanguage;

  public static final String SERIALIZED_NAME_TRACK = "track";
  @SerializedName(SERIALIZED_NAME_TRACK)
  private CallTranscriptionTrackEnum track;

  public static final String SERIALIZED_NAME_TRANSCRIPT = "transcript";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPT)
  private String transcript;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Double confidence;

  public CallTranscription() {
  }

  public CallTranscription detectedLanguage(CallTranscriptionDetectedLanguageEnum detectedLanguage) {
    
    this.detectedLanguage = detectedLanguage;
    return this;
  }

   /**
   * Get detectedLanguage
   * @return detectedLanguage
  **/
  @javax.annotation.Nullable
  public CallTranscriptionDetectedLanguageEnum getDetectedLanguage() {
    return detectedLanguage;
  }


  public void setDetectedLanguage(CallTranscriptionDetectedLanguageEnum detectedLanguage) {
    this.detectedLanguage = detectedLanguage;
  }


  public CallTranscription track(CallTranscriptionTrackEnum track) {
    
    this.track = track;
    return this;
  }

   /**
   * Get track
   * @return track
  **/
  @javax.annotation.Nullable
  public CallTranscriptionTrackEnum getTrack() {
    return track;
  }


  public void setTrack(CallTranscriptionTrackEnum track) {
    this.track = track;
  }


  public CallTranscription transcript(String transcript) {
    
    this.transcript = transcript;
    return this;
  }

   /**
   * The transcription itself.
   * @return transcript
  **/
  @javax.annotation.Nullable
  public String getTranscript() {
    return transcript;
  }


  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }


  public CallTranscription confidence(Double confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * How confident the transcription engine was in transcribing the associated audio (from &#x60;0&#x60; to &#x60;1&#x60;).
   * minimum: 0
   * maximum: 1
   * @return confidence
  **/
  @javax.annotation.Nullable
  public Double getConfidence() {
    return confidence;
  }


  public void setConfidence(Double confidence) {
    this.confidence = confidence;
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
   * @return the CallTranscription instance itself
   */
  public CallTranscription putAdditionalProperty(String key, Object value) {
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
    CallTranscription callTranscription = (CallTranscription) o;
    return Objects.equals(this.detectedLanguage, callTranscription.detectedLanguage) &&
        Objects.equals(this.track, callTranscription.track) &&
        Objects.equals(this.transcript, callTranscription.transcript) &&
        Objects.equals(this.confidence, callTranscription.confidence)&&
        Objects.equals(this.additionalProperties, callTranscription.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectedLanguage, track, transcript, confidence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallTranscription {\n");
    sb.append("    detectedLanguage: ").append(toIndentedString(detectedLanguage)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
    openapiFields.add("detectedLanguage");
    openapiFields.add("track");
    openapiFields.add("transcript");
    openapiFields.add("confidence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CallTranscription
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallTranscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallTranscription is not found in the empty JSON string", CallTranscription.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transcript") != null && !jsonObj.get("transcript").isJsonNull()) && !jsonObj.get("transcript").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcript` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcript").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallTranscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallTranscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallTranscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallTranscription.class));

       return (TypeAdapter<T>) new TypeAdapter<CallTranscription>() {
           @Override
           public void write(JsonWriter out, CallTranscription value) throws IOException {
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CallTranscription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CallTranscription instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CallTranscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallTranscription
  * @throws IOException if the JSON string is invalid with respect to CallTranscription
  */
  public static CallTranscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallTranscription.class);
  }

 /**
  * Convert an instance of CallTranscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

