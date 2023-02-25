package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Descriptor;
import com.beehyv.dsep.model.Time;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Describes an offer
 */

@Schema(name = "Offer", description = "Describes an offer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Offer {

  @JsonProperty("id")
  private String id;

  @JsonProperty("descriptor")
  private Descriptor descriptor;

  @JsonProperty("location_ids")
  @Valid
  private List<String> locationIds = null;

  @JsonProperty("category_ids")
  @Valid
  private List<String> categoryIds = null;

  @JsonProperty("item_ids")
  @Valid
  private List<String> itemIds = null;

  @JsonProperty("time")
  private Time time;

  public Offer id(String id) {
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

  public Offer descriptor(Descriptor descriptor) {
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

  public Offer locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public Offer addLocationIdsItem(String locationIdsItem) {
    if (this.locationIds == null) {
      this.locationIds = new ArrayList<>();
    }
    this.locationIds.add(locationIdsItem);
    return this;
  }

  /**
   * Get locationIds
   * @return locationIds
  */
  
  @Schema(name = "location_ids", required = false)
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public Offer categoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public Offer addCategoryIdsItem(String categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  /**
   * Get categoryIds
   * @return categoryIds
  */
  
  @Schema(name = "category_ids", required = false)
  public List<String> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public Offer itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public Offer addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

  /**
   * Get itemIds
   * @return itemIds
  */
  
  @Schema(name = "item_ids", required = false)
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public Offer time(Time time) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.id, offer.id) &&
        Objects.equals(this.descriptor, offer.descriptor) &&
        Objects.equals(this.locationIds, offer.locationIds) &&
        Objects.equals(this.categoryIds, offer.categoryIds) &&
        Objects.equals(this.itemIds, offer.itemIds) &&
        Objects.equals(this.time, offer.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptor, locationIds, categoryIds, itemIds, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

