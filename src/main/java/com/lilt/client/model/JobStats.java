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
import com.lilt.client.model.JobProject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A job stats shows an overview of job&#39;s statistical data including total number of exact words, fuzzy words, language pairs, projects, etc. 
 */
@ApiModel(description = "A job stats shows an overview of job's statistical data including total number of exact words, fuzzy words, language pairs, projects, etc. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:18:58.249Z[GMT]")
public class JobStats {
  public static final String SERIALIZED_NAME_EXACT_WORDS = "exactWords";
  @SerializedName(SERIALIZED_NAME_EXACT_WORDS)
  private Integer exactWords;

  public static final String SERIALIZED_NAME_FUZZY_WORDS = "fuzzyWords";
  @SerializedName(SERIALIZED_NAME_FUZZY_WORDS)
  private Integer fuzzyWords;

  public static final String SERIALIZED_NAME_NEW_WORDS = "newWords";
  @SerializedName(SERIALIZED_NAME_NEW_WORDS)
  private Integer newWords;

  public static final String SERIALIZED_NAME_NUM_DELIVERED_PROJECTS = "numDeliveredProjects";
  @SerializedName(SERIALIZED_NAME_NUM_DELIVERED_PROJECTS)
  private Integer numDeliveredProjects;

  public static final String SERIALIZED_NAME_NUM_LANGUAGE_PAIRS = "numLanguagePairs";
  @SerializedName(SERIALIZED_NAME_NUM_LANGUAGE_PAIRS)
  private Integer numLanguagePairs;

  public static final String SERIALIZED_NAME_NUM_PROJECTS = "numProjects";
  @SerializedName(SERIALIZED_NAME_NUM_PROJECTS)
  private Integer numProjects;

  public static final String SERIALIZED_NAME_PERCENT_REVIEWED = "percentReviewed";
  @SerializedName(SERIALIZED_NAME_PERCENT_REVIEWED)
  private Integer percentReviewed;

  public static final String SERIALIZED_NAME_PERCENT_TRANSLATED = "percentTranslated";
  @SerializedName(SERIALIZED_NAME_PERCENT_TRANSLATED)
  private Integer percentTranslated;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<JobProject> projects = null;

  public static final String SERIALIZED_NAME_SOURCE_WORDS = "sourceWords";
  @SerializedName(SERIALIZED_NAME_SOURCE_WORDS)
  private Integer sourceWords;

