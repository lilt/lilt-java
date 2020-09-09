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

/**
 * SegmentCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-09T11:54:15.439-07:00[America/Los_Angeles]")
public class SegmentCreateParameters {
  public static final String SERIALIZED_NAME_MEMORY_ID = "memory_id";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private Integer memoryId;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private Integer documentId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;


  public SegmentCreateParameters memoryId(Integer memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * A unique Memory identifier.
   * @return memoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10641", value = "A unique Memory identifier.")

  public Integer getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(Integer memoryId) {
    this.memoryId = memoryId;
  }


  public SegmentCreateParameters documentId(Integer documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * A unique Document identifier.
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1876", value = "A unique Document identifier.")

  public Integer getDocumentId() {
    return documentId;
  }


  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }


  public SegmentCreateParameters source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source string.
   * @return source
  **/
  @ApiModelProperty(example = "Code zur Fehleranalyse einschalten", required = true, value = "The source string.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public SegmentCreateParameters target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target string.
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Enable debugging code", value = "The target string.")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentCreateParameters segmentCreateParameters = (SegmentCreateParameters) o;
    return Objects.equals(this.memoryId, segmentCreateParameters.memoryId) &&
        Objects.equals(this.documentId, segmentCreateParameters.documentId) &&
        Objects.equals(this.source, segmentCreateParameters.source) &&
        Objects.equals(this.target, segmentCreateParameters.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoryId, documentId, source, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentCreateParameters {\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
