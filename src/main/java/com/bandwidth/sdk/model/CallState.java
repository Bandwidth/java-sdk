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
import com.bandwidth.sdk.model.CallDirectionEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * CallState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CallState {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  @javax.annotation.Nullable
  private String applicationId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  @javax.annotation.Nullable
  private String callId;

  public static final String SERIALIZED_NAME_PARENT_CALL_ID = "parentCallId";
  @SerializedName(SERIALIZED_NAME_PARENT_CALL_ID)
  @javax.annotation.Nullable
  private String parentCallId;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  @javax.annotation.Nullable
  private String to;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  @javax.annotation.Nullable
  private String from;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  @javax.annotation.Nullable
  private CallDirectionEnum direction;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_STIR_SHAKEN = "stirShaken";
  @SerializedName(SERIALIZED_NAME_STIR_SHAKEN)
  @javax.annotation.Nullable
  private Map<String, String> stirShaken;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  @javax.annotation.Nullable
  private String identity;

  public static final String SERIALIZED_NAME_ENQUEUED_TIME = "enqueuedTime";
  @SerializedName(SERIALIZED_NAME_ENQUEUED_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime enqueuedTime;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_ANSWER_TIME = "answerTime";
  @SerializedName(SERIALIZED_NAME_ANSWER_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime answerTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_DISCONNECT_CAUSE = "disconnectCause";
  @SerializedName(SERIALIZED_NAME_DISCONNECT_CAUSE)
  @javax.annotation.Nullable
  private String disconnectCause;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  @javax.annotation.Nullable
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_ID = "errorId";
  @SerializedName(SERIALIZED_NAME_ERROR_ID)
  @javax.annotation.Nullable
  private String errorId;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  @javax.annotation.Nullable
  private OffsetDateTime lastUpdate;

  public CallState() {
  }

  public CallState applicationId(@javax.annotation.Nullable String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The application id associated with the call.
   * @return applicationId
   */
  @javax.annotation.Nullable
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@javax.annotation.Nullable String applicationId) {
    this.applicationId = applicationId;
  }


  public CallState accountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account id associated with the call.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public CallState callId(@javax.annotation.Nullable String callId) {
    this.callId = callId;
    return this;
  }

  /**
   * The programmable voice API call ID.
   * @return callId
   */
  @javax.annotation.Nullable
  public String getCallId() {
    return callId;
  }

  public void setCallId(@javax.annotation.Nullable String callId) {
    this.callId = callId;
  }


  public CallState parentCallId(@javax.annotation.Nullable String parentCallId) {
    this.parentCallId = parentCallId;
    return this;
  }

  /**
   * The A-leg call id, set only if this call is the B-leg of a [&#x60;&lt;Transfer&gt;&#x60;](/docs/voice/bxml/transfer).
   * @return parentCallId
   */
  @javax.annotation.Nullable
  public String getParentCallId() {
    return parentCallId;
  }

  public void setParentCallId(@javax.annotation.Nullable String parentCallId) {
    this.parentCallId = parentCallId;
  }


  public CallState to(@javax.annotation.Nullable String to) {
    this.to = to;
    return this;
  }

  /**
   * The phone number that received the call, in E.164 format (e.g. +15555555555), or if the call was to a SIP URI, the SIP URI.
   * @return to
   */
  @javax.annotation.Nullable
  public String getTo() {
    return to;
  }

  public void setTo(@javax.annotation.Nullable String to) {
    this.to = to;
  }


  public CallState from(@javax.annotation.Nullable String from) {
    this.from = from;
    return this;
  }

  /**
   * The phone number that made the call, in E.164 format (e.g. +15555555555).
   * @return from
   */
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }

  public void setFrom(@javax.annotation.Nullable String from) {
    this.from = from;
  }


  public CallState direction(@javax.annotation.Nullable CallDirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @javax.annotation.Nullable
  public CallDirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(@javax.annotation.Nullable CallDirectionEnum direction) {
    this.direction = direction;
  }


  public CallState state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The current state of the call. Current possible values are &#x60;queued&#x60;, &#x60;initiated&#x60;, &#x60;answered&#x60; and &#x60;disconnected&#x60;. Additional states may be added in the future, so your application must be tolerant of unknown values.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public CallState stirShaken(@javax.annotation.Nullable Map<String, String> stirShaken) {
    this.stirShaken = stirShaken;
    return this;
  }

  public CallState putStirShakenItem(String key, String stirShakenItem) {
    if (this.stirShaken == null) {
      this.stirShaken = new HashMap<>();
    }
    this.stirShaken.put(key, stirShakenItem);
    return this;
  }

  /**
   * For inbound calls, the Bandwidth STIR/SHAKEN implementation will verify the information provided in the inbound invite request &#x60;Identity&#x60; header. The verification status is stored in the call state &#x60;stirShaken&#x60; property as follows.  | Property          | Description | |:------------------|:------------| | verstat | (optional) The verification status indicating whether the verification was successful or not. Possible values are &#x60;TN-Verification-Passed&#x60; or &#x60;TN-Verification-Failed&#x60;. | | attestationIndicator | (optional) The attestation level verified by Bandwidth. Possible values are &#x60;A&#x60; (full), &#x60;B&#x60; (partial) or &#x60;C&#x60; (gateway). | | originatingId | (optional) A unique origination identifier. |  Note that these are common properties but that the &#x60;stirShaken&#x60; object is free form and can contain other key-value pairs.  More information: [Understanding STIR/SHAKEN](https://www.bandwidth.com/regulations/stir-shaken).
   * @return stirShaken
   */
  @javax.annotation.Nullable
  public Map<String, String> getStirShaken() {
    return stirShaken;
  }

  public void setStirShaken(@javax.annotation.Nullable Map<String, String> stirShaken) {
    this.stirShaken = stirShaken;
  }


  public CallState identity(@javax.annotation.Nullable String identity) {
    this.identity = identity;
    return this;
  }

  /**
   * The value of the &#x60;Identity&#x60; header from the inbound invite request. Only present for inbound calls and if the account is configured to forward this header.
   * @return identity
   */
  @javax.annotation.Nullable
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(@javax.annotation.Nullable String identity) {
    this.identity = identity;
  }


  public CallState enqueuedTime(@javax.annotation.Nullable OffsetDateTime enqueuedTime) {
    this.enqueuedTime = enqueuedTime;
    return this;
  }

  /**
   * The time this call was placed in queue.
   * @return enqueuedTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEnqueuedTime() {
    return enqueuedTime;
  }

  public void setEnqueuedTime(@javax.annotation.Nullable OffsetDateTime enqueuedTime) {
    this.enqueuedTime = enqueuedTime;
  }


  public CallState startTime(@javax.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The time the call was initiated, in ISO 8601 format. &#x60;null&#x60; if the call is still in your queue.
   * @return startTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(@javax.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public CallState answerTime(@javax.annotation.Nullable OffsetDateTime answerTime) {
    this.answerTime = answerTime;
    return this;
  }

  /**
   * Populated once the call has been answered, with the time in ISO 8601 format.
   * @return answerTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getAnswerTime() {
    return answerTime;
  }

  public void setAnswerTime(@javax.annotation.Nullable OffsetDateTime answerTime) {
    this.answerTime = answerTime;
  }


  public CallState endTime(@javax.annotation.Nullable OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Populated once the call has ended, with the time in ISO 8601 format.
   * @return endTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(@javax.annotation.Nullable OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public CallState disconnectCause(@javax.annotation.Nullable String disconnectCause) {
    this.disconnectCause = disconnectCause;
    return this;
  }

  /**
   * | Cause | Description | |:------|:------------| | &#x60;hangup&#x60;| One party hung up the call, a [&#x60;&lt;Hangup&gt;&#x60;](../../bxml/verbs/hangup.md) verb was executed, or there was no more BXML to execute; it indicates that the call ended normally. | | &#x60;busy&#x60; | Callee was busy. | | &#x60;timeout&#x60; | Call wasn&#39;t answered before the &#x60;callTimeout&#x60; was reached. | | &#x60;cancel&#x60; | Call was cancelled by its originator while it was ringing. | | &#x60;rejected&#x60; | Call was rejected by the callee. | | &#x60;callback-error&#x60; | BXML callback couldn&#39;t be delivered to your callback server. | | &#x60;invalid-bxml&#x60; | Invalid BXML was returned in response to a callback. | | &#x60;application-error&#x60; | An unsupported action was tried on the call, e.g. trying to play a .ogg audio. | | &#x60;account-limit&#x60; | Account rate limits were reached. | | &#x60;node-capacity-exceeded&#x60; | System maximum capacity was reached. | | &#x60;error&#x60; | Some error not described in any of the other causes happened on the call. | | &#x60;unknown&#x60; | Unknown error happened on the call. |  Note: This list is not exhaustive and other values can appear in the future.
   * @return disconnectCause
   */
  @javax.annotation.Nullable
  public String getDisconnectCause() {
    return disconnectCause;
  }

  public void setDisconnectCause(@javax.annotation.Nullable String disconnectCause) {
    this.disconnectCause = disconnectCause;
  }


  public CallState errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Populated only if the call ended with an error, with text explaining the reason.
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CallState errorId(@javax.annotation.Nullable String errorId) {
    this.errorId = errorId;
    return this;
  }

  /**
   * Populated only if the call ended with an error, with a Bandwidth internal id that references the error event.
   * @return errorId
   */
  @javax.annotation.Nullable
  public String getErrorId() {
    return errorId;
  }

  public void setErrorId(@javax.annotation.Nullable String errorId) {
    this.errorId = errorId;
  }


  public CallState lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * The last time the call had a state update, in ISO 8601 format.
   * @return lastUpdate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
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
   * @return the CallState instance itself
   */
  public CallState putAdditionalProperty(String key, Object value) {
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
    CallState callState = (CallState) o;
    return Objects.equals(this.applicationId, callState.applicationId) &&
        Objects.equals(this.accountId, callState.accountId) &&
        Objects.equals(this.callId, callState.callId) &&
        Objects.equals(this.parentCallId, callState.parentCallId) &&
        Objects.equals(this.to, callState.to) &&
        Objects.equals(this.from, callState.from) &&
        Objects.equals(this.direction, callState.direction) &&
        Objects.equals(this.state, callState.state) &&
        Objects.equals(this.stirShaken, callState.stirShaken) &&
        Objects.equals(this.identity, callState.identity) &&
        Objects.equals(this.enqueuedTime, callState.enqueuedTime) &&
        Objects.equals(this.startTime, callState.startTime) &&
        Objects.equals(this.answerTime, callState.answerTime) &&
        Objects.equals(this.endTime, callState.endTime) &&
        Objects.equals(this.disconnectCause, callState.disconnectCause) &&
        Objects.equals(this.errorMessage, callState.errorMessage) &&
        Objects.equals(this.errorId, callState.errorId) &&
        Objects.equals(this.lastUpdate, callState.lastUpdate)&&
        Objects.equals(this.additionalProperties, callState.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, accountId, callId, parentCallId, to, from, direction, state, stirShaken, identity, enqueuedTime, startTime, answerTime, endTime, disconnectCause, errorMessage, errorId, lastUpdate, additionalProperties);
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
    sb.append("class CallState {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    parentCallId: ").append(toIndentedString(parentCallId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stirShaken: ").append(toIndentedString(stirShaken)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    enqueuedTime: ").append(toIndentedString(enqueuedTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    answerTime: ").append(toIndentedString(answerTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    disconnectCause: ").append(toIndentedString(disconnectCause)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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
    openapiFields.add("applicationId");
    openapiFields.add("accountId");
    openapiFields.add("callId");
    openapiFields.add("parentCallId");
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("direction");
    openapiFields.add("state");
    openapiFields.add("stirShaken");
    openapiFields.add("identity");
    openapiFields.add("enqueuedTime");
    openapiFields.add("startTime");
    openapiFields.add("answerTime");
    openapiFields.add("endTime");
    openapiFields.add("disconnectCause");
    openapiFields.add("errorMessage");
    openapiFields.add("errorId");
    openapiFields.add("lastUpdate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CallState
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CallState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallState is not found in the empty JSON string", CallState.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("applicationId") != null && !jsonObj.get("applicationId").isJsonNull()) && !jsonObj.get("applicationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationId").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("callId") != null && !jsonObj.get("callId").isJsonNull()) && !jsonObj.get("callId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callId").toString()));
      }
      if ((jsonObj.get("parentCallId") != null && !jsonObj.get("parentCallId").isJsonNull()) && !jsonObj.get("parentCallId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentCallId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentCallId").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        CallDirectionEnum.validateJsonElement(jsonObj.get("direction"));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()) && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if ((jsonObj.get("disconnectCause") != null && !jsonObj.get("disconnectCause").isJsonNull()) && !jsonObj.get("disconnectCause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disconnectCause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disconnectCause").toString()));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if ((jsonObj.get("errorId") != null && !jsonObj.get("errorId").isJsonNull()) && !jsonObj.get("errorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallState.class));

       return (TypeAdapter<T>) new TypeAdapter<CallState>() {
           @Override
           public void write(JsonWriter out, CallState value) throws IOException {
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
           public CallState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CallState instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CallState given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CallState
   * @throws IOException if the JSON string is invalid with respect to CallState
   */
  public static CallState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallState.class);
  }

  /**
   * Convert an instance of CallState to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

