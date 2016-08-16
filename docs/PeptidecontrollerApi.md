# PeptidecontrollerApi

All URIs are relative to *https://localhost:9190/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getByIdUsingGET1**](PeptidecontrollerApi.md#getByIdUsingGET1) | **GET** /peptide/{sequence} | getById
[**getPeptideListForProteinUsingGET1**](PeptidecontrollerApi.md#getPeptideListForProteinUsingGET1) | **GET** /peptide/list/protein/{acc} | getPeptideListForProtein
[**getPeptideListUsingGET**](PeptidecontrollerApi.md#getPeptideListUsingGET) | **GET** /peptide/list | getPeptideList


<a name="getByIdUsingGET1"></a>
# **getByIdUsingGET1**
> PeptideList getByIdUsingGET1(sequence, species, tissue, mod, includeDetails)

getById

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.PeptidecontrollerApi;


PeptidecontrollerApi apiInstance = new PeptidecontrollerApi();
String sequence = "sequence_example"; // String | sequence
Integer species = 9606; // Integer | species
String tissue = "any"; // String | tissue
String mod = "any"; // String | mod
Boolean includeDetails = true; // Boolean | includeDetails
try {
    PeptideList result = apiInstance.getByIdUsingGET1(sequence, species, tissue, mod, includeDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeptidecontrollerApi#getByIdUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequence** | **String**| sequence |
 **species** | **Integer**| species | [optional] [default to 9606]
 **tissue** | **String**| tissue | [optional] [default to any]
 **mod** | **String**| mod | [optional] [default to any]
 **includeDetails** | **Boolean**| includeDetails | [optional] [default to true]

### Return type

[**PeptideList**](PeptideList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPeptideListForProteinUsingGET1"></a>
# **getPeptideListForProteinUsingGET1**
> PeptideList getPeptideListForProteinUsingGET1(acc, tissue, mod)

getPeptideListForProtein

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.PeptidecontrollerApi;


PeptidecontrollerApi apiInstance = new PeptidecontrollerApi();
String acc = "acc_example"; // String | acc
String tissue = "any"; // String | tissue
String mod = "any"; // String | mod
try {
    PeptideList result = apiInstance.getPeptideListForProteinUsingGET1(acc, tissue, mod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeptidecontrollerApi#getPeptideListForProteinUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acc** | **String**| acc |
 **tissue** | **String**| tissue | [optional] [default to any]
 **mod** | **String**| mod | [optional] [default to any]

### Return type

[**PeptideList**](PeptideList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPeptideListUsingGET"></a>
# **getPeptideListUsingGET**
> PeptideList getPeptideListUsingGET(species, tissue, mod, page, pageSize)

getPeptideList

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.PeptidecontrollerApi;


PeptidecontrollerApi apiInstance = new PeptidecontrollerApi();
Integer species = 9606; // Integer | species
String tissue = "any"; // String | tissue
String mod = "any"; // String | mod
Integer page = 0; // Integer | page
Integer pageSize = 100; // Integer | pageSize
try {
    PeptideList result = apiInstance.getPeptideListUsingGET(species, tissue, mod, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeptidecontrollerApi#getPeptideListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **Integer**| species | [optional] [default to 9606]
 **tissue** | **String**| tissue | [optional] [default to any]
 **mod** | **String**| mod | [optional] [default to any]
 **page** | **Integer**| page | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 100]

### Return type

[**PeptideList**](PeptideList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

