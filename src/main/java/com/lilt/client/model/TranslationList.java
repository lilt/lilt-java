/*
 * Lilt REST API
 * Lilt REST API Support: https://lilt.atlassian.net/servicedesk/customer/portals    The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:   * Training of and translating with interactive, adaptive machine translation   * Large-scale translation memory   * The Lexicon (a large-scale termbase)   * Programmatic control of the Lilt CAT environment   * Translation memory synchronization  Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests.  The base url for this REST API is `https://api.lilt.com/`.  ## Authentication  Requests are authenticated via REST API key, which requires the Business plan.  Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.  For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.  ## Quotas  Our services have a general quota of 4000 requests per minute. Should you hit the maximum requests per minute, you will need to wait 60 seconds before you can send another request. 
 *
 * The version of the OpenAPI document: v3.0.1
 * 
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
import com.lilt.client.model.Translation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An ranked list of translations and associated metadata.
 */
@ApiModel(description = "An ranked list of translations and associated metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:18:58.249Z[GMT]")
public class TranslationList {
  public static final String SERIALIZED_NAME_UNTOKENIZED_SOURCE = "untokenizedSource";
  @SerializedName(SERIALIZED_NAME_UNTOKENIZED_SOURCE)
  private String untokenizedSource;

  public static final String SERIALIZED_NAME_TOKENIZED_SOURCE = "tokenizedSource";
  @SerializedName(SERIALIZED_NAME_TOKENIZED_SOURCE)
  private String tokenizedSource;

  public static final String SERIALIZED_NAME_SOURCE_DELIMITERS = "sourceDelimiters";
  @SerializedName(SERIALIZED_NAME_SOURCE_DELIMITERS)
  private List<String> sourceDelimiters = null;

  public static final String SERIALIZED_NAME_TRANSLATION = "translation";
  @SerializedName(SERIALIZED_NAME_TRANSLATION)
  private List<Translation> translation = null;


  public TranslationList untokenizedSource(String untokenizedSource) {
    
    this.untokenizedSource = untokenizedSource;
    return this;
  }

   /**
   * The untokenized source segment. Punctuation has not been separated from words.
   * @return untokenizedSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Authentication not required.", value = "The untokenized source segment. Punctuation has not been separated from words.")

  public String getUntokenizedSource() {
    return untokenizedSource;
  }


  public void setUntokenizedSource(String untokenizedSource) {
    this.untokenizedSource = untokenizedSource;
  }


  public TranslationList tokenizedSource(String tokenizedSource) {
    
    this.tokenizedSource = tokenizedSource;
    return this;
  }

   /**
   * The tokenized source segment. Punctuation has been separated from words.
   * @return tokenizedSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Authentication not required .", value = "The tokenized source segment. Punctuation has been separated from words.")

  public String getTokenizedSource() {
    return tokenizedSource;
  }


  public void setTokenizedSource(String tokenizedSource) {
    this.tokenizedSource = tokenizedSource;
  }


  public TranslationList sourceDelimiters(List<String> sourceDelimiters) {
    
    this.sourceDelimiters = sourceDelimiters;
    return this;
  }

  public TranslationList addSourceDelimitersItem(String sourceDelimitersItem) {
    if (this.sourceDelimiters == null) {
      this.sourceDelimiters = new ArrayList<String>();
    }
    this.sourceDelimiters.add(sourceDelimitersItem);
    return this;
  }

   /**
   * A format string that indicates, for each word, if the word should be preceded by a space.
   * @return sourceDelimiters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"\",\" \",\" \",\"\",\"\"]", value = "A format string that indicates, for each word, if the word should be preceded by a space.")

  public List<String> getSourceDelimiters() {
    return sourceDelimiters;
  }


  public void setSourceDelimiters(List<String> sourceDelimiters) {
    this.sourceDelimiters = sourceDelimiters;
  }


  public TranslationList translation(List<Translation> translation) {
    
    this.translation = translation;
    return this;
  }

  public TranslationList addTranslationItem(Translation translationItem) {
    if (this.translation == null) {
      this.translation = new ArrayList<Translation>();
    }
    this.translation.add(translationItem);
    return this;
  }

   /**
   * A list of Translation objects.
   * @return translation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Translation objects.")

  public List<Translation> getTranslation() {
    return translation;
  }


  public void setTranslation(List<Translation> translation) {
    this.translation = translation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationList translationList = (TranslationList) o;
    return Objects.equals(this.untokenizedSource, translationList.untokenizedSource) &&
        Objects.equals(this.tokenizedSource, translationList.tokenizedSource) &&
        Objects.equals(this.sourceDelimiters, translationList.sourceDelimiters) &&
        Objects.equals(this.translation, translationList.translation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(untokenizedSource, tokenizedSource, sourceDelimiters, translation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationList {\n");
    sb.append("    untokenizedSource: ").append(toIndentedString(untokenizedSource)).append("\n");
    sb.append("    tokenizedSource: ").append(toIndentedString(tokenizedSource)).append("\n");
    sb.append("    sourceDelimiters: ").append(toIndentedString(sourceDelimiters)).append("\n");
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
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

