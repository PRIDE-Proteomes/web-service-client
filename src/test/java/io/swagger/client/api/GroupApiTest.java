package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ProteinGroup;
import io.swagger.client.model.ProteinGroupList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupApi
 */
public class GroupApiTest {

    private final GroupApi api = new GroupApi();

    
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
        Boolean uniquePeptides = null;
        // ProteinGroup response = api.getById(id, uniquePeptides);

        // TODO: test validations
    }
    
    /**
     * getProteinGroupList
     *
     * getProteinGroupList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinGroupListTest() throws ApiException {
        Integer species = null;
        Integer page = null;
        Integer pageSize = null;
        // ProteinGroupList response = api.getProteinGroupList(species, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * getProteinGroupListForProtein
     *
     * getProteinGroupListForProtein
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProteinGroupListForProteinTest() throws ApiException {
        String acc = null;
        // ProteinGroupList response = api.getProteinGroupListForProtein(acc);

        // TODO: test validations
    }
    
}
