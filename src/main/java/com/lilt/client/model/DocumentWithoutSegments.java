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


package com.lilt.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lilt.client.model.DocumentWithoutSegmentsStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Document is a collection of zero or more Segments. 
 */
@ApiModel(description = "A Document is a collection of zero or more Segments. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-09T11:54:15.439-07:00[America/Los_Angeles]")
public class DocumentWithoutSegments {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Integer projectId;

  public static final String SERIALIZED_NAME_SRCLANG = "srclang";
  @SerializedName(SERIALIZED_NAME_SRCLANG)
  private String srclang;

  public static final String SERIALIZED_NAME_TRGLANG = "trglang";
  @SerializedName(SERIALIZED_NAME_TRGLANG)
  private String trglang;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IMPORT_IN_PROGRESS = "import_in_progress";
  @SerializedName(SERIALIZED_NAME_IMPORT_IN_PROGRESS)
  private Boolean importInProgress;

  public static final String SERIALIZED_NAME_IMPORT_SUCCEEDED = "import_succeeded";
  @SerializedName(SERIALIZED_NAME_IMPORT_SUCCEEDED)
  private Boolean importSucceeded;

  public static final String SERIALIZED_NAME_IMPORT_ERROR_MESSAGE = "import_error_message";
  @SerializedName(SERIALIZED_NAME_IMPORT_ERROR_MESSAGE)
  private String importErrorMessage;

  public static final String SERIALIZED_NAME_EXPORT_IN_PROGRESS = "export_in_progress";
  @SerializedName(SERIALIZED_NAME_EXPORT_IN_PROGRESS)
  private Boolean exportInProgress;

  public static final String SERIALIZED_NAME_EXPORT_SUCCEEDED = "export_succeeded";
  @SerializedName(SERIALIZED_NAME_EXPORT_SUCCEEDED)
  private Boolean exportSucceeded;

  public static final String SERIALIZED_NAME_EXPORT_ERROR_MESSAGE = "export_error_message";
  @SerializedName(SERIALIZED_NAME_EXPORT_ERROR_MESSAGE)
  private String exportErrorMessage;

  public static final String SERIALIZED_NAME_IS_PRETRANSLATING = "is_pretranslating";
  @SerializedName(SERIALIZED_NAME_IS_PRETRANSLATING)
  private Boolean isPretranslating;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DocumentWithoutSegmentsStatus status;

  public static final String SERIALIZED_NAME_TRANSLATOR_EMAIL = "translator_email";
  @SerializedName(SERIALIZED_NAME_TRANSLATOR_EMAIL)
  private String translatorEmail;

  public static final String SERIALIZED_NAME_REVIEWER_EMAIL = "reviewer_email";
  @SerializedName(SERIALIZED_NAME_REVIEWER_EMAIL)
  private String reviewerEmail;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Integer updatedAt;


  public DocumentWithoutSegments id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique number identifying the Document.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46530", value = "A unique number identifying the Document.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public DocumentWithoutSegments projectId(Integer projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * A unique number identifying the Project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "287", value = "A unique number identifying the Project.")

