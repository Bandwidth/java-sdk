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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bandwidth.sdk.JSON;

/**
 * Diversion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Diversion {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private String privacy;

  public static final String SERIALIZED_NAME_SCREEN = "screen";
  @SerializedName(SERIALIZED_NAME_SCREEN)
  private String screen;

  public static final String SERIALIZED_NAME_COUNTER = "counter";
  @SerializedName(SERIALIZED_NAME_COUNTER)
  private String counter;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private String limit;

  public static final String SERIALIZED_NAME_UNKNOWN = "unknown";
  @SerializedName(SERIALIZED_NAME_UNKNOWN)
  private String unknown;

  public static final String SERIALIZED_NAME_ORIG_TO = "origTo";
  @SerializedName(SERIALIZED_NAME_ORIG_TO)
  private String origTo;

  public Diversion() {
  }

  public Diversion reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the diversion. Common values: unknown, user-busy, no-answer, unavailable, unconditional, time-of-day, do-not-disturb, deflection, follow-me, out-of-service, away.
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public Diversion privacy(String privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * off or full
   * @return privacy
  **/
  @javax.annotation.Nullable
  public String getPrivacy() {
    return privacy;
  }

  public void setPrivacy(String privacy) {
    this.privacy = privacy;
  }


  public Diversion screen(String screen) {
    this.screen = screen;
    return this;
  }

   /**
   * No if the number was provided by the user, yes if the number was provided by the network
   * @return screen
  **/
  @javax.annotation.Nullable
  public String getScreen() {
    return screen;
  }

  public void setScreen(String screen) {
    this.screen = screen;
  }


  public Diversion counter(String counter) {
    this.counter = counter;
    return this;
  }

   /**
   * The number of diversions that have occurred
   * @return counter
  **/
  @javax.annotation.Nullable
  public String getCounter() {
    return counter;
  }

  public void setCounter(String counter) {
    this.counter = counter;
  }


  public Diversion limit(String limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of diversions allowed for this session
   * @return limit
  **/
  @javax.annotation.Nullable
  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }


  public Diversion unknown(String unknown) {
    this.unknown = unknown;
    return this;
  }

   /**
   * The normal list of values is not exhaustive. Your application must be tolerant of unlisted keys and unlisted values of those keys.
   * @return unknown
  **/
  @javax.annotation.Nullable
  public String getUnknown() {
    return unknown;
  }

  public void setUnknown(String unknown) {
    this.unknown = unknown;
  }


  public Diversion origTo(String origTo) {
    this.origTo = origTo;
    return this;
  }

   /**
   * Always present. Indicates the last telephone number that the call was diverted from.
   * @return origTo
  **/
  @javax.annotation.Nullable
  public String getOrigTo() {
    return origTo;
  }

  public void setOrigTo(String origTo) {
    this.origTo = origTo;
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
   * @return the Diversion instance itself
   */
  public Diversion putAdditionalProperty(String key, Object value) {
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
    Diversion diversion = (Diversion) o;
    return Objects.equals(this.reason, diversion.reason) &&
        Objects.equals(this.privacy, diversion.privacy) &&
        Objects.equals(this.screen, diversion.screen) &&
        Objects.equals(this.counter, diversion.counter) &&
        Objects.equals(this.limit, diversion.limit) &&
        Objects.equals(this.unknown, diversion.unknown) &&
        Objects.equals(this.origTo, diversion.origTo)&&
        Objects.equals(this.additionalProperties, diversion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, privacy, screen, counter, limit, unknown, origTo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Diversion {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    screen: ").append(toIndentedString(screen)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
    sb.append("    origTo: ").append(toIndentedString(origTo)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("privacy");
    openapiFields.add("screen");
    openapiFields.add("counter");
    openapiFields.add("limit");
    openapiFields.add("unknown");
    openapiFields.add("origTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Diversion
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Diversion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Diversion is not found in the empty JSON string", Diversion.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) && !jsonObj.get("privacy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacy").toString()));
      }
      if ((jsonObj.get("screen") != null && !jsonObj.get("screen").isJsonNull()) && !jsonObj.get("screen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `screen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("screen").toString()));
      }
      if ((jsonObj.get("counter") != null && !jsonObj.get("counter").isJsonNull()) && !jsonObj.get("counter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counter").toString()));
      }
      if ((jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) && !jsonObj.get("limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit").toString()));
      }
      if ((jsonObj.get("unknown") != null && !jsonObj.get("unknown").isJsonNull()) && !jsonObj.get("unknown").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unknown` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unknown").toString()));
      }
      if ((jsonObj.get("origTo") != null && !jsonObj.get("origTo").isJsonNull()) && !jsonObj.get("origTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origTo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Diversion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Diversion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Diversion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Diversion.class));

       return (TypeAdapter<T>) new TypeAdapter<Diversion>() {
           @Override
           public void write(JsonWriter out, Diversion value) throws IOException {
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
           public Diversion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Diversion instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Diversion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Diversion
  * @throws IOException if the JSON string is invalid with respect to Diversion
  */
  public static Diversion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Diversion.class);
  }

 /**
  * Convert an instance of Diversion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

