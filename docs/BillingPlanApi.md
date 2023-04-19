# BillingPlanApi

All URIs are relative to *https://api.ledgera*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1BillingBillingPlanIdGet**](BillingPlanApi.md#v1BillingBillingPlanIdGet) | **GET** /v1/billing/{billingPlanId} | Get billing plan by ID |
| [**v1BillingBillingPlanIdPut**](BillingPlanApi.md#v1BillingBillingPlanIdPut) | **PUT** /v1/billing/{billingPlanId} | Update billing plan |
| [**v1BillingBulkPost**](BillingPlanApi.md#v1BillingBulkPost) | **POST** /v1/billing/bulk | Create billing plan |
| [**v1BillingGet**](BillingPlanApi.md#v1BillingGet) | **GET** /v1/billing | List billing |
| [**v1BillingPost**](BillingPlanApi.md#v1BillingPost) | **POST** /v1/billing | Create billing plan |


<a name="v1BillingBillingPlanIdGet"></a>
# **v1BillingBillingPlanIdGet**
> BillingBillingPlan v1BillingBillingPlanIdGet(billingPlanId)

Get billing plan by ID

Get billing plan by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    BillingPlanApi apiInstance = new BillingPlanApi(defaultClient);
    String billingPlanId = "billingPlanId_example"; // String | Billing plan ID
    try {
      BillingBillingPlan result = apiInstance.v1BillingBillingPlanIdGet(billingPlanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPlanApi#v1BillingBillingPlanIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **billingPlanId** | **String**| Billing plan ID | |

### Return type

[**BillingBillingPlan**](BillingBillingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | billing plan not found |  -  |

<a name="v1BillingBillingPlanIdPut"></a>
# **v1BillingBillingPlanIdPut**
> BillingBillingPlan v1BillingBillingPlanIdPut(billingPlanId)

Update billing plan

Update billing plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    BillingPlanApi apiInstance = new BillingPlanApi(defaultClient);
    String billingPlanId = "billingPlanId_example"; // String | Billing plan ID
    try {
      BillingBillingPlan result = apiInstance.v1BillingBillingPlanIdPut(billingPlanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPlanApi#v1BillingBillingPlanIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **billingPlanId** | **String**| Billing plan ID | |

### Return type

[**BillingBillingPlan**](BillingBillingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | billing plan not found |  -  |

<a name="v1BillingBulkPost"></a>
# **v1BillingBulkPost**
> List&lt;BillingBillingPlan&gt; v1BillingBulkPost(currency)

Create billing plan

Create billing plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    BillingPlanApi apiInstance = new BillingPlanApi(defaultClient);
    BillingCreateBulkBilling currency = new BillingCreateBulkBilling(); // BillingCreateBulkBilling | Billing JSON
    try {
      List<BillingBillingPlan> result = apiInstance.v1BillingBulkPost(currency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPlanApi#v1BillingBulkPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currency** | [**BillingCreateBulkBilling**](BillingCreateBulkBilling.md)| Billing JSON | |

### Return type

[**List&lt;BillingBillingPlan&gt;**](BillingBillingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | validation error |  -  |

<a name="v1BillingGet"></a>
# **v1BillingGet**
> List&lt;BillingBillingPlan&gt; v1BillingGet()

List billing

List billing

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    BillingPlanApi apiInstance = new BillingPlanApi(defaultClient);
    try {
      List<BillingBillingPlan> result = apiInstance.v1BillingGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPlanApi#v1BillingGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BillingBillingPlan&gt;**](BillingBillingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="v1BillingPost"></a>
# **v1BillingPost**
> BillingBillingPlan v1BillingPost(currency)

Create billing plan

Create billing plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    BillingPlanApi apiInstance = new BillingPlanApi(defaultClient);
    BillingCreateBilling currency = new BillingCreateBilling(); // BillingCreateBilling | Billing JSON
    try {
      BillingBillingPlan result = apiInstance.v1BillingPost(currency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPlanApi#v1BillingPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currency** | [**BillingCreateBilling**](BillingCreateBilling.md)| Billing JSON | |

### Return type

[**BillingBillingPlan**](BillingBillingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | validation error |  -  |

