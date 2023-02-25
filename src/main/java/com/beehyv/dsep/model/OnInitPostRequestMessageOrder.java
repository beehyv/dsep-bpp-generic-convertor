package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Billing;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.OnInitPostRequestMessageOrderAddOnsInner;
import com.beehyv.dsep.model.OnInitPostRequestMessageOrderItemsInner;
import com.beehyv.dsep.model.OnInitPostRequestMessageOrderOffersInner;
import com.beehyv.dsep.model.OnInitPostRequestMessageOrderProvider;
import com.beehyv.dsep.model.OnInitPostRequestMessageOrderProviderLocation;
import com.beehyv.dsep.model.Payment;
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
 * OnInitPostRequestMessageOrder
 */

@JsonTypeName("_on_init_post_request_message_order")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class OnInitPostRequestMessageOrder {

  @JsonProperty("provider")
  private OnInitPostRequestMessageOrderProvider provider;

  @JsonProperty("provider_location")
  private OnInitPostRequestMessageOrderProviderLocation providerLocation;

  @JsonProperty("items")
  @Valid
  private List<OnInitPostRequestMessageOrderItemsInner> items = null;

  @JsonProperty("add_ons")
  @Valid
  private List<OnInitPostRequestMessageOrderAddOnsInner> addOns = null;

  @JsonProperty("offers")
  @Valid
  private List<OnInitPostRequestMessageOrderOffersInner> offers = null;

  @JsonProperty("billing")
  private Billing billing;

  @JsonProperty("fulfillment")
  private Fulfillment fulfillment;

  @JsonProperty("quote")
  private Quotation quote;

  @JsonProperty("payment")
  private Payment payment;

  public OnInitPostRequestMessageOrder provider(OnInitPostRequestMessageOrderProvider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  @Valid 
  @Schema(name = "provider", required = false)
  public OnInitPostRequestMessageOrderProvider getProvider() {
    return provider;
  }

  public void setProvider(OnInitPostRequestMessageOrderProvider provider) {
    this.provider = provider;
  }

  public OnInitPostRequestMessageOrder providerLocation(OnInitPostRequestMessageOrderProviderLocation providerLocation) {
    this.providerLocation = providerLocation;
    return this;
  }

  /**
   * Get providerLocation
   * @return providerLocation
  */
  @Valid 
  @Schema(name = "provider_location", required = false)
  public OnInitPostRequestMessageOrderProviderLocation getProviderLocation() {
    return providerLocation;
  }

  public void setProviderLocation(OnInitPostRequestMessageOrderProviderLocation providerLocation) {
    this.providerLocation = providerLocation;
  }

  public OnInitPostRequestMessageOrder items(List<OnInitPostRequestMessageOrderItemsInner> items) {
    this.items = items;
    return this;
  }

  public OnInitPostRequestMessageOrder addItemsItem(OnInitPostRequestMessageOrderItemsInner itemsItem) {
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
  public List<OnInitPostRequestMessageOrderItemsInner> getItems() {
    return items;
  }

  public void setItems(List<OnInitPostRequestMessageOrderItemsInner> items) {
    this.items = items;
  }

  public OnInitPostRequestMessageOrder addOns(List<OnInitPostRequestMessageOrderAddOnsInner> addOns) {
    this.addOns = addOns;
    return this;
  }

  public OnInitPostRequestMessageOrder addAddOnsItem(OnInitPostRequestMessageOrderAddOnsInner addOnsItem) {
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
  public List<OnInitPostRequestMessageOrderAddOnsInner> getAddOns() {
    return addOns;
  }

  public void setAddOns(List<OnInitPostRequestMessageOrderAddOnsInner> addOns) {
    this.addOns = addOns;
  }

  public OnInitPostRequestMessageOrder offers(List<OnInitPostRequestMessageOrderOffersInner> offers) {
    this.offers = offers;
    return this;
  }

  public OnInitPostRequestMessageOrder addOffersItem(OnInitPostRequestMessageOrderOffersInner offersItem) {
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
  public List<OnInitPostRequestMessageOrderOffersInner> getOffers() {
    return offers;
  }

  public void setOffers(List<OnInitPostRequestMessageOrderOffersInner> offers) {
    this.offers = offers;
  }

  public OnInitPostRequestMessageOrder billing(Billing billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Get billing
   * @return billing
  */
  @Valid 
  @Schema(name = "billing", required = false)
  public Billing getBilling() {
    return billing;
  }

  public void setBilling(Billing billing) {
    this.billing = billing;
  }

  public OnInitPostRequestMessageOrder fulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
    return this;
  }

  /**
   * Get fulfillment
   * @return fulfillment
  */
  @Valid 
  @Schema(name = "fulfillment", required = false)
  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  public OnInitPostRequestMessageOrder quote(Quotation quote) {
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

  public OnInitPostRequestMessageOrder payment(Payment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @Valid 
  @Schema(name = "payment", required = false)
  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnInitPostRequestMessageOrder onInitPostRequestMessageOrder = (OnInitPostRequestMessageOrder) o;
    return Objects.equals(this.provider, onInitPostRequestMessageOrder.provider) &&
        Objects.equals(this.providerLocation, onInitPostRequestMessageOrder.providerLocation) &&
        Objects.equals(this.items, onInitPostRequestMessageOrder.items) &&
        Objects.equals(this.addOns, onInitPostRequestMessageOrder.addOns) &&
        Objects.equals(this.offers, onInitPostRequestMessageOrder.offers) &&
        Objects.equals(this.billing, onInitPostRequestMessageOrder.billing) &&
        Objects.equals(this.fulfillment, onInitPostRequestMessageOrder.fulfillment) &&
        Objects.equals(this.quote, onInitPostRequestMessageOrder.quote) &&
        Objects.equals(this.payment, onInitPostRequestMessageOrder.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, providerLocation, items, addOns, offers, billing, fulfillment, quote, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnInitPostRequestMessageOrder {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerLocation: ").append(toIndentedString(providerLocation)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

