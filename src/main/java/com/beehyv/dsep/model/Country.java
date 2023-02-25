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
 * Describes a country.
 */

@Schema(name = "Country", description = "Describes a country.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Country {

  @JsonProperty("name")
  private String name;

  @JsonProperty("code")
  private String code;

  public Country name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the country
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the country", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Country code as per ISO 3166-1 and ISO 3166-2 format
   * @return code
  */
  
  @Schema(name = "code", description = "Country code as per ISO 3166-1 and ISO 3166-2 format", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.name, country.name) &&
        Objects.equals(this.code, country.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

