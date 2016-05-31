package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ModelVoid;
import io.swagger.client.model.Protein;
import io.swagger.client.model.ProteinList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProteinApi
 */
public class ProteinApiTest {

    private final ProteinApi api = new ProteinApi();

    
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
        String id = null;
        Boolean includeDetails = null;
        // Protein response = api.getById(id, includeDetails);

        // TODO: test validations
    }
    
    /**
     * getProteinCount
     *
     * getProteinCount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinCountTest() throws ApiException {
        String species = null;
        String tissue = null;
        String mod = null;
        // Long response = api.getProteinCount(species, tissue, mod);

        // TODO: test validations
    }
    
    /**
     * getProteinList
     *
     * getProteinList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinListTest() throws ApiException {
        String species = null;
        Integer page = null;
        Integer pageSize = null;
        String tissue = null;
        String mod = null;
        Boolean includeSequence = null;
        // ProteinList response = api.getProteinList(species, page, pageSize, tissue, mod, includeSequence);

        // TODO: test validations
    }
    
    /**
     * getProteinListForPeptide
     *
     * getProteinListForPeptide
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinListForPeptideTest() throws ApiException {
        String sequence = null;
        Integer species = null;
        Boolean includeSequence = null;
        // ProteinList response = api.getProteinListForPeptide(sequence, species, includeSequence);

        // TODO: test validations
    }
    
}
