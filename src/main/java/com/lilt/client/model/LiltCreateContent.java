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
import com.lilt.client.model.LiltCreateContentPreferences;
import com.lilt.client.model.LiltCreateContentTemplateParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Content Parameters for LiltCreate. 
 */
@ApiModel(description = "Content Parameters for LiltCreate. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:18:58.249Z[GMT]")
public class LiltCreateContent {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAMS = "templateParams";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAMS)
  private LiltCreateContentTemplateParams templateParams;

  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private LiltCreateContentPreferences preferences;


  public LiltCreateContent name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the request content.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A name for the request content.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LiltCreateContent id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the generated content.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the generated content.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public LiltCreateContent language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The language of the content.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The language of the content.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public LiltCreateContent template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * The template of the content.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "The template of the content.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public LiltCreateContent templateParams(LiltCreateContentTemplateParams templateParams) {
    
    this.templateParams = templateParams;
    return this;
  }

   /**
   * Get templateParams
   * @return templateParams
  **/
  @ApiModelProperty(required = true, value = "")

  public LiltCreateContentTemplateParams getTemplateParams() {
    return templateParams;
  }


  public void setTemplateParams(LiltCreateContentTemplateParams templateParams) {
    this.templateParams = templateParams;
  }


  public LiltCreateContent preferences(LiltCreateContentPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiltCreateContentPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(LiltCreateContentPreferences preferences) {
    this.preferences = preferences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiltCreateContent liltCreateContent = (LiltCreateContent) o;
    return Objects.equals(this.name, liltCreateContent.name) &&
        Objects.equals(this.id, liltCreateContent.id) &&
        Objects.equals(this.language, liltCreateContent.language) &&
        Objects.equals(this.template, liltCreateContent.template) &&
        Objects.equals(this.templateParams, liltCreateContent.templateParams) &&
        Objects.equals(this.preferences, liltCreateContent.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, language, template, templateParams, preferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiltCreateContent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
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