  public static final String SERIALIZED_NAME_UNIQUE_LANGUAGE_PAIRS = "uniqueLanguagePairs";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LANGUAGE_PAIRS)
  private Integer uniqueLanguagePairs;

  public static final String SERIALIZED_NAME_UNIQUE_LINGUISTS = "uniqueLinguists";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LINGUISTS)
  private Integer uniqueLinguists;

  /**
   * The status of the Workflow for the current job.
   */
  @JsonAdapter(WorkflowStatusEnum.Adapter.class)
  public enum WorkflowStatusEnum {
    READY_TO_START("READY_TO_START"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE");

    private String value;

    WorkflowStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowStatusEnum fromValue(String value) {
      for (WorkflowStatusEnum b : WorkflowStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkflowStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkflowStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WORKFLOW_STATUS = "workflowStatus";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STATUS)
  private WorkflowStatusEnum workflowStatus;


  public JobStats exactWords(Integer exactWords) {
    
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


  public JobStats fuzzyWords(Integer fuzzyWords) {
    
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


  public JobStats newWords(Integer newWords) {
    
    this.newWords = newWords;
    return this;
  }

   /**
   * Total number of fuzzy words.
   * @return newWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of fuzzy words.")

  public Integer getNewWords() {
    return newWords;
  }


  public void setNewWords(Integer newWords) {
    this.newWords = newWords;
  }


  public JobStats numDeliveredProjects(Integer numDeliveredProjects) {
    
    this.numDeliveredProjects = numDeliveredProjects;
    return this;
  }

   /**
   * Total number of delivered projects.
   * @return numDeliveredProjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of delivered projects.")

  public Integer getNumDeliveredProjects() {
    return numDeliveredProjects;
  }


  public void setNumDeliveredProjects(Integer numDeliveredProjects) {
    this.numDeliveredProjects = numDeliveredProjects;
  }


  public JobStats numLanguagePairs(Integer numLanguagePairs) {
    
    this.numLanguagePairs = numLanguagePairs;
    return this;
  }

   /**
   * Total number of delivered projects.
   * @return numLanguagePairs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of delivered projects.")

  public Integer getNumLanguagePairs() {
    return numLanguagePairs;
  }


  public void setNumLanguagePairs(Integer numLanguagePairs) {
    this.numLanguagePairs = numLanguagePairs;
  }


  public JobStats numProjects(Integer numProjects) {
    
    this.numProjects = numProjects;
    return this;
  }

   /**
   * Total number of projects.
   * @return numProjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of projects.")

  public Integer getNumProjects() {
    return numProjects;
  }


  public void setNumProjects(Integer numProjects) {
    this.numProjects = numProjects;
  }


  public JobStats percentReviewed(Integer percentReviewed) {
    
    this.percentReviewed = percentReviewed;
    return this;
  }

   /**
   * Overall percentage of documents reviewed.
   * @return percentReviewed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Overall percentage of documents reviewed.")

  public Integer getPercentReviewed() {
    return percentReviewed;
  }


  public void setPercentReviewed(Integer percentReviewed) {
    this.percentReviewed = percentReviewed;
  }


  public JobStats percentTranslated(Integer percentTranslated) {
    
    this.percentTranslated = percentTranslated;
    return this;
  }

   /**
   * Overall percentage of documents translated.
   * @return percentTranslated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Overall percentage of documents translated.")

  public Integer getPercentTranslated() {
    return percentTranslated;
  }


  public void setPercentTranslated(Integer percentTranslated) {
    this.percentTranslated = percentTranslated;
  }


  public JobStats projects(List<JobProject> projects) {
    
    this.projects = projects;
    return this;
  }

  public JobStats addProjectsItem(JobProject projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<JobProject>();
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

  public List<JobProject> getProjects() {
    return projects;
  }


  public void setProjects(List<JobProject> projects) {
    this.projects = projects;
  }


  public JobStats sourceWords(Integer sourceWords) {
    
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


  public JobStats uniqueLanguagePairs(Integer uniqueLanguagePairs) {
    
    this.uniqueLanguagePairs = uniqueLanguagePairs;
    return this;
  }

   /**
   * Number of unique language pairs.
   * @return uniqueLanguagePairs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of unique language pairs.")

  public Integer getUniqueLanguagePairs() {
    return uniqueLanguagePairs;
  }


  public void setUniqueLanguagePairs(Integer uniqueLanguagePairs) {
    this.uniqueLanguagePairs = uniqueLanguagePairs;
  }


  public JobStats uniqueLinguists(Integer uniqueLinguists) {
    
    this.uniqueLinguists = uniqueLinguists;
    return this;
  }

   /**
   * Number of unique linguists.
   * @return uniqueLinguists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of unique linguists.")

  public Integer getUniqueLinguists() {
    return uniqueLinguists;
  }


  public void setUniqueLinguists(Integer uniqueLinguists) {
    this.uniqueLinguists = uniqueLinguists;
  }


  public JobStats workflowStatus(WorkflowStatusEnum workflowStatus) {
    
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * The status of the Workflow for the current job.
   * @return workflowStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "READY_TO_START", value = "The status of the Workflow for the current job.")

  public WorkflowStatusEnum getWorkflowStatus() {
    return workflowStatus;
  }


  public void setWorkflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStats jobStats = (JobStats) o;
    return Objects.equals(this.exactWords, jobStats.exactWords) &&
        Objects.equals(this.fuzzyWords, jobStats.fuzzyWords) &&
        Objects.equals(this.newWords, jobStats.newWords) &&
        Objects.equals(this.numDeliveredProjects, jobStats.numDeliveredProjects) &&
        Objects.equals(this.numLanguagePairs, jobStats.numLanguagePairs) &&
        Objects.equals(this.numProjects, jobStats.numProjects) &&
        Objects.equals(this.percentReviewed, jobStats.percentReviewed) &&
        Objects.equals(this.percentTranslated, jobStats.percentTranslated) &&
        Objects.equals(this.projects, jobStats.projects) &&
        Objects.equals(this.sourceWords, jobStats.sourceWords) &&
        Objects.equals(this.uniqueLanguagePairs, jobStats.uniqueLanguagePairs) &&
        Objects.equals(this.uniqueLinguists, jobStats.uniqueLinguists) &&
        Objects.equals(this.workflowStatus, jobStats.workflowStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exactWords, fuzzyWords, newWords, numDeliveredProjects, numLanguagePairs, numProjects, percentReviewed, percentTranslated, projects, sourceWords, uniqueLanguagePairs, uniqueLinguists, workflowStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStats {\n");
    sb.append("    exactWords: ").append(toIndentedString(exactWords)).append("\n");
    sb.append("    fuzzyWords: ").append(toIndentedString(fuzzyWords)).append("\n");
    sb.append("    newWords: ").append(toIndentedString(newWords)).append("\n");
    sb.append("    numDeliveredProjects: ").append(toIndentedString(numDeliveredProjects)).append("\n");
    sb.append("    numLanguagePairs: ").append(toIndentedString(numLanguagePairs)).append("\n");
    sb.append("    numProjects: ").append(toIndentedString(numProjects)).append("\n");
    sb.append("    percentReviewed: ").append(toIndentedString(percentReviewed)).append("\n");
    sb.append("    percentTranslated: ").append(toIndentedString(percentTranslated)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    sourceWords: ").append(toIndentedString(sourceWords)).append("\n");
    sb.append("    uniqueLanguagePairs: ").append(toIndentedString(uniqueLanguagePairs)).append("\n");
    sb.append("    uniqueLinguists: ").append(toIndentedString(uniqueLinguists)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
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

