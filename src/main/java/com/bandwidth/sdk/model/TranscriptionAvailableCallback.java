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
import com.bandwidth.sdk.model.FileFormatEnum;
import com.bandwidth.sdk.model.Transcription;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
import java.util.Set;

import com.bandwidth.sdk.JSON;

/**
 * The Transcription Available event is sent when the recording transcription is available to be downloaded.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class TranscriptionAvailableCallback {
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

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private CallDirectionEnum direction;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_CALL_URL = "callUrl";
  @SerializedName(SERIALIZED_NAME_CALL_URL)
  private URI callUrl;

  public static final String SERIALIZED_NAME_MEDIA_URL = "mediaUrl";
  @SerializedName(SERIALIZED_NAME_MEDIA_URL)
  private URI mediaUrl;

  public static final String SERIALIZED_NAME_PARENT_CALL_ID = "parentCallId";
  @SerializedName(SERIALIZED_NAME_PARENT_CALL_ID)
  private String parentCallId;

  public static final String SERIALIZED_NAME_RECORDING_ID = "recordingId";
  @SerializedName(SERIALIZED_NAME_RECORDING_ID)
  private String recordingId;

  public static final String SERIALIZED_NAME_ENQUEUED_TIME = "enqueuedTime";
  @SerializedName(SERIALIZED_NAME_ENQUEUED_TIME)
  private OffsetDateTime enqueuedTime;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_FILE_FORMAT = "fileFormat";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private FileFormatEnum fileFormat;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TRANSCRIPTION = "transcription";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPTION)
  private Transcription transcription;

  public static final String SERIALIZED_NAME_TRANSFER_CALLER_ID = "transferCallerId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CALLER_ID)
  private String transferCallerId;

  public static final String SERIALIZED_NAME_TRANSFER_TO = "transferTo";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TO)
  private String transferTo;

  public TranscriptionAvailableCallback() {
  }

  public TranscriptionAvailableCallback eventType(String eventType) {
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


  public TranscriptionAvailableCallback eventTime(OffsetDateTime eventTime) {
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


  public TranscriptionAvailableCallback accountId(String accountId) {
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


  public TranscriptionAvailableCallback applicationId(String applicationId) {
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


  public TranscriptionAvailableCallback from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The provided identifier of the caller. Must be a phone number in E.164 format (e.g. +15555555555).
   * @return from
  **/
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }


  public TranscriptionAvailableCallback to(String to) {
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


  public TranscriptionAvailableCallback direction(CallDirectionEnum direction) {
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


  public TranscriptionAvailableCallback callId(String callId) {
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


  public TranscriptionAvailableCallback callUrl(URI callUrl) {
    this.callUrl = callUrl;
    return this;
  }

   /**
   * The URL of the call associated with the event.
   * @return callUrl
  **/
  @javax.annotation.Nullable
  public URI getCallUrl() {
    return callUrl;
  }

  public void setCallUrl(URI callUrl) {
    this.callUrl = callUrl;
  }


  public TranscriptionAvailableCallback mediaUrl(URI mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The URL that can be used to download the recording. Only present if the recording is finished and may be downloaded.
   * @return mediaUrl
  **/
  @javax.annotation.Nullable
  public URI getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(URI mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public TranscriptionAvailableCallback parentCallId(String parentCallId) {
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


  public TranscriptionAvailableCallback recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }

   /**
   * The unique ID of this recording
   * @return recordingId
  **/
  @javax.annotation.Nullable
  public String getRecordingId() {
    return recordingId;
  }

  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  public TranscriptionAvailableCallback enqueuedTime(OffsetDateTime enqueuedTime) {
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


  public TranscriptionAvailableCallback startTime(OffsetDateTime startTime) {
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


  public TranscriptionAvailableCallback endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The time that the recording ended in ISO-8601 format
   * @return endTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public TranscriptionAvailableCallback duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the recording in ISO-8601 format
   * @return duration
  **/
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public TranscriptionAvailableCallback fileFormat(FileFormatEnum fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Get fileFormat
   * @return fileFormat
  **/
  @javax.annotation.Nullable
  public FileFormatEnum getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(FileFormatEnum fileFormat) {
    this.fileFormat = fileFormat;
  }


  public TranscriptionAvailableCallback tag(String tag) {
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


  public TranscriptionAvailableCallback transcription(Transcription transcription) {
    this.transcription = transcription;
    return this;
  }

   /**
   * Get transcription
   * @return transcription
  **/
  @javax.annotation.Nullable
  public Transcription getTranscription() {
    return transcription;
  }

  public void setTranscription(Transcription transcription) {
    this.transcription = transcription;
  }


  public TranscriptionAvailableCallback transferCallerId(String transferCallerId) {
    this.transferCallerId = transferCallerId;
    return this;
  }

   /**
   * The phone number used as the from field of the B-leg call, in E.164 format (e.g. +15555555555).
   * @return transferCallerId
  **/
  @javax.annotation.Nullable
  public String getTransferCallerId() {
    return transferCallerId;
  }

  public void setTransferCallerId(String transferCallerId) {
    this.transferCallerId = transferCallerId;
  }


  public TranscriptionAvailableCallback transferTo(String transferTo) {
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
   * @return the TranscriptionAvailableCallback instance itself
   */
  public TranscriptionAvailableCallback putAdditionalProperty(String key, Object value) {
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
    TranscriptionAvailableCallback transcriptionAvailableCallback = (TranscriptionAvailableCallback) o;
    return Objects.equals(this.eventType, transcriptionAvailableCallback.eventType) &&
        Objects.equals(this.eventTime, transcriptionAvailableCallback.eventTime) &&
        Objects.equals(this.accountId, transcriptionAvailableCallback.accountId) &&
        Objects.equals(this.applicationId, transcriptionAvailableCallback.applicationId) &&
        Objects.equals(this.from, transcriptionAvailableCallback.from) &&
        Objects.equals(this.to, transcriptionAvailableCallback.to) &&
        Objects.equals(this.direction, transcriptionAvailableCallback.direction) &&
        Objects.equals(this.callId, transcriptionAvailableCallback.callId) &&
        Objects.equals(this.callUrl, transcriptionAvailableCallback.callUrl) &&
        Objects.equals(this.mediaUrl, transcriptionAvailableCallback.mediaUrl) &&
        Objects.equals(this.parentCallId, transcriptionAvailableCallback.parentCallId) &&
        Objects.equals(this.recordingId, transcriptionAvailableCallback.recordingId) &&
        Objects.equals(this.enqueuedTime, transcriptionAvailableCallback.enqueuedTime) &&
        Objects.equals(this.startTime, transcriptionAvailableCallback.startTime) &&
        Objects.equals(this.endTime, transcriptionAvailableCallback.endTime) &&
        Objects.equals(this.duration, transcriptionAvailableCallback.duration) &&
        Objects.equals(this.fileFormat, transcriptionAvailableCallback.fileFormat) &&
        Objects.equals(this.tag, transcriptionAvailableCallback.tag) &&
        Objects.equals(this.transcription, transcriptionAvailableCallback.transcription) &&
        Objects.equals(this.transferCallerId, transcriptionAvailableCallback.transferCallerId) &&
        Objects.equals(this.transferTo, transcriptionAvailableCallback.transferTo)&&
        Objects.equals(this.additionalProperties, transcriptionAvailableCallback.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTime, accountId, applicationId, from, to, direction, callId, callUrl, mediaUrl, parentCallId, recordingId, enqueuedTime, startTime, endTime, duration, fileFormat, tag, transcription, transferCallerId, transferTo, additionalProperties);
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
    sb.append("class TranscriptionAvailableCallback {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    callUrl: ").append(toIndentedString(callUrl)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    parentCallId: ").append(toIndentedString(parentCallId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    enqueuedTime: ").append(toIndentedString(enqueuedTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    transcription: ").append(toIndentedString(transcription)).append("\n");
    sb.append("    transferCallerId: ").append(toIndentedString(transferCallerId)).append("\n");
    sb.append("    transferTo: ").append(toIndentedString(transferTo)).append("\n");
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
    openapiFields.add("mediaUrl");
    openapiFields.add("parentCallId");
    openapiFields.add("recordingId");
    openapiFields.add("enqueuedTime");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("duration");
    openapiFields.add("fileFormat");
    openapiFields.add("tag");
    openapiFields.add("transcription");
    openapiFields.add("transferCallerId");
    openapiFields.add("transferTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TranscriptionAvailableCallback
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TranscriptionAvailableCallback.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TranscriptionAvailableCallback is not found in the empty JSON string", TranscriptionAvailableCallback.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("mediaUrl") != null && !jsonObj.get("mediaUrl").isJsonNull()) && !jsonObj.get("mediaUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaUrl").toString()));
      }
      if ((jsonObj.get("parentCallId") != null && !jsonObj.get("parentCallId").isJsonNull()) && !jsonObj.get("parentCallId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentCallId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentCallId").toString()));
      }
      if ((jsonObj.get("recordingId") != null && !jsonObj.get("recordingId").isJsonNull()) && !jsonObj.get("recordingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recordingId").toString()));
      }
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      // validate the optional field `fileFormat`
      if (jsonObj.get("fileFormat") != null && !jsonObj.get("fileFormat").isJsonNull()) {
        FileFormatEnum.validateJsonElement(jsonObj.get("fileFormat"));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      // validate the optional field `transcription`
      if (jsonObj.get("transcription") != null && !jsonObj.get("transcription").isJsonNull()) {
        Transcription.validateJsonElement(jsonObj.get("transcription"));
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
       if (!TranscriptionAvailableCallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TranscriptionAvailableCallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TranscriptionAvailableCallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TranscriptionAvailableCallback.class));

       return (TypeAdapter<T>) new TypeAdapter<TranscriptionAvailableCallback>() {
           @Override
           public void write(JsonWriter out, TranscriptionAvailableCallback value) throws IOException {
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
           public TranscriptionAvailableCallback read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TranscriptionAvailableCallback instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TranscriptionAvailableCallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TranscriptionAvailableCallback
  * @throws IOException if the JSON string is invalid with respect to TranscriptionAvailableCallback
  */
  public static TranscriptionAvailableCallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TranscriptionAvailableCallback.class);
  }

 /**
  * Convert an instance of TranscriptionAvailableCallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

