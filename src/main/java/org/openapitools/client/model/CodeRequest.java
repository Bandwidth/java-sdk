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
 * CodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T09:43:53.001100-05:00[America/New_York]")
public class CodeRequest {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DIGITS = "digits";
  @SerializedName(SERIALIZED_NAME_DIGITS)
  private Integer digits;

  public CodeRequest() {
  }

  public CodeRequest to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The phone number to send the mfa code to.
   * @return to
  **/
  @javax.annotation.Nonnull

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public CodeRequest from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The application phone number, the sender of the mfa code.
   * @return from
  **/
  @javax.annotation.Nonnull

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public CodeRequest applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The application unique ID, obtained from Bandwidth.
   * @return applicationId
  **/
  @javax.annotation.Nonnull

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public CodeRequest scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * An optional field to denote what scope or action the mfa code is addressing.  If not supplied, defaults to \&quot;2FA\&quot;.
   * @return scope
  **/
  @javax.annotation.Nullable

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public CodeRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The message format of the mfa code.  There are three values that the system will replace \&quot;{CODE}\&quot;, \&quot;{NAME}\&quot;, \&quot;{SCOPE}\&quot;.  The \&quot;{SCOPE}\&quot; and \&quot;{NAME} value template are optional, while \&quot;{CODE}\&quot; must be supplied.  As the name would suggest, code will be replace with the actual mfa code.  Name is replaced with the application name, configured during provisioning of mfa.  The scope value is the same value sent during the call and partitioned by the server.
   * @return message
  **/
  @javax.annotation.Nonnull

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CodeRequest digits(Integer digits) {
    
    this.digits = digits;
    return this;
  }

   /**
   * The number of digits for your mfa code.  The valid number ranges from 2 to 8, inclusively.
   * minimum: 4
   * maximum: 8
   * @return digits
  **/
  @javax.annotation.Nonnull

  public Integer getDigits() {
    return digits;
  }


  public void setDigits(Integer digits) {
    this.digits = digits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeRequest codeRequest = (CodeRequest) o;
    return Objects.equals(this.to, codeRequest.to) &&
        Objects.equals(this.from, codeRequest.from) &&
        Objects.equals(this.applicationId, codeRequest.applicationId) &&
        Objects.equals(this.scope, codeRequest.scope) &&
        Objects.equals(this.message, codeRequest.message) &&
        Objects.equals(this.digits, codeRequest.digits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, applicationId, scope, message, digits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeRequest {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
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
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("applicationId");
    openapiFields.add("scope");
    openapiFields.add("message");
    openapiFields.add("digits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("applicationId");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("digits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeRequest is not found in the empty JSON string", CodeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CodeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (!jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if (!jsonObj.get("applicationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationId").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeRequest>() {
           @Override
           public void write(JsonWriter out, CodeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodeRequest
  * @throws IOException if the JSON string is invalid with respect to CodeRequest
  */
  public static CodeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeRequest.class);
  }

 /**
  * Convert an instance of CodeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
