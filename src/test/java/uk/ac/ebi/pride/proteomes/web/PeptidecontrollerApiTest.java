package uk.ac.ebi.pride.proteomes.web;

import org.junit.Test;

/**
 * API tests for PeptidecontrollerApi
 */
public class PeptidecontrollerApiTest {

    private final PeptidecontrollerApi api = new PeptidecontrollerApi();


    /**
     * getById
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByIdUsingGET1Test() throws ApiException {
        String sequence = null;
        Integer species = null;
        String tissue = null;
        String mod = null;
        Boolean includeDetails = null;
        // PeptideList response = api.getByIdUsingGET1(sequence, species, tissue, mod, includeDetails);

        // TODO: test validations
    }

    /**
     * getPeptideListForProtein
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPeptideListForProteinUsingGET1Test() throws ApiException {
        String acc = null;
        String tissue = null;
        String mod = null;
        // PeptideList response = api.getPeptideListForProteinUsingGET1(acc, tissue, mod);

        // TODO: test validations
    }

    /**
     * getPeptideList
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPeptideListUsingGET1Test() throws ApiException {
        Integer species = null;
        String tissue = null;
        String mod = null;
        Integer page = null;
        Integer pageSize = null;
        // PeptideList response = api.getPeptideListUsingGET1(species, tissue, mod, page, pageSize);

        // TODO: test validations
    }

}
