package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.ScalarRange;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object representing a scalar quantity.
 */

@Schema(name = "Scalar", description = "An object representing a scalar quantity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Scalar {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CONSTANT("CONSTANT"),
    
    VARIABLE("VARIABLE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("estimated_value")
  private BigDecimal estimatedValue;

  @JsonProperty("computed_value")
  private BigDecimal computedValue;

  @JsonProperty("range")
  private ScalarRange range;

  @JsonProperty("unit")
  private String unit;

  public Scalar type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Scalar value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull @Valid 
  @Schema(name = "value", required = true)
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Scalar estimatedValue(BigDecimal estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

  /**
   * Get estimatedValue
   * @return estimatedValue
  */
  @Valid 
  @Schema(name = "estimated_value", required = false)
  public BigDecimal getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(BigDecimal estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  public Scalar computedValue(BigDecimal computedValue) {
    this.computedValue = computedValue;
    return this;
  }

  /**
   * Get computedValue
   * @return computedValue
  */
  @Valid 
  @Schema(name = "computed_value", required = false)
  public BigDecimal getComputedValue() {
    return computedValue;
  }

  public void setComputedValue(BigDecimal computedValue) {
    this.computedValue = computedValue;
  }

  public Scalar range(ScalarRange range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
  */
  @Valid 
  @Schema(name = "range", required = false)
  public ScalarRange getRange() {
    return range;
  }

  public void setRange(ScalarRange range) {
    this.range = range;
  }

  public Scalar unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  */
  @NotNull 
  @Schema(name = "unit", required = true)
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scalar scalar = (Scalar) o;
    return Objects.equals(this.type, scalar.type) &&
        Objects.equals(this.value, scalar.value) &&
        Objects.equals(this.estimatedValue, scalar.estimatedValue) &&
        Objects.equals(this.computedValue, scalar.computedValue) &&
        Objects.equals(this.range, scalar.range) &&
        Objects.equals(this.unit, scalar.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, estimatedValue, computedValue, range, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scalar {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
    sb.append("    computedValue: ").append(toIndentedString(computedValue)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

