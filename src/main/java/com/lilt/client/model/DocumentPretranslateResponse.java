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
import com.lilt.client.model.DocumentPretranslating;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentPretranslateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-22T17:35:42.609Z[GMT]")
public class DocumentPretranslateResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private List<Integer> id = null;

  public static final String SERIALIZED_NAME_IS_PRETRANSLATING = "is_pretranslating";
  @SerializedName(SERIALIZED_NAME_IS_PRETRANSLATING)
  private Boolean isPretranslating;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DocumentPretranslating> documents = null;


  public DocumentPretranslateResponse id(List<Integer> id) {
    
    this.id = id;
    return this;
  }

  public DocumentPretranslateResponse addIdItem(Integer idItem) {
    if (this.id == null) {
      this.id = new ArrayList<Integer>();
    }
    this.id.add(idItem);
    return this;
  }

   /**
   * A list of documents being pretranslated.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[123, 234]", value = "A list of documents being pretranslated.")

  public List<Integer> getId() {
    return id;
  }


  public void setId(List<Integer> id) {
    this.id = id;
  }


  public DocumentPretranslateResponse isPretranslating(Boolean isPretranslating) {
    
    this.isPretranslating = isPretranslating;
    return this;
  }

   /**
   * If the operation succeeded, then &#x60;true&#x60;. Otherwise, &#x60;false&#x60;.
   * @return isPretranslating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the operation succeeded, then `true`. Otherwise, `false`.")

  public Boolean getIsPretranslating() {
    return isPretranslating;
  }


  public void setIsPretranslating(Boolean isPretranslating) {
    this.isPretranslating = isPretranslating;
  }


  public DocumentPretranslateResponse documents(List<DocumentPretranslating> documents) {
    
    this.documents = documents;
    return this;
  }

  public DocumentPretranslateResponse addDocumentsItem(DocumentPretranslating documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DocumentPretranslating>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Document pretranslation status.
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document pretranslation status.")

  public List<DocumentPretranslating> getDocuments() {
    return documents;
  }


  public void setDocuments(List<DocumentPretranslating> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPretranslateResponse documentPretranslateResponse = (DocumentPretranslateResponse) o;
    return Objects.equals(this.id, documentPretranslateResponse.id) &&
        Objects.equals(this.isPretranslating, documentPretranslateResponse.isPretranslating) &&
        Objects.equals(this.documents, documentPretranslateResponse.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isPretranslating, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPretranslateResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPretranslating: ").append(toIndentedString(isPretranslating)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

