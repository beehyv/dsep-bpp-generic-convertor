package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This describes an acknowledgement of receipt of a message. Upon receiving a message, the receiver must first authenticate the sender by verifying its digital signature. Upon successful verification of the signature, the receiver must validate the schema of the message.  After performing both the operations, the receiver should send an Ack object in response.
 */

@Schema(name = "Ack", description = "This describes an acknowledgement of receipt of a message. Upon receiving a message, the receiver must first authenticate the sender by verifying its digital signature. Upon successful verification of the signature, the receiver must validate the schema of the message.  After performing both the operations, the receiver should send an Ack object in response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Ack {

  /**
   * Describe the status of the ACK response. If the message passes the acknowledgement criteria, then the receiver shouls set this value equal to ACK else it should be set to NACK
   */
  public enum StatusEnum {
    ACK("ACK"),
    
    NACK("NACK");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public Ack status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Describe the status of the ACK response. If the message passes the acknowledgement criteria, then the receiver shouls set this value equal to ACK else it should be set to NACK
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Describe the status of the ACK response. If the message passes the acknowledgement criteria, then the receiver shouls set this value equal to ACK else it should be set to NACK", required = true)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ack ack = (Ack) o;
    return Objects.equals(this.status, ack.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ack {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

