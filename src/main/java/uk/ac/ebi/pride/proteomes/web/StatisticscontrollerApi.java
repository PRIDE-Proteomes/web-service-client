package uk.ac.ebi.pride.proteomes.web;

import com.sun.jersey.api.client.GenericType;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.ApiClient;
import uk.ac.ebi.pride.proteomes.web.Configuration;
import uk.ac.ebi.pride.proteomes.web.client.*;
import uk.ac.ebi.pride.proteomes.web.Pair;

import uk.ac.ebi.pride.proteomes.web.client.Statistics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class StatisticscontrollerApi {
  private ApiClient apiClient;

  public StatisticscontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatisticscontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getSummary
   * 
   * @return Statistics
   * @throws ApiException if fails to make API call
   */
  public Statistics getSummaryUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/stats/summary".replaceAll("\\{format\\}","json");

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

    GenericType<Statistics> localVarReturnType = new GenericType<Statistics>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
