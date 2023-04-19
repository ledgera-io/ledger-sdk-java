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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.LedgerTransactionRule;
import org.openapitools.client.model.LedgerTransactionRuleParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransactionRuleApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionRuleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionRuleApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for v1TransactionRuleBulkPost
     * @param transaction Transaction rule JSON (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1TransactionRuleBulkPostCall(List<LedgerTransactionRule> transaction, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = transaction;

        // create path and map variables
        String localVarPath = "/v1/transaction/rule/bulk";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1TransactionRuleBulkPostValidateBeforeCall(List<LedgerTransactionRule> transaction, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transaction' is set
        if (transaction == null) {
            throw new ApiException("Missing the required parameter 'transaction' when calling v1TransactionRuleBulkPost(Async)");
        }

        return v1TransactionRuleBulkPostCall(transaction, _callback);

    }

    /**
     * Create transaction rule
     * Create transaction rule
     * @param transaction Transaction rule JSON (required)
     * @return List&lt;LedgerTransactionRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public List<LedgerTransactionRule> v1TransactionRuleBulkPost(List<LedgerTransactionRule> transaction) throws ApiException {
        ApiResponse<List<LedgerTransactionRule>> localVarResp = v1TransactionRuleBulkPostWithHttpInfo(transaction);
        return localVarResp.getData();
    }

    /**
     * Create transaction rule
     * Create transaction rule
     * @param transaction Transaction rule JSON (required)
     * @return ApiResponse&lt;List&lt;LedgerTransactionRule&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LedgerTransactionRule>> v1TransactionRuleBulkPostWithHttpInfo(List<LedgerTransactionRule> transaction) throws ApiException {
        okhttp3.Call localVarCall = v1TransactionRuleBulkPostValidateBeforeCall(transaction, null);
        Type localVarReturnType = new TypeToken<List<LedgerTransactionRule>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create transaction rule (asynchronously)
     * Create transaction rule
     * @param transaction Transaction rule JSON (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1TransactionRuleBulkPostAsync(List<LedgerTransactionRule> transaction, final ApiCallback<List<LedgerTransactionRule>> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1TransactionRuleBulkPostValidateBeforeCall(transaction, _callback);
        Type localVarReturnType = new TypeToken<List<LedgerTransactionRule>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1TransactionRuleGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1TransactionRuleGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/transaction/rule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1TransactionRuleGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return v1TransactionRuleGetCall(_callback);

    }

    /**
     * List transaction rule
     * List transaction rule
     * @return List&lt;LedgerTransactionRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<LedgerTransactionRule> v1TransactionRuleGet() throws ApiException {
        ApiResponse<List<LedgerTransactionRule>> localVarResp = v1TransactionRuleGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List transaction rule
     * List transaction rule
     * @return ApiResponse&lt;List&lt;LedgerTransactionRule&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LedgerTransactionRule>> v1TransactionRuleGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = v1TransactionRuleGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<LedgerTransactionRule>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List transaction rule (asynchronously)
     * List transaction rule
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1TransactionRuleGetAsync(final ApiCallback<List<LedgerTransactionRule>> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1TransactionRuleGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<LedgerTransactionRule>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1TransactionRulePost
     * @param transaction Transaction rule JSON (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1TransactionRulePostCall(LedgerTransactionRuleParams transaction, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = transaction;

        // create path and map variables
        String localVarPath = "/v1/transaction/rule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1TransactionRulePostValidateBeforeCall(LedgerTransactionRuleParams transaction, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transaction' is set
        if (transaction == null) {
            throw new ApiException("Missing the required parameter 'transaction' when calling v1TransactionRulePost(Async)");
        }

        return v1TransactionRulePostCall(transaction, _callback);

    }

    /**
     * Create transaction rule
     * Create transaction rule
     * @param transaction Transaction rule JSON (required)
     * @return LedgerTransactionRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public LedgerTransactionRule v1TransactionRulePost(LedgerTransactionRuleParams transaction) throws ApiException {
        ApiResponse<LedgerTransactionRule> localVarResp = v1TransactionRulePostWithHttpInfo(transaction);
        return localVarResp.getData();
    }

    /**
     * Create transaction rule
     * Create transaction rule
     * @param transaction Transaction rule JSON (required)
     * @return ApiResponse&lt;LedgerTransactionRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LedgerTransactionRule> v1TransactionRulePostWithHttpInfo(LedgerTransactionRuleParams transaction) throws ApiException {
        okhttp3.Call localVarCall = v1TransactionRulePostValidateBeforeCall(transaction, null);
        Type localVarReturnType = new TypeToken<LedgerTransactionRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create transaction rule (asynchronously)
     * Create transaction rule
     * @param transaction Transaction rule JSON (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1TransactionRulePostAsync(LedgerTransactionRuleParams transaction, final ApiCallback<LedgerTransactionRule> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1TransactionRulePostValidateBeforeCall(transaction, _callback);
        Type localVarReturnType = new TypeToken<LedgerTransactionRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}