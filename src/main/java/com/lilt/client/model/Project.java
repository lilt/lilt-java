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
import com.lilt.client.model.DocumentWithoutSegments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A Project is a collection of zero or more Documents. It is specific to a language pair, and is associated with exactly one Memory for that language pair. The Memory association cannot be changed after the Project is created. 
 */
@ApiModel(description = "A Project is a collection of zero or more Documents. It is specific to a language pair, and is associated with exactly one Memory for that language pair. The Memory association cannot be changed after the Project is created. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T17:55:18.443Z[GMT]")
public class Project {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MEMORY_ID = "memory_id";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private Integer memoryId;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private Integer jobId;

  public static final String SERIALIZED_NAME_SRCLANG = "srclang";
  @SerializedName(SERIALIZED_NAME_SRCLANG)
  private String srclang;

  public static final String SERIALIZED_NAME_TRGLANG = "trglang";
  @SerializedName(SERIALIZED_NAME_TRGLANG)
  private String trglang;

  public static final String SERIALIZED_NAME_SRCLOCALE = "srclocale";
  @SerializedName(SERIALIZED_NAME_SRCLOCALE)
  private String srclocale;

  public static final String SERIALIZED_NAME_TRGLOCALE = "trglocale";
  @SerializedName(SERIALIZED_NAME_TRGLOCALE)
  private String trglocale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private Integer dueDate;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_SAMPLE_REVIEW_PERCENTAGE = "sample_review_percentage";
  @SerializedName(SERIALIZED_NAME_SAMPLE_REVIEW_PERCENTAGE)
  private Integer sampleReviewPercentage;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Integer updatedAt;

  /**
   * The status of the Workflow for the current project. This may not be present for all project endpoints even with workflows enabled.
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

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private List<DocumentWithoutSegments> document = null;


  public Project id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique number identifying the Project.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "448", value = "A unique number identifying the Project.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Project memoryId(Integer memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * A unique number identifying the associated Memory.
   * @return memoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "A unique number identifying the associated Memory.")

  public Integer getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(Integer memoryId) {
    this.memoryId = memoryId;
  }


  public Project jobId(Integer jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * A unique number identifying the associated Job.
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "A unique number identifying the associated Job.")

  public Integer getJobId() {
    return jobId;
  }


  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }


  public Project srclang(String srclang) {
    
    this.srclang = srclang;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return srclang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "An ISO 639-1 language identifier.")

  public String getSrclang() {
    return srclang;
  }


  public void setSrclang(String srclang) {
    this.srclang = srclang;
  }


  public Project trglang(String trglang) {
    
    this.trglang = trglang;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return trglang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fr", value = "An ISO 639-1 language identifier.")

  public String getTrglang() {
    return trglang;
  }


  public void setTrglang(String trglang) {
    this.trglang = trglang;
  }


  public Project srclocale(String srclocale) {
    
    this.srclocale = srclocale;
    return this;
  }

   /**
   * A locale identifier, supported for srclang.
   * @return srclocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "A locale identifier, supported for srclang.")

  public String getSrclocale() {
    return srclocale;
  }


  public void setSrclocale(String srclocale) {
    this.srclocale = srclocale;
  }


  public Project trglocale(String trglocale) {
    
    this.trglocale = trglocale;
    return this;
  }

   /**
   * A locale identifier, supported for trglang.
   * @return trglocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FR", value = "A locale identifier, supported for trglang.")

  public String getTrglocale() {
    return trglocale;
  }


  public void setTrglocale(String trglocale) {
    this.trglocale = trglocale;
  }


  public Project name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My New Project", value = "A name for the project.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Project state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The project&#39;s state. The possible states are &#x60;backlog&#x60;, &#x60;inProgress&#x60;, &#x60;inReview&#x60;, &#x60;inQA&#x60;, and &#x60;done&#x60;.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "backlog", value = "The project's state. The possible states are `backlog`, `inProgress`, `inReview`, `inQA`, and `done`.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Project dueDate(Integer dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The due date. Measured in seconds since the Unix epoch.
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1489147692", value = "The due date. Measured in seconds since the Unix epoch.")

  public Integer getDueDate() {
    return dueDate;
  }


  public void setDueDate(Integer dueDate) {
    this.dueDate = dueDate;
  }


  public Project archived(Boolean archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * The archived state of the Project.
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "The archived state of the Project.")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public Project metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A JSON object of key/value string pairs. Stores custom project information.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"connectorType\":\"github\",\"notes\":\"example metadata\"}", value = "A JSON object of key/value string pairs. Stores custom project information.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public Project sampleReviewPercentage(Integer sampleReviewPercentage) {
    
    this.sampleReviewPercentage = sampleReviewPercentage;
    return this;
  }

   /**
   * The project&#39;s sample review percentage.
   * @return sampleReviewPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "The project's sample review percentage.")

  public Integer getSampleReviewPercentage() {
    return sampleReviewPercentage;
  }


  public void setSampleReviewPercentage(Integer sampleReviewPercentage) {
    this.sampleReviewPercentage = sampleReviewPercentage;
  }


  public Project createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1489147692", value = "Time at which the object was created. Measured in seconds since the Unix epoch.")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public Project updatedAt(Integer updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1489147692", value = "Time at which the object was created. Measured in seconds since the Unix epoch.")

  public Integer getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Project workflowStatus(WorkflowStatusEnum workflowStatus) {
    
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * The status of the Workflow for the current project. This may not be present for all project endpoints even with workflows enabled.
   * @return workflowStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "READY_TO_START", value = "The status of the Workflow for the current project. This may not be present for all project endpoints even with workflows enabled.")

  public WorkflowStatusEnum getWorkflowStatus() {
    return workflowStatus;
  }


  public void setWorkflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
  }


  public Project document(List<DocumentWithoutSegments> document) {
    
    this.document = document;
    return this;
  }

  public Project addDocumentItem(DocumentWithoutSegments documentItem) {
    if (this.document == null) {
      this.document = new ArrayList<DocumentWithoutSegments>();
    }
    this.document.add(documentItem);
    return this;
  }

   /**
   * A list of Documents.
   * @return document
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Documents.")

  public List<DocumentWithoutSegments> getDocument() {
    return document;
  }


  public void setDocument(List<DocumentWithoutSegments> document) {
    this.document = document;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.memoryId, project.memoryId) &&
        Objects.equals(this.jobId, project.jobId) &&
        Objects.equals(this.srclang, project.srclang) &&
        Objects.equals(this.trglang, project.trglang) &&
        Objects.equals(this.srclocale, project.srclocale) &&
        Objects.equals(this.trglocale, project.trglocale) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.state, project.state) &&
        Objects.equals(this.dueDate, project.dueDate) &&
        Objects.equals(this.archived, project.archived) &&
        Objects.equals(this.metadata, project.metadata) &&
        Objects.equals(this.sampleReviewPercentage, project.sampleReviewPercentage) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.updatedAt, project.updatedAt) &&
        Objects.equals(this.workflowStatus, project.workflowStatus) &&
        Objects.equals(this.document, project.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, memoryId, jobId, srclang, trglang, srclocale, trglocale, name, state, dueDate, archived, metadata, sampleReviewPercentage, createdAt, updatedAt, workflowStatus, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    srclang: ").append(toIndentedString(srclang)).append("\n");
    sb.append("    trglang: ").append(toIndentedString(trglang)).append("\n");
    sb.append("    srclocale: ").append(toIndentedString(srclocale)).append("\n");
    sb.append("    trglocale: ").append(toIndentedString(trglocale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sampleReviewPercentage: ").append(toIndentedString(sampleReviewPercentage)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

