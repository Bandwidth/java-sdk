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
import com.bandwidth.sdk.model.ListMessageDirectionEnum;
import com.bandwidth.sdk.model.MessageStatusEnum;
import com.bandwidth.sdk.model.MessageTypeEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * ListMessageItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class ListMessageItem {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SOURCE_TN = "sourceTn";
  @SerializedName(SERIALIZED_NAME_SOURCE_TN)
  private String sourceTn;

  public static final String SERIALIZED_NAME_DESTINATION_TN = "destinationTn";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TN)
  private String destinationTn;

  public static final String SERIALIZED_NAME_MESSAGE_STATUS = "messageStatus";
  @SerializedName(SERIALIZED_NAME_MESSAGE_STATUS)
  private MessageStatusEnum messageStatus;

  public static final String SERIALIZED_NAME_MESSAGE_DIRECTION = "messageDirection";
  @SerializedName(SERIALIZED_NAME_MESSAGE_DIRECTION)
  private ListMessageDirectionEnum messageDirection;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "messageType";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private MessageTypeEnum messageType;

  public static final String SERIALIZED_NAME_SEGMENT_COUNT = "segmentCount";
  @SerializedName(SERIALIZED_NAME_SEGMENT_COUNT)
  private Integer segmentCount;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_RECEIVE_TIME = "receiveTime";
  @SerializedName(SERIALIZED_NAME_RECEIVE_TIME)
  private OffsetDateTime receiveTime;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_MESSAGE_SIZE = "messageSize";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SIZE)
  private Integer messageSize;

  public static final String SERIALIZED_NAME_MESSAGE_LENGTH = "messageLength";
  @SerializedName(SERIALIZED_NAME_MESSAGE_LENGTH)
  private Integer messageLength;

  public static final String SERIALIZED_NAME_ATTACHMENT_COUNT = "attachmentCount";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_COUNT)
  private Integer attachmentCount;

  public static final String SERIALIZED_NAME_RECIPIENT_COUNT = "recipientCount";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_COUNT)
  private Integer recipientCount;

  public static final String SERIALIZED_NAME_CAMPAIGN_CLASS = "campaignClass";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_CLASS)
  private String campaignClass;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public ListMessageItem() {
  }

  public ListMessageItem messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * The message id
   * @return messageId
  **/
  @javax.annotation.Nullable
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public ListMessageItem accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account id associated with this message.
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ListMessageItem sourceTn(String sourceTn) {
    this.sourceTn = sourceTn;
    return this;
  }

   /**
   * The source phone number of the message.
   * @return sourceTn
  **/
  @javax.annotation.Nullable
  public String getSourceTn() {
    return sourceTn;
  }

  public void setSourceTn(String sourceTn) {
    this.sourceTn = sourceTn;
  }


  public ListMessageItem destinationTn(String destinationTn) {
    this.destinationTn = destinationTn;
    return this;
  }

   /**
   * The recipient phone number of the message.
   * @return destinationTn
  **/
  @javax.annotation.Nullable
  public String getDestinationTn() {
    return destinationTn;
  }

  public void setDestinationTn(String destinationTn) {
    this.destinationTn = destinationTn;
  }


  public ListMessageItem messageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
    return this;
  }

   /**
   * Get messageStatus
   * @return messageStatus
  **/
  @javax.annotation.Nullable
  public MessageStatusEnum getMessageStatus() {
    return messageStatus;
  }

  public void setMessageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
  }


  public ListMessageItem messageDirection(ListMessageDirectionEnum messageDirection) {
    this.messageDirection = messageDirection;
    return this;
  }

   /**
   * Get messageDirection
   * @return messageDirection
  **/
  @javax.annotation.Nullable
  public ListMessageDirectionEnum getMessageDirection() {
    return messageDirection;
  }

  public void setMessageDirection(ListMessageDirectionEnum messageDirection) {
    this.messageDirection = messageDirection;
  }


  public ListMessageItem messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nullable
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  public ListMessageItem segmentCount(Integer segmentCount) {
    this.segmentCount = segmentCount;
    return this;
  }

   /**
   * The number of segments the message was sent as.
   * @return segmentCount
  **/
  @javax.annotation.Nullable
  public Integer getSegmentCount() {
    return segmentCount;
  }

  public void setSegmentCount(Integer segmentCount) {
    this.segmentCount = segmentCount;
  }


  public ListMessageItem errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The numeric error code of the message.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public ListMessageItem receiveTime(OffsetDateTime receiveTime) {
    this.receiveTime = receiveTime;
    return this;
  }

   /**
   * The ISO 8601 datetime of the message.
   * @return receiveTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getReceiveTime() {
    return receiveTime;
  }

  public void setReceiveTime(OffsetDateTime receiveTime) {
    this.receiveTime = receiveTime;
  }


  public ListMessageItem carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The name of the carrier. Not currently supported for MMS coming soon.
   * @return carrierName
  **/
  @javax.annotation.Nullable
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public ListMessageItem messageSize(Integer messageSize) {
    this.messageSize = messageSize;
    return this;
  }

   /**
   * The size of the message including message content and headers.
   * @return messageSize
  **/
  @javax.annotation.Nullable
  public Integer getMessageSize() {
    return messageSize;
  }

  public void setMessageSize(Integer messageSize) {
    this.messageSize = messageSize;
  }


  public ListMessageItem messageLength(Integer messageLength) {
    this.messageLength = messageLength;
    return this;
  }

   /**
   * The length of the message content.
   * @return messageLength
  **/
  @javax.annotation.Nullable
  public Integer getMessageLength() {
    return messageLength;
  }

  public void setMessageLength(Integer messageLength) {
    this.messageLength = messageLength;
  }


  public ListMessageItem attachmentCount(Integer attachmentCount) {
    this.attachmentCount = attachmentCount;
    return this;
  }

   /**
   * The number of attachments the message has.
   * @return attachmentCount
  **/
  @javax.annotation.Nullable
  public Integer getAttachmentCount() {
    return attachmentCount;
  }

  public void setAttachmentCount(Integer attachmentCount) {
    this.attachmentCount = attachmentCount;
  }


  public ListMessageItem recipientCount(Integer recipientCount) {
    this.recipientCount = recipientCount;
    return this;
  }

   /**
   * The number of recipients the message has.
   * @return recipientCount
  **/
  @javax.annotation.Nullable
  public Integer getRecipientCount() {
    return recipientCount;
  }

  public void setRecipientCount(Integer recipientCount) {
    this.recipientCount = recipientCount;
  }


  public ListMessageItem campaignClass(String campaignClass) {
    this.campaignClass = campaignClass;
    return this;
  }

   /**
   * The campaign class of the message if it has one.
   * @return campaignClass
  **/
  @javax.annotation.Nullable
  public String getCampaignClass() {
    return campaignClass;
  }

  public void setCampaignClass(String campaignClass) {
    this.campaignClass = campaignClass;
  }


  public ListMessageItem campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The campaign ID of the message if it has one.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
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
   * @return the ListMessageItem instance itself
   */
  public ListMessageItem putAdditionalProperty(String key, Object value) {
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
    ListMessageItem listMessageItem = (ListMessageItem) o;
    return Objects.equals(this.messageId, listMessageItem.messageId) &&
        Objects.equals(this.accountId, listMessageItem.accountId) &&
        Objects.equals(this.sourceTn, listMessageItem.sourceTn) &&
        Objects.equals(this.destinationTn, listMessageItem.destinationTn) &&
        Objects.equals(this.messageStatus, listMessageItem.messageStatus) &&
        Objects.equals(this.messageDirection, listMessageItem.messageDirection) &&
        Objects.equals(this.messageType, listMessageItem.messageType) &&
        Objects.equals(this.segmentCount, listMessageItem.segmentCount) &&
        Objects.equals(this.errorCode, listMessageItem.errorCode) &&
        Objects.equals(this.receiveTime, listMessageItem.receiveTime) &&
        Objects.equals(this.carrierName, listMessageItem.carrierName) &&
        Objects.equals(this.messageSize, listMessageItem.messageSize) &&
        Objects.equals(this.messageLength, listMessageItem.messageLength) &&
        Objects.equals(this.attachmentCount, listMessageItem.attachmentCount) &&
        Objects.equals(this.recipientCount, listMessageItem.recipientCount) &&
        Objects.equals(this.campaignClass, listMessageItem.campaignClass) &&
        Objects.equals(this.campaignId, listMessageItem.campaignId)&&
        Objects.equals(this.additionalProperties, listMessageItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, accountId, sourceTn, destinationTn, messageStatus, messageDirection, messageType, segmentCount, errorCode, receiveTime, carrierName, messageSize, messageLength, attachmentCount, recipientCount, campaignClass, campaignId, additionalProperties);
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
    sb.append("class ListMessageItem {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    sourceTn: ").append(toIndentedString(sourceTn)).append("\n");
    sb.append("    destinationTn: ").append(toIndentedString(destinationTn)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    messageDirection: ").append(toIndentedString(messageDirection)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    segmentCount: ").append(toIndentedString(segmentCount)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    messageSize: ").append(toIndentedString(messageSize)).append("\n");
    sb.append("    messageLength: ").append(toIndentedString(messageLength)).append("\n");
    sb.append("    attachmentCount: ").append(toIndentedString(attachmentCount)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    campaignClass: ").append(toIndentedString(campaignClass)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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
    openapiFields.add("messageId");
    openapiFields.add("accountId");
    openapiFields.add("sourceTn");
    openapiFields.add("destinationTn");
    openapiFields.add("messageStatus");
    openapiFields.add("messageDirection");
    openapiFields.add("messageType");
    openapiFields.add("segmentCount");
    openapiFields.add("errorCode");
    openapiFields.add("receiveTime");
    openapiFields.add("carrierName");
    openapiFields.add("messageSize");
    openapiFields.add("messageLength");
    openapiFields.add("attachmentCount");
    openapiFields.add("recipientCount");
    openapiFields.add("campaignClass");
    openapiFields.add("campaignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListMessageItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListMessageItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListMessageItem is not found in the empty JSON string", ListMessageItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("messageId") != null && !jsonObj.get("messageId").isJsonNull()) && !jsonObj.get("messageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageId").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("sourceTn") != null && !jsonObj.get("sourceTn").isJsonNull()) && !jsonObj.get("sourceTn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceTn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceTn").toString()));
      }
      if ((jsonObj.get("destinationTn") != null && !jsonObj.get("destinationTn").isJsonNull()) && !jsonObj.get("destinationTn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationTn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationTn").toString()));
      }
      // validate the optional field `messageStatus`
      if (jsonObj.get("messageStatus") != null && !jsonObj.get("messageStatus").isJsonNull()) {
        MessageStatusEnum.validateJsonElement(jsonObj.get("messageStatus"));
      }
      // validate the optional field `messageDirection`
      if (jsonObj.get("messageDirection") != null && !jsonObj.get("messageDirection").isJsonNull()) {
        ListMessageDirectionEnum.validateJsonElement(jsonObj.get("messageDirection"));
      }
      // validate the optional field `messageType`
      if (jsonObj.get("messageType") != null && !jsonObj.get("messageType").isJsonNull()) {
        MessageTypeEnum.validateJsonElement(jsonObj.get("messageType"));
      }
      if ((jsonObj.get("carrierName") != null && !jsonObj.get("carrierName").isJsonNull()) && !jsonObj.get("carrierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierName").toString()));
      }
      if ((jsonObj.get("campaignClass") != null && !jsonObj.get("campaignClass").isJsonNull()) && !jsonObj.get("campaignClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignClass").toString()));
      }
      if ((jsonObj.get("campaignId") != null && !jsonObj.get("campaignId").isJsonNull()) && !jsonObj.get("campaignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListMessageItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListMessageItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListMessageItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListMessageItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ListMessageItem>() {
           @Override
           public void write(JsonWriter out, ListMessageItem value) throws IOException {
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
           public ListMessageItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ListMessageItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListMessageItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListMessageItem
  * @throws IOException if the JSON string is invalid with respect to ListMessageItem
  */
  public static ListMessageItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListMessageItem.class);
  }

 /**
  * Convert an instance of ListMessageItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

