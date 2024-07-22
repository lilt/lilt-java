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
 * ProjectCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T00:19:36.591Z[GMT]")
public class ProjectCreateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEMORY_ID = "memory_id";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private Integer memoryId;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private Integer jobId;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private Integer dueDate;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_ID = "workflowTemplateId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_ID)
  private Integer workflowTemplateId;


  public ProjectCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the Project.
   * @return name
  **/
  @ApiModelProperty(example = "My new project", required = true, value = "A name for the Project.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectCreateParameters memoryId(Integer memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * The Memory to associate with this new Project.
   * @return memoryId
  **/
  @ApiModelProperty(example = "1234", required = true, value = "The Memory to associate with this new Project.")

  public Integer getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(Integer memoryId) {
    this.memoryId = memoryId;
  }


  public ProjectCreateParameters jobId(Integer jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * The Job to associate with this new Project. If a Job ID is not provided then a new Job will be created to contain the Project. 
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "The Job to associate with this new Project. If a Job ID is not provided then a new Job will be created to contain the Project. ")

  public Integer getJobId() {
    return jobId;
  }


  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }


  public ProjectCreateParameters dueDate(Integer dueDate) {
    
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


  public ProjectCreateParameters metadata(Object metadata) {
    
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


  public ProjectCreateParameters workflowTemplateId(Integer workflowTemplateId) {
    
    this.workflowTemplateId = workflowTemplateId;
    return this;
  }

   /**
   * The workflow template used to create this project. WorkflowTemplateIds can be retrieved via the /workflows/templates endpoint. If not specified then the organization default workflowTemplateId will be used.
   * @return workflowTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "The workflow template used to create this project. WorkflowTemplateIds can be retrieved via the /workflows/templates endpoint. If not specified then the organization default workflowTemplateId will be used.")

  public Integer getWorkflowTemplateId() {
    return workflowTemplateId;
  }


  public void setWorkflowTemplateId(Integer workflowTemplateId) {
    this.workflowTemplateId = workflowTemplateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateParameters projectCreateParameters = (ProjectCreateParameters) o;
    return Objects.equals(this.name, projectCreateParameters.name) &&
        Objects.equals(this.memoryId, projectCreateParameters.memoryId) &&
        Objects.equals(this.jobId, projectCreateParameters.jobId) &&
        Objects.equals(this.dueDate, projectCreateParameters.dueDate) &&
        Objects.equals(this.metadata, projectCreateParameters.metadata) &&
        Objects.equals(this.workflowTemplateId, projectCreateParameters.workflowTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, memoryId, jobId, dueDate, metadata, workflowTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    workflowTemplateId: ").append(toIndentedString(workflowTemplateId)).append("\n");
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

