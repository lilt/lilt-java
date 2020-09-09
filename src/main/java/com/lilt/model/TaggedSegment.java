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
 * A source string with tags automatically projected from source to target.
 */
@ApiModel(description = "A source string with tags automatically projected from source to target.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-09T11:50:08.360-07:00[America/Los_Angeles]")
public class TaggedSegment {
  public static final String SERIALIZED_NAME_SOURCE_TAGGED = "source_tagged";
  @SerializedName(SERIALIZED_NAME_SOURCE_TAGGED)
  private String sourceTagged;

  public static final String SERIALIZED_NAME_TARGET_TAGGED = "target_tagged";
  @SerializedName(SERIALIZED_NAME_TARGET_TAGGED)
  private String targetTagged;


  public TaggedSegment sourceTagged(String sourceTagged) {
    
    this.sourceTagged = sourceTagged;
    return this;
  }

   /**
   * The tagged source string.
   * @return sourceTagged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The <b>red bus.</b>", value = "The tagged source string.")

  public String getSourceTagged() {
    return sourceTagged;
  }


  public void setSourceTagged(String sourceTagged) {
    this.sourceTagged = sourceTagged;
  }


  public TaggedSegment targetTagged(String targetTagged) {
    
    this.targetTagged = targetTagged;
    return this;
  }

   /**
   * The tagged target string.
   * @return targetTagged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Le <b>bus rouge.</b>", value = "The tagged target string.")

  public String getTargetTagged() {
    return targetTagged;
  }


  public void setTargetTagged(String targetTagged) {
    this.targetTagged = targetTagged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaggedSegment taggedSegment = (TaggedSegment) o;
    return Objects.equals(this.sourceTagged, taggedSegment.sourceTagged) &&
        Objects.equals(this.targetTagged, taggedSegment.targetTagged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceTagged, targetTagged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggedSegment {\n");
    sb.append("    sourceTagged: ").append(toIndentedString(sourceTagged)).append("\n");
    sb.append("    targetTagged: ").append(toIndentedString(targetTagged)).append("\n");
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

