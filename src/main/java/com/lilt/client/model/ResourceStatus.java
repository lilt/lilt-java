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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The status of a resource working on a Project. 
 */
@ApiModel(description = "The status of a resource working on a Project. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-04T23:50:13.754Z[GMT]")
public class ResourceStatus {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUM_WORDS_CONFIRMED = "num_words_confirmed";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_CONFIRMED)
  private Integer numWordsConfirmed;

  public static final String SERIALIZED_NAME_NUM_WORDS_NEW = "num_words_new";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_NEW)
  private Integer numWordsNew;

  public static final String SERIALIZED_NAME_NUM_WORDS_FUZZY = "num_words_fuzzy";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_FUZZY)
  private Integer numWordsFuzzy;

  public static final String SERIALIZED_NAME_NUM_WORDS_EXACT = "num_words_exact";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_EXACT)
  private Integer numWordsExact;

  public static final String SERIALIZED_NAME_NUM_WORDS_REVIEWED = "num_words_reviewed";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_REVIEWED)
  private Integer numWordsReviewed;

  public static final String SERIALIZED_NAME_TIME_ELAPSED = "time_elapsed";
  @SerializedName(SERIALIZED_NAME_TIME_ELAPSED)
  private Integer timeElapsed;

  public static final String SERIALIZED_NAME_TIME_ELAPSED_TRANSLATION = "time_elapsed_translation";
  @SerializedName(SERIALIZED_NAME_TIME_ELAPSED_TRANSLATION)
  private Integer timeElapsedTranslation;

  public static final String SERIALIZED_NAME_TIME_ELAPSED_RESEARCH = "time_elapsed_research";
  @SerializedName(SERIALIZED_NAME_TIME_ELAPSED_RESEARCH)
  private Integer timeElapsedResearch;

  public static final String SERIALIZED_NAME_TIME_ELAPSED_REVIEW = "time_elapsed_review";
  @SerializedName(SERIALIZED_NAME_TIME_ELAPSED_REVIEW)
  private Integer timeElapsedReview;

  public static final String SERIALIZED_NAME_NUM_SEGMENTS_CONFIRMED = "num_segments_confirmed";
  @SerializedName(SERIALIZED_NAME_NUM_SEGMENTS_CONFIRMED)
  private Integer numSegmentsConfirmed;

  public static final String SERIALIZED_NAME_NUM_SEGMENTS_REVIEWED = "num_segments_reviewed";
  @SerializedName(SERIALIZED_NAME_NUM_SEGMENTS_REVIEWED)
  private Integer numSegmentsReviewed;


  public ResourceStatus email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * An email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "joe.strummer@lilt.com", value = "An email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ResourceStatus name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Joe Strummer", value = "The full name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ResourceStatus numWordsConfirmed(Integer numWordsConfirmed) {
    
    this.numWordsConfirmed = numWordsConfirmed;
    return this;
  }

   /**
   * The number of source words confirmed.
   * @return numWordsConfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "151", value = "The number of source words confirmed.")

  public Integer getNumWordsConfirmed() {
    return numWordsConfirmed;
  }


  public void setNumWordsConfirmed(Integer numWordsConfirmed) {
    this.numWordsConfirmed = numWordsConfirmed;
  }


  public ResourceStatus numWordsNew(Integer numWordsNew) {
    
    this.numWordsNew = numWordsNew;
    return this;
  }

   /**
   * The number of new source words confirmed.
   * @return numWordsNew
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The number of new source words confirmed.")

  public Integer getNumWordsNew() {
    return numWordsNew;
  }


  public void setNumWordsNew(Integer numWordsNew) {
    this.numWordsNew = numWordsNew;
  }


  public ResourceStatus numWordsFuzzy(Integer numWordsFuzzy) {
    
    this.numWordsFuzzy = numWordsFuzzy;
    return this;
  }

   /**
   * The number of fuzzy match source words confirmed.
   * @return numWordsFuzzy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "The number of fuzzy match source words confirmed.")

  public Integer getNumWordsFuzzy() {
    return numWordsFuzzy;
  }


  public void setNumWordsFuzzy(Integer numWordsFuzzy) {
    this.numWordsFuzzy = numWordsFuzzy;
  }


  public ResourceStatus numWordsExact(Integer numWordsExact) {
    
    this.numWordsExact = numWordsExact;
    return this;
  }

   /**
   * The number of exact match source words confirmed.
   * @return numWordsExact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "56", value = "The number of exact match source words confirmed.")

  public Integer getNumWordsExact() {
    return numWordsExact;
  }


  public void setNumWordsExact(Integer numWordsExact) {
    this.numWordsExact = numWordsExact;
  }


  public ResourceStatus numWordsReviewed(Integer numWordsReviewed) {
    
    this.numWordsReviewed = numWordsReviewed;
    return this;
  }

   /**
   * The number of source words reviewed.
   * @return numWordsReviewed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "182", value = "The number of source words reviewed.")

  public Integer getNumWordsReviewed() {
    return numWordsReviewed;
  }


  public void setNumWordsReviewed(Integer numWordsReviewed) {
    this.numWordsReviewed = numWordsReviewed;
  }


  public ResourceStatus timeElapsed(Integer timeElapsed) {
    
    this.timeElapsed = timeElapsed;
    return this;
  }

   /**
   * The total time spent on translation and research. Measured in milliseconds.
   * @return timeElapsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1172000", value = "The total time spent on translation and research. Measured in milliseconds.")

  public Integer getTimeElapsed() {
    return timeElapsed;
  }


  public void setTimeElapsed(Integer timeElapsed) {
    this.timeElapsed = timeElapsed;
  }


  public ResourceStatus timeElapsedTranslation(Integer timeElapsedTranslation) {
    
    this.timeElapsedTranslation = timeElapsedTranslation;
    return this;
  }

   /**
   * The total time spent translating. Measured in milliseconds.
   * @return timeElapsedTranslation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1172000", value = "The total time spent translating. Measured in milliseconds.")

  public Integer getTimeElapsedTranslation() {
    return timeElapsedTranslation;
  }


  public void setTimeElapsedTranslation(Integer timeElapsedTranslation) {
    this.timeElapsedTranslation = timeElapsedTranslation;
  }


  public ResourceStatus timeElapsedResearch(Integer timeElapsedResearch) {
    
    this.timeElapsedResearch = timeElapsedResearch;
    return this;
  }

   /**
   * The total time spent on research. Measured in milliseconds.
   * @return timeElapsedResearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1172000", value = "The total time spent on research. Measured in milliseconds.")

  public Integer getTimeElapsedResearch() {
    return timeElapsedResearch;
  }


  public void setTimeElapsedResearch(Integer timeElapsedResearch) {
    this.timeElapsedResearch = timeElapsedResearch;
  }


  public ResourceStatus timeElapsedReview(Integer timeElapsedReview) {
    
    this.timeElapsedReview = timeElapsedReview;
    return this;
  }

   /**
   * The total time spent reviewing. Measured in milliseconds.
   * @return timeElapsedReview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1172000", value = "The total time spent reviewing. Measured in milliseconds.")

  public Integer getTimeElapsedReview() {
    return timeElapsedReview;
  }


  public void setTimeElapsedReview(Integer timeElapsedReview) {
    this.timeElapsedReview = timeElapsedReview;
  }


  public ResourceStatus numSegmentsConfirmed(Integer numSegmentsConfirmed) {
    
    this.numSegmentsConfirmed = numSegmentsConfirmed;
    return this;
  }

   /**
   * The number of source segments confirmed.
   * @return numSegmentsConfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "The number of source segments confirmed.")

  public Integer getNumSegmentsConfirmed() {
    return numSegmentsConfirmed;
  }


  public void setNumSegmentsConfirmed(Integer numSegmentsConfirmed) {
    this.numSegmentsConfirmed = numSegmentsConfirmed;
  }


  public ResourceStatus numSegmentsReviewed(Integer numSegmentsReviewed) {
    
    this.numSegmentsReviewed = numSegmentsReviewed;
    return this;
  }

   /**
   * The number of source segments reviewed.
   * @return numSegmentsReviewed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "The number of source segments reviewed.")

  public Integer getNumSegmentsReviewed() {
    return numSegmentsReviewed;
  }


  public void setNumSegmentsReviewed(Integer numSegmentsReviewed) {
    this.numSegmentsReviewed = numSegmentsReviewed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceStatus resourceStatus = (ResourceStatus) o;
    return Objects.equals(this.email, resourceStatus.email) &&
        Objects.equals(this.name, resourceStatus.name) &&
        Objects.equals(this.numWordsConfirmed, resourceStatus.numWordsConfirmed) &&
        Objects.equals(this.numWordsNew, resourceStatus.numWordsNew) &&
        Objects.equals(this.numWordsFuzzy, resourceStatus.numWordsFuzzy) &&
        Objects.equals(this.numWordsExact, resourceStatus.numWordsExact) &&
        Objects.equals(this.numWordsReviewed, resourceStatus.numWordsReviewed) &&
        Objects.equals(this.timeElapsed, resourceStatus.timeElapsed) &&
        Objects.equals(this.timeElapsedTranslation, resourceStatus.timeElapsedTranslation) &&
        Objects.equals(this.timeElapsedResearch, resourceStatus.timeElapsedResearch) &&
        Objects.equals(this.timeElapsedReview, resourceStatus.timeElapsedReview) &&
        Objects.equals(this.numSegmentsConfirmed, resourceStatus.numSegmentsConfirmed) &&
        Objects.equals(this.numSegmentsReviewed, resourceStatus.numSegmentsReviewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, numWordsConfirmed, numWordsNew, numWordsFuzzy, numWordsExact, numWordsReviewed, timeElapsed, timeElapsedTranslation, timeElapsedResearch, timeElapsedReview, numSegmentsConfirmed, numSegmentsReviewed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceStatus {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numWordsConfirmed: ").append(toIndentedString(numWordsConfirmed)).append("\n");
    sb.append("    numWordsNew: ").append(toIndentedString(numWordsNew)).append("\n");
    sb.append("    numWordsFuzzy: ").append(toIndentedString(numWordsFuzzy)).append("\n");
    sb.append("    numWordsExact: ").append(toIndentedString(numWordsExact)).append("\n");
    sb.append("    numWordsReviewed: ").append(toIndentedString(numWordsReviewed)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
    sb.append("    timeElapsedTranslation: ").append(toIndentedString(timeElapsedTranslation)).append("\n");
    sb.append("    timeElapsedResearch: ").append(toIndentedString(timeElapsedResearch)).append("\n");
    sb.append("    timeElapsedReview: ").append(toIndentedString(timeElapsedReview)).append("\n");
    sb.append("    numSegmentsConfirmed: ").append(toIndentedString(numSegmentsConfirmed)).append("\n");
    sb.append("    numSegmentsReviewed: ").append(toIndentedString(numSegmentsReviewed)).append("\n");
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

