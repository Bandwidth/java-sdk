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

import org.openapitools.client.JSON;

/**
 * StirShaken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T14:55:39.427023-04:00[America/New_York]")
public class StirShaken {
  public static final String SERIALIZED_NAME_VERSTAT = "verstat";
  @SerializedName(SERIALIZED_NAME_VERSTAT)
  private String verstat;

  public static final String SERIALIZED_NAME_ATTESTATION_INDICATOR = "attestationIndicator";
  @SerializedName(SERIALIZED_NAME_ATTESTATION_INDICATOR)
  private String attestationIndicator;

  public static final String SERIALIZED_NAME_ORIGINATING_ID = "originatingId";
  @SerializedName(SERIALIZED_NAME_ORIGINATING_ID)
  private String originatingId;

  public StirShaken() {
  }

  public StirShaken verstat(String verstat) {
    
    this.verstat = verstat;
    return this;
  }

   /**
   * (optional) The verification status indicating whether the verification was successful or not. Possible values are TN-Verification-Passed and TN-Verification-Failed.
   * @return verstat
  **/
  @javax.annotation.Nullable
  public String getVerstat() {
    return verstat;
  }


  public void setVerstat(String verstat) {
    this.verstat = verstat;
  }


  public StirShaken attestationIndicator(String attestationIndicator) {
    
    this.attestationIndicator = attestationIndicator;
    return this;
  }

   /**
   * (optional) The attestation level verified by Bandwidth. Possible values are A (full), B (partial) or C (gateway).
   * @return attestationIndicator
  **/
  @javax.annotation.Nullable
  public String getAttestationIndicator() {
    return attestationIndicator;
  }


  public void setAttestationIndicator(String attestationIndicator) {
    this.attestationIndicator = attestationIndicator;
  }


  public StirShaken originatingId(String originatingId) {
    
    this.originatingId = originatingId;
    return this;
  }

   /**
   * (optional) A unique origination identifier.
   * @return originatingId
  **/
  @javax.annotation.Nullable
  public String getOriginatingId() {
    return originatingId;
  }


  public void setOriginatingId(String originatingId) {
    this.originatingId = originatingId;
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
        Objects.equals(this.originatingId, stirShaken.originatingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verstat, attestationIndicator, originatingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StirShaken {\n");
    sb.append("    verstat: ").append(toIndentedString(verstat)).append("\n");
    sb.append("    attestationIndicator: ").append(toIndentedString(attestationIndicator)).append("\n");
    sb.append("    originatingId: ").append(toIndentedString(originatingId)).append("\n");
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

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StirShaken.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StirShaken` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public StirShaken read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

