package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Category;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.Offer;
import com.beehyv.dsep.model.Payment;
import com.beehyv.dsep.model.Provider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes a BPP catalog
 */

@Schema(name = "Catalog", description = "Describes a BPP catalog")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Catalog {

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("categories")
  @Valid
  private List<Category> categories = null;

  @JsonProperty("fulfillments")
  @Valid
  private List<Fulfillment> fulfillments = null;

  @JsonProperty("payments")
  @Valid
  private List<Payment> payments = null;

  @JsonProperty("offers")
  @Valid
  private List<Offer> offers = null;

  @JsonProperty("providers")
  @Valid
  private List<Provider> providers = null;

  @JsonProperty("exp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime exp;

  public Catalog descriptor(Descriptor descriptor) {
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

  public Catalog categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Catalog addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @Valid 
  @Schema(name = "categories", required = false)
  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  public Catalog fulfillments(List<Fulfillment> fulfillments) {
    this.fulfillments = fulfillments;
    return this;
  }

  public Catalog addFulfillmentsItem(Fulfillment fulfillmentsItem) {
    if (this.fulfillments == null) {
      this.fulfillments = new ArrayList<>();
    }
    this.fulfillments.add(fulfillmentsItem);
    return this;
  }

  /**
   * Get fulfillments
   * @return fulfillments
  */
  @Valid 
  @Schema(name = "fulfillments", required = false)
  public List<Fulfillment> getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(List<Fulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  public Catalog payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public Catalog addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @Valid 
  @Schema(name = "payments", required = false)
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public Catalog offers(List<Offer> offers) {
    this.offers = offers;
    return this;
  }

  public Catalog addOffersItem(Offer offersItem) {
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

  public Catalog providers(List<Provider> providers) {
    this.providers = providers;
    return this;
  }

  public Catalog addProvidersItem(Provider providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * Get providers
   * @return providers
  */
  @Valid 
  @Schema(name = "providers", required = false)
  public List<Provider> getProviders() {
    return providers;
  }

  public void setProviders(List<Provider> providers) {
    this.providers = providers;
  }

  public Catalog exp(OffsetDateTime exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Time after which catalog has to be refreshed
   * @return exp
  */
  @Valid 
  @Schema(name = "exp", description = "Time after which catalog has to be refreshed", required = false)
  public OffsetDateTime getExp() {
    return exp;
  }

  public void setExp(OffsetDateTime exp) {
    this.exp = exp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.descriptor, catalog.descriptor) &&
        Objects.equals(this.categories, catalog.categories) &&
        Objects.equals(this.fulfillments, catalog.fulfillments) &&
        Objects.equals(this.payments, catalog.payments) &&
        Objects.equals(this.offers, catalog.offers) &&
        Objects.equals(this.providers, catalog.providers) &&
        Objects.equals(this.exp, catalog.exp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptor, categories, fulfillments, payments, offers, providers, exp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    fulfillments: ").append(toIndentedString(fulfillments)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
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

