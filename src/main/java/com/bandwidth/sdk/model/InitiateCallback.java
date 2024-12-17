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
import com.bandwidth.sdk.model.Diversion;
import com.bandwidth.sdk.model.StirShaken;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * The Initiate event is fired when an inbound call is received for a Telephone Number on your Account. It is sent to the URL specified in the application associated with the location (sip-peer) that the called telephone number belongs to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class InitiateCallback {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  @javax.annotation.Nullable
  private String eventType;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  @javax.annotation.Nullable
  private String applicationId;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  @javax.annotation.Nullable
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  @javax.annotation.Nullable
  private String to;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  @javax.annotation.Nullable
  private CallDirectionEnum direction;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  @javax.annotation.Nullable
  private String callId;

  public static final String SERIALIZED_NAME_CALL_URL = "callUrl";
  @SerializedName(SERIALIZED_NAME_CALL_URL)
  @javax.annotation.Nullable
  private URI callUrl;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_DIVERSION = "diversion";
  @SerializedName(SERIALIZED_NAME_DIVERSION)
  @javax.annotation.Nullable
  private Diversion diversion;

  public static final String SERIALIZED_NAME_STIR_SHAKEN = "stirShaken";
  @SerializedName(SERIALIZED_NAME_STIR_SHAKEN)
  @javax.annotation.Nullable
  private StirShaken stirShaken;

  public InitiateCallback() {
  }

  public InitiateCallback eventType(@javax.annotation.Nullable String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The event type, value can be one of the following: answer, bridgeComplete, bridgeTargetComplete, conferenceCreated, conferenceRedirect, conferenceMemberJoin, conferenceMemberExit, conferenceCompleted, conferenceRecordingAvailable, disconnect, dtmf, gather, initiate, machineDetectionComplete, recordingComplete, recordingAvailable, redirect, transcriptionAvailable, transferAnswer, transferComplete, transferDisconnect.
   * @return eventType
   */
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }

  public void setEventType(@javax.annotation.Nullable String eventType) {
    this.eventType = eventType;
  }


  public InitiateCallback eventTime(@javax.annotation.Nullable OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * The approximate UTC date and time when the event was generated by the Bandwidth server, in ISO 8601 format. This may not be exactly the time of event execution.
   * @return eventTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(@javax.annotation.Nullable OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }


  public InitiateCallback accountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The user account associated with the call.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public InitiateCallback applicationId(@javax.annotation.Nullable String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The id of the application associated with the call.
   * @return applicationId
   */
  @javax.annotation.Nullable
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@javax.annotation.Nullable String applicationId) {
    this.applicationId = applicationId;
  }


  public InitiateCallback from(@javax.annotation.Nullable String from) {
    this.from = from;
    return this;
  }

  /**
   * The provided identifier of the caller. Must be a phone number in E.164 format (e.g. +15555555555).
   * @return from
   */
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }

  public void setFrom(@javax.annotation.Nullable String from) {
    this.from = from;
  }


  public InitiateCallback to(@javax.annotation.Nullable String to) {
    this.to = to;
    return this;
  }

  /**
   * The phone number that received the call, in E.164 format (e.g. +15555555555).
   * @return to
   */
  @javax.annotation.Nullable
  public String getTo() {
    return to;
  }

  public void setTo(@javax.annotation.Nullable String to) {
    this.to = to;
  }


  public InitiateCallback direction(@javax.annotation.Nullable CallDirectionEnum direction) {
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


  public InitiateCallback callId(@javax.annotation.Nullable String callId) {
    this.callId = callId;
    return this;
  }

  /**
   * The call id associated with the event.
   * @return callId
   */
  @javax.annotation.Nullable
  public String getCallId() {
    return callId;
  }

  public void setCallId(@javax.annotation.Nullable String callId) {
    this.callId = callId;
  }


  public InitiateCallback callUrl(@javax.annotation.Nullable URI callUrl) {
    this.callUrl = callUrl;
    return this;
  }

  /**
   * The URL of the call associated with the event.
   * @return callUrl
   */
  @javax.annotation.Nullable
  public URI getCallUrl() {
    return callUrl;
  }

  public void setCallUrl(@javax.annotation.Nullable URI callUrl) {
    this.callUrl = callUrl;
  }


  public InitiateCallback startTime(@javax.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Time the call was started, in ISO 8601 format.
   * @return startTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(@javax.annotation.Nullable OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public InitiateCallback diversion(@javax.annotation.Nullable Diversion diversion) {
    this.diversion = diversion;
    return this;
  }

  /**
   * Get diversion
   * @return diversion
   */
  @javax.annotation.Nullable
  public Diversion getDiversion() {
    return diversion;
  }

  public void setDiversion(@javax.annotation.Nullable Diversion diversion) {
    this.diversion = diversion;
  }


  public InitiateCallback stirShaken(@javax.annotation.Nullable StirShaken stirShaken) {
    this.stirShaken = stirShaken;
    return this;
  }

  /**
   * Get stirShaken
   * @return stirShaken
   */
  @javax.annotation.Nullable
  public StirShaken getStirShaken() {
    return stirShaken;
  }

  public void setStirShaken(@javax.annotation.Nullable StirShaken stirShaken) {
    this.stirShaken = stirShaken;
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
   * @return the InitiateCallback instance itself
   */
  public InitiateCallback putAdditionalProperty(String key, Object value) {
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
    InitiateCallback initiateCallback = (InitiateCallback) o;
    return Objects.equals(this.eventType, initiateCallback.eventType) &&
        Objects.equals(this.eventTime, initiateCallback.eventTime) &&
        Objects.equals(this.accountId, initiateCallback.accountId) &&
        Objects.equals(this.applicationId, initiateCallback.applicationId) &&
        Objects.equals(this.from, initiateCallback.from) &&
        Objects.equals(this.to, initiateCallback.to) &&
        Objects.equals(this.direction, initiateCallback.direction) &&
        Objects.equals(this.callId, initiateCallback.callId) &&
        Objects.equals(this.callUrl, initiateCallback.callUrl) &&
        Objects.equals(this.startTime, initiateCallback.startTime) &&
        Objects.equals(this.diversion, initiateCallback.diversion) &&
        Objects.equals(this.stirShaken, initiateCallback.stirShaken)&&
        Objects.equals(this.additionalProperties, initiateCallback.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTime, accountId, applicationId, from, to, direction, callId, callUrl, startTime, diversion, stirShaken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCallback {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    callUrl: ").append(toIndentedString(callUrl)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    diversion: ").append(toIndentedString(diversion)).append("\n");
    sb.append("    stirShaken: ").append(toIndentedString(stirShaken)).append("\n");
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
    openapiFields.add("eventType");
    openapiFields.add("eventTime");
    openapiFields.add("accountId");
    openapiFields.add("applicationId");
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("direction");
    openapiFields.add("callId");
    openapiFields.add("callUrl");
    openapiFields.add("startTime");
    openapiFields.add("diversion");
    openapiFields.add("stirShaken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InitiateCallback
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InitiateCallback.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InitiateCallback is not found in the empty JSON string", InitiateCallback.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("applicationId") != null && !jsonObj.get("applicationId").isJsonNull()) && !jsonObj.get("applicationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationId").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        CallDirectionEnum.validateJsonElement(jsonObj.get("direction"));
      }
      if ((jsonObj.get("callId") != null && !jsonObj.get("callId").isJsonNull()) && !jsonObj.get("callId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callId").toString()));
      }
      if ((jsonObj.get("callUrl") != null && !jsonObj.get("callUrl").isJsonNull()) && !jsonObj.get("callUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callUrl").toString()));
      }
      // validate the optional field `diversion`
      if (jsonObj.get("diversion") != null && !jsonObj.get("diversion").isJsonNull()) {
        Diversion.validateJsonElement(jsonObj.get("diversion"));
      }
      // validate the optional field `stirShaken`
      if (jsonObj.get("stirShaken") != null && !jsonObj.get("stirShaken").isJsonNull()) {
        StirShaken.validateJsonElement(jsonObj.get("stirShaken"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InitiateCallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InitiateCallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InitiateCallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InitiateCallback.class));

       return (TypeAdapter<T>) new TypeAdapter<InitiateCallback>() {
           @Override
           public void write(JsonWriter out, InitiateCallback value) throws IOException {
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
           public InitiateCallback read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             InitiateCallback instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of InitiateCallback given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InitiateCallback
   * @throws IOException if the JSON string is invalid with respect to InitiateCallback
   */
  public static InitiateCallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InitiateCallback.class);
  }

  /**
   * Convert an instance of InitiateCallback to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

