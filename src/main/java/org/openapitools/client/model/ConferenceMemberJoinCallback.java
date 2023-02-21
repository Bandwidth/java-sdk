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
 * The Conference Member Join event is fired whenever a caller joins a conference that specified a callbackUrl. The response may be either empty or a BXML document. Only the following verbs are valid for conferences: PlayAudio, SpeakSentence, StartRecording, StopRecording, PauseRecording, ResumeRecording. Audio verbs will be heard by all members of the conference. Recordings capture audio from all members who are not muted or on hold, as well as any audio verbs that are played into the conference.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T09:43:53.001100-05:00[America/New_York]")
public class ConferenceMemberJoinCallback {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private String eventTime;

  public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
  private String conferenceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public ConferenceMemberJoinCallback() {
  }

  public ConferenceMemberJoinCallback eventType(String eventType) {
    
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


  public ConferenceMemberJoinCallback eventTime(String eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * The approximate UTC date and time when the event was generated by the Bandwidth server, in ISO 8601 format. This may not be exactly the time of event execution.
   * @return eventTime
  **/
  @javax.annotation.Nullable

  public String getEventTime() {
    return eventTime;
  }


  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }


  public ConferenceMemberJoinCallback conferenceId(String conferenceId) {
    
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


  public ConferenceMemberJoinCallback name(String name) {
    
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


  public ConferenceMemberJoinCallback from(String from) {
    
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


  public ConferenceMemberJoinCallback to(String to) {
    
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


  public ConferenceMemberJoinCallback callId(String callId) {
    
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


  public ConferenceMemberJoinCallback tag(String tag) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceMemberJoinCallback conferenceMemberJoinCallback = (ConferenceMemberJoinCallback) o;
    return Objects.equals(this.eventType, conferenceMemberJoinCallback.eventType) &&
        Objects.equals(this.eventTime, conferenceMemberJoinCallback.eventTime) &&
        Objects.equals(this.conferenceId, conferenceMemberJoinCallback.conferenceId) &&
        Objects.equals(this.name, conferenceMemberJoinCallback.name) &&
        Objects.equals(this.from, conferenceMemberJoinCallback.from) &&
        Objects.equals(this.to, conferenceMemberJoinCallback.to) &&
        Objects.equals(this.callId, conferenceMemberJoinCallback.callId) &&
        Objects.equals(this.tag, conferenceMemberJoinCallback.tag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTime, conferenceId, name, from, to, callId, tag);
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
    sb.append("class ConferenceMemberJoinCallback {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
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
    openapiFields.add("eventType");
    openapiFields.add("eventTime");
    openapiFields.add("conferenceId");
    openapiFields.add("name");
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("callId");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConferenceMemberJoinCallback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConferenceMemberJoinCallback.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConferenceMemberJoinCallback is not found in the empty JSON string", ConferenceMemberJoinCallback.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConferenceMemberJoinCallback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConferenceMemberJoinCallback` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("eventTime") != null && !jsonObj.get("eventTime").isJsonNull()) && !jsonObj.get("eventTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventTime").toString()));
      }
      if ((jsonObj.get("conferenceId") != null && !jsonObj.get("conferenceId").isJsonNull()) && !jsonObj.get("conferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conferenceId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConferenceMemberJoinCallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConferenceMemberJoinCallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConferenceMemberJoinCallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConferenceMemberJoinCallback.class));

       return (TypeAdapter<T>) new TypeAdapter<ConferenceMemberJoinCallback>() {
           @Override
           public void write(JsonWriter out, ConferenceMemberJoinCallback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConferenceMemberJoinCallback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConferenceMemberJoinCallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConferenceMemberJoinCallback
  * @throws IOException if the JSON string is invalid with respect to ConferenceMemberJoinCallback
  */
  public static ConferenceMemberJoinCallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConferenceMemberJoinCallback.class);
  }

 /**
  * Convert an instance of ConferenceMemberJoinCallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

