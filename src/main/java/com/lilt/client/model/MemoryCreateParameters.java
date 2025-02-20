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
 * MemoryCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:28:02.795Z[GMT]")
public class MemoryCreateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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


  public MemoryCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the Memory.
   * @return name
  **/
  @ApiModelProperty(example = "automotive", required = true, value = "A name for the Memory.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MemoryCreateParameters srclang(String srclang) {
    
    this.srclang = srclang;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return srclang
  **/
  @ApiModelProperty(example = "en", required = true, value = "An ISO 639-1 language identifier.")

  public String getSrclang() {
    return srclang;
  }


  public void setSrclang(String srclang) {
    this.srclang = srclang;
  }


  public MemoryCreateParameters trglang(String trglang) {
    
    this.trglang = trglang;
    return this;
  }

   /**
   * An ISO 639-1 language identifier.
   * @return trglang
  **/
  @ApiModelProperty(example = "fr", required = true, value = "An ISO 639-1 language identifier.")

  public String getTrglang() {
    return trglang;
  }


  public void setTrglang(String trglang) {
    this.trglang = trglang;
  }


  public MemoryCreateParameters srclocale(String srclocale) {
    
    this.srclocale = srclocale;
    return this;
  }

   /**
   * An ISO 3166-1 region name for language locales
   * @return srclocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "An ISO 3166-1 region name for language locales")

  public String getSrclocale() {
    return srclocale;
  }


  public void setSrclocale(String srclocale) {
    this.srclocale = srclocale;
  }


  public MemoryCreateParameters trglocale(String trglocale) {
    
    this.trglocale = trglocale;
    return this;
  }

   /**
   * An ISO 3166-1 region name for language locales
   * @return trglocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FR", value = "An ISO 3166-1 region name for language locales")

  public String getTrglocale() {
    return trglocale;
  }


  public void setTrglocale(String trglocale) {
    this.trglocale = trglocale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoryCreateParameters memoryCreateParameters = (MemoryCreateParameters) o;
    return Objects.equals(this.name, memoryCreateParameters.name) &&
        Objects.equals(this.srclang, memoryCreateParameters.srclang) &&
        Objects.equals(this.trglang, memoryCreateParameters.trglang) &&
        Objects.equals(this.srclocale, memoryCreateParameters.srclocale) &&
        Objects.equals(this.trglocale, memoryCreateParameters.trglocale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, srclang, trglang, srclocale, trglocale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoryCreateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    srclang: ").append(toIndentedString(srclang)).append("\n");
    sb.append("    trglang: ").append(toIndentedString(trglang)).append("\n");
    sb.append("    srclocale: ").append(toIndentedString(srclocale)).append("\n");
    sb.append("    trglocale: ").append(toIndentedString(trglocale)).append("\n");
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

