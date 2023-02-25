package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
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
 * The full postal address.
 */

@Schema(name = "FullAddress", description = "The full postal address.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class FullAddress implements Address {

  @JsonProperty("full")
  private String full;

  public FullAddress full(String full) {
    this.full = full;
    return this;
  }

  /**
   * This is an unstructured string that describes the complete postal address in one line. If supported, the format of this field should be defined in the network policy. If this field is set, then the validator must ignore all the other fields. If this field is unavailable or null, then the validator must validate all the other fields of this object.
   * @return full
  */
  
  @Schema(name = "full", description = "This is an unstructured string that describes the complete postal address in one line. If supported, the format of this field should be defined in the network policy. If this field is set, then the validator must ignore all the other fields. If this field is unavailable or null, then the validator must validate all the other fields of this object.", required = false)
  public String getFull() {
    return full;
  }

  public void setFull(String full) {
    this.full = full;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAddress fullAddress = (FullAddress) o;
    return Objects.equals(this.full, fullAddress.full);
  }

  @Override
  public int hashCode() {
    return Objects.hash(full);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAddress {\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
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

