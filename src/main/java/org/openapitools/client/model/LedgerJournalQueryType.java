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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ledger.JournalQueryType
 */
@JsonAdapter(LedgerJournalQueryType.Adapter.class)
public enum LedgerJournalQueryType {
  
  JournalQueryTypeDebit("DEBIT"),
  
  JournalQueryTypeCredit("CREDIT");

  private String value;

  LedgerJournalQueryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LedgerJournalQueryType fromValue(String value) {
    for (LedgerJournalQueryType b : LedgerJournalQueryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LedgerJournalQueryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LedgerJournalQueryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LedgerJournalQueryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LedgerJournalQueryType.fromValue(value);
    }
  }
}

