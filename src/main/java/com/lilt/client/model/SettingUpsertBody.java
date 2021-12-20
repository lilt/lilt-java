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

/**
 * Body to create or update a setting.
 */
@ApiModel(description = "Body to create or update a setting.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-20T00:13:26.792Z[GMT]")
public class SettingUpsertBody {
  public static final String SERIALIZED_NAME_SETTING_NAME = "settingName";
  @SerializedName(SERIALIZED_NAME_SETTING_NAME)
  private String settingName;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_IS_ENFORCED = "isEnforced";
  @SerializedName(SERIALIZED_NAME_IS_ENFORCED)
  private Boolean isEnforced;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private BigDecimal projectId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private BigDecimal organizationId;


  public SettingUpsertBody settingName(String settingName) {
    
    this.settingName = settingName;
    return this;
  }

   /**
   * The name of the setting.
   * @return settingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "requireBatchQaTranslator", value = "The name of the setting.")

  public String getSettingName() {
    return settingName;
  }


  public void setSettingName(String settingName) {
    this.settingName = settingName;
  }


  public SettingUpsertBody scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The entity scope the setting should be applied to.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Organization", value = "The entity scope the setting should be applied to.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public SettingUpsertBody isEnforced(Boolean isEnforced) {
    
    this.isEnforced = isEnforced;
    return this;
  }

   /**
   * Whether this value should override others set for the same setting key. 
   * @return isEnforced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this value should override others set for the same setting key. ")

  public Boolean getIsEnforced() {
    return isEnforced;
  }


  public void setIsEnforced(Boolean isEnforced) {
    this.isEnforced = isEnforced;
  }


  public SettingUpsertBody projectId(BigDecimal projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Id of the the project the setting will be applied to. Required when scope is &#x60;Project&#x60;. 
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the the project the setting will be applied to. Required when scope is `Project`. ")

  public BigDecimal getProjectId() {
    return projectId;
  }


  public void setProjectId(BigDecimal projectId) {
    this.projectId = projectId;
  }


  public SettingUpsertBody organizationId(BigDecimal organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Id of the the project the setting will be applied to. Required when scope is &#x60;Organization&#x60;. 
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.0", value = "Id of the the project the setting will be applied to. Required when scope is `Organization`. ")

  public BigDecimal getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(BigDecimal organizationId) {
    this.organizationId = organizationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingUpsertBody settingUpsertBody = (SettingUpsertBody) o;
    return Objects.equals(this.settingName, settingUpsertBody.settingName) &&
        Objects.equals(this.scope, settingUpsertBody.scope) &&
        Objects.equals(this.isEnforced, settingUpsertBody.isEnforced) &&
        Objects.equals(this.projectId, settingUpsertBody.projectId) &&
        Objects.equals(this.organizationId, settingUpsertBody.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingName, scope, isEnforced, projectId, organizationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingUpsertBody {\n");
    sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    isEnforced: ").append(toIndentedString(isEnforced)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

