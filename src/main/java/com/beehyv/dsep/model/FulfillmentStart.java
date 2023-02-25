package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Contact;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.FulfillmentAuthorization;
import com.beehyv.dsep.model.Location;
import com.beehyv.dsep.model.Person;
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
 * Details on the start of fulfillment
 */

@Schema(name = "Fulfillment_start", description = "Details on the start of fulfillment")
@JsonTypeName("Fulfillment_start")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class FulfillmentStart {

  @JsonProperty("location")
  private Location location;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("instructions")
  private Descriptor instructions;

  @JsonProperty("contact")
  private Contact contact;

  @JsonProperty("person")
  private Person person;

  @JsonProperty("authorization")
  private FulfillmentAuthorization authorization;

  public FulfillmentStart location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", required = false)
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public FulfillmentStart time(Time time) {
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

  public FulfillmentStart instructions(Descriptor instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * Get instructions
   * @return instructions
  */
  @Valid 
  @Schema(name = "instructions", required = false)
  public Descriptor getInstructions() {
    return instructions;
  }

  public void setInstructions(Descriptor instructions) {
    this.instructions = instructions;
  }

  public FulfillmentStart contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @Valid 
  @Schema(name = "contact", required = false)
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public FulfillmentStart person(Person person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @Valid 
  @Schema(name = "person", required = false)
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public FulfillmentStart authorization(FulfillmentAuthorization authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * Get authorization
   * @return authorization
  */
  @Valid 
  @Schema(name = "authorization", required = false)
  public FulfillmentAuthorization getAuthorization() {
    return authorization;
  }

  public void setAuthorization(FulfillmentAuthorization authorization) {
    this.authorization = authorization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentStart fulfillmentStart = (FulfillmentStart) o;
    return Objects.equals(this.location, fulfillmentStart.location) &&
        Objects.equals(this.time, fulfillmentStart.time) &&
        Objects.equals(this.instructions, fulfillmentStart.instructions) &&
        Objects.equals(this.contact, fulfillmentStart.contact) &&
        Objects.equals(this.person, fulfillmentStart.person) &&
        Objects.equals(this.authorization, fulfillmentStart.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, time, instructions, contact, person, authorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentStart {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

