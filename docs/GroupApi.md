# GroupApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getById**](GroupApi.md#getById) | **GET** /group/{id} | getById
[**getProteinGroupList**](GroupApi.md#getProteinGroupList) | **GET** /group/list | getProteinGroupList
[**getProteinGroupListForProtein**](GroupApi.md#getProteinGroupListForProtein) | **GET** /group/list/protein/{acc} | getProteinGroupListForProtein


<a name="getById"></a>
# **getById**
> ProteinGroup getById(id, uniquePeptides)

getById

getById

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String id = "id_example"; // String | id
Boolean uniquePeptides = true; // Boolean | uniquePeptides
try {
    ProteinGroup result = apiInstance.getById(id, uniquePeptides);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **uniquePeptides** | **Boolean**| uniquePeptides | [default to true]

### Return type

[**ProteinGroup**](ProteinGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProteinGroupList"></a>
# **getProteinGroupList**
> ProteinGroupList getProteinGroupList(species, page, pageSize)

getProteinGroupList

getProteinGroupList

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer species = 9606; // Integer | species
Integer page = 0; // Integer | page
Integer pageSize = 100; // Integer | pageSize
try {
    ProteinGroupList result = apiInstance.getProteinGroupList(species, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getProteinGroupList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **species** | **Integer**| species | [default to 9606]
 **page** | **Integer**| page | [default to 0]
 **pageSize** | **Integer**| pageSize | [default to 100]

### Return type

[**ProteinGroupList**](ProteinGroupList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProteinGroupListForProtein"></a>
# **getProteinGroupListForProtein**
> ProteinGroupList getProteinGroupListForProtein(acc)

getProteinGroupListForProtein

getProteinGroupListForProtein

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String acc = "acc_example"; // String | acc
try {
    ProteinGroupList result = apiInstance.getProteinGroupListForProtein(acc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getProteinGroupListForProtein");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

