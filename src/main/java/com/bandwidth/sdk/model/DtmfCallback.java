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
 * The DTMF event is sent for every digit detected after a &lt;StartGather&gt; verb is executed. You may not respond to this event with BXML.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T14:24:34.966664-04:00[America/New_York]")
public class DtmfCallback {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private CallDirectionEnum direction;

  public static final String SERIALIZED_NAME_DIGIT = "digit";
  @SerializedName(SERIALIZED_NAME_DIGIT)
  private String digit;

  public static final String SERIALIZED_NAME_CALL_URL = "callUrl";
  @SerializedName(SERIALIZED_NAME_CALL_URL)
  private String callUrl;

  public static final String SERIALIZED_NAME_ENQUEUED_TIME = "enqueuedTime";
  @SerializedName(SERIALIZED_NAME_ENQUEUED_TIME)
  private OffsetDateTime enqueuedTime;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_ANSWER_TIME = "answerTime";
  @SerializedName(SERIALIZED_NAME_ANSWER_TIME)
  private OffsetDateTime answerTime;

  public static final String SERIALIZED_NAME_PARENT_CALL_ID = "parentCallId";
  @SerializedName(SERIALIZED_NAME_PARENT_CALL_ID)
  private String parentCallId;

  public static final String SERIALIZED_NAME_TRANSFER_CALLER_ID = "transferCallerId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CALLER_ID)
  private String transferCallerId;

