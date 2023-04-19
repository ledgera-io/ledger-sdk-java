# openapi-java-client

Ledgera core API
- API version: 2.0
  - Build date: 2023-04-18T23:32:57.881559-03:00[America/Sao_Paulo]

Ledgera servers.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:2.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.ledgera*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**v1AccountIdBalancesGet**](docs/AccountApi.md#v1AccountIdBalancesGet) | **GET** /v1/account/{id}/balances | Get a account balances
*AccountApi* | [**v1AccountIdGet**](docs/AccountApi.md#v1AccountIdGet) | **GET** /v1/account/{id} | Get a account from id
*AccountApi* | [**v1AccountIdJournalGet**](docs/AccountApi.md#v1AccountIdJournalGet) | **GET** /v1/account/{id}/journal | Get a account journal
*AccountApi* | [**v1AccountPost**](docs/AccountApi.md#v1AccountPost) | **POST** /v1/account | Create a account
*AccountApi* | [**v1CurrencyGet**](docs/AccountApi.md#v1CurrencyGet) | **GET** /v1/currency | Get a ledger currencies
*AccountApi* | [**v1CurrencyPost**](docs/AccountApi.md#v1CurrencyPost) | **POST** /v1/currency | Get a ledger currencies
*AccountPlanApi* | [**v1AccountPlanBulkPost**](docs/AccountPlanApi.md#v1AccountPlanBulkPost) | **POST** /v1/account-plan/bulk | Bulk create account plan
*AccountPlanApi* | [**v1AccountPlanGet**](docs/AccountPlanApi.md#v1AccountPlanGet) | **GET** /v1/account-plan | List account plan
*AccountPlanApi* | [**v1AccountPlanIdDelete**](docs/AccountPlanApi.md#v1AccountPlanIdDelete) | **DELETE** /v1/account-plan/{id} | Delete account plan
*AccountPlanApi* | [**v1AccountPlanIdGet**](docs/AccountPlanApi.md#v1AccountPlanIdGet) | **GET** /v1/account-plan/{id} | Get account plan
*AccountPlanApi* | [**v1AccountPlanIdPut**](docs/AccountPlanApi.md#v1AccountPlanIdPut) | **PUT** /v1/account-plan/{id} | Update account plan
*AccountPlanApi* | [**v1AccountPlanPost**](docs/AccountPlanApi.md#v1AccountPlanPost) | **POST** /v1/account-plan | Create account plan
*BillingPlanApi* | [**v1BillingBillingPlanIdGet**](docs/BillingPlanApi.md#v1BillingBillingPlanIdGet) | **GET** /v1/billing/{billingPlanId} | Get billing plan by ID
*BillingPlanApi* | [**v1BillingBillingPlanIdPut**](docs/BillingPlanApi.md#v1BillingBillingPlanIdPut) | **PUT** /v1/billing/{billingPlanId} | Update billing plan
*BillingPlanApi* | [**v1BillingBulkPost**](docs/BillingPlanApi.md#v1BillingBulkPost) | **POST** /v1/billing/bulk | Create billing plan
*BillingPlanApi* | [**v1BillingGet**](docs/BillingPlanApi.md#v1BillingGet) | **GET** /v1/billing | List billing
*BillingPlanApi* | [**v1BillingPost**](docs/BillingPlanApi.md#v1BillingPost) | **POST** /v1/billing | Create billing plan
*TransactionApi* | [**v1TransactionIdGet**](docs/TransactionApi.md#v1TransactionIdGet) | **GET** /v1/transaction/{id} | Get transaction
*TransactionApi* | [**v1TransactionPost**](docs/TransactionApi.md#v1TransactionPost) | **POST** /v1/transaction | Create transaction
*TransactionApi* | [**v1TransactionRawPost**](docs/TransactionApi.md#v1TransactionRawPost) | **POST** /v1/transaction/raw | Create raw transaction
*TransactionRuleApi* | [**v1TransactionRuleBulkPost**](docs/TransactionRuleApi.md#v1TransactionRuleBulkPost) | **POST** /v1/transaction/rule/bulk | Create transaction rule
*TransactionRuleApi* | [**v1TransactionRuleGet**](docs/TransactionRuleApi.md#v1TransactionRuleGet) | **GET** /v1/transaction/rule | List transaction rule
*TransactionRuleApi* | [**v1TransactionRulePost**](docs/TransactionRuleApi.md#v1TransactionRulePost) | **POST** /v1/transaction/rule | Create transaction rule


## Documentation for Models

 - [AccountPlanAccountPlan](docs/AccountPlanAccountPlan.md)
 - [AccountPlanBalanceType](docs/AccountPlanBalanceType.md)
 - [AccountPlanBalanceValidation](docs/AccountPlanBalanceValidation.md)
 - [AccountPlanCreateAccountPlan](docs/AccountPlanCreateAccountPlan.md)
 - [BillingBillingPlan](docs/BillingBillingPlan.md)
 - [BillingBillingPlanMetadata](docs/BillingBillingPlanMetadata.md)
 - [BillingBillingPlanStatus](docs/BillingBillingPlanStatus.md)
 - [BillingBillingTransaction](docs/BillingBillingTransaction.md)
 - [BillingBillingTransactionAmountType](docs/BillingBillingTransactionAmountType.md)
 - [BillingCreateBilling](docs/BillingCreateBilling.md)
 - [BillingCreateBulkBilling](docs/BillingCreateBulkBilling.md)
 - [BillingTransactionEntry](docs/BillingTransactionEntry.md)
 - [ExceptionEntityNotFound](docs/ExceptionEntityNotFound.md)
 - [ExceptionValidationDetails](docs/ExceptionValidationDetails.md)
 - [HelperPaginatedArrayLedgerBalance](docs/HelperPaginatedArrayLedgerBalance.md)
 - [HelperPaginatedArrayLedgerCurrency](docs/HelperPaginatedArrayLedgerCurrency.md)
 - [HelperPaginatedArrayLedgerJournalEntry](docs/HelperPaginatedArrayLedgerJournalEntry.md)
 - [HelperPaginatedLedgerAccount](docs/HelperPaginatedLedgerAccount.md)
 - [HttpBulkCreateAccountPlan](docs/HttpBulkCreateAccountPlan.md)
 - [HttpConflictData](docs/HttpConflictData.md)
 - [HttpCurrencyParams](docs/HttpCurrencyParams.md)
 - [HttpHttpConflict](docs/HttpHttpConflict.md)
 - [HttpHttpNotFound](docs/HttpHttpNotFound.md)
 - [HttpHttpUnprocessableEntity](docs/HttpHttpUnprocessableEntity.md)
 - [HttpRegisterAccount](docs/HttpRegisterAccount.md)
 - [LedgerAccount](docs/LedgerAccount.md)
 - [LedgerBalance](docs/LedgerBalance.md)
 - [LedgerCurrency](docs/LedgerCurrency.md)
 - [LedgerJournalEntry](docs/LedgerJournalEntry.md)
 - [LedgerJournalQueryType](docs/LedgerJournalQueryType.md)
 - [LedgerMessageType](docs/LedgerMessageType.md)
 - [LedgerProcessType](docs/LedgerProcessType.md)
 - [LedgerTransaction](docs/LedgerTransaction.md)
 - [LedgerTransactionParams](docs/LedgerTransactionParams.md)
 - [LedgerTransactionProcessed](docs/LedgerTransactionProcessed.md)
 - [LedgerTransactionRule](docs/LedgerTransactionRule.md)
 - [LedgerTransactionRuleParams](docs/LedgerTransactionRuleParams.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



