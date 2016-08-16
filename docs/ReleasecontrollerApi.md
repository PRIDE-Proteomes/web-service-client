# ReleasecontrollerApi

All URIs are relative to *https://localhost:9190/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReleaseSummaryForSpeciesUsingGET1**](ReleasecontrollerApi.md#getReleaseSummaryForSpeciesUsingGET1) | **GET** /release/summary/species/{species} | getReleaseSummaryForSpecies
[**getReleaseSummaryUsingGET**](ReleasecontrollerApi.md#getReleaseSummaryUsingGET) | **GET** /release/summary/list | getReleaseSummary


<a name="getReleaseSummaryForSpeciesUsingGET1"></a>
# **getReleaseSummaryForSpeciesUsingGET1**
> ReleaseSummary getReleaseSummaryForSpeciesUsingGET1(species)

getReleaseSummaryForSpecies

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ReleasecontrollerApi;


ReleasecontrollerApi apiInstance = new ReleasecontrollerApi();
String species = "species_example"; // String | species
try {
    ReleaseSummary result = apiInstance.getReleaseSummaryForSpeciesUsingGET1(species);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasecontrollerApi#getReleaseSummaryForSpeciesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| species |

### Return type

[**ReleaseSummary**](ReleaseSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReleaseSummaryUsingGET"></a>
# **getReleaseSummaryUsingGET**
> ReleaseSummaryList getReleaseSummaryUsingGET()

getReleaseSummary

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ReleasecontrollerApi;


ReleasecontrollerApi apiInstance = new ReleasecontrollerApi();
try {
    ReleaseSummaryList result = apiInstance.getReleaseSummaryUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasecontrollerApi#getReleaseSummaryUsingGET");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

