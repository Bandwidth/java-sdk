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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.client.model.CallbackMethodEnum;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateCallResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T08:49:31.529519-04:00[America/New_York]")
public class CreateCallResponse {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_ENQUEUED_TIME = "enqueuedTime";
  @SerializedName(SERIALIZED_NAME_ENQUEUED_TIME)
  private OffsetDateTime enqueuedTime;

  public static final String SERIALIZED_NAME_CALL_URL = "callUrl";
  @SerializedName(SERIALIZED_NAME_CALL_URL)
  private URI callUrl;

  public static final String SERIALIZED_NAME_CALL_TIMEOUT = "callTimeout";
  @SerializedName(SERIALIZED_NAME_CALL_TIMEOUT)
  private Double callTimeout;

  public static final String SERIALIZED_NAME_CALLBACK_TIMEOUT = "callbackTimeout";
  @SerializedName(SERIALIZED_NAME_CALLBACK_TIMEOUT)
  private Double callbackTimeout;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_ANSWER_METHOD = "answerMethod";
  @SerializedName(SERIALIZED_NAME_ANSWER_METHOD)
  private CallbackMethodEnum answerMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_ANSWER_URL = "answerUrl";
  @SerializedName(SERIALIZED_NAME_ANSWER_URL)
  private URI answerUrl;

  public static final String SERIALIZED_NAME_ANSWER_FALLBACK_METHOD = "answerFallbackMethod";
  @SerializedName(SERIALIZED_NAME_ANSWER_FALLBACK_METHOD)
  private CallbackMethodEnum answerFallbackMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_ANSWER_FALLBACK_URL = "answerFallbackUrl";
  @SerializedName(SERIALIZED_NAME_ANSWER_FALLBACK_URL)
  private URI answerFallbackUrl;

  public static final String SERIALIZED_NAME_DISCONNECT_METHOD = "disconnectMethod";
  @SerializedName(SERIALIZED_NAME_DISCONNECT_METHOD)
  private CallbackMethodEnum disconnectMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_DISCONNECT_URL = "disconnectUrl";
  @SerializedName(SERIALIZED_NAME_DISCONNECT_URL)
  private URI disconnectUrl;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_FALLBACK_USERNAME = "fallbackUsername";
  @SerializedName(SERIALIZED_NAME_FALLBACK_USERNAME)
  private String fallbackUsername;

  public static final String SERIALIZED_NAME_FALLBACK_PASSWORD = "fallbackPassword";
  @SerializedName(SERIALIZED_NAME_FALLBACK_PASSWORD)
  private String fallbackPassword;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority;

  public CreateCallResponse() {
  }

  public CreateCallResponse applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The id of the application associated with the &#x60;from&#x60; number.
   * @return applicationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "04e88489-df02-4e34-a0ee-27a91849555f", required = true, value = "The id of the application associated with the `from` number.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public CreateCallResponse accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The bandwidth account ID associated with the call
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9900000", required = true, value = "The bandwidth account ID associated with the call")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CreateCallResponse callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * Programmable Voice API Call ID
   * @return callId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85", required = true, value = "Programmable Voice API Call ID")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public CreateCallResponse to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Recipient of the outgoing call
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+19195551234", required = true, value = "Recipient of the outgoing call")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public CreateCallResponse from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Phone number that created the outbound call
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+19195554321", required = true, value = "Phone number that created the outbound call")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public CreateCallResponse enqueuedTime(OffsetDateTime enqueuedTime) {
    
