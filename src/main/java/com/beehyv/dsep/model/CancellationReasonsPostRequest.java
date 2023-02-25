package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.CancellationReasonsPostRequestMessage;
import com.beehyv.dsep.model.Context;
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
 * CancellationReasonsPostRequest
 */

@JsonTypeName("_cancellation_reasons_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class CancellationReasonsPostRequest {

  @JsonProperty("context")
  private Context context;

  @JsonProperty("message")
  private CancellationReasonsPostRequestMessage message;

  public CancellationReasonsPostRequest context(Context context) {
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

  public CancellationReasonsPostRequest message(CancellationReasonsPostRequestMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @Valid 
  @Schema(name = "message", required = false)
  public CancellationReasonsPostRequestMessage getMessage() {
    return message;
  }

  public void setMessage(CancellationReasonsPostRequestMessage message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationReasonsPostRequest cancellationReasonsPostRequest = (CancellationReasonsPostRequest) o;
    return Objects.equals(this.context, cancellationReasonsPostRequest.context) &&
        Objects.equals(this.message, cancellationReasonsPostRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationReasonsPostRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

