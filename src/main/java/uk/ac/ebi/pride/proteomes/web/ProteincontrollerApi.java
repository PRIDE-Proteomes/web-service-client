package uk.ac.ebi.pride.proteomes.web;

import com.sun.jersey.api.client.GenericType;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.ApiClient;
import uk.ac.ebi.pride.proteomes.web.Configuration;
import uk.ac.ebi.pride.proteomes.web.client.*;
import uk.ac.ebi.pride.proteomes.web.Pair;

import uk.ac.ebi.pride.proteomes.web.client.Protein;
import uk.ac.ebi.pride.proteomes.web.client.ProteinList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class ProteincontrollerApi {
  private ApiClient apiClient;

  public ProteincontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProteincontrollerApi(ApiClient apiClient) {
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
   * @param includeDetails includeDetails (optional, default to true)
   * @return Protein
   * @throws ApiException if fails to make API call
   */
  public Protein getByIdUsingGET2(String id, Boolean includeDetails) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getByIdUsingGET2");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Protein> localVarReturnType = new GenericType<Protein>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinCount
   * 
   * @param species species (optional, default to 9606)
   * @param tissue tissue (optional, default to any)
   * @param mod mod (optional, default to any)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long getProteinCountUsingGET(String species, String tissue, String mod) throws ApiException {
    Object localVarPostBody = null;
    
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinListForPeptide
   * 
   * @param sequence sequence (required)
   * @param species species (optional, default to 9606)
   * @param includeSequence includeSequence (optional, default to false)
   * @return ProteinList
   * @throws ApiException if fails to make API call
   */
  public ProteinList getProteinListForPeptideUsingGET1(String sequence, Integer species, Boolean includeSequence) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sequence' is set
    if (sequence == null) {
      throw new ApiException(400, "Missing the required parameter 'sequence' when calling getProteinListForPeptideUsingGET1");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinList> localVarReturnType = new GenericType<ProteinList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getProteinList
   * 
   * @param species species (optional, default to 9606)
   * @param tissue tissue (optional, default to any)
   * @param mod mod (optional, default to any)
   * @param includeSequence includeSequence (optional, default to false)
   * @param page page (optional, default to 0)
   * @param pageSize pageSize (optional, default to 100)
   * @return ProteinList
   * @throws ApiException if fails to make API call
   */
  public ProteinList getProteinListUsingGET1(String species, String tissue, String mod, Boolean includeSequence, Integer page, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ProteinList> localVarReturnType = new GenericType<ProteinList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
