# AccountApi

All URIs are relative to *https://api.ledgera*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1AccountIdBalancesGet**](AccountApi.md#v1AccountIdBalancesGet) | **GET** /v1/account/{id}/balances | Get a account balances |
| [**v1AccountIdGet**](AccountApi.md#v1AccountIdGet) | **GET** /v1/account/{id} | Get a account from id |
| [**v1AccountIdJournalGet**](AccountApi.md#v1AccountIdJournalGet) | **GET** /v1/account/{id}/journal | Get a account journal |
| [**v1AccountPost**](AccountApi.md#v1AccountPost) | **POST** /v1/account | Create a account |
| [**v1CurrencyGet**](AccountApi.md#v1CurrencyGet) | **GET** /v1/currency | Get a ledger currencies |
| [**v1CurrencyPost**](AccountApi.md#v1CurrencyPost) | **POST** /v1/currency | Get a ledger currencies |


<a name="v1AccountIdBalancesGet"></a>
# **v1AccountIdBalancesGet**
> HelperPaginatedArrayLedgerBalance v1AccountIdBalancesGet(id)

Get a account balances

Get account balances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String id = "id_example"; // String | Account ID
    try {
      HelperPaginatedArrayLedgerBalance result = apiInstance.v1AccountIdBalancesGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountIdBalancesGet");
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
| **id** | **String**| Account ID | |

### Return type

[**HelperPaginatedArrayLedgerBalance**](HelperPaginatedArrayLedgerBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | account not found |  -  |

<a name="v1AccountIdGet"></a>
# **v1AccountIdGet**
> HelperPaginatedLedgerAccount v1AccountIdGet(id)

Get a account from id

Get account account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String id = "id_example"; // String | Account ID
    try {
      HelperPaginatedLedgerAccount result = apiInstance.v1AccountIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountIdGet");
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
| **id** | **String**| Account ID | |

### Return type

[**HelperPaginatedLedgerAccount**](HelperPaginatedLedgerAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | account not found |  -  |

<a name="v1AccountIdJournalGet"></a>
# **v1AccountIdJournalGet**
> HelperPaginatedArrayLedgerJournalEntry v1AccountIdJournalGet(id, cursor, dateFrom, dateTo, type, limit)

Get a account journal

Get account journal

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String id = "id_example"; // String | Account ID
    String cursor = "cursor_example"; // String | 
    String dateFrom = "dateFrom_example"; // String | 
    String dateTo = "dateTo_example"; // String | 
    String type = "DEBIT"; // String | 
    Integer limit = 56; // Integer | 
    try {
      HelperPaginatedArrayLedgerJournalEntry result = apiInstance.v1AccountIdJournalGet(id, cursor, dateFrom, dateTo, type, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountIdJournalGet");
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
| **id** | **String**| Account ID | |
| **cursor** | **String**|  | [optional] |
| **dateFrom** | **String**|  | [optional] |
| **dateTo** | **String**|  | [optional] |
| **type** | **String**|  | [optional] [enum: DEBIT, CREDIT] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**HelperPaginatedArrayLedgerJournalEntry**](HelperPaginatedArrayLedgerJournalEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | account not found |  -  |

<a name="v1AccountPost"></a>
# **v1AccountPost**
> LedgerAccount v1AccountPost(account)

Create a account

Create account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountApi apiInstance = new AccountApi(defaultClient);
    HttpRegisterAccount account = new HttpRegisterAccount(); // HttpRegisterAccount | Account JSON
    try {
      LedgerAccount result = apiInstance.v1AccountPost(account);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountPost");
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
| **account** | [**HttpRegisterAccount**](HttpRegisterAccount.md)| Account JSON | |

### Return type

[**LedgerAccount**](LedgerAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | account plan not found |  -  |
| **422** | validation error |  -  |

<a name="v1CurrencyGet"></a>
# **v1CurrencyGet**
> HelperPaginatedArrayLedgerCurrency v1CurrencyGet()

Get a ledger currencies

Get ledger currencies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      HelperPaginatedArrayLedgerCurrency result = apiInstance.v1CurrencyGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1CurrencyGet");
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

[**HelperPaginatedArrayLedgerCurrency**](HelperPaginatedArrayLedgerCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="v1CurrencyPost"></a>
# **v1CurrencyPost**
> LedgerCurrency v1CurrencyPost(currency)

Get a ledger currencies

Get ledger currencies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    AccountApi apiInstance = new AccountApi(defaultClient);
    HttpCurrencyParams currency = new HttpCurrencyParams(); // HttpCurrencyParams | Currency JSON
    try {
      LedgerCurrency result = apiInstance.v1CurrencyPost(currency);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1CurrencyPost");
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
| **currency** | [**HttpCurrencyParams**](HttpCurrencyParams.md)| Currency JSON | |

### Return type

[**LedgerCurrency**](LedgerCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

