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
import java.net.URI;
import org.openapitools.client.model.ConferenceStateEnum;
import org.openapitools.client.model.RedirectMethodEnum;
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
 * UpdateConference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T08:49:31.529519-04:00[America/New_York]")
public class UpdateConference {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ConferenceStateEnum status = ConferenceStateEnum.ACTIVE;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private URI redirectUrl;

  public static final String SERIALIZED_NAME_REDIRECT_METHOD = "redirectMethod";
  @SerializedName(SERIALIZED_NAME_REDIRECT_METHOD)
  private RedirectMethodEnum redirectMethod = RedirectMethodEnum.POST;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_REDIRECT_FALLBACK_URL = "redirectFallbackUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_FALLBACK_URL)
  private URI redirectFallbackUrl;

  public static final String SERIALIZED_NAME_REDIRECT_FALLBACK_METHOD = "redirectFallbackMethod";
  @SerializedName(SERIALIZED_NAME_REDIRECT_FALLBACK_METHOD)
  private RedirectMethodEnum redirectFallbackMethod = RedirectMethodEnum.POST;

  public static final String SERIALIZED_NAME_FALLBACK_USERNAME = "fallbackUsername";
  @SerializedName(SERIALIZED_NAME_FALLBACK_USERNAME)
  private String fallbackUsername;

  public static final String SERIALIZED_NAME_FALLBACK_PASSWORD = "fallbackPassword";
  @SerializedName(SERIALIZED_NAME_FALLBACK_PASSWORD)
  private String fallbackPassword;

  public UpdateConference() {
  }

