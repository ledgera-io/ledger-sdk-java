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
import org.openapitools.client.model.AccountPlanBalanceType;
import org.openapitools.client.model.AccountPlanBalanceValidation;

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
 * AccountPlanAccountPlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T23:32:57.881559-03:00[America/Sao_Paulo]")
public class AccountPlanAccountPlan {
  public static final String SERIALIZED_NAME_BALANCE_TYPE = "balanceType";
  @SerializedName(SERIALIZED_NAME_BALANCE_TYPE)
  private AccountPlanBalanceType balanceType;

  public static final String SERIALIZED_NAME_BALANCE_VALIDATION = "balanceValidation";
  @SerializedName(SERIALIZED_NAME_BALANCE_VALIDATION)
  private AccountPlanBalanceValidation balanceValidation;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_UNIQUE = "isUnique";
  @SerializedName(SERIALIZED_NAME_IS_UNIQUE)
  private Boolean isUnique;

  public static final String SERIALIZED_NAME_SUB_TYPE = "subType";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private String subType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AccountPlanAccountPlan() {
  }

  public AccountPlanAccountPlan balanceType(AccountPlanBalanceType balanceType) {
    
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Get balanceType
   * @return balanceType
  **/
  @javax.annotation.Nullable

  public AccountPlanBalanceType getBalanceType() {
    return balanceType;
  }


  public void setBalanceType(AccountPlanBalanceType balanceType) {
    this.balanceType = balanceType;
  }


  public AccountPlanAccountPlan balanceValidation(AccountPlanBalanceValidation balanceValidation) {
    
    this.balanceValidation = balanceValidation;
    return this;
  }

   /**
   * Get balanceValidation
   * @return balanceValidation
  **/
  @javax.annotation.Nullable

  public AccountPlanBalanceValidation getBalanceValidation() {
    return balanceValidation;
  }


  public void setBalanceValidation(AccountPlanBalanceValidation balanceValidation) {
    this.balanceValidation = balanceValidation;
  }


  public AccountPlanAccountPlan createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public AccountPlanAccountPlan deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }


  public AccountPlanAccountPlan id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AccountPlanAccountPlan isUnique(Boolean isUnique) {
    
    this.isUnique = isUnique;
    return this;
  }

   /**
   * Get isUnique
   * @return isUnique
  **/
  @javax.annotation.Nullable

  public Boolean getIsUnique() {
    return isUnique;
  }


  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }


  public AccountPlanAccountPlan subType(String subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @javax.annotation.Nullable

  public String getSubType() {
    return subType;
  }


  public void setSubType(String subType) {
    this.subType = subType;
  }


  public AccountPlanAccountPlan type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPlanAccountPlan accountPlanAccountPlan = (AccountPlanAccountPlan) o;
    return Objects.equals(this.balanceType, accountPlanAccountPlan.balanceType) &&
        Objects.equals(this.balanceValidation, accountPlanAccountPlan.balanceValidation) &&
        Objects.equals(this.createdAt, accountPlanAccountPlan.createdAt) &&
        Objects.equals(this.deletedAt, accountPlanAccountPlan.deletedAt) &&
        Objects.equals(this.id, accountPlanAccountPlan.id) &&
        Objects.equals(this.isUnique, accountPlanAccountPlan.isUnique) &&
        Objects.equals(this.subType, accountPlanAccountPlan.subType) &&
        Objects.equals(this.type, accountPlanAccountPlan.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceType, balanceValidation, createdAt, deletedAt, id, isUnique, subType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPlanAccountPlan {\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    balanceValidation: ").append(toIndentedString(balanceValidation)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("balanceType");
    openapiFields.add("balanceValidation");
    openapiFields.add("createdAt");
    openapiFields.add("deletedAt");
    openapiFields.add("id");
    openapiFields.add("isUnique");
    openapiFields.add("subType");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountPlanAccountPlan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountPlanAccountPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountPlanAccountPlan is not found in the empty JSON string", AccountPlanAccountPlan.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountPlanAccountPlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountPlanAccountPlan` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("deletedAt") != null && !jsonObj.get("deletedAt").isJsonNull()) && !jsonObj.get("deletedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deletedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deletedAt").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("subType") != null && !jsonObj.get("subType").isJsonNull()) && !jsonObj.get("subType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subType").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountPlanAccountPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountPlanAccountPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountPlanAccountPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountPlanAccountPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountPlanAccountPlan>() {
           @Override
           public void write(JsonWriter out, AccountPlanAccountPlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountPlanAccountPlan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountPlanAccountPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountPlanAccountPlan
  * @throws IOException if the JSON string is invalid with respect to AccountPlanAccountPlan
  */
  public static AccountPlanAccountPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountPlanAccountPlan.class);
  }

 /**
  * Convert an instance of AccountPlanAccountPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
