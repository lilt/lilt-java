/*
 * Lilt REST API
 * The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:   * Training of and translating with interactive, adaptive machine translation   * Large-scale translation memory   * The Lexicon (a large-scale termbase)   * Programmatic control of the Lilt CAT environment   * Translation memory synchronization  Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests. ## Authentication Requests are authenticated via REST API key, which requires the Business plan.  Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.  For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use. 
 *
 * The version of the OpenAPI document: v2.0
 * Contact: support@lilt.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lilt.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lilt.client.model.QARuleMatchesContext;
import com.lilt.client.model.QARuleMatchesReplacements;
import com.lilt.client.model.QARuleMatchesRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QARuleMatchesMatches
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-24T00:29:30.356Z[GMT]")
public class QARuleMatchesMatches {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private QARuleMatchesContext context;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_REPLACEMENTS = "replacements";
  @SerializedName(SERIALIZED_NAME_REPLACEMENTS)
  private List<QARuleMatchesReplacements> replacements = new ArrayList<QARuleMatchesReplacements>();

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private QARuleMatchesRule rule;

  public static final String SERIALIZED_NAME_SHORT_MESSAGE = "shortMessage";
  @SerializedName(SERIALIZED_NAME_SHORT_MESSAGE)
  private String shortMessage;


  public QARuleMatchesMatches context(QARuleMatchesContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(required = true, value = "")

  public QARuleMatchesContext getContext() {
    return context;
  }


  public void setContext(QARuleMatchesContext context) {
    this.context = context;
  }


  public QARuleMatchesMatches length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * The length of the error in characters.
   * @return length
  **/
  @ApiModelProperty(example = "7", required = true, value = "The length of the error in characters.")

  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public QARuleMatchesMatches message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message about the error displayed to the user.
   * @return message
  **/
  @ApiModelProperty(example = "Possible spelling mistake found", required = true, value = "Message about the error displayed to the user.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public QARuleMatchesMatches offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The 0-based character offset of the error in the text.
   * @return offset
  **/
  @ApiModelProperty(example = "19", required = true, value = "The 0-based character offset of the error in the text.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public QARuleMatchesMatches replacements(List<QARuleMatchesReplacements> replacements) {
    
    this.replacements = replacements;
    return this;
  }

  public QARuleMatchesMatches addReplacementsItem(QARuleMatchesReplacements replacementsItem) {
    this.replacements.add(replacementsItem);
    return this;
  }

   /**
   * Replacements that might correct the error. The array can be empty, in this case there is no suggested replacement.
   * @return replacements
  **/
  @ApiModelProperty(example = "[{value=spelling}, {value=spewing}, {value=spieling}]", required = true, value = "Replacements that might correct the error. The array can be empty, in this case there is no suggested replacement.")

  public List<QARuleMatchesReplacements> getReplacements() {
    return replacements;
  }


  public void setReplacements(List<QARuleMatchesReplacements> replacements) {
    this.replacements = replacements;
  }


  public QARuleMatchesMatches rule(QARuleMatchesRule rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QARuleMatchesRule getRule() {
    return rule;
  }


  public void setRule(QARuleMatchesRule rule) {
    this.rule = rule;
  }


  public QARuleMatchesMatches shortMessage(String shortMessage) {
    
    this.shortMessage = shortMessage;
    return this;
  }

   /**
   * An optional shorter version of &#39;message&#39;.
   * @return shortMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Spelling mistake", value = "An optional shorter version of 'message'.")

  public String getShortMessage() {
    return shortMessage;
  }


  public void setShortMessage(String shortMessage) {
    this.shortMessage = shortMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QARuleMatchesMatches qaRuleMatchesMatches = (QARuleMatchesMatches) o;
    return Objects.equals(this.context, qaRuleMatchesMatches.context) &&
        Objects.equals(this.length, qaRuleMatchesMatches.length) &&
        Objects.equals(this.message, qaRuleMatchesMatches.message) &&
        Objects.equals(this.offset, qaRuleMatchesMatches.offset) &&
        Objects.equals(this.replacements, qaRuleMatchesMatches.replacements) &&
        Objects.equals(this.rule, qaRuleMatchesMatches.rule) &&
        Objects.equals(this.shortMessage, qaRuleMatchesMatches.shortMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, length, message, offset, replacements, rule, shortMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QARuleMatchesMatches {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    replacements: ").append(toIndentedString(replacements)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    shortMessage: ").append(toIndentedString(shortMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

