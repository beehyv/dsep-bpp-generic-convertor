package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Price;
import com.beehyv.dsep.model.Time;
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
 * Describes a product or a service offered to the end consumer by the provider.
 */

@Schema(name = "Item", description = "Describes a product or a service offered to the end consumer by the provider.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Item {

  @JsonProperty("id")
  private String id;

  @JsonProperty("parent_item_id")
  private String parentItemId;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("price")
  private Price price;

  @JsonProperty("category_id")
  private String categoryId;

  @JsonProperty("fulfillment_id")
  private String fulfillmentId;

  @JsonProperty("rating")
  private String rating;

  @JsonProperty("location_id")
  private String locationId;

  @JsonProperty("time")
  private Time time;

  @JsonProperty("rateable")
  private Boolean rateable;

  @JsonProperty("matched")
  private Boolean matched;

  @JsonProperty("related")
  private Boolean related;

  @JsonProperty("recommended")
  private Boolean recommended;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  @JsonProperty("value")
  private String value;

  public Item id(String id) {
    this.id = id;
    return this;
  }

  /**
   * This is the most unique identifier of a service item. An example of an Item ID could be the SKU of a product.
   * @return id
  */
  
  @Schema(name = "id", description = "This is the most unique identifier of a service item. An example of an Item ID could be the SKU of a product.", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item parentItemId(String parentItemId) {
    this.parentItemId = parentItemId;
    return this;
  }

  /**
   * Get parentItemId
   * @return parentItemId
  */
  
  @Schema(name = "parent_item_id", required = false)
  public String getParentItemId() {
    return parentItemId;
  }

  public void setParentItemId(String parentItemId) {
    this.parentItemId = parentItemId;
  }

  public Item descriptor(Descriptor descriptor) {
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

  public Item price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", required = false)
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Item categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "category_id", required = false)
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public Item fulfillmentId(String fulfillmentId) {
    this.fulfillmentId = fulfillmentId;
    return this;
  }

  /**
   * Get fulfillmentId
   * @return fulfillmentId
  */
  
  @Schema(name = "fulfillment_id", required = false)
  public String getFulfillmentId() {
    return fulfillmentId;
  }

  public void setFulfillmentId(String fulfillmentId) {
    this.fulfillmentId = fulfillmentId;
  }

  public Item rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  
  @Schema(name = "rating", required = false)
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public Item locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  
  @Schema(name = "location_id", required = false)
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Item time(Time time) {
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

  public Item rateable(Boolean rateable) {
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

  public Item matched(Boolean matched) {
    this.matched = matched;
    return this;
  }

  /**
   * Get matched
   * @return matched
  */
  
  @Schema(name = "matched", required = false)
  public Boolean getMatched() {
    return matched;
  }

  public void setMatched(Boolean matched) {
    this.matched = matched;
  }

  public Item related(Boolean related) {
    this.related = related;
    return this;
  }

  /**
   * Get related
   * @return related
  */
  
  @Schema(name = "related", required = false)
  public Boolean getRelated() {
    return related;
  }

  public void setRelated(Boolean related) {
    this.related = related;
  }

  public Item recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

  /**
   * Get recommended
   * @return recommended
  */
  
  @Schema(name = "recommended", required = false)
  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public Item tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Item putTagsItem(String key, String tagsItem) {
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

  public Item value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", required = false)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.parentItemId, item.parentItemId) &&
        Objects.equals(this.descriptor, item.descriptor) &&
        Objects.equals(this.price, item.price) &&
        Objects.equals(this.categoryId, item.categoryId) &&
        Objects.equals(this.fulfillmentId, item.fulfillmentId) &&
        Objects.equals(this.rating, item.rating) &&
        Objects.equals(this.locationId, item.locationId) &&
        Objects.equals(this.time, item.time) &&
        Objects.equals(this.rateable, item.rateable) &&
        Objects.equals(this.matched, item.matched) &&
        Objects.equals(this.related, item.related) &&
        Objects.equals(this.recommended, item.recommended) &&
        Objects.equals(this.tags, item.tags) &&
        Objects.equals(this.value, item.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentItemId, descriptor, price, categoryId, fulfillmentId, rating, locationId, time, rateable, matched, related, recommended, tags, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentItemId: ").append(toIndentedString(parentItemId)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    fulfillmentId: ").append(toIndentedString(fulfillmentId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    rateable: ").append(toIndentedString(rateable)).append("\n");
    sb.append("    matched: ").append(toIndentedString(matched)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

