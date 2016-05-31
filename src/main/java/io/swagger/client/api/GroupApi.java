package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.ProteinGroup;
import io.swagger.client.model.ProteinGroupList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class GroupApi {
  private ApiClient apiClient;

  public GroupApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getById
   * getById
   * @param id id (required)
   * @param uniquePeptides uniquePeptides (required)
   * @return ProteinGroup
   * @throws ApiException if fails to make API call
   */
  public ProteinGroup getById(String id, Boolean uniquePeptides) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getById");
    }
    
    // verify the required parameter 'uniquePeptides' is set
    if (uniquePeptides == null) {
      throw new ApiException(400, "Missing the required parameter 'uniquePeptides' when calling getById");
    }
    
    // create path and map variables
    String localVarPath = "/group/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uniquePeptides", uniquePeptides));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinGroup> localVarReturnType = new GenericType<ProteinGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinGroupList
   * getProteinGroupList
   * @param species species (required)
   * @param page page (required)
   * @param pageSize pageSize (required)
   * @return ProteinGroupList
   * @throws ApiException if fails to make API call
   */
  public ProteinGroupList getProteinGroupList(Integer species, Integer page, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'species' is set
    if (species == null) {
      throw new ApiException(400, "Missing the required parameter 'species' when calling getProteinGroupList");
    }
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getProteinGroupList");
    }
    
    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(400, "Missing the required parameter 'pageSize' when calling getProteinGroupList");
    }
    
    // create path and map variables
    String localVarPath = "/group/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "species", species));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinGroupList> localVarReturnType = new GenericType<ProteinGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinGroupListForProtein
   * getProteinGroupListForProtein
   * @param acc acc (required)
   * @return ProteinGroupList
   * @throws ApiException if fails to make API call
   */
  public ProteinGroupList getProteinGroupListForProtein(String acc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'acc' is set
    if (acc == null) {
      throw new ApiException(400, "Missing the required parameter 'acc' when calling getProteinGroupListForProtein");
    }
    
    // create path and map variables
    String localVarPath = "/group/list/protein/{acc}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "acc" + "\\}", apiClient.escapeString(acc.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinGroupList> localVarReturnType = new GenericType<ProteinGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
