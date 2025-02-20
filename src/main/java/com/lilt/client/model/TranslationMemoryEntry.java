/*
 * Lilt REST API
 * Lilt REST API Support: https://lilt.atlassian.net/servicedesk/customer/portals    The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:   * Training of and translating with interactive, adaptive machine translation   * Large-scale translation memory   * The Lexicon (a large-scale termbase)   * Programmatic control of the Lilt CAT environment   * Translation memory synchronization  Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests.  The base url for this REST API is `https://api.lilt.com/`.  ## Authentication  Requests are authenticated via REST API key, which requires the Business plan.  Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.  For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.  ## Quotas  Our services have a general quota of 4000 requests per minute. Should you hit the maximum requests per minute, you will need to wait 60 seconds before you can send another request. 
 *
 * The version of the OpenAPI document: v3.0.1
 * 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A translation memory entry.
 */
@ApiModel(description = "A translation memory entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:02:11.779Z[GMT]")
public class TranslationMemoryEntry {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;


  public TranslationMemoryEntry source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source string.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The red bus.", value = "The source string.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public TranslationMemoryEntry target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target string. Tags will be automatically placed according to the query string.
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Le bus rouge.", value = "The target string. Tags will be automatically placed according to the query string.")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public TranslationMemoryEntry score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * The fuzzy match score.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The fuzzy match score.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public TranslationMemoryEntry metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Attributes describing the translation memory entry.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes describing the translation memory entry.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationMemoryEntry translationMemoryEntry = (TranslationMemoryEntry) o;
    return Objects.equals(this.source, translationMemoryEntry.source) &&
        Objects.equals(this.target, translationMemoryEntry.target) &&
        Objects.equals(this.score, translationMemoryEntry.score) &&
        Objects.equals(this.metadata, translationMemoryEntry.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target, score, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationMemoryEntry {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

