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
import com.bandwidth.sdk.model.Address;
import com.bandwidth.sdk.model.Contact;
import com.bandwidth.sdk.model.OptInWorkflow;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bandwidth.sdk.JSON;

/**
 * VerificationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class VerificationRequest {
  public static final String SERIALIZED_NAME_BUSINESS_ADDRESS = "businessAddress";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ADDRESS)
  @javax.annotation.Nonnull
  private Address businessAddress;

  public static final String SERIALIZED_NAME_BUSINESS_CONTACT = "businessContact";
  @SerializedName(SERIALIZED_NAME_BUSINESS_CONTACT)
  @javax.annotation.Nonnull
  private Contact businessContact;

  public static final String SERIALIZED_NAME_MESSAGE_VOLUME = "messageVolume";
  @SerializedName(SERIALIZED_NAME_MESSAGE_VOLUME)
  @javax.annotation.Nonnull
  private Integer messageVolume;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  @javax.annotation.Nonnull
  private List<String> phoneNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_USE_CASE = "useCase";
  @SerializedName(SERIALIZED_NAME_USE_CASE)
  @javax.annotation.Nonnull
  private String useCase;

  public static final String SERIALIZED_NAME_USE_CASE_SUMMARY = "useCaseSummary";
  @SerializedName(SERIALIZED_NAME_USE_CASE_SUMMARY)
  @javax.annotation.Nonnull
  private String useCaseSummary;

  public static final String SERIALIZED_NAME_PRODUCTION_MESSAGE_CONTENT = "productionMessageContent";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_MESSAGE_CONTENT)
  @javax.annotation.Nonnull
  private String productionMessageContent;

  public static final String SERIALIZED_NAME_OPT_IN_WORKFLOW = "optInWorkflow";
  @SerializedName(SERIALIZED_NAME_OPT_IN_WORKFLOW)
  @javax.annotation.Nonnull
  private OptInWorkflow optInWorkflow;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFORMATION = "additionalInformation";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFORMATION)
  @javax.annotation.Nullable
  private String additionalInformation;

  public static final String SERIALIZED_NAME_ISV_RESELLER = "isvReseller";
  @SerializedName(SERIALIZED_NAME_ISV_RESELLER)
  @javax.annotation.Nullable
  private String isvReseller;

  public VerificationRequest() {
  }

  public VerificationRequest businessAddress(@javax.annotation.Nonnull Address businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

  /**
   * Get businessAddress
   * @return businessAddress
   */
  @javax.annotation.Nonnull
  public Address getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(@javax.annotation.Nonnull Address businessAddress) {
    this.businessAddress = businessAddress;
  }


  public VerificationRequest businessContact(@javax.annotation.Nonnull Contact businessContact) {
    this.businessContact = businessContact;
    return this;
  }

  /**
   * Get businessContact
   * @return businessContact
   */
  @javax.annotation.Nonnull
  public Contact getBusinessContact() {
    return businessContact;
  }

  public void setBusinessContact(@javax.annotation.Nonnull Contact businessContact) {
    this.businessContact = businessContact;
  }


  public VerificationRequest messageVolume(@javax.annotation.Nonnull Integer messageVolume) {
    this.messageVolume = messageVolume;
    return this;
  }

  /**
   * Estimated monthly volume of messages from the toll-free number.
   * minimum: 10
   * maximum: 10000000
   * @return messageVolume
   */
  @javax.annotation.Nonnull
  public Integer getMessageVolume() {
    return messageVolume;
  }

  public void setMessageVolume(@javax.annotation.Nonnull Integer messageVolume) {
    this.messageVolume = messageVolume;
  }


  public VerificationRequest phoneNumbers(@javax.annotation.Nonnull List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public VerificationRequest addPhoneNumbersItem(String phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * Get phoneNumbers
   * @return phoneNumbers
   */
  @javax.annotation.Nonnull
  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(@javax.annotation.Nonnull List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public VerificationRequest useCase(@javax.annotation.Nonnull String useCase) {
    this.useCase = useCase;
    return this;
  }

  /**
   * The category of the use case.
   * @return useCase
   */
  @javax.annotation.Nonnull
  public String getUseCase() {
    return useCase;
  }

  public void setUseCase(@javax.annotation.Nonnull String useCase) {
    this.useCase = useCase;
  }


  public VerificationRequest useCaseSummary(@javax.annotation.Nonnull String useCaseSummary) {
    this.useCaseSummary = useCaseSummary;
    return this;
  }

  /**
   * A general idea of the use case and customer.
   * @return useCaseSummary
   */
  @javax.annotation.Nonnull
  public String getUseCaseSummary() {
    return useCaseSummary;
  }

  public void setUseCaseSummary(@javax.annotation.Nonnull String useCaseSummary) {
    this.useCaseSummary = useCaseSummary;
  }


  public VerificationRequest productionMessageContent(@javax.annotation.Nonnull String productionMessageContent) {
    this.productionMessageContent = productionMessageContent;
    return this;
  }

  /**
   * Example of message content.
   * @return productionMessageContent
   */
  @javax.annotation.Nonnull
  public String getProductionMessageContent() {
    return productionMessageContent;
  }

  public void setProductionMessageContent(@javax.annotation.Nonnull String productionMessageContent) {
    this.productionMessageContent = productionMessageContent;
  }


  public VerificationRequest optInWorkflow(@javax.annotation.Nonnull OptInWorkflow optInWorkflow) {
    this.optInWorkflow = optInWorkflow;
    return this;
  }

  /**
   * Get optInWorkflow
   * @return optInWorkflow
   */
  @javax.annotation.Nonnull
  public OptInWorkflow getOptInWorkflow() {
    return optInWorkflow;
  }

  public void setOptInWorkflow(@javax.annotation.Nonnull OptInWorkflow optInWorkflow) {
    this.optInWorkflow = optInWorkflow;
  }


  public VerificationRequest additionalInformation(@javax.annotation.Nullable String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Any additional information.
   * @return additionalInformation
   */
  @javax.annotation.Nullable
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(@javax.annotation.Nullable String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  public VerificationRequest isvReseller(@javax.annotation.Nullable String isvReseller) {
    this.isvReseller = isvReseller;
    return this;
  }

  /**
   * ISV name.
   * @return isvReseller
   */
  @javax.annotation.Nullable
  public String getIsvReseller() {
    return isvReseller;
  }

  public void setIsvReseller(@javax.annotation.Nullable String isvReseller) {
    this.isvReseller = isvReseller;
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
   * @return the VerificationRequest instance itself
   */
  public VerificationRequest putAdditionalProperty(String key, Object value) {
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
    VerificationRequest verificationRequest = (VerificationRequest) o;
    return Objects.equals(this.businessAddress, verificationRequest.businessAddress) &&
        Objects.equals(this.businessContact, verificationRequest.businessContact) &&
        Objects.equals(this.messageVolume, verificationRequest.messageVolume) &&
        Objects.equals(this.phoneNumbers, verificationRequest.phoneNumbers) &&
        Objects.equals(this.useCase, verificationRequest.useCase) &&
        Objects.equals(this.useCaseSummary, verificationRequest.useCaseSummary) &&
        Objects.equals(this.productionMessageContent, verificationRequest.productionMessageContent) &&
        Objects.equals(this.optInWorkflow, verificationRequest.optInWorkflow) &&
        Objects.equals(this.additionalInformation, verificationRequest.additionalInformation) &&
        Objects.equals(this.isvReseller, verificationRequest.isvReseller)&&
        Objects.equals(this.additionalProperties, verificationRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessAddress, businessContact, messageVolume, phoneNumbers, useCase, useCaseSummary, productionMessageContent, optInWorkflow, additionalInformation, isvReseller, additionalProperties);
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
    sb.append("class VerificationRequest {\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessContact: ").append(toIndentedString(businessContact)).append("\n");
    sb.append("    messageVolume: ").append(toIndentedString(messageVolume)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
    sb.append("    useCaseSummary: ").append(toIndentedString(useCaseSummary)).append("\n");
    sb.append("    productionMessageContent: ").append(toIndentedString(productionMessageContent)).append("\n");
    sb.append("    optInWorkflow: ").append(toIndentedString(optInWorkflow)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    isvReseller: ").append(toIndentedString(isvReseller)).append("\n");
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
    openapiFields.add("businessAddress");
    openapiFields.add("businessContact");
    openapiFields.add("messageVolume");
    openapiFields.add("phoneNumbers");
    openapiFields.add("useCase");
    openapiFields.add("useCaseSummary");
    openapiFields.add("productionMessageContent");
    openapiFields.add("optInWorkflow");
    openapiFields.add("additionalInformation");
    openapiFields.add("isvReseller");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("businessAddress");
    openapiRequiredFields.add("businessContact");
    openapiRequiredFields.add("messageVolume");
    openapiRequiredFields.add("phoneNumbers");
    openapiRequiredFields.add("useCase");
    openapiRequiredFields.add("useCaseSummary");
    openapiRequiredFields.add("productionMessageContent");
    openapiRequiredFields.add("optInWorkflow");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VerificationRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VerificationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationRequest is not found in the empty JSON string", VerificationRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerificationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `businessAddress`
      Address.validateJsonElement(jsonObj.get("businessAddress"));
      // validate the required field `businessContact`
      Contact.validateJsonElement(jsonObj.get("businessContact"));
      // ensure the required json array is present
      if (jsonObj.get("phoneNumbers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("phoneNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("phoneNumbers").toString()));
      }
      if (!jsonObj.get("useCase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `useCase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("useCase").toString()));
      }
      if (!jsonObj.get("useCaseSummary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `useCaseSummary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("useCaseSummary").toString()));
      }
      if (!jsonObj.get("productionMessageContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productionMessageContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productionMessageContent").toString()));
      }
      // validate the required field `optInWorkflow`
      OptInWorkflow.validateJsonElement(jsonObj.get("optInWorkflow"));
      if ((jsonObj.get("additionalInformation") != null && !jsonObj.get("additionalInformation").isJsonNull()) && !jsonObj.get("additionalInformation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInformation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInformation").toString()));
      }
      if ((jsonObj.get("isvReseller") != null && !jsonObj.get("isvReseller").isJsonNull()) && !jsonObj.get("isvReseller").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isvReseller` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isvReseller").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationRequest>() {
           @Override
           public void write(JsonWriter out, VerificationRequest value) throws IOException {
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
           public VerificationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VerificationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of VerificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerificationRequest
   * @throws IOException if the JSON string is invalid with respect to VerificationRequest
   */
  public static VerificationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationRequest.class);
  }

  /**
   * Convert an instance of VerificationRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

