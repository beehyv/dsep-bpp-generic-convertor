package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Billing;
import com.beehyv.dsep.model.Document;
import com.beehyv.dsep.model.Fulfillment;
import com.beehyv.dsep.model.Payment;
import com.beehyv.dsep.model.Provider;
import com.beehyv.dsep.model.Quotation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Describes the details of an order.
 */

@Schema(name = "Order", description = "Describes the details of an order.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Order {

  @JsonProperty("id")
  private String id;

  /**
   * Describes the state of an order.
   */
  public enum StateEnum {
    DRAFT("DRAFT"),
    
    ACTIVE("ACTIVE"),
    
    COMPLETE("COMPLETE"),
    
    CANCELLED("CANCELLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("state")
  private StateEnum state;

  @JsonProperty("provider")
  private Provider provider;

  @JsonProperty("documents")
  @Valid
  private List<Document> documents = null;

  @JsonProperty("billing")
  private Billing billing;

  @JsonProperty("fulfillment")
  private Fulfillment fulfillment;

  @JsonProperty("quote")
  private Quotation quote;

  @JsonProperty("payment")
  private Payment payment;

  @JsonProperty("created_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Order id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Order ID as generated inside the provider's order management system. If the provider is unable to generate an order id, then the BPP must generate this order_id.
   * @return id
  */
  
  @Schema(name = "id", description = "Order ID as generated inside the provider's order management system. If the provider is unable to generate an order id, then the BPP must generate this order_id.", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Describes the state of an order.
   * @return state
  */
  
  @Schema(name = "state", description = "Describes the state of an order.", required = false)
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Order provider(Provider provider) {
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

  public Order documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public Order addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
  */
  @Valid 
  @Schema(name = "documents", required = false)
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public Order billing(Billing billing) {
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

  public Order fulfillment(Fulfillment fulfillment) {
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

  public Order quote(Quotation quote) {
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

  public Order payment(Payment payment) {
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

  public Order createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", required = false)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Order updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", required = false)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.state, order.state) &&
        Objects.equals(this.provider, order.provider) &&
        Objects.equals(this.documents, order.documents) &&
        Objects.equals(this.billing, order.billing) &&
        Objects.equals(this.fulfillment, order.fulfillment) &&
        Objects.equals(this.quote, order.quote) &&
        Objects.equals(this.payment, order.payment) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        Objects.equals(this.updatedAt, order.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, provider, documents, billing, fulfillment, quote, payment, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