  public static final String SERIALIZED_NAME_TRANSFER_TO = "transferTo";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TO)
  private String transferTo;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public DtmfCallback() {
  }

  public DtmfCallback eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The event type, value can be one of the following: answer, bridgeComplete, bridgeTargetComplete, conferenceCreated, conferenceRedirect, conferenceMemberJoin, conferenceMemberExit, conferenceCompleted, conferenceRecordingAvailable, disconnect, dtmf, gather, initiate, machineDetectionComplete, recordingComplete, recordingAvailable, redirect, transcriptionAvailable, transferAnswer, transferComplete, transferDisconnect.
   * @return eventType
  **/
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public DtmfCallback eventTime(OffsetDateTime eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * The approximate UTC date and time when the event was generated by the Bandwidth server, in ISO 8601 format. This may not be exactly the time of event execution.
   * @return eventTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEventTime() {
    return eventTime;
  }


  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }


  public DtmfCallback accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The user account associated with the call.
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public DtmfCallback applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The id of the application associated with the call.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public DtmfCallback from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The provided identifier of the caller: can be a phone number in E.164 format (e.g. +15555555555) or one of Private, Restricted, Unavailable, or Anonymous.
   * @return from
  **/
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public DtmfCallback to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The phone number that received the call, in E.164 format (e.g. +15555555555).
   * @return to
  **/
  @javax.annotation.Nullable
  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public DtmfCallback callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * The call id associated with the event.
   * @return callId
  **/
  @javax.annotation.Nullable
  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public DtmfCallback direction(CallDirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public CallDirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(CallDirectionEnum direction) {
    this.direction = direction;
  }


  public DtmfCallback digit(String digit) {
    
    this.digit = digit;
    return this;
  }

   /**
   * The digit collected in the call.
   * @return digit
  **/
  @javax.annotation.Nullable
  public String getDigit() {
    return digit;
  }


  public void setDigit(String digit) {
    this.digit = digit;
  }


  public DtmfCallback callUrl(String callUrl) {
    
    this.callUrl = callUrl;
    return this;
  }

   /**
   * The URL of the call associated with the event.
   * @return callUrl
  **/
  @javax.annotation.Nullable
  public String getCallUrl() {
    return callUrl;
  }


  public void setCallUrl(String callUrl) {
    this.callUrl = callUrl;
  }


  public DtmfCallback enqueuedTime(OffsetDateTime enqueuedTime) {
    
    this.enqueuedTime = enqueuedTime;
    return this;
  }

   /**
   * (optional) If call queueing is enabled and this is an outbound call, time the call was queued, in ISO 8601 format.
   * @return enqueuedTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEnqueuedTime() {
    return enqueuedTime;
  }


  public void setEnqueuedTime(OffsetDateTime enqueuedTime) {
    this.enqueuedTime = enqueuedTime;
  }


  public DtmfCallback startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Time the call was started, in ISO 8601 format.
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public DtmfCallback answerTime(OffsetDateTime answerTime) {
    
    this.answerTime = answerTime;
    return this;
  }

   /**
   * Time the call was answered, in ISO 8601 format.
   * @return answerTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getAnswerTime() {
    return answerTime;
  }


  public void setAnswerTime(OffsetDateTime answerTime) {
    this.answerTime = answerTime;
  }


  public DtmfCallback parentCallId(String parentCallId) {
    
    this.parentCallId = parentCallId;
    return this;
  }

   /**
   * (optional) If the event is related to the B leg of a &lt;Transfer&gt;, the call id of the original call leg that executed the &lt;Transfer&gt;. Otherwise, this field will not be present.
   * @return parentCallId
  **/
  @javax.annotation.Nullable
  public String getParentCallId() {
    return parentCallId;
  }


  public void setParentCallId(String parentCallId) {
    this.parentCallId = parentCallId;
  }


  public DtmfCallback transferCallerId(String transferCallerId) {
    
    this.transferCallerId = transferCallerId;
    return this;
  }

   /**
   * The phone number used as the from field of the B-leg call, in E.164 format (e.g. +15555555555) or one of Restricted, Anonymous, Private, or Unavailable.
   * @return transferCallerId
  **/
  @javax.annotation.Nullable
  public String getTransferCallerId() {
    return transferCallerId;
  }


  public void setTransferCallerId(String transferCallerId) {
    this.transferCallerId = transferCallerId;
  }


  public DtmfCallback transferTo(String transferTo) {
    
    this.transferTo = transferTo;
    return this;
  }

   /**
   * The phone number used as the to field of the B-leg call, in E.164 format (e.g. +15555555555).
   * @return transferTo
  **/
  @javax.annotation.Nullable
  public String getTransferTo() {
    return transferTo;
  }


  public void setTransferTo(String transferTo) {
    this.transferTo = transferTo;
  }


  public DtmfCallback tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * (optional) The tag specified on call creation. If no tag was specified or it was previously cleared, this field will not be present.
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
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
   * @return the DtmfCallback instance itself
   */
  public DtmfCallback putAdditionalProperty(String key, Object value) {
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
    DtmfCallback dtmfCallback = (DtmfCallback) o;
    return Objects.equals(this.eventType, dtmfCallback.eventType) &&
        Objects.equals(this.eventTime, dtmfCallback.eventTime) &&
        Objects.equals(this.accountId, dtmfCallback.accountId) &&
        Objects.equals(this.applicationId, dtmfCallback.applicationId) &&
        Objects.equals(this.from, dtmfCallback.from) &&
        Objects.equals(this.to, dtmfCallback.to) &&
        Objects.equals(this.callId, dtmfCallback.callId) &&
        Objects.equals(this.direction, dtmfCallback.direction) &&
        Objects.equals(this.digit, dtmfCallback.digit) &&
        Objects.equals(this.callUrl, dtmfCallback.callUrl) &&
        Objects.equals(this.enqueuedTime, dtmfCallback.enqueuedTime) &&
        Objects.equals(this.startTime, dtmfCallback.startTime) &&
        Objects.equals(this.answerTime, dtmfCallback.answerTime) &&
        Objects.equals(this.parentCallId, dtmfCallback.parentCallId) &&
        Objects.equals(this.transferCallerId, dtmfCallback.transferCallerId) &&
        Objects.equals(this.transferTo, dtmfCallback.transferTo) &&
        Objects.equals(this.tag, dtmfCallback.tag)&&
        Objects.equals(this.additionalProperties, dtmfCallback.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTime, accountId, applicationId, from, to, callId, direction, digit, callUrl, enqueuedTime, startTime, answerTime, parentCallId, transferCallerId, transferTo, tag, additionalProperties);
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
    sb.append("class DtmfCallback {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("    callUrl: ").append(toIndentedString(callUrl)).append("\n");
    sb.append("    enqueuedTime: ").append(toIndentedString(enqueuedTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    answerTime: ").append(toIndentedString(answerTime)).append("\n");
    sb.append("    parentCallId: ").append(toIndentedString(parentCallId)).append("\n");
    sb.append("    transferCallerId: ").append(toIndentedString(transferCallerId)).append("\n");
    sb.append("    transferTo: ").append(toIndentedString(transferTo)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("callId");
    openapiFields.add("direction");
    openapiFields.add("digit");
    openapiFields.add("callUrl");
    openapiFields.add("enqueuedTime");
    openapiFields.add("startTime");
    openapiFields.add("answerTime");
    openapiFields.add("parentCallId");
    openapiFields.add("transferCallerId");
    openapiFields.add("transferTo");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DtmfCallback
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DtmfCallback.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DtmfCallback is not found in the empty JSON string", DtmfCallback.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("callId") != null && !jsonObj.get("callId").isJsonNull()) && !jsonObj.get("callId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callId").toString()));
      }
      if ((jsonObj.get("digit") != null && !jsonObj.get("digit").isJsonNull()) && !jsonObj.get("digit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digit").toString()));
      }
      if ((jsonObj.get("callUrl") != null && !jsonObj.get("callUrl").isJsonNull()) && !jsonObj.get("callUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callUrl").toString()));
      }
      if ((jsonObj.get("parentCallId") != null && !jsonObj.get("parentCallId").isJsonNull()) && !jsonObj.get("parentCallId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentCallId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentCallId").toString()));
      }
      if ((jsonObj.get("transferCallerId") != null && !jsonObj.get("transferCallerId").isJsonNull()) && !jsonObj.get("transferCallerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferCallerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferCallerId").toString()));
      }
      if ((jsonObj.get("transferTo") != null && !jsonObj.get("transferTo").isJsonNull()) && !jsonObj.get("transferTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferTo").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DtmfCallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DtmfCallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DtmfCallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DtmfCallback.class));

       return (TypeAdapter<T>) new TypeAdapter<DtmfCallback>() {
           @Override
           public void write(JsonWriter out, DtmfCallback value) throws IOException {
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
           public DtmfCallback read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DtmfCallback instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DtmfCallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DtmfCallback
  * @throws IOException if the JSON string is invalid with respect to DtmfCallback
  */
  public static DtmfCallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DtmfCallback.class);
  }

 /**
  * Convert an instance of DtmfCallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

