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
import com.lilt.model.QARuleMatchesRuleCategory;
import com.lilt.model.QARuleMatchesRuleUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QARuleMatchesRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-24T09:28:10.400208-07:00[America/Los_Angeles]")
public class QARuleMatchesRule {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private QARuleMatchesRuleCategory category;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUE_TYPE = "issueType";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE)
  private String issueType;

  public static final String SERIALIZED_NAME_SUB_ID = "subId";
  @SerializedName(SERIALIZED_NAME_SUB_ID)
  private String subId;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<QARuleMatchesRuleUrls> urls = null;


  public QARuleMatchesRule category(QARuleMatchesRuleCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")

  public QARuleMatchesRuleCategory getCategory() {
    return category;
  }


  public void setCategory(QARuleMatchesRuleCategory category) {
    this.category = category;
  }


  public QARuleMatchesRule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Possible spelling mistake", required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QARuleMatchesRule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An rule&#39;s identifier that&#39;s unique for this language.
   * @return id
  **/
  @ApiModelProperty(example = "MORFOLOGIK_RULE_EN_US", required = true, value = "An rule's identifier that's unique for this language.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public QARuleMatchesRule issueType(String issueType) {
    
    this.issueType = issueType;
    return this;
  }

   /**
   * The Localization Quality Issue Type. This is not defined for all languages, in which case it will always be &#39;Uncategorized&#39;.
   * @return issueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "misspelling", value = "The Localization Quality Issue Type. This is not defined for all languages, in which case it will always be 'Uncategorized'.")

  public String getIssueType() {
    return issueType;
  }


  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }


  public QARuleMatchesRule subId(String subId) {
    
    this.subId = subId;
    return this;
  }

   /**
   * An optional sub identifier of the rule, used when several rules are grouped.
   * @return subId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "An optional sub identifier of the rule, used when several rules are grouped.")

  public String getSubId() {
    return subId;
  }


  public void setSubId(String subId) {
    this.subId = subId;
  }


  public QARuleMatchesRule urls(List<QARuleMatchesRuleUrls> urls) {
    
    this.urls = urls;
    return this;
  }

  public QARuleMatchesRule addUrlsItem(QARuleMatchesRuleUrls urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<QARuleMatchesRuleUrls>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * An optional array of URLs with a more detailed description of the error.
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "An optional array of URLs with a more detailed description of the error.")

  public List<QARuleMatchesRuleUrls> getUrls() {
    return urls;
  }


  public void setUrls(List<QARuleMatchesRuleUrls> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QARuleMatchesRule qaRuleMatchesRule = (QARuleMatchesRule) o;
    return Objects.equals(this.category, qaRuleMatchesRule.category) &&
        Objects.equals(this.description, qaRuleMatchesRule.description) &&
        Objects.equals(this.id, qaRuleMatchesRule.id) &&
        Objects.equals(this.issueType, qaRuleMatchesRule.issueType) &&
        Objects.equals(this.subId, qaRuleMatchesRule.subId) &&
        Objects.equals(this.urls, qaRuleMatchesRule.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, id, issueType, subId, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QARuleMatchesRule {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    subId: ").append(toIndentedString(subId)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

