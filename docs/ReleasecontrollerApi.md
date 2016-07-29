# ReleasecontrollerApi

All URIs are relative to *https://wwwdev.ebi.ac.uk/pride/ws/proteomes*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReleaseSummaryForSpeciesUsingGET**](ReleasecontrollerApi.md#getReleaseSummaryForSpeciesUsingGET) | **GET** /release/summary/species/{species} | getReleaseSummaryForSpecies
[**getReleaseSummaryUsingGET1**](ReleasecontrollerApi.md#getReleaseSummaryUsingGET1) | **GET** /release/summary/list | getReleaseSummary


<a name="getReleaseSummaryForSpeciesUsingGET"></a>
# **getReleaseSummaryForSpeciesUsingGET**
> ReleaseSummary getReleaseSummaryForSpeciesUsingGET(species)

getReleaseSummaryForSpecies

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ReleasecontrollerApi;


ReleasecontrollerApi apiInstance = new ReleasecontrollerApi();
String species = "9606"; // String | species
try {
    ReleaseSummary result = apiInstance.getReleaseSummaryForSpeciesUsingGET(species);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasecontrollerApi#getReleaseSummaryForSpeciesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| species | [optional] [default to 9606]

### Return type

[**ReleaseSummary**](ReleaseSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReleaseSummaryUsingGET1"></a>
# **getReleaseSummaryUsingGET1**
> ReleaseSummaryList getReleaseSummaryUsingGET1()

getReleaseSummary

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ReleasecontrollerApi;


ReleasecontrollerApi apiInstance = new ReleasecontrollerApi();
try {
    ReleaseSummaryList result = apiInstance.getReleaseSummaryUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasecontrollerApi#getReleaseSummaryUsingGET1");
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

