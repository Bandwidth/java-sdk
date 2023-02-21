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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import org.openapitools.client.model.CallbackMethodEnum;
import org.openapitools.client.model.MachineDetectionConfiguration;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateCall
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T09:43:53.001100-05:00[America/New_York]")
public class CreateCall {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_UUI = "uui";
  @SerializedName(SERIALIZED_NAME_UUI)
  private String uui;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_ANSWER_URL = "answerUrl";
  @SerializedName(SERIALIZED_NAME_ANSWER_URL)
  private URI answerUrl;

  public static final String SERIALIZED_NAME_ANSWER_METHOD = "answerMethod";
  @SerializedName(SERIALIZED_NAME_ANSWER_METHOD)
  private CallbackMethodEnum answerMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ANSWER_FALLBACK_URL = "answerFallbackUrl";
  @SerializedName(SERIALIZED_NAME_ANSWER_FALLBACK_URL)
  private URI answerFallbackUrl;

  public static final String SERIALIZED_NAME_ANSWER_FALLBACK_METHOD = "answerFallbackMethod";
  @SerializedName(SERIALIZED_NAME_ANSWER_FALLBACK_METHOD)
  private CallbackMethodEnum answerFallbackMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_FALLBACK_USERNAME = "fallbackUsername";
  @SerializedName(SERIALIZED_NAME_FALLBACK_USERNAME)
  private String fallbackUsername;

  public static final String SERIALIZED_NAME_FALLBACK_PASSWORD = "fallbackPassword";
  @SerializedName(SERIALIZED_NAME_FALLBACK_PASSWORD)
  private String fallbackPassword;

  public static final String SERIALIZED_NAME_DISCONNECT_URL = "disconnectUrl";
  @SerializedName(SERIALIZED_NAME_DISCONNECT_URL)
  private URI disconnectUrl;

  public static final String SERIALIZED_NAME_DISCONNECT_METHOD = "disconnectMethod";
  @SerializedName(SERIALIZED_NAME_DISCONNECT_METHOD)
  private CallbackMethodEnum disconnectMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_CALL_TIMEOUT = "callTimeout";
  @SerializedName(SERIALIZED_NAME_CALL_TIMEOUT)
  private Double callTimeout = 30d;

  public static final String SERIALIZED_NAME_CALLBACK_TIMEOUT = "callbackTimeout";
  @SerializedName(SERIALIZED_NAME_CALLBACK_TIMEOUT)
  private Double callbackTimeout = 15d;

  public static final String SERIALIZED_NAME_MACHINE_DETECTION = "machineDetection";
  @SerializedName(SERIALIZED_NAME_MACHINE_DETECTION)
  private MachineDetectionConfiguration machineDetection;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority = 5;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public CreateCall() {
  }

