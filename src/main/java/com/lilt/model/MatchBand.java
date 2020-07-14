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
 * A translation memory match band. 
 */
@ApiModel(description = "A translation memory match band. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-13T16:57:35.902304-07:00[America/Los_Angeles]")
public class MatchBand {
  public static final String SERIALIZED_NAME_MINIMUM_SCORE = "minimum_score";
  @SerializedName(SERIALIZED_NAME_MINIMUM_SCORE)
  private Integer minimumScore;

  public static final String SERIALIZED_NAME_MAXIMUM_SCORE = "maximum_score";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_SCORE)
  private Integer maximumScore;

  public static final String SERIALIZED_NAME_NUM_SOURCE_WORDS = "num_source_words";
  @SerializedName(SERIALIZED_NAME_NUM_SOURCE_WORDS)
  private Integer numSourceWords;

  public static final String SERIALIZED_NAME_NUM_SEGMENTS = "num_segments";
  @SerializedName(SERIALIZED_NAME_NUM_SEGMENTS)
  private Integer numSegments;


  public MatchBand minimumScore(Integer minimumScore) {
    
    this.minimumScore = minimumScore;
    return this;
  }

   /**
   * The minimum fuzzy match score.
   * @return minimumScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "94", value = "The minimum fuzzy match score.")

  public Integer getMinimumScore() {
    return minimumScore;
  }


  public void setMinimumScore(Integer minimumScore) {
    this.minimumScore = minimumScore;
  }


  public MatchBand maximumScore(Integer maximumScore) {
    
    this.maximumScore = maximumScore;
    return this;
  }

   /**
   * The maximum fuzzy match score.
   * @return maximumScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "85", value = "The maximum fuzzy match score.")

  public Integer getMaximumScore() {
    return maximumScore;
  }


  public void setMaximumScore(Integer maximumScore) {
    this.maximumScore = maximumScore;
  }


  public MatchBand numSourceWords(Integer numSourceWords) {
    
    this.numSourceWords = numSourceWords;
    return this;
  }

   /**
   * The number of source words in the band.
   * @return numSourceWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "151", value = "The number of source words in the band.")

  public Integer getNumSourceWords() {
    return numSourceWords;
  }


  public void setNumSourceWords(Integer numSourceWords) {
    this.numSourceWords = numSourceWords;
  }


  public MatchBand numSegments(Integer numSegments) {
    
    this.numSegments = numSegments;
    return this;
  }

   /**
   * The number of source segments in the band.
   * @return numSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The number of source segments in the band.")

  public Integer getNumSegments() {
    return numSegments;
  }


  public void setNumSegments(Integer numSegments) {
    this.numSegments = numSegments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchBand matchBand = (MatchBand) o;
    return Objects.equals(this.minimumScore, matchBand.minimumScore) &&
        Objects.equals(this.maximumScore, matchBand.maximumScore) &&
        Objects.equals(this.numSourceWords, matchBand.numSourceWords) &&
        Objects.equals(this.numSegments, matchBand.numSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumScore, maximumScore, numSourceWords, numSegments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchBand {\n");
    sb.append("    minimumScore: ").append(toIndentedString(minimumScore)).append("\n");
    sb.append("    maximumScore: ").append(toIndentedString(maximumScore)).append("\n");
    sb.append("    numSourceWords: ").append(toIndentedString(numSourceWords)).append("\n");
    sb.append("    numSegments: ").append(toIndentedString(numSegments)).append("\n");
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

