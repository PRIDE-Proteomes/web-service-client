package uk.ac.ebi.pride.proteomes.web;

import com.sun.jersey.api.client.GenericType;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.ApiClient;
import uk.ac.ebi.pride.proteomes.web.Configuration;
import uk.ac.ebi.pride.proteomes.web.client.*;
import uk.ac.ebi.pride.proteomes.web.Pair;

import uk.ac.ebi.pride.proteomes.web.client.ProteinGroup;
import uk.ac.ebi.pride.proteomes.web.client.ProteinGroupList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class ProteingroupcontrollerApi {
  private ApiClient apiClient;

  public ProteingroupcontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProteingroupcontrollerApi(ApiClient apiClient) {
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
   * 
   * @param id id (required)
   * @param uniquePeptides uniquePeptides (optional, default to true)
   * @return ProteinGroup
   * @throws ApiException if fails to make API call
   */
  public ProteinGroup getByIdUsingGET5(String id, Boolean uniquePeptides) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getByIdUsingGET5");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinGroup> localVarReturnType = new GenericType<ProteinGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinGroupListForProtein
   * 
   * @param acc acc (required)
   * @return ProteinGroupList
   * @throws ApiException if fails to make API call
   */
  public ProteinGroupList getProteinGroupListForProteinUsingGET(String acc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'acc' is set
    if (acc == null) {
      throw new ApiException(400, "Missing the required parameter 'acc' when calling getProteinGroupListForProteinUsingGET");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinGroupList> localVarReturnType = new GenericType<ProteinGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinGroupList
   * 
   * @param species species (optional, default to 9606)
   * @param page page (optional, default to 0)
   * @param pageSize pageSize (optional, default to 100)
   * @return ProteinGroupList
   * @throws ApiException if fails to make API call
   */
  public ProteinGroupList getProteinGroupListUsingGET(Integer species, Integer page, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinGroupList> localVarReturnType = new GenericType<ProteinGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
