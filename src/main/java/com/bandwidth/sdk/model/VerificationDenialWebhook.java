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
import com.bandwidth.sdk.model.AdditionalDenialReason;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
 * VerificationDenialWebhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class VerificationDenialWebhook {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  @javax.annotation.Nullable
  private String accountId;

  public static final String SERIALIZED_NAME_ADDITIONAL_DENIAL_REASONS = "additionalDenialReasons";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DENIAL_REASONS)
  @javax.annotation.Nullable
  private List<AdditionalDenialReason> additionalDenialReasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_DECLINE_REASON_DESCRIPTION = "declineReasonDescription";
  @SerializedName(SERIALIZED_NAME_DECLINE_REASON_DESCRIPTION)
  @javax.annotation.Nullable
  private String declineReasonDescription;

  public static final String SERIALIZED_NAME_DENIAL_STATUS_CODE = "denialStatusCode";
  @SerializedName(SERIALIZED_NAME_DENIAL_STATUS_CODE)
  @javax.annotation.Nullable
  private Integer denialStatusCode;

  public static final String SERIALIZED_NAME_INTERNAL_TICKET_NUMBER = "internalTicketNumber";
  @SerializedName(SERIALIZED_NAME_INTERNAL_TICKET_NUMBER)
  @javax.annotation.Nullable
  private UUID internalTicketNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nullable
  private String phoneNumber;

  public static final String SERIALIZED_NAME_RESUBMIT_ALLOWED = "resubmitAllowed";
  @SerializedName(SERIALIZED_NAME_RESUBMIT_ALLOWED)
  @javax.annotation.Nullable
  private Boolean resubmitAllowed;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status = "UNVERIFIED";

  public static final String SERIALIZED_NAME_BLOCKED = "blocked";
  @SerializedName(SERIALIZED_NAME_BLOCKED)
  @javax.annotation.Nullable
  private Boolean blocked;

  public static final String SERIALIZED_NAME_BLOCKED_REASON = "blockedReason";
  @SerializedName(SERIALIZED_NAME_BLOCKED_REASON)
  @javax.annotation.Nullable
  private String blockedReason;

  public VerificationDenialWebhook() {
  }

  public VerificationDenialWebhook accountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * User&#39;s account ID.
   * @return accountId
   */
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(@javax.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public VerificationDenialWebhook additionalDenialReasons(@javax.annotation.Nullable List<AdditionalDenialReason> additionalDenialReasons) {
    this.additionalDenialReasons = additionalDenialReasons;
    return this;
  }

  public VerificationDenialWebhook addAdditionalDenialReasonsItem(AdditionalDenialReason additionalDenialReasonsItem) {
    if (this.additionalDenialReasons == null) {
      this.additionalDenialReasons = new ArrayList<>();
    }
    this.additionalDenialReasons.add(additionalDenialReasonsItem);
    return this;
  }

  /**
   * An optional list of denial reasons in addition to declineReasonDescription when multiple reasons apply.
   * @return additionalDenialReasons
   */
  @javax.annotation.Nullable
  public List<AdditionalDenialReason> getAdditionalDenialReasons() {
    return additionalDenialReasons;
  }

  public void setAdditionalDenialReasons(@javax.annotation.Nullable List<AdditionalDenialReason> additionalDenialReasons) {
    this.additionalDenialReasons = additionalDenialReasons;
  }


  public VerificationDenialWebhook declineReasonDescription(@javax.annotation.Nullable String declineReasonDescription) {
    this.declineReasonDescription = declineReasonDescription;
    return this;
  }

  /**
   * Explanation for why a verification request was declined.
   * @return declineReasonDescription
   */
  @javax.annotation.Nullable
  public String getDeclineReasonDescription() {
    return declineReasonDescription;
  }

  public void setDeclineReasonDescription(@javax.annotation.Nullable String declineReasonDescription) {
    this.declineReasonDescription = declineReasonDescription;
  }


  public VerificationDenialWebhook denialStatusCode(@javax.annotation.Nullable Integer denialStatusCode) {
    this.denialStatusCode = denialStatusCode;
    return this;
  }

  /**
   * Reason code for denial.
   * @return denialStatusCode
   */
  @javax.annotation.Nullable
  public Integer getDenialStatusCode() {
    return denialStatusCode;
  }

  public void setDenialStatusCode(@javax.annotation.Nullable Integer denialStatusCode) {
    this.denialStatusCode = denialStatusCode;
  }


  public VerificationDenialWebhook internalTicketNumber(@javax.annotation.Nullable UUID internalTicketNumber) {
    this.internalTicketNumber = internalTicketNumber;
    return this;
  }

  /**
   * Unique identifier (UUID) generated by Bandwidth to assist in tracking the verification status of a toll-free number.
   * @return internalTicketNumber
   */
  @javax.annotation.Nullable
  public UUID getInternalTicketNumber() {
    return internalTicketNumber;
  }

  public void setInternalTicketNumber(@javax.annotation.Nullable UUID internalTicketNumber) {
    this.internalTicketNumber = internalTicketNumber;
  }


  public VerificationDenialWebhook phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Toll-free telephone number in E.164 format.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public VerificationDenialWebhook resubmitAllowed(@javax.annotation.Nullable Boolean resubmitAllowed) {
    this.resubmitAllowed = resubmitAllowed;
    return this;
  }

  /**
   * Whether a Toll-Free Verification request qualifies for resubmission via PUT.
   * @return resubmitAllowed
   */
  @javax.annotation.Nullable
  public Boolean getResubmitAllowed() {
    return resubmitAllowed;
  }

  public void setResubmitAllowed(@javax.annotation.Nullable Boolean resubmitAllowed) {
    this.resubmitAllowed = resubmitAllowed;
  }


  public VerificationDenialWebhook status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public VerificationDenialWebhook blocked(@javax.annotation.Nullable Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Whether a Toll-Free Verification is blocked. This attribute will only be defined when the number is blocked.
   * @return blocked
   */
  @javax.annotation.Nullable
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(@javax.annotation.Nullable Boolean blocked) {
    this.blocked = blocked;
  }


  public VerificationDenialWebhook blockedReason(@javax.annotation.Nullable String blockedReason) {
    this.blockedReason = blockedReason;
    return this;
  }

  /**
   * The reason why the Toll-Free Verification is blocked. This attribute will only be defined when the number is blocked.
   * @return blockedReason
   */
  @javax.annotation.Nullable
  public String getBlockedReason() {
    return blockedReason;
  }

  public void setBlockedReason(@javax.annotation.Nullable String blockedReason) {
    this.blockedReason = blockedReason;
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
   * @return the VerificationDenialWebhook instance itself
   */
  public VerificationDenialWebhook putAdditionalProperty(String key, Object value) {
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
    VerificationDenialWebhook verificationDenialWebhook = (VerificationDenialWebhook) o;
    return Objects.equals(this.accountId, verificationDenialWebhook.accountId) &&
        Objects.equals(this.additionalDenialReasons, verificationDenialWebhook.additionalDenialReasons) &&
        Objects.equals(this.declineReasonDescription, verificationDenialWebhook.declineReasonDescription) &&
        Objects.equals(this.denialStatusCode, verificationDenialWebhook.denialStatusCode) &&
        Objects.equals(this.internalTicketNumber, verificationDenialWebhook.internalTicketNumber) &&
        Objects.equals(this.phoneNumber, verificationDenialWebhook.phoneNumber) &&
        Objects.equals(this.resubmitAllowed, verificationDenialWebhook.resubmitAllowed) &&
        Objects.equals(this.status, verificationDenialWebhook.status) &&
        Objects.equals(this.blocked, verificationDenialWebhook.blocked) &&
        Objects.equals(this.blockedReason, verificationDenialWebhook.blockedReason)&&
        Objects.equals(this.additionalProperties, verificationDenialWebhook.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, additionalDenialReasons, declineReasonDescription, denialStatusCode, internalTicketNumber, phoneNumber, resubmitAllowed, status, blocked, blockedReason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationDenialWebhook {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    additionalDenialReasons: ").append(toIndentedString(additionalDenialReasons)).append("\n");
    sb.append("    declineReasonDescription: ").append(toIndentedString(declineReasonDescription)).append("\n");
    sb.append("    denialStatusCode: ").append(toIndentedString(denialStatusCode)).append("\n");
    sb.append("    internalTicketNumber: ").append(toIndentedString(internalTicketNumber)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    resubmitAllowed: ").append(toIndentedString(resubmitAllowed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    blockedReason: ").append(toIndentedString(blockedReason)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("additionalDenialReasons");
    openapiFields.add("declineReasonDescription");
    openapiFields.add("denialStatusCode");
    openapiFields.add("internalTicketNumber");
    openapiFields.add("phoneNumber");
    openapiFields.add("resubmitAllowed");
    openapiFields.add("status");
    openapiFields.add("blocked");
    openapiFields.add("blockedReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VerificationDenialWebhook
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VerificationDenialWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationDenialWebhook is not found in the empty JSON string", VerificationDenialWebhook.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if (jsonObj.get("additionalDenialReasons") != null && !jsonObj.get("additionalDenialReasons").isJsonNull()) {
        JsonArray jsonArrayadditionalDenialReasons = jsonObj.getAsJsonArray("additionalDenialReasons");
        if (jsonArrayadditionalDenialReasons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalDenialReasons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalDenialReasons` to be an array in the JSON string but got `%s`", jsonObj.get("additionalDenialReasons").toString()));
          }

          // validate the optional field `additionalDenialReasons` (array)
          for (int i = 0; i < jsonArrayadditionalDenialReasons.size(); i++) {
            AdditionalDenialReason.validateJsonElement(jsonArrayadditionalDenialReasons.get(i));
          };
        }
      }
      if ((jsonObj.get("declineReasonDescription") != null && !jsonObj.get("declineReasonDescription").isJsonNull()) && !jsonObj.get("declineReasonDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declineReasonDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declineReasonDescription").toString()));
      }
      if ((jsonObj.get("internalTicketNumber") != null && !jsonObj.get("internalTicketNumber").isJsonNull()) && !jsonObj.get("internalTicketNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalTicketNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalTicketNumber").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("blockedReason") != null && !jsonObj.get("blockedReason").isJsonNull()) && !jsonObj.get("blockedReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockedReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockedReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationDenialWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationDenialWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationDenialWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationDenialWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationDenialWebhook>() {
           @Override
           public void write(JsonWriter out, VerificationDenialWebhook value) throws IOException {
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
           public VerificationDenialWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VerificationDenialWebhook instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VerificationDenialWebhook given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerificationDenialWebhook
   * @throws IOException if the JSON string is invalid with respect to VerificationDenialWebhook
   */
  public static VerificationDenialWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationDenialWebhook.class);
  }

  /**
   * Convert an instance of VerificationDenialWebhook to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