  public UpdateConference status(ConferenceStateEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConferenceStateEnum getStatus() {
    return status;
  }


  public void setStatus(ConferenceStateEnum status) {
    this.status = status;
  }


  public UpdateConference redirectUrl(URI redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The URL to send the [conferenceRedirect](/docs/voice/webhooks/conferenceRedirect) event which will provide new BXML. Not allowed if &#x60;state&#x60; is &#x60;completed&#x60;, but required if &#x60;state&#x60; is &#x60;active&#x60;
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myServer.com/bandwidth/webhooks/conferenceRedirect", value = "The URL to send the [conferenceRedirect](/docs/voice/webhooks/conferenceRedirect) event which will provide new BXML. Not allowed if `state` is `completed`, but required if `state` is `active`")

  public URI getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(URI redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public UpdateConference redirectMethod(RedirectMethodEnum redirectMethod) {
    
    this.redirectMethod = redirectMethod;
    return this;
  }

   /**
   * Get redirectMethod
   * @return redirectMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectMethodEnum getRedirectMethod() {
    return redirectMethod;
  }


  public void setRedirectMethod(RedirectMethodEnum redirectMethod) {
    this.redirectMethod = redirectMethod;
  }


  public UpdateConference username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Basic auth username.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretUsername", value = "Basic auth username.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UpdateConference password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Basic auth password.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretPassword1!", value = "Basic auth password.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateConference redirectFallbackUrl(URI redirectFallbackUrl) {
    
    this.redirectFallbackUrl = redirectFallbackUrl;
    return this;
  }

   /**
   * A fallback url which, if provided, will be used to retry the &#x60;conferenceRedirect&#x60; webhook delivery in case &#x60;redirectUrl&#x60; fails to respond.  Not allowed if &#x60;state&#x60; is &#x60;completed&#x60;.
   * @return redirectFallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myFallbackServer.com/bandwidth/webhooks/conferenceRedirect", value = "A fallback url which, if provided, will be used to retry the `conferenceRedirect` webhook delivery in case `redirectUrl` fails to respond.  Not allowed if `state` is `completed`.")

  public URI getRedirectFallbackUrl() {
    return redirectFallbackUrl;
  }


  public void setRedirectFallbackUrl(URI redirectFallbackUrl) {
    this.redirectFallbackUrl = redirectFallbackUrl;
  }


  public UpdateConference redirectFallbackMethod(RedirectMethodEnum redirectFallbackMethod) {
    
    this.redirectFallbackMethod = redirectFallbackMethod;
    return this;
  }

   /**
   * Get redirectFallbackMethod
   * @return redirectFallbackMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectMethodEnum getRedirectFallbackMethod() {
    return redirectFallbackMethod;
  }


  public void setRedirectFallbackMethod(RedirectMethodEnum redirectFallbackMethod) {
    this.redirectFallbackMethod = redirectFallbackMethod;
  }


  public UpdateConference fallbackUsername(String fallbackUsername) {
    
    this.fallbackUsername = fallbackUsername;
    return this;
  }

   /**
   * Basic auth username.
   * @return fallbackUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretUsername", value = "Basic auth username.")

  public String getFallbackUsername() {
    return fallbackUsername;
  }


  public void setFallbackUsername(String fallbackUsername) {
    this.fallbackUsername = fallbackUsername;
  }


  public UpdateConference fallbackPassword(String fallbackPassword) {
    
    this.fallbackPassword = fallbackPassword;
    return this;
  }

   /**
   * Basic auth password.
   * @return fallbackPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mySecretPassword1!", value = "Basic auth password.")

  public String getFallbackPassword() {
    return fallbackPassword;
  }


  public void setFallbackPassword(String fallbackPassword) {
    this.fallbackPassword = fallbackPassword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConference updateConference = (UpdateConference) o;
    return Objects.equals(this.status, updateConference.status) &&
        Objects.equals(this.redirectUrl, updateConference.redirectUrl) &&
        Objects.equals(this.redirectMethod, updateConference.redirectMethod) &&
        Objects.equals(this.username, updateConference.username) &&
        Objects.equals(this.password, updateConference.password) &&
        Objects.equals(this.redirectFallbackUrl, updateConference.redirectFallbackUrl) &&
        Objects.equals(this.redirectFallbackMethod, updateConference.redirectFallbackMethod) &&
        Objects.equals(this.fallbackUsername, updateConference.fallbackUsername) &&
        Objects.equals(this.fallbackPassword, updateConference.fallbackPassword);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, redirectUrl, redirectMethod, username, password, redirectFallbackUrl, redirectFallbackMethod, fallbackUsername, fallbackPassword);
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
    sb.append("class UpdateConference {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    redirectMethod: ").append(toIndentedString(redirectMethod)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    redirectFallbackUrl: ").append(toIndentedString(redirectFallbackUrl)).append("\n");
    sb.append("    redirectFallbackMethod: ").append(toIndentedString(redirectFallbackMethod)).append("\n");
    sb.append("    fallbackUsername: ").append(toIndentedString(fallbackUsername)).append("\n");
    sb.append("    fallbackPassword: ").append(toIndentedString(fallbackPassword)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("redirectUrl");
    openapiFields.add("redirectMethod");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("redirectFallbackUrl");
    openapiFields.add("redirectFallbackMethod");
    openapiFields.add("fallbackUsername");
    openapiFields.add("fallbackPassword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateConference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateConference.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateConference is not found in the empty JSON string", UpdateConference.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateConference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateConference` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("redirectUrl") != null && !jsonObj.get("redirectUrl").isJsonNull()) && !jsonObj.get("redirectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUrl").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("redirectFallbackUrl") != null && !jsonObj.get("redirectFallbackUrl").isJsonNull()) && !jsonObj.get("redirectFallbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectFallbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectFallbackUrl").toString()));
      }
      if ((jsonObj.get("fallbackUsername") != null && !jsonObj.get("fallbackUsername").isJsonNull()) && !jsonObj.get("fallbackUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackUsername").toString()));
      }
      if ((jsonObj.get("fallbackPassword") != null && !jsonObj.get("fallbackPassword").isJsonNull()) && !jsonObj.get("fallbackPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fallbackPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fallbackPassword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateConference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateConference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateConference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateConference.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateConference>() {
           @Override
           public void write(JsonWriter out, UpdateConference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateConference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateConference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateConference
  * @throws IOException if the JSON string is invalid with respect to UpdateConference
  */
  public static UpdateConference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateConference.class);
  }

 /**
  * Convert an instance of UpdateConference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

