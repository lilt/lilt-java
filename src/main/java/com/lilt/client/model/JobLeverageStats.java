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
import com.lilt.client.model.ProjectStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A job leverage stats object shows an overview of job&#39;s statistical data including total number of exact words, fuzzy words, and exact words for the job in total and for each project. 
 */
@ApiModel(description = "A job leverage stats object shows an overview of job's statistical data including total number of exact words, fuzzy words, and exact words for the job in total and for each project. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:18:58.249Z[GMT]")
public class JobLeverageStats {
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

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<ProjectStats> projects = null;


  public JobLeverageStats sourceWords(Integer sourceWords) {
    
    this.sourceWords = sourceWords;
    return this;
  }

   /**
   * Total number of source words.
   * @return sourceWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of source words.")

  public Integer getSourceWords() {
    return sourceWords;
  }


  public void setSourceWords(Integer sourceWords) {
    this.sourceWords = sourceWords;
  }


  public JobLeverageStats exactWords(Integer exactWords) {
    
    this.exactWords = exactWords;
    return this;
  }

   /**
   * Total number of exact words.
   * @return exactWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of exact words.")

  public Integer getExactWords() {
    return exactWords;
  }


  public void setExactWords(Integer exactWords) {
    this.exactWords = exactWords;
  }


  public JobLeverageStats fuzzyWords(Integer fuzzyWords) {
    
    this.fuzzyWords = fuzzyWords;
    return this;
  }

   /**
   * Total number of fuzzy words.
   * @return fuzzyWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of fuzzy words.")

  public Integer getFuzzyWords() {
    return fuzzyWords;
  }


  public void setFuzzyWords(Integer fuzzyWords) {
    this.fuzzyWords = fuzzyWords;
  }


  public JobLeverageStats newWords(Integer newWords) {
    
    this.newWords = newWords;
    return this;
  }

   /**
   * Total number of new words.
   * @return newWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of new words.")

  public Integer getNewWords() {
    return newWords;
  }


  public void setNewWords(Integer newWords) {
    this.newWords = newWords;
  }


  public JobLeverageStats projects(List<ProjectStats> projects) {
    
    this.projects = projects;
    return this;
  }

  public JobLeverageStats addProjectsItem(ProjectStats projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<ProjectStats>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProjectStats> getProjects() {
    return projects;
  }


  public void setProjects(List<ProjectStats> projects) {
    this.projects = projects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobLeverageStats jobLeverageStats = (JobLeverageStats) o;
    return Objects.equals(this.sourceWords, jobLeverageStats.sourceWords) &&
        Objects.equals(this.exactWords, jobLeverageStats.exactWords) &&
        Objects.equals(this.fuzzyWords, jobLeverageStats.fuzzyWords) &&
        Objects.equals(this.newWords, jobLeverageStats.newWords) &&
        Objects.equals(this.projects, jobLeverageStats.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceWords, exactWords, fuzzyWords, newWords, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobLeverageStats {\n");
    sb.append("    sourceWords: ").append(toIndentedString(sourceWords)).append("\n");
    sb.append("    exactWords: ").append(toIndentedString(exactWords)).append("\n");
    sb.append("    fuzzyWords: ").append(toIndentedString(fuzzyWords)).append("\n");
    sb.append("    newWords: ").append(toIndentedString(newWords)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

