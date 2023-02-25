package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
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
 * SupportPostRequestMessage
 */

@JsonTypeName("_support_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class SupportPostRequestMessage {

  @JsonProperty("ref_id")
  private String refId;

  public SupportPostRequestMessage refId(String refId) {
    this.refId = refId;
    return this;
  }

  /**
   * ID of the element for which support is needed
   * @return refId
  */
  
  @Schema(name = "ref_id", description = "ID of the element for which support is needed", required = false)
  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportPostRequestMessage supportPostRequestMessage = (SupportPostRequestMessage) o;
    return Objects.equals(this.refId, supportPostRequestMessage.refId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportPostRequestMessage {\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
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

