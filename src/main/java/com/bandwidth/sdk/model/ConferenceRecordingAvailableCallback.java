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
import com.bandwidth.sdk.model.FileFormatEnum;
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
import java.util.Map.Entry;
import java.util.Set;

import com.bandwidth.sdk.JSON;

/**
 * The Conference Recording Available event is sent after a conference recording has been processed. It indicates that the recording is available for download.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T14:24:34.966664-04:00[America/New_York]")
public class ConferenceRecordingAvailableCallback {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
  private String conferenceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_RECORDING_ID = "recordingId";
  @SerializedName(SERIALIZED_NAME_RECORDING_ID)
  private String recordingId;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private Integer channels;

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

  public static final String SERIALIZED_NAME_MEDIA_URL = "mediaUrl";
  @SerializedName(SERIALIZED_NAME_MEDIA_URL)
  private URI mediaUrl;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ConferenceRecordingAvailableCallback() {
  }

  public ConferenceRecordingAvailableCallback eventType(String eventType) {
    
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


  public ConferenceRecordingAvailableCallback eventTime(OffsetDateTime eventTime) {
    
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


  public ConferenceRecordingAvailableCallback conferenceId(String conferenceId) {
    
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * The unique, Bandwidth-generated ID of the conference that was recorded
   * @return conferenceId
  **/
  @javax.annotation.Nullable
  public String getConferenceId() {
    return conferenceId;
  }


  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  public ConferenceRecordingAvailableCallback name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The user-specified name of the conference that was recorded
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConferenceRecordingAvailableCallback accountId(String accountId) {
    
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


  public ConferenceRecordingAvailableCallback recordingId(String recordingId) {
    
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


  public ConferenceRecordingAvailableCallback channels(Integer channels) {
    
    this.channels = channels;
    return this;
  }

   /**
   * Always &#x60;1&#x60; for conference recordings; multi-channel recordings are not supported on conferences.
   * @return channels
  **/
  @javax.annotation.Nullable
  public Integer getChannels() {
    return channels;
  }


  public void setChannels(Integer channels) {
    this.channels = channels;
  }


  public ConferenceRecordingAvailableCallback startTime(OffsetDateTime startTime) {
    
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


  public ConferenceRecordingAvailableCallback endTime(OffsetDateTime endTime) {
    
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


  public ConferenceRecordingAvailableCallback duration(String duration) {
    
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


  public ConferenceRecordingAvailableCallback fileFormat(FileFormatEnum fileFormat) {
    
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


  public ConferenceRecordingAvailableCallback mediaUrl(URI mediaUrl) {
    
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


  public ConferenceRecordingAvailableCallback tag(String tag) {
    
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


  public ConferenceRecordingAvailableCallback status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the process. For recording, current possible values are &#39;processing&#39;, &#39;partial&#39;, &#39;complete&#39;, &#39;deleted&#39;, and &#39;error&#39;. For transcriptions, current possible values are &#39;none&#39;, &#39;processing&#39;, &#39;available&#39;, &#39;error&#39;, &#39;timeout&#39;, &#39;file-size-too-big&#39;, and &#39;file-size-too-small&#39;. Additional states may be added in the future, so your application must be tolerant of unknown values.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
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
   * @return the ConferenceRecordingAvailableCallback instance itself
   */
  public ConferenceRecordingAvailableCallback putAdditionalProperty(String key, Object value) {
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
    ConferenceRecordingAvailableCallback conferenceRecordingAvailableCallback = (ConferenceRecordingAvailableCallback) o;
    return Objects.equals(this.eventType, conferenceRecordingAvailableCallback.eventType) &&
        Objects.equals(this.eventTime, conferenceRecordingAvailableCallback.eventTime) &&
        Objects.equals(this.conferenceId, conferenceRecordingAvailableCallback.conferenceId) &&
        Objects.equals(this.name, conferenceRecordingAvailableCallback.name) &&
        Objects.equals(this.accountId, conferenceRecordingAvailableCallback.accountId) &&
        Objects.equals(this.recordingId, conferenceRecordingAvailableCallback.recordingId) &&
        Objects.equals(this.channels, conferenceRecordingAvailableCallback.channels) &&
        Objects.equals(this.startTime, conferenceRecordingAvailableCallback.startTime) &&
        Objects.equals(this.endTime, conferenceRecordingAvailableCallback.endTime) &&
        Objects.equals(this.duration, conferenceRecordingAvailableCallback.duration) &&
        Objects.equals(this.fileFormat, conferenceRecordingAvailableCallback.fileFormat) &&
        Objects.equals(this.mediaUrl, conferenceRecordingAvailableCallback.mediaUrl) &&
        Objects.equals(this.tag, conferenceRecordingAvailableCallback.tag) &&
        Objects.equals(this.status, conferenceRecordingAvailableCallback.status)&&
        Objects.equals(this.additionalProperties, conferenceRecordingAvailableCallback.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTime, conferenceId, name, accountId, recordingId, channels, startTime, endTime, duration, fileFormat, mediaUrl, tag, status, additionalProperties);
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
    sb.append("class ConferenceRecordingAvailableCallback {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("conferenceId");
    openapiFields.add("name");
    openapiFields.add("accountId");
    openapiFields.add("recordingId");
    openapiFields.add("channels");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("duration");
    openapiFields.add("fileFormat");
    openapiFields.add("mediaUrl");
    openapiFields.add("tag");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConferenceRecordingAvailableCallback
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConferenceRecordingAvailableCallback.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConferenceRecordingAvailableCallback is not found in the empty JSON string", ConferenceRecordingAvailableCallback.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("conferenceId") != null && !jsonObj.get("conferenceId").isJsonNull()) && !jsonObj.get("conferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conferenceId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("recordingId") != null && !jsonObj.get("recordingId").isJsonNull()) && !jsonObj.get("recordingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recordingId").toString()));
      }
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      if ((jsonObj.get("mediaUrl") != null && !jsonObj.get("mediaUrl").isJsonNull()) && !jsonObj.get("mediaUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaUrl").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConferenceRecordingAvailableCallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConferenceRecordingAvailableCallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConferenceRecordingAvailableCallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConferenceRecordingAvailableCallback.class));

       return (TypeAdapter<T>) new TypeAdapter<ConferenceRecordingAvailableCallback>() {
           @Override
           public void write(JsonWriter out, ConferenceRecordingAvailableCallback value) throws IOException {
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
           public ConferenceRecordingAvailableCallback read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ConferenceRecordingAvailableCallback instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConferenceRecordingAvailableCallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConferenceRecordingAvailableCallback
  * @throws IOException if the JSON string is invalid with respect to ConferenceRecordingAvailableCallback
  */
  public static ConferenceRecordingAvailableCallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConferenceRecordingAvailableCallback.class);
  }

 /**
  * Convert an instance of ConferenceRecordingAvailableCallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

