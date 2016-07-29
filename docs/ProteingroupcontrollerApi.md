# ProteingroupcontrollerApi

All URIs are relative to *https://wwwdev.ebi.ac.uk/pride/ws/proteomes*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getByIdUsingGET5**](ProteingroupcontrollerApi.md#getByIdUsingGET5) | **GET** /group/{id} | getById
[**getProteinGroupListForProteinUsingGET**](ProteingroupcontrollerApi.md#getProteinGroupListForProteinUsingGET) | **GET** /group/list/protein/{acc} | getProteinGroupListForProtein
[**getProteinGroupListUsingGET**](ProteingroupcontrollerApi.md#getProteinGroupListUsingGET) | **GET** /group/list | getProteinGroupList


<a name="getByIdUsingGET5"></a>
# **getByIdUsingGET5**
> ProteinGroup getByIdUsingGET5(id, uniquePeptides)

getById

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ProteingroupcontrollerApi;


ProteingroupcontrollerApi apiInstance = new ProteingroupcontrollerApi();
String id = "id_example"; // String | id
Boolean uniquePeptides = true; // Boolean | uniquePeptides
try {
    ProteinGroup result = apiInstance.getByIdUsingGET5(id, uniquePeptides);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteingroupcontrollerApi#getByIdUsingGET5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **uniquePeptides** | **Boolean**| uniquePeptides | [optional] [default to true]

### Return type

[**ProteinGroup**](ProteinGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProteinGroupListForProteinUsingGET"></a>
# **getProteinGroupListForProteinUsingGET**
> ProteinGroupList getProteinGroupListForProteinUsingGET(acc)

getProteinGroupListForProtein

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ProteingroupcontrollerApi;


ProteingroupcontrollerApi apiInstance = new ProteingroupcontrollerApi();
String acc = "acc_example"; // String | acc
try {
    ProteinGroupList result = apiInstance.getProteinGroupListForProteinUsingGET(acc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteingroupcontrollerApi#getProteinGroupListForProteinUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acc** | **String**| acc |

### Return type

[**ProteinGroupList**](ProteinGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProteinGroupListUsingGET"></a>
# **getProteinGroupListUsingGET**
> ProteinGroupList getProteinGroupListUsingGET(species, page, pageSize)

getProteinGroupList

### Example
```java
// Import classes:
//import uk.ac.ebi.pride.proteomes.web.ApiException;
//import uk.ac.ebi.pride.proteomes.web.ProteingroupcontrollerApi;


ProteingroupcontrollerApi apiInstance = new ProteingroupcontrollerApi();
Integer species = 9606; // Integer | species
Integer page = 0; // Integer | page
Integer pageSize = 100; // Integer | pageSize
try {
    ProteinGroupList result = apiInstance.getProteinGroupListUsingGET(species, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProteingroupcontrollerApi#getProteinGroupListUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **Integer**| species | [optional] [default to 9606]
 **page** | **Integer**| page | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 100]

### Return type

[**ProteinGroupList**](ProteinGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

