# ProteinApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getById**](ProteinApi.md#getById) | **GET** /protein/{id} | getById
[**getProteinCount**](ProteinApi.md#getProteinCount) | **GET** /protein/count | getProteinCount
[**getProteinList**](ProteinApi.md#getProteinList) | **GET** /protein/list | getProteinList
[**getProteinListForPeptide**](ProteinApi.md#getProteinListForPeptide) | **GET** /protein/list/peptide/{sequence} | getProteinListForPeptide


<a name="getById"></a>
# **getById**
> Protein getById(id, includeDetails)

getById

getById

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProteinApi;


ProteinApi apiInstance = new ProteinApi();
String id = "id_example"; // String | id
Boolean includeDetails = true; // Boolean | includeDetails
try {
    Protein result = apiInstance.getById(id, includeDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteinApi#getById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **includeDetails** | **Boolean**| includeDetails | [default to true]

### Return type

[**Protein**](Protein.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProteinCount"></a>
# **getProteinCount**
> Long getProteinCount(species, tissue, mod)

getProteinCount

getProteinCount

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProteinApi;


ProteinApi apiInstance = new ProteinApi();
String species = "9606"; // String | speciesName
String tissue = "any"; // String | tissueName
String mod = "any"; // String | modName
try {
    Long result = apiInstance.getProteinCount(species, tissue, mod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteinApi#getProteinCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| speciesName | [default to 9606]
 **tissue** | **String**| tissueName | [optional] [default to any]
 **mod** | **String**| modName | [optional] [default to any]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProteinList"></a>
# **getProteinList**
> ProteinList getProteinList(species, page, pageSize, tissue, mod, includeSequence)

getProteinList

getProteinList

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProteinApi;


ProteinApi apiInstance = new ProteinApi();
String species = "9606"; // String | speciesName
Integer page = 0; // Integer | page
Integer pageSize = 100; // Integer | pageSize
String tissue = "any"; // String | tissueName
String mod = "any"; // String | modName
Boolean includeSequence = false; // Boolean | includeSequence
try {
    ProteinList result = apiInstance.getProteinList(species, page, pageSize, tissue, mod, includeSequence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteinApi#getProteinList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **String**| speciesName | [default to 9606]
 **page** | **Integer**| page | [default to 0]
 **pageSize** | **Integer**| pageSize | [default to 100]
 **tissue** | **String**| tissueName | [optional] [default to any]
 **mod** | **String**| modName | [optional] [default to any]
 **includeSequence** | **Boolean**| includeSequence | [optional] [default to false]

### Return type

[**ProteinList**](ProteinList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProteinListForPeptide"></a>
# **getProteinListForPeptide**
> ProteinList getProteinListForPeptide(sequence, species, includeSequence)

getProteinListForPeptide

getProteinListForPeptide

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProteinApi;


ProteinApi apiInstance = new ProteinApi();
String sequence = "sequence_example"; // String | sequence
Integer species = 9606; // Integer | species
Boolean includeSequence = false; // Boolean | includeSequence
try {
    ProteinList result = apiInstance.getProteinListForPeptide(sequence, species, includeSequence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteinApi#getProteinListForPeptide");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequence** | **String**| sequence |
 **species** | **Integer**| species | [default to 9606]
 **includeSequence** | **Boolean**| includeSequence | [default to false]

### Return type

[**ProteinList**](ProteinList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

