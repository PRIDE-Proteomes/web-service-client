# ReleasesummaryApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReleaseSummary**](ReleasesummaryApi.md#getReleaseSummary) | **GET** /release/summary/list | getReleaseSummary
[**getReleaseSummaryForSpecies**](ReleasesummaryApi.md#getReleaseSummaryForSpecies) | **GET** /release/summary/species/${species} | getReleaseSummaryForSpecies


<a name="getReleaseSummary"></a>
# **getReleaseSummary**
> ReleaseSummaryList getReleaseSummary()

getReleaseSummary

getReleaseSummary

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReleasesummaryApi;


ReleasesummaryApi apiInstance = new ReleasesummaryApi();
try {
    ReleaseSummaryList result = apiInstance.getReleaseSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasesummaryApi#getReleaseSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReleaseSummaryList**](ReleaseSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReleaseSummaryForSpecies"></a>
# **getReleaseSummaryForSpecies**
> ReleaseSummary getReleaseSummaryForSpecies(species)

getReleaseSummaryForSpecies

getReleaseSummaryForSpecies

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReleasesummaryApi;


ReleasesummaryApi apiInstance = new ReleasesummaryApi();
String species = "9606"; // String | speciesName
try {
    ReleaseSummary result = apiInstance.getReleaseSummaryForSpecies(species);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasesummaryApi#getReleaseSummaryForSpecies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| speciesName | [optional] [default to 9606]

### Return type

[**ReleaseSummary**](ReleaseSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

