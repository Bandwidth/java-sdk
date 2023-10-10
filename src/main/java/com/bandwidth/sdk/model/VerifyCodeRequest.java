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
import java.math.BigDecimal;
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
 * VerifyCodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-10T14:02:16.650130Z[Etc/UTC]")
public class VerifyCodeRequest {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_IN_MINUTES = "expirationTimeInMinutes";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_IN_MINUTES)
  private BigDecimal expirationTimeInMinutes;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public VerifyCodeRequest() {
  }

  public VerifyCodeRequest to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The phone number to send the mfa code to.
   * @return to
  **/
  @javax.annotation.Nonnull
  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public VerifyCodeRequest scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * An optional field to denote what scope or action the mfa code is addressing.  If not supplied, defaults to \&quot;2FA\&quot;.
   * @return scope
  **/
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public VerifyCodeRequest expirationTimeInMinutes(BigDecimal expirationTimeInMinutes) {
    
    this.expirationTimeInMinutes = expirationTimeInMinutes;
    return this;
  }

   /**
   * The time period, in minutes, to validate the mfa code.  By setting this to 3 minutes, it will mean any code generated within the last 3 minutes are still valid.  The valid range for expiration time is between 0 and 15 minutes, exclusively and inclusively, respectively.
   * minimum: 1
   * maximum: 15
   * @return expirationTimeInMinutes
  **/
  @javax.annotation.Nonnull
  public BigDecimal getExpirationTimeInMinutes() {
    return expirationTimeInMinutes;
  }


  public void setExpirationTimeInMinutes(BigDecimal expirationTimeInMinutes) {
    this.expirationTimeInMinutes = expirationTimeInMinutes;
  }


  public VerifyCodeRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The generated mfa code to check if valid.
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
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
   * @return the VerifyCodeRequest instance itself
   */
  public VerifyCodeRequest putAdditionalProperty(String key, Object value) {
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
    VerifyCodeRequest verifyCodeRequest = (VerifyCodeRequest) o;
    return Objects.equals(this.to, verifyCodeRequest.to) &&
        Objects.equals(this.scope, verifyCodeRequest.scope) &&
        Objects.equals(this.expirationTimeInMinutes, verifyCodeRequest.expirationTimeInMinutes) &&
        Objects.equals(this.code, verifyCodeRequest.code)&&
        Objects.equals(this.additionalProperties, verifyCodeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, scope, expirationTimeInMinutes, code, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCodeRequest {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    expirationTimeInMinutes: ").append(toIndentedString(expirationTimeInMinutes)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
    openapiFields.add("to");
    openapiFields.add("scope");
    openapiFields.add("expirationTimeInMinutes");
    openapiFields.add("code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("expirationTimeInMinutes");
    openapiRequiredFields.add("code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VerifyCodeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VerifyCodeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyCodeRequest is not found in the empty JSON string", VerifyCodeRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerifyCodeRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifyCodeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyCodeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyCodeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyCodeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyCodeRequest>() {
           @Override
           public void write(JsonWriter out, VerifyCodeRequest value) throws IOException {
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
           public VerifyCodeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VerifyCodeRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VerifyCodeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyCodeRequest
  * @throws IOException if the JSON string is invalid with respect to VerifyCodeRequest
  */
  public static VerifyCodeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyCodeRequest.class);
  }

 /**
  * Convert an instance of VerifyCodeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

