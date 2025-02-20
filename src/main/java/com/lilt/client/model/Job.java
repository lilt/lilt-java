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
import com.lilt.client.model.JobStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * A Job is a collection of multiple Projects. Each project is specific to a language pair, and is associated with exactly one Memory for that language pair. The Memory association cannot be changed after the Project is created. 
 */
@ApiModel(description = "A Job is a collection of multiple Projects. Each project is specific to a language pair, and is associated with exactly one Memory for that language pair. The Memory association cannot be changed after the Project is created. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:28:02.795Z[GMT]")
public class Job {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATION_STATUS = "creationStatus";
  @SerializedName(SERIALIZED_NAME_CREATION_STATUS)
  private String creationStatus;

  public static final String SERIALIZED_NAME_DELIVERED_AT = "deliveredAt";
  @SerializedName(SERIALIZED_NAME_DELIVERED_AT)
  private OffsetDateTime deliveredAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DUE = "due";
  @SerializedName(SERIALIZED_NAME_DUE)
  private OffsetDateTime due;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_PROCESSING = "isProcessing";
  @SerializedName(SERIALIZED_NAME_IS_PROCESSING)
  private Integer isProcessing;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private JobStats stats;


  public Job name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the job.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My New Job", value = "A name for the job.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Job creationStatus(String creationStatus) {
    
    this.creationStatus = creationStatus;
    return this;
  }

   /**
   * Status of job creation process that includes PENDING, COMPLETE, and FAILED.
   * @return creationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMPLETE", value = "Status of job creation process that includes PENDING, COMPLETE, and FAILED.")

  public String getCreationStatus() {
    return creationStatus;
  }


  public void setCreationStatus(String creationStatus) {
    this.creationStatus = creationStatus;
  }


  public Job deliveredAt(OffsetDateTime deliveredAt) {
    
    this.deliveredAt = deliveredAt;
    return this;
  }

   /**
   * Get deliveredAt
   * @return deliveredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-06-03T13:43Z", value = "")

  public OffsetDateTime getDeliveredAt() {
    return deliveredAt;
  }


  public void setDeliveredAt(OffsetDateTime deliveredAt) {
    this.deliveredAt = deliveredAt;
  }


  public Job status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Current status of job that includes archived, delivered, and active.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "Current status of job that includes archived, delivered, and active.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Job due(OffsetDateTime due) {
    
    this.due = due;
    return this;
  }

   /**
   * An ISO string date.
   * @return due
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-06-03T13:43Z", value = "An ISO string date.")

  public OffsetDateTime getDue() {
    return due;
  }


  public void setDue(OffsetDateTime due) {
    this.due = due;
  }


  public Job id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * An id for the job.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "241", value = "An id for the job.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Job isProcessing(Integer isProcessing) {
    
    this.isProcessing = isProcessing;
    return this;
  }

   /**
   * Values include &#x60;1&#x60; while in progress, &#x60;0&#x60; when idle and &#x60;-2&#x60; when processing failed.
   * @return isProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Values include `1` while in progress, `0` when idle and `-2` when processing failed.")

  public Integer getIsProcessing() {
    return isProcessing;
  }


  public void setIsProcessing(Integer isProcessing) {
    this.isProcessing = isProcessing;
  }


  public Job stats(JobStats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobStats getStats() {
    return stats;
  }


  public void setStats(JobStats stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.name, job.name) &&
        Objects.equals(this.creationStatus, job.creationStatus) &&
        Objects.equals(this.deliveredAt, job.deliveredAt) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.due, job.due) &&
        Objects.equals(this.id, job.id) &&
        Objects.equals(this.isProcessing, job.isProcessing) &&
        Objects.equals(this.stats, job.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, creationStatus, deliveredAt, status, due, id, isProcessing, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationStatus: ").append(toIndentedString(creationStatus)).append("\n");
    sb.append("    deliveredAt: ").append(toIndentedString(deliveredAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isProcessing: ").append(toIndentedString(isProcessing)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

