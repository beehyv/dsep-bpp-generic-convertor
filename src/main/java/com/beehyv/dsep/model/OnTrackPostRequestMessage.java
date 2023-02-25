package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Tracking;
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
 * OnTrackPostRequestMessage
 */

@JsonTypeName("_on_track_post_request_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnTrackPostRequestMessage {

  @JsonProperty("tracking")
  private Tracking tracking;

  public OnTrackPostRequestMessage tracking(Tracking tracking) {
    this.tracking = tracking;
    return this;
  }

  /**
   * Get tracking
   * @return tracking
  */
  @NotNull @Valid 
  @Schema(name = "tracking", required = true)
  public Tracking getTracking() {
    return tracking;
  }

  public void setTracking(Tracking tracking) {
    this.tracking = tracking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnTrackPostRequestMessage onTrackPostRequestMessage = (OnTrackPostRequestMessage) o;
    return Objects.equals(this.tracking, onTrackPostRequestMessage.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnTrackPostRequestMessage {\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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

