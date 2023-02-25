package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.RatingCategory;
import com.beehyv.dsep.model.Value;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetFeedbackFormPostRequestMessage
 */

@JsonTypeName("_get_feedback_form_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class GetFeedbackFormPostRequestMessage {

  @JsonProperty("rating_value")
  private Value ratingValue = null;

  @JsonProperty("rating_category")
  private RatingCategory ratingCategory = null;

  public GetFeedbackFormPostRequestMessage ratingValue(Value ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

  /**
   * Get ratingValue
   * @return ratingValue
  */
  @Valid 
  @Schema(name = "rating_value", required = false)
  public Value getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(Value ratingValue) {
    this.ratingValue = ratingValue;
  }

  public GetFeedbackFormPostRequestMessage ratingCategory(RatingCategory ratingCategory) {
    this.ratingCategory = ratingCategory;
    return this;
  }

  /**
   * Get ratingCategory
   * @return ratingCategory
  */
  @Valid 
  @Schema(name = "rating_category", required = false)
  public RatingCategory getRatingCategory() {
    return ratingCategory;
  }

  public void setRatingCategory(RatingCategory ratingCategory) {
    this.ratingCategory = ratingCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedbackFormPostRequestMessage getFeedbackFormPostRequestMessage = (GetFeedbackFormPostRequestMessage) o;
    return Objects.equals(this.ratingValue, getFeedbackFormPostRequestMessage.ratingValue) &&
        Objects.equals(this.ratingCategory, getFeedbackFormPostRequestMessage.ratingCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingValue, ratingCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedbackFormPostRequestMessage {\n");
    sb.append("    ratingValue: ").append(toIndentedString(ratingValue)).append("\n");
    sb.append("    ratingCategory: ").append(toIndentedString(ratingCategory)).append("\n");
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

