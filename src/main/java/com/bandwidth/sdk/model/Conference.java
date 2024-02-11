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
import com.bandwidth.sdk.model.CallbackMethodEnum;
import com.bandwidth.sdk.model.ConferenceMember;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * Conference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Conference {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_TIME = "createdTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_COMPLETED_TIME = "completedTime";
  @SerializedName(SERIALIZED_NAME_COMPLETED_TIME)
  private OffsetDateTime completedTime;

  public static final String SERIALIZED_NAME_CONFERENCE_EVENT_URL = "conferenceEventUrl";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_EVENT_URL)
  private URI conferenceEventUrl;

  public static final String SERIALIZED_NAME_CONFERENCE_EVENT_METHOD = "conferenceEventMethod";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_EVENT_METHOD)
  private CallbackMethodEnum conferenceEventMethod = CallbackMethodEnum.POST;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_ACTIVE_MEMBERS = "activeMembers";
  @SerializedName(SERIALIZED_NAME_ACTIVE_MEMBERS)
  private List<ConferenceMember> activeMembers;

  public Conference() {
  }

  public Conference id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Bandwidth-generated conference ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Conference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the conference, as specified by your application.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Conference createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * The time the conference was initiated, in ISO 8601 format.
   * @return createdTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public Conference completedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
    return this;
  }

   /**
   * The time the conference was terminated, in ISO 8601 format.
   * @return completedTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }


  public Conference conferenceEventUrl(URI conferenceEventUrl) {
    this.conferenceEventUrl = conferenceEventUrl;
    return this;
  }

   /**
   * The URL to send the conference-related events.
   * @return conferenceEventUrl
  **/
  @javax.annotation.Nullable
  public URI getConferenceEventUrl() {
    return conferenceEventUrl;
  }

  public void setConferenceEventUrl(URI conferenceEventUrl) {
    this.conferenceEventUrl = conferenceEventUrl;
  }


  public Conference conferenceEventMethod(CallbackMethodEnum conferenceEventMethod) {
    this.conferenceEventMethod = conferenceEventMethod;
    return this;
  }

   /**
   * Get conferenceEventMethod
   * @return conferenceEventMethod
  **/
  @javax.annotation.Nullable
  public CallbackMethodEnum getConferenceEventMethod() {
    return conferenceEventMethod;
  }

  public void setConferenceEventMethod(CallbackMethodEnum conferenceEventMethod) {
    this.conferenceEventMethod = conferenceEventMethod;
  }


  public Conference tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The custom string attached to the conference that will be sent with callbacks.
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public Conference activeMembers(List<ConferenceMember> activeMembers) {
    this.activeMembers = activeMembers;
    return this;
  }

  public Conference addActiveMembersItem(ConferenceMember activeMembersItem) {
    if (this.activeMembers == null) {
      this.activeMembers = new ArrayList<>();
    }
    this.activeMembers.add(activeMembersItem);
    return this;
  }

   /**
   * A list of active members of the conference. Omitted if this is a response to the [Get Conferences endpoint](/apis/voice#tag/Conferences/operation/listConferences).
   * @return activeMembers
  **/
  @javax.annotation.Nullable
  public List<ConferenceMember> getActiveMembers() {
    return activeMembers;
  }

  public void setActiveMembers(List<ConferenceMember> activeMembers) {
    this.activeMembers = activeMembers;
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
   * @return the Conference instance itself
   */
  public Conference putAdditionalProperty(String key, Object value) {
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
    Conference conference = (Conference) o;
    return Objects.equals(this.id, conference.id) &&
        Objects.equals(this.name, conference.name) &&
        Objects.equals(this.createdTime, conference.createdTime) &&
        Objects.equals(this.completedTime, conference.completedTime) &&
        Objects.equals(this.conferenceEventUrl, conference.conferenceEventUrl) &&
        Objects.equals(this.conferenceEventMethod, conference.conferenceEventMethod) &&
        Objects.equals(this.tag, conference.tag) &&
        Objects.equals(this.activeMembers, conference.activeMembers)&&
        Objects.equals(this.additionalProperties, conference.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdTime, completedTime, conferenceEventUrl, conferenceEventMethod, tag, activeMembers, additionalProperties);
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
    sb.append("class Conference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    conferenceEventUrl: ").append(toIndentedString(conferenceEventUrl)).append("\n");
    sb.append("    conferenceEventMethod: ").append(toIndentedString(conferenceEventMethod)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    activeMembers: ").append(toIndentedString(activeMembers)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("createdTime");
    openapiFields.add("completedTime");
    openapiFields.add("conferenceEventUrl");
    openapiFields.add("conferenceEventMethod");
    openapiFields.add("tag");
    openapiFields.add("activeMembers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Conference
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Conference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Conference is not found in the empty JSON string", Conference.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("conferenceEventUrl") != null && !jsonObj.get("conferenceEventUrl").isJsonNull()) && !jsonObj.get("conferenceEventUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conferenceEventUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conferenceEventUrl").toString()));
      }
      // validate the optional field `conferenceEventMethod`
      if (jsonObj.get("conferenceEventMethod") != null && !jsonObj.get("conferenceEventMethod").isJsonNull()) {
        CallbackMethodEnum.validateJsonElement(jsonObj.get("conferenceEventMethod"));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if (jsonObj.get("activeMembers") != null && !jsonObj.get("activeMembers").isJsonNull()) {
        JsonArray jsonArrayactiveMembers = jsonObj.getAsJsonArray("activeMembers");
        if (jsonArrayactiveMembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("activeMembers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `activeMembers` to be an array in the JSON string but got `%s`", jsonObj.get("activeMembers").toString()));
          }

          // validate the optional field `activeMembers` (array)
          for (int i = 0; i < jsonArrayactiveMembers.size(); i++) {
            ConferenceMember.validateJsonElement(jsonArrayactiveMembers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Conference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Conference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Conference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Conference.class));

       return (TypeAdapter<T>) new TypeAdapter<Conference>() {
           @Override
           public void write(JsonWriter out, Conference value) throws IOException {
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
           public Conference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Conference instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Conference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Conference
  * @throws IOException if the JSON string is invalid with respect to Conference
  */
  public static Conference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Conference.class);
  }

 /**
  * Convert an instance of Conference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

