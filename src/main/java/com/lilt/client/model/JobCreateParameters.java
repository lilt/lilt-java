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
import com.lilt.client.model.LanguagePair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T00:19:36.591Z[GMT]")
public class JobCreateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LANGUAGE_PAIRS = "languagePairs";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_PAIRS)
  private List<LanguagePair> languagePairs = new ArrayList<LanguagePair>();

  public static final String SERIALIZED_NAME_FILE_IDS = "fileIds";
  @SerializedName(SERIALIZED_NAME_FILE_IDS)
  private List<Integer> fileIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_DUE = "due";
  @SerializedName(SERIALIZED_NAME_DUE)
  private String due;

  public static final String SERIALIZED_NAME_SRC_LANG = "srcLang";
  @SerializedName(SERIALIZED_NAME_SRC_LANG)
  private String srcLang;

  public static final String SERIALIZED_NAME_SRC_LOCALE = "srcLocale";
  @SerializedName(SERIALIZED_NAME_SRC_LOCALE)
  private String srcLocale;

  public static final String SERIALIZED_NAME_IS_PLURAL = "isPlural";
  @SerializedName(SERIALIZED_NAME_IS_PLURAL)
  private Boolean isPlural;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_ID = "workflowTemplateId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_ID)
  private Integer workflowTemplateId;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_NAME = "workflowTemplateName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_NAME)
  private Integer workflowTemplateName;


  public JobCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the Job.
   * @return name
  **/
  @ApiModelProperty(example = "My new Job", required = true, value = "A name for the Job.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobCreateParameters languagePairs(List<LanguagePair> languagePairs) {
    
    this.languagePairs = languagePairs;
    return this;
  }

  public JobCreateParameters addLanguagePairsItem(LanguagePair languagePairsItem) {
    this.languagePairs.add(languagePairsItem);
    return this;
  }

   /**
   * Language pairs is a set of one or more pairs that includes source language, source locale(optional), target language, target locale(optional), and memoryId.
   * @return languagePairs
  **/
  @ApiModelProperty(required = true, value = "Language pairs is a set of one or more pairs that includes source language, source locale(optional), target language, target locale(optional), and memoryId.")

  public List<LanguagePair> getLanguagePairs() {
    return languagePairs;
  }


  public void setLanguagePairs(List<LanguagePair> languagePairs) {
    this.languagePairs = languagePairs;
  }


  public JobCreateParameters fileIds(List<Integer> fileIds) {
    
    this.fileIds = fileIds;
    return this;
  }

  public JobCreateParameters addFileIdsItem(Integer fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of file ids to upload to job creation.
   * @return fileIds
  **/
  @ApiModelProperty(example = "[298,299]", required = true, value = "A list of file ids to upload to job creation.")

  public List<Integer> getFileIds() {
    return fileIds;
  }


  public void setFileIds(List<Integer> fileIds) {
    this.fileIds = fileIds;
  }


  public JobCreateParameters due(String due) {
    
    this.due = due;
    return this;
  }

   /**
   * An ISO string date representing job due date.
   * @return due
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-05T14:48:00.000Z", value = "An ISO string date representing job due date.")

  public String getDue() {
    return due;
  }


  public void setDue(String due) {
    this.due = due;
  }


  public JobCreateParameters srcLang(String srcLang) {
    
    this.srcLang = srcLang;
    return this;
  }

   /**
   * 2-letter ISO source language code
   * @return srcLang
  **/
  @ApiModelProperty(example = "en", required = true, value = "2-letter ISO source language code")

  public String getSrcLang() {
    return srcLang;
  }


  public void setSrcLang(String srcLang) {
    this.srcLang = srcLang;
  }


  public JobCreateParameters srcLocale(String srcLocale) {
    
    this.srcLocale = srcLocale;
    return this;
  }

   /**
   * 2-letter source language code
   * @return srcLocale
  **/
  @ApiModelProperty(example = "US", required = true, value = "2-letter source language code")

  public String getSrcLocale() {
    return srcLocale;
  }


  public void setSrcLocale(String srcLocale) {
    this.srcLocale = srcLocale;
  }


  public JobCreateParameters isPlural(Boolean isPlural) {
    
    this.isPlural = isPlural;
    return this;
  }

   /**
   * A boolean value representing if the files have plurals.
   * @return isPlural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A boolean value representing if the files have plurals.")

  public Boolean getIsPlural() {
    return isPlural;
  }


  public void setIsPlural(Boolean isPlural) {
    this.isPlural = isPlural;
  }


  public JobCreateParameters workflowTemplateId(Integer workflowTemplateId) {
    
    this.workflowTemplateId = workflowTemplateId;
    return this;
  }

   /**
   * Identifier of the workflow template to be used when creating a job. If not passed the organization default will be used.
   * @return workflowTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "Identifier of the workflow template to be used when creating a job. If not passed the organization default will be used.")

  public Integer getWorkflowTemplateId() {
    return workflowTemplateId;
  }


  public void setWorkflowTemplateId(Integer workflowTemplateId) {
    this.workflowTemplateId = workflowTemplateId;
  }


  public JobCreateParameters workflowTemplateName(Integer workflowTemplateName) {
    
    this.workflowTemplateName = workflowTemplateName;
    return this;
  }

   /**
   * Name of the workflow template to be used, must be passed with teamId or look up will fail. If workflowTemplateId is passed it supercedes any other look up.
   * @return workflowTemplateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the workflow template to be used, must be passed with teamId or look up will fail. If workflowTemplateId is passed it supercedes any other look up.")

  public Integer getWorkflowTemplateName() {
    return workflowTemplateName;
  }


  public void setWorkflowTemplateName(Integer workflowTemplateName) {
    this.workflowTemplateName = workflowTemplateName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCreateParameters jobCreateParameters = (JobCreateParameters) o;
    return Objects.equals(this.name, jobCreateParameters.name) &&
        Objects.equals(this.languagePairs, jobCreateParameters.languagePairs) &&
        Objects.equals(this.fileIds, jobCreateParameters.fileIds) &&
        Objects.equals(this.due, jobCreateParameters.due) &&
        Objects.equals(this.srcLang, jobCreateParameters.srcLang) &&
        Objects.equals(this.srcLocale, jobCreateParameters.srcLocale) &&
        Objects.equals(this.isPlural, jobCreateParameters.isPlural) &&
        Objects.equals(this.workflowTemplateId, jobCreateParameters.workflowTemplateId) &&
        Objects.equals(this.workflowTemplateName, jobCreateParameters.workflowTemplateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, languagePairs, fileIds, due, srcLang, srcLocale, isPlural, workflowTemplateId, workflowTemplateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCreateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    languagePairs: ").append(toIndentedString(languagePairs)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    srcLang: ").append(toIndentedString(srcLang)).append("\n");
    sb.append("    srcLocale: ").append(toIndentedString(srcLocale)).append("\n");
    sb.append("    isPlural: ").append(toIndentedString(isPlural)).append("\n");
    sb.append("    workflowTemplateId: ").append(toIndentedString(workflowTemplateId)).append("\n");
    sb.append("    workflowTemplateName: ").append(toIndentedString(workflowTemplateName)).append("\n");
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

