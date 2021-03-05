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
 * MemoryImportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-04T23:50:13.754Z[GMT]")
public class MemoryImportResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_PROCESSING = "isProcessing";
  @SerializedName(SERIALIZED_NAME_IS_PROCESSING)
  private Integer isProcessing;


  public MemoryImportResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique Memory identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "A unique Memory identifier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public MemoryImportResponse isProcessing(Integer isProcessing) {
    
    this.isProcessing = isProcessing;
    return this;
  }

   /**
   * The current state of the import.
   * @return isProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The current state of the import.")

  public Integer getIsProcessing() {
    return isProcessing;
  }


  public void setIsProcessing(Integer isProcessing) {
    this.isProcessing = isProcessing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoryImportResponse memoryImportResponse = (MemoryImportResponse) o;
    return Objects.equals(this.id, memoryImportResponse.id) &&
        Objects.equals(this.isProcessing, memoryImportResponse.isProcessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isProcessing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoryImportResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isProcessing: ").append(toIndentedString(isProcessing)).append("\n");
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

