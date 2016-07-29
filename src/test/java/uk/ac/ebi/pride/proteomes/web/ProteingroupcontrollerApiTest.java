package uk.ac.ebi.pride.proteomes.web;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.client.ProteinGroup;
import uk.ac.ebi.pride.proteomes.web.client.ProteinGroupList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProteingroupcontrollerApi
 */
public class ProteingroupcontrollerApiTest {

    private final ProteingroupcontrollerApi api = new ProteingroupcontrollerApi();

    
    /**
     * getById
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByIdUsingGET5Test() throws ApiException {
        String id = null;
        Boolean uniquePeptides = null;
        // ProteinGroup response = api.getByIdUsingGET5(id, uniquePeptides);

        // TODO: test validations
    }
    
    /**
     * getProteinGroupListForProtein
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinGroupListForProteinUsingGETTest() throws ApiException {
        String acc = null;
        // ProteinGroupList response = api.getProteinGroupListForProteinUsingGET(acc);

        // TODO: test validations
    }
    
    /**
     * getProteinGroupList
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinGroupListUsingGETTest() throws ApiException {
        Integer species = null;
        Integer page = null;
        Integer pageSize = null;
        // ProteinGroupList response = api.getProteinGroupListUsingGET(species, page, pageSize);

        // TODO: test validations
    }
    
}
