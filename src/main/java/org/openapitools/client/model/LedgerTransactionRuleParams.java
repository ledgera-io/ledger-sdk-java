/*
 * Ledgera core API
 * Ledgera servers.
 *
 * The version of the OpenAPI document: 2.0
 * 
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
import org.openapitools.client.model.LedgerMessageType;
import org.openapitools.client.model.LedgerProcessType;

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
 * LedgerTransactionRuleParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T23:32:57.881559-03:00[America/Sao_Paulo]")
public class LedgerTransactionRuleParams {
  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT_BALANCE_TYPE = "creditAccountBalanceType";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT_BALANCE_TYPE)
  private String creditAccountBalanceType;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT_SUB_TYPE = "creditAccountSubType";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT_SUB_TYPE)
  private String creditAccountSubType;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE = "creditAccountType";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE)
  private String creditAccountType;

  public static final String SERIALIZED_NAME_DEBIT_ACCOUNT_BALANCE_TYPE = "debitAccountBalanceType";
  @SerializedName(SERIALIZED_NAME_DEBIT_ACCOUNT_BALANCE_TYPE)
  private String debitAccountBalanceType;

  public static final String SERIALIZED_NAME_DEBIT_ACCOUNT_SUB_TYPE = "debitAccountSubType";
  @SerializedName(SERIALIZED_NAME_DEBIT_ACCOUNT_SUB_TYPE)
  private String debitAccountSubType;

  public static final String SERIALIZED_NAME_DEBIT_ACCOUNT_TYPE = "debitAccountType";
  @SerializedName(SERIALIZED_NAME_DEBIT_ACCOUNT_TYPE)
  private String debitAccountType;

  public static final String SERIALIZED_NAME_ENTRY_ORDER = "entryOrder";
  @SerializedName(SERIALIZED_NAME_ENTRY_ORDER)
  private Integer entryOrder;

  public static final String SERIALIZED_NAME_ENTRY_TYPE = "entryType";
  @SerializedName(SERIALIZED_NAME_ENTRY_TYPE)
  private String entryType;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "messageType";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private LedgerMessageType messageType;

  public static final String SERIALIZED_NAME_PARAM_ACCOUNT1_SUBTYPE = "paramAccount1Subtype";
  @SerializedName(SERIALIZED_NAME_PARAM_ACCOUNT1_SUBTYPE)
  private String paramAccount1Subtype;

  public static final String SERIALIZED_NAME_PARAM_ACCOUNT1_TYPE = "paramAccount1Type";
  @SerializedName(SERIALIZED_NAME_PARAM_ACCOUNT1_TYPE)
  private String paramAccount1Type;

  public static final String SERIALIZED_NAME_PARAM_ACCOUNT2_SUBTYPE = "paramAccount2Subtype";
  @SerializedName(SERIALIZED_NAME_PARAM_ACCOUNT2_SUBTYPE)
  private String paramAccount2Subtype;

  public static final String SERIALIZED_NAME_PARAM_ACCOUNT2_TYPE = "paramAccount2Type";
  @SerializedName(SERIALIZED_NAME_PARAM_ACCOUNT2_TYPE)
  private String paramAccount2Type;

  public static final String SERIALIZED_NAME_PROCESS_TYPE = "processType";
  @SerializedName(SERIALIZED_NAME_PROCESS_TYPE)
  private LedgerProcessType processType;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public LedgerTransactionRuleParams() {
  }

  public LedgerTransactionRuleParams creditAccountBalanceType(String creditAccountBalanceType) {
    
    this.creditAccountBalanceType = creditAccountBalanceType;
    return this;
  }

   /**
   * Get creditAccountBalanceType
   * @return creditAccountBalanceType
  **/
  @javax.annotation.Nonnull

  public String getCreditAccountBalanceType() {
    return creditAccountBalanceType;
  }


  public void setCreditAccountBalanceType(String creditAccountBalanceType) {
    this.creditAccountBalanceType = creditAccountBalanceType;
  }


  public LedgerTransactionRuleParams creditAccountSubType(String creditAccountSubType) {
    
    this.creditAccountSubType = creditAccountSubType;
    return this;
  }

   /**
   * Get creditAccountSubType
   * @return creditAccountSubType
  **/
  @javax.annotation.Nonnull

  public String getCreditAccountSubType() {
    return creditAccountSubType;
  }


  public void setCreditAccountSubType(String creditAccountSubType) {
    this.creditAccountSubType = creditAccountSubType;
  }


  public LedgerTransactionRuleParams creditAccountType(String creditAccountType) {
    
    this.creditAccountType = creditAccountType;
    return this;
  }

   /**
   * Get creditAccountType
   * @return creditAccountType
  **/
  @javax.annotation.Nonnull

  public String getCreditAccountType() {
    return creditAccountType;
  }


  public void setCreditAccountType(String creditAccountType) {
    this.creditAccountType = creditAccountType;
  }


  public LedgerTransactionRuleParams debitAccountBalanceType(String debitAccountBalanceType) {
    
    this.debitAccountBalanceType = debitAccountBalanceType;
    return this;
  }

   /**
   * Get debitAccountBalanceType
   * @return debitAccountBalanceType
  **/
  @javax.annotation.Nonnull

  public String getDebitAccountBalanceType() {
    return debitAccountBalanceType;
  }


  public void setDebitAccountBalanceType(String debitAccountBalanceType) {
    this.debitAccountBalanceType = debitAccountBalanceType;
  }


  public LedgerTransactionRuleParams debitAccountSubType(String debitAccountSubType) {
    
    this.debitAccountSubType = debitAccountSubType;
    return this;
  }

   /**
   * Get debitAccountSubType
   * @return debitAccountSubType
  **/
  @javax.annotation.Nonnull

  public String getDebitAccountSubType() {
    return debitAccountSubType;
  }


  public void setDebitAccountSubType(String debitAccountSubType) {
    this.debitAccountSubType = debitAccountSubType;
  }


  public LedgerTransactionRuleParams debitAccountType(String debitAccountType) {
    
    this.debitAccountType = debitAccountType;
    return this;
  }

   /**
   * Get debitAccountType
   * @return debitAccountType
  **/
  @javax.annotation.Nonnull

  public String getDebitAccountType() {
    return debitAccountType;
  }


  public void setDebitAccountType(String debitAccountType) {
    this.debitAccountType = debitAccountType;
  }


  public LedgerTransactionRuleParams entryOrder(Integer entryOrder) {
    
    this.entryOrder = entryOrder;
    return this;
  }

   /**
   * Get entryOrder
   * @return entryOrder
  **/
  @javax.annotation.Nonnull

  public Integer getEntryOrder() {
    return entryOrder;
  }


  public void setEntryOrder(Integer entryOrder) {
    this.entryOrder = entryOrder;
  }


  public LedgerTransactionRuleParams entryType(String entryType) {
    
    this.entryType = entryType;
    return this;
  }

   /**
   * Get entryType
   * @return entryType
  **/
  @javax.annotation.Nonnull

  public String getEntryType() {
    return entryType;
  }


  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }


  public LedgerTransactionRuleParams messageType(LedgerMessageType messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nonnull

  public LedgerMessageType getMessageType() {
    return messageType;
  }


  public void setMessageType(LedgerMessageType messageType) {
    this.messageType = messageType;
  }


  public LedgerTransactionRuleParams paramAccount1Subtype(String paramAccount1Subtype) {
    
    this.paramAccount1Subtype = paramAccount1Subtype;
    return this;
  }

   /**
   * Get paramAccount1Subtype
   * @return paramAccount1Subtype
  **/
  @javax.annotation.Nullable

  public String getParamAccount1Subtype() {
    return paramAccount1Subtype;
  }


  public void setParamAccount1Subtype(String paramAccount1Subtype) {
    this.paramAccount1Subtype = paramAccount1Subtype;
  }


  public LedgerTransactionRuleParams paramAccount1Type(String paramAccount1Type) {
    
    this.paramAccount1Type = paramAccount1Type;
    return this;
  }

   /**
   * Get paramAccount1Type
   * @return paramAccount1Type
  **/
  @javax.annotation.Nullable

  public String getParamAccount1Type() {
    return paramAccount1Type;
  }


  public void setParamAccount1Type(String paramAccount1Type) {
    this.paramAccount1Type = paramAccount1Type;
  }


  public LedgerTransactionRuleParams paramAccount2Subtype(String paramAccount2Subtype) {
    
    this.paramAccount2Subtype = paramAccount2Subtype;
    return this;
  }

   /**
   * Get paramAccount2Subtype
   * @return paramAccount2Subtype
  **/
  @javax.annotation.Nullable

  public String getParamAccount2Subtype() {
    return paramAccount2Subtype;
  }


  public void setParamAccount2Subtype(String paramAccount2Subtype) {
    this.paramAccount2Subtype = paramAccount2Subtype;
  }


  public LedgerTransactionRuleParams paramAccount2Type(String paramAccount2Type) {
    
    this.paramAccount2Type = paramAccount2Type;
    return this;
  }

   /**
   * Get paramAccount2Type
   * @return paramAccount2Type
  **/
  @javax.annotation.Nullable

  public String getParamAccount2Type() {
    return paramAccount2Type;
  }


  public void setParamAccount2Type(String paramAccount2Type) {
    this.paramAccount2Type = paramAccount2Type;
  }


  public LedgerTransactionRuleParams processType(LedgerProcessType processType) {
    
    this.processType = processType;
    return this;
  }

   /**
   * Get processType
   * @return processType
  **/
  @javax.annotation.Nonnull

  public LedgerProcessType getProcessType() {
    return processType;
  }


  public void setProcessType(LedgerProcessType processType) {
    this.processType = processType;
  }


  public LedgerTransactionRuleParams transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nonnull

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerTransactionRuleParams ledgerTransactionRuleParams = (LedgerTransactionRuleParams) o;
    return Objects.equals(this.creditAccountBalanceType, ledgerTransactionRuleParams.creditAccountBalanceType) &&
        Objects.equals(this.creditAccountSubType, ledgerTransactionRuleParams.creditAccountSubType) &&
        Objects.equals(this.creditAccountType, ledgerTransactionRuleParams.creditAccountType) &&
        Objects.equals(this.debitAccountBalanceType, ledgerTransactionRuleParams.debitAccountBalanceType) &&
        Objects.equals(this.debitAccountSubType, ledgerTransactionRuleParams.debitAccountSubType) &&
        Objects.equals(this.debitAccountType, ledgerTransactionRuleParams.debitAccountType) &&
        Objects.equals(this.entryOrder, ledgerTransactionRuleParams.entryOrder) &&
        Objects.equals(this.entryType, ledgerTransactionRuleParams.entryType) &&
        Objects.equals(this.messageType, ledgerTransactionRuleParams.messageType) &&
        Objects.equals(this.paramAccount1Subtype, ledgerTransactionRuleParams.paramAccount1Subtype) &&
        Objects.equals(this.paramAccount1Type, ledgerTransactionRuleParams.paramAccount1Type) &&
        Objects.equals(this.paramAccount2Subtype, ledgerTransactionRuleParams.paramAccount2Subtype) &&
        Objects.equals(this.paramAccount2Type, ledgerTransactionRuleParams.paramAccount2Type) &&
        Objects.equals(this.processType, ledgerTransactionRuleParams.processType) &&
        Objects.equals(this.transactionType, ledgerTransactionRuleParams.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAccountBalanceType, creditAccountSubType, creditAccountType, debitAccountBalanceType, debitAccountSubType, debitAccountType, entryOrder, entryType, messageType, paramAccount1Subtype, paramAccount1Type, paramAccount2Subtype, paramAccount2Type, processType, transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerTransactionRuleParams {\n");
    sb.append("    creditAccountBalanceType: ").append(toIndentedString(creditAccountBalanceType)).append("\n");
    sb.append("    creditAccountSubType: ").append(toIndentedString(creditAccountSubType)).append("\n");
    sb.append("    creditAccountType: ").append(toIndentedString(creditAccountType)).append("\n");
    sb.append("    debitAccountBalanceType: ").append(toIndentedString(debitAccountBalanceType)).append("\n");
    sb.append("    debitAccountSubType: ").append(toIndentedString(debitAccountSubType)).append("\n");
    sb.append("    debitAccountType: ").append(toIndentedString(debitAccountType)).append("\n");
    sb.append("    entryOrder: ").append(toIndentedString(entryOrder)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    paramAccount1Subtype: ").append(toIndentedString(paramAccount1Subtype)).append("\n");
    sb.append("    paramAccount1Type: ").append(toIndentedString(paramAccount1Type)).append("\n");
    sb.append("    paramAccount2Subtype: ").append(toIndentedString(paramAccount2Subtype)).append("\n");
    sb.append("    paramAccount2Type: ").append(toIndentedString(paramAccount2Type)).append("\n");
    sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
    openapiFields.add("creditAccountBalanceType");
    openapiFields.add("creditAccountSubType");
    openapiFields.add("creditAccountType");
    openapiFields.add("debitAccountBalanceType");
    openapiFields.add("debitAccountSubType");
    openapiFields.add("debitAccountType");
    openapiFields.add("entryOrder");
    openapiFields.add("entryType");
    openapiFields.add("messageType");
    openapiFields.add("paramAccount1Subtype");
    openapiFields.add("paramAccount1Type");
    openapiFields.add("paramAccount2Subtype");
    openapiFields.add("paramAccount2Type");
    openapiFields.add("processType");
    openapiFields.add("transactionType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("creditAccountBalanceType");
    openapiRequiredFields.add("creditAccountSubType");
    openapiRequiredFields.add("creditAccountType");
    openapiRequiredFields.add("debitAccountBalanceType");
    openapiRequiredFields.add("debitAccountSubType");
    openapiRequiredFields.add("debitAccountType");
    openapiRequiredFields.add("entryOrder");
    openapiRequiredFields.add("entryType");
    openapiRequiredFields.add("messageType");
    openapiRequiredFields.add("processType");
    openapiRequiredFields.add("transactionType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LedgerTransactionRuleParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LedgerTransactionRuleParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LedgerTransactionRuleParams is not found in the empty JSON string", LedgerTransactionRuleParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LedgerTransactionRuleParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LedgerTransactionRuleParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LedgerTransactionRuleParams.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("creditAccountBalanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creditAccountBalanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creditAccountBalanceType").toString()));
      }
      if (!jsonObj.get("creditAccountSubType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creditAccountSubType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creditAccountSubType").toString()));
      }
      if (!jsonObj.get("creditAccountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creditAccountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creditAccountType").toString()));
      }
      if (!jsonObj.get("debitAccountBalanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debitAccountBalanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debitAccountBalanceType").toString()));
      }
      if (!jsonObj.get("debitAccountSubType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debitAccountSubType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debitAccountSubType").toString()));
      }
      if (!jsonObj.get("debitAccountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debitAccountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debitAccountType").toString()));
      }
      if (!jsonObj.get("entryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entryType").toString()));
      }
      if ((jsonObj.get("paramAccount1Subtype") != null && !jsonObj.get("paramAccount1Subtype").isJsonNull()) && !jsonObj.get("paramAccount1Subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paramAccount1Subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paramAccount1Subtype").toString()));
      }
      if ((jsonObj.get("paramAccount1Type") != null && !jsonObj.get("paramAccount1Type").isJsonNull()) && !jsonObj.get("paramAccount1Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paramAccount1Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paramAccount1Type").toString()));
      }
      if ((jsonObj.get("paramAccount2Subtype") != null && !jsonObj.get("paramAccount2Subtype").isJsonNull()) && !jsonObj.get("paramAccount2Subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paramAccount2Subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paramAccount2Subtype").toString()));
      }
      if ((jsonObj.get("paramAccount2Type") != null && !jsonObj.get("paramAccount2Type").isJsonNull()) && !jsonObj.get("paramAccount2Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paramAccount2Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paramAccount2Type").toString()));
      }
      if (!jsonObj.get("transactionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LedgerTransactionRuleParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LedgerTransactionRuleParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LedgerTransactionRuleParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LedgerTransactionRuleParams.class));

       return (TypeAdapter<T>) new TypeAdapter<LedgerTransactionRuleParams>() {
           @Override
           public void write(JsonWriter out, LedgerTransactionRuleParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LedgerTransactionRuleParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LedgerTransactionRuleParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LedgerTransactionRuleParams
  * @throws IOException if the JSON string is invalid with respect to LedgerTransactionRuleParams
  */
  public static LedgerTransactionRuleParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LedgerTransactionRuleParams.class);
  }

 /**
  * Convert an instance of LedgerTransactionRuleParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

