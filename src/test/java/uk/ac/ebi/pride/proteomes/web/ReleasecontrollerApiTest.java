package uk.ac.ebi.pride.proteomes.web;

import uk.ac.ebi.pride.proteomes.web.ApiException;
import uk.ac.ebi.pride.proteomes.web.client.ReleaseSummary;
import uk.ac.ebi.pride.proteomes.web.client.ReleaseSummaryList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReleasecontrollerApi
 */
public class ReleasecontrollerApiTest {

    private final ReleasecontrollerApi api = new ReleasecontrollerApi();

    
    /**
     * getReleaseSummaryForSpecies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReleaseSummaryForSpeciesUsingGETTest() throws ApiException {
        String species = null;
        // ReleaseSummary response = api.getReleaseSummaryForSpeciesUsingGET(species);

        // TODO: test validations
    }
    
    /**
     * getReleaseSummary
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReleaseSummaryUsingGET1Test() throws ApiException {
        // ReleaseSummaryList response = api.getReleaseSummaryUsingGET1();

        // TODO: test validations
    }
    
}
