package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Error;
import com.beehyv.dsep.model.SearchPost200ResponseMessage;
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
 * OnSearchPost200Response
 */

@JsonTypeName("_on_search_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnSearchPost200Response {

  @JsonProperty("message")
  private SearchPost200ResponseMessage message;

  @JsonProperty("error")
  private Error error;

  public OnSearchPost200Response message(SearchPost200ResponseMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @Valid 
  @Schema(name = "message", required = false)
  public SearchPost200ResponseMessage getMessage() {
    return message;
  }

  public void setMessage(SearchPost200ResponseMessage message) {
    this.message = message;
  }

  public OnSearchPost200Response error(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @Valid 
  @Schema(name = "error", required = false)
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnSearchPost200Response onSearchPost200Response = (OnSearchPost200Response) o;
    return Objects.equals(this.message, onSearchPost200Response.message) &&
        Objects.equals(this.error, onSearchPost200Response.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnSearchPost200Response {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

