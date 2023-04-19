# TransactionApi

All URIs are relative to *https://api.ledgera*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1TransactionIdGet**](TransactionApi.md#v1TransactionIdGet) | **GET** /v1/transaction/{id} | Get transaction |
| [**v1TransactionPost**](TransactionApi.md#v1TransactionPost) | **POST** /v1/transaction | Create transaction |
| [**v1TransactionRawPost**](TransactionApi.md#v1TransactionRawPost) | **POST** /v1/transaction/raw | Create raw transaction |


<a name="v1TransactionIdGet"></a>
# **v1TransactionIdGet**
> LedgerTransaction v1TransactionIdGet(id)

Get transaction

Get transaction

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String id = "id_example"; // String | Transaction ID
    try {
      LedgerTransaction result = apiInstance.v1TransactionIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#v1TransactionIdGet");
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
| **id** | **String**| Transaction ID | |

### Return type

[**LedgerTransaction**](LedgerTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Transaction not found |  -  |

<a name="v1TransactionPost"></a>
# **v1TransactionPost**
> LedgerTransactionProcessed v1TransactionPost(transaction)

Create transaction

Create transaction

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    LedgerTransactionParams transaction = new LedgerTransactionParams(); // LedgerTransactionParams | Transaction JSON
    try {
      LedgerTransactionProcessed result = apiInstance.v1TransactionPost(transaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#v1TransactionPost");
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
| **transaction** | [**LedgerTransactionParams**](LedgerTransactionParams.md)| Transaction JSON | |

### Return type

[**LedgerTransactionProcessed**](LedgerTransactionProcessed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **409** | conflict error |  -  |
| **422** | validation error |  -  |

<a name="v1TransactionRawPost"></a>
# **v1TransactionRawPost**
> LedgerTransactionProcessed v1TransactionRawPost(transaction)

Create raw transaction

Create raw transaction

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    LedgerTransactionParams transaction = new LedgerTransactionParams(); // LedgerTransactionParams | Transaction JSON
    try {
      LedgerTransactionProcessed result = apiInstance.v1TransactionRawPost(transaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#v1TransactionRawPost");
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
| **transaction** | [**LedgerTransactionParams**](LedgerTransactionParams.md)| Transaction JSON | |

### Return type

[**LedgerTransactionProcessed**](LedgerTransactionProcessed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **409** | conflict error |  -  |
| **422** | validation error |  -  |

