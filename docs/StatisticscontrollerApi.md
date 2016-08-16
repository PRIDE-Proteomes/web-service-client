# StatisticscontrollerApi

All URIs are relative to *https://localhost:9190/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSummaryUsingGET1**](StatisticscontrollerApi.md#getSummaryUsingGET1) | **GET** /stats/summary | getSummary


<a name="getSummaryUsingGET1"></a>
# **getSummaryUsingGET1**
> Statistics getSummaryUsingGET1()

getSummary

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.StatisticscontrollerApi;


StatisticscontrollerApi apiInstance = new StatisticscontrollerApi();
try {
    Statistics result = apiInstance.getSummaryUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticscontrollerApi#getSummaryUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Statistics**](Statistics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

