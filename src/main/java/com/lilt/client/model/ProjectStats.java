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
 * ProjectStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:02:11.779Z[GMT]")
public class ProjectStats {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SOURCE_WORDS = "sourceWords";
  @SerializedName(SERIALIZED_NAME_SOURCE_WORDS)
  private Integer sourceWords;

  public static final String SERIALIZED_NAME_EXACT_WORDS = "exactWords";
  @SerializedName(SERIALIZED_NAME_EXACT_WORDS)
  private Integer exactWords;

  public static final String SERIALIZED_NAME_FUZZY_WORDS = "fuzzyWords";
  @SerializedName(SERIALIZED_NAME_FUZZY_WORDS)
  private Integer fuzzyWords;

  public static final String SERIALIZED_NAME_NEW_WORDS = "newWords";
  @SerializedName(SERIALIZED_NAME_NEW_WORDS)
  private Integer newWords;


  public ProjectStats id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ProjectStats sourceWords(Integer sourceWords) {
    
    this.sourceWords = sourceWords;
    return this;
  }

   /**
   * Get sourceWords
   * @return sourceWords
  **/
  @ApiModelProperty(example = "1000", required = true, value = "")

  public Integer getSourceWords() {
    return sourceWords;
  }


  public void setSourceWords(Integer sourceWords) {
    this.sourceWords = sourceWords;
  }


  public ProjectStats exactWords(Integer exactWords) {
    
    this.exactWords = exactWords;
    return this;
  }

   /**
   * Get exactWords
   * @return exactWords
  **/
  @ApiModelProperty(example = "800", required = true, value = "")

  public Integer getExactWords() {
    return exactWords;
  }


  public void setExactWords(Integer exactWords) {
    this.exactWords = exactWords;
  }


  public ProjectStats fuzzyWords(Integer fuzzyWords) {
    
    this.fuzzyWords = fuzzyWords;
    return this;
  }

   /**
   * Get fuzzyWords
   * @return fuzzyWords
  **/
  @ApiModelProperty(example = "150", required = true, value = "")

  public Integer getFuzzyWords() {
    return fuzzyWords;
  }


  public void setFuzzyWords(Integer fuzzyWords) {
    this.fuzzyWords = fuzzyWords;
  }


  public ProjectStats newWords(Integer newWords) {
    
    this.newWords = newWords;
    return this;
  }

   /**
   * Get newWords
   * @return newWords
  **/
  @ApiModelProperty(example = "50", required = true, value = "")

  public Integer getNewWords() {
    return newWords;
  }


  public void setNewWords(Integer newWords) {
    this.newWords = newWords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStats projectStats = (ProjectStats) o;
    return Objects.equals(this.id, projectStats.id) &&
        Objects.equals(this.sourceWords, projectStats.sourceWords) &&
        Objects.equals(this.exactWords, projectStats.exactWords) &&
        Objects.equals(this.fuzzyWords, projectStats.fuzzyWords) &&
        Objects.equals(this.newWords, projectStats.newWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceWords, exactWords, fuzzyWords, newWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStats {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceWords: ").append(toIndentedString(sourceWords)).append("\n");
    sb.append("    exactWords: ").append(toIndentedString(exactWords)).append("\n");
    sb.append("    fuzzyWords: ").append(toIndentedString(fuzzyWords)).append("\n");
    sb.append("    newWords: ").append(toIndentedString(newWords)).append("\n");
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

