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
 * LexiconEntryTranslations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-13T16:57:35.902304-07:00[America/Los_Angeles]")
public class LexiconEntryTranslations {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private BigDecimal frequency;

  public static final String SERIALIZED_NAME_MEMORY_ID = "memory_id";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private BigDecimal memoryId;


  public LexiconEntryTranslations source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source string.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source string.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public LexiconEntryTranslations target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target string.
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target string.")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public LexiconEntryTranslations frequency(BigDecimal frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency of the term in the Lexicon.
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The frequency of the term in the Lexicon.")

  public BigDecimal getFrequency() {
    return frequency;
  }


  public void setFrequency(BigDecimal frequency) {
    this.frequency = frequency;
  }


  public LexiconEntryTranslations memoryId(BigDecimal memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * A unique Memory identifier. If this identifier is missing, then the term comes from the generic termbase. 
   * @return memoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique Memory identifier. If this identifier is missing, then the term comes from the generic termbase. ")

  public BigDecimal getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(BigDecimal memoryId) {
    this.memoryId = memoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexiconEntryTranslations lexiconEntryTranslations = (LexiconEntryTranslations) o;
    return Objects.equals(this.source, lexiconEntryTranslations.source) &&
        Objects.equals(this.target, lexiconEntryTranslations.target) &&
        Objects.equals(this.frequency, lexiconEntryTranslations.frequency) &&
        Objects.equals(this.memoryId, lexiconEntryTranslations.memoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target, frequency, memoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexiconEntryTranslations {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
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

