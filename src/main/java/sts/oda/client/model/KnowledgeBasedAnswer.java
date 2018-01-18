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
import java.util.ArrayList;
import java.util.List;
import sts.oda.client.model.Answer;
import sts.oda.client.model.Question;

/**
 * KnowledgeBasedAnswer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T09:55:21.026-08:00")
public class KnowledgeBasedAnswer {
  @SerializedName("answers")
  private List<Answer> answers = null;

  @SerializedName("questions")
  private List<Question> questions = null;

  public KnowledgeBasedAnswer answers(List<Answer> answers) {
    this.answers = answers;
    return this;
  }

  public KnowledgeBasedAnswer addAnswersItem(Answer answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<Answer>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @ApiModelProperty(value = "")
  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }

  public KnowledgeBasedAnswer questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public KnowledgeBasedAnswer addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeBasedAnswer knowledgeBasedAnswer = (KnowledgeBasedAnswer) o;
    return Objects.equals(this.answers, knowledgeBasedAnswer.answers) &&
        Objects.equals(this.questions, knowledgeBasedAnswer.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers, questions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeBasedAnswer {\n");
    
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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

