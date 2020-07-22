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


package com.lilt.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QARuleMatchesContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-13T16:57:35.902304-07:00[America/Los_Angeles]")
public class QARuleMatchesContext {
  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;


  public QARuleMatchesContext length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * The length of the error in characters in the context.
   * @return length
  **/
  @ApiModelProperty(example = "7", required = true, value = "The length of the error in characters in the context.")

  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public QARuleMatchesContext offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The 0-based character offset of the error in the context text.
   * @return offset
  **/
  @ApiModelProperty(example = "19", required = true, value = "The 0-based character offset of the error in the context text.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public QARuleMatchesContext text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Context of the error, i.e. the error and some text to the left and to the left.
   * @return text
  **/
  @ApiModelProperty(example = "This segment has a speling mistake", required = true, value = "Context of the error, i.e. the error and some text to the left and to the left.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QARuleMatchesContext qaRuleMatchesContext = (QARuleMatchesContext) o;
    return Objects.equals(this.length, qaRuleMatchesContext.length) &&
        Objects.equals(this.offset, qaRuleMatchesContext.offset) &&
        Objects.equals(this.text, qaRuleMatchesContext.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, offset, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QARuleMatchesContext {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

