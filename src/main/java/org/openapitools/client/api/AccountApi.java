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


import org.openapitools.client.model.ExceptionEntityNotFound;
import org.openapitools.client.model.HelperPaginatedArrayLedgerBalance;
import org.openapitools.client.model.HelperPaginatedArrayLedgerCurrency;
import org.openapitools.client.model.HelperPaginatedArrayLedgerJournalEntry;
import org.openapitools.client.model.HelperPaginatedLedgerAccount;
import org.openapitools.client.model.HttpCurrencyParams;
import org.openapitools.client.model.HttpHttpUnprocessableEntity;
import org.openapitools.client.model.HttpRegisterAccount;
import org.openapitools.client.model.LedgerAccount;
import org.openapitools.client.model.LedgerCurrency;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountApi(ApiClient apiClient) {
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
     * Build call for v1AccountIdBalancesGet
     * @param id Account ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountIdBalancesGetCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/account/{id}/balances"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call v1AccountIdBalancesGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling v1AccountIdBalancesGet(Async)");
        }

        return v1AccountIdBalancesGetCall(id, _callback);

    }

    /**
     * Get a account balances
     * Get account balances
     * @param id Account ID (required)
     * @return HelperPaginatedArrayLedgerBalance
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public HelperPaginatedArrayLedgerBalance v1AccountIdBalancesGet(String id) throws ApiException {
        ApiResponse<HelperPaginatedArrayLedgerBalance> localVarResp = v1AccountIdBalancesGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get a account balances
     * Get account balances
     * @param id Account ID (required)
     * @return ApiResponse&lt;HelperPaginatedArrayLedgerBalance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HelperPaginatedArrayLedgerBalance> v1AccountIdBalancesGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = v1AccountIdBalancesGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<HelperPaginatedArrayLedgerBalance>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a account balances (asynchronously)
     * Get account balances
     * @param id Account ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountIdBalancesGetAsync(String id, final ApiCallback<HelperPaginatedArrayLedgerBalance> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1AccountIdBalancesGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<HelperPaginatedArrayLedgerBalance>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1AccountIdGet
     * @param id Account ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountIdGetCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/account/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call v1AccountIdGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling v1AccountIdGet(Async)");
        }

        return v1AccountIdGetCall(id, _callback);

    }

    /**
     * Get a account from id
     * Get account account
     * @param id Account ID (required)
     * @return HelperPaginatedLedgerAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public HelperPaginatedLedgerAccount v1AccountIdGet(String id) throws ApiException {
        ApiResponse<HelperPaginatedLedgerAccount> localVarResp = v1AccountIdGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get a account from id
     * Get account account
     * @param id Account ID (required)
     * @return ApiResponse&lt;HelperPaginatedLedgerAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HelperPaginatedLedgerAccount> v1AccountIdGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = v1AccountIdGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<HelperPaginatedLedgerAccount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a account from id (asynchronously)
     * Get account account
     * @param id Account ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountIdGetAsync(String id, final ApiCallback<HelperPaginatedLedgerAccount> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1AccountIdGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<HelperPaginatedLedgerAccount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1AccountIdJournalGet
     * @param id Account ID (required)
     * @param cursor  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param type  (optional)
     * @param limit  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountIdJournalGetCall(String id, String cursor, String dateFrom, String dateTo, String type, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/account/{id}/journal"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (dateFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_from", dateFrom));
        }

        if (dateTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_to", dateTo));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

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
    private okhttp3.Call v1AccountIdJournalGetValidateBeforeCall(String id, String cursor, String dateFrom, String dateTo, String type, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling v1AccountIdJournalGet(Async)");
        }

        return v1AccountIdJournalGetCall(id, cursor, dateFrom, dateTo, type, limit, _callback);

    }

    /**
     * Get a account journal
     * Get account journal
     * @param id Account ID (required)
     * @param cursor  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param type  (optional)
     * @param limit  (optional)
     * @return HelperPaginatedArrayLedgerJournalEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public HelperPaginatedArrayLedgerJournalEntry v1AccountIdJournalGet(String id, String cursor, String dateFrom, String dateTo, String type, Integer limit) throws ApiException {
        ApiResponse<HelperPaginatedArrayLedgerJournalEntry> localVarResp = v1AccountIdJournalGetWithHttpInfo(id, cursor, dateFrom, dateTo, type, limit);
        return localVarResp.getData();
    }

    /**
     * Get a account journal
     * Get account journal
     * @param id Account ID (required)
     * @param cursor  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param type  (optional)
     * @param limit  (optional)
     * @return ApiResponse&lt;HelperPaginatedArrayLedgerJournalEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HelperPaginatedArrayLedgerJournalEntry> v1AccountIdJournalGetWithHttpInfo(String id, String cursor, String dateFrom, String dateTo, String type, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = v1AccountIdJournalGetValidateBeforeCall(id, cursor, dateFrom, dateTo, type, limit, null);
        Type localVarReturnType = new TypeToken<HelperPaginatedArrayLedgerJournalEntry>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a account journal (asynchronously)
     * Get account journal
     * @param id Account ID (required)
     * @param cursor  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param type  (optional)
     * @param limit  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountIdJournalGetAsync(String id, String cursor, String dateFrom, String dateTo, String type, Integer limit, final ApiCallback<HelperPaginatedArrayLedgerJournalEntry> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1AccountIdJournalGetValidateBeforeCall(id, cursor, dateFrom, dateTo, type, limit, _callback);
        Type localVarReturnType = new TypeToken<HelperPaginatedArrayLedgerJournalEntry>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1AccountPost
     * @param account Account JSON (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account plan not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> validation error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountPostCall(HttpRegisterAccount account, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = account;

        // create path and map variables
        String localVarPath = "/v1/account";

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
    private okhttp3.Call v1AccountPostValidateBeforeCall(HttpRegisterAccount account, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling v1AccountPost(Async)");
        }

        return v1AccountPostCall(account, _callback);

    }

    /**
     * Create a account
     * Create account
     * @param account Account JSON (required)
     * @return LedgerAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account plan not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> validation error </td><td>  -  </td></tr>
     </table>
     */
    public LedgerAccount v1AccountPost(HttpRegisterAccount account) throws ApiException {
        ApiResponse<LedgerAccount> localVarResp = v1AccountPostWithHttpInfo(account);
        return localVarResp.getData();
    }

    /**
     * Create a account
     * Create account
     * @param account Account JSON (required)
     * @return ApiResponse&lt;LedgerAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account plan not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> validation error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LedgerAccount> v1AccountPostWithHttpInfo(HttpRegisterAccount account) throws ApiException {
        okhttp3.Call localVarCall = v1AccountPostValidateBeforeCall(account, null);
        Type localVarReturnType = new TypeToken<LedgerAccount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a account (asynchronously)
     * Create account
     * @param account Account JSON (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> account plan not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> validation error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AccountPostAsync(HttpRegisterAccount account, final ApiCallback<LedgerAccount> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1AccountPostValidateBeforeCall(account, _callback);
        Type localVarReturnType = new TypeToken<LedgerAccount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1CurrencyGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1CurrencyGetCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/currency";

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
    private okhttp3.Call v1CurrencyGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return v1CurrencyGetCall(_callback);

    }

    /**
     * Get a ledger currencies
     * Get ledger currencies
     * @return HelperPaginatedArrayLedgerCurrency
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public HelperPaginatedArrayLedgerCurrency v1CurrencyGet() throws ApiException {
        ApiResponse<HelperPaginatedArrayLedgerCurrency> localVarResp = v1CurrencyGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get a ledger currencies
     * Get ledger currencies
     * @return ApiResponse&lt;HelperPaginatedArrayLedgerCurrency&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HelperPaginatedArrayLedgerCurrency> v1CurrencyGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = v1CurrencyGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<HelperPaginatedArrayLedgerCurrency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a ledger currencies (asynchronously)
     * Get ledger currencies
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1CurrencyGetAsync(final ApiCallback<HelperPaginatedArrayLedgerCurrency> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1CurrencyGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<HelperPaginatedArrayLedgerCurrency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1CurrencyPost
     * @param currency Currency JSON (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1CurrencyPostCall(HttpCurrencyParams currency, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = currency;

        // create path and map variables
        String localVarPath = "/v1/currency";

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
    private okhttp3.Call v1CurrencyPostValidateBeforeCall(HttpCurrencyParams currency, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling v1CurrencyPost(Async)");
        }

        return v1CurrencyPostCall(currency, _callback);

    }

    /**
     * Get a ledger currencies
     * Get ledger currencies
     * @param currency Currency JSON (required)
     * @return LedgerCurrency
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LedgerCurrency v1CurrencyPost(HttpCurrencyParams currency) throws ApiException {
        ApiResponse<LedgerCurrency> localVarResp = v1CurrencyPostWithHttpInfo(currency);
        return localVarResp.getData();
    }

    /**
     * Get a ledger currencies
     * Get ledger currencies
     * @param currency Currency JSON (required)
     * @return ApiResponse&lt;LedgerCurrency&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LedgerCurrency> v1CurrencyPostWithHttpInfo(HttpCurrencyParams currency) throws ApiException {
        okhttp3.Call localVarCall = v1CurrencyPostValidateBeforeCall(currency, null);
        Type localVarReturnType = new TypeToken<LedgerCurrency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a ledger currencies (asynchronously)
     * Get ledger currencies
     * @param currency Currency JSON (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1CurrencyPostAsync(HttpCurrencyParams currency, final ApiCallback<LedgerCurrency> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1CurrencyPostValidateBeforeCall(currency, _callback);
        Type localVarReturnType = new TypeToken<LedgerCurrency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
