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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A File is an unprocessed source file that can later be added to a project.
 */
@ApiModel(description = "A File is an unprocessed source file that can later be added to a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-10T16:54:28.381768-08:00[America/Los_Angeles]")
public class File {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILE_HASH = "file_hash";
  @SerializedName(SERIALIZED_NAME_FILE_HASH)
  private String fileHash;

  public static final String SERIALIZED_NAME_EXPORT_URI = "export_uri";
  @SerializedName(SERIALIZED_NAME_EXPORT_URI)
  private String exportUri;

  public static final String SERIALIZED_NAME_DETECTED_LANG = "detected_lang";
  @SerializedName(SERIALIZED_NAME_DETECTED_LANG)
  private String detectedLang;

  public static final String SERIALIZED_NAME_DETECTED_LANG_CONFIDENCE = "detected_lang_confidence";
  @SerializedName(SERIALIZED_NAME_DETECTED_LANG_CONFIDENCE)
  private BigDecimal detectedLangConfidence;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Integer updatedAt;


  public File id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique number identifying the File.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46530", value = "A unique number identifying the File.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public File name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The file name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en_US.json", value = "The file name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public File fileHash(String fileHash) {
    
    this.fileHash = fileHash;
    return this;
  }

   /**
   * A unique hash value associated with the file. An MD5 hash of the file content will be used by default.
   * @return fileHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3858f62230ac3c915f300c664312c63f", value = "A unique hash value associated with the file. An MD5 hash of the file content will be used by default.")

  public String getFileHash() {
    return fileHash;
  }


  public void setFileHash(String fileHash) {
    this.fileHash = fileHash;
  }


  public File exportUri(String exportUri) {
    
    this.exportUri = exportUri;
    return this;
  }

   /**
   * A webhook endpoint that will export the translated document back to the source repository.
   * @return exportUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/export", value = "A webhook endpoint that will export the translated document back to the source repository.")

  public String getExportUri() {
    return exportUri;
  }


  public void setExportUri(String exportUri) {
    this.exportUri = exportUri;
  }


  public File detectedLang(String detectedLang) {
    
    this.detectedLang = detectedLang;
    return this;
  }

   /**
   * Language associated with the file.
   * @return detectedLang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "Language associated with the file.")

  public String getDetectedLang() {
    return detectedLang;
  }


  public void setDetectedLang(String detectedLang) {
    this.detectedLang = detectedLang;
  }


  public File detectedLangConfidence(BigDecimal detectedLangConfidence) {
    
    this.detectedLangConfidence = detectedLangConfidence;
    return this;
  }

   /**
   * Confidence score for the language associated with the file.
   * @return detectedLangConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.7", value = "Confidence score for the language associated with the file.")

  public BigDecimal getDetectedLangConfidence() {
    return detectedLangConfidence;
  }


  public void setDetectedLangConfidence(BigDecimal detectedLangConfidence) {
    this.detectedLangConfidence = detectedLangConfidence;
  }


  public File category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category of the file. The options are &#x60;REFERENCE&#x60;, or &#x60;API&#x60;. The default is API. Files with the &#x60;REFERENCE&#x60; category will be displayed as reference material.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "REFERENCE", value = "The category of the file. The options are `REFERENCE`, or `API`. The default is API. Files with the `REFERENCE` category will be displayed as reference material.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public File labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public File addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * The list of labels associated with the file.
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "The list of labels associated with the file.")

  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public File createdAt(Integer createdAt) {
    
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


  public File updatedAt(Integer updatedAt) {
    
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    File file = (File) o;
    return Objects.equals(this.id, file.id) &&
        Objects.equals(this.name, file.name) &&
        Objects.equals(this.fileHash, file.fileHash) &&
        Objects.equals(this.exportUri, file.exportUri) &&
        Objects.equals(this.detectedLang, file.detectedLang) &&
        Objects.equals(this.detectedLangConfidence, file.detectedLangConfidence) &&
        Objects.equals(this.category, file.category) &&
        Objects.equals(this.labels, file.labels) &&
        Objects.equals(this.createdAt, file.createdAt) &&
        Objects.equals(this.updatedAt, file.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fileHash, exportUri, detectedLang, detectedLangConfidence, category, labels, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class File {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
    sb.append("    exportUri: ").append(toIndentedString(exportUri)).append("\n");
    sb.append("    detectedLang: ").append(toIndentedString(detectedLang)).append("\n");
    sb.append("    detectedLangConfidence: ").append(toIndentedString(detectedLangConfidence)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

