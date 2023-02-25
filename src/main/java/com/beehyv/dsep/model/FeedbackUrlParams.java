package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeedbackUrlParams
 */

@JsonTypeName("FeedbackUrl_params")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class FeedbackUrlParams extends HashMap<String, String> {

  @JsonProperty("feedback_id")
  private String feedbackId;

  public FeedbackUrlParams feedbackId(String feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * This value will be placed in the the $feedback_id url param in case of http/get and in the requestBody http/post requests
   * @return feedbackId
  */
  @NotNull 
  @Schema(name = "feedback_id", description = "This value will be placed in the the $feedback_id url param in case of http/get and in the requestBody http/post requests", required = true)
  public String getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(String feedbackId) {
    this.feedbackId = feedbackId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackUrlParams feedbackUrlParams = (FeedbackUrlParams) o;
    return Objects.equals(this.feedbackId, feedbackUrlParams.feedbackId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackUrlParams {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

