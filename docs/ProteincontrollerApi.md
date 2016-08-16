# ProteincontrollerApi

All URIs are relative to *https://localhost:9190/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getByIdUsingGET3**](ProteincontrollerApi.md#getByIdUsingGET3) | **GET** /protein/{id} | getById
[**getProteinCountUsingGET1**](ProteincontrollerApi.md#getProteinCountUsingGET1) | **GET** /protein/count | getProteinCount
[**getProteinListForPeptideUsingGET**](ProteincontrollerApi.md#getProteinListForPeptideUsingGET) | **GET** /protein/list/peptide/{sequence} | getProteinListForPeptide
[**getProteinListUsingGET1**](ProteincontrollerApi.md#getProteinListUsingGET1) | **GET** /protein/list | getProteinList


<a name="getByIdUsingGET3"></a>
# **getByIdUsingGET3**
> Protein getByIdUsingGET3(id, includeDetails)

getById

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ProteincontrollerApi;


ProteincontrollerApi apiInstance = new ProteincontrollerApi();
String id = "id_example"; // String | id
Boolean includeDetails = true; // Boolean | includeDetails
try {
    Protein result = apiInstance.getByIdUsingGET3(id, includeDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteincontrollerApi#getByIdUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **includeDetails** | **Boolean**| includeDetails | [optional] [default to true]

### Return type

[**Protein**](Protein.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProteinCountUsingGET1"></a>
# **getProteinCountUsingGET1**
> Long getProteinCountUsingGET1(species, tissue, mod)

getProteinCount

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ProteincontrollerApi;


ProteincontrollerApi apiInstance = new ProteincontrollerApi();
String species = "9606"; // String | species
String tissue = "any"; // String | tissue
String mod = "any"; // String | mod
try {
    Long result = apiInstance.getProteinCountUsingGET1(species, tissue, mod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteincontrollerApi#getProteinCountUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| species | [optional] [default to 9606]
 **tissue** | **String**| tissue | [optional] [default to any]
 **mod** | **String**| mod | [optional] [default to any]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProteinListForPeptideUsingGET"></a>
# **getProteinListForPeptideUsingGET**
> ProteinList getProteinListForPeptideUsingGET(sequence, species, includeSequence)

getProteinListForPeptide

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ProteincontrollerApi;


ProteincontrollerApi apiInstance = new ProteincontrollerApi();
String sequence = "sequence_example"; // String | sequence
Integer species = 9606; // Integer | species
Boolean includeSequence = false; // Boolean | includeSequence
try {
    ProteinList result = apiInstance.getProteinListForPeptideUsingGET(sequence, species, includeSequence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteincontrollerApi#getProteinListForPeptideUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequence** | **String**| sequence |
 **species** | **Integer**| species | [optional] [default to 9606]
 **includeSequence** | **Boolean**| includeSequence | [optional] [default to false]

### Return type

[**ProteinList**](ProteinList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProteinListUsingGET1"></a>
# **getProteinListUsingGET1**
> ProteinList getProteinListUsingGET1(species, tissue, mod, includeSequence, page, pageSize)

getProteinList

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ProteincontrollerApi;


ProteincontrollerApi apiInstance = new ProteincontrollerApi();
String species = "9606"; // String | species
String tissue = "any"; // String | tissue
String mod = "any"; // String | mod
Boolean includeSequence = false; // Boolean | includeSequence
Integer page = 0; // Integer | page
Integer pageSize = 100; // Integer | pageSize
try {
    ProteinList result = apiInstance.getProteinListUsingGET1(species, tissue, mod, includeSequence, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteincontrollerApi#getProteinListUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| species | [optional] [default to 9606]
 **tissue** | **String**| tissue | [optional] [default to any]
 **mod** | **String**| mod | [optional] [default to any]
 **includeSequence** | **Boolean**| includeSequence | [optional] [default to false]
 **page** | **Integer**| page | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 100]

### Return type

[**ProteinList**](ProteinList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

