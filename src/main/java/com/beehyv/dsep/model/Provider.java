package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Category;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.Item;
import com.beehyv.dsep.model.Offer;
import com.beehyv.dsep.model.Payment;
import com.beehyv.dsep.model.ProviderLocationsInner;
import com.beehyv.dsep.model.Time;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes a service provider. This can be a restaurant, a hospital, a Store etc
 */

@Schema(name = "Provider", description = "Describes a service provider. This can be a restaurant, a hospital, a Store etc")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Provider {

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("category_id")
  private String categoryId;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("categories")
  @Valid
  private List<Category> categories = null;

  @JsonProperty("fulfillments")
  @Valid
  private List<Fulfillment> fulfillments = null;

  @JsonProperty("payments")
  @Valid
  private List<Payment> payments = null;

  @JsonProperty("locations")
  @Valid
  private List<ProviderLocationsInner> locations = null;

  @JsonProperty("offers")
  @Valid
  private List<Offer> offers = null;

  @JsonProperty("items")
  @Valid
  private List<Item> items = null;

  @JsonProperty("exp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime exp;

  @JsonProperty("rateable")
  private Boolean rateable;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  public Provider id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the provider
   * @return id
  */
  
  @Schema(name = "id", description = "Id of the provider", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Provider descriptor(Descriptor descriptor) {
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

  public Provider categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Category Id of the provider
   * @return categoryId
  */
  
  @Schema(name = "category_id", description = "Category Id of the provider", required = false)
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public Provider time(Time time) {
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

  public Provider categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Provider addCategoriesItem(Category categoriesItem) {
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

  public Provider fulfillments(List<Fulfillment> fulfillments) {
    this.fulfillments = fulfillments;
    return this;
  }

  public Provider addFulfillmentsItem(Fulfillment fulfillmentsItem) {
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

  public Provider payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public Provider addPaymentsItem(Payment paymentsItem) {
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

  public Provider locations(List<ProviderLocationsInner> locations) {
    this.locations = locations;
    return this;
  }

  public Provider addLocationsItem(ProviderLocationsInner locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
  */
  @Valid 
  @Schema(name = "locations", required = false)
  public List<ProviderLocationsInner> getLocations() {
    return locations;
  }

  public void setLocations(List<ProviderLocationsInner> locations) {
    this.locations = locations;
  }

  public Provider offers(List<Offer> offers) {
    this.offers = offers;
    return this;
  }

  public Provider addOffersItem(Offer offersItem) {
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

  public Provider items(List<Item> items) {
    this.items = items;
    return this;
  }

  public Provider addItemsItem(Item itemsItem) {
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
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Provider exp(OffsetDateTime exp) {
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

  public Provider rateable(Boolean rateable) {
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

  public Provider tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Provider putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Describes a tag. This is a simple key-value store which is used to contain extended metadata
   * @return tags
  */
  
  @Schema(name = "tags", description = "Describes a tag. This is a simple key-value store which is used to contain extended metadata", required = false)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provider provider = (Provider) o;
    return Objects.equals(this.id, provider.id) &&
        Objects.equals(this.descriptor, provider.descriptor) &&
        Objects.equals(this.categoryId, provider.categoryId) &&
        Objects.equals(this.time, provider.time) &&
        Objects.equals(this.categories, provider.categories) &&
        Objects.equals(this.fulfillments, provider.fulfillments) &&
        Objects.equals(this.payments, provider.payments) &&
        Objects.equals(this.locations, provider.locations) &&
        Objects.equals(this.offers, provider.offers) &&
        Objects.equals(this.items, provider.items) &&
        Objects.equals(this.exp, provider.exp) &&
        Objects.equals(this.rateable, provider.rateable) &&
        Objects.equals(this.tags, provider.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, categoryId, time, categories, fulfillments, payments, locations, offers, items, exp, rateable, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    fulfillments: ").append(toIndentedString(fulfillments)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

