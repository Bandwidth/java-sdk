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
import com.bandwidth.sdk.model.MessageDirectionEnum;
import com.bandwidth.sdk.model.PriorityEnum;
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * Message Failed Callback Message Schema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class MessageFailedCallbackMessage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  @javax.annotation.Nonnull
  private String owner;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  @javax.annotation.Nonnull
  private String applicationId;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  @javax.annotation.Nonnull
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_SEGMENT_COUNT = "segmentCount";
  @SerializedName(SERIALIZED_NAME_SEGMENT_COUNT)
  @javax.annotation.Nonnull
  private Integer segmentCount;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  @javax.annotation.Nonnull
  private MessageDirectionEnum direction;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  @javax.annotation.Nonnull
  private Set<String> to = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  @javax.annotation.Nonnull
  private String from;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  @javax.annotation.Nonnull
  private String text;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  @javax.annotation.Nonnull
  private String tag;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  @javax.annotation.Nullable
  private List<URI> media = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  @javax.annotation.Nullable
  private PriorityEnum priority;

  public MessageFailedCallbackMessage() {
  }

  public MessageFailedCallbackMessage id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public MessageFailedCallbackMessage owner(@javax.annotation.Nonnull String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nonnull
  public String getOwner() {
    return owner;
  }

  public void setOwner(@javax.annotation.Nonnull String owner) {
    this.owner = owner;
  }


  public MessageFailedCallbackMessage applicationId(@javax.annotation.Nonnull String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
   */
  @javax.annotation.Nonnull
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@javax.annotation.Nonnull String applicationId) {
    this.applicationId = applicationId;
  }


  public MessageFailedCallbackMessage time(@javax.annotation.Nonnull OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(@javax.annotation.Nonnull OffsetDateTime time) {
    this.time = time;
  }


  public MessageFailedCallbackMessage segmentCount(@javax.annotation.Nonnull Integer segmentCount) {
    this.segmentCount = segmentCount;
    return this;
  }

  /**
   * Get segmentCount
   * @return segmentCount
   */
  @javax.annotation.Nonnull
  public Integer getSegmentCount() {
    return segmentCount;
  }

  public void setSegmentCount(@javax.annotation.Nonnull Integer segmentCount) {
    this.segmentCount = segmentCount;
  }


  public MessageFailedCallbackMessage direction(@javax.annotation.Nonnull MessageDirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @javax.annotation.Nonnull
  public MessageDirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(@javax.annotation.Nonnull MessageDirectionEnum direction) {
    this.direction = direction;
  }


  public MessageFailedCallbackMessage to(@javax.annotation.Nonnull Set<String> to) {
    this.to = to;
    return this;
  }

  public MessageFailedCallbackMessage addToItem(String toItem) {
    if (this.to == null) {
      this.to = new LinkedHashSet<>();
    }
    this.to.add(toItem);
    return this;
  }

  /**
   * Get to
   * @return to
   */
  @javax.annotation.Nonnull
  public Set<String> getTo() {
    return to;
  }

  public void setTo(@javax.annotation.Nonnull Set<String> to) {
    this.to = to;
  }


  public MessageFailedCallbackMessage from(@javax.annotation.Nonnull String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   */
  @javax.annotation.Nonnull
  public String getFrom() {
    return from;
  }

  public void setFrom(@javax.annotation.Nonnull String from) {
    this.from = from;
  }


  public MessageFailedCallbackMessage text(@javax.annotation.Nonnull String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(@javax.annotation.Nonnull String text) {
    this.text = text;
  }


  public MessageFailedCallbackMessage tag(@javax.annotation.Nonnull String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @javax.annotation.Nonnull
  public String getTag() {
    return tag;
  }

  public void setTag(@javax.annotation.Nonnull String tag) {
    this.tag = tag;
  }


  public MessageFailedCallbackMessage media(@javax.annotation.Nullable List<URI> media) {
    this.media = media;
    return this;
  }

  public MessageFailedCallbackMessage addMediaItem(URI mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @javax.annotation.Nullable
  public List<URI> getMedia() {
    return media;
  }

  public void setMedia(@javax.annotation.Nullable List<URI> media) {
    this.media = media;
  }


  public MessageFailedCallbackMessage priority(@javax.annotation.Nullable PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nullable
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(@javax.annotation.Nullable PriorityEnum priority) {
    this.priority = priority;
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
   * @return the MessageFailedCallbackMessage instance itself
   */
  public MessageFailedCallbackMessage putAdditionalProperty(String key, Object value) {
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
    MessageFailedCallbackMessage messageFailedCallbackMessage = (MessageFailedCallbackMessage) o;
    return Objects.equals(this.id, messageFailedCallbackMessage.id) &&
        Objects.equals(this.owner, messageFailedCallbackMessage.owner) &&
        Objects.equals(this.applicationId, messageFailedCallbackMessage.applicationId) &&
        Objects.equals(this.time, messageFailedCallbackMessage.time) &&
        Objects.equals(this.segmentCount, messageFailedCallbackMessage.segmentCount) &&
        Objects.equals(this.direction, messageFailedCallbackMessage.direction) &&
        Objects.equals(this.to, messageFailedCallbackMessage.to) &&
        Objects.equals(this.from, messageFailedCallbackMessage.from) &&
        Objects.equals(this.text, messageFailedCallbackMessage.text) &&
        Objects.equals(this.tag, messageFailedCallbackMessage.tag) &&
        Objects.equals(this.media, messageFailedCallbackMessage.media) &&
        Objects.equals(this.priority, messageFailedCallbackMessage.priority)&&
        Objects.equals(this.additionalProperties, messageFailedCallbackMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, applicationId, time, segmentCount, direction, to, from, text, tag, media, priority, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageFailedCallbackMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    segmentCount: ").append(toIndentedString(segmentCount)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
    openapiFields.add("owner");
    openapiFields.add("applicationId");
    openapiFields.add("time");
    openapiFields.add("segmentCount");
    openapiFields.add("direction");
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("text");
    openapiFields.add("tag");
    openapiFields.add("media");
    openapiFields.add("priority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("owner");
    openapiRequiredFields.add("applicationId");
    openapiRequiredFields.add("time");
    openapiRequiredFields.add("segmentCount");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("tag");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MessageFailedCallbackMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessageFailedCallbackMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageFailedCallbackMessage is not found in the empty JSON string", MessageFailedCallbackMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageFailedCallbackMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if (!jsonObj.get("applicationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationId").toString()));
      }
      // validate the required field `direction`
      MessageDirectionEnum.validateJsonElement(jsonObj.get("direction"));
      // ensure the required json array is present
      if (jsonObj.get("to") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be an array in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (!jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("media") != null && !jsonObj.get("media").isJsonNull() && !jsonObj.get("media").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `media` to be an array in the JSON string but got `%s`", jsonObj.get("media").toString()));
      }
      // validate the optional field `priority`
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) {
        PriorityEnum.validateJsonElement(jsonObj.get("priority"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageFailedCallbackMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageFailedCallbackMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageFailedCallbackMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageFailedCallbackMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageFailedCallbackMessage>() {
           @Override
           public void write(JsonWriter out, MessageFailedCallbackMessage value) throws IOException {
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
           public MessageFailedCallbackMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MessageFailedCallbackMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of MessageFailedCallbackMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MessageFailedCallbackMessage
   * @throws IOException if the JSON string is invalid with respect to MessageFailedCallbackMessage
   */
  public static MessageFailedCallbackMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageFailedCallbackMessage.class);
  }

  /**
   * Convert an instance of MessageFailedCallbackMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

