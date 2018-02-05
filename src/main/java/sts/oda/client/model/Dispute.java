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
import org.joda.time.DateTime;

/**
 * Dispute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-05T12:21:25.201-08:00")
public class Dispute {
  @SerializedName("createdAt")
  private DateTime createdAt = null;

  @SerializedName("deactivatedAt")
  private DateTime deactivatedAt = null;

  @SerializedName("status")
  private String status = null;

  public Dispute createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Dispute deactivatedAt(DateTime deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
    return this;
  }

   /**
   * Get deactivatedAt
   * @return deactivatedAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getDeactivatedAt() {
    return deactivatedAt;
  }

  public void setDeactivatedAt(DateTime deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
  }

  public Dispute status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dispute dispute = (Dispute) o;
    return Objects.equals(this.createdAt, dispute.createdAt) &&
        Objects.equals(this.deactivatedAt, dispute.deactivatedAt) &&
        Objects.equals(this.status, dispute.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, deactivatedAt, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dispute {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deactivatedAt: ").append(toIndentedString(deactivatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

