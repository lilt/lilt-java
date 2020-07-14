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
 * TranslateRegisterResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-13T16:57:35.902304-07:00[America/Los_Angeles]")
public class TranslateRegisterResponse {
  public static final String SERIALIZED_NAME_SOURCE_HASH = "source_hash";
  @SerializedName(SERIALIZED_NAME_SOURCE_HASH)
  private Integer sourceHash;

  public static final String SERIALIZED_NAME_NUM_WORDS = "num_words";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS)
  private Integer numWords;


  public TranslateRegisterResponse sourceHash(Integer sourceHash) {
    
    this.sourceHash = sourceHash;
    return this;
  }

   /**
   * A unique source token required by the &#x60;prefix&#x60; parameter for translation requests.
   * @return sourceHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11476", value = "A unique source token required by the `prefix` parameter for translation requests.")

  public Integer getSourceHash() {
    return sourceHash;
  }


  public void setSourceHash(Integer sourceHash) {
    this.sourceHash = sourceHash;
  }


  public TranslateRegisterResponse numWords(Integer numWords) {
    
    this.numWords = numWords;
    return this;
  }

   /**
   * The number of billed words in the segment.
   * @return numWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88", value = "The number of billed words in the segment.")

  public Integer getNumWords() {
    return numWords;
  }


  public void setNumWords(Integer numWords) {
    this.numWords = numWords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateRegisterResponse translateRegisterResponse = (TranslateRegisterResponse) o;
    return Objects.equals(this.sourceHash, translateRegisterResponse.sourceHash) &&
        Objects.equals(this.numWords, translateRegisterResponse.numWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceHash, numWords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateRegisterResponse {\n");
    sb.append("    sourceHash: ").append(toIndentedString(sourceHash)).append("\n");
    sb.append("    numWords: ").append(toIndentedString(numWords)).append("\n");
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

