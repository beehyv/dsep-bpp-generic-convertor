package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Scalar;
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
 * Describes the dimensions of a real-world object
 */

@Schema(name = "Dimensions", description = "Describes the dimensions of a real-world object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Dimensions {

  @JsonProperty("length")
  private Scalar length;

  @JsonProperty("breadth")
  private Scalar breadth;

  @JsonProperty("height")
  private Scalar height;

  public Dimensions length(Scalar length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  */
  @Valid 
  @Schema(name = "length", required = false)
  public Scalar getLength() {
    return length;
  }

  public void setLength(Scalar length) {
    this.length = length;
  }

  public Dimensions breadth(Scalar breadth) {
    this.breadth = breadth;
    return this;
  }

  /**
   * Get breadth
   * @return breadth
  */
  @Valid 
  @Schema(name = "breadth", required = false)
  public Scalar getBreadth() {
    return breadth;
  }

  public void setBreadth(Scalar breadth) {
    this.breadth = breadth;
  }

  public Dimensions height(Scalar height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @Valid 
  @Schema(name = "height", required = false)
  public Scalar getHeight() {
    return height;
  }

  public void setHeight(Scalar height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.breadth, dimensions.breadth) &&
        Objects.equals(this.height, dimensions.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, breadth, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    breadth: ").append(toIndentedString(breadth)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

