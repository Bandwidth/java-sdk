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
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UpdateConferenceMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-27T11:08:51.953012-04:00[America/New_York]")
public class UpdateConferenceMember {
  public static final String SERIALIZED_NAME_MUTE = "mute";
  @SerializedName(SERIALIZED_NAME_MUTE)
  private Boolean mute;

  public static final String SERIALIZED_NAME_HOLD = "hold";
  @SerializedName(SERIALIZED_NAME_HOLD)
  private Boolean hold;

  public static final String SERIALIZED_NAME_CALL_IDS_TO_COACH = "callIdsToCoach";
  @SerializedName(SERIALIZED_NAME_CALL_IDS_TO_COACH)
  private List<String> callIdsToCoach = null;

  public UpdateConferenceMember() {
  }

  public UpdateConferenceMember mute(Boolean mute) {
    
    this.mute = mute;
    return this;
  }

   /**
   * Whether or not this member is currently muted. Members who are muted are still able to hear other participants.  Updates this member&#39;s mute status. Has no effect if omitted.
   * @return mute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not this member is currently muted. Members who are muted are still able to hear other participants.  Updates this member's mute status. Has no effect if omitted.")

  public Boolean getMute() {
    return mute;
  }


  public void setMute(Boolean mute) {
    this.mute = mute;
  }


  public UpdateConferenceMember hold(Boolean hold) {
    
    this.hold = hold;
    return this;
  }

   /**
   * Whether or not this member is currently on hold. Members who are on hold are not able to hear or speak in the conference.  Updates this member&#39;s hold status. Has no effect if omitted.
   * @return hold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not this member is currently on hold. Members who are on hold are not able to hear or speak in the conference.  Updates this member's hold status. Has no effect if omitted.")

  public Boolean getHold() {
    return hold;
  }


  public void setHold(Boolean hold) {
    this.hold = hold;
  }


  public UpdateConferenceMember callIdsToCoach(List<String> callIdsToCoach) {
    
    this.callIdsToCoach = callIdsToCoach;
    return this;
  }

  public UpdateConferenceMember addCallIdsToCoachItem(String callIdsToCoachItem) {
    if (this.callIdsToCoach == null) {
      this.callIdsToCoach = new ArrayList<>();
    }
    this.callIdsToCoach.add(callIdsToCoachItem);
    return this;
  }

   /**
   * If this member had a value set for &#x60;callIdsToCoach&#x60; in its [Conference](/docs/voice/bxml/conference) verb or this list was added with a previous PUT request to modify the member, this is that list of calls.  Modifies the calls that this member is coaching. Has no effect if omitted. See the documentation for the [Conference](/docs/voice/bxml/conference) verb for more details about coaching.  Note that this will not add the matching calls to the conference; each call must individually execute a Conference verb to join.
   * @return callIdsToCoach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"c-25ac29a2-1331029c-2cb0-4a07-b215-b22865662d85\"]", value = "If this member had a value set for `callIdsToCoach` in its [Conference](/docs/voice/bxml/conference) verb or this list was added with a previous PUT request to modify the member, this is that list of calls.  Modifies the calls that this member is coaching. Has no effect if omitted. See the documentation for the [Conference](/docs/voice/bxml/conference) verb for more details about coaching.  Note that this will not add the matching calls to the conference; each call must individually execute a Conference verb to join.")

  public List<String> getCallIdsToCoach() {
    return callIdsToCoach;
  }


  public void setCallIdsToCoach(List<String> callIdsToCoach) {
    this.callIdsToCoach = callIdsToCoach;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConferenceMember updateConferenceMember = (UpdateConferenceMember) o;
    return Objects.equals(this.mute, updateConferenceMember.mute) &&
        Objects.equals(this.hold, updateConferenceMember.hold) &&
        Objects.equals(this.callIdsToCoach, updateConferenceMember.callIdsToCoach);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mute, hold, callIdsToCoach);
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
    sb.append("class UpdateConferenceMember {\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    callIdsToCoach: ").append(toIndentedString(callIdsToCoach)).append("\n");
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
    openapiFields.add("mute");
    openapiFields.add("hold");
    openapiFields.add("callIdsToCoach");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateConferenceMember
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateConferenceMember.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateConferenceMember is not found in the empty JSON string", UpdateConferenceMember.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateConferenceMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateConferenceMember` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("callIdsToCoach") != null && !jsonObj.get("callIdsToCoach").isJsonNull()) && !jsonObj.get("callIdsToCoach").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callIdsToCoach` to be an array in the JSON string but got `%s`", jsonObj.get("callIdsToCoach").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateConferenceMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateConferenceMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateConferenceMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateConferenceMember.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateConferenceMember>() {
           @Override
           public void write(JsonWriter out, UpdateConferenceMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateConferenceMember read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateConferenceMember given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateConferenceMember
  * @throws IOException if the JSON string is invalid with respect to UpdateConferenceMember
  */
  public static UpdateConferenceMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateConferenceMember.class);
  }

 /**
  * Convert an instance of UpdateConferenceMember to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

