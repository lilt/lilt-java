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
 * An assignment object that associates a user to a workflow stage template.
 */
@ApiModel(description = "An assignment object that associates a user to a workflow stage template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:28:23.720Z[GMT]")
public class WorkflowStageAssignment {
  public static final String SERIALIZED_NAME_WORKFLOW_STAGE_TEMPLATE_ID = "workflowStageTemplateId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STAGE_TEMPLATE_ID)
  private Integer workflowStageTemplateId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;


  public WorkflowStageAssignment workflowStageTemplateId(Integer workflowStageTemplateId) {
    
    this.workflowStageTemplateId = workflowStageTemplateId;
    return this;
  }

   /**
   * Get workflowStageTemplateId
   * @return workflowStageTemplateId
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")

  public Integer getWorkflowStageTemplateId() {
    return workflowStageTemplateId;
  }


  public void setWorkflowStageTemplateId(Integer workflowStageTemplateId) {
    this.workflowStageTemplateId = workflowStageTemplateId;
  }


  public WorkflowStageAssignment userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public WorkflowStageAssignment email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username@domain.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStageAssignment workflowStageAssignment = (WorkflowStageAssignment) o;
    return Objects.equals(this.workflowStageTemplateId, workflowStageAssignment.workflowStageTemplateId) &&
        Objects.equals(this.userId, workflowStageAssignment.userId) &&
        Objects.equals(this.email, workflowStageAssignment.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowStageTemplateId, userId, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStageAssignment {\n");
    sb.append("    workflowStageTemplateId: ").append(toIndentedString(workflowStageTemplateId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

