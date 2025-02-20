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
 * CreateConverterConfigParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T17:55:18.443Z[GMT]")
public class CreateConverterConfigParameters {
  public static final String SERIALIZED_NAME_SIGNED_AGREEMENT = "signedAgreement";
  @SerializedName(SERIALIZED_NAME_SIGNED_AGREEMENT)
  private Boolean signedAgreement;


  public CreateConverterConfigParameters signedAgreement(Boolean signedAgreement) {
    
    this.signedAgreement = signedAgreement;
    return this;
  }

   /**
   * Signifies that the Organization has signed the agreement or not.
   * @return signedAgreement
  **/
  @ApiModelProperty(required = true, value = "Signifies that the Organization has signed the agreement or not.")

  public Boolean getSignedAgreement() {
    return signedAgreement;
  }


  public void setSignedAgreement(Boolean signedAgreement) {
    this.signedAgreement = signedAgreement;
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
    return Objects.equals(this.signedAgreement, createConverterConfigParameters.signedAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConverterConfigParameters {\n");
    sb.append("    signedAgreement: ").append(toIndentedString(signedAgreement)).append("\n");
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

