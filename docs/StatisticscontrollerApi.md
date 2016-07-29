# StatisticscontrollerApi

All URIs are relative to *https://wwwdev.ebi.ac.uk/pride/ws/proteomes*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSummaryUsingGET**](StatisticscontrollerApi.md#getSummaryUsingGET) | **GET** /stats/summary | getSummary


<a name="getSummaryUsingGET"></a>
# **getSummaryUsingGET**
> Statistics getSummaryUsingGET()

getSummary

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.StatisticscontrollerApi;


StatisticscontrollerApi apiInstance = new StatisticscontrollerApi();
try {
    Statistics result = apiInstance.getSummaryUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticscontrollerApi#getSummaryUsingGET");
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

