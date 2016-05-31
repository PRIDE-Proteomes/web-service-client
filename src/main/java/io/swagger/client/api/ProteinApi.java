package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.ModelVoid;
import io.swagger.client.model.Protein;
import io.swagger.client.model.ProteinList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-31T11:21:02.134+01:00")
public class ProteinApi {
  private ApiClient apiClient;

  public ProteinApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProteinApi(ApiClient apiClient) {
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
   * @param includeDetails includeDetails (required)
   * @return Protein
   * @throws ApiException if fails to make API call
   */
  public Protein getById(String id, Boolean includeDetails) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getById");
    }
    
    // verify the required parameter 'includeDetails' is set
    if (includeDetails == null) {
      throw new ApiException(400, "Missing the required parameter 'includeDetails' when calling getById");
    }
    
    // create path and map variables
    String localVarPath = "/protein/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDetails", includeDetails));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Protein> localVarReturnType = new GenericType<Protein>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinCount
   * getProteinCount
   * @param species speciesName (required)
   * @param tissue tissueName (optional, default to any)
   * @param mod modName (optional, default to any)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long getProteinCount(String species, String tissue, String mod) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'species' is set
    if (species == null) {
      throw new ApiException(400, "Missing the required parameter 'species' when calling getProteinCount");
    }
    
    // create path and map variables
    String localVarPath = "/protein/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "species", species));
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

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinList
   * getProteinList
   * @param species speciesName (required)
   * @param page page (required)
   * @param pageSize pageSize (required)
   * @param tissue tissueName (optional, default to any)
   * @param mod modName (optional, default to any)
   * @param includeSequence includeSequence (optional, default to false)
   * @return ProteinList
   * @throws ApiException if fails to make API call
   */
  public ProteinList getProteinList(String species, Integer page, Integer pageSize, String tissue, String mod, Boolean includeSequence) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'species' is set
    if (species == null) {
      throw new ApiException(400, "Missing the required parameter 'species' when calling getProteinList");
    }
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getProteinList");
    }
    
    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(400, "Missing the required parameter 'pageSize' when calling getProteinList");
    }
    
    // create path and map variables
    String localVarPath = "/protein/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "species", species));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tissue", tissue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mod", mod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSequence", includeSequence));
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

    GenericType<ProteinList> localVarReturnType = new GenericType<ProteinList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinListForPeptide
   * getProteinListForPeptide
   * @param sequence sequence (required)
   * @param species species (required)
   * @param includeSequence includeSequence (required)
   * @return ProteinList
   * @throws ApiException if fails to make API call
   */
  public ProteinList getProteinListForPeptide(String sequence, Integer species, Boolean includeSequence) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sequence' is set
    if (sequence == null) {
      throw new ApiException(400, "Missing the required parameter 'sequence' when calling getProteinListForPeptide");
    }
    
    // verify the required parameter 'species' is set
    if (species == null) {
      throw new ApiException(400, "Missing the required parameter 'species' when calling getProteinListForPeptide");
    }
    
    // verify the required parameter 'includeSequence' is set
    if (includeSequence == null) {
      throw new ApiException(400, "Missing the required parameter 'includeSequence' when calling getProteinListForPeptide");
    }
    
    // create path and map variables
    String localVarPath = "/protein/list/peptide/{sequence}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequence" + "\\}", apiClient.escapeString(sequence.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "species", species));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSequence", includeSequence));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinList> localVarReturnType = new GenericType<ProteinList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
