# TransactionRuleApi

All URIs are relative to *https://api.ledgera*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1TransactionRuleBulkPost**](TransactionRuleApi.md#v1TransactionRuleBulkPost) | **POST** /v1/transaction/rule/bulk | Create transaction rule |
| [**v1TransactionRuleGet**](TransactionRuleApi.md#v1TransactionRuleGet) | **GET** /v1/transaction/rule | List transaction rule |
| [**v1TransactionRulePost**](TransactionRuleApi.md#v1TransactionRulePost) | **POST** /v1/transaction/rule | Create transaction rule |


<a name="v1TransactionRuleBulkPost"></a>
# **v1TransactionRuleBulkPost**
> List&lt;LedgerTransactionRule&gt; v1TransactionRuleBulkPost(transaction)

Create transaction rule

Create transaction rule

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    TransactionRuleApi apiInstance = new TransactionRuleApi(defaultClient);
    List<LedgerTransactionRule> transaction = Arrays.asList(); // List<LedgerTransactionRule> | Transaction rule JSON
    try {
      List<LedgerTransactionRule> result = apiInstance.v1TransactionRuleBulkPost(transaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRuleApi#v1TransactionRuleBulkPost");
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
| **transaction** | [**List&lt;LedgerTransactionRule&gt;**](LedgerTransactionRule.md)| Transaction rule JSON | |

### Return type

[**List&lt;LedgerTransactionRule&gt;**](LedgerTransactionRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="v1TransactionRuleGet"></a>
# **v1TransactionRuleGet**
> List&lt;LedgerTransactionRule&gt; v1TransactionRuleGet()

List transaction rule

List transaction rule

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    TransactionRuleApi apiInstance = new TransactionRuleApi(defaultClient);
    try {
      List<LedgerTransactionRule> result = apiInstance.v1TransactionRuleGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRuleApi#v1TransactionRuleGet");
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

[**List&lt;LedgerTransactionRule&gt;**](LedgerTransactionRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="v1TransactionRulePost"></a>
# **v1TransactionRulePost**
> LedgerTransactionRule v1TransactionRulePost(transaction)

Create transaction rule

Create transaction rule

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ledgera");

    TransactionRuleApi apiInstance = new TransactionRuleApi(defaultClient);
    LedgerTransactionRuleParams transaction = new LedgerTransactionRuleParams(); // LedgerTransactionRuleParams | Transaction rule JSON
    try {
      LedgerTransactionRule result = apiInstance.v1TransactionRulePost(transaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRuleApi#v1TransactionRulePost");
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
| **transaction** | [**LedgerTransactionRuleParams**](LedgerTransactionRuleParams.md)| Transaction rule JSON | |

### Return type

[**LedgerTransactionRule**](LedgerTransactionRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

