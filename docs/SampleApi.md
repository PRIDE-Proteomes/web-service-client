# SampleApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countTissues**](SampleApi.md#countTissues) | **GET** /sample/tissues/count/species/${species} | countTissues
[**getSpecies**](SampleApi.md#getSpecies) | **GET** /sample/species | getSpecies
[**getTissues**](SampleApi.md#getTissues) | **GET** /sample/tissues/list | getTissues
[**getTissues_0**](SampleApi.md#getTissues_0) | **GET** /sample/tissues/list/species/${species} | getTissues


<a name="countTissues"></a>
# **countTissues**
> Integer countTissues(species)

countTissues

countTissues

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SampleApi;


SampleApi apiInstance = new SampleApi();
String species = "9606"; // String | speciesName
try {
    Integer result = apiInstance.countTissues(species);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SampleApi#countTissues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| speciesName | [optional] [default to 9606]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpecies"></a>
# **getSpecies**
> SpeciesList getSpecies()

getSpecies

getSpecies

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SampleApi;


SampleApi apiInstance = new SampleApi();
try {
    SpeciesList result = apiInstance.getSpecies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SampleApi#getSpecies");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTissues"></a>
# **getTissues**
> TissueList getTissues()

getTissues

getTissues

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SampleApi;


SampleApi apiInstance = new SampleApi();
try {
    TissueList result = apiInstance.getTissues();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SampleApi#getTissues");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTissues_0"></a>
# **getTissues_0**
> TissueList getTissues_0(species)

getTissues

getTissues

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SampleApi;


SampleApi apiInstance = new SampleApi();
String species = "9606"; // String | speciesName
try {
    TissueList result = apiInstance.getTissues_0(species);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SampleApi#getTissues_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| speciesName | [optional] [default to 9606]

### Return type

[**TissueList**](TissueList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

