package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Ack;
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
 * SearchPost200ResponseMessage
 */

@JsonTypeName("_search_post_200_response_message")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class SearchPost200ResponseMessage {

  @JsonProperty("ack")
  private Ack ack;

  @JsonProperty("catalog")
  private Catalog catalog;

  @JsonProperty("items")
  private List<Item> items;

  @JsonProperty("fulfillment")
  private Fulfillment fulfillment;

  @JsonProperty("confirmation")
  private String confirmation;


  public SearchPost200ResponseMessage ack(Ack ack) {
    this.ack = ack;
    return this;
  }

  /**
   * Get ack
   * @return ack
  */
  @NotNull @Valid 
  @Schema(name = "ack", required = true)
  public Ack getAck() {
    return ack;
  }

  public void setAck(Ack ack) {
    this.ack = ack;
  }


  @Schema(name = "catalog", required = true)
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  @Schema(name="item")
  public List<Item> getItems() {
    return items;
  }


  @Schema(name="fulfillment")
  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public String getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(String confirmation) {
    this.confirmation = confirmation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchPost200ResponseMessage searchPost200ResponseMessage = (SearchPost200ResponseMessage) o;
    return Objects.equals(this.ack, searchPost200ResponseMessage.ack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchPost200ResponseMessage {\n");
    sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
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

