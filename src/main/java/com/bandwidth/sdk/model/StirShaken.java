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
 * StirShaken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class StirShaken {
  public static final String SERIALIZED_NAME_VERSTAT = "verstat";
  @SerializedName(SERIALIZED_NAME_VERSTAT)
  @javax.annotation.Nullable
  private String verstat;

  public static final String SERIALIZED_NAME_ATTESTATION_INDICATOR = "attestationIndicator";
  @SerializedName(SERIALIZED_NAME_ATTESTATION_INDICATOR)
  @javax.annotation.Nullable
  private String attestationIndicator;

  public static final String SERIALIZED_NAME_ORIGINATING_ID = "originatingId";
  @SerializedName(SERIALIZED_NAME_ORIGINATING_ID)
  @javax.annotation.Nullable
  private String originatingId;

  public StirShaken() {
  }

  public StirShaken verstat(@javax.annotation.Nullable String verstat) {
    this.verstat = verstat;
    return this;
  }

  /**
   * (optional) The verification status indicating whether the verification was successful or not. Possible values are TN-Verification-Passed and TN-Verification-Failed.
   * @return verstat
   */
  @javax.annotation.Nullable
  public String getVerstat() {
    return verstat;
  }

  public void setVerstat(@javax.annotation.Nullable String verstat) {
    this.verstat = verstat;
  }


  public StirShaken attestationIndicator(@javax.annotation.Nullable String attestationIndicator) {
    this.attestationIndicator = attestationIndicator;
    return this;
  }

  /**
   * (optional) The attestation level verified by Bandwidth. Possible values are A (full), B (partial) or C (gateway).
   * @return attestationIndicator
   */
  @javax.annotation.Nullable
  public String getAttestationIndicator() {
    return attestationIndicator;
  }

  public void setAttestationIndicator(@javax.annotation.Nullable String attestationIndicator) {
    this.attestationIndicator = attestationIndicator;
  }


  public StirShaken originatingId(@javax.annotation.Nullable String originatingId) {
    this.originatingId = originatingId;
    return this;
  }

  /**
   * (optional) A unique origination identifier.
   * @return originatingId
   */
  @javax.annotation.Nullable
  public String getOriginatingId() {
    return originatingId;
  }

  public void setOriginatingId(@javax.annotation.Nullable String originatingId) {
    this.originatingId = originatingId;
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
   * @return the StirShaken instance itself
   */
  public StirShaken putAdditionalProperty(String key, Object value) {
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
    StirShaken stirShaken = (StirShaken) o;
    return Objects.equals(this.verstat, stirShaken.verstat) &&
        Objects.equals(this.attestationIndicator, stirShaken.attestationIndicator) &&
        Objects.equals(this.originatingId, stirShaken.originatingId)&&
        Objects.equals(this.additionalProperties, stirShaken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verstat, attestationIndicator, originatingId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StirShaken {\n");
    sb.append("    verstat: ").append(toIndentedString(verstat)).append("\n");
    sb.append("    attestationIndicator: ").append(toIndentedString(attestationIndicator)).append("\n");
    sb.append("    originatingId: ").append(toIndentedString(originatingId)).append("\n");
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
    openapiFields.add("verstat");
    openapiFields.add("attestationIndicator");
    openapiFields.add("originatingId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StirShaken
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StirShaken.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StirShaken is not found in the empty JSON string", StirShaken.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verstat") != null && !jsonObj.get("verstat").isJsonNull()) && !jsonObj.get("verstat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verstat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verstat").toString()));
      }
      if ((jsonObj.get("attestationIndicator") != null && !jsonObj.get("attestationIndicator").isJsonNull()) && !jsonObj.get("attestationIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attestationIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attestationIndicator").toString()));
      }
      if ((jsonObj.get("originatingId") != null && !jsonObj.get("originatingId").isJsonNull()) && !jsonObj.get("originatingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originatingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originatingId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StirShaken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StirShaken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StirShaken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StirShaken.class));

       return (TypeAdapter<T>) new TypeAdapter<StirShaken>() {
           @Override
           public void write(JsonWriter out, StirShaken value) throws IOException {
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
           public StirShaken read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             StirShaken instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of StirShaken given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StirShaken
   * @throws IOException if the JSON string is invalid with respect to StirShaken
   */
  public static StirShaken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StirShaken.class);
  }

  /**
   * Convert an instance of StirShaken to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

