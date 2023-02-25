package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
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
 * CancellationReasonsPostRequestMessage
 */

@JsonTypeName("_cancellation_reasons_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class CancellationReasonsPostRequestMessage {

  @JsonProperty("cancellation_reasons")
  @Valid
  private List<Option> cancellationReasons = null;

  public CancellationReasonsPostRequestMessage cancellationReasons(List<Option> cancellationReasons) {
    this.cancellationReasons = cancellationReasons;
    return this;
  }

  public CancellationReasonsPostRequestMessage addCancellationReasonsItem(Option cancellationReasonsItem) {
    if (this.cancellationReasons == null) {
      this.cancellationReasons = new ArrayList<>();
    }
    this.cancellationReasons.add(cancellationReasonsItem);
    return this;
  }

  /**
   * Get cancellationReasons
   * @return cancellationReasons
  */
  @Valid 
  @Schema(name = "cancellation_reasons", required = false)
  public List<Option> getCancellationReasons() {
    return cancellationReasons;
  }

  public void setCancellationReasons(List<Option> cancellationReasons) {
    this.cancellationReasons = cancellationReasons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationReasonsPostRequestMessage cancellationReasonsPostRequestMessage = (CancellationReasonsPostRequestMessage) o;
    return Objects.equals(this.cancellationReasons, cancellationReasonsPostRequestMessage.cancellationReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationReasonsPostRequestMessage {\n");
    sb.append("    cancellationReasons: ").append(toIndentedString(cancellationReasons)).append("\n");
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

