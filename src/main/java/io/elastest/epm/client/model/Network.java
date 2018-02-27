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

package io.elastest.epm.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** This entity defines the network connectivity and details where the VDUs are connected to. */
@ApiModel(
  description =
      "This entity defines the network connectivity and details where the VDUs are connected to."
)
@javax.annotation.Generated(
  value = "io.swagger.codegen.languages.JavaClientCodegen",
  date = "2017-08-23T16:53:27.371+02:00"
)
public class Network {
  @SerializedName("cidr")
  private String cidr = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("networkId")
  private String networkId = null;

  @SerializedName("poPName")
  private String poPName = null;

  public Network cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

  /**
   * Get cidr
   *
   * @return cidr
   */
  @ApiModelProperty(example = "192.168.1.1/24", required = true, value = "")
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public Network id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(example = "1234-abcd", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Network name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(example = "testNetwork1", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Network networkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  /**
   * Get networkId
   *
   * @return networkId
   */
  @ApiModelProperty(example = "1234-abcd", required = true, value = "")
  public String getNetworkId() {
    return networkId;
  }

  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }

  public Network poPName(String poPName) {
    this.poPName = poPName;
    return this;
  }

  /**
   * Get poPName
   *
   * @return poPName
   */
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPoPName() {
    return poPName;
  }

  public void setPoPName(String poPName) {
    this.poPName = poPName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.cidr, network.cidr)
        && Objects.equals(this.id, network.id)
        && Objects.equals(this.name, network.name)
        && Objects.equals(this.networkId, network.networkId)
        && Objects.equals(this.poPName, network.poPName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidr, id, name, networkId, poPName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");

    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    poPName: ").append(toIndentedString(poPName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
