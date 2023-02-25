package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.AddOn;
import com.beehyv.dsep.model.Location;
import com.beehyv.dsep.model.Offer;
import com.beehyv.dsep.model.OnSelectPostRequestMessageOrderItemsInner;
import com.beehyv.dsep.model.Provider;
import com.beehyv.dsep.model.Quotation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OnSelectPostRequestMessageOrder
 */

@JsonTypeName("_on_select_post_request_message_order")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnSelectPostRequestMessageOrder {

  @JsonProperty("provider")
  private Provider provider;

  @JsonProperty("provider_location")
  private Location providerLocation;

  @JsonProperty("items")
  @Valid
  private List<OnSelectPostRequestMessageOrderItemsInner> items = null;

  @JsonProperty("add_ons")
  @Valid
  private List<AddOn> addOns = null;

  @JsonProperty("offers")
  @Valid
  private List<Offer> offers = null;

  @JsonProperty("quote")
  private Quotation quote;

  public OnSelectPostRequestMessageOrder provider(Provider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  @Valid 
  @Schema(name = "provider", required = false)
  public Provider getProvider() {
    return provider;
  }

  public void setProvider(Provider provider) {
    this.provider = provider;
  }

  public OnSelectPostRequestMessageOrder providerLocation(Location providerLocation) {
    this.providerLocation = providerLocation;
    return this;
  }

  /**
   * Get providerLocation
   * @return providerLocation
  */
  @Valid 
  @Schema(name = "provider_location", required = false)
  public Location getProviderLocation() {
    return providerLocation;
  }

  public void setProviderLocation(Location providerLocation) {
    this.providerLocation = providerLocation;
  }

  public OnSelectPostRequestMessageOrder items(List<OnSelectPostRequestMessageOrderItemsInner> items) {
    this.items = items;
    return this;
  }

  public OnSelectPostRequestMessageOrder addItemsItem(OnSelectPostRequestMessageOrderItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", required = false)
  public List<OnSelectPostRequestMessageOrderItemsInner> getItems() {
    return items;
  }

  public void setItems(List<OnSelectPostRequestMessageOrderItemsInner> items) {
    this.items = items;
  }

  public OnSelectPostRequestMessageOrder addOns(List<AddOn> addOns) {
    this.addOns = addOns;
    return this;
  }

  public OnSelectPostRequestMessageOrder addAddOnsItem(AddOn addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new ArrayList<>();
    }
    this.addOns.add(addOnsItem);
    return this;
  }

  /**
   * Get addOns
   * @return addOns
  */
  @Valid 
  @Schema(name = "add_ons", required = false)
  public List<AddOn> getAddOns() {
    return addOns;
  }

  public void setAddOns(List<AddOn> addOns) {
    this.addOns = addOns;
  }

  public OnSelectPostRequestMessageOrder offers(List<Offer> offers) {
    this.offers = offers;
    return this;
  }

  public OnSelectPostRequestMessageOrder addOffersItem(Offer offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Get offers
   * @return offers
  */
  @Valid 
  @Schema(name = "offers", required = false)
  public List<Offer> getOffers() {
    return offers;
  }

  public void setOffers(List<Offer> offers) {
    this.offers = offers;
  }

  public OnSelectPostRequestMessageOrder quote(Quotation quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
  */
  @Valid 
  @Schema(name = "quote", required = false)
  public Quotation getQuote() {
    return quote;
  }

  public void setQuote(Quotation quote) {
    this.quote = quote;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnSelectPostRequestMessageOrder onSelectPostRequestMessageOrder = (OnSelectPostRequestMessageOrder) o;
    return Objects.equals(this.provider, onSelectPostRequestMessageOrder.provider) &&
        Objects.equals(this.providerLocation, onSelectPostRequestMessageOrder.providerLocation) &&
        Objects.equals(this.items, onSelectPostRequestMessageOrder.items) &&
        Objects.equals(this.addOns, onSelectPostRequestMessageOrder.addOns) &&
        Objects.equals(this.offers, onSelectPostRequestMessageOrder.offers) &&
        Objects.equals(this.quote, onSelectPostRequestMessageOrder.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, providerLocation, items, addOns, offers, quote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnSelectPostRequestMessageOrder {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerLocation: ").append(toIndentedString(providerLocation)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

