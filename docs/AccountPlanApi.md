# AccountPlanApi

All URIs are relative to *https://api.ledgera*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AccountPlanBulkPost**](AccountPlanApi.md#v1AccountPlanBulkPost) | **POST** /v1/account-plan/bulk | Bulk create account plan |
| [**v1AccountPlanGet**](AccountPlanApi.md#v1AccountPlanGet) | **GET** /v1/account-plan | List account plan |
| [**v1AccountPlanIdDelete**](AccountPlanApi.md#v1AccountPlanIdDelete) | **DELETE** /v1/account-plan/{id} | Delete account plan |
| [**v1AccountPlanIdGet**](AccountPlanApi.md#v1AccountPlanIdGet) | **GET** /v1/account-plan/{id} | Get account plan |
| [**v1AccountPlanIdPut**](AccountPlanApi.md#v1AccountPlanIdPut) | **PUT** /v1/account-plan/{id} | Update account plan |
| [**v1AccountPlanPost**](AccountPlanApi.md#v1AccountPlanPost) | **POST** /v1/account-plan | Create account plan |


<a name="v1AccountPlanBulkPost"></a>
# **v1AccountPlanBulkPost**
> HttpBulkCreateAccountPlan v1AccountPlanBulkPost(id)

Bulk create account plan

Bulk create account plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountPlanApi apiInstance = new AccountPlanApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      HttpBulkCreateAccountPlan result = apiInstance.v1AccountPlanBulkPost(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountPlanApi#v1AccountPlanBulkPost");
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
| **id** | **String**|  | |

### Return type

[**HttpBulkCreateAccountPlan**](HttpBulkCreateAccountPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | validation error |  -  |

<a name="v1AccountPlanGet"></a>
# **v1AccountPlanGet**
> List&lt;AccountPlanAccountPlan&gt; v1AccountPlanGet()

List account plan

List account plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountPlanApi apiInstance = new AccountPlanApi(defaultClient);
    try {
      List<AccountPlanAccountPlan> result = apiInstance.v1AccountPlanGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountPlanApi#v1AccountPlanGet");
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

[**List&lt;AccountPlanAccountPlan&gt;**](AccountPlanAccountPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="v1AccountPlanIdDelete"></a>
# **v1AccountPlanIdDelete**
> AccountPlanAccountPlan v1AccountPlanIdDelete(id)

Delete account plan

Delete account plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountPlanApi apiInstance = new AccountPlanApi(defaultClient);
    String id = "id_example"; // String | Plan ID
    try {
      AccountPlanAccountPlan result = apiInstance.v1AccountPlanIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountPlanApi#v1AccountPlanIdDelete");
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
| **id** | **String**| Plan ID | |

### Return type

[**AccountPlanAccountPlan**](AccountPlanAccountPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | account plan not found |  -  |

<a name="v1AccountPlanIdGet"></a>
# **v1AccountPlanIdGet**
> AccountPlanAccountPlan v1AccountPlanIdGet(id)

Get account plan

Get account plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountPlanApi apiInstance = new AccountPlanApi(defaultClient);
    String id = "id_example"; // String | Plan ID
    try {
      AccountPlanAccountPlan result = apiInstance.v1AccountPlanIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountPlanApi#v1AccountPlanIdGet");
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
| **id** | **String**| Plan ID | |

### Return type

[**AccountPlanAccountPlan**](AccountPlanAccountPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="v1AccountPlanIdPut"></a>
# **v1AccountPlanIdPut**
> AccountPlanAccountPlan v1AccountPlanIdPut(id)

Update account plan

Update account plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountPlanApi apiInstance = new AccountPlanApi(defaultClient);
    String id = "id_example"; // String | Plan ID
    try {
      AccountPlanAccountPlan result = apiInstance.v1AccountPlanIdPut(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountPlanApi#v1AccountPlanIdPut");
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
| **id** | **String**| Plan ID | |

### Return type

[**AccountPlanAccountPlan**](AccountPlanAccountPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | account plan not found |  -  |

<a name="v1AccountPlanPost"></a>
# **v1AccountPlanPost**
> AccountPlanAccountPlan v1AccountPlanPost(plan)

Create account plan

Create account plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountPlanApi apiInstance = new AccountPlanApi(defaultClient);
    AccountPlanCreateAccountPlan plan = new AccountPlanCreateAccountPlan(); // AccountPlanCreateAccountPlan | Account plan JSON
    try {
      AccountPlanAccountPlan result = apiInstance.v1AccountPlanPost(plan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountPlanApi#v1AccountPlanPost");
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
| **plan** | [**AccountPlanCreateAccountPlan**](AccountPlanCreateAccountPlan.md)| Account plan JSON | |

### Return type

[**AccountPlanAccountPlan**](AccountPlanAccountPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

