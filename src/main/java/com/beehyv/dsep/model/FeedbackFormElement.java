package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An element in the feedback form. It can be question or an answer to the question.
 */

@Schema(name = "FeedbackFormElement", description = "An element in the feedback form. It can be question or an answer to the question.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class FeedbackFormElement {

  @JsonProperty("id")
  private String id;

  @JsonProperty("parent_id")
  private String parentId;

  @JsonProperty("question")
  private String question;

  @JsonProperty("answer")
  private String answer;

  /**
   * Specifies how the answer option should be rendered.
   */
  public enum AnswerTypeEnum {
    RADIO("radio"),
    
    CHECKBOX("checkbox"),
    
    TEXT("text");

    private String value;

    AnswerTypeEnum(String value) {
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
    public static AnswerTypeEnum fromValue(String value) {
      for (AnswerTypeEnum b : AnswerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("answer_type")
  private AnswerTypeEnum answerType;

  public FeedbackFormElement id(String id) {
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

  public FeedbackFormElement parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  */
  
  @Schema(name = "parent_id", required = false)
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public FeedbackFormElement question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Specifies the question to which the answer options will be contained in the child FeedbackFormElements
   * @return question
  */
  
  @Schema(name = "question", description = "Specifies the question to which the answer options will be contained in the child FeedbackFormElements", required = false)
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public FeedbackFormElement answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Specifies an answer option to which the question will be in the FeedbackFormElement specified in parent_id
   * @return answer
  */
  
  @Schema(name = "answer", description = "Specifies an answer option to which the question will be in the FeedbackFormElement specified in parent_id", required = false)
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public FeedbackFormElement answerType(AnswerTypeEnum answerType) {
    this.answerType = answerType;
    return this;
  }

  /**
   * Specifies how the answer option should be rendered.
   * @return answerType
  */
  
  @Schema(name = "answer_type", description = "Specifies how the answer option should be rendered.", required = false)
  public AnswerTypeEnum getAnswerType() {
    return answerType;
  }

  public void setAnswerType(AnswerTypeEnum answerType) {
    this.answerType = answerType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackFormElement feedbackFormElement = (FeedbackFormElement) o;
    return Objects.equals(this.id, feedbackFormElement.id) &&
        Objects.equals(this.parentId, feedbackFormElement.parentId) &&
        Objects.equals(this.question, feedbackFormElement.question) &&
        Objects.equals(this.answer, feedbackFormElement.answer) &&
        Objects.equals(this.answerType, feedbackFormElement.answerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, question, answer, answerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackFormElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    answerType: ").append(toIndentedString(answerType)).append("\n");
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

