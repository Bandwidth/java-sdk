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
import com.bandwidth.sdk.model.MachineDetectionModeEnum;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bandwidth.sdk.JSON;

/**
 * The machine detection request used to perform &lt;a href&#x3D;&#39;/docs/voice/guides/machineDetection&#39;&gt;machine detection&lt;/a&gt; on the call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-31T14:02:07.520682Z[Etc/UTC]")
public class MachineDetectionConfiguration {
  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private MachineDetectionModeEnum mode = MachineDetectionModeEnum.ASYNC;

  public static final String SERIALIZED_NAME_DETECTION_TIMEOUT = "detectionTimeout";
  @SerializedName(SERIALIZED_NAME_DETECTION_TIMEOUT)
  private Double detectionTimeout = 15d;

  public static final String SERIALIZED_NAME_SILENCE_TIMEOUT = "silenceTimeout";
  @SerializedName(SERIALIZED_NAME_SILENCE_TIMEOUT)
  private Double silenceTimeout = 10d;

  public static final String SERIALIZED_NAME_SPEECH_THRESHOLD = "speechThreshold";
  @SerializedName(SERIALIZED_NAME_SPEECH_THRESHOLD)
  private Double speechThreshold = 10d;

  public static final String SERIALIZED_NAME_SPEECH_END_THRESHOLD = "speechEndThreshold";
  @SerializedName(SERIALIZED_NAME_SPEECH_END_THRESHOLD)
  private Double speechEndThreshold = 5d;

  public static final String SERIALIZED_NAME_MACHINE_SPEECH_END_THRESHOLD = "machineSpeechEndThreshold";
  @SerializedName(SERIALIZED_NAME_MACHINE_SPEECH_END_THRESHOLD)
  private Double machineSpeechEndThreshold;

  public static final String SERIALIZED_NAME_DELAY_RESULT = "delayResult";
  @SerializedName(SERIALIZED_NAME_DELAY_RESULT)
  private Boolean delayResult = false;

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

  public static final String SERIALIZED_NAME_FALLBACK_URL = "fallbackUrl";
  @SerializedName(SERIALIZED_NAME_FALLBACK_URL)
  private URI fallbackUrl;

  public static final String SERIALIZED_NAME_FALLBACK_METHOD = "fallbackMethod";
  @SerializedName(SERIALIZED_NAME_FALLBACK_METHOD)
  private CallbackMethodEnum fallbackMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_FALLBACK_USERNAME = "fallbackUsername";
  @SerializedName(SERIALIZED_NAME_FALLBACK_USERNAME)
  private String fallbackUsername;

  public static final String SERIALIZED_NAME_FALLBACK_PASSWORD = "fallbackPassword";
  @SerializedName(SERIALIZED_NAME_FALLBACK_PASSWORD)
  private String fallbackPassword;

  public MachineDetectionConfiguration() {
  }

  public MachineDetectionConfiguration mode(MachineDetectionModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  public MachineDetectionModeEnum getMode() {
    return mode;
  }


  public void setMode(MachineDetectionModeEnum mode) {
    this.mode = mode;
  }


  public MachineDetectionConfiguration detectionTimeout(Double detectionTimeout) {
    
    this.detectionTimeout = detectionTimeout;
    return this;
  }

   /**
   * The timeout used for the whole operation, in seconds. If no result is determined in this period, a callback with a &#x60;timeout&#x60; result is sent.
   * @return detectionTimeout
  **/
  @javax.annotation.Nullable
  public Double getDetectionTimeout() {
    return detectionTimeout;
  }


  public void setDetectionTimeout(Double detectionTimeout) {
    this.detectionTimeout = detectionTimeout;
  }


  public MachineDetectionConfiguration silenceTimeout(Double silenceTimeout) {
    
    this.silenceTimeout = silenceTimeout;
    return this;
  }

   /**
   * If no speech is detected in this period, a callback with a &#39;silence&#39; result is sent.
   * @return silenceTimeout
  **/
  @javax.annotation.Nullable
  public Double getSilenceTimeout() {
    return silenceTimeout;
  }


  public void setSilenceTimeout(Double silenceTimeout) {
    this.silenceTimeout = silenceTimeout;
  }


  public MachineDetectionConfiguration speechThreshold(Double speechThreshold) {
    
    this.speechThreshold = speechThreshold;
    return this;
  }

   /**
   * When speech has ended and a result couldn&#39;t be determined based on the audio content itself, this value is used to determine if the speaker is a machine based on the speech duration. If the length of the speech detected is greater than or equal to this threshold, the result will be &#39;answering-machine&#39;. If the length of speech detected is below this threshold, the result will be &#39;human&#39;.
   * @return speechThreshold
  **/
  @javax.annotation.Nullable
  public Double getSpeechThreshold() {
    return speechThreshold;
  }


  public void setSpeechThreshold(Double speechThreshold) {
    this.speechThreshold = speechThreshold;
  }


  public MachineDetectionConfiguration speechEndThreshold(Double speechEndThreshold) {
    
    this.speechEndThreshold = speechEndThreshold;
    return this;
  }

   /**
   * Amount of silence (in seconds) before assuming the callee has finished speaking.
   * @return speechEndThreshold
  **/
  @javax.annotation.Nullable
  public Double getSpeechEndThreshold() {
    return speechEndThreshold;
  }


  public void setSpeechEndThreshold(Double speechEndThreshold) {
    this.speechEndThreshold = speechEndThreshold;
  }


  public MachineDetectionConfiguration machineSpeechEndThreshold(Double machineSpeechEndThreshold) {
    
    this.machineSpeechEndThreshold = machineSpeechEndThreshold;
    return this;
  }

   /**
   * When an answering machine is detected, the amount of silence (in seconds) before assuming the message has finished playing.  If not provided it will default to the speechEndThreshold value.
   * @return machineSpeechEndThreshold
  **/
  @javax.annotation.Nullable
  public Double getMachineSpeechEndThreshold() {
    return machineSpeechEndThreshold;
  }


  public void setMachineSpeechEndThreshold(Double machineSpeechEndThreshold) {
    this.machineSpeechEndThreshold = machineSpeechEndThreshold;
  }


  public MachineDetectionConfiguration delayResult(Boolean delayResult) {
    
    this.delayResult = delayResult;
    return this;
  }

   /**
   * If set to &#39;true&#39; and if an answering machine is detected, the &#39;answering-machine&#39; callback will be delayed until the machine is done speaking, or an end of message tone is detected, or until the &#39;detectionTimeout&#39; is exceeded. If false, the &#39;answering-machine&#39; result is sent immediately.
   * @return delayResult
  **/
  @javax.annotation.Nullable
  public Boolean getDelayResult() {
    return delayResult;
  }


  public void setDelayResult(Boolean delayResult) {
    this.delayResult = delayResult;
  }


  public MachineDetectionConfiguration callbackUrl(URI callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The URL to send the &#39;machineDetectionComplete&#39; webhook when the detection is completed. Only for &#39;async&#39; mode.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  public URI getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public MachineDetectionConfiguration callbackMethod(CallbackMethodEnum callbackMethod) {
    
    this.callbackMethod = callbackMethod;
    return this;
  }

   /**
   * Get callbackMethod
   * @return callbackMethod
  **/
  @javax.annotation.Nullable
  public CallbackMethodEnum getCallbackMethod() {
    return callbackMethod;
  }


  public void setCallbackMethod(CallbackMethodEnum callbackMethod) {
    this.callbackMethod = callbackMethod;
  }


  public MachineDetectionConfiguration username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Basic auth username.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public MachineDetectionConfiguration password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Basic auth password.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public MachineDetectionConfiguration fallbackUrl(URI fallbackUrl) {
    
    this.fallbackUrl = fallbackUrl;
    return this;
  }

   /**
   * A fallback URL which, if provided, will be used to retry the machine detection complete webhook delivery in case &#x60;callbackUrl&#x60; fails to respond
   * @return fallbackUrl
  **/
  @javax.annotation.Nullable
  public URI getFallbackUrl() {
    return fallbackUrl;
  }


  public void setFallbackUrl(URI fallbackUrl) {
    this.fallbackUrl = fallbackUrl;
  }


  public MachineDetectionConfiguration fallbackMethod(CallbackMethodEnum fallbackMethod) {
    
    this.fallbackMethod = fallbackMethod;
    return this;
  }

   /**
   * Get fallbackMethod
   * @return fallbackMethod
  **/
  @javax.annotation.Nullable
  public CallbackMethodEnum getFallbackMethod() {
    return fallbackMethod;
  }


  public void setFallbackMethod(CallbackMethodEnum fallbackMethod) {
    this.fallbackMethod = fallbackMethod;
  }


  public MachineDetectionConfiguration fallbackUsername(String fallbackUsername) {
    
    this.fallbackUsername = fallbackUsername;
    return this;
  }

   /**
   * Basic auth username.
   * @return fallbackUsername
  **/
  @javax.annotation.Nullable
  public String getFallbackUsername() {
    return fallbackUsername;
  }


  public void setFallbackUsername(String fallbackUsername) {
    this.fallbackUsername = fallbackUsername;
  }


  public MachineDetectionConfiguration fallbackPassword(String fallbackPassword) {
    
    this.fallbackPassword = fallbackPassword;
    return this;
  }

   /**
   * Basic auth password.
   * @return fallbackPassword
  **/
  @javax.annotation.Nullable
  public String getFallbackPassword() {
    return fallbackPassword;
  }


  public void setFallbackPassword(String fallbackPassword) {
    this.fallbackPassword = fallbackPassword;
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
   * @return the MachineDetectionConfiguration instance itself
   */
  public MachineDetectionConfiguration putAdditionalProperty(String key, Object value) {
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
    MachineDetectionConfiguration machineDetectionConfiguration = (MachineDetectionConfiguration) o;
    return Objects.equals(this.mode, machineDetectionConfiguration.mode) &&
        Objects.equals(this.detectionTimeout, machineDetectionConfiguration.detectionTimeout) &&
        Objects.equals(this.silenceTimeout, machineDetectionConfiguration.silenceTimeout) &&
        Objects.equals(this.speechThreshold, machineDetectionConfiguration.speechThreshold) &&
        Objects.equals(this.speechEndThreshold, machineDetectionConfiguration.speechEndThreshold) &&
        Objects.equals(this.machineSpeechEndThreshold, machineDetectionConfiguration.machineSpeechEndThreshold) &&
        Objects.equals(this.delayResult, machineDetectionConfiguration.delayResult) &&
        Objects.equals(this.callbackUrl, machineDetectionConfiguration.callbackUrl) &&
        Objects.equals(this.callbackMethod, machineDetectionConfiguration.callbackMethod) &&
        Objects.equals(this.username, machineDetectionConfiguration.username) &&
        Objects.equals(this.password, machineDetectionConfiguration.password) &&
        Objects.equals(this.fallbackUrl, machineDetectionConfiguration.fallbackUrl) &&
        Objects.equals(this.fallbackMethod, machineDetectionConfiguration.fallbackMethod) &&
        Objects.equals(this.fallbackUsername, machineDetectionConfiguration.fallbackUsername) &&
        Objects.equals(this.fallbackPassword, machineDetectionConfiguration.fallbackPassword)&&
        Objects.equals(this.additionalProperties, machineDetectionConfiguration.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, detectionTimeout, silenceTimeout, speechThreshold, speechEndThreshold, machineSpeechEndThreshold, delayResult, callbackUrl, callbackMethod, username, password, fallbackUrl, fallbackMethod, fallbackUsername, fallbackPassword, additionalProperties);
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
    sb.append("class MachineDetectionConfiguration {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    detectionTimeout: ").append(toIndentedString(detectionTimeout)).append("\n");
    sb.append("    silenceTimeout: ").append(toIndentedString(silenceTimeout)).append("\n");
    sb.append("    speechThreshold: ").append(toIndentedString(speechThreshold)).append("\n");
    sb.append("    speechEndThreshold: ").append(toIndentedString(speechEndThreshold)).append("\n");
    sb.append("    machineSpeechEndThreshold: ").append(toIndentedString(machineSpeechEndThreshold)).append("\n");
    sb.append("    delayResult: ").append(toIndentedString(delayResult)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    callbackMethod: ").append(toIndentedString(callbackMethod)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    fallbackUrl: ").append(toIndentedString(fallbackUrl)).append("\n");
    sb.append("    fallbackMethod: ").append(toIndentedString(fallbackMethod)).append("\n");
    sb.append("    fallbackUsername: ").append(toIndentedString(fallbackUsername)).append("\n");
    sb.append("    fallbackPassword: ").append(toIndentedString(fallbackPassword)).append("\n");
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
    openapiFields.add("mode");
    openapiFields.add("detectionTimeout");
    openapiFields.add("silenceTimeout");
    openapiFields.add("speechThreshold");
    openapiFields.add("speechEndThreshold");
    openapiFields.add("machineSpeechEndThreshold");
    openapiFields.add("delayResult");
    openapiFields.add("callbackUrl");
    openapiFields.add("callbackMethod");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("fallbackUrl");
    openapiFields.add("fallbackMethod");
    openapiFields.add("fallbackUsername");
    openapiFields.add("fallbackPassword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MachineDetectionConfiguration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MachineDetectionConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MachineDetectionConfiguration is not found in the empty JSON string", MachineDetectionConfiguration.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonNull()) && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("fallbackUrl") != null && !jsonObj.get("fallbackUrl").isJsonNull()) && !jsonObj.get("fallbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackUrl").toString()));
      }
      if ((jsonObj.get("fallbackUsername") != null && !jsonObj.get("fallbackUsername").isJsonNull()) && !jsonObj.get("fallbackUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackUsername").toString()));
      }
      if ((jsonObj.get("fallbackPassword") != null && !jsonObj.get("fallbackPassword").isJsonNull()) && !jsonObj.get("fallbackPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackPassword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MachineDetectionConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MachineDetectionConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MachineDetectionConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MachineDetectionConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<MachineDetectionConfiguration>() {
           @Override
           public void write(JsonWriter out, MachineDetectionConfiguration value) throws IOException {
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
           public MachineDetectionConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MachineDetectionConfiguration instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MachineDetectionConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MachineDetectionConfiguration
  * @throws IOException if the JSON string is invalid with respect to MachineDetectionConfiguration
  */
  public static MachineDetectionConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MachineDetectionConfiguration.class);
  }

 /**
  * Convert an instance of MachineDetectionConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

