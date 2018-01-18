/*
 * kennect-api
 * The Sterling On Demand API allows you to integrate background checks into your platform and manage the process form end-to-end.
 *
 * OpenAPI spec version: 2018-01-18T13:42:32.656-08:00
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

/**
 * CallbackCredentials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T13:50:14.250-08:00")
public class CallbackCredentials {
  @SerializedName("basic-auth")
  private String basicAuth = null;

  public CallbackCredentials basicAuth(String basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Basic Auth credentials. In a &#39;username:password&#39; format. (eg &#39;narf:zort!&#39;
   * @return basicAuth
  **/
  @ApiModelProperty(value = "Basic Auth credentials. In a 'username:password' format. (eg 'narf:zort!'")
  public String getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(String basicAuth) {
    this.basicAuth = basicAuth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackCredentials callbackCredentials = (CallbackCredentials) o;
    return Objects.equals(this.basicAuth, callbackCredentials.basicAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackCredentials {\n");
    
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
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

