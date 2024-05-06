/*
 * Lilt REST API
 * The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:   * Training of and translating with interactive, adaptive machine translation   * Large-scale translation memory   * The Lexicon (a large-scale termbase)   * Programmatic control of the Lilt CAT environment   * Translation memory synchronization  Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests.  ## Authentication  Requests are authenticated via REST API key, which requires the Business plan.  Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.  For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.  ## Quotas  Our services have a general quota of 4000 requests per minute. Should you hit the maximum requests per minute, you will need to wait 60 seconds before you can send another request. 
 *
 * The version of the OpenAPI document: v3.0
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
 * A job project contains project statistical data that belongs to a specific job. 
 */
@ApiModel(description = "A job project contains project statistical data that belongs to a specific job. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T00:17:22.916Z[GMT]")
public class JobProject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SRC_LANG = "srcLang";
  @SerializedName(SERIALIZED_NAME_SRC_LANG)
  private String srcLang;

  public static final String SERIALIZED_NAME_SRC_LOCALE = "srcLocale";
  @SerializedName(SERIALIZED_NAME_SRC_LOCALE)
  private String srcLocale;

  public static final String SERIALIZED_NAME_TRG_LANG = "trgLang";
  @SerializedName(SERIALIZED_NAME_TRG_LANG)
  private String trgLang;

  public static final String SERIALIZED_NAME_TRG_LOCALE = "trgLocale";
  @SerializedName(SERIALIZED_NAME_TRG_LOCALE)
  private String trgLocale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DUE = "due";
  @SerializedName(SERIALIZED_NAME_DUE)
  private String due;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "isComplete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE)
  private Boolean isComplete;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "isArchived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  private Boolean isArchived;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_NUM_SOURCE_TOKENS = "numSourceTokens";
  @SerializedName(SERIALIZED_NAME_NUM_SOURCE_TOKENS)
  private Integer numSourceTokens;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_MEMORY_ID = "memoryId";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private Integer memoryId;

  /**
   * The status of the Workflow for the current project.
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

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;


  public JobProject id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * An id for the project.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An id for the project.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public JobProject srcLang(String srcLang) {
    
    this.srcLang = srcLang;
    return this;
  }

   /**
   * Source language, an ISO 639-1 language identifier.
   * @return srcLang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "Source language, an ISO 639-1 language identifier.")

  public String getSrcLang() {
    return srcLang;
  }


  public void setSrcLang(String srcLang) {
    this.srcLang = srcLang;
  }


  public JobProject srcLocale(String srcLocale) {
    
    this.srcLocale = srcLocale;
    return this;
  }

   /**
   * A locale identifier, supported for source language.
   * @return srcLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "A locale identifier, supported for source language.")

  public String getSrcLocale() {
    return srcLocale;
  }


  public void setSrcLocale(String srcLocale) {
    this.srcLocale = srcLocale;
  }


  public JobProject trgLang(String trgLang) {
    
    this.trgLang = trgLang;
    return this;
  }

   /**
   * Target language, an ISO 639-1 language identifier.
   * @return trgLang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fr", value = "Target language, an ISO 639-1 language identifier.")

  public String getTrgLang() {
    return trgLang;
  }


  public void setTrgLang(String trgLang) {
    this.trgLang = trgLang;
  }


  public JobProject trgLocale(String trgLocale) {
    
    this.trgLocale = trgLocale;
    return this;
  }

   /**
   * A locale identifier, supported for target language.
   * @return trgLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CA", value = "A locale identifier, supported for target language.")

  public String getTrgLocale() {
    return trgLocale;
  }


  public void setTrgLocale(String trgLocale) {
    this.trgLocale = trgLocale;
  }


  public JobProject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My new project", value = "A name for the project.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobProject due(String due) {
    
    this.due = due;
    return this;
  }

   /**
   * An ISO date.
   * @return due
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-03T13:43:00.000Z", value = "An ISO date.")

  public String getDue() {
    return due;
  }


  public void setDue(String due) {
    this.due = due;
  }


  public JobProject isComplete(Boolean isComplete) {
    
    this.isComplete = isComplete;
    return this;
  }

   /**
   * A state that checks project was completed.
   * @return isComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "A state that checks project was completed.")

  public Boolean getIsComplete() {
    return isComplete;
  }


  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }


  public JobProject isArchived(Boolean isArchived) {
    
    this.isArchived = isArchived;
    return this;
  }

   /**
   * The archived state of the project.
   * @return isArchived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "The archived state of the project.")

  public Boolean getIsArchived() {
    return isArchived;
  }


  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  public JobProject state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Current state of the project. Example, backlog, inProgress, inReview, done.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "inProgress", value = "Current state of the project. Example, backlog, inProgress, inReview, done.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public JobProject numSourceTokens(Integer numSourceTokens) {
    
    this.numSourceTokens = numSourceTokens;
    return this;
  }

   /**
   * Total number of source tokens.
   * @return numSourceTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2134", value = "Total number of source tokens.")

  public Integer getNumSourceTokens() {
    return numSourceTokens;
  }


  public void setNumSourceTokens(Integer numSourceTokens) {
    this.numSourceTokens = numSourceTokens;
  }


  public JobProject createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time at which the object was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-04-01T13:43:00.000Z", value = "Time at which the object was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public JobProject updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time at which the object was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-06-03T13:43:00.000Z", value = "Time at which the object was updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public JobProject isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * A state that checks project was deleted.
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "A state that checks project was deleted.")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public JobProject memoryId(Integer memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * A unique number identifying the associated Memory.
   * @return memoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2134", value = "A unique number identifying the associated Memory.")

  public Integer getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(Integer memoryId) {
    this.memoryId = memoryId;
  }


  public JobProject workflowStatus(WorkflowStatusEnum workflowStatus) {
    
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * The status of the Workflow for the current project.
   * @return workflowStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "READY_TO_START", value = "The status of the Workflow for the current project.")

  public WorkflowStatusEnum getWorkflowStatus() {
    return workflowStatus;
  }


  public void setWorkflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
  }


  public JobProject workflowName(String workflowName) {
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * Human readable name of the workflow associated with the current project.
   * @return workflowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Translate > Review > Analyst Review", value = "Human readable name of the workflow associated with the current project.")

  public String getWorkflowName() {
    return workflowName;
  }


  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobProject jobProject = (JobProject) o;
    return Objects.equals(this.id, jobProject.id) &&
        Objects.equals(this.srcLang, jobProject.srcLang) &&
        Objects.equals(this.srcLocale, jobProject.srcLocale) &&
        Objects.equals(this.trgLang, jobProject.trgLang) &&
        Objects.equals(this.trgLocale, jobProject.trgLocale) &&
        Objects.equals(this.name, jobProject.name) &&
        Objects.equals(this.due, jobProject.due) &&
        Objects.equals(this.isComplete, jobProject.isComplete) &&
        Objects.equals(this.isArchived, jobProject.isArchived) &&
        Objects.equals(this.state, jobProject.state) &&
        Objects.equals(this.numSourceTokens, jobProject.numSourceTokens) &&
        Objects.equals(this.createdAt, jobProject.createdAt) &&
        Objects.equals(this.updatedAt, jobProject.updatedAt) &&
        Objects.equals(this.isDeleted, jobProject.isDeleted) &&
        Objects.equals(this.memoryId, jobProject.memoryId) &&
        Objects.equals(this.workflowStatus, jobProject.workflowStatus) &&
        Objects.equals(this.workflowName, jobProject.workflowName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, srcLang, srcLocale, trgLang, trgLocale, name, due, isComplete, isArchived, state, numSourceTokens, createdAt, updatedAt, isDeleted, memoryId, workflowStatus, workflowName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobProject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    srcLang: ").append(toIndentedString(srcLang)).append("\n");
    sb.append("    srcLocale: ").append(toIndentedString(srcLocale)).append("\n");
    sb.append("    trgLang: ").append(toIndentedString(trgLang)).append("\n");
    sb.append("    trgLocale: ").append(toIndentedString(trgLocale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    numSourceTokens: ").append(toIndentedString(numSourceTokens)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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

