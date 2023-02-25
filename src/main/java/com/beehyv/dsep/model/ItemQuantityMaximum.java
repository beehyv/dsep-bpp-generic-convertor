package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Scalar;
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
 * ItemQuantityMaximum
 */

@JsonTypeName("ItemQuantity_maximum")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class ItemQuantityMaximum {

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("measure")
  private Scalar measure;

  public ItemQuantityMaximum count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * minimum: 1
   * @return count
  */
  @Min(1) 
  @Schema(name = "count", required = false)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ItemQuantityMaximum measure(Scalar measure) {
    this.measure = measure;
    return this;
  }

  /**
   * Get measure
   * @return measure
  */
  @Valid 
  @Schema(name = "measure", required = false)
  public Scalar getMeasure() {
    return measure;
  }

  public void setMeasure(Scalar measure) {
    this.measure = measure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemQuantityMaximum itemQuantityMaximum = (ItemQuantityMaximum) o;
    return Objects.equals(this.count, itemQuantityMaximum.count) &&
        Objects.equals(this.measure, itemQuantityMaximum.measure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, measure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemQuantityMaximum {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
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

