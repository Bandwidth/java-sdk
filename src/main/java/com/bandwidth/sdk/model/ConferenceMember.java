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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ConferenceMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class ConferenceMember {
  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
  private String conferenceId;

  public static final String SERIALIZED_NAME_MEMBER_URL = "memberUrl";
  @SerializedName(SERIALIZED_NAME_MEMBER_URL)
  private URI memberUrl;

  public static final String SERIALIZED_NAME_MUTE = "mute";
  @SerializedName(SERIALIZED_NAME_MUTE)
  private Boolean mute;

  public static final String SERIALIZED_NAME_HOLD = "hold";
  @SerializedName(SERIALIZED_NAME_HOLD)
  private Boolean hold;

  public static final String SERIALIZED_NAME_CALL_IDS_TO_COACH = "callIdsToCoach";
  @SerializedName(SERIALIZED_NAME_CALL_IDS_TO_COACH)
  private List<String> callIdsToCoach;

  public ConferenceMember() {
  }

  public ConferenceMember callId(String callId) {
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


  public ConferenceMember conferenceId(String conferenceId) {
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


  public ConferenceMember memberUrl(URI memberUrl) {
    this.memberUrl = memberUrl;
    return this;
  }

   /**
   * A URL that may be used to retrieve information about or update the state of this conference member. This is the URL of this member&#39;s [Get Conference Member](/apis/voice/#operation/getConferenceMember) endpoint and [Modify Conference Member](/apis/voice/#operation/updateConferenceMember) endpoint.
   * @return memberUrl
  **/
  @javax.annotation.Nullable
  public URI getMemberUrl() {
    return memberUrl;
  }

  public void setMemberUrl(URI memberUrl) {
    this.memberUrl = memberUrl;
  }


  public ConferenceMember mute(Boolean mute) {
    this.mute = mute;
    return this;
  }

   /**
   * Whether or not this member is currently muted. Members who are muted are still able to hear other participants.  If used in a PUT request, updates this member&#39;s mute status. Has no effect if omitted.
   * @return mute
  **/
  @javax.annotation.Nullable
  public Boolean getMute() {
    return mute;
  }

  public void setMute(Boolean mute) {
    this.mute = mute;
  }


  public ConferenceMember hold(Boolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Whether or not this member is currently on hold. Members who are on hold are not able to hear or speak in the conference.  If used in a PUT request, updates this member&#39;s hold status. Has no effect if omitted.
   * @return hold
  **/
  @javax.annotation.Nullable
  public Boolean getHold() {
    return hold;
  }

  public void setHold(Boolean hold) {
    this.hold = hold;
  }


  public ConferenceMember callIdsToCoach(List<String> callIdsToCoach) {
    this.callIdsToCoach = callIdsToCoach;
    return this;
  }

  public ConferenceMember addCallIdsToCoachItem(String callIdsToCoachItem) {
    if (this.callIdsToCoach == null) {
      this.callIdsToCoach = new ArrayList<>();
    }
    this.callIdsToCoach.add(callIdsToCoachItem);
    return this;
  }

   /**
   * If this member had a value set for &#x60;callIdsToCoach&#x60; in its [Conference](/docs/voice/bxml/conference) verb or this list was added with a previous PUT request to modify the member, this is that list of calls.  If present in a PUT request, modifies the calls that this member is coaching. Has no effect if omitted. See the documentation for the [Conference](/docs/voice/bxml/conference) verb for more details about coaching. Note that this will not add the matching calls to the conference; each call must individually execute a Conference verb to join.
   * @return callIdsToCoach
  **/
  @javax.annotation.Nullable
  public List<String> getCallIdsToCoach() {
    return callIdsToCoach;
  }

  public void setCallIdsToCoach(List<String> callIdsToCoach) {
    this.callIdsToCoach = callIdsToCoach;
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
   * @return the ConferenceMember instance itself
   */
  public ConferenceMember putAdditionalProperty(String key, Object value) {
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
    ConferenceMember conferenceMember = (ConferenceMember) o;
    return Objects.equals(this.callId, conferenceMember.callId) &&
        Objects.equals(this.conferenceId, conferenceMember.conferenceId) &&
        Objects.equals(this.memberUrl, conferenceMember.memberUrl) &&
        Objects.equals(this.mute, conferenceMember.mute) &&
        Objects.equals(this.hold, conferenceMember.hold) &&
        Objects.equals(this.callIdsToCoach, conferenceMember.callIdsToCoach)&&
        Objects.equals(this.additionalProperties, conferenceMember.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callId, conferenceId, memberUrl, mute, hold, callIdsToCoach, additionalProperties);
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
    sb.append("class ConferenceMember {\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    memberUrl: ").append(toIndentedString(memberUrl)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    callIdsToCoach: ").append(toIndentedString(callIdsToCoach)).append("\n");
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
    openapiFields.add("callId");
    openapiFields.add("conferenceId");
    openapiFields.add("memberUrl");
    openapiFields.add("mute");
    openapiFields.add("hold");
    openapiFields.add("callIdsToCoach");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConferenceMember
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConferenceMember.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConferenceMember is not found in the empty JSON string", ConferenceMember.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("callId") != null && !jsonObj.get("callId").isJsonNull()) && !jsonObj.get("callId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callId").toString()));
      }
      if ((jsonObj.get("conferenceId") != null && !jsonObj.get("conferenceId").isJsonNull()) && !jsonObj.get("conferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conferenceId").toString()));
      }
      if ((jsonObj.get("memberUrl") != null && !jsonObj.get("memberUrl").isJsonNull()) && !jsonObj.get("memberUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memberUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memberUrl").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("callIdsToCoach") != null && !jsonObj.get("callIdsToCoach").isJsonNull() && !jsonObj.get("callIdsToCoach").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callIdsToCoach` to be an array in the JSON string but got `%s`", jsonObj.get("callIdsToCoach").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConferenceMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConferenceMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConferenceMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConferenceMember.class));

       return (TypeAdapter<T>) new TypeAdapter<ConferenceMember>() {
           @Override
           public void write(JsonWriter out, ConferenceMember value) throws IOException {
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
           public ConferenceMember read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ConferenceMember instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConferenceMember given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConferenceMember
  * @throws IOException if the JSON string is invalid with respect to ConferenceMember
  */
  public static ConferenceMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConferenceMember.class);
  }

 /**
  * Convert an instance of ConferenceMember to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

