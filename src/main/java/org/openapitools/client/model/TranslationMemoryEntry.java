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


package org.openapitools.client.model;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T14:06:28.124270-07:00[America/Los_Angeles]")
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

