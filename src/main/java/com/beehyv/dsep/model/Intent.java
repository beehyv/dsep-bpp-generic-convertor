package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Category;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.Item;
import com.beehyv.dsep.model.Offer;
import com.beehyv.dsep.model.Payment;
import com.beehyv.dsep.model.Provider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Intent of a user. Used for searching for services
 */

@Schema(name = "Intent", description = "Intent of a user. Used for searching for services")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Intent {

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("provider")
  private Provider provider;

  @JsonProperty("fulfillment")
  private Fulfillment fulfillment;

  @JsonProperty("payment")
  private Payment payment;

  @JsonProperty("category")
  private Category category;

  @JsonProperty("offer")
  private Offer offer;

  @JsonProperty("item")
  private Item item;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  public Intent descriptor(Descriptor descriptor) {
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

  public Intent provider(Provider provider) {
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

  public Intent fulfillment(Fulfillment fulfillment) {
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

  public Intent payment(Payment payment) {
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

  public Intent category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @Schema(name = "category", required = false)
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Intent offer(Offer offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
  */
  @Valid 
  @Schema(name = "offer", required = false)
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public Intent item(Item item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @Valid 
  @Schema(name = "item", required = false)
  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public Intent tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Intent putTagsItem(String key, String tagsItem) {
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
    Intent intent = (Intent) o;
    return Objects.equals(this.descriptor, intent.descriptor) &&
        Objects.equals(this.provider, intent.provider) &&
        Objects.equals(this.fulfillment, intent.fulfillment) &&
        Objects.equals(this.payment, intent.payment) &&
        Objects.equals(this.category, intent.category) &&
        Objects.equals(this.offer, intent.offer) &&
        Objects.equals(this.item, intent.item) &&
        Objects.equals(this.tags, intent.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptor, provider, fulfillment, payment, category, offer, item, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intent {\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

