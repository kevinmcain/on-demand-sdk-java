/*
 * kennect-api
 * The Sterling On Demand API allows you to integrate background checks into your platform and manage the process form end-to-end.
 *
 * OpenAPI spec version: 2018-01-17T10:44:23.086-08:00
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
import sts.oda.client.model.KnowledgeBasedAnswer;

/**
 * VerificationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T09:55:21.026-08:00")
public class VerificationRequest {
  @SerializedName("kba")
  private KnowledgeBasedAnswer kba = null;

  public VerificationRequest kba(KnowledgeBasedAnswer kba) {
    this.kba = kba;
    return this;
  }

   /**
   * Get kba
   * @return kba
  **/
  @ApiModelProperty(value = "")
  public KnowledgeBasedAnswer getKba() {
    return kba;
  }

  public void setKba(KnowledgeBasedAnswer kba) {
    this.kba = kba;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationRequest verificationRequest = (VerificationRequest) o;
    return Objects.equals(this.kba, verificationRequest.kba);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kba);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationRequest {\n");
    
    sb.append("    kba: ").append(toIndentedString(kba)).append("\n");
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

