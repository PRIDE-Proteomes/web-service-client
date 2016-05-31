# PeptideApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getById**](PeptideApi.md#getById) | **GET** /peptide/{sequence} | getById
[**getPeptideList**](PeptideApi.md#getPeptideList) | **GET** /peptide/list | getPeptideList
[**getPeptideListForProtein**](PeptideApi.md#getPeptideListForProtein) | **GET** /peptide/list/protein/{acc} | getPeptideListForProtein


<a name="getById"></a>
# **getById**
> PeptideList getById(sequence, species, tissue, mod, includeDetails)

getById

getById

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeptideApi;


PeptideApi apiInstance = new PeptideApi();
String sequence = "sequence_example"; // String | sequence
Integer species = 9606; // Integer | species
String tissue = "any"; // String | tissueName
String mod = "any"; // String | modName
Boolean includeDetails = true; // Boolean | includeDetails
try {
    PeptideList result = apiInstance.getById(sequence, species, tissue, mod, includeDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeptideApi#getById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sequence** | **String**| sequence |
 **species** | **Integer**| species | [default to 9606]
 **tissue** | **String**| tissueName | [default to any]
 **mod** | **String**| modName | [default to any]
 **includeDetails** | **Boolean**| includeDetails | [default to true]

### Return type

[**PeptideList**](PeptideList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeptideList"></a>
# **getPeptideList**
> PeptideList getPeptideList(species, tissue, mod, page, pageSize)

getPeptideList

getPeptideList

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeptideApi;


PeptideApi apiInstance = new PeptideApi();
Integer species = 9606; // Integer | species
String tissue = "any"; // String | tissueName
String mod = "any"; // String | modName
Integer page = 0; // Integer | page
Integer pageSize = 100; // Integer | pageSize
try {
    PeptideList result = apiInstance.getPeptideList(species, tissue, mod, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeptideApi#getPeptideList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **Integer**| species | [default to 9606]
 **tissue** | **String**| tissueName | [default to any]
 **mod** | **String**| modName | [default to any]
 **page** | **Integer**| page | [default to 0]
 **pageSize** | **Integer**| pageSize | [default to 100]

### Return type

[**PeptideList**](PeptideList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeptideListForProtein"></a>
# **getPeptideListForProtein**
> PeptideList getPeptideListForProtein(acc, tissue, mod)

getPeptideListForProtein

getPeptideListForProtein

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeptideApi;


PeptideApi apiInstance = new PeptideApi();
String acc = "acc_example"; // String | acc
String tissue = "any"; // String | tissueName
String mod = "any"; // String | modName
try {
    PeptideList result = apiInstance.getPeptideListForProtein(acc, tissue, mod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeptideApi#getPeptideListForProtein");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acc** | **String**| acc |
 **tissue** | **String**| tissueName | [default to any]
 **mod** | **String**| modName | [default to any]

### Return type

[**PeptideList**](PeptideList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

