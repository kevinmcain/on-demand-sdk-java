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

/**
 * CallbackResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-05T12:21:25.201-08:00")
public class CallbackResponse {
  @SerializedName("uri")
  private String uri = null;

  public CallbackResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI that the callback will call
   * @return uri
  **/
  @ApiModelProperty(value = "The URI that the callback will call")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackResponse callbackResponse = (CallbackResponse) o;
    return Objects.equals(this.uri, callbackResponse.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackResponse {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

