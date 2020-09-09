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
 * ApiRoot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-09T11:50:08.360-07:00[America/Los_Angeles]")
public class ApiRoot {
  public static final String SERIALIZED_NAME_API_NAME = "api_name";
  @SerializedName(SERIALIZED_NAME_API_NAME)
  private String apiName;

  public static final String SERIALIZED_NAME_API_ROOT = "api_root";
  @SerializedName(SERIALIZED_NAME_API_ROOT)
  private String apiRoot;


  public ApiRoot apiName(String apiName) {
    
    this.apiName = apiName;
    return this;
  }

   /**
   * Get apiName
   * @return apiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lilt REST API v2", value = "")

  public String getApiName() {
    return apiName;
  }


  public void setApiName(String apiName) {
    this.apiName = apiName;
  }


  public ApiRoot apiRoot(String apiRoot) {
    
    this.apiRoot = apiRoot;
    return this;
  }

   /**
   * Get apiRoot
   * @return apiRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/2", value = "")

  public String getApiRoot() {
    return apiRoot;
  }


  public void setApiRoot(String apiRoot) {
    this.apiRoot = apiRoot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRoot apiRoot = (ApiRoot) o;
    return Objects.equals(this.apiName, apiRoot.apiName) &&
        Objects.equals(this.apiRoot, apiRoot.apiRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiName, apiRoot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRoot {\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    apiRoot: ").append(toIndentedString(apiRoot)).append("\n");
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

