package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.PeptideList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeptideApi
 */
public class PeptideApiTest {

    private final PeptideApi api = new PeptideApi();

    
    /**
     * getById
     *
     * getById
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String sequence = null;
        Integer species = null;
        String tissue = null;
        String mod = null;
        Boolean includeDetails = null;
        // PeptideList response = api.getById(sequence, species, tissue, mod, includeDetails);

        // TODO: test validations
    }
    
    /**
     * getPeptideList
     *
     * getPeptideList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPeptideListTest() throws ApiException {
        Integer species = null;
        String tissue = null;
        String mod = null;
        Integer page = null;
        Integer pageSize = null;
        // PeptideList response = api.getPeptideList(species, tissue, mod, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * getPeptideListForProtein
     *
     * getPeptideListForProtein
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPeptideListForProteinTest() throws ApiException {
        String acc = null;
        String tissue = null;
        String mod = null;
        // PeptideList response = api.getPeptideListForProtein(acc, tissue, mod);

        // TODO: test validations
    }
    
}
