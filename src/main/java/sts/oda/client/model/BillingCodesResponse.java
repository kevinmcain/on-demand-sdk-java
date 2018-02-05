/*
 * kennect-api
 * The Sterling On Demand API allows you to integrate background checks into your platform and manage the process form end-to-end.
 *
 * OpenAPI spec version: 2018-01-29T12:48:56.083-08:00
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sts.oda.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BillingCodesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-05T12:21:25.201-08:00")
public class BillingCodesResponse {
  @SerializedName("billingCodes")
  private List<String> billingCodes = null;

  public BillingCodesResponse billingCodes(List<String> billingCodes) {
    this.billingCodes = billingCodes;
    return this;
  }

  public BillingCodesResponse addBillingCodesItem(String billingCodesItem) {
    if (this.billingCodes == null) {
      this.billingCodes = new ArrayList<String>();
    }
    this.billingCodes.add(billingCodesItem);
    return this;
  }

   /**
   * A list of billing codes
   * @return billingCodes
  **/
  @ApiModelProperty(value = "A list of billing codes")
  public List<String> getBillingCodes() {
    return billingCodes;
  }

  public void setBillingCodes(List<String> billingCodes) {
    this.billingCodes = billingCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCodesResponse billingCodesResponse = (BillingCodesResponse) o;
    return Objects.equals(this.billingCodes, billingCodesResponse.billingCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCodesResponse {\n");
    
    sb.append("    billingCodes: ").append(toIndentedString(billingCodes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

