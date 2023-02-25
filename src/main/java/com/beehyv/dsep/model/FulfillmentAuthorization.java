package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes the mechanism that is used to authorize the start or end of a fulfillment. If set, the BAP must show the authorization code to the BAP user in a specified format. The BAP user must provide this authorization code to the fulfillment agent before the start and/or end of the fulfillment.
 */

@Schema(name = "FulfillmentAuthorization", description = "Describes the mechanism that is used to authorize the start or end of a fulfillment. If set, the BAP must show the authorization code to the BAP user in a specified format. The BAP user must provide this authorization code to the fulfillment agent before the start and/or end of the fulfillment.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class FulfillmentAuthorization {

  /**
   * Type of authorization mechanism used. If this value is equal to IMAGE, then the BAP must render this image as-is. If this value is a STING, then the BAP must clearly display the string to the user. It is recommended that the string be displayed in a way that it can be copied to the clipboard.
   */
  public enum TypeEnum {
    IMAGE("IMAGE"),
    
    STRING("STRING");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("token")
  private String token;

  @JsonProperty("valid_from")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validFrom;

  @JsonProperty("valid_to")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validTo;

  public FulfillmentAuthorization type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of authorization mechanism used. If this value is equal to IMAGE, then the BAP must render this image as-is. If this value is a STING, then the BAP must clearly display the string to the user. It is recommended that the string be displayed in a way that it can be copied to the clipboard.
   * @return type
  */
  
  @Schema(name = "type", description = "Type of authorization mechanism used. If this value is equal to IMAGE, then the BAP must render this image as-is. If this value is a STING, then the BAP must clearly display the string to the user. It is recommended that the string be displayed in a way that it can be copied to the clipboard.", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FulfillmentAuthorization token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The code displayed to the user for authorizing the start or end of fulfillment. This code must be provided to the fufillment agent before the start and/or end of the fulfillment.
   * @return token
  */
  
  @Schema(name = "token", description = "The code displayed to the user for authorizing the start or end of fulfillment. This code must be provided to the fufillment agent before the start and/or end of the fulfillment.", required = false)
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public FulfillmentAuthorization validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Date and time from which token is valid. This token must be shown to the BAP user only after this time.
   * @return validFrom
  */
  @Valid 
  @Schema(name = "valid_from", description = "Date and time from which token is valid. This token must be shown to the BAP user only after this time.", required = false)
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public FulfillmentAuthorization validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Date and time till which token is valid. This token must NOT be shown to the BAP user after this time.
   * @return validTo
  */
  @Valid 
  @Schema(name = "valid_to", description = "Date and time till which token is valid. This token must NOT be shown to the BAP user after this time.", required = false)
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentAuthorization fulfillmentAuthorization = (FulfillmentAuthorization) o;
    return Objects.equals(this.type, fulfillmentAuthorization.type) &&
        Objects.equals(this.token, fulfillmentAuthorization.token) &&
        Objects.equals(this.validFrom, fulfillmentAuthorization.validFrom) &&
        Objects.equals(this.validTo, fulfillmentAuthorization.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token, validFrom, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentAuthorization {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

