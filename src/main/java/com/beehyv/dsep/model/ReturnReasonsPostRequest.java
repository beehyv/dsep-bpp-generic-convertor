package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Context;
import com.beehyv.dsep.model.Option;
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
 * ReturnReasonsPostRequest
 */

@JsonTypeName("_return_reasons_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class ReturnReasonsPostRequest {

  @JsonProperty("context")
  private Context context;

  @JsonProperty("return_reasons")
  @Valid
  private List<Option> returnReasons = null;

  public ReturnReasonsPostRequest context(Context context) {
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

  public ReturnReasonsPostRequest returnReasons(List<Option> returnReasons) {
    this.returnReasons = returnReasons;
    return this;
  }

  public ReturnReasonsPostRequest addReturnReasonsItem(Option returnReasonsItem) {
    if (this.returnReasons == null) {
      this.returnReasons = new ArrayList<>();
    }
    this.returnReasons.add(returnReasonsItem);
    return this;
  }

  /**
   * Get returnReasons
   * @return returnReasons
  */
  @Valid 
  @Schema(name = "return_reasons", required = false)
  public List<Option> getReturnReasons() {
    return returnReasons;
  }

  public void setReturnReasons(List<Option> returnReasons) {
    this.returnReasons = returnReasons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnReasonsPostRequest returnReasonsPostRequest = (ReturnReasonsPostRequest) o;
    return Objects.equals(this.context, returnReasonsPostRequest.context) &&
        Objects.equals(this.returnReasons, returnReasonsPostRequest.returnReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, returnReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnReasonsPostRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    returnReasons: ").append(toIndentedString(returnReasons)).append("\n");
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

