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
import sts.oda.client.model.Schedule;
import sts.oda.client.model.ScreeningRequest;

/**
 * SubscriptionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T13:50:14.250-08:00")
public class SubscriptionRequest {
  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("screening")
  private ScreeningRequest screening = null;

  public SubscriptionRequest schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public SubscriptionRequest screening(ScreeningRequest screening) {
    this.screening = screening;
    return this;
  }

   /**
   * Get screening
   * @return screening
  **/
  @ApiModelProperty(value = "")
  public ScreeningRequest getScreening() {
    return screening;
  }

  public void setScreening(ScreeningRequest screening) {
    this.screening = screening;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.schedule, subscriptionRequest.schedule) &&
        Objects.equals(this.screening, subscriptionRequest.screening);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, screening);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    screening: ").append(toIndentedString(screening)).append("\n");
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

