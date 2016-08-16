# SamplecontrollerApi

All URIs are relative to *https://localhost:9190/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countTissuesUsingGET**](SamplecontrollerApi.md#countTissuesUsingGET) | **GET** /sample/tissues/count/species/{species} | countTissues
[**getSpeciesUsingGET1**](SamplecontrollerApi.md#getSpeciesUsingGET1) | **GET** /sample/species | getSpecies
[**getTissuesUsingGET**](SamplecontrollerApi.md#getTissuesUsingGET) | **GET** /sample/tissues/list/species/{species} | getTissues
[**getTissuesUsingGET3**](SamplecontrollerApi.md#getTissuesUsingGET3) | **GET** /sample/tissues/list | getTissues


<a name="countTissuesUsingGET"></a>
# **countTissuesUsingGET**
> Integer countTissuesUsingGET(species)

countTissues

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.SamplecontrollerApi;


SamplecontrollerApi apiInstance = new SamplecontrollerApi();
String species = "9606"; // String | species
try {
    Integer result = apiInstance.countTissuesUsingGET(species);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamplecontrollerApi#countTissuesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| species | [optional] [default to 9606]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSpeciesUsingGET1"></a>
# **getSpeciesUsingGET1**
> SpeciesList getSpeciesUsingGET1()

getSpecies

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.SamplecontrollerApi;


SamplecontrollerApi apiInstance = new SamplecontrollerApi();
try {
    SpeciesList result = apiInstance.getSpeciesUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamplecontrollerApi#getSpeciesUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SpeciesList**](SpeciesList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTissuesUsingGET"></a>
# **getTissuesUsingGET**
> TissueList getTissuesUsingGET(species)

getTissues

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.SamplecontrollerApi;


SamplecontrollerApi apiInstance = new SamplecontrollerApi();
String species = "9606"; // String | species
try {
    TissueList result = apiInstance.getTissuesUsingGET(species);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamplecontrollerApi#getTissuesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| species | [optional] [default to 9606]

### Return type

[**TissueList**](TissueList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTissuesUsingGET3"></a>
# **getTissuesUsingGET3**
> TissueList getTissuesUsingGET3()

getTissues

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.SamplecontrollerApi;


SamplecontrollerApi apiInstance = new SamplecontrollerApi();
try {
    TissueList result = apiInstance.getTissuesUsingGET3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SamplecontrollerApi#getTissuesUsingGET3");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TissueList**](TissueList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

