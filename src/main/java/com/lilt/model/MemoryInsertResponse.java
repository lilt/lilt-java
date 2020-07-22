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


package com.lilt.model;

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
 * MemoryInsertResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-24T09:28:10.400208-07:00[America/Los_Angeles]")
public class MemoryInsertResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NUM_UPDATES = "num_updates";
  @SerializedName(SERIALIZED_NAME_NUM_UPDATES)
  private Integer numUpdates;


  public MemoryInsertResponse id(Integer id) {
    
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


  public MemoryInsertResponse numUpdates(Integer numUpdates) {
    
    this.numUpdates = numUpdates;
    return this;
  }

   /**
   * The number of updates to the Memory.
   * @return numUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "107", value = "The number of updates to the Memory.")

  public Integer getNumUpdates() {
    return numUpdates;
  }


  public void setNumUpdates(Integer numUpdates) {
    this.numUpdates = numUpdates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoryInsertResponse memoryInsertResponse = (MemoryInsertResponse) o;
    return Objects.equals(this.id, memoryInsertResponse.id) &&
        Objects.equals(this.numUpdates, memoryInsertResponse.numUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numUpdates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoryInsertResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numUpdates: ").append(toIndentedString(numUpdates)).append("\n");
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

