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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.HttpHttpConflict;
import org.openapitools.client.model.HttpHttpNotFound;
import org.openapitools.client.model.HttpHttpUnprocessableEntity;
import org.openapitools.client.model.LedgerTransaction;
import org.openapitools.client.model.LedgerTransactionParams;
import org.openapitools.client.model.LedgerTransactionProcessed;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionApi
 */
@Disabled
public class TransactionApiTest {

    private final TransactionApi api = new TransactionApi();

    /**
     * Get transaction
     *
     * Get transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1TransactionIdGetTest() throws ApiException {
        String id = null;
        LedgerTransaction response = api.v1TransactionIdGet(id);
        // TODO: test validations
    }

    /**
     * Create transaction
     *
     * Create transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1TransactionPostTest() throws ApiException {
        LedgerTransactionParams transaction = null;
        LedgerTransactionProcessed response = api.v1TransactionPost(transaction);
        // TODO: test validations
    }

    /**
     * Create raw transaction
     *
     * Create raw transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1TransactionRawPostTest() throws ApiException {
        LedgerTransactionParams transaction = null;
        LedgerTransactionProcessed response = api.v1TransactionRawPost(transaction);
        // TODO: test validations
    }

}
