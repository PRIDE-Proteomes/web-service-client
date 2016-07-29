package uk.ac.ebi.pride.proteomes.web;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.client.SpeciesList;
import uk.ac.ebi.pride.proteomes.web.client.TissueList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SamplecontrollerApi
 */
public class SamplecontrollerApiTest {

    private final SamplecontrollerApi api = new SamplecontrollerApi();

    
    /**
     * countTissues
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countTissuesUsingGETTest() throws ApiException {
        String species = null;
        // Integer response = api.countTissuesUsingGET(species);

        // TODO: test validations
    }
    
    /**
     * getSpecies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpeciesUsingGET1Test() throws ApiException {
        // SpeciesList response = api.getSpeciesUsingGET1();

        // TODO: test validations
    }
    
    /**
     * getTissues
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTissuesUsingGET1Test() throws ApiException {
        String species = null;
        // TissueList response = api.getTissuesUsingGET1(species);

        // TODO: test validations
    }
    
    /**
     * getTissues
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTissuesUsingGET3Test() throws ApiException {
        // TissueList response = api.getTissuesUsingGET3();

        // TODO: test validations
    }
    
}
