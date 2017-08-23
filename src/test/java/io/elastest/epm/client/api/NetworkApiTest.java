/*
 * EPM REST API
 * REST API description of the ElasTest Platform Manager Module.
 *
 * OpenAPI spec version: 0.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.elastest.epm.client.api;

import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.model.Network;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for NetworkApi
 */
@Ignore
public class NetworkApiTest {

    private final NetworkApi api = new NetworkApi();

    
    /**
     * Creates a new network.
     *
     * Creates a new network in the target cloud environment with the given CIDR.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNetworkTest() throws ApiException {
        Network body = null;
        Network response = api.createNetwork(body);

        // TODO: test validations
    }
    
    /**
     * Deletes a network.
     *
     * Deletes the network that matches with a given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNetworkTest() throws ApiException {
        String id = null;
        String response = api.deleteNetwork(id);

        // TODO: test validations
    }
    
    /**
     * Returns all existing networks.
     *
     * Returns all networks with all details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNetworksTest() throws ApiException {
        List<Network> response = api.getAllNetworks();

        // TODO: test validations
    }
    
    /**
     * Returns a network.
     *
     * Returns the network with the given ID. Returns all its details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkByIdTest() throws ApiException {
        String id = null;
        Network response = api.getNetworkById(id);

        // TODO: test validations
    }
    
    /**
     * Updates a Network.
     *
     * Updates an existing Network.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNetworkTest() throws ApiException {
        String id = null;
        Network body = null;
        Network response = api.updateNetwork(id, body);

        // TODO: test validations
    }
    
}