  public Integer getProjectId() {
    return projectId;
  }


  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }


  public DocumentWithoutSegments srclang(String srclang) {
    
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


  public DocumentWithoutSegments trglang(String trglang) {
    
    this.trglang = trglang;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return trglang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "An ISO 639-1 language identifier.")

  public String getTrglang() {
    return trglang;
  }


  public void setTrglang(String trglang) {
    this.trglang = trglang;
  }


  public DocumentWithoutSegments name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The document name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Introduction.xliff", value = "The document name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentWithoutSegments importInProgress(Boolean importInProgress) {
    
    this.importInProgress = importInProgress;
    return this;
  }

   /**
   * True if the document is currently being imported
   * @return importInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the document is currently being imported")

  public Boolean getImportInProgress() {
    return importInProgress;
  }


  public void setImportInProgress(Boolean importInProgress) {
    this.importInProgress = importInProgress;
  }


  public DocumentWithoutSegments importSucceeded(Boolean importSucceeded) {
    
    this.importSucceeded = importSucceeded;
    return this;
  }

   /**
   * True if the import process succeeded.
   * @return importSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the import process succeeded.")

  public Boolean getImportSucceeded() {
    return importSucceeded;
  }


  public void setImportSucceeded(Boolean importSucceeded) {
    this.importSucceeded = importSucceeded;
  }


  public DocumentWithoutSegments importErrorMessage(String importErrorMessage) {
    
    this.importErrorMessage = importErrorMessage;
    return this;
  }

   /**
   * Error message if &#x60;import_succeeded&#x3D;false&#x60;
   * @return importErrorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Could not parse XML.", value = "Error message if `import_succeeded=false`")

  public String getImportErrorMessage() {
    return importErrorMessage;
  }


  public void setImportErrorMessage(String importErrorMessage) {
    this.importErrorMessage = importErrorMessage;
  }


  public DocumentWithoutSegments exportInProgress(Boolean exportInProgress) {
    
    this.exportInProgress = exportInProgress;
    return this;
  }

   /**
   * True if the document is currently being exported for download
   * @return exportInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the document is currently being exported for download")

  public Boolean getExportInProgress() {
    return exportInProgress;
  }


  public void setExportInProgress(Boolean exportInProgress) {
    this.exportInProgress = exportInProgress;
  }


  public DocumentWithoutSegments exportSucceeded(Boolean exportSucceeded) {
    
    this.exportSucceeded = exportSucceeded;
    return this;
  }

   /**
   * True if the export process succeeded.
   * @return exportSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the export process succeeded.")

  public Boolean getExportSucceeded() {
    return exportSucceeded;
  }


  public void setExportSucceeded(Boolean exportSucceeded) {
    this.exportSucceeded = exportSucceeded;
  }


  public DocumentWithoutSegments exportErrorMessage(String exportErrorMessage) {
    
    this.exportErrorMessage = exportErrorMessage;
    return this;
  }

   /**
   * Error message if &#x60;export_succeeded&#x3D;false&#x60;
   * @return exportErrorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Could not parse XML.", value = "Error message if `export_succeeded=false`")

  public String getExportErrorMessage() {
    return exportErrorMessage;
  }


  public void setExportErrorMessage(String exportErrorMessage) {
    this.exportErrorMessage = exportErrorMessage;
  }


  public DocumentWithoutSegments isPretranslating(Boolean isPretranslating) {
    
    this.isPretranslating = isPretranslating;
    return this;
  }

   /**
   * True if the document is currently being pretranslated.
   * @return isPretranslating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True if the document is currently being pretranslated.")

  public Boolean getIsPretranslating() {
    return isPretranslating;
  }


  public void setIsPretranslating(Boolean isPretranslating) {
    this.isPretranslating = isPretranslating;
  }


  public DocumentWithoutSegments status(DocumentWithoutSegmentsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentWithoutSegmentsStatus getStatus() {
    return status;
  }


  public void setStatus(DocumentWithoutSegmentsStatus status) {
    this.status = status;
  }


  public DocumentWithoutSegments translatorEmail(String translatorEmail) {
    
    this.translatorEmail = translatorEmail;
    return this;
  }

   /**
   * The email of the assigned translator.
   * @return translatorEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "translator@example.com", value = "The email of the assigned translator.")

  public String getTranslatorEmail() {
    return translatorEmail;
  }


  public void setTranslatorEmail(String translatorEmail) {
    this.translatorEmail = translatorEmail;
  }


  public DocumentWithoutSegments reviewerEmail(String reviewerEmail) {
    
    this.reviewerEmail = reviewerEmail;
    return this;
  }

   /**
   * The email of the assigned reviewer.
   * @return reviewerEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "reviewer@example.com", value = "The email of the assigned reviewer.")

  public String getReviewerEmail() {
    return reviewerEmail;
  }


  public void setReviewerEmail(String reviewerEmail) {
    this.reviewerEmail = reviewerEmail;
  }


  public DocumentWithoutSegments createdAt(Integer createdAt) {
    
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


  public DocumentWithoutSegments updatedAt(Integer updatedAt) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentWithoutSegments documentWithoutSegments = (DocumentWithoutSegments) o;
    return Objects.equals(this.id, documentWithoutSegments.id) &&
        Objects.equals(this.projectId, documentWithoutSegments.projectId) &&
        Objects.equals(this.srclang, documentWithoutSegments.srclang) &&
        Objects.equals(this.trglang, documentWithoutSegments.trglang) &&
        Objects.equals(this.name, documentWithoutSegments.name) &&
        Objects.equals(this.importInProgress, documentWithoutSegments.importInProgress) &&
        Objects.equals(this.importSucceeded, documentWithoutSegments.importSucceeded) &&
        Objects.equals(this.importErrorMessage, documentWithoutSegments.importErrorMessage) &&
        Objects.equals(this.exportInProgress, documentWithoutSegments.exportInProgress) &&
        Objects.equals(this.exportSucceeded, documentWithoutSegments.exportSucceeded) &&
        Objects.equals(this.exportErrorMessage, documentWithoutSegments.exportErrorMessage) &&
        Objects.equals(this.isPretranslating, documentWithoutSegments.isPretranslating) &&
        Objects.equals(this.status, documentWithoutSegments.status) &&
        Objects.equals(this.translatorEmail, documentWithoutSegments.translatorEmail) &&
        Objects.equals(this.reviewerEmail, documentWithoutSegments.reviewerEmail) &&
        Objects.equals(this.createdAt, documentWithoutSegments.createdAt) &&
        Objects.equals(this.updatedAt, documentWithoutSegments.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, srclang, trglang, name, importInProgress, importSucceeded, importErrorMessage, exportInProgress, exportSucceeded, exportErrorMessage, isPretranslating, status, translatorEmail, reviewerEmail, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentWithoutSegments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    srclang: ").append(toIndentedString(srclang)).append("\n");
    sb.append("    trglang: ").append(toIndentedString(trglang)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    importInProgress: ").append(toIndentedString(importInProgress)).append("\n");
    sb.append("    importSucceeded: ").append(toIndentedString(importSucceeded)).append("\n");
    sb.append("    importErrorMessage: ").append(toIndentedString(importErrorMessage)).append("\n");
    sb.append("    exportInProgress: ").append(toIndentedString(exportInProgress)).append("\n");
    sb.append("    exportSucceeded: ").append(toIndentedString(exportSucceeded)).append("\n");
    sb.append("    exportErrorMessage: ").append(toIndentedString(exportErrorMessage)).append("\n");
    sb.append("    isPretranslating: ").append(toIndentedString(isPretranslating)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    translatorEmail: ").append(toIndentedString(translatorEmail)).append("\n");
    sb.append("    reviewerEmail: ").append(toIndentedString(reviewerEmail)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
