package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.ItemQuantityAllocated;
import com.beehyv.dsep.model.ItemQuantityMaximum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes count or amount of an item
 */

@Schema(name = "ItemQuantity", description = "Describes count or amount of an item")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class ItemQuantity {

  @JsonProperty("allocated")
  private ItemQuantityAllocated allocated;

  @JsonProperty("available")
  private ItemQuantityAllocated available;

  @JsonProperty("maximum")
  private ItemQuantityMaximum maximum;

  @JsonProperty("minimum")
  private ItemQuantityAllocated minimum;

  @JsonProperty("selected")
  private ItemQuantityAllocated selected;

  public ItemQuantity allocated(ItemQuantityAllocated allocated) {
    this.allocated = allocated;
    return this;
  }

  /**
   * Get allocated
   * @return allocated
  */
  @Valid 
  @Schema(name = "allocated", required = false)
  public ItemQuantityAllocated getAllocated() {
    return allocated;
  }

  public void setAllocated(ItemQuantityAllocated allocated) {
    this.allocated = allocated;
  }

  public ItemQuantity available(ItemQuantityAllocated available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  */
  @Valid 
  @Schema(name = "available", required = false)
  public ItemQuantityAllocated getAvailable() {
    return available;
  }

  public void setAvailable(ItemQuantityAllocated available) {
    this.available = available;
  }

  public ItemQuantity maximum(ItemQuantityMaximum maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
  */
  @Valid 
  @Schema(name = "maximum", required = false)
  public ItemQuantityMaximum getMaximum() {
    return maximum;
  }

  public void setMaximum(ItemQuantityMaximum maximum) {
    this.maximum = maximum;
  }

  public ItemQuantity minimum(ItemQuantityAllocated minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
  */
  @Valid 
  @Schema(name = "minimum", required = false)
  public ItemQuantityAllocated getMinimum() {
    return minimum;
  }

  public void setMinimum(ItemQuantityAllocated minimum) {
    this.minimum = minimum;
  }

  public ItemQuantity selected(ItemQuantityAllocated selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Get selected
   * @return selected
  */
  @Valid 
  @Schema(name = "selected", required = false)
  public ItemQuantityAllocated getSelected() {
    return selected;
  }

  public void setSelected(ItemQuantityAllocated selected) {
    this.selected = selected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemQuantity itemQuantity = (ItemQuantity) o;
    return Objects.equals(this.allocated, itemQuantity.allocated) &&
        Objects.equals(this.available, itemQuantity.available) &&
        Objects.equals(this.maximum, itemQuantity.maximum) &&
        Objects.equals(this.minimum, itemQuantity.minimum) &&
        Objects.equals(this.selected, itemQuantity.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocated, available, maximum, minimum, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemQuantity {\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

