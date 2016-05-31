# ModslistApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getModifications**](ModslistApi.md#getModifications) | **GET** /mods/list | getModifications


<a name="getModifications"></a>
# **getModifications**
> String getModifications(detail)

getModifications

getModifications

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ModslistApi;


ModslistApi apiInstance = new ModslistApi();
Boolean detail = false; // Boolean | detail
try {
    String result = apiInstance.getModifications(detail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModslistApi#getModifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **detail** | **Boolean**| detail | [optional] [default to false]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

