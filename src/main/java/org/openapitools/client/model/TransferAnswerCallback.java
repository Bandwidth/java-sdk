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
import java.time.OffsetDateTime;
import org.openapitools.client.model.CallDirectionEnum;
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
 * When processing a &lt;Transfer&gt; verb, this event is sent when a called party (B-leg) answers. The event is sent to the endpoint specified in the transferAnswerUrl attribute of the &lt;PhoneNumber&gt; tag that answered. BXML returned by this callback will be executed for the called party only. After all BXML has been executed, the called party will be bridged to the original call. Most BXML verbs are allowed in response to a transferAnswer event, but some are not allowed.
 */
@ApiModel(description = "When processing a <Transfer> verb, this event is sent when a called party (B-leg) answers. The event is sent to the endpoint specified in the transferAnswerUrl attribute of the <PhoneNumber> tag that answered. BXML returned by this callback will be executed for the called party only. After all BXML has been executed, the called party will be bridged to the original call. Most BXML verbs are allowed in response to a transferAnswer event, but some are not allowed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-27T11:08:51.953012-04:00[America/New_York]")
public class TransferAnswerCallback {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private String eventTime;

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

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private CallDirectionEnum direction;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

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

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TRANSFER_CALLER_ID = "transferCallerId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CALLER_ID)
  private String transferCallerId;

