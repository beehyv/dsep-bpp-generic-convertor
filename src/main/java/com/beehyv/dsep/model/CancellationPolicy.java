package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Fee;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes the cancellation policy of an Order.
 */

@Schema(name = "CancellationPolicy", description = "Describes the cancellation policy of an Order.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class CancellationPolicy {

  @JsonProperty("cancellable")
  private Boolean cancellable;

  @JsonProperty("cancel_before")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime cancelBefore;

  @JsonProperty("cancellation_fee")
  private Fee cancellationFee;

  /**
   * Gets or Sets feeAppliedOn
   */
  public enum FeeAppliedOnEnum {
    CURRENT_ORDER("CURRENT-ORDER"),
    
    NEXT_ORDER("NEXT-ORDER");

    private String value;

    FeeAppliedOnEnum(String value) {
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
    public static FeeAppliedOnEnum fromValue(String value) {
      for (FeeAppliedOnEnum b : FeeAppliedOnEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("fee_applied_on")
  private FeeAppliedOnEnum feeAppliedOn;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FULL("full"),
    
    PARTIAL("partial");

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

  public CancellationPolicy cancellable(Boolean cancellable) {
    this.cancellable = cancellable;
    return this;
  }

  /**
   * Get cancellable
   * @return cancellable
  */
  
  @Schema(name = "cancellable", required = false)
  public Boolean getCancellable() {
    return cancellable;
  }

  public void setCancellable(Boolean cancellable) {
    this.cancellable = cancellable;
  }

  public CancellationPolicy cancelBefore(OffsetDateTime cancelBefore) {
    this.cancelBefore = cancelBefore;
    return this;
  }

  /**
   * Get cancelBefore
   * @return cancelBefore
  */
  @Valid 
  @Schema(name = "cancel_before", required = false)
  public OffsetDateTime getCancelBefore() {
    return cancelBefore;
  }

  public void setCancelBefore(OffsetDateTime cancelBefore) {
    this.cancelBefore = cancelBefore;
  }

  public CancellationPolicy cancellationFee(Fee cancellationFee) {
    this.cancellationFee = cancellationFee;
    return this;
  }

  /**
   * Get cancellationFee
   * @return cancellationFee
  */
  @Valid 
  @Schema(name = "cancellation_fee", required = false)
  public Fee getCancellationFee() {
    return cancellationFee;
  }

  public void setCancellationFee(Fee cancellationFee) {
    this.cancellationFee = cancellationFee;
  }

  public CancellationPolicy feeAppliedOn(FeeAppliedOnEnum feeAppliedOn) {
    this.feeAppliedOn = feeAppliedOn;
    return this;
  }

  /**
   * Get feeAppliedOn
   * @return feeAppliedOn
  */
  
  @Schema(name = "fee_applied_on", required = false)
  public FeeAppliedOnEnum getFeeAppliedOn() {
    return feeAppliedOn;
  }

  public void setFeeAppliedOn(FeeAppliedOnEnum feeAppliedOn) {
    this.feeAppliedOn = feeAppliedOn;
  }

  public CancellationPolicy type(TypeEnum type) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationPolicy cancellationPolicy = (CancellationPolicy) o;
    return Objects.equals(this.cancellable, cancellationPolicy.cancellable) &&
        Objects.equals(this.cancelBefore, cancellationPolicy.cancelBefore) &&
        Objects.equals(this.cancellationFee, cancellationPolicy.cancellationFee) &&
        Objects.equals(this.feeAppliedOn, cancellationPolicy.feeAppliedOn) &&
        Objects.equals(this.type, cancellationPolicy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellable, cancelBefore, cancellationFee, feeAppliedOn, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationPolicy {\n");
    sb.append("    cancellable: ").append(toIndentedString(cancellable)).append("\n");
    sb.append("    cancelBefore: ").append(toIndentedString(cancelBefore)).append("\n");
    sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
    sb.append("    feeAppliedOn: ").append(toIndentedString(feeAppliedOn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

