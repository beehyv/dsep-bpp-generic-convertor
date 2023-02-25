package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Context;
import com.beehyv.dsep.model.Error;
import com.beehyv.dsep.model.SelectPostRequestMessage;
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
 * OnConfirmPostRequest
 */

@JsonTypeName("_on_confirm_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnConfirmPostRequest {

  @JsonProperty("context")
  private Context context;

  @JsonProperty("message")
  private SelectPostRequestMessage message;

  @JsonProperty("error")
  private Error error;

  public OnConfirmPostRequest context(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @NotNull @Valid 
  @Schema(name = "context", required = true)
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public OnConfirmPostRequest message(SelectPostRequestMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @Valid 
  @Schema(name = "message", required = false)
  public SelectPostRequestMessage getMessage() {
    return message;
  }

  public void setMessage(SelectPostRequestMessage message) {
    this.message = message;
  }

  public OnConfirmPostRequest error(Error error) {
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
    OnConfirmPostRequest onConfirmPostRequest = (OnConfirmPostRequest) o;
    return Objects.equals(this.context, onConfirmPostRequest.context) &&
        Objects.equals(this.message, onConfirmPostRequest.message) &&
        Objects.equals(this.error, onConfirmPostRequest.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, message, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnConfirmPostRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

