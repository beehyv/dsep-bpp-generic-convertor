package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.FeedbackUrlParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes how a feedback URL will be sent by the BPP
 */

@Schema(name = "FeedbackUrl", description = "Describes how a feedback URL will be sent by the BPP")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class FeedbackUrl {

  @JsonProperty("url")
  private URI url;

  /**
   * Gets or Sets tlMethod
   */
  public enum TlMethodEnum {
    GET("http/get"),
    
    POST("http/post");

    private String value;

    TlMethodEnum(String value) {
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
    public static TlMethodEnum fromValue(String value) {
      for (TlMethodEnum b : TlMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tl_method")
  private TlMethodEnum tlMethod;

  @JsonProperty("params")
  private FeedbackUrlParams params;

  public FeedbackUrl url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * feedback URL sent by the BPP
   * @return url
  */
  @Valid 
  @Schema(name = "url", description = "feedback URL sent by the BPP", required = false)
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public FeedbackUrl tlMethod(TlMethodEnum tlMethod) {
    this.tlMethod = tlMethod;
    return this;
  }

  /**
   * Get tlMethod
   * @return tlMethod
  */
  
  @Schema(name = "tl_method", required = false)
  public TlMethodEnum getTlMethod() {
    return tlMethod;
  }

  public void setTlMethod(TlMethodEnum tlMethod) {
    this.tlMethod = tlMethod;
  }

  public FeedbackUrl params(FeedbackUrlParams params) {
    this.params = params;
    return this;
  }

  /**
   * Get params
   * @return params
  */
  @Valid 
  @Schema(name = "params", required = false)
  public FeedbackUrlParams getParams() {
    return params;
  }

  public void setParams(FeedbackUrlParams params) {
    this.params = params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackUrl feedbackUrl = (FeedbackUrl) o;
    return Objects.equals(this.url, feedbackUrl.url) &&
        Objects.equals(this.tlMethod, feedbackUrl.tlMethod) &&
        Objects.equals(this.params, feedbackUrl.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, tlMethod, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackUrl {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tlMethod: ").append(toIndentedString(tlMethod)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

