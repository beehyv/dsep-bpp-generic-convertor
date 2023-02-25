package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.OperatorAllOfExperience;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.HashMap;
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
 * Describes the agent of a service
 */

@Schema(name = "Operator", description = "Describes the agent of a service")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Operator {

  @JsonProperty("name")
  private String name;

  @JsonProperty("image")
  private String image;

  @JsonProperty("dob")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dob;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("cred")
  private String cred;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  @JsonProperty("experience")
  private OperatorAllOfExperience experience;

  public Operator name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Describes the name of a person in format: ./{given_name}/{honorific_prefix}/{first_name}/{middle_name}/{last_name}/{honorific_suffix}
   * @return name
  */
  @Pattern(regexp = "^\\./[^/]+/[^/]*_/[^/]*_/[^/]*_/[^/]*_/[^/]*$") 
  @Schema(name = "name", description = "Describes the name of a person in format: ./{given_name}/{honorific_prefix}/{first_name}/{middle_name}/{last_name}/{honorific_suffix}", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Operator image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Image of an object. <br/><br/> A url based image will look like <br/><br/>```uri:http://path/to/image``` <br/><br/> An image can also be sent as a data string. For example : <br/><br/> ```data:js87y34ilhriuho84r3i4```
   * @return image
  */
  
  @Schema(name = "image", description = "Image of an object. <br/><br/> A url based image will look like <br/><br/>```uri:http://path/to/image``` <br/><br/> An image can also be sent as a data string. For example : <br/><br/> ```data:js87y34ilhriuho84r3i4```", required = false)
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Operator dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  */
  @Valid 
  @Schema(name = "dob", required = false)
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Operator gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of something, typically a Person, but possibly also fictional characters, animals, etc. While Male and Female may be used, text strings are also acceptable for people who do not identify as a binary gender
   * @return gender
  */
  
  @Schema(name = "gender", description = "Gender of something, typically a Person, but possibly also fictional characters, animals, etc. While Male and Female may be used, text strings are also acceptable for people who do not identify as a binary gender", required = false)
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Operator cred(String cred) {
    this.cred = cred;
    return this;
  }

  /**
   * Get cred
   * @return cred
  */
  
  @Schema(name = "cred", required = false)
  public String getCred() {
    return cred;
  }

  public void setCred(String cred) {
    this.cred = cred;
  }

  public Operator tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Operator putTagsItem(String key, String tagsItem) {
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

  public Operator experience(OperatorAllOfExperience experience) {
    this.experience = experience;
    return this;
  }

  /**
   * Get experience
   * @return experience
  */
  @Valid 
  @Schema(name = "experience", required = false)
  public OperatorAllOfExperience getExperience() {
    return experience;
  }

  public void setExperience(OperatorAllOfExperience experience) {
    this.experience = experience;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operator operator = (Operator) o;
    return Objects.equals(this.name, operator.name) &&
        Objects.equals(this.image, operator.image) &&
        Objects.equals(this.dob, operator.dob) &&
        Objects.equals(this.gender, operator.gender) &&
        Objects.equals(this.cred, operator.cred) &&
        Objects.equals(this.tags, operator.tags) &&
        Objects.equals(this.experience, operator.experience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, image, dob, gender, cred, tags, experience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    cred: ").append(toIndentedString(cred)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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

