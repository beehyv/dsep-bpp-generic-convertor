package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Price;
import com.beehyv.dsep.model.QuotationBreakupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes a quote
 */

@Schema(name = "Quotation", description = "Describes a quote")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Quotation {

  @JsonProperty("price")
  private Price price;

  @JsonProperty("breakup")
  @Valid
  private List<QuotationBreakupInner> breakup = null;

  @JsonProperty("ttl")
  private String ttl;

  public Quotation price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", required = false)
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Quotation breakup(List<QuotationBreakupInner> breakup) {
    this.breakup = breakup;
    return this;
  }

  public Quotation addBreakupItem(QuotationBreakupInner breakupItem) {
    if (this.breakup == null) {
      this.breakup = new ArrayList<>();
    }
    this.breakup.add(breakupItem);
    return this;
  }

  /**
   * Get breakup
   * @return breakup
  */
  @Valid 
  @Schema(name = "breakup", required = false)
  public List<QuotationBreakupInner> getBreakup() {
    return breakup;
  }

  public void setBreakup(List<QuotationBreakupInner> breakup) {
    this.breakup = breakup;
  }

  public Quotation ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Describes duration as per ISO8601 format
   * @return ttl
  */
  
  @Schema(name = "ttl", description = "Describes duration as per ISO8601 format", required = false)
  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quotation quotation = (Quotation) o;
    return Objects.equals(this.price, quotation.price) &&
        Objects.equals(this.breakup, quotation.breakup) &&
        Objects.equals(this.ttl, quotation.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, breakup, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quotation {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    breakup: ").append(toIndentedString(breakup)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

