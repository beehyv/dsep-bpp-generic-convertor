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
 * RatingCategoriesPostRequest
 */

@JsonTypeName("_rating_categories_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class RatingCategoriesPostRequest {

  @JsonProperty("context")
  private Context context;

  @JsonProperty("rating_categories")
  @Valid
  private List<RatingCategory> ratingCategories = null;

  public RatingCategoriesPostRequest context(Context context) {
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

  public RatingCategoriesPostRequest ratingCategories(List<RatingCategory> ratingCategories) {
    this.ratingCategories = ratingCategories;
    return this;
  }

  public RatingCategoriesPostRequest addRatingCategoriesItem(RatingCategory ratingCategoriesItem) {
    if (this.ratingCategories == null) {
      this.ratingCategories = new ArrayList<>();
    }
    this.ratingCategories.add(ratingCategoriesItem);
    return this;
  }

  /**
   * Get ratingCategories
   * @return ratingCategories
  */
  @Valid 
  @Schema(name = "rating_categories", required = false)
  public List<RatingCategory> getRatingCategories() {
    return ratingCategories;
  }

  public void setRatingCategories(List<RatingCategory> ratingCategories) {
    this.ratingCategories = ratingCategories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingCategoriesPostRequest ratingCategoriesPostRequest = (RatingCategoriesPostRequest) o;
    return Objects.equals(this.context, ratingCategoriesPostRequest.context) &&
        Objects.equals(this.ratingCategories, ratingCategoriesPostRequest.ratingCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, ratingCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingCategoriesPostRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    ratingCategories: ").append(toIndentedString(ratingCategories)).append("\n");
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

