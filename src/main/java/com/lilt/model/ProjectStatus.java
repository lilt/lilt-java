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
import com.lilt.model.ResourceStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The status of a Project. 
 */
@ApiModel(description = "The status of a Project. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-04T17:28:50.309026-07:00[America/Los_Angeles]")
public class ProjectStatus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NUM_SOURCE_WORDS = "num_source_words";
  @SerializedName(SERIALIZED_NAME_NUM_SOURCE_WORDS)
  private Integer numSourceWords;

  public static final String SERIALIZED_NAME_NUM_WORDS_CONFIRMED = "num_words_confirmed";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_CONFIRMED)
  private Integer numWordsConfirmed;

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

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<ResourceStatus> resources = null;


  public ProjectStatus id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique Project identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21902", value = "A unique Project identifier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ProjectStatus numSourceWords(Integer numSourceWords) {
    
    this.numSourceWords = numSourceWords;
    return this;
  }

   /**
   * The number of source words in the Project.
   * @return numSourceWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6039", value = "The number of source words in the Project.")

  public Integer getNumSourceWords() {
    return numSourceWords;
  }


  public void setNumSourceWords(Integer numSourceWords) {
    this.numSourceWords = numSourceWords;
  }


  public ProjectStatus numWordsConfirmed(Integer numWordsConfirmed) {
    
    this.numWordsConfirmed = numWordsConfirmed;
    return this;
  }

   /**
   * The number of confirmed source words.
   * @return numWordsConfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "151", value = "The number of confirmed source words.")

  public Integer getNumWordsConfirmed() {
    return numWordsConfirmed;
  }


  public void setNumWordsConfirmed(Integer numWordsConfirmed) {
    this.numWordsConfirmed = numWordsConfirmed;
  }


  public ProjectStatus numWordsReviewed(Integer numWordsReviewed) {
    
    this.numWordsReviewed = numWordsReviewed;
    return this;
  }

   /**
   * The number of reviewed source words.
   * @return numWordsReviewed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The number of reviewed source words.")

  public Integer getNumWordsReviewed() {
    return numWordsReviewed;
  }


  public void setNumWordsReviewed(Integer numWordsReviewed) {
    this.numWordsReviewed = numWordsReviewed;
  }


  public ProjectStatus timeElapsed(Integer timeElapsed) {
    
    this.timeElapsed = timeElapsed;
    return this;
  }

   /**
   * The total time spent on the project by all resources. Measured in milliseconds.
   * @return timeElapsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2980000", value = "The total time spent on the project by all resources. Measured in milliseconds.")

  public Integer getTimeElapsed() {
    return timeElapsed;
  }


  public void setTimeElapsed(Integer timeElapsed) {
    this.timeElapsed = timeElapsed;
  }


  public ProjectStatus timeElapsedTranslation(Integer timeElapsedTranslation) {
    
    this.timeElapsedTranslation = timeElapsedTranslation;
    return this;
  }

   /**
   * The total time spent on translation by all resources. Measured in milliseconds.
   * @return timeElapsedTranslation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "33487", value = "The total time spent on translation by all resources. Measured in milliseconds.")

  public Integer getTimeElapsedTranslation() {
    return timeElapsedTranslation;
  }


  public void setTimeElapsedTranslation(Integer timeElapsedTranslation) {
    this.timeElapsedTranslation = timeElapsedTranslation;
  }


  public ProjectStatus timeElapsedResearch(Integer timeElapsedResearch) {
    
    this.timeElapsedResearch = timeElapsedResearch;
    return this;
  }

   /**
   * The total time spent on research by all resources. Measured in milliseconds.
   * @return timeElapsedResearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "912348", value = "The total time spent on research by all resources. Measured in milliseconds.")

  public Integer getTimeElapsedResearch() {
    return timeElapsedResearch;
  }


  public void setTimeElapsedResearch(Integer timeElapsedResearch) {
    this.timeElapsedResearch = timeElapsedResearch;
  }


  public ProjectStatus timeElapsedReview(Integer timeElapsedReview) {
    
    this.timeElapsedReview = timeElapsedReview;
    return this;
  }

   /**
   * The total time spent on reviewing by all resources. Measured in milliseconds.
   * @return timeElapsedReview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "66521", value = "The total time spent on reviewing by all resources. Measured in milliseconds.")

  public Integer getTimeElapsedReview() {
    return timeElapsedReview;
  }


  public void setTimeElapsedReview(Integer timeElapsedReview) {
    this.timeElapsedReview = timeElapsedReview;
  }


  public ProjectStatus resources(List<ResourceStatus> resources) {
    
    this.resources = resources;
    return this;
  }

  public ProjectStatus addResourcesItem(ResourceStatus resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<ResourceStatus>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * A list of ResourceStatus objects that represent per-resource statistics.
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of ResourceStatus objects that represent per-resource statistics.")

  public List<ResourceStatus> getResources() {
    return resources;
  }


  public void setResources(List<ResourceStatus> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatus projectStatus = (ProjectStatus) o;
    return Objects.equals(this.id, projectStatus.id) &&
        Objects.equals(this.numSourceWords, projectStatus.numSourceWords) &&
        Objects.equals(this.numWordsConfirmed, projectStatus.numWordsConfirmed) &&
        Objects.equals(this.numWordsReviewed, projectStatus.numWordsReviewed) &&
        Objects.equals(this.timeElapsed, projectStatus.timeElapsed) &&
        Objects.equals(this.timeElapsedTranslation, projectStatus.timeElapsedTranslation) &&
        Objects.equals(this.timeElapsedResearch, projectStatus.timeElapsedResearch) &&
        Objects.equals(this.timeElapsedReview, projectStatus.timeElapsedReview) &&
        Objects.equals(this.resources, projectStatus.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numSourceWords, numWordsConfirmed, numWordsReviewed, timeElapsed, timeElapsedTranslation, timeElapsedResearch, timeElapsedReview, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numSourceWords: ").append(toIndentedString(numSourceWords)).append("\n");
    sb.append("    numWordsConfirmed: ").append(toIndentedString(numWordsConfirmed)).append("\n");
    sb.append("    numWordsReviewed: ").append(toIndentedString(numWordsReviewed)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
    sb.append("    timeElapsedTranslation: ").append(toIndentedString(timeElapsedTranslation)).append("\n");
    sb.append("    timeElapsedResearch: ").append(toIndentedString(timeElapsedResearch)).append("\n");
    sb.append("    timeElapsedReview: ").append(toIndentedString(timeElapsedReview)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

