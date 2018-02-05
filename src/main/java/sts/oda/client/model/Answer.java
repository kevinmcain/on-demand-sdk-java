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
 * Answer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-05T12:21:25.201-08:00")
public class Answer {
  @SerializedName("questionId")
  private String questionId = null;

  @SerializedName("response")
  private String response = null;

  public Answer questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

   /**
   * The ID of the question that this is answering
   * @return questionId
  **/
  @ApiModelProperty(value = "The ID of the question that this is answering")
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  public Answer response(String response) {
    this.response = response;
    return this;
  }

   /**
   * The correct answer
   * @return response
  **/
  @ApiModelProperty(value = "The correct answer")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Answer answer = (Answer) o;
    return Objects.equals(this.questionId, answer.questionId) &&
        Objects.equals(this.response, answer.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Answer {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

