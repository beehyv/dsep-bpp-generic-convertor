package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Id;
import com.beehyv.dsep.model.Selected;
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
 * OnInitPostRequestMessageOrderItemsInner
 */

@JsonTypeName("_on_init_post_request_message_order_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnInitPostRequestMessageOrderItemsInner {

  @JsonProperty("id")
  private Id id = null;

  @JsonProperty("quantity")
  private Selected quantity = null;

  public OnInitPostRequestMessageOrderItemsInner id(Id id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", required = false)
  public Id getId() {
    return id;
  }

  public void setId(Id id) {
    this.id = id;
  }

  public OnInitPostRequestMessageOrderItemsInner quantity(Selected quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @Valid 
  @Schema(name = "quantity", required = false)
  public Selected getQuantity() {
    return quantity;
  }

  public void setQuantity(Selected quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnInitPostRequestMessageOrderItemsInner onInitPostRequestMessageOrderItemsInner = (OnInitPostRequestMessageOrderItemsInner) o;
    return Objects.equals(this.id, onInitPostRequestMessageOrderItemsInner.id) &&
        Objects.equals(this.quantity, onInitPostRequestMessageOrderItemsInner.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnInitPostRequestMessageOrderItemsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

