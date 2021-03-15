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
 * LanguagesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T14:22:49.219647-07:00[America/Los_Angeles]")
public class LanguagesResponse {
  public static final String SERIALIZED_NAME_SOURCE_TO_TARGET = "source_to_target";
  @SerializedName(SERIALIZED_NAME_SOURCE_TO_TARGET)
  private Object sourceToTarget;

  public static final String SERIALIZED_NAME_CODE_TO_NAME = "code_to_name";
  @SerializedName(SERIALIZED_NAME_CODE_TO_NAME)
  private Object codeToName;


  public LanguagesResponse sourceToTarget(Object sourceToTarget) {
    
    this.sourceToTarget = sourceToTarget;
    return this;
  }

   /**
   * A two-dimensional object in which the first key is an ISO 639-1 language code indicating the source, and the second key is an ISO 639-1 language code indicating the target.
   * @return sourceToTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en\":{\"da\":true,\"de\":true,\"fr\":true,\"...\":\"...\"},\"...\":\"...\"}", value = "A two-dimensional object in which the first key is an ISO 639-1 language code indicating the source, and the second key is an ISO 639-1 language code indicating the target.")

  public Object getSourceToTarget() {
    return sourceToTarget;
  }


  public void setSourceToTarget(Object sourceToTarget) {
    this.sourceToTarget = sourceToTarget;
  }


  public LanguagesResponse codeToName(Object codeToName) {
    
    this.codeToName = codeToName;
    return this;
  }

   /**
   * An object in which the key is an ISO 639-1 language code, and the value is the language name.
   * @return codeToName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"aa\":\"Afar\",\"ab\":\"Abkhazian\",\"af\":\"Afrikaans\",\"...\":\"...\"}", value = "An object in which the key is an ISO 639-1 language code, and the value is the language name.")

  public Object getCodeToName() {
    return codeToName;
  }


  public void setCodeToName(Object codeToName) {
    this.codeToName = codeToName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguagesResponse languagesResponse = (LanguagesResponse) o;
    return Objects.equals(this.sourceToTarget, languagesResponse.sourceToTarget) &&
        Objects.equals(this.codeToName, languagesResponse.codeToName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceToTarget, codeToName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguagesResponse {\n");
    sb.append("    sourceToTarget: ").append(toIndentedString(sourceToTarget)).append("\n");
    sb.append("    codeToName: ").append(toIndentedString(codeToName)).append("\n");
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

