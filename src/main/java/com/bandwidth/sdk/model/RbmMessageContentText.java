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
import com.bandwidth.sdk.model.MultiChannelAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * RbmMessageContentText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RbmMessageContentText {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  @javax.annotation.Nonnull
  private String text;

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  @javax.annotation.Nullable
  private List<MultiChannelAction> suggestions = new ArrayList<>();

  public RbmMessageContentText() {
  }

  public RbmMessageContentText text(@javax.annotation.Nonnull String text) {
    this.text = text;
    return this;
  }

  /**
   * The text associated with the message. Must be 3270 characters or less
   * @return text
   */
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(@javax.annotation.Nonnull String text) {
    this.text = text;
  }


  public RbmMessageContentText suggestions(@javax.annotation.Nullable List<MultiChannelAction> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public RbmMessageContentText addSuggestionsItem(MultiChannelAction suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

  /**
   * An array of suggested actions for the recipient.
   * @return suggestions
   */
  @javax.annotation.Nullable
  public List<MultiChannelAction> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(@javax.annotation.Nullable List<MultiChannelAction> suggestions) {
    this.suggestions = suggestions;
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
   * @return the RbmMessageContentText instance itself
   */
  public RbmMessageContentText putAdditionalProperty(String key, Object value) {
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
    RbmMessageContentText rbmMessageContentText = (RbmMessageContentText) o;
    return Objects.equals(this.text, rbmMessageContentText.text) &&
        Objects.equals(this.suggestions, rbmMessageContentText.suggestions)&&
        Objects.equals(this.additionalProperties, rbmMessageContentText.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, suggestions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RbmMessageContentText {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("suggestions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("text");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RbmMessageContentText
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RbmMessageContentText.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RbmMessageContentText is not found in the empty JSON string", RbmMessageContentText.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RbmMessageContentText.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (jsonObj.get("suggestions") != null && !jsonObj.get("suggestions").isJsonNull()) {
        JsonArray jsonArraysuggestions = jsonObj.getAsJsonArray("suggestions");
        if (jsonArraysuggestions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("suggestions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `suggestions` to be an array in the JSON string but got `%s`", jsonObj.get("suggestions").toString()));
          }

          // validate the optional field `suggestions` (array)
          for (int i = 0; i < jsonArraysuggestions.size(); i++) {
            MultiChannelAction.validateJsonElement(jsonArraysuggestions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RbmMessageContentText.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RbmMessageContentText' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RbmMessageContentText> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RbmMessageContentText.class));

       return (TypeAdapter<T>) new TypeAdapter<RbmMessageContentText>() {
           @Override
           public void write(JsonWriter out, RbmMessageContentText value) throws IOException {
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
           public RbmMessageContentText read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RbmMessageContentText instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RbmMessageContentText given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RbmMessageContentText
   * @throws IOException if the JSON string is invalid with respect to RbmMessageContentText
   */
  public static RbmMessageContentText fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RbmMessageContentText.class);
  }

  /**
   * Convert an instance of RbmMessageContentText to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

