package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.ItemQuantity;
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
 * OnSelectPostRequestMessageOrderItemsInnerAllOf
 */

@JsonTypeName("_on_select_post_request_message_order_items_inner_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnSelectPostRequestMessageOrderItemsInnerAllOf {

  @JsonProperty("quantity")
  private ItemQuantity quantity;

  public OnSelectPostRequestMessageOrderItemsInnerAllOf quantity(ItemQuantity quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @Valid 
  @Schema(name = "quantity", required = false)
  public ItemQuantity getQuantity() {
    return quantity;
  }

  public void setQuantity(ItemQuantity quantity) {
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
    OnSelectPostRequestMessageOrderItemsInnerAllOf onSelectPostRequestMessageOrderItemsInnerAllOf = (OnSelectPostRequestMessageOrderItemsInnerAllOf) o;
    return Objects.equals(this.quantity, onSelectPostRequestMessageOrderItemsInnerAllOf.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnSelectPostRequestMessageOrderItemsInnerAllOf {\n");
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

