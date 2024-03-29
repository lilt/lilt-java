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
import com.lilt.client.model.Annotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The body of a comment being created or updated. 
 */
@ApiModel(description = "The body of a comment being created or updated. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-20T00:13:26.792Z[GMT]")
public class CommentBody {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<Annotation> annotations = null;

  public static final String SERIALIZED_NAME_IS_RESOLVED = "isResolved";
  @SerializedName(SERIALIZED_NAME_IS_RESOLVED)
  private String isResolved;


  public CommentBody text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The main comment value.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please update this segment", value = "The main comment value.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CommentBody annotations(List<Annotation> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public CommentBody addAnnotationsItem(Annotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<Annotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * A list of optional Annotations.
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of optional Annotations.")

  public List<Annotation> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }


  public CommentBody isResolved(String isResolved) {
    
    this.isResolved = isResolved;
    return this;
  }

   /**
   * Get isResolved
   * @return isResolved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getIsResolved() {
    return isResolved;
  }


  public void setIsResolved(String isResolved) {
    this.isResolved = isResolved;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentBody commentBody = (CommentBody) o;
    return Objects.equals(this.text, commentBody.text) &&
        Objects.equals(this.annotations, commentBody.annotations) &&
        Objects.equals(this.isResolved, commentBody.isResolved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, annotations, isResolved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentBody {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    isResolved: ").append(toIndentedString(isResolved)).append("\n");
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

