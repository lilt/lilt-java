/*
 * Lilt REST API
 * Lilt REST API Support: https://lilt.atlassian.net/servicedesk/customer/portals    The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:   * Training of and translating with interactive, adaptive machine translation   * Large-scale translation memory   * The Lexicon (a large-scale termbase)   * Programmatic control of the Lilt CAT environment   * Translation memory synchronization  Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests.  The base url for this REST API is `https://api.lilt.com/`.  ## Authentication  Requests are authenticated via REST API key, which requires the Business plan.  Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.  For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.  ## Quotas  Our services have a general quota of 4000 requests per minute. Should you hit the maximum requests per minute, you will need to wait 60 seconds before you can send another request. 
 *
 * The version of the OpenAPI document: v3.0
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
import com.lilt.client.model.WorkflowStageAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A language pair couples the source and target language along with memory and pre-translations settings associated to a project. 
 */
@ApiModel(description = "A language pair couples the source and target language along with memory and pre-translations settings associated to a project. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-19T20:26:43.350Z[GMT]")
public class LanguagePair {
  public static final String SERIALIZED_NAME_TRG_LANG = "trgLang";
  @SerializedName(SERIALIZED_NAME_TRG_LANG)
  private String trgLang;

  public static final String SERIALIZED_NAME_TRG_LOCALE = "trgLocale";
  @SerializedName(SERIALIZED_NAME_TRG_LOCALE)
  private String trgLocale;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_MEMORY_ID = "memoryId";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private Integer memoryId;

  public static final String SERIALIZED_NAME_EXTERNAL_MODEL_ID = "externalModelId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_MODEL_ID)
  private Integer externalModelId;

  public static final String SERIALIZED_NAME_PRETRANSLATE = "pretranslate";
  @SerializedName(SERIALIZED_NAME_PRETRANSLATE)
  private Boolean pretranslate;

  public static final String SERIALIZED_NAME_AUTO_ACCEPT = "autoAccept";
  @SerializedName(SERIALIZED_NAME_AUTO_ACCEPT)
  private Boolean autoAccept;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "caseSensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private Boolean caseSensitive;

  public static final String SERIALIZED_NAME_TAKE_MATCH_ATTRIBUTION = "takeMatchAttribution";
  @SerializedName(SERIALIZED_NAME_TAKE_MATCH_ATTRIBUTION)
  private Boolean takeMatchAttribution;

  public static final String SERIALIZED_NAME_CONFIG_ID = "configId";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Integer configId;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_ID = "workflowTemplateId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_ID)
  private Integer workflowTemplateId;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_NAME = "workflowTemplateName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_NAME)
  private Integer workflowTemplateName;

