package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Id;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TrackPostRequestMessage
 */

@JsonTypeName("_track_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class TrackPostRequestMessage {

  @JsonProperty("order_id")
  private Id orderId = null;

  @JsonProperty("callback_url")
  private URI callbackUrl;

  public TrackPostRequestMessage orderId(Id orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  @NotNull @Valid 
  @Schema(name = "order_id", required = true)
  public Id getOrderId() {
    return orderId;
  }

  public void setOrderId(Id orderId) {
    this.orderId = orderId;
  }

  public TrackPostRequestMessage callbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Get callbackUrl
   * @return callbackUrl
  */
  @Valid 
  @Schema(name = "callback_url", required = false)
  public URI getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackPostRequestMessage trackPostRequestMessage = (TrackPostRequestMessage) o;
    return Objects.equals(this.orderId, trackPostRequestMessage.orderId) &&
        Objects.equals(this.callbackUrl, trackPostRequestMessage.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, callbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackPostRequestMessage {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

