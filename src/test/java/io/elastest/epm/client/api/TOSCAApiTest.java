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
import io.elastest.epm.client.model.ResourceGroup;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for TOSCAApi */
@Ignore
public class TOSCAApiTest {

  private final TOSCAApi api = new TOSCAApi();

  /**
   * Deploys a Tosca template.
   *
   * <p>The TOSCA template defines VDUs, Networks and the PoPs where to allocate the virtual
   * resources
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deployToscaTemplateTest() throws ApiException {
    String body = null;
    ResourceGroup response = api.deployToscaTemplate(body);

    // TODO: test validations
  }
}
