package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Context;
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
 * SelectPostRequest
 */

@JsonTypeName("_select_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class SelectPostRequest {

  @JsonProperty("context")
  private Context context;

  @JsonProperty("message")
  private SelectPostRequestMessage message;

  public SelectPostRequest context(Context context) {
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

  public SelectPostRequest message(SelectPostRequestMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull @Valid 
  @Schema(name = "message", required = true)
  public SelectPostRequestMessage getMessage() {
    return message;
  }

  public void setMessage(SelectPostRequestMessage message) {
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
    SelectPostRequest selectPostRequest = (SelectPostRequest) o;
    return Objects.equals(this.context, selectPostRequest.context) &&
        Objects.equals(this.message, selectPostRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectPostRequest {\n");
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

