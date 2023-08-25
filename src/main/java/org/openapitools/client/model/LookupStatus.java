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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.LookupResult;
import org.openapitools.client.model.LookupStatusEnum;

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

import org.openapitools.client.JSON;

/**
 * If requestId exists, the result for that request is returned. See the Examples for details on the various responses that you can receive. Generally, if you see a Response Code of 0 in a result for a TN, information will be available for it.  Any other Response Code will indicate no information was available for the TN.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T14:55:39.427023-04:00[America/New_York]")
public class LookupStatus {
  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LookupStatusEnum status;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<LookupResult> result;

  public static final String SERIALIZED_NAME_FAILED_TELEPHONE_NUMBERS = "failedTelephoneNumbers";
  @SerializedName(SERIALIZED_NAME_FAILED_TELEPHONE_NUMBERS)
  private List<String> failedTelephoneNumbers;

  public LookupStatus() {
  }

  public LookupStatus requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * The requestId.
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public LookupStatus status(LookupStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public LookupStatusEnum getStatus() {
    return status;
  }


  public void setStatus(LookupStatusEnum status) {
    this.status = status;
  }


  public LookupStatus result(List<LookupResult> result) {
    
    this.result = result;
    return this;
  }

  public LookupStatus addResultItem(LookupResult resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * The carrier information results for the specified telephone number.
   * @return result
  **/
  @javax.annotation.Nullable
  public List<LookupResult> getResult() {
    return result;
  }


  public void setResult(List<LookupResult> result) {
    this.result = result;
  }


  public LookupStatus failedTelephoneNumbers(List<String> failedTelephoneNumbers) {
    
    this.failedTelephoneNumbers = failedTelephoneNumbers;
    return this;
  }

  public LookupStatus addFailedTelephoneNumbersItem(String failedTelephoneNumbersItem) {
    if (this.failedTelephoneNumbers == null) {
      this.failedTelephoneNumbers = new ArrayList<>();
    }
    this.failedTelephoneNumbers.add(failedTelephoneNumbersItem);
    return this;
  }

   /**
   * The telephone numbers whose lookup failed.
   * @return failedTelephoneNumbers
  **/
  @javax.annotation.Nullable
  public List<String> getFailedTelephoneNumbers() {
    return failedTelephoneNumbers;
  }


  public void setFailedTelephoneNumbers(List<String> failedTelephoneNumbers) {
    this.failedTelephoneNumbers = failedTelephoneNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupStatus lookupStatus = (LookupStatus) o;
    return Objects.equals(this.requestId, lookupStatus.requestId) &&
        Objects.equals(this.status, lookupStatus.status) &&
        Objects.equals(this.result, lookupStatus.result) &&
        Objects.equals(this.failedTelephoneNumbers, lookupStatus.failedTelephoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, status, result, failedTelephoneNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupStatus {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    failedTelephoneNumbers: ").append(toIndentedString(failedTelephoneNumbers)).append("\n");
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
    openapiFields.add("requestId");
    openapiFields.add("status");
    openapiFields.add("result");
    openapiFields.add("failedTelephoneNumbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LookupStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LookupStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookupStatus is not found in the empty JSON string", LookupStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LookupStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LookupStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            LookupResult.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failedTelephoneNumbers") != null && !jsonObj.get("failedTelephoneNumbers").isJsonNull() && !jsonObj.get("failedTelephoneNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failedTelephoneNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("failedTelephoneNumbers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookupStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookupStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookupStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookupStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<LookupStatus>() {
           @Override
           public void write(JsonWriter out, LookupStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LookupStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LookupStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LookupStatus
  * @throws IOException if the JSON string is invalid with respect to LookupStatus
  */
  public static LookupStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookupStatus.class);
  }

 /**
  * Convert an instance of LookupStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

