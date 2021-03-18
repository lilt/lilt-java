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
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentPretranslateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T22:45:01.186Z[GMT]")
public class DocumentPretranslateParameters {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private List<Integer> id = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_AUTO_ACCEPT = "auto_accept";
  @SerializedName(SERIALIZED_NAME_AUTO_ACCEPT)
  private Boolean autoAccept;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "case_sensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private Boolean caseSensitive;

  public static final String SERIALIZED_NAME_ATTRIBUTE_TO_CREATOR = "attribute_to_creator";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_TO_CREATOR)
  private Boolean attributeToCreator;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;


  public DocumentPretranslateParameters id(List<Integer> id) {
    
    this.id = id;
    return this;
  }

  public DocumentPretranslateParameters addIdItem(Integer idItem) {
    this.id.add(idItem);
    return this;
  }

   /**
   * A list of unique Document identifiers.
   * @return id
  **/
  @ApiModelProperty(example = "[123, 234]", required = true, value = "A list of unique Document identifiers.")

  public List<Integer> getId() {
    return id;
  }


  public void setId(List<Integer> id) {
    this.id = id;
  }


  public DocumentPretranslateParameters autoAccept(Boolean autoAccept) {
    
    this.autoAccept = autoAccept;
    return this;
  }

   /**
   * Optional parameter for auto-accepting 100% TM hits.
   * @return autoAccept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Optional parameter for auto-accepting 100% TM hits.")

  public Boolean getAutoAccept() {
    return autoAccept;
  }


  public void setAutoAccept(Boolean autoAccept) {
    this.autoAccept = autoAccept;
  }


  public DocumentPretranslateParameters caseSensitive(Boolean caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Optional for using case matching against TM hits..
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Optional for using case matching against TM hits..")

  public Boolean getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public DocumentPretranslateParameters attributeToCreator(Boolean attributeToCreator) {
    
    this.attributeToCreator = attributeToCreator;
    return this;
  }

   /**
   * Optional parameter for attributing translation authorship of exact matches to document creator.
   * @return attributeToCreator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Optional parameter for attributing translation authorship of exact matches to document creator.")

  public Boolean getAttributeToCreator() {
    return attributeToCreator;
  }


  public void setAttributeToCreator(Boolean attributeToCreator) {
    this.attributeToCreator = attributeToCreator;
  }


  public DocumentPretranslateParameters mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * An optional parameter indicating how the document will be pretranslated.  The accepted values are &#x60;tm&#x60;, or &#x60;tm+mt&#x60;. Default is &#x60;tm&#x60;. 
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tm+mt", value = "An optional parameter indicating how the document will be pretranslated.  The accepted values are `tm`, or `tm+mt`. Default is `tm`. ")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPretranslateParameters documentPretranslateParameters = (DocumentPretranslateParameters) o;
    return Objects.equals(this.id, documentPretranslateParameters.id) &&
        Objects.equals(this.autoAccept, documentPretranslateParameters.autoAccept) &&
        Objects.equals(this.caseSensitive, documentPretranslateParameters.caseSensitive) &&
        Objects.equals(this.attributeToCreator, documentPretranslateParameters.attributeToCreator) &&
        Objects.equals(this.mode, documentPretranslateParameters.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, autoAccept, caseSensitive, attributeToCreator, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPretranslateParameters {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    autoAccept: ").append(toIndentedString(autoAccept)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    attributeToCreator: ").append(toIndentedString(attributeToCreator)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

