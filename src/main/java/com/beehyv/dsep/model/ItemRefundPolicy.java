package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
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
 * Describes the refund policy of an Item when removed from an order
 */

@Schema(name = "ItemRefundPolicy", description = "Describes the refund policy of an Item when removed from an order")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class ItemRefundPolicy {

  @JsonProperty("refundable")
  private Boolean refundable;

  @JsonProperty("refund_applicable_till")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime refundApplicableTill;

  /**
   * Gets or Sets refundType
   */
  public enum RefundTypeEnum {
    FULLY_REFUNDABLE("FULLY-REFUNDABLE"),
    
    PARTLY_REFUNDABLE("PARTLY-REFUNDABLE"),
    
    VARIABLE_REFUND("VARIABLE-REFUND");

    private String value;

    RefundTypeEnum(String value) {
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
    public static RefundTypeEnum fromValue(String value) {
      for (RefundTypeEnum b : RefundTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("refund_type")
  private RefundTypeEnum refundType;

  /**
   * Gets or Sets refundAmountType
   */
  public enum RefundAmountTypeEnum {
    CONSTANT_AMOUNT("CONSTANT-AMOUNT"),
    
    CONSTANT_PERCENTAGE("CONSTANT-PERCENTAGE"),
    
    VARIABLE_AMOUNT("VARIABLE-AMOUNT"),
    
    VARIABLE_PERCENTAGE("VARIABLE-PERCENTAGE");

    private String value;

    RefundAmountTypeEnum(String value) {
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
    public static RefundAmountTypeEnum fromValue(String value) {
      for (RefundAmountTypeEnum b : RefundAmountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("refund_amount_type")
  private RefundAmountTypeEnum refundAmountType;

  @JsonProperty("refund_amount_value")
  private BigDecimal refundAmountValue;

  public ItemRefundPolicy refundable(Boolean refundable) {
    this.refundable = refundable;
    return this;
  }

  /**
   * Get refundable
   * @return refundable
  */
  
  @Schema(name = "refundable", required = false)
  public Boolean getRefundable() {
    return refundable;
  }

  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }

  public ItemRefundPolicy refundApplicableTill(OffsetDateTime refundApplicableTill) {
    this.refundApplicableTill = refundApplicableTill;
    return this;
  }

  /**
   * Get refundApplicableTill
   * @return refundApplicableTill
  */
  @Valid 
  @Schema(name = "refund_applicable_till", required = false)
  public OffsetDateTime getRefundApplicableTill() {
    return refundApplicableTill;
  }

  public void setRefundApplicableTill(OffsetDateTime refundApplicableTill) {
    this.refundApplicableTill = refundApplicableTill;
  }

  public ItemRefundPolicy refundType(RefundTypeEnum refundType) {
    this.refundType = refundType;
    return this;
  }

  /**
   * Get refundType
   * @return refundType
  */
  
  @Schema(name = "refund_type", required = false)
  public RefundTypeEnum getRefundType() {
    return refundType;
  }

  public void setRefundType(RefundTypeEnum refundType) {
    this.refundType = refundType;
  }

  public ItemRefundPolicy refundAmountType(RefundAmountTypeEnum refundAmountType) {
    this.refundAmountType = refundAmountType;
    return this;
  }

  /**
   * Get refundAmountType
   * @return refundAmountType
  */
  
  @Schema(name = "refund_amount_type", required = false)
  public RefundAmountTypeEnum getRefundAmountType() {
    return refundAmountType;
  }

  public void setRefundAmountType(RefundAmountTypeEnum refundAmountType) {
    this.refundAmountType = refundAmountType;
  }

  public ItemRefundPolicy refundAmountValue(BigDecimal refundAmountValue) {
    this.refundAmountValue = refundAmountValue;
    return this;
  }

  /**
   * Get refundAmountValue
   * @return refundAmountValue
  */
  @Valid 
  @Schema(name = "refund_amount_value", required = false)
  public BigDecimal getRefundAmountValue() {
    return refundAmountValue;
  }

  public void setRefundAmountValue(BigDecimal refundAmountValue) {
    this.refundAmountValue = refundAmountValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemRefundPolicy itemRefundPolicy = (ItemRefundPolicy) o;
    return Objects.equals(this.refundable, itemRefundPolicy.refundable) &&
        Objects.equals(this.refundApplicableTill, itemRefundPolicy.refundApplicableTill) &&
        Objects.equals(this.refundType, itemRefundPolicy.refundType) &&
        Objects.equals(this.refundAmountType, itemRefundPolicy.refundAmountType) &&
        Objects.equals(this.refundAmountValue, itemRefundPolicy.refundAmountValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundable, refundApplicableTill, refundType, refundAmountType, refundAmountValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemRefundPolicy {\n");
    sb.append("    refundable: ").append(toIndentedString(refundable)).append("\n");
    sb.append("    refundApplicableTill: ").append(toIndentedString(refundApplicableTill)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    refundAmountType: ").append(toIndentedString(refundAmountType)).append("\n");
    sb.append("    refundAmountValue: ").append(toIndentedString(refundAmountValue)).append("\n");
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

