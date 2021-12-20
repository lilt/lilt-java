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
import com.lilt.client.model.LexiconEntrySourceSpan;
import com.lilt.client.model.LexiconEntryTargetSpan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * LexiconEntryExamples
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-20T00:13:26.792Z[GMT]")
public class LexiconEntryExamples {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SOURCE_DELIMITERS = "sourceDelimiters";
  @SerializedName(SERIALIZED_NAME_SOURCE_DELIMITERS)
  private List<String> sourceDelimiters = null;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TARGET_DELIMITERS = "targetDelimiters";
  @SerializedName(SERIALIZED_NAME_TARGET_DELIMITERS)
  private List<String> targetDelimiters = null;

  public static final String SERIALIZED_NAME_SOURCE_SPAN = "sourceSpan";
  @SerializedName(SERIALIZED_NAME_SOURCE_SPAN)
  private LexiconEntrySourceSpan sourceSpan;

  public static final String SERIALIZED_NAME_TARGET_SPAN = "targetSpan";
  @SerializedName(SERIALIZED_NAME_TARGET_SPAN)
  private LexiconEntryTargetSpan targetSpan;

  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private BigDecimal similarity;

  public static final String SERIALIZED_NAME_MEMORY_ID = "memory_id";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private BigDecimal memoryId;


  public LexiconEntryExamples source(String source) {
    
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


  public LexiconEntryExamples sourceDelimiters(List<String> sourceDelimiters) {
    
    this.sourceDelimiters = sourceDelimiters;
    return this;
  }

  public LexiconEntryExamples addSourceDelimitersItem(String sourceDelimitersItem) {
    if (this.sourceDelimiters == null) {
      this.sourceDelimiters = new ArrayList<String>();
    }
    this.sourceDelimiters.add(sourceDelimitersItem);
    return this;
  }

   /**
   * A format string that indicates, for each word, if the source word should be preceded by a space. 
   * @return sourceDelimiters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A format string that indicates, for each word, if the source word should be preceded by a space. ")

  public List<String> getSourceDelimiters() {
    return sourceDelimiters;
  }


  public void setSourceDelimiters(List<String> sourceDelimiters) {
    this.sourceDelimiters = sourceDelimiters;
  }


  public LexiconEntryExamples target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target string
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target string")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public LexiconEntryExamples targetDelimiters(List<String> targetDelimiters) {
    
    this.targetDelimiters = targetDelimiters;
    return this;
  }

  public LexiconEntryExamples addTargetDelimitersItem(String targetDelimitersItem) {
    if (this.targetDelimiters == null) {
      this.targetDelimiters = new ArrayList<String>();
    }
    this.targetDelimiters.add(targetDelimitersItem);
    return this;
  }

   /**
   * A format string that indicates, for each word, if the target word should be preceded by a space. 
   * @return targetDelimiters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A format string that indicates, for each word, if the target word should be preceded by a space. ")

  public List<String> getTargetDelimiters() {
    return targetDelimiters;
  }


  public void setTargetDelimiters(List<String> targetDelimiters) {
    this.targetDelimiters = targetDelimiters;
  }


  public LexiconEntryExamples sourceSpan(LexiconEntrySourceSpan sourceSpan) {
    
    this.sourceSpan = sourceSpan;
    return this;
  }

   /**
   * Get sourceSpan
   * @return sourceSpan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LexiconEntrySourceSpan getSourceSpan() {
    return sourceSpan;
  }


  public void setSourceSpan(LexiconEntrySourceSpan sourceSpan) {
    this.sourceSpan = sourceSpan;
  }


  public LexiconEntryExamples targetSpan(LexiconEntryTargetSpan targetSpan) {
    
    this.targetSpan = targetSpan;
    return this;
  }

   /**
   * Get targetSpan
   * @return targetSpan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LexiconEntryTargetSpan getTargetSpan() {
    return targetSpan;
  }


  public void setTargetSpan(LexiconEntryTargetSpan targetSpan) {
    this.targetSpan = targetSpan;
  }


  public LexiconEntryExamples similarity(BigDecimal similarity) {
    
    this.similarity = similarity;
    return this;
  }

   /**
   * Get similarity
   * @return similarity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSimilarity() {
    return similarity;
  }


  public void setSimilarity(BigDecimal similarity) {
    this.similarity = similarity;
  }


  public LexiconEntryExamples memoryId(BigDecimal memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * A unique Memory identifier. If this identifier is missing, then the term comes from the generic concordance. 
   * @return memoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique Memory identifier. If this identifier is missing, then the term comes from the generic concordance. ")

  public BigDecimal getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(BigDecimal memoryId) {
    this.memoryId = memoryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexiconEntryExamples lexiconEntryExamples = (LexiconEntryExamples) o;
    return Objects.equals(this.source, lexiconEntryExamples.source) &&
        Objects.equals(this.sourceDelimiters, lexiconEntryExamples.sourceDelimiters) &&
        Objects.equals(this.target, lexiconEntryExamples.target) &&
        Objects.equals(this.targetDelimiters, lexiconEntryExamples.targetDelimiters) &&
        Objects.equals(this.sourceSpan, lexiconEntryExamples.sourceSpan) &&
        Objects.equals(this.targetSpan, lexiconEntryExamples.targetSpan) &&
        Objects.equals(this.similarity, lexiconEntryExamples.similarity) &&
        Objects.equals(this.memoryId, lexiconEntryExamples.memoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, sourceDelimiters, target, targetDelimiters, sourceSpan, targetSpan, similarity, memoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexiconEntryExamples {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceDelimiters: ").append(toIndentedString(sourceDelimiters)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetDelimiters: ").append(toIndentedString(targetDelimiters)).append("\n");
    sb.append("    sourceSpan: ").append(toIndentedString(sourceSpan)).append("\n");
    sb.append("    targetSpan: ").append(toIndentedString(targetSpan)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
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