  public CreateCall to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The destination to call (must be an E.164 formatted number (e.g. &#x60;+15555551212&#x60;) or a SIP URI (e.g. &#x60;sip:user@server.com&#x60;)).
   * @return to
  **/
  @javax.annotation.Nonnull

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public CreateCall from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * A Bandwidth phone number on your account the call should come from (must be in E.164 format, like &#x60;+15555551212&#x60;, or be one of the following strings: &#x60;Restricted&#x60;, &#x60;Anonymous&#x60;, &#x60;Private&#x60;, or &#x60;Unavailable&#x60;).
   * @return from
  **/
  @javax.annotation.Nonnull

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public CreateCall uui(String uui) {
    
    this.uui = uui;
    return this;
  }

   /**
   * A comma-separated list of &#39;User-To-User&#39; headers to be sent in the INVITE when calling a SIP URI. Each value must end with an &#39;encoding&#39; parameter as described in &lt;a href&#x3D;&#39;https://tools.ietf.org/html/rfc7433&#39;&gt;RFC 7433&lt;/a&gt;. Only &#39;jwt&#39; and &#39;base64&#39; encodings are allowed. The entire value cannot exceed 350 characters, including parameters and separators.
   * @return uui
  **/
  @javax.annotation.Nullable

  public String getUui() {
    return uui;
  }


  public void setUui(String uui) {
    this.uui = uui;
  }


  public CreateCall applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The id of the application associated with the &#x60;from&#x60; number.
   * @return applicationId
  **/
  @javax.annotation.Nonnull

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public CreateCall answerUrl(URI answerUrl) {
    
    this.answerUrl = answerUrl;
    return this;
  }

   /**
   * The full URL to send the &lt;a href&#x3D;&#39;/docs/voice/webhooks/answer&#39;&gt;Answer&lt;/a&gt; event to when the called party answers. This endpoint should return the first &lt;a href&#x3D;&#39;/docs/voice/bxml&#39;&gt;BXML document&lt;/a&gt; to be executed in the call.  Must use &#x60;https&#x60; if specifying &#x60;username&#x60; and &#x60;password&#x60;
   * @return answerUrl
  **/
  @javax.annotation.Nonnull

  public URI getAnswerUrl() {
    return answerUrl;
  }


  public void setAnswerUrl(URI answerUrl) {
    this.answerUrl = answerUrl;
  }


  public CreateCall answerMethod(CallbackMethodEnum answerMethod) {
    
    this.answerMethod = answerMethod;
    return this;
  }

   /**
   * Get answerMethod
   * @return answerMethod
  **/
  @javax.annotation.Nullable

  public CallbackMethodEnum getAnswerMethod() {
    return answerMethod;
  }


  public void setAnswerMethod(CallbackMethodEnum answerMethod) {
    this.answerMethod = answerMethod;
  }


  public CreateCall username(String username) {
    
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


  public CreateCall password(String password) {
    
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


  public CreateCall answerFallbackUrl(URI answerFallbackUrl) {
    
    this.answerFallbackUrl = answerFallbackUrl;
    return this;
  }

   /**
   * A fallback url which, if provided, will be used to retry the &#x60;answer&#x60; webhook delivery in case &#x60;answerUrl&#x60; fails to respond  Must use &#x60;https&#x60; if specifying &#x60;fallbackUsername&#x60; and &#x60;fallbackPassword&#x60;
   * @return answerFallbackUrl
  **/
  @javax.annotation.Nullable

  public URI getAnswerFallbackUrl() {
    return answerFallbackUrl;
  }


  public void setAnswerFallbackUrl(URI answerFallbackUrl) {
    this.answerFallbackUrl = answerFallbackUrl;
  }


  public CreateCall answerFallbackMethod(CallbackMethodEnum answerFallbackMethod) {
    
    this.answerFallbackMethod = answerFallbackMethod;
    return this;
  }

   /**
   * Get answerFallbackMethod
   * @return answerFallbackMethod
  **/
  @javax.annotation.Nullable

  public CallbackMethodEnum getAnswerFallbackMethod() {
    return answerFallbackMethod;
  }


  public void setAnswerFallbackMethod(CallbackMethodEnum answerFallbackMethod) {
    this.answerFallbackMethod = answerFallbackMethod;
  }


  public CreateCall fallbackUsername(String fallbackUsername) {
    
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


  public CreateCall fallbackPassword(String fallbackPassword) {
    
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


  public CreateCall disconnectUrl(URI disconnectUrl) {
    
    this.disconnectUrl = disconnectUrl;
    return this;
  }

   /**
   * The URL to send the &lt;a href&#x3D;&#39;/docs/voice/webhooks/disconnect&#39;&gt;Disconnect&lt;/a&gt; event to when the call ends. This event does not expect a BXML response.
   * @return disconnectUrl
  **/
  @javax.annotation.Nullable

  public URI getDisconnectUrl() {
    return disconnectUrl;
  }


  public void setDisconnectUrl(URI disconnectUrl) {
    this.disconnectUrl = disconnectUrl;
  }


  public CreateCall disconnectMethod(CallbackMethodEnum disconnectMethod) {
    
    this.disconnectMethod = disconnectMethod;
    return this;
  }

   /**
   * Get disconnectMethod
   * @return disconnectMethod
  **/
  @javax.annotation.Nullable

  public CallbackMethodEnum getDisconnectMethod() {
    return disconnectMethod;
  }


  public void setDisconnectMethod(CallbackMethodEnum disconnectMethod) {
    this.disconnectMethod = disconnectMethod;
  }


  public CreateCall callTimeout(Double callTimeout) {
    
    this.callTimeout = callTimeout;
    return this;
  }

   /**
   * The timeout (in seconds) for the callee to answer the call after it starts ringing. If the call does not start ringing within 30s, the call will be cancelled regardless of this value.  Can be any numeric value (including decimals) between 1 and 300.
   * minimum: 1
   * maximum: 300
   * @return callTimeout
  **/
  @javax.annotation.Nullable

  public Double getCallTimeout() {
    return callTimeout;
  }


  public void setCallTimeout(Double callTimeout) {
    this.callTimeout = callTimeout;
  }


  public CreateCall callbackTimeout(Double callbackTimeout) {
    
    this.callbackTimeout = callbackTimeout;
    return this;
  }

   /**
   * This is the timeout (in seconds) to use when delivering webhooks for the call. Can be any numeric value (including decimals) between 1 and 25.
   * minimum: 1
   * maximum: 25
   * @return callbackTimeout
  **/
  @javax.annotation.Nullable

  public Double getCallbackTimeout() {
    return callbackTimeout;
  }


  public void setCallbackTimeout(Double callbackTimeout) {
    this.callbackTimeout = callbackTimeout;
  }


  public CreateCall machineDetection(MachineDetectionConfiguration machineDetection) {
    
    this.machineDetection = machineDetection;
    return this;
  }

   /**
   * Get machineDetection
   * @return machineDetection
  **/
  @javax.annotation.Nullable

  public MachineDetectionConfiguration getMachineDetection() {
    return machineDetection;
  }


  public void setMachineDetection(MachineDetectionConfiguration machineDetection) {
    this.machineDetection = machineDetection;
  }


  public CreateCall priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority of this call over other calls from your account. For example, if during a call your application needs to place a new call and bridge it with the current call, you might want to create the call with priority 1 so that it will be the next call picked off your queue, ahead of other less time sensitive calls. A lower value means higher priority, so a priority 1 call takes precedence over a priority 2 call.
   * minimum: 1
   * maximum: 5
   * @return priority
  **/
  @javax.annotation.Nullable

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public CreateCall tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * A custom string that will be sent with all webhooks for this call unless overwritten by a future &lt;a href&#x3D;&#39;/docs/voice/bxml/tag&#39;&gt;&#x60;&lt;Tag&gt;&#x60;&lt;/a&gt; verb or &#x60;tag&#x60; attribute on another verb, or cleared.  May be cleared by setting &#x60;tag&#x3D;\&quot;\&quot;&#x60;  Max length 256 characters.
   * @return tag
  **/
  @javax.annotation.Nullable

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCall createCall = (CreateCall) o;
    return Objects.equals(this.to, createCall.to) &&
        Objects.equals(this.from, createCall.from) &&
        Objects.equals(this.uui, createCall.uui) &&
        Objects.equals(this.applicationId, createCall.applicationId) &&
        Objects.equals(this.answerUrl, createCall.answerUrl) &&
        Objects.equals(this.answerMethod, createCall.answerMethod) &&
        Objects.equals(this.username, createCall.username) &&
        Objects.equals(this.password, createCall.password) &&
        Objects.equals(this.answerFallbackUrl, createCall.answerFallbackUrl) &&
        Objects.equals(this.answerFallbackMethod, createCall.answerFallbackMethod) &&
        Objects.equals(this.fallbackUsername, createCall.fallbackUsername) &&
        Objects.equals(this.fallbackPassword, createCall.fallbackPassword) &&
        Objects.equals(this.disconnectUrl, createCall.disconnectUrl) &&
        Objects.equals(this.disconnectMethod, createCall.disconnectMethod) &&
        Objects.equals(this.callTimeout, createCall.callTimeout) &&
        Objects.equals(this.callbackTimeout, createCall.callbackTimeout) &&
        Objects.equals(this.machineDetection, createCall.machineDetection) &&
        Objects.equals(this.priority, createCall.priority) &&
        Objects.equals(this.tag, createCall.tag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, uui, applicationId, answerUrl, answerMethod, username, password, answerFallbackUrl, answerFallbackMethod, fallbackUsername, fallbackPassword, disconnectUrl, disconnectMethod, callTimeout, callbackTimeout, machineDetection, priority, tag);
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
    sb.append("class CreateCall {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    uui: ").append(toIndentedString(uui)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    answerUrl: ").append(toIndentedString(answerUrl)).append("\n");
    sb.append("    answerMethod: ").append(toIndentedString(answerMethod)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    answerFallbackUrl: ").append(toIndentedString(answerFallbackUrl)).append("\n");
    sb.append("    answerFallbackMethod: ").append(toIndentedString(answerFallbackMethod)).append("\n");
    sb.append("    fallbackUsername: ").append(toIndentedString(fallbackUsername)).append("\n");
    sb.append("    fallbackPassword: ").append(toIndentedString(fallbackPassword)).append("\n");
    sb.append("    disconnectUrl: ").append(toIndentedString(disconnectUrl)).append("\n");
    sb.append("    disconnectMethod: ").append(toIndentedString(disconnectMethod)).append("\n");
    sb.append("    callTimeout: ").append(toIndentedString(callTimeout)).append("\n");
    sb.append("    callbackTimeout: ").append(toIndentedString(callbackTimeout)).append("\n");
    sb.append("    machineDetection: ").append(toIndentedString(machineDetection)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("uui");
    openapiFields.add("applicationId");
    openapiFields.add("answerUrl");
    openapiFields.add("answerMethod");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("answerFallbackUrl");
    openapiFields.add("answerFallbackMethod");
    openapiFields.add("fallbackUsername");
    openapiFields.add("fallbackPassword");
    openapiFields.add("disconnectUrl");
    openapiFields.add("disconnectMethod");
    openapiFields.add("callTimeout");
    openapiFields.add("callbackTimeout");
    openapiFields.add("machineDetection");
    openapiFields.add("priority");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("applicationId");
    openapiRequiredFields.add("answerUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCall
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCall.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCall is not found in the empty JSON string", CreateCall.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCall.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCall` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCall.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (!jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("uui") != null && !jsonObj.get("uui").isJsonNull()) && !jsonObj.get("uui").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uui` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uui").toString()));
      }
      if (!jsonObj.get("applicationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationId").toString()));
      }
      if (!jsonObj.get("answerUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answerUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answerUrl").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("answerFallbackUrl") != null && !jsonObj.get("answerFallbackUrl").isJsonNull()) && !jsonObj.get("answerFallbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answerFallbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answerFallbackUrl").toString()));
      }
      if ((jsonObj.get("fallbackUsername") != null && !jsonObj.get("fallbackUsername").isJsonNull()) && !jsonObj.get("fallbackUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackUsername").toString()));
      }
      if ((jsonObj.get("fallbackPassword") != null && !jsonObj.get("fallbackPassword").isJsonNull()) && !jsonObj.get("fallbackPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackPassword").toString()));
      }
      if ((jsonObj.get("disconnectUrl") != null && !jsonObj.get("disconnectUrl").isJsonNull()) && !jsonObj.get("disconnectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disconnectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disconnectUrl").toString()));
      }
      // validate the optional field `machineDetection`
      if (jsonObj.get("machineDetection") != null && !jsonObj.get("machineDetection").isJsonNull()) {
        MachineDetectionConfiguration.validateJsonObject(jsonObj.getAsJsonObject("machineDetection"));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCall.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCall' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCall> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCall.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCall>() {
           @Override
           public void write(JsonWriter out, CreateCall value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCall read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCall given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCall
  * @throws IOException if the JSON string is invalid with respect to CreateCall
  */
  public static CreateCall fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCall.class);
  }

 /**
  * Convert an instance of CreateCall to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