  public static final String SERIALIZED_NAME_WORKFLOW_STAGE_ASSIGNMENTS = "workflowStageAssignments";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STAGE_ASSIGNMENTS)
  private List<WorkflowStageAssignment> workflowStageAssignments = null;


  public LanguagePair trgLang(String trgLang) {
    
    this.trgLang = trgLang;
    return this;
  }

   /**
   * Target language, an ISO 639-1 language identifier.
   * @return trgLang
  **/
  @ApiModelProperty(example = "de", required = true, value = "Target language, an ISO 639-1 language identifier.")

  public String getTrgLang() {
    return trgLang;
  }


  public void setTrgLang(String trgLang) {
    this.trgLang = trgLang;
  }


  public LanguagePair trgLocale(String trgLocale) {
    
    this.trgLocale = trgLocale;
    return this;
  }

   /**
   * A locale identifier, supported for target language.
   * @return trgLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DE", value = "A locale identifier, supported for target language.")

  public String getTrgLocale() {
    return trgLocale;
  }


  public void setTrgLocale(String trgLocale) {
    this.trgLocale = trgLocale;
  }


  public LanguagePair dueDate(String dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * An ISO date.
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-03T13:43:00.000Z", value = "An ISO date.")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public LanguagePair memoryId(Integer memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * A unique number identifying the associated Memory.
   * @return memoryId
  **/
  @ApiModelProperty(example = "1241", required = true, value = "A unique number identifying the associated Memory.")

  public Integer getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(Integer memoryId) {
    this.memoryId = memoryId;
  }


  public LanguagePair externalModelId(Integer externalModelId) {
    
    this.externalModelId = externalModelId;
    return this;
  }

   /**
   * A unique identifier for working with a third party model in the Lilt Platform
   * @return externalModelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "44", value = "A unique identifier for working with a third party model in the Lilt Platform")

  public Integer getExternalModelId() {
    return externalModelId;
  }


  public void setExternalModelId(Integer externalModelId) {
    this.externalModelId = externalModelId;
  }


  public LanguagePair pretranslate(Boolean pretranslate) {
    
    this.pretranslate = pretranslate;
    return this;
  }

   /**
   * Attribute translation authorship of exact matches to the creator of the document being pretranslated.
   * @return pretranslate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute translation authorship of exact matches to the creator of the document being pretranslated.")

  public Boolean getPretranslate() {
    return pretranslate;
  }


  public void setPretranslate(Boolean pretranslate) {
    this.pretranslate = pretranslate;
  }


  public LanguagePair autoAccept(Boolean autoAccept) {
    
    this.autoAccept = autoAccept;
    return this;
  }

   /**
   * Accept and lock exact matches.
   * @return autoAccept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Accept and lock exact matches.")

  public Boolean getAutoAccept() {
    return autoAccept;
  }


  public void setAutoAccept(Boolean autoAccept) {
    this.autoAccept = autoAccept;
  }


  public LanguagePair caseSensitive(Boolean caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Use case sensitive translation memory matching.
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use case sensitive translation memory matching.")

  public Boolean getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public LanguagePair takeMatchAttribution(Boolean takeMatchAttribution) {
    
    this.takeMatchAttribution = takeMatchAttribution;
    return this;
  }

   /**
   * Use MT for unmatched segments.
   * @return takeMatchAttribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Use MT for unmatched segments.")

  public Boolean getTakeMatchAttribution() {
    return takeMatchAttribution;
  }


  public void setTakeMatchAttribution(Boolean takeMatchAttribution) {
    this.takeMatchAttribution = takeMatchAttribution;
  }


  public LanguagePair configId(Integer configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * Configuration id
   * @return configId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2332", value = "Configuration id")

  public Integer getConfigId() {
    return configId;
  }


  public void setConfigId(Integer configId) {
    this.configId = configId;
  }


  public LanguagePair workflowTemplateId(Integer workflowTemplateId) {
    
    this.workflowTemplateId = workflowTemplateId;
    return this;
  }

   /**
   * Workflow Template id, to assign a specific Workflow to the project created out of this Language Pair. WorkflowTemplateIds can be retrieved via the /workflows/templates endpoint. If not specified then the Job level workflowTemplateId will be used.
   * @return workflowTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "Workflow Template id, to assign a specific Workflow to the project created out of this Language Pair. WorkflowTemplateIds can be retrieved via the /workflows/templates endpoint. If not specified then the Job level workflowTemplateId will be used.")

  public Integer getWorkflowTemplateId() {
    return workflowTemplateId;
  }


  public void setWorkflowTemplateId(Integer workflowTemplateId) {
    this.workflowTemplateId = workflowTemplateId;
  }


  public LanguagePair workflowTemplateName(Integer workflowTemplateName) {
    
    this.workflowTemplateName = workflowTemplateName;
    return this;
  }

   /**
   * Workflow Template Name, when passed with TeamId it allows for an on the fly look up of the correct WorkflowTemplate to use. If workflowTemplateId is passed the workflowTemplateId supercedes other lookups.
   * @return workflowTemplateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Workflow Template Name, when passed with TeamId it allows for an on the fly look up of the correct WorkflowTemplate to use. If workflowTemplateId is passed the workflowTemplateId supercedes other lookups.")

  public Integer getWorkflowTemplateName() {
    return workflowTemplateName;
  }


  public void setWorkflowTemplateName(Integer workflowTemplateName) {
    this.workflowTemplateName = workflowTemplateName;
  }


  public LanguagePair workflowStageAssignments(List<WorkflowStageAssignment> workflowStageAssignments) {
    
    this.workflowStageAssignments = workflowStageAssignments;
    return this;
  }

  public LanguagePair addWorkflowStageAssignmentsItem(WorkflowStageAssignment workflowStageAssignmentsItem) {
    if (this.workflowStageAssignments == null) {
      this.workflowStageAssignments = new ArrayList<WorkflowStageAssignment>();
    }
    this.workflowStageAssignments.add(workflowStageAssignmentsItem);
    return this;
  }

   /**
   * Get workflowStageAssignments
   * @return workflowStageAssignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkflowStageAssignment> getWorkflowStageAssignments() {
    return workflowStageAssignments;
  }


  public void setWorkflowStageAssignments(List<WorkflowStageAssignment> workflowStageAssignments) {
    this.workflowStageAssignments = workflowStageAssignments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguagePair languagePair = (LanguagePair) o;
    return Objects.equals(this.trgLang, languagePair.trgLang) &&
        Objects.equals(this.trgLocale, languagePair.trgLocale) &&
        Objects.equals(this.dueDate, languagePair.dueDate) &&
        Objects.equals(this.memoryId, languagePair.memoryId) &&
        Objects.equals(this.externalModelId, languagePair.externalModelId) &&
        Objects.equals(this.pretranslate, languagePair.pretranslate) &&
        Objects.equals(this.autoAccept, languagePair.autoAccept) &&
        Objects.equals(this.caseSensitive, languagePair.caseSensitive) &&
        Objects.equals(this.takeMatchAttribution, languagePair.takeMatchAttribution) &&
        Objects.equals(this.configId, languagePair.configId) &&
        Objects.equals(this.workflowTemplateId, languagePair.workflowTemplateId) &&
        Objects.equals(this.workflowTemplateName, languagePair.workflowTemplateName) &&
        Objects.equals(this.workflowStageAssignments, languagePair.workflowStageAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trgLang, trgLocale, dueDate, memoryId, externalModelId, pretranslate, autoAccept, caseSensitive, takeMatchAttribution, configId, workflowTemplateId, workflowTemplateName, workflowStageAssignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguagePair {\n");
    sb.append("    trgLang: ").append(toIndentedString(trgLang)).append("\n");
    sb.append("    trgLocale: ").append(toIndentedString(trgLocale)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
    sb.append("    externalModelId: ").append(toIndentedString(externalModelId)).append("\n");
    sb.append("    pretranslate: ").append(toIndentedString(pretranslate)).append("\n");
    sb.append("    autoAccept: ").append(toIndentedString(autoAccept)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    takeMatchAttribution: ").append(toIndentedString(takeMatchAttribution)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    workflowTemplateId: ").append(toIndentedString(workflowTemplateId)).append("\n");
    sb.append("    workflowTemplateName: ").append(toIndentedString(workflowTemplateName)).append("\n");
    sb.append("    workflowStageAssignments: ").append(toIndentedString(workflowStageAssignments)).append("\n");
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

