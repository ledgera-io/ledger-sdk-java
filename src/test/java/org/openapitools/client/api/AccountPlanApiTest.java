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
import org.openapitools.client.model.AccountPlanAccountPlan;
import org.openapitools.client.model.AccountPlanCreateAccountPlan;
import org.openapitools.client.model.ExceptionEntityNotFound;
import org.openapitools.client.model.HttpBulkCreateAccountPlan;
import org.openapitools.client.model.HttpHttpUnprocessableEntity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountPlanApi
 */
@Disabled
public class AccountPlanApiTest {

    private final AccountPlanApi api = new AccountPlanApi();

    /**
     * Bulk create account plan
     *
     * Bulk create account plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AccountPlanBulkPostTest() throws ApiException {
        String id = null;
        HttpBulkCreateAccountPlan response = api.v1AccountPlanBulkPost(id);
        // TODO: test validations
    }

    /**
     * List account plan
     *
     * List account plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AccountPlanGetTest() throws ApiException {
        List<AccountPlanAccountPlan> response = api.v1AccountPlanGet();
        // TODO: test validations
    }

    /**
     * Delete account plan
     *
     * Delete account plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AccountPlanIdDeleteTest() throws ApiException {
        String id = null;
        AccountPlanAccountPlan response = api.v1AccountPlanIdDelete(id);
        // TODO: test validations
    }

    /**
     * Get account plan
     *
     * Get account plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AccountPlanIdGetTest() throws ApiException {
        String id = null;
        AccountPlanAccountPlan response = api.v1AccountPlanIdGet(id);
        // TODO: test validations
    }

    /**
     * Update account plan
     *
     * Update account plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AccountPlanIdPutTest() throws ApiException {
        String id = null;
        AccountPlanAccountPlan response = api.v1AccountPlanIdPut(id);
        // TODO: test validations
    }

    /**
     * Create account plan
     *
     * Create account plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1AccountPlanPostTest() throws ApiException {
        AccountPlanCreateAccountPlan plan = null;
        AccountPlanAccountPlan response = api.v1AccountPlanPost(plan);
        // TODO: test validations
    }

}