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
 * A single stage within a Workflow Template.
 */
@ApiModel(description = "A single stage within a Workflow Template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T17:55:18.443Z[GMT]")
public class WorkflowStageTemplate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * An enum to represent all possible types of Workflow stage.
   */
  @JsonAdapter(AssignmentTypeEnum.Adapter.class)
  public enum AssignmentTypeEnum {
    READY_TO_START("READY_TO_START"),
    
    TRANSLATE("TRANSLATE"),
    
    REVIEW("REVIEW"),
    
    SECONDARY_REVIEW("SECONDARY_REVIEW"),
    
    DONE("DONE");

    private String value;

    AssignmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssignmentTypeEnum fromValue(String value) {
      for (AssignmentTypeEnum b : AssignmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssignmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssignmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssignmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssignmentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSIGNMENT_TYPE = "assignmentType";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENT_TYPE)
  private AssignmentTypeEnum assignmentType;


  public WorkflowStageTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The human readable name of a Workflow stage.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Translate", value = "The human readable name of a Workflow stage.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowStageTemplate assignmentType(AssignmentTypeEnum assignmentType) {
    
    this.assignmentType = assignmentType;
    return this;
  }

   /**
   * An enum to represent all possible types of Workflow stage.
   * @return assignmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRANSLATE", value = "An enum to represent all possible types of Workflow stage.")

  public AssignmentTypeEnum getAssignmentType() {
    return assignmentType;
  }


  public void setAssignmentType(AssignmentTypeEnum assignmentType) {
    this.assignmentType = assignmentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStageTemplate workflowStageTemplate = (WorkflowStageTemplate) o;
    return Objects.equals(this.name, workflowStageTemplate.name) &&
        Objects.equals(this.assignmentType, workflowStageTemplate.assignmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, assignmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStageTemplate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assignmentType: ").append(toIndentedString(assignmentType)).append("\n");
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

