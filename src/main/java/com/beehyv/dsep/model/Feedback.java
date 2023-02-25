package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.FeedbackFormElement;
import com.beehyv.dsep.model.FeedbackUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Feedback for a service
 */

@Schema(name = "Feedback", description = "Feedback for a service")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Feedback {

  @JsonProperty("feedback_form")
  @Valid
  private List<FeedbackFormElement> feedbackForm = null;

  @JsonProperty("feedback_url")
  private FeedbackUrl feedbackUrl;

  public Feedback feedbackForm(List<FeedbackFormElement> feedbackForm) {
    this.feedbackForm = feedbackForm;
    return this;
  }

  public Feedback addFeedbackFormItem(FeedbackFormElement feedbackFormItem) {
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

  public Feedback feedbackUrl(FeedbackUrl feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
    return this;
  }

  /**
   * Get feedbackUrl
   * @return feedbackUrl
  */
  @Valid 
  @Schema(name = "feedback_url", required = false)
  public FeedbackUrl getFeedbackUrl() {
    return feedbackUrl;
  }

  public void setFeedbackUrl(FeedbackUrl feedbackUrl) {
    this.feedbackUrl = feedbackUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.feedbackForm, feedback.feedbackForm) &&
        Objects.equals(this.feedbackUrl, feedback.feedbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackForm, feedbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    sb.append("    feedbackForm: ").append(toIndentedString(feedbackForm)).append("\n");
    sb.append("    feedbackUrl: ").append(toIndentedString(feedbackUrl)).append("\n");
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