  public static final String SERIALIZED_NAME_TRANSFER_TO = "transferTo";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TO)
  private String transferTo;

  public TransferAnswerCallback() {
  }

  public TransferAnswerCallback eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The event type, value can be one of the following: answer, bridgeComplete, bridgeTargetComplete, conferenceCreated, conferenceRedirect, conferenceMemberJoin, conferenceMemberExit, conferenceCompleted, conferenceRecordingAvailable, disconnect, dtmf, gather, initiate, machineDetectionComplete, recordingComplete, recordingAvailable, redirect, transcriptionAvailable, transferAnswer, transferComplete, transferDisconnect.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bridgeComplete", value = "The event type, value can be one of the following: answer, bridgeComplete, bridgeTargetComplete, conferenceCreated, conferenceRedirect, conferenceMemberJoin, conferenceMemberExit, conferenceCompleted, conferenceRecordingAvailable, disconnect, dtmf, gather, initiate, machineDetectionComplete, recordingComplete, recordingAvailable, redirect, transcriptionAvailable, transferAnswer, transferComplete, transferDisconnect.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public TransferAnswerCallback eventTime(String eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * The approximate UTC date and time when the event was generated by the Bandwidth server, in ISO 8601 format. This may not be exactly the time of event execution.
   * @return eventTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The approximate UTC date and time when the event was generated by the Bandwidth server, in ISO 8601 format. This may not be exactly the time of event execution.")

  public String getEventTime() {
    return eventTime;
  }


  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }


  public TransferAnswerCallback accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The user account associated with the call.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "920012", value = "The user account associated with the call.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferAnswerCallback applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The id of the application associated with the call.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "04e88489-df02-4e34-a0ee-27a91849555f", value = "The id of the application associated with the call.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public TransferAnswerCallback from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The provided identifier of the caller: can be a phone number in E.164 format (e.g. +15555555555) or one of Private, Restricted, Unavailable, or Anonymous.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+15555555555", value = "The provided identifier of the caller: can be a phone number in E.164 format (e.g. +15555555555) or one of Private, Restricted, Unavailable, or Anonymous.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public TransferAnswerCallback to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The phone number that received the call, in E.164 format (e.g. +15555555555).
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+15555555555", value = "The phone number that received the call, in E.164 format (e.g. +15555555555).")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public TransferAnswerCallback direction(CallDirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CallDirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(CallDirectionEnum direction) {
    this.direction = direction;
  }


  public TransferAnswerCallback callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * The call id associated with the event.
   * @return callId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85", value = "The call id associated with the event.")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public TransferAnswerCallback callUrl(String callUrl) {
    
    this.callUrl = callUrl;
    return this;
  }

   /**
   * The URL of the call associated with the event.
   * @return callUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://voice.bandwidth.com/api/v2/accounts/9900000/calls/c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85", value = "The URL of the call associated with the event.")

  public String getCallUrl() {
    return callUrl;
  }


  public void setCallUrl(String callUrl) {
    this.callUrl = callUrl;
  }


  public TransferAnswerCallback enqueuedTime(OffsetDateTime enqueuedTime) {
    
    this.enqueuedTime = enqueuedTime;
    return this;
  }

   /**
   * (optional) If call queueing is enabled and this is an outbound call, time the call was queued, in ISO 8601 format.
   * @return enqueuedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-17T22:20Z", value = "(optional) If call queueing is enabled and this is an outbound call, time the call was queued, in ISO 8601 format.")

  public OffsetDateTime getEnqueuedTime() {
    return enqueuedTime;
  }


  public void setEnqueuedTime(OffsetDateTime enqueuedTime) {
    this.enqueuedTime = enqueuedTime;
  }


  public TransferAnswerCallback startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Time the call was started, in ISO 8601 format.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-17T22:19:40.375Z", value = "Time the call was started, in ISO 8601 format.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public TransferAnswerCallback answerTime(OffsetDateTime answerTime) {
    
    this.answerTime = answerTime;
    return this;
  }

   /**
   * Time the call was answered, in ISO 8601 format.
   * @return answerTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-17T22:20Z", value = "Time the call was answered, in ISO 8601 format.")

  public OffsetDateTime getAnswerTime() {
    return answerTime;
  }


  public void setAnswerTime(OffsetDateTime answerTime) {
    this.answerTime = answerTime;
  }


  public TransferAnswerCallback tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * (optional) The tag specified on call creation. If no tag was specified or it was previously cleared, this field will not be present.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "exampleTag", value = "(optional) The tag specified on call creation. If no tag was specified or it was previously cleared, this field will not be present.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public TransferAnswerCallback transferCallerId(String transferCallerId) {
    
    this.transferCallerId = transferCallerId;
    return this;
  }

   /**
   * The phone number used as the from field of the B-leg call, in E.164 format (e.g. +15555555555) or one of Restricted, Anonymous, Private, or Unavailable.
   * @return transferCallerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+15555555555", value = "The phone number used as the from field of the B-leg call, in E.164 format (e.g. +15555555555) or one of Restricted, Anonymous, Private, or Unavailable.")

  public String getTransferCallerId() {
    return transferCallerId;
  }


  public void setTransferCallerId(String transferCallerId) {
    this.transferCallerId = transferCallerId;
  }


  public TransferAnswerCallback transferTo(String transferTo) {
    
    this.transferTo = transferTo;
    return this;
  }

   /**
   * The phone number used as the to field of the B-leg call, in E.164 format (e.g. +15555555555).
   * @return transferTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+15555555555)", value = "The phone number used as the to field of the B-leg call, in E.164 format (e.g. +15555555555).")

  public String getTransferTo() {
    return transferTo;
  }


  public void setTransferTo(String transferTo) {
    this.transferTo = transferTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAnswerCallback transferAnswerCallback = (TransferAnswerCallback) o;
    return Objects.equals(this.eventType, transferAnswerCallback.eventType) &&
        Objects.equals(this.eventTime, transferAnswerCallback.eventTime) &&
        Objects.equals(this.accountId, transferAnswerCallback.accountId) &&
        Objects.equals(this.applicationId, transferAnswerCallback.applicationId) &&
        Objects.equals(this.from, transferAnswerCallback.from) &&
        Objects.equals(this.to, transferAnswerCallback.to) &&
        Objects.equals(this.direction, transferAnswerCallback.direction) &&
        Objects.equals(this.callId, transferAnswerCallback.callId) &&
        Objects.equals(this.callUrl, transferAnswerCallback.callUrl) &&
        Objects.equals(this.enqueuedTime, transferAnswerCallback.enqueuedTime) &&
        Objects.equals(this.startTime, transferAnswerCallback.startTime) &&
        Objects.equals(this.answerTime, transferAnswerCallback.answerTime) &&
        Objects.equals(this.tag, transferAnswerCallback.tag) &&
        Objects.equals(this.transferCallerId, transferAnswerCallback.transferCallerId) &&
        Objects.equals(this.transferTo, transferAnswerCallback.transferTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTime, accountId, applicationId, from, to, direction, callId, callUrl, enqueuedTime, startTime, answerTime, tag, transferCallerId, transferTo);
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
    sb.append("class TransferAnswerCallback {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    callUrl: ").append(toIndentedString(callUrl)).append("\n");
    sb.append("    enqueuedTime: ").append(toIndentedString(enqueuedTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    answerTime: ").append(toIndentedString(answerTime)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    transferCallerId: ").append(toIndentedString(transferCallerId)).append("\n");
    sb.append("    transferTo: ").append(toIndentedString(transferTo)).append("\n");
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
    openapiFields.add("enqueuedTime");
    openapiFields.add("startTime");
    openapiFields.add("answerTime");
    openapiFields.add("tag");
    openapiFields.add("transferCallerId");
    openapiFields.add("transferTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferAnswerCallback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferAnswerCallback.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferAnswerCallback is not found in the empty JSON string", TransferAnswerCallback.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferAnswerCallback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferAnswerCallback` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("eventTime") != null && !jsonObj.get("eventTime").isJsonNull()) && !jsonObj.get("eventTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventTime").toString()));
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
      if ((jsonObj.get("callUrl") != null && !jsonObj.get("callUrl").isJsonNull()) && !jsonObj.get("callUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callUrl").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("transferCallerId") != null && !jsonObj.get("transferCallerId").isJsonNull()) && !jsonObj.get("transferCallerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferCallerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferCallerId").toString()));
      }
      if ((jsonObj.get("transferTo") != null && !jsonObj.get("transferTo").isJsonNull()) && !jsonObj.get("transferTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferTo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferAnswerCallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferAnswerCallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferAnswerCallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferAnswerCallback.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferAnswerCallback>() {
           @Override
           public void write(JsonWriter out, TransferAnswerCallback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferAnswerCallback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferAnswerCallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferAnswerCallback
  * @throws IOException if the JSON string is invalid with respect to TransferAnswerCallback
  */
  public static TransferAnswerCallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferAnswerCallback.class);
  }

 /**
  * Convert an instance of TransferAnswerCallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

