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
 * Create phone number lookup request.
 */
@ApiModel(description = "Create phone number lookup request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T08:49:31.529519-04:00[America/New_York]")
public class LookupRequest {
  public static final String SERIALIZED_NAME_TNS = "tns";
  @SerializedName(SERIALIZED_NAME_TNS)
  private List<String> tns = new ArrayList<>();

  public LookupRequest() {
  }

  public LookupRequest tns(List<String> tns) {
    
    this.tns = tns;
    return this;
  }

  public LookupRequest addTnsItem(String tnsItem) {
    this.tns.add(tnsItem);
    return this;
  }

   /**
   * Get tns
   * @return tns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTns() {
    return tns;
  }


  public void setTns(List<String> tns) {
    this.tns = tns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupRequest lookupRequest = (LookupRequest) o;
    return Objects.equals(this.tns, lookupRequest.tns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupRequest {\n");
    sb.append("    tns: ").append(toIndentedString(tns)).append("\n");
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
    openapiFields.add("tns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LookupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LookupRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookupRequest is not found in the empty JSON string", LookupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LookupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LookupRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LookupRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("tns") != null && !jsonObj.get("tns").isJsonNull()) && !jsonObj.get("tns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tns` to be an array in the JSON string but got `%s`", jsonObj.get("tns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LookupRequest>() {
           @Override
           public void write(JsonWriter out, LookupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LookupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LookupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LookupRequest
  * @throws IOException if the JSON string is invalid with respect to LookupRequest
  */
  public static LookupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookupRequest.class);
  }

 /**
  * Convert an instance of LookupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

