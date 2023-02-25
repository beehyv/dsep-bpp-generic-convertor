package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Context;
import com.beehyv.dsep.model.RatingCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * FeedbackCategoriesPostRequest
 */

@JsonTypeName("_feedback_categories_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class FeedbackCategoriesPostRequest {

  @JsonProperty("context")
  private Context context;

  @JsonProperty("feedback_categories")
  @Valid
  private List<RatingCategory> feedbackCategories = null;

  public FeedbackCategoriesPostRequest context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @Valid 
  @Schema(name = "context", required = false)
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public FeedbackCategoriesPostRequest feedbackCategories(List<RatingCategory> feedbackCategories) {
    this.feedbackCategories = feedbackCategories;
    return this;
  }

  public FeedbackCategoriesPostRequest addFeedbackCategoriesItem(RatingCategory feedbackCategoriesItem) {
    if (this.feedbackCategories == null) {
      this.feedbackCategories = new ArrayList<>();
    }
    this.feedbackCategories.add(feedbackCategoriesItem);
    return this;
  }

  /**
   * Get feedbackCategories
   * @return feedbackCategories
  */
  @Valid 
  @Schema(name = "feedback_categories", required = false)
  public List<RatingCategory> getFeedbackCategories() {
    return feedbackCategories;
  }

  public void setFeedbackCategories(List<RatingCategory> feedbackCategories) {
    this.feedbackCategories = feedbackCategories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackCategoriesPostRequest feedbackCategoriesPostRequest = (FeedbackCategoriesPostRequest) o;
    return Objects.equals(this.context, feedbackCategoriesPostRequest.context) &&
        Objects.equals(this.feedbackCategories, feedbackCategoriesPostRequest.feedbackCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, feedbackCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackCategoriesPostRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    feedbackCategories: ").append(toIndentedString(feedbackCategories)).append("\n");
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