    this.enqueuedTime = enqueuedTime;
    return this;
  }

   /**
   * Time the call was accepted into the queue
   * @return enqueuedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-16T13:15:07.160Z", value = "Time the call was accepted into the queue")

  public OffsetDateTime getEnqueuedTime() {
    return enqueuedTime;
  }


  public void setEnqueuedTime(OffsetDateTime enqueuedTime) {
    this.enqueuedTime = enqueuedTime;
  }


  public CreateCallResponse callUrl(URI callUrl) {
    
    this.callUrl = callUrl;
    return this;
  }

   /**
   * The URL to update call state
   * @return callUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://voice.bandwidth.com/api/v2/accounts/9900000/calls/c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85", required = true, value = "The URL to update call state")

  public URI getCallUrl() {
    return callUrl;
  }


  public void setCallUrl(URI callUrl) {
    this.callUrl = callUrl;
  }


  public CreateCallResponse callTimeout(Double callTimeout) {
    
    this.callTimeout = callTimeout;
    return this;
  }

   /**
   * The timeout (in seconds) for the callee to answer the call after it starts ringing.
   * @return callTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "The timeout (in seconds) for the callee to answer the call after it starts ringing.")

  public Double getCallTimeout() {
    return callTimeout;
  }


  public void setCallTimeout(Double callTimeout) {
    this.callTimeout = callTimeout;
  }


  public CreateCallResponse callbackTimeout(Double callbackTimeout) {
    
    this.callbackTimeout = callbackTimeout;
    return this;
  }

   /**
   * This is the timeout (in seconds) to use when delivering webhooks for the call.
   * @return callbackTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "This is the timeout (in seconds) to use when delivering webhooks for the call.")

  public Double getCallbackTimeout() {
    return callbackTimeout;
  }


  public void setCallbackTimeout(Double callbackTimeout) {
    this.callbackTimeout = callbackTimeout;
  }


  public CreateCallResponse tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Custom tag value
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My custom tag value", value = "Custom tag value")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public CreateCallResponse answerMethod(CallbackMethodEnum answerMethod) {
    
    this.answerMethod = answerMethod;
    return this;
  }

   /**
   * Get answerMethod
   * @return answerMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CallbackMethodEnum getAnswerMethod() {
    return answerMethod;
  }


  public void setAnswerMethod(CallbackMethodEnum answerMethod) {
    this.answerMethod = answerMethod;
  }


  public CreateCallResponse answerUrl(URI answerUrl) {
    
    this.answerUrl = answerUrl;
    return this;
  }

   /**
   * URL to deliver the &#x60;answer&#x60; event webhook.
   * @return answerUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://myServer.com/bandwidth/webhooks/answer", required = true, value = "URL to deliver the `answer` event webhook.")

  public URI getAnswerUrl() {
    return answerUrl;
  }


  public void setAnswerUrl(URI answerUrl) {
    this.answerUrl = answerUrl;
  }


  public CreateCallResponse answerFallbackMethod(CallbackMethodEnum answerFallbackMethod) {
    
    this.answerFallbackMethod = answerFallbackMethod;
    return this;
  }

   /**
   * Get answerFallbackMethod
   * @return answerFallbackMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CallbackMethodEnum getAnswerFallbackMethod() {
    return answerFallbackMethod;
  }


  public void setAnswerFallbackMethod(CallbackMethodEnum answerFallbackMethod) {
    this.answerFallbackMethod = answerFallbackMethod;
  }


  public CreateCallResponse answerFallbackUrl(URI answerFallbackUrl) {
    
    this.answerFallbackUrl = answerFallbackUrl;
    return this;
  }

   /**
   * Fallback URL to deliver the &#x60;answer&#x60; event webhook.
   * @return answerFallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myFallbackServer.com/bandwidth/webhooks/answer", value = "Fallback URL to deliver the `answer` event webhook.")

  public URI getAnswerFallbackUrl() {
    return answerFallbackUrl;
  }


  public void setAnswerFallbackUrl(URI answerFallbackUrl) {
    this.answerFallbackUrl = answerFallbackUrl;
  }


  public CreateCallResponse disconnectMethod(CallbackMethodEnum disconnectMethod) {
    
    this.disconnectMethod = disconnectMethod;
    return this;
  }

   /**
   * Get disconnectMethod
   * @return disconnectMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CallbackMethodEnum getDisconnectMethod() {
    return disconnectMethod;
  }


  public void setDisconnectMethod(CallbackMethodEnum disconnectMethod) {
    this.disconnectMethod = disconnectMethod;
  }


  public CreateCallResponse disconnectUrl(URI disconnectUrl) {
    
    this.disconnectUrl = disconnectUrl;
    return this;
  }

   /**
   * URL to deliver the &#x60;disconnect&#x60; event webhook.
   * @return disconnectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myServer.com/bandwidth/webhooks/disconnect", value = "URL to deliver the `disconnect` event webhook.")

  public URI getDisconnectUrl() {
    return disconnectUrl;
  }


  public void setDisconnectUrl(URI disconnectUrl) {
    this.disconnectUrl = disconnectUrl;
  }


  public CreateCallResponse username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Basic auth username.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretUsername", value = "Basic auth username.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public CreateCallResponse password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Basic auth password.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretPassword1!", value = "Basic auth password.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CreateCallResponse fallbackUsername(String fallbackUsername) {
    
    this.fallbackUsername = fallbackUsername;
    return this;
  }

   /**
   * Basic auth username.
   * @return fallbackUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretUsername", value = "Basic auth username.")

  public String getFallbackUsername() {
    return fallbackUsername;
  }


  public void setFallbackUsername(String fallbackUsername) {
    this.fallbackUsername = fallbackUsername;
  }


  public CreateCallResponse fallbackPassword(String fallbackPassword) {
    
    this.fallbackPassword = fallbackPassword;
    return this;
  }

   /**
   * Basic auth password.
   * @return fallbackPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretPassword1!", value = "Basic auth password.")

  public String getFallbackPassword() {
    return fallbackPassword;
  }


  public void setFallbackPassword(String fallbackPassword) {
    this.fallbackPassword = fallbackPassword;
  }


  public CreateCallResponse priority(BigDecimal priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority of this call over other calls from your account.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The priority of this call over other calls from your account.")

  public BigDecimal getPriority() {
    return priority;
  }


  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallResponse createCallResponse = (CreateCallResponse) o;
    return Objects.equals(this.applicationId, createCallResponse.applicationId) &&
        Objects.equals(this.accountId, createCallResponse.accountId) &&
        Objects.equals(this.callId, createCallResponse.callId) &&
        Objects.equals(this.to, createCallResponse.to) &&
        Objects.equals(this.from, createCallResponse.from) &&
        Objects.equals(this.enqueuedTime, createCallResponse.enqueuedTime) &&
        Objects.equals(this.callUrl, createCallResponse.callUrl) &&
        Objects.equals(this.callTimeout, createCallResponse.callTimeout) &&
        Objects.equals(this.callbackTimeout, createCallResponse.callbackTimeout) &&
        Objects.equals(this.tag, createCallResponse.tag) &&
        Objects.equals(this.answerMethod, createCallResponse.answerMethod) &&
        Objects.equals(this.answerUrl, createCallResponse.answerUrl) &&
        Objects.equals(this.answerFallbackMethod, createCallResponse.answerFallbackMethod) &&
        Objects.equals(this.answerFallbackUrl, createCallResponse.answerFallbackUrl) &&
        Objects.equals(this.disconnectMethod, createCallResponse.disconnectMethod) &&
        Objects.equals(this.disconnectUrl, createCallResponse.disconnectUrl) &&
        Objects.equals(this.username, createCallResponse.username) &&
        Objects.equals(this.password, createCallResponse.password) &&
        Objects.equals(this.fallbackUsername, createCallResponse.fallbackUsername) &&
        Objects.equals(this.fallbackPassword, createCallResponse.fallbackPassword) &&
        Objects.equals(this.priority, createCallResponse.priority);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, accountId, callId, to, from, enqueuedTime, callUrl, callTimeout, callbackTimeout, tag, answerMethod, answerUrl, answerFallbackMethod, answerFallbackUrl, disconnectMethod, disconnectUrl, username, password, fallbackUsername, fallbackPassword, priority);
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
    sb.append("class CreateCallResponse {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    enqueuedTime: ").append(toIndentedString(enqueuedTime)).append("\n");
    sb.append("    callUrl: ").append(toIndentedString(callUrl)).append("\n");
    sb.append("    callTimeout: ").append(toIndentedString(callTimeout)).append("\n");
    sb.append("    callbackTimeout: ").append(toIndentedString(callbackTimeout)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    answerMethod: ").append(toIndentedString(answerMethod)).append("\n");
    sb.append("    answerUrl: ").append(toIndentedString(answerUrl)).append("\n");
    sb.append("    answerFallbackMethod: ").append(toIndentedString(answerFallbackMethod)).append("\n");
    sb.append("    answerFallbackUrl: ").append(toIndentedString(answerFallbackUrl)).append("\n");
    sb.append("    disconnectMethod: ").append(toIndentedString(disconnectMethod)).append("\n");
    sb.append("    disconnectUrl: ").append(toIndentedString(disconnectUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    fallbackUsername: ").append(toIndentedString(fallbackUsername)).append("\n");
    sb.append("    fallbackPassword: ").append(toIndentedString(fallbackPassword)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
    openapiFields.add("applicationId");
    openapiFields.add("accountId");
    openapiFields.add("callId");
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("enqueuedTime");
    openapiFields.add("callUrl");
    openapiFields.add("callTimeout");
    openapiFields.add("callbackTimeout");
    openapiFields.add("tag");
    openapiFields.add("answerMethod");
    openapiFields.add("answerUrl");
    openapiFields.add("answerFallbackMethod");
    openapiFields.add("answerFallbackUrl");
    openapiFields.add("disconnectMethod");
    openapiFields.add("disconnectUrl");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("fallbackUsername");
    openapiFields.add("fallbackPassword");
    openapiFields.add("priority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applicationId");
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("callId");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("callUrl");
    openapiRequiredFields.add("answerMethod");
    openapiRequiredFields.add("answerUrl");
    openapiRequiredFields.add("disconnectMethod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCallResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCallResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCallResponse is not found in the empty JSON string", CreateCallResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCallResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCallResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCallResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("applicationId") != null && !jsonObj.get("applicationId").isJsonNull()) && !jsonObj.get("applicationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationId").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("callId") != null && !jsonObj.get("callId").isJsonNull()) && !jsonObj.get("callId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callId").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("callUrl") != null && !jsonObj.get("callUrl").isJsonNull()) && !jsonObj.get("callUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callUrl").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("answerUrl") != null && !jsonObj.get("answerUrl").isJsonNull()) && !jsonObj.get("answerUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answerUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answerUrl").toString()));
      }
      if ((jsonObj.get("answerFallbackUrl") != null && !jsonObj.get("answerFallbackUrl").isJsonNull()) && !jsonObj.get("answerFallbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answerFallbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answerFallbackUrl").toString()));
      }
      if ((jsonObj.get("disconnectUrl") != null && !jsonObj.get("disconnectUrl").isJsonNull()) && !jsonObj.get("disconnectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disconnectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disconnectUrl").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
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
       if (!CreateCallResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCallResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCallResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCallResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCallResponse>() {
           @Override
           public void write(JsonWriter out, CreateCallResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCallResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCallResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCallResponse
  * @throws IOException if the JSON string is invalid with respect to CreateCallResponse
  */
  public static CreateCallResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCallResponse.class);
  }

 /**
  * Convert an instance of CreateCallResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

