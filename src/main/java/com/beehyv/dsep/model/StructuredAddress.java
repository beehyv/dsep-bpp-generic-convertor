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
 * Describes a structured address. This contains each component of a postal address as a single field. If supported, the network policy should specify which of these fields are required to be set. The network policy should also specify in what order these fields are to be presented on a user interface.
 */

@Schema(name = "StructuredAddress", description = "Describes a structured address. This contains each component of a postal address as a single field. If supported, the network policy should specify which of these fields are required to be set. The network policy should also specify in what order these fields are to be presented on a user interface.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class StructuredAddress implements Address {

  @JsonProperty("door")
  private String door;

  @JsonProperty("name")
  private String name;

  @JsonProperty("building")
  private String building;

  @JsonProperty("street")
  private String street;

  @JsonProperty("locality")
  private String locality;

  @JsonProperty("district")
  private String district;

  @JsonProperty("ward")
  private String ward;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  @JsonProperty("area_code")
  private String areaCode;

  public StructuredAddress door(String door) {
    this.door = door;
    return this;
  }

  /**
   * Door / Shop number of the address
   * @return door
  */
  
  @Schema(name = "door", description = "Door / Shop number of the address", required = false)
  public String getDoor() {
    return door;
  }

  public void setDoor(String door) {
    this.door = door;
  }

  public StructuredAddress name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of address if applicable. Example, shop name
   * @return name
  */
  
  @Schema(name = "name", description = "Name of address if applicable. Example, shop name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StructuredAddress building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Name of the building or block
   * @return building
  */
  
  @Schema(name = "building", description = "Name of the building or block", required = false)
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public StructuredAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street name or number
   * @return street
  */
  
  @Schema(name = "street", description = "Street name or number", required = false)
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public StructuredAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Name of the locality, apartments
   * @return locality
  */
  
  @Schema(name = "locality", description = "Name of the locality, apartments", required = false)
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public StructuredAddress district(String district) {
    this.district = district;
    return this;
  }

  /**
   * Name of the district this address is in
   * @return district
  */
  
  @Schema(name = "district", description = "Name of the district this address is in", required = false)
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public StructuredAddress ward(String ward) {
    this.ward = ward;
    return this;
  }

  /**
   * Name or number of the ward if applicable
   * @return ward
  */
  
  @Schema(name = "ward", description = "Name or number of the ward if applicable", required = false)
  public String getWard() {
    return ward;
  }

  public void setWard(String ward) {
    this.ward = ward;
  }

  public StructuredAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City name
   * @return city
  */
  
  @Schema(name = "city", description = "City name", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public StructuredAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State name
   * @return state
  */
  
  @Schema(name = "state", description = "State name", required = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public StructuredAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country name
   * @return country
  */
  
  @Schema(name = "country", description = "Country name", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public StructuredAddress areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * Area code. This can be Pincode, ZIP code or any equivalent
   * @return areaCode
  */
  
  @Schema(name = "area_code", description = "Area code. This can be Pincode, ZIP code or any equivalent", required = false)
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAddress structuredAddress = (StructuredAddress) o;
    return Objects.equals(this.door, structuredAddress.door) &&
        Objects.equals(this.name, structuredAddress.name) &&
        Objects.equals(this.building, structuredAddress.building) &&
        Objects.equals(this.street, structuredAddress.street) &&
        Objects.equals(this.locality, structuredAddress.locality) &&
        Objects.equals(this.district, structuredAddress.district) &&
        Objects.equals(this.ward, structuredAddress.ward) &&
        Objects.equals(this.city, structuredAddress.city) &&
        Objects.equals(this.state, structuredAddress.state) &&
        Objects.equals(this.country, structuredAddress.country) &&
        Objects.equals(this.areaCode, structuredAddress.areaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(door, name, building, street, locality, district, ward, city, state, country, areaCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAddress {\n");
    sb.append("    door: ").append(toIndentedString(door)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    ward: ").append(toIndentedString(ward)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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

