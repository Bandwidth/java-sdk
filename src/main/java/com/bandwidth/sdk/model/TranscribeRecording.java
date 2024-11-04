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
import com.bandwidth.sdk.model.CallbackMethodEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TranscribeRecording
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TranscribeRecording {
  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private URI callbackUrl;

  public static final String SERIALIZED_NAME_CALLBACK_METHOD = "callbackMethod";
  @SerializedName(SERIALIZED_NAME_CALLBACK_METHOD)
  private CallbackMethodEnum callbackMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_CALLBACK_TIMEOUT = "callbackTimeout";
  @SerializedName(SERIALIZED_NAME_CALLBACK_TIMEOUT)
  private Double callbackTimeout = 15d;

  public static final String SERIALIZED_NAME_DETECT_LANGUAGE = "detectLanguage";
  @SerializedName(SERIALIZED_NAME_DETECT_LANGUAGE)
  private Boolean detectLanguage = false;

  public TranscribeRecording() {
  }

  public TranscribeRecording callbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * The URL to send the [TranscriptionAvailable](/docs/voice/webhooks/transcriptionAvailable) event to. You should not include sensitive or personally-identifiable information in the callbackUrl field! Always use the proper username and password fields for authorization.
   * @return callbackUrl
   */
  @javax.annotation.Nullable
  public URI getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public TranscribeRecording callbackMethod(CallbackMethodEnum callbackMethod) {
    this.callbackMethod = callbackMethod;
    return this;
  }

  /**
   * Get callbackMethod
   * @return callbackMethod
   */
  @javax.annotation.Nullable
  public CallbackMethodEnum getCallbackMethod() {
    return callbackMethod;
  }

  public void setCallbackMethod(CallbackMethodEnum callbackMethod) {
    this.callbackMethod = callbackMethod;
  }


  public TranscribeRecording username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Basic auth username.
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public TranscribeRecording password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Basic auth password.
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public TranscribeRecording tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * (optional) The tag specified on call creation. If no tag was specified or it was previously cleared, this field will not be present.
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public TranscribeRecording callbackTimeout(Double callbackTimeout) {
    this.callbackTimeout = callbackTimeout;
    return this;
  }

  /**
   * This is the timeout (in seconds) to use when delivering the webhook to &#x60;callbackUrl&#x60;. Can be any numeric value (including decimals) between 1 and 25.
   * minimum: 1
   * maximum: 25
   * @return callbackTimeout
   */
  @javax.annotation.Nullable
  public Double getCallbackTimeout() {
    return callbackTimeout;
  }

  public void setCallbackTimeout(Double callbackTimeout) {
    this.callbackTimeout = callbackTimeout;
  }


  public TranscribeRecording detectLanguage(Boolean detectLanguage) {
    this.detectLanguage = detectLanguage;
    return this;
  }

  /**
   * A boolean value to indicate that the recording may not be in English, and the transcription service will need to detect the dominant language the recording is in and transcribe accordingly. Current supported languages are English, French, and Spanish.
   * @return detectLanguage
   */
  @javax.annotation.Nullable
  public Boolean getDetectLanguage() {
    return detectLanguage;
  }

  public void setDetectLanguage(Boolean detectLanguage) {
    this.detectLanguage = detectLanguage;
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
   * @return the TranscribeRecording instance itself
   */
  public TranscribeRecording putAdditionalProperty(String key, Object value) {
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
    TranscribeRecording transcribeRecording = (TranscribeRecording) o;
    return Objects.equals(this.callbackUrl, transcribeRecording.callbackUrl) &&
        Objects.equals(this.callbackMethod, transcribeRecording.callbackMethod) &&
        Objects.equals(this.username, transcribeRecording.username) &&
        Objects.equals(this.password, transcribeRecording.password) &&
        Objects.equals(this.tag, transcribeRecording.tag) &&
        Objects.equals(this.callbackTimeout, transcribeRecording.callbackTimeout) &&
        Objects.equals(this.detectLanguage, transcribeRecording.detectLanguage)&&
        Objects.equals(this.additionalProperties, transcribeRecording.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, callbackMethod, username, password, tag, callbackTimeout, detectLanguage, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscribeRecording {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    callbackMethod: ").append(toIndentedString(callbackMethod)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    callbackTimeout: ").append(toIndentedString(callbackTimeout)).append("\n");
    sb.append("    detectLanguage: ").append(toIndentedString(detectLanguage)).append("\n");
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
    openapiFields.add("callbackUrl");
    openapiFields.add("callbackMethod");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("tag");
    openapiFields.add("callbackTimeout");
    openapiFields.add("detectLanguage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TranscribeRecording
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TranscribeRecording.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TranscribeRecording is not found in the empty JSON string", TranscribeRecording.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonNull()) && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
      // validate the optional field `callbackMethod`
      if (jsonObj.get("callbackMethod") != null && !jsonObj.get("callbackMethod").isJsonNull()) {
        CallbackMethodEnum.validateJsonElement(jsonObj.get("callbackMethod"));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TranscribeRecording.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TranscribeRecording' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TranscribeRecording> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TranscribeRecording.class));

       return (TypeAdapter<T>) new TypeAdapter<TranscribeRecording>() {
           @Override
           public void write(JsonWriter out, TranscribeRecording value) throws IOException {
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
           public TranscribeRecording read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TranscribeRecording instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TranscribeRecording given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TranscribeRecording
   * @throws IOException if the JSON string is invalid with respect to TranscribeRecording
   */
  public static TranscribeRecording fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TranscribeRecording.class);
  }

  /**
   * Convert an instance of TranscribeRecording to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

