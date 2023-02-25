package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
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
 * Describes the description of a real-world object.
 */

@Schema(name = "Descriptor", description = "Describes the description of a real-world object.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Descriptor {

  @JsonProperty("name")
  private String name;

  @JsonProperty("code")
  private String code;

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("short_desc")
  private String shortDesc;

  @JsonProperty("long_desc")
  private String longDesc;

  @JsonProperty("images")
  @Valid
  private List<String> images = null;

  @JsonProperty("audio")
  private URI audio;

  @JsonProperty("3d_render")
  private URI _3dRender;

  public Descriptor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Descriptor code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
  @Schema(name = "code", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Descriptor symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  */
  
  @Schema(name = "symbol", required = false)
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Descriptor shortDesc(String shortDesc) {
    this.shortDesc = shortDesc;
    return this;
  }

  /**
   * Get shortDesc
   * @return shortDesc
  */
  
  @Schema(name = "short_desc", required = false)
  public String getShortDesc() {
    return shortDesc;
  }

  public void setShortDesc(String shortDesc) {
    this.shortDesc = shortDesc;
  }

  public Descriptor longDesc(String longDesc) {
    this.longDesc = longDesc;
    return this;
  }

  /**
   * Get longDesc
   * @return longDesc
  */
  
  @Schema(name = "long_desc", required = false)
  public String getLongDesc() {
    return longDesc;
  }

  public void setLongDesc(String longDesc) {
    this.longDesc = longDesc;
  }

  public Descriptor images(List<String> images) {
    this.images = images;
    return this;
  }

  public Descriptor addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  
  @Schema(name = "images", required = false)
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public Descriptor audio(URI audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Get audio
   * @return audio
  */
  @Valid 
  @Schema(name = "audio", required = false)
  public URI getAudio() {
    return audio;
  }

  public void setAudio(URI audio) {
    this.audio = audio;
  }

  public Descriptor _3dRender(URI _3dRender) {
    this._3dRender = _3dRender;
    return this;
  }

  /**
   * Get _3dRender
   * @return _3dRender
  */
  @Valid 
  @Schema(name = "3d_render", required = false)
  public URI get3dRender() {
    return _3dRender;
  }

  public void set3dRender(URI _3dRender) {
    this._3dRender = _3dRender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Descriptor descriptor = (Descriptor) o;
    return Objects.equals(this.name, descriptor.name) &&
        Objects.equals(this.code, descriptor.code) &&
        Objects.equals(this.symbol, descriptor.symbol) &&
        Objects.equals(this.shortDesc, descriptor.shortDesc) &&
        Objects.equals(this.longDesc, descriptor.longDesc) &&
        Objects.equals(this.images, descriptor.images) &&
        Objects.equals(this.audio, descriptor.audio) &&
        Objects.equals(this._3dRender, descriptor._3dRender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, symbol, shortDesc, longDesc, images, audio, _3dRender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Descriptor {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    shortDesc: ").append(toIndentedString(shortDesc)).append("\n");
    sb.append("    longDesc: ").append(toIndentedString(longDesc)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    _3dRender: ").append(toIndentedString(_3dRender)).append("\n");
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

