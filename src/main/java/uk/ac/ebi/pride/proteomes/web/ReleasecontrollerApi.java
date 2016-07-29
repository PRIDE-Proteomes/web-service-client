package uk.ac.ebi.pride.proteomes.web;

import com.sun.jersey.api.client.GenericType;
import uk.ac.ebi.pride.proteomes.web.client.ReleaseSummary;
import uk.ac.ebi.pride.proteomes.web.client.ReleaseSummaryList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class ReleasecontrollerApi {
  private ApiClient apiClient;

  public ReleasecontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReleasecontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getReleaseSummaryForSpecies
   *
   * @param species species (optional, default to 9606)
   * @return ReleaseSummary
   * @throws ApiException if fails to make API call
   */
  public ReleaseSummary getReleaseSummaryForSpeciesUsingGET(String species) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'acc' is set
    if (species == null) {
      throw new ApiException(400, "Missing the required parameter 'species' when calling ggetReleaseSummaryForSpeciesUsingGET");
    }

    // create path and map variables
    String localVarPath = "/release/summary/species/{species}".replaceAll("\\{format\\}","json")
    .replaceAll("\\{" + "species" + "\\}", apiClient.escapeString(species.toString()));


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

    GenericType<ReleaseSummary> localVarReturnType = new GenericType<ReleaseSummary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getReleaseSummary
   *
   * @return ReleaseSummaryList
   * @throws ApiException if fails to make API call
   */
  public ReleaseSummaryList getReleaseSummaryUsingGET1() throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/release/summary/list".replaceAll("\\{format\\}","json");

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

    GenericType<ReleaseSummaryList> localVarReturnType = new GenericType<ReleaseSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
