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
import java.util.ArrayList;
import java.util.List;

/**
 * A Memory is a collection of parallel (source/target) segments from which a MT/TM model is trained. When a translator confirms a segment in the Interface, a parallel segment is added to the Memory. Parallel segments from existing translation memories and bitexts can also be added to the Memory via the REST API. 
 */
@ApiModel(description = "A Memory is a collection of parallel (source/target) segments from which a MT/TM model is trained. When a translator confirms a segment in the Interface, a parallel segment is added to the Memory. Parallel segments from existing translation memories and bitexts can also be added to the Memory via the REST API. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:28:23.720Z[GMT]")
public class Memory {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SRCLANG = "srclang";
  @SerializedName(SERIALIZED_NAME_SRCLANG)
  private String srclang;

  public static final String SERIALIZED_NAME_TRGLANG = "trglang";
  @SerializedName(SERIALIZED_NAME_TRGLANG)
  private String trglang;

  public static final String SERIALIZED_NAME_SRCLOCALE = "srclocale";
  @SerializedName(SERIALIZED_NAME_SRCLOCALE)
  private String srclocale;

  public static final String SERIALIZED_NAME_TRGLOCALE = "trglocale";
  @SerializedName(SERIALIZED_NAME_TRGLOCALE)
  private String trglocale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_PROCESSING = "is_processing";
  @SerializedName(SERIALIZED_NAME_IS_PROCESSING)
  private Boolean isProcessing;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Integer updatedAt;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<String> resources = null;


  public Memory id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique number identifying the Memory.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "A unique number identifying the Memory.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Memory srclang(String srclang) {
    
    this.srclang = srclang;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return srclang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "An ISO 639-1 language identifier.")

  public String getSrclang() {
    return srclang;
  }


  public void setSrclang(String srclang) {
    this.srclang = srclang;
  }


  public Memory trglang(String trglang) {
    
    this.trglang = trglang;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return trglang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fr", value = "An ISO 639-1 language identifier.")

  public String getTrglang() {
    return trglang;
  }


  public void setTrglang(String trglang) {
    this.trglang = trglang;
  }


  public Memory srclocale(String srclocale) {
    
    this.srclocale = srclocale;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return srclocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "An ISO 639-1 language identifier.")

  public String getSrclocale() {
    return srclocale;
  }


  public void setSrclocale(String srclocale) {
    this.srclocale = srclocale;
  }


  public Memory trglocale(String trglocale) {
    
    this.trglocale = trglocale;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return trglocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FR", value = "An ISO 639-1 language identifier.")

  public String getTrglocale() {
    return trglocale;
  }


  public void setTrglocale(String trglocale) {
    this.trglocale = trglocale;
  }


  public Memory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the Memory.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Acme Corp Support Content", value = "A name for the Memory.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Memory isProcessing(Boolean isProcessing) {
    
    this.isProcessing = isProcessing;
    return this;
  }

   /**
   * Indicates the memory is being processed.
   * @return isProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates the memory is being processed.")

  public Boolean getIsProcessing() {
    return isProcessing;
  }


  public void setIsProcessing(Boolean isProcessing) {
    this.isProcessing = isProcessing;
  }


  public Memory version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the Memory, which is the number of updates since the memory was created.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "78", value = "The current version of the Memory, which is the number of updates since the memory was created.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public Memory createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1489147692", value = "Time at which the object was created. Measured in seconds since the Unix epoch.")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public Memory updatedAt(Integer updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1489147692", value = "Time at which the object was created. Measured in seconds since the Unix epoch.")

  public Integer getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Memory resources(List<String> resources) {
    
    this.resources = resources;
    return this;
  }

  public Memory addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * The resource files (translation memories and termbases) associated with this Memory.
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The resource files (translation memories and termbases) associated with this Memory.")

  public List<String> getResources() {
    return resources;
  }


  public void setResources(List<String> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Memory memory = (Memory) o;
    return Objects.equals(this.id, memory.id) &&
        Objects.equals(this.srclang, memory.srclang) &&
        Objects.equals(this.trglang, memory.trglang) &&
        Objects.equals(this.srclocale, memory.srclocale) &&
        Objects.equals(this.trglocale, memory.trglocale) &&
        Objects.equals(this.name, memory.name) &&
        Objects.equals(this.isProcessing, memory.isProcessing) &&
        Objects.equals(this.version, memory.version) &&
        Objects.equals(this.createdAt, memory.createdAt) &&
        Objects.equals(this.updatedAt, memory.updatedAt) &&
        Objects.equals(this.resources, memory.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, srclang, trglang, srclocale, trglocale, name, isProcessing, version, createdAt, updatedAt, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    srclang: ").append(toIndentedString(srclang)).append("\n");
    sb.append("    trglang: ").append(toIndentedString(trglang)).append("\n");
    sb.append("    srclocale: ").append(toIndentedString(srclocale)).append("\n");
    sb.append("    trglocale: ").append(toIndentedString(trglocale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isProcessing: ").append(toIndentedString(isProcessing)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

