package uk.ac.ebi.pride.proteomes.web;

import com.sun.jersey.api.client.GenericType;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.ApiClient;
import uk.ac.ebi.pride.proteomes.web.Configuration;
import uk.ac.ebi.pride.proteomes.web.client.*;
import uk.ac.ebi.pride.proteomes.web.Pair;

import uk.ac.ebi.pride.proteomes.web.client.PeptideList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class PeptidecontrollerApi {
  private ApiClient apiClient;

  public PeptidecontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PeptidecontrollerApi(ApiClient apiClient) {
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
   * @param sequence sequence (required)
   * @param species species (optional, default to 9606)
   * @param tissue tissue (optional, default to any)
   * @param mod mod (optional, default to any)
   * @param includeDetails includeDetails (optional, default to true)
   * @return PeptideList
   * @throws ApiException if fails to make API call
   */
  public PeptideList getByIdUsingGET1(String sequence, Integer species, String tissue, String mod, Boolean includeDetails) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sequence' is set
    if (sequence == null) {
      throw new ApiException(400, "Missing the required parameter 'sequence' when calling getByIdUsingGET1");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PeptideList> localVarReturnType = new GenericType<PeptideList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getPeptideListForProtein
   * 
   * @param acc acc (required)
   * @param tissue tissue (optional, default to any)
   * @param mod mod (optional, default to any)
   * @return PeptideList
   * @throws ApiException if fails to make API call
   */
  public PeptideList getPeptideListForProteinUsingGET1(String acc, String tissue, String mod) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'acc' is set
    if (acc == null) {
      throw new ApiException(400, "Missing the required parameter 'acc' when calling getPeptideListForProteinUsingGET1");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PeptideList> localVarReturnType = new GenericType<PeptideList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getPeptideList
   * 
   * @param species species (optional, default to 9606)
   * @param tissue tissue (optional, default to any)
   * @param mod mod (optional, default to any)
   * @param page page (optional, default to 0)
   * @param pageSize pageSize (optional, default to 100)
   * @return PeptideList
   * @throws ApiException if fails to make API call
   */
  public PeptideList getPeptideListUsingGET1(Integer species, String tissue, String mod, Integer page, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PeptideList> localVarReturnType = new GenericType<PeptideList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
