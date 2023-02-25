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
 * Describes an organization
 */

@Schema(name = "Organization", description = "Describes an organization")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Organization {

  @JsonProperty("name")
  private String name;

  @JsonProperty("cred")
  private String cred;

  public Organization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization cred(String cred) {
    this.cred = cred;
    return this;
  }

  /**
   * Get cred
   * @return cred
  */
  
  @Schema(name = "cred", required = false)
  public String getCred() {
    return cred;
  }

  public void setCred(String cred) {
    this.cred = cred;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.name, organization.name) &&
        Objects.equals(this.cred, organization.cred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cred: ").append(toIndentedString(cred)).append("\n");
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

