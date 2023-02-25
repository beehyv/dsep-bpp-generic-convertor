package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Id;
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
 * CancelPostRequestMessage
 */

@JsonTypeName("_cancel_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class CancelPostRequestMessage {

  @JsonProperty("order_id")
  private Id orderId = null;

  @JsonProperty("cancellation_reason_id")
  private Id cancellationReasonId = null;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  public CancelPostRequestMessage orderId(Id orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  @NotNull @Valid 
  @Schema(name = "order_id", required = true)
  public Id getOrderId() {
    return orderId;
  }

  public void setOrderId(Id orderId) {
    this.orderId = orderId;
  }

  public CancelPostRequestMessage cancellationReasonId(Id cancellationReasonId) {
    this.cancellationReasonId = cancellationReasonId;
    return this;
  }

  /**
   * Get cancellationReasonId
   * @return cancellationReasonId
  */
  @Valid 
  @Schema(name = "cancellation_reason_id", required = false)
  public Id getCancellationReasonId() {
    return cancellationReasonId;
  }

  public void setCancellationReasonId(Id cancellationReasonId) {
    this.cancellationReasonId = cancellationReasonId;
  }

  public CancelPostRequestMessage descriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
  */
  @Valid 
  @Schema(name = "descriptor", required = false)
  public Descriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPostRequestMessage cancelPostRequestMessage = (CancelPostRequestMessage) o;
    return Objects.equals(this.orderId, cancelPostRequestMessage.orderId) &&
        Objects.equals(this.cancellationReasonId, cancelPostRequestMessage.cancellationReasonId) &&
        Objects.equals(this.descriptor, cancelPostRequestMessage.descriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, cancellationReasonId, descriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPostRequestMessage {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    cancellationReasonId: ").append(toIndentedString(cancellationReasonId)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
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

