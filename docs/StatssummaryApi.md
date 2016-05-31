# StatssummaryApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSummary**](StatssummaryApi.md#getSummary) | **GET** /stats/summary | getSummary


<a name="getSummary"></a>
# **getSummary**
> Statistics getSummary()

getSummary

getSummary

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatssummaryApi;


StatssummaryApi apiInstance = new StatssummaryApi();
try {
    Statistics result = apiInstance.getSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatssummaryApi#getSummary");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

