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
import com.lilt.client.model.QARuleMatchesCustomRules;
import com.lilt.client.model.QARuleMatchesMatches;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QA rules describing the errors in the text.
 */
@ApiModel(description = "QA rules describing the errors in the text.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-20T00:13:26.792Z[GMT]")
public class QARuleMatches {
  public static final String SERIALIZED_NAME_MATCHES = "matches";
  @SerializedName(SERIALIZED_NAME_MATCHES)
  private List<QARuleMatchesMatches> matches = null;

  public static final String SERIALIZED_NAME_CUSTOM_RULES = "custom_rules";
  @SerializedName(SERIALIZED_NAME_CUSTOM_RULES)
  private List<QARuleMatchesCustomRules> customRules = null;


  public QARuleMatches matches(List<QARuleMatchesMatches> matches) {
    
    this.matches = matches;
    return this;
  }

  public QARuleMatches addMatchesItem(QARuleMatchesMatches matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<QARuleMatchesMatches>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QARuleMatchesMatches> getMatches() {
    return matches;
  }


  public void setMatches(List<QARuleMatchesMatches> matches) {
    this.matches = matches;
  }


  public QARuleMatches customRules(List<QARuleMatchesCustomRules> customRules) {
    
    this.customRules = customRules;
    return this;
  }

  public QARuleMatches addCustomRulesItem(QARuleMatchesCustomRules customRulesItem) {
    if (this.customRules == null) {
      this.customRules = new ArrayList<QARuleMatchesCustomRules>();
    }
    this.customRules.add(customRulesItem);
    return this;
  }

   /**
   * Get customRules
   * @return customRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QARuleMatchesCustomRules> getCustomRules() {
    return customRules;
  }


  public void setCustomRules(List<QARuleMatchesCustomRules> customRules) {
    this.customRules = customRules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QARuleMatches qaRuleMatches = (QARuleMatches) o;
    return Objects.equals(this.matches, qaRuleMatches.matches) &&
        Objects.equals(this.customRules, qaRuleMatches.customRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches, customRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QARuleMatches {\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    customRules: ").append(toIndentedString(customRules)).append("\n");
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

