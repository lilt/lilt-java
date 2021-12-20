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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A machine translation (MT) or a translation memory (TM) match of a source segment.
 */
@ApiModel(description = "A machine translation (MT) or a translation memory (TM) match of a source segment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-20T00:13:26.792Z[GMT]")
public class Translation {
  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TARGET_WITH_TAGS = "targetWithTags";
  @SerializedName(SERIALIZED_NAME_TARGET_WITH_TAGS)
  private String targetWithTags;

  public static final String SERIALIZED_NAME_ALIGN = "align";
  @SerializedName(SERIALIZED_NAME_ALIGN)
  private String align;

  public static final String SERIALIZED_NAME_PROVENANCE = "provenance";
  @SerializedName(SERIALIZED_NAME_PROVENANCE)
  private String provenance;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public static final String SERIALIZED_NAME_IS_T_M_MATCH = "isTMMatch";
  @SerializedName(SERIALIZED_NAME_IS_T_M_MATCH)
  private Boolean isTMMatch;

  public static final String SERIALIZED_NAME_TARGET_DELIMITERS = "targetDelimiters";
  @SerializedName(SERIALIZED_NAME_TARGET_DELIMITERS)
  private List<String> targetDelimiters = null;

  public static final String SERIALIZED_NAME_TARGET_WORDS = "targetWords";
  @SerializedName(SERIALIZED_NAME_TARGET_WORDS)
  private List<String> targetWords = null;


  public Translation target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target string.
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target string.")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Translation targetWithTags(String targetWithTags) {
    
    this.targetWithTags = targetWithTags;
    return this;
  }

   /**
   * The target string with source tags projected into the target.
   * @return targetWithTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target string with source tags projected into the target.")

  public String getTargetWithTags() {
    return targetWithTags;
  }


  public void setTargetWithTags(String targetWithTags) {
    this.targetWithTags = targetWithTags;
  }


  public Translation align(String align) {
    
    this.align = align;
    return this;
  }

   /**
   * \&quot;MT only: A whitespace delimited list of source-target alignment indices.\&quot; 
   * @return align
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "\"MT only: A whitespace delimited list of source-target alignment indices.\" ")

  public String getAlign() {
    return align;
  }


  public void setAlign(String align) {
    this.align = align;
  }


  public Translation provenance(String provenance) {
    
    this.provenance = provenance;
    return this;
  }

   /**
   * Positive values indicate that the word is from the Memory, with contiguous identical entries (e.g., 2 2) indicating phrase matches. Negative contiguous values indicate entries from the Lexicon. 0 indicates a word from the background data. 
   * @return provenance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Positive values indicate that the word is from the Memory, with contiguous identical entries (e.g., 2 2) indicating phrase matches. Negative contiguous values indicate entries from the Lexicon. 0 indicates a word from the background data. ")

  public String getProvenance() {
    return provenance;
  }


  public void setProvenance(String provenance) {
    this.provenance = provenance;
  }


  public Translation score(BigDecimal score) {
    
    this.score = score;
    return this;
  }

   /**
   * The score of the translation.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The score of the translation.")

  public BigDecimal getScore() {
    return score;
  }


  public void setScore(BigDecimal score) {
    this.score = score;
  }


  public Translation isTMMatch(Boolean isTMMatch) {
    
    this.isTMMatch = isTMMatch;
    return this;
  }

   /**
   * TM only: If true, indicates an exact translation memory match.
   * @return isTMMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TM only: If true, indicates an exact translation memory match.")

  public Boolean getIsTMMatch() {
    return isTMMatch;
  }


  public void setIsTMMatch(Boolean isTMMatch) {
    this.isTMMatch = isTMMatch;
  }


  public Translation targetDelimiters(List<String> targetDelimiters) {
    
    this.targetDelimiters = targetDelimiters;
    return this;
  }

  public Translation addTargetDelimitersItem(String targetDelimitersItem) {
    if (this.targetDelimiters == null) {
      this.targetDelimiters = new ArrayList<String>();
    }
    this.targetDelimiters.add(targetDelimitersItem);
    return this;
  }

   /**
   * A format string that indicates, for each word, if the word should be preceded by a space.
   * @return targetDelimiters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A format string that indicates, for each word, if the word should be preceded by a space.")

  public List<String> getTargetDelimiters() {
    return targetDelimiters;
  }


  public void setTargetDelimiters(List<String> targetDelimiters) {
    this.targetDelimiters = targetDelimiters;
  }


  public Translation targetWords(List<String> targetWords) {
    
    this.targetWords = targetWords;
    return this;
  }

  public Translation addTargetWordsItem(String targetWordsItem) {
    if (this.targetWords == null) {
      this.targetWords = new ArrayList<String>();
    }
    this.targetWords.add(targetWordsItem);
    return this;
  }

   /**
   * The target string can be constructed by suffixing each &#x60;targetDelimiters&#x60; entry with its corresponding word in &#x60;targetWords&#x60; and concatenating the constructed array. Please note that the &#x60;targetDelimiters&#x60; array has one more entry than &#x60;targetWords&#x60; array which is why the last entry in the array will be the last value of &#x60;targetDelimiters&#x60;. 
   * @return targetWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target string can be constructed by suffixing each `targetDelimiters` entry with its corresponding word in `targetWords` and concatenating the constructed array. Please note that the `targetDelimiters` array has one more entry than `targetWords` array which is why the last entry in the array will be the last value of `targetDelimiters`. ")

  public List<String> getTargetWords() {
    return targetWords;
  }


  public void setTargetWords(List<String> targetWords) {
    this.targetWords = targetWords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Translation translation = (Translation) o;
    return Objects.equals(this.target, translation.target) &&
        Objects.equals(this.targetWithTags, translation.targetWithTags) &&
        Objects.equals(this.align, translation.align) &&
        Objects.equals(this.provenance, translation.provenance) &&
        Objects.equals(this.score, translation.score) &&
        Objects.equals(this.isTMMatch, translation.isTMMatch) &&
        Objects.equals(this.targetDelimiters, translation.targetDelimiters) &&
        Objects.equals(this.targetWords, translation.targetWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, targetWithTags, align, provenance, score, isTMMatch, targetDelimiters, targetWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Translation {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetWithTags: ").append(toIndentedString(targetWithTags)).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    isTMMatch: ").append(toIndentedString(isTMMatch)).append("\n");
    sb.append("    targetDelimiters: ").append(toIndentedString(targetDelimiters)).append("\n");
    sb.append("    targetWords: ").append(toIndentedString(targetWords)).append("\n");
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

