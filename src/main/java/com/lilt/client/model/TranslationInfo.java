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
 * Information describing a batch translation process. 
 */
@ApiModel(description = "Information describing a batch translation process. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T00:17:22.916Z[GMT]")
public class TranslationInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_FILE_ID = "fileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private Integer fileId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_ERROR_MSG = "errorMsg";
  @SerializedName(SERIALIZED_NAME_ERROR_MSG)
  private String errorMsg;


  public TranslationInfo id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for this translation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for this translation.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TranslationInfo fileId(Integer fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * id of the File that is being translated.
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the File that is being translated.")

  public Integer getFileId() {
    return fileId;
  }


  public void setFileId(Integer fileId) {
    this.fileId = fileId;
  }


  public TranslationInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the translation - &#x60;InProgress&#x60;, &#x60;ReadyForDownload&#x60;, &#x60;Completed&#x60;, &#x60;Failed&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the translation - `InProgress`, `ReadyForDownload`, `Completed`, `Failed`.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TranslationInfo createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time when this translation was started, in seconds since the Unix epoch.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time when this translation was started, in seconds since the Unix epoch.")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public TranslationInfo errorMsg(String errorMsg) {
    
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Error message, present when status is &#x60;Failed&#x60;.
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message, present when status is `Failed`.")

  public String getErrorMsg() {
    return errorMsg;
  }


  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationInfo translationInfo = (TranslationInfo) o;
    return Objects.equals(this.id, translationInfo.id) &&
        Objects.equals(this.fileId, translationInfo.fileId) &&
        Objects.equals(this.status, translationInfo.status) &&
        Objects.equals(this.createdAt, translationInfo.createdAt) &&
        Objects.equals(this.errorMsg, translationInfo.errorMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileId, status, createdAt, errorMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

