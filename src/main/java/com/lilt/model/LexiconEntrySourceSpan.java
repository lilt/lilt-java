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
import java.math.BigDecimal;

/**
 * An object that indicates where the query term appears in the source.
 */
@ApiModel(description = "An object that indicates where the query term appears in the source.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-04T17:28:50.309026-07:00[America/Los_Angeles]")
public class LexiconEntrySourceSpan {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private BigDecimal start;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private BigDecimal length;


  public LexiconEntrySourceSpan start(BigDecimal start) {
    
    this.start = start;
    return this;
  }

   /**
   * The zero-indexed start index when &#x60;source&#x60; is split on whitespace. 
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The zero-indexed start index when `source` is split on whitespace. ")

  public BigDecimal getStart() {
    return start;
  }


  public void setStart(BigDecimal start) {
    this.start = start;
  }


  public LexiconEntrySourceSpan length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

   /**
   * The length in words after &#x60;start&#x60; of the source query term. 
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length in words after `start` of the source query term. ")

  public BigDecimal getLength() {
    return length;
  }


  public void setLength(BigDecimal length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexiconEntrySourceSpan lexiconEntrySourceSpan = (LexiconEntrySourceSpan) o;
    return Objects.equals(this.start, lexiconEntrySourceSpan.start) &&
        Objects.equals(this.length, lexiconEntrySourceSpan.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, length);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexiconEntrySourceSpan {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

