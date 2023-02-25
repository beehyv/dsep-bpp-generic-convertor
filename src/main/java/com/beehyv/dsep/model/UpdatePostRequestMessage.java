package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Order;
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
 * UpdatePostRequestMessage
 */

@JsonTypeName("_update_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class UpdatePostRequestMessage {

  @JsonProperty("update_target")
  private String updateTarget;

  @JsonProperty("order")
  private Order order;

  public UpdatePostRequestMessage updateTarget(String updateTarget) {
    this.updateTarget = updateTarget;
    return this;
  }

  /**
   * Comma separated values of order objects being updated. For example: ```\"update_target\":\"item,billing,fulfillment\"```
   * @return updateTarget
  */
  @NotNull 
  @Schema(name = "update_target", description = "Comma separated values of order objects being updated. For example: ```\"update_target\":\"item,billing,fulfillment\"```", required = true)
  public String getUpdateTarget() {
    return updateTarget;
  }

  public void setUpdateTarget(String updateTarget) {
    this.updateTarget = updateTarget;
  }

  public UpdatePostRequestMessage order(Order order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @NotNull @Valid 
  @Schema(name = "order", required = true)
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePostRequestMessage updatePostRequestMessage = (UpdatePostRequestMessage) o;
    return Objects.equals(this.updateTarget, updatePostRequestMessage.updateTarget) &&
        Objects.equals(this.order, updatePostRequestMessage.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateTarget, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePostRequestMessage {\n");
    sb.append("    updateTarget: ").append(toIndentedString(updateTarget)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

