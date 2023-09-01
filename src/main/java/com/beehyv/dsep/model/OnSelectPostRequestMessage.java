package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.OnSelectPostRequestMessageOrder;
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
 * OnSelectPostRequestMessage
 */

@JsonTypeName("_on_select_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnSelectPostRequestMessage {

  @JsonProperty("order")
  private OnSelectPostRequestMessageOrder order;

  @JsonProperty("parent_item_id")
  private Integer parentItemId;

  public OnSelectPostRequestMessage order(OnSelectPostRequestMessageOrder order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @NotNull @Valid 
  @Schema(name = "order", required = true)
  public OnSelectPostRequestMessageOrder getOrder() {
    return order;
  }

  public void setOrder(OnSelectPostRequestMessageOrder order) {
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
    OnSelectPostRequestMessage onSelectPostRequestMessage = (OnSelectPostRequestMessage) o;
    return Objects.equals(this.order, onSelectPostRequestMessage.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnSelectPostRequestMessage {\n");
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

