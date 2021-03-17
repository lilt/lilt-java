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
 * A Comment is a translator&#39;s or a reviewer&#39;s comment on a segment. 
 */
@ApiModel(description = "A Comment is a translator's or a reviewer's comment on a segment. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-17T00:12:38.610Z[GMT]")
public class Comment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_IS_RESOLVED = "is_resolved";
  @SerializedName(SERIALIZED_NAME_IS_RESOLVED)
  private Boolean isResolved;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<Annotation> annotations = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;


  public Comment id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique number identifying the Comment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "84480010", value = "A unique number identifying the Comment.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Comment text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The comment text.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is incorrect.", value = "The comment text.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Comment userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The User who created this Comment.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5678", value = "The User who created this Comment.")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Comment isResolved(Boolean isResolved) {
    
    this.isResolved = isResolved;
    return this;
  }

   /**
   * Whether the Comment is resolved.
   * @return isResolved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the Comment is resolved.")

  public Boolean getIsResolved() {
    return isResolved;
  }


  public void setIsResolved(Boolean isResolved) {
    this.isResolved = isResolved;
  }


  public Comment annotations(List<Annotation> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public Comment addAnnotationsItem(Annotation annotationsItem) {
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


  public Comment createdAt(Integer createdAt) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.text, comment.text) &&
        Objects.equals(this.userId, comment.userId) &&
        Objects.equals(this.isResolved, comment.isResolved) &&
        Objects.equals(this.annotations, comment.annotations) &&
        Objects.equals(this.createdAt, comment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, userId, isResolved, annotations, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isResolved: ").append(toIndentedString(isResolved)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

