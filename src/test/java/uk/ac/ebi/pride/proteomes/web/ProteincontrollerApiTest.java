package uk.ac.ebi.pride.proteomes.web;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.client.Protein;
import uk.ac.ebi.pride.proteomes.web.client.ProteinList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProteincontrollerApi
 */
public class ProteincontrollerApiTest {

    private final ProteincontrollerApi api = new ProteincontrollerApi();

    
    /**
     * getById
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByIdUsingGET2Test() throws ApiException {
        String id = null;
        Boolean includeDetails = null;
        // Protein response = api.getByIdUsingGET2(id, includeDetails);

        // TODO: test validations
    }
    
    /**
     * getProteinCount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinCountUsingGETTest() throws ApiException {
        String species = null;
        String tissue = null;
        String mod = null;
        // Long response = api.getProteinCountUsingGET(species, tissue, mod);

        // TODO: test validations
    }
    
    /**
     * getProteinListForPeptide
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinListForPeptideUsingGET1Test() throws ApiException {
        String sequence = null;
        Integer species = null;
        Boolean includeSequence = null;
        // ProteinList response = api.getProteinListForPeptideUsingGET1(sequence, species, includeSequence);

        // TODO: test validations
    }
    
    /**
     * getProteinList
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinListUsingGET1Test() throws ApiException {
        String species = null;
        String tissue = null;
        String mod = null;
        Boolean includeSequence = null;
        Integer page = null;
        Integer pageSize = null;
        // ProteinList response = api.getProteinListUsingGET1(species, tissue, mod, includeSequence, page, pageSize);

        // TODO: test validations
    }
    
}
