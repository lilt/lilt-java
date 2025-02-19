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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TranslateSegmentBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:18:58.249Z[GMT]")
public class TranslateSegmentBody {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_MEMORY_ID = "memory_id";
  @SerializedName(SERIALIZED_NAME_MEMORY_ID)
  private Integer memoryId;

  public static final String SERIALIZED_NAME_SOURCE_HASH = "source_hash";
  @SerializedName(SERIALIZED_NAME_SOURCE_HASH)
  private Integer sourceHash;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private Integer n;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_RICH = "rich";
  @SerializedName(SERIALIZED_NAME_RICH)
  private Boolean rich = false;

  public static final String SERIALIZED_NAME_TM_MATCHES = "tm_matches";
  @SerializedName(SERIALIZED_NAME_TM_MATCHES)
  private Boolean tmMatches = true;

  public static final String SERIALIZED_NAME_PROJECT_TAGS = "project_tags";
  @SerializedName(SERIALIZED_NAME_PROJECT_TAGS)
  private Boolean projectTags = false;

  public static final String SERIALIZED_NAME_CONTAINS_I_C_U_DATA = "containsICUData";
  @SerializedName(SERIALIZED_NAME_CONTAINS_I_C_U_DATA)
  private Boolean containsICUData = false;


  public TranslateSegmentBody source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * A unique Segment identifier.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique Segment identifier.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public TranslateSegmentBody memoryId(Integer memoryId) {
    
    this.memoryId = memoryId;
    return this;
  }

   /**
   * A unique Memory identifier.
   * @return memoryId
  **/
  @ApiModelProperty(required = true, value = "A unique Memory identifier.")

  public Integer getMemoryId() {
    return memoryId;
  }


  public void setMemoryId(Integer memoryId) {
    this.memoryId = memoryId;
  }


  public TranslateSegmentBody sourceHash(Integer sourceHash) {
    
    this.sourceHash = sourceHash;
    return this;
  }

   /**
   * A source hash code.
   * @return sourceHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A source hash code.")

  public Integer getSourceHash() {
    return sourceHash;
  }


  public void setSourceHash(Integer sourceHash) {
    this.sourceHash = sourceHash;
  }


  public TranslateSegmentBody n(Integer n) {
    
    this.n = n;
    return this;
  }

   /**
   * Return top n translations (deprecated).
   * @return n
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return top n translations (deprecated).")

  public Integer getN() {
    return n;
  }


  public void setN(Integer n) {
    this.n = n;
  }


  public TranslateSegmentBody prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * A target prefix
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A target prefix")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public TranslateSegmentBody rich(Boolean rich) {
    
    this.rich = rich;
    return this;
  }

   /**
   * Returns rich translation information (e.g., with word alignments).
   * @return rich
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns rich translation information (e.g., with word alignments).")

  public Boolean getRich() {
    return rich;
  }


  public void setRich(Boolean rich) {
    this.rich = rich;
  }


  public TranslateSegmentBody tmMatches(Boolean tmMatches) {
    
    this.tmMatches = tmMatches;
    return this;
  }

   /**
   * Include translation memory fuzzy matches.
   * @return tmMatches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include translation memory fuzzy matches.")

  public Boolean getTmMatches() {
    return tmMatches;
  }


  public void setTmMatches(Boolean tmMatches) {
    this.tmMatches = tmMatches;
  }


  public TranslateSegmentBody projectTags(Boolean projectTags) {
    
    this.projectTags = projectTags;
    return this;
  }

   /**
   * Project tags. Projects tags in source to target if set to true.
   * @return projectTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Project tags. Projects tags in source to target if set to true.")

  public Boolean getProjectTags() {
    return projectTags;
  }


  public void setProjectTags(Boolean projectTags) {
    this.projectTags = projectTags;
  }


  public TranslateSegmentBody containsICUData(Boolean containsICUData) {
    
    this.containsICUData = containsICUData;
    return this;
  }

   /**
   * Contains ICU data. If true then tags in the source following the ICU standard will be parsed and retained.
   * @return containsICUData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains ICU data. If true then tags in the source following the ICU standard will be parsed and retained.")

  public Boolean getContainsICUData() {
    return containsICUData;
  }


  public void setContainsICUData(Boolean containsICUData) {
    this.containsICUData = containsICUData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateSegmentBody translateSegmentBody = (TranslateSegmentBody) o;
    return Objects.equals(this.source, translateSegmentBody.source) &&
        Objects.equals(this.memoryId, translateSegmentBody.memoryId) &&
        Objects.equals(this.sourceHash, translateSegmentBody.sourceHash) &&
        Objects.equals(this.n, translateSegmentBody.n) &&
        Objects.equals(this.prefix, translateSegmentBody.prefix) &&
        Objects.equals(this.rich, translateSegmentBody.rich) &&
        Objects.equals(this.tmMatches, translateSegmentBody.tmMatches) &&
        Objects.equals(this.projectTags, translateSegmentBody.projectTags) &&
        Objects.equals(this.containsICUData, translateSegmentBody.containsICUData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, memoryId, sourceHash, n, prefix, rich, tmMatches, projectTags, containsICUData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateSegmentBody {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    memoryId: ").append(toIndentedString(memoryId)).append("\n");
    sb.append("    sourceHash: ").append(toIndentedString(sourceHash)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    rich: ").append(toIndentedString(rich)).append("\n");
    sb.append("    tmMatches: ").append(toIndentedString(tmMatches)).append("\n");
    sb.append("    projectTags: ").append(toIndentedString(projectTags)).append("\n");
    sb.append("    containsICUData: ").append(toIndentedString(containsICUData)).append("\n");
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

