package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.PeptideList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class PeptideApi {
  private ApiClient apiClient;

  public PeptideApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PeptideApi(ApiClient apiClient) {
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
   * @param sequence sequence (required)
   * @param species species (required)
   * @param tissue tissueName (required)
   * @param mod modName (required)
   * @param includeDetails includeDetails (required)
   * @return PeptideList
   * @throws ApiException if fails to make API call
   */
  public PeptideList getById(String sequence, Integer species, String tissue, String mod, Boolean includeDetails) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sequence' is set
    if (sequence == null) {
      throw new ApiException(400, "Missing the required parameter 'sequence' when calling getById");
    }
    
    // verify the required parameter 'species' is set
    if (species == null) {
      throw new ApiException(400, "Missing the required parameter 'species' when calling getById");
    }
    
    // verify the required parameter 'tissue' is set
    if (tissue == null) {
      throw new ApiException(400, "Missing the required parameter 'tissue' when calling getById");
    }
    
    // verify the required parameter 'mod' is set
    if (mod == null) {
      throw new ApiException(400, "Missing the required parameter 'mod' when calling getById");
    }
    
    // verify the required parameter 'includeDetails' is set
    if (includeDetails == null) {
      throw new ApiException(400, "Missing the required parameter 'includeDetails' when calling getById");
    }
    
    // create path and map variables
    String localVarPath = "/peptide/{sequence}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequence" + "\\}", apiClient.escapeString(sequence.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "species", species));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tissue", tissue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mod", mod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDetails", includeDetails));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PeptideList> localVarReturnType = new GenericType<PeptideList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getPeptideList
   * getPeptideList
   * @param species species (required)
   * @param tissue tissueName (required)
   * @param mod modName (required)
   * @param page page (required)
   * @param pageSize pageSize (required)
   * @return PeptideList
   * @throws ApiException if fails to make API call
   */
  public PeptideList getPeptideList(Integer species, String tissue, String mod, Integer page, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'species' is set
    if (species == null) {
      throw new ApiException(400, "Missing the required parameter 'species' when calling getPeptideList");
    }
    
    // verify the required parameter 'tissue' is set
    if (tissue == null) {
      throw new ApiException(400, "Missing the required parameter 'tissue' when calling getPeptideList");
    }
    
    // verify the required parameter 'mod' is set
    if (mod == null) {
      throw new ApiException(400, "Missing the required parameter 'mod' when calling getPeptideList");
    }
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getPeptideList");
    }
    
    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(400, "Missing the required parameter 'pageSize' when calling getPeptideList");
    }
    
    // create path and map variables
    String localVarPath = "/peptide/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "species", species));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tissue", tissue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mod", mod));
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

    GenericType<PeptideList> localVarReturnType = new GenericType<PeptideList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getPeptideListForProtein
   * getPeptideListForProtein
   * @param acc acc (required)
   * @param tissue tissueName (required)
   * @param mod modName (required)
   * @return PeptideList
   * @throws ApiException if fails to make API call
   */
  public PeptideList getPeptideListForProtein(String acc, String tissue, String mod) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'acc' is set
    if (acc == null) {
      throw new ApiException(400, "Missing the required parameter 'acc' when calling getPeptideListForProtein");
    }
    
    // verify the required parameter 'tissue' is set
    if (tissue == null) {
      throw new ApiException(400, "Missing the required parameter 'tissue' when calling getPeptideListForProtein");
    }
    
    // verify the required parameter 'mod' is set
    if (mod == null) {
      throw new ApiException(400, "Missing the required parameter 'mod' when calling getPeptideListForProtein");
    }
    
    // create path and map variables
    String localVarPath = "/peptide/list/protein/{acc}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "acc" + "\\}", apiClient.escapeString(acc.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tissue", tissue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mod", mod));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PeptideList> localVarReturnType = new GenericType<PeptideList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
