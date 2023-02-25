package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Time;
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
 * Describes a policy. Allows for domain extension.
 */

@Schema(name = "Policy", description = "Describes a policy. Allows for domain extension.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Policy {

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("parent_policy_id")
  private String parentPolicyId;

  @JsonProperty("time")
  private Time time;

  public Policy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Policy descriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
  */
  @Valid 
  @Schema(name = "descriptor", required = false)
  public Descriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
  }

  public Policy parentPolicyId(String parentPolicyId) {
    this.parentPolicyId = parentPolicyId;
    return this;
  }

  /**
   * Get parentPolicyId
   * @return parentPolicyId
  */
  
  @Schema(name = "parent_policy_id", required = false)
  public String getParentPolicyId() {
    return parentPolicyId;
  }

  public void setParentPolicyId(String parentPolicyId) {
    this.parentPolicyId = parentPolicyId;
  }

  public Policy time(Time time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @Valid 
  @Schema(name = "time", required = false)
  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.id, policy.id) &&
        Objects.equals(this.descriptor, policy.descriptor) &&
        Objects.equals(this.parentPolicyId, policy.parentPolicyId) &&
        Objects.equals(this.time, policy.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, parentPolicyId, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    parentPolicyId: ").append(toIndentedString(parentPolicyId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

