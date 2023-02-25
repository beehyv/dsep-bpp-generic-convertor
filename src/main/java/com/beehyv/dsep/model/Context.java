package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes a beckn message context
 */

@Schema(name = "Context", description = "Describes a beckn message context")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Context {

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("country")
  private String country;

  @JsonProperty("city")
  private String city;

  /**
   * Defines the Beckn API call. Any actions other than the enumerated actions are not supported by Beckn Protocol
   */
  public enum ActionEnum {
    SEARCH("search"),
    
    SELECT("select"),
    
    INIT("init"),
    
    CONFIRM("confirm"),
    
    UPDATE("update"),
    
    STATUS("status"),
    
    TRACK("track"),
    
    CANCEL("cancel"),
    
    RATING("rating"),
    
    SUPPORT("support"),
    
    ON_SEARCH("on_search"),
    
    ON_SELECT("on_select"),
    
    ON_INIT("on_init"),
    
    ON_CONFIRM("on_confirm"),
    
    ON_UPDATE("on_update"),
    
    ON_STATUS("on_status"),
    
    ON_TRACK("on_track"),
    
    ON_CANCEL("on_cancel"),
    
    ON_RATING("on_rating"),
    
    ON_SUPPORT("on_support");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("action")
  private ActionEnum action;

  @JsonProperty("core_version")
  private String coreVersion;

  @JsonProperty("bap_id")
  private URI bapId;

  @JsonProperty("bap_uri")
  private URI bapUri;

  @JsonProperty("bpp_id")
  private URI bppId;

  @JsonProperty("bpp_uri")
  private URI bppUri;

  @JsonProperty("transaction_id")
  private String transactionId;

  @JsonProperty("message_id")
  private String messageId;

  @JsonProperty("timestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @JsonProperty("key")
  private String key;

  @JsonProperty("ttl")
  private String ttl;

  public Context domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Describes the domain of an object
   * @return domain
  */
  @NotNull 
  @Schema(name = "domain", description = "Describes the domain of an object", required = true)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public Context country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @NotNull 
  @Schema(name = "country", required = true)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Context city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @NotNull 
  @Schema(name = "city", required = true)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Context action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Defines the Beckn API call. Any actions other than the enumerated actions are not supported by Beckn Protocol
   * @return action
  */
  @NotNull 
  @Schema(name = "action", description = "Defines the Beckn API call. Any actions other than the enumerated actions are not supported by Beckn Protocol", required = true)
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public Context coreVersion(String coreVersion) {
    this.coreVersion = coreVersion;
    return this;
  }

  /**
   * Version of Beckn core API specification being used
   * @return coreVersion
  */
  @NotNull 
  @Schema(name = "core_version", description = "Version of Beckn core API specification being used", required = true)
  public String getCoreVersion() {
    return coreVersion;
  }

  public void setCoreVersion(String coreVersion) {
    this.coreVersion = coreVersion;
  }

  public Context bapId(URI bapId) {
    this.bapId = bapId;
    return this;
  }

  /**
   * Unique id of the BAP. By default it is the fully qualified domain name of the BAP
   * @return bapId
  */
  @NotNull @Valid 
  @Schema(name = "bap_id", description = "Unique id of the BAP. By default it is the fully qualified domain name of the BAP", required = true)
  public URI getBapId() {
    return bapId;
  }

  public void setBapId(URI bapId) {
    this.bapId = bapId;
  }

  public Context bapUri(URI bapUri) {
    this.bapUri = bapUri;
    return this;
  }

  /**
   * URI of the BAP for accepting callbacks. Must have the same domain name as the bap_id
   * @return bapUri
  */
  @NotNull @Valid 
  @Schema(name = "bap_uri", description = "URI of the BAP for accepting callbacks. Must have the same domain name as the bap_id", required = true)
  public URI getBapUri() {
    return bapUri;
  }

  public void setBapUri(URI bapUri) {
    this.bapUri = bapUri;
  }

  public Context bppId(URI bppId) {
    this.bppId = bppId;
    return this;
  }

  /**
   * Unique id of the BPP. By default it is the fully qualified domain name of the BPP
   * @return bppId
  */
  @Valid 
  @Schema(name = "bpp_id", description = "Unique id of the BPP. By default it is the fully qualified domain name of the BPP", required = false)
  public URI getBppId() {
    return bppId;
  }

  public void setBppId(URI bppId) {
    this.bppId = bppId;
  }

  public Context bppUri(URI bppUri) {
    this.bppUri = bppUri;
    return this;
  }

  /**
   * URI of the BPP. Must have the same domain name as the bap_id
   * @return bppUri
  */
  @Valid 
  @Schema(name = "bpp_uri", description = "URI of the BPP. Must have the same domain name as the bap_id", required = false)
  public URI getBppUri() {
    return bppUri;
  }

  public void setBppUri(URI bppUri) {
    this.bppUri = bppUri;
  }

  public Context transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * This is a unique value which persists across all API calls from search through confirm
   * @return transactionId
  */
  @NotNull 
  @Schema(name = "transaction_id", description = "This is a unique value which persists across all API calls from search through confirm", required = true)
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Context messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * This is a unique value which persists during a request / callback cycle
   * @return messageId
  */
  @NotNull 
  @Schema(name = "message_id", description = "This is a unique value which persists during a request / callback cycle", required = true)
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public Context timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Time of request generation in RFC3339 format
   * @return timestamp
  */
  @NotNull @Valid 
  @Schema(name = "timestamp", description = "Time of request generation in RFC3339 format", required = true)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Context key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The encryption public key of the sender
   * @return key
  */
  
  @Schema(name = "key", description = "The encryption public key of the sender", required = false)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Context ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * The duration in ISO8601 format after timestamp for which this message holds valid
   * @return ttl
  */
  
  @Schema(name = "ttl", description = "The duration in ISO8601 format after timestamp for which this message holds valid", required = false)
  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.domain, context.domain) &&
        Objects.equals(this.country, context.country) &&
        Objects.equals(this.city, context.city) &&
        Objects.equals(this.action, context.action) &&
        Objects.equals(this.coreVersion, context.coreVersion) &&
        Objects.equals(this.bapId, context.bapId) &&
        Objects.equals(this.bapUri, context.bapUri) &&
        Objects.equals(this.bppId, context.bppId) &&
        Objects.equals(this.bppUri, context.bppUri) &&
        Objects.equals(this.transactionId, context.transactionId) &&
        Objects.equals(this.messageId, context.messageId) &&
        Objects.equals(this.timestamp, context.timestamp) &&
        Objects.equals(this.key, context.key) &&
        Objects.equals(this.ttl, context.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, country, city, action, coreVersion, bapId, bapUri, bppId, bppUri, transactionId, messageId, timestamp, key, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    coreVersion: ").append(toIndentedString(coreVersion)).append("\n");
    sb.append("    bapId: ").append(toIndentedString(bapId)).append("\n");
    sb.append("    bapUri: ").append(toIndentedString(bapUri)).append("\n");
    sb.append("    bppId: ").append(toIndentedString(bppId)).append("\n");
    sb.append("    bppUri: ").append(toIndentedString(bppUri)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

