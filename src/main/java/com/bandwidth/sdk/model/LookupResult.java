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
 * Carrier information results for the specified telephone number.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class LookupResult {
  public static final String SERIALIZED_NAME_RESPONSE_CODE = "Response Code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  @javax.annotation.Nullable
  private Integer responseCode;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_E164_FORMAT = "E.164 Format";
  @SerializedName(SERIALIZED_NAME_E164_FORMAT)
  @javax.annotation.Nullable
  private String e164Format;

  public static final String SERIALIZED_NAME_FORMATTED = "Formatted";
  @SerializedName(SERIALIZED_NAME_FORMATTED)
  @javax.annotation.Nullable
  private String formatted;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_LINE_TYPE = "Line Type";
  @SerializedName(SERIALIZED_NAME_LINE_TYPE)
  @javax.annotation.Nullable
  private String lineType;

  public static final String SERIALIZED_NAME_LINE_PROVIDER = "Line Provider";
  @SerializedName(SERIALIZED_NAME_LINE_PROVIDER)
  @javax.annotation.Nullable
  private String lineProvider;

  public static final String SERIALIZED_NAME_MOBILE_COUNTRY_CODE = "Mobile Country Code";
  @SerializedName(SERIALIZED_NAME_MOBILE_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String mobileCountryCode;

  public static final String SERIALIZED_NAME_MOBILE_NETWORK_CODE = "Mobile Network Code";
  @SerializedName(SERIALIZED_NAME_MOBILE_NETWORK_CODE)
  @javax.annotation.Nullable
  private String mobileNetworkCode;

  public LookupResult() {
  }

  public LookupResult responseCode(@javax.annotation.Nullable Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Our vendor&#39;s response code.
   * @return responseCode
   */
  @javax.annotation.Nullable
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(@javax.annotation.Nullable Integer responseCode) {
    this.responseCode = responseCode;
  }


  public LookupResult message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Message associated with the response code.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public LookupResult e164Format(@javax.annotation.Nullable String e164Format) {
    this.e164Format = e164Format;
    return this;
  }

  /**
   * The telephone number in E.164 format.
   * @return e164Format
   */
  @javax.annotation.Nullable
  public String getE164Format() {
    return e164Format;
  }

  public void setE164Format(@javax.annotation.Nullable String e164Format) {
    this.e164Format = e164Format;
  }


  public LookupResult formatted(@javax.annotation.Nullable String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * The formatted version of the telephone number.
   * @return formatted
   */
  @javax.annotation.Nullable
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(@javax.annotation.Nullable String formatted) {
    this.formatted = formatted;
  }


  public LookupResult country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of the telephone number.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public LookupResult lineType(@javax.annotation.Nullable String lineType) {
    this.lineType = lineType;
    return this;
  }

  /**
   * The line type of the telephone number.
   * @return lineType
   */
  @javax.annotation.Nullable
  public String getLineType() {
    return lineType;
  }

  public void setLineType(@javax.annotation.Nullable String lineType) {
    this.lineType = lineType;
  }


  public LookupResult lineProvider(@javax.annotation.Nullable String lineProvider) {
    this.lineProvider = lineProvider;
    return this;
  }

  /**
   * The messaging service provider of the telephone number.
   * @return lineProvider
   */
  @javax.annotation.Nullable
  public String getLineProvider() {
    return lineProvider;
  }

  public void setLineProvider(@javax.annotation.Nullable String lineProvider) {
    this.lineProvider = lineProvider;
  }


  public LookupResult mobileCountryCode(@javax.annotation.Nullable String mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
    return this;
  }

  /**
   * The first half of the Home Network Identity (HNI).
   * @return mobileCountryCode
   */
  @javax.annotation.Nullable
  public String getMobileCountryCode() {
    return mobileCountryCode;
  }

  public void setMobileCountryCode(@javax.annotation.Nullable String mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
  }


  public LookupResult mobileNetworkCode(@javax.annotation.Nullable String mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
    return this;
  }

  /**
   * The second half of the HNI.
   * @return mobileNetworkCode
   */
  @javax.annotation.Nullable
  public String getMobileNetworkCode() {
    return mobileNetworkCode;
  }

  public void setMobileNetworkCode(@javax.annotation.Nullable String mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
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
   * @return the LookupResult instance itself
   */
  public LookupResult putAdditionalProperty(String key, Object value) {
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
    LookupResult lookupResult = (LookupResult) o;
    return Objects.equals(this.responseCode, lookupResult.responseCode) &&
        Objects.equals(this.message, lookupResult.message) &&
        Objects.equals(this.e164Format, lookupResult.e164Format) &&
        Objects.equals(this.formatted, lookupResult.formatted) &&
        Objects.equals(this.country, lookupResult.country) &&
        Objects.equals(this.lineType, lookupResult.lineType) &&
        Objects.equals(this.lineProvider, lookupResult.lineProvider) &&
        Objects.equals(this.mobileCountryCode, lookupResult.mobileCountryCode) &&
        Objects.equals(this.mobileNetworkCode, lookupResult.mobileNetworkCode)&&
        Objects.equals(this.additionalProperties, lookupResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, message, e164Format, formatted, country, lineType, lineProvider, mobileCountryCode, mobileNetworkCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupResult {\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    e164Format: ").append(toIndentedString(e164Format)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    lineProvider: ").append(toIndentedString(lineProvider)).append("\n");
    sb.append("    mobileCountryCode: ").append(toIndentedString(mobileCountryCode)).append("\n");
    sb.append("    mobileNetworkCode: ").append(toIndentedString(mobileNetworkCode)).append("\n");
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
    openapiFields.add("Response Code");
    openapiFields.add("Message");
    openapiFields.add("E.164 Format");
    openapiFields.add("Formatted");
    openapiFields.add("Country");
    openapiFields.add("Line Type");
    openapiFields.add("Line Provider");
    openapiFields.add("Mobile Country Code");
    openapiFields.add("Mobile Network Code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LookupResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LookupResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookupResult is not found in the empty JSON string", LookupResult.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonNull()) && !jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
      if ((jsonObj.get("E.164 Format") != null && !jsonObj.get("E.164 Format").isJsonNull()) && !jsonObj.get("E.164 Format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `E.164 Format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("E.164 Format").toString()));
      }
      if ((jsonObj.get("Formatted") != null && !jsonObj.get("Formatted").isJsonNull()) && !jsonObj.get("Formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Formatted").toString()));
      }
      if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull()) && !jsonObj.get("Country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if ((jsonObj.get("Line Type") != null && !jsonObj.get("Line Type").isJsonNull()) && !jsonObj.get("Line Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Line Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Line Type").toString()));
      }
      if ((jsonObj.get("Line Provider") != null && !jsonObj.get("Line Provider").isJsonNull()) && !jsonObj.get("Line Provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Line Provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Line Provider").toString()));
      }
      if ((jsonObj.get("Mobile Country Code") != null && !jsonObj.get("Mobile Country Code").isJsonNull()) && !jsonObj.get("Mobile Country Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mobile Country Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mobile Country Code").toString()));
      }
      if ((jsonObj.get("Mobile Network Code") != null && !jsonObj.get("Mobile Network Code").isJsonNull()) && !jsonObj.get("Mobile Network Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mobile Network Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mobile Network Code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookupResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookupResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookupResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookupResult.class));

       return (TypeAdapter<T>) new TypeAdapter<LookupResult>() {
           @Override
           public void write(JsonWriter out, LookupResult value) throws IOException {
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
           public LookupResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LookupResult instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of LookupResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LookupResult
   * @throws IOException if the JSON string is invalid with respect to LookupResult
   */
  public static LookupResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookupResult.class);
  }

  /**
   * Convert an instance of LookupResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

