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
import org.openapitools.client.model.BillingBillingPlan;
import org.openapitools.client.model.BillingCreateBilling;
import org.openapitools.client.model.BillingCreateBulkBilling;
import org.openapitools.client.model.ExceptionEntityNotFound;
import org.openapitools.client.model.HttpHttpUnprocessableEntity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingPlanApi
 */
@Disabled
public class BillingPlanApiTest {

    private final BillingPlanApi api = new BillingPlanApi();

    /**
     * Get billing plan by ID
     *
     * Get billing plan by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1BillingBillingPlanIdGetTest() throws ApiException {
        String billingPlanId = null;
        BillingBillingPlan response = api.v1BillingBillingPlanIdGet(billingPlanId);
        // TODO: test validations
    }

    /**
     * Update billing plan
     *
     * Update billing plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1BillingBillingPlanIdPutTest() throws ApiException {
        String billingPlanId = null;
        BillingBillingPlan response = api.v1BillingBillingPlanIdPut(billingPlanId);
        // TODO: test validations
    }

    /**
     * Create billing plan
     *
     * Create billing plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1BillingBulkPostTest() throws ApiException {
        BillingCreateBulkBilling currency = null;
        List<BillingBillingPlan> response = api.v1BillingBulkPost(currency);
        // TODO: test validations
    }

    /**
     * List billing
     *
     * List billing
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1BillingGetTest() throws ApiException {
        List<BillingBillingPlan> response = api.v1BillingGet();
        // TODO: test validations
    }

    /**
     * Create billing plan
     *
     * Create billing plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1BillingPostTest() throws ApiException {
        BillingCreateBilling currency = null;
        BillingBillingPlan response = api.v1BillingPost(currency);
        // TODO: test validations
    }

}
