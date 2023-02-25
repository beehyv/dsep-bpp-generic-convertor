package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Address;
import com.beehyv.dsep.model.Circle;
import com.beehyv.dsep.model.City;
import com.beehyv.dsep.model.Country;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Time;
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
 * ProviderLocationsInner
 */

@JsonTypeName("Provider_locations_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class ProviderLocationsInner {

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("gps")
  private String gps;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("station_code")
  private String stationCode;

  @JsonProperty("city")
  private City city;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("circle")
  private Circle circle;

  @JsonProperty("polygon")
  private String polygon;

  @JsonProperty("3dspace")
  private String _3dspace;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("rateable")
  private Boolean rateable;

  public ProviderLocationsInner id(String id) {
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

  public ProviderLocationsInner descriptor(Descriptor descriptor) {
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

  public ProviderLocationsInner gps(String gps) {
    this.gps = gps;
    return this;
  }

  /**
   * Describes a gps coordinate
   * @return gps
  */
  @Pattern(regexp = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$") 
  @Schema(name = "gps", description = "Describes a gps coordinate", required = false)
  public String getGps() {
    return gps;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  public ProviderLocationsInner address(Address address) {
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

  public ProviderLocationsInner stationCode(String stationCode) {
    this.stationCode = stationCode;
    return this;
  }

  /**
   * Get stationCode
   * @return stationCode
  */
  
  @Schema(name = "station_code", required = false)
  public String getStationCode() {
    return stationCode;
  }

  public void setStationCode(String stationCode) {
    this.stationCode = stationCode;
  }

  public ProviderLocationsInner city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @Valid 
  @Schema(name = "city", required = false)
  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public ProviderLocationsInner country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @Valid 
  @Schema(name = "country", required = false)
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public ProviderLocationsInner circle(Circle circle) {
    this.circle = circle;
    return this;
  }

  /**
   * Get circle
   * @return circle
  */
  @Valid 
  @Schema(name = "circle", required = false)
  public Circle getCircle() {
    return circle;
  }

  public void setCircle(Circle circle) {
    this.circle = circle;
  }

  public ProviderLocationsInner polygon(String polygon) {
    this.polygon = polygon;
    return this;
  }

  /**
   * Get polygon
   * @return polygon
  */
  
  @Schema(name = "polygon", required = false)
  public String getPolygon() {
    return polygon;
  }

  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  public ProviderLocationsInner _3dspace(String _3dspace) {
    this._3dspace = _3dspace;
    return this;
  }

  /**
   * Get _3dspace
   * @return _3dspace
  */
  
  @Schema(name = "3dspace", required = false)
  public String get3dspace() {
    return _3dspace;
  }

  public void set3dspace(String _3dspace) {
    this._3dspace = _3dspace;
  }

  public ProviderLocationsInner time(Time time) {
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

  public ProviderLocationsInner rateable(Boolean rateable) {
    this.rateable = rateable;
    return this;
  }

  /**
   * If the entity can be rated or not
   * @return rateable
  */
  
  @Schema(name = "rateable", description = "If the entity can be rated or not", required = false)
  public Boolean getRateable() {
    return rateable;
  }

  public void setRateable(Boolean rateable) {
    this.rateable = rateable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderLocationsInner providerLocationsInner = (ProviderLocationsInner) o;
    return Objects.equals(this.id, providerLocationsInner.id) &&
        Objects.equals(this.descriptor, providerLocationsInner.descriptor) &&
        Objects.equals(this.gps, providerLocationsInner.gps) &&
        Objects.equals(this.address, providerLocationsInner.address) &&
        Objects.equals(this.stationCode, providerLocationsInner.stationCode) &&
        Objects.equals(this.city, providerLocationsInner.city) &&
        Objects.equals(this.country, providerLocationsInner.country) &&
        Objects.equals(this.circle, providerLocationsInner.circle) &&
        Objects.equals(this.polygon, providerLocationsInner.polygon) &&
        Objects.equals(this._3dspace, providerLocationsInner._3dspace) &&
        Objects.equals(this.time, providerLocationsInner.time) &&
        Objects.equals(this.rateable, providerLocationsInner.rateable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, gps, address, stationCode, city, country, circle, polygon, _3dspace, time, rateable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderLocationsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    stationCode: ").append(toIndentedString(stationCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    circle: ").append(toIndentedString(circle)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
    sb.append("    _3dspace: ").append(toIndentedString(_3dspace)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
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

