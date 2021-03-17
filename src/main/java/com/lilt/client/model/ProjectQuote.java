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
import com.lilt.client.model.DocumentQuote;
import com.lilt.client.model.MatchBand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Quoting information for a Project. 
 */
@ApiModel(description = "Quoting information for a Project. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-17T00:12:38.610Z[GMT]")
public class ProjectQuote {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NUM_SOURCE_WORDS = "num_source_words";
  @SerializedName(SERIALIZED_NAME_NUM_SOURCE_WORDS)
  private Integer numSourceWords;

  public static final String SERIALIZED_NAME_NUM_WORDS_NEW = "num_words_new";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_NEW)
  private Integer numWordsNew;

  public static final String SERIALIZED_NAME_NUM_SEGMENTS_NEW = "num_segments_new";
  @SerializedName(SERIALIZED_NAME_NUM_SEGMENTS_NEW)
  private Integer numSegmentsNew;

  public static final String SERIALIZED_NAME_NUM_WORDS_REPETITION = "num_words_repetition";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS_REPETITION)
  private Integer numWordsRepetition;

  public static final String SERIALIZED_NAME_NUM_SEGMENTS_REPETITION = "num_segments_repetition";
  @SerializedName(SERIALIZED_NAME_NUM_SEGMENTS_REPETITION)
  private Integer numSegmentsRepetition;

  public static final String SERIALIZED_NAME_BANDS = "bands";
  @SerializedName(SERIALIZED_NAME_BANDS)
  private List<MatchBand> bands = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DocumentQuote> documents = null;


  public ProjectQuote id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique Project identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21902", value = "A unique Project identifier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ProjectQuote numSourceWords(Integer numSourceWords) {
    
    this.numSourceWords = numSourceWords;
    return this;
  }

   /**
   * The number of source words in the Project.
   * @return numSourceWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8000", value = "The number of source words in the Project.")

  public Integer getNumSourceWords() {
    return numSourceWords;
  }


  public void setNumSourceWords(Integer numSourceWords) {
    this.numSourceWords = numSourceWords;
  }


  public ProjectQuote numWordsNew(Integer numWordsNew) {
    
    this.numWordsNew = numWordsNew;
    return this;
  }

   /**
   * The number of new source words in the Project.
   * @return numWordsNew
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6039", value = "The number of new source words in the Project.")

  public Integer getNumWordsNew() {
    return numWordsNew;
  }


  public void setNumWordsNew(Integer numWordsNew) {
    this.numWordsNew = numWordsNew;
  }


  public ProjectQuote numSegmentsNew(Integer numSegmentsNew) {
    
    this.numSegmentsNew = numSegmentsNew;
    return this;
  }

   /**
   * The number of new segments in the Project.
   * @return numSegmentsNew
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "151", value = "The number of new segments in the Project.")

  public Integer getNumSegmentsNew() {
    return numSegmentsNew;
  }


  public void setNumSegmentsNew(Integer numSegmentsNew) {
    this.numSegmentsNew = numSegmentsNew;
  }


  public ProjectQuote numWordsRepetition(Integer numWordsRepetition) {
    
    this.numWordsRepetition = numWordsRepetition;
    return this;
  }

   /**
   * The number of repetition source words in the Project.
   * @return numWordsRepetition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The number of repetition source words in the Project.")

  public Integer getNumWordsRepetition() {
    return numWordsRepetition;
  }


  public void setNumWordsRepetition(Integer numWordsRepetition) {
    this.numWordsRepetition = numWordsRepetition;
  }


  public ProjectQuote numSegmentsRepetition(Integer numSegmentsRepetition) {
    
    this.numSegmentsRepetition = numSegmentsRepetition;
    return this;
  }

   /**
   * The number of repetition segments in the Project.
   * @return numSegmentsRepetition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2980000", value = "The number of repetition segments in the Project.")

  public Integer getNumSegmentsRepetition() {
    return numSegmentsRepetition;
  }


  public void setNumSegmentsRepetition(Integer numSegmentsRepetition) {
    this.numSegmentsRepetition = numSegmentsRepetition;
  }


  public ProjectQuote bands(List<MatchBand> bands) {
    
    this.bands = bands;
    return this;
  }

  public ProjectQuote addBandsItem(MatchBand bandsItem) {
    if (this.bands == null) {
      this.bands = new ArrayList<MatchBand>();
    }
    this.bands.add(bandsItem);
    return this;
  }

   /**
   * A list of MatchBand objects that represent translation memory leverage statistics.
   * @return bands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of MatchBand objects that represent translation memory leverage statistics.")

  public List<MatchBand> getBands() {
    return bands;
  }


  public void setBands(List<MatchBand> bands) {
    this.bands = bands;
  }


  public ProjectQuote documents(List<DocumentQuote> documents) {
    
    this.documents = documents;
    return this;
  }

  public ProjectQuote addDocumentsItem(DocumentQuote documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DocumentQuote>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * A list of DocumentQuote objects that quotes information for a Document.
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DocumentQuote objects that quotes information for a Document.")

  public List<DocumentQuote> getDocuments() {
    return documents;
  }


  public void setDocuments(List<DocumentQuote> documents) {
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
    ProjectQuote projectQuote = (ProjectQuote) o;
    return Objects.equals(this.id, projectQuote.id) &&
        Objects.equals(this.numSourceWords, projectQuote.numSourceWords) &&
        Objects.equals(this.numWordsNew, projectQuote.numWordsNew) &&
        Objects.equals(this.numSegmentsNew, projectQuote.numSegmentsNew) &&
        Objects.equals(this.numWordsRepetition, projectQuote.numWordsRepetition) &&
        Objects.equals(this.numSegmentsRepetition, projectQuote.numSegmentsRepetition) &&
        Objects.equals(this.bands, projectQuote.bands) &&
        Objects.equals(this.documents, projectQuote.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numSourceWords, numWordsNew, numSegmentsNew, numWordsRepetition, numSegmentsRepetition, bands, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectQuote {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numSourceWords: ").append(toIndentedString(numSourceWords)).append("\n");
    sb.append("    numWordsNew: ").append(toIndentedString(numWordsNew)).append("\n");
    sb.append("    numSegmentsNew: ").append(toIndentedString(numSegmentsNew)).append("\n");
    sb.append("    numWordsRepetition: ").append(toIndentedString(numWordsRepetition)).append("\n");
    sb.append("    numSegmentsRepetition: ").append(toIndentedString(numSegmentsRepetition)).append("\n");
    sb.append("    bands: ").append(toIndentedString(bands)).append("\n");
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

