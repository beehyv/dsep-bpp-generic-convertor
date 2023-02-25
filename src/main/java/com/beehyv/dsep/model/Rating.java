package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.FeedbackFormElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes the rating of a person or an object.
 */

@Schema(name = "Rating", description = "Describes the rating of a person or an object.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Rating {

  @JsonProperty("rating_category")
  private String ratingCategory;

  @JsonProperty("id")
  private String id;

  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("feedback_form")
  @Valid
  private List<FeedbackFormElement> feedbackForm = null;

  public Rating ratingCategory(String ratingCategory) {
    this.ratingCategory = ratingCategory;
    return this;
  }

  /**
   * Category of the object being rated
   * @return ratingCategory
  */
  
  @Schema(name = "rating_category", description = "Category of the object being rated", required = false)
  public String getRatingCategory() {
    return ratingCategory;
  }

  public void setRatingCategory(String ratingCategory) {
    this.ratingCategory = ratingCategory;
  }

  public Rating id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the object being rated
   * @return id
  */
  
  @Schema(name = "id", description = "Id of the object being rated", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rating value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Rating value given to the object
   * minimum: 0
   * @return value
  */
  @Valid @DecimalMin("0") 
  @Schema(name = "value", description = "Rating value given to the object", required = false)
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Rating feedbackForm(List<FeedbackFormElement> feedbackForm) {
    this.feedbackForm = feedbackForm;
    return this;
  }

  public Rating addFeedbackFormItem(FeedbackFormElement feedbackFormItem) {
    if (this.feedbackForm == null) {
      this.feedbackForm = new ArrayList<>();
    }
    this.feedbackForm.add(feedbackFormItem);
    return this;
  }

  /**
   * Describes a feedback form that a BPP can send to get feedback from the BAP
   * @return feedbackForm
  */
  @Valid 
  @Schema(name = "feedback_form", description = "Describes a feedback form that a BPP can send to get feedback from the BAP", required = false)
  public List<FeedbackFormElement> getFeedbackForm() {
    return feedbackForm;
  }

  public void setFeedbackForm(List<FeedbackFormElement> feedbackForm) {
    this.feedbackForm = feedbackForm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.ratingCategory, rating.ratingCategory) &&
        Objects.equals(this.id, rating.id) &&
        Objects.equals(this.value, rating.value) &&
        Objects.equals(this.feedbackForm, rating.feedbackForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingCategory, id, value, feedbackForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    sb.append("    ratingCategory: ").append(toIndentedString(ratingCategory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    feedbackForm: ").append(toIndentedString(feedbackForm)).append("\n");
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

