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

/**
 * CreateConverterConfigParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-20T00:13:26.792Z[GMT]")
public class CreateConverterConfigParameters {
  public static final String SERIALIZED_NAME_CONFIG_JSON = "configJson";
  @SerializedName(SERIALIZED_NAME_CONFIG_JSON)
  private String configJson;

  public static final String SERIALIZED_NAME_CONFIG_NAME = "configName";
  @SerializedName(SERIALIZED_NAME_CONFIG_NAME)
  private String configName;

  public static final String SERIALIZED_NAME_CONFIG_DESCRIPTION = "configDescription";
  @SerializedName(SERIALIZED_NAME_CONFIG_DESCRIPTION)
  private String configDescription;


  public CreateConverterConfigParameters configJson(String configJson) {
    
    this.configJson = configJson;
    return this;
  }

   /**
   * The configuration json blob, string escaped.
   * @return configJson
  **/
  @ApiModelProperty(example = "{\"registry\": {\".md\": {\"type\": \"OkapiFprm\", \"version\": 1, \"filterName\": \"okf_markdown\", \"filterConfig\": \"#v1\\nuseCodeFinder.b=false\\ntranslateUrls.b=true\\nurlToTranslatePattern=.+\\ntranslateCodeBlocks.b=false\\ntranslateInlineCodeBlocks.b=true\\ntranslateHeaderMetadata.b=true\\ntranslateImageAltText.b=true\\nuseLinkSubflow.b=true\\ncodeFinderRules.count.i=1\\ncodeFinderRules.rule0=\\\\{\\\\{[^}]+\\\\}\\\\}\\ncodeFinderRules.sample={{#test}} handle bar test {{/test}}$0a${{stand-alone handle bar}}$0a$\\ncodeFinderRules.useAllRulesWhenTesting.b=true\\n\", \"extractAllTags\": true, \"exportReplacements\": {\"patterns\": [], \"replacements\": []}, \"importReplacements\": {\"patterns\": [], \"replacements\": []}}}", required = true, value = "The configuration json blob, string escaped.")

  public String getConfigJson() {
    return configJson;
  }


  public void setConfigJson(String configJson) {
    this.configJson = configJson;
  }


  public CreateConverterConfigParameters configName(String configName) {
    
    this.configName = configName;
    return this;
  }

   /**
   * The user defined name of your configuration.
   * @return configName
  **/
  @ApiModelProperty(example = "my_config", required = true, value = "The user defined name of your configuration.")

  public String getConfigName() {
    return configName;
  }


  public void setConfigName(String configName) {
    this.configName = configName;
  }


  public CreateConverterConfigParameters configDescription(String configDescription) {
    
    this.configDescription = configDescription;
    return this;
  }

   /**
   * A description for the configuration.
   * @return configDescription
  **/
  @ApiModelProperty(example = "config for custom markdown escaping", required = true, value = "A description for the configuration.")

  public String getConfigDescription() {
    return configDescription;
  }


  public void setConfigDescription(String configDescription) {
    this.configDescription = configDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConverterConfigParameters createConverterConfigParameters = (CreateConverterConfigParameters) o;
    return Objects.equals(this.configJson, createConverterConfigParameters.configJson) &&
        Objects.equals(this.configName, createConverterConfigParameters.configName) &&
        Objects.equals(this.configDescription, createConverterConfigParameters.configDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configJson, configName, configDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConverterConfigParameters {\n");
    sb.append("    configJson: ").append(toIndentedString(configJson)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configDescription: ").append(toIndentedString(configDescription)).append("\n");
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

