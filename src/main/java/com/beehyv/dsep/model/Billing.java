package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Address;
import com.beehyv.dsep.model.Organization;
import com.beehyv.dsep.model.Time;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Describes the billing details of an order. This must be provided by BAP user before confirmation of the order.
 */

@Schema(name = "Billing", description = "Describes the billing details of an order. This must be provided by BAP user before confirmation of the order.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Billing {

  @JsonProperty("name")
  private String name;

  @JsonProperty("organization")
  private Organization organization;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("tax_number")
  private String taxNumber;

  @JsonProperty("created_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public Billing name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the person under who's name the bill will be generated.
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the person under who's name the bill will be generated.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Billing organization(Organization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  */
  @Valid 
  @Schema(name = "organization", required = false)
  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public Billing address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Billing email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the person / organization being billed. The BPP must send the bill to this email address. The format of the bill may be defined in the network policy.
   * @return email
  */
  @Email
  @Schema(name = "email", description = "Email address of the person / organization being billed. The BPP must send the bill to this email address. The format of the bill may be defined in the network policy.", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Billing phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the person / organization being billed. The BPP must send the bill to this phone number as per the format specified in the network policy. In case the bill is a downloadable file, it is recommended the bill should be sent to the phone number as a downloadable link.
   * @return phone
  */
  
  @Schema(name = "phone", description = "Phone number of the person / organization being billed. The BPP must send the bill to this phone number as per the format specified in the network policy. In case the bill is a downloadable file, it is recommended the bill should be sent to the phone number as a downloadable link.", required = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Billing time(Time time) {
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

  public Billing taxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

  /**
   * This is the identity of a Tax-paying person or an organization. This number can be provided to the BPP to avail tax benefits, if applicable. The format of this string should be specified in the network policy
   * @return taxNumber
  */
  
  @Schema(name = "tax_number", description = "This is the identity of a Tax-paying person or an organization. This number can be provided to the BPP to avail tax benefits, if applicable. The format of this string should be specified in the network policy", required = false)
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public Billing createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time at which this bill was generated by the BPP.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", description = "Date and time at which this bill was generated by the BPP.", required = false)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Billing billing = (Billing) o;
    return Objects.equals(this.name, billing.name) &&
        Objects.equals(this.organization, billing.organization) &&
        Objects.equals(this.address, billing.address) &&
        Objects.equals(this.email, billing.email) &&
        Objects.equals(this.phone, billing.phone) &&
        Objects.equals(this.time, billing.time) &&
        Objects.equals(this.taxNumber, billing.taxNumber) &&
        Objects.equals(this.createdAt, billing.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, organization, address, email, phone, time, taxNumber, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Billing {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

