/*
 * Lilt REST API
 * Lilt REST API Support: https://lilt.atlassian.net/servicedesk/customer/portals    The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:   * Training of and translating with interactive, adaptive machine translation   * Large-scale translation memory   * The Lexicon (a large-scale termbase)   * Programmatic control of the Lilt CAT environment   * Translation memory synchronization  Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests.  The base url for this REST API is `https://api.lilt.com/`.  ## Authentication  Requests are authenticated via REST API key, which requires the Business plan.  Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.  For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.  ## Quotas  Our services have a general quota of 4000 requests per minute. Should you hit the maximum requests per minute, you will need to wait 60 seconds before you can send another request. 
 *
 * The version of the OpenAPI document: v3.0
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
 * SDLXLIFFFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T22:57:19.235Z[GMT]")
public class SDLXLIFFFilter {
  /**
   * the current state of the SDLXLIFF Trans Unit.
   */
  @JsonAdapter(ConfNameEnum.Adapter.class)
  public enum ConfNameEnum {
    TRANSLATED("Translated"),
    
    DRAFT("Draft"),
    
    APPROVEDTRANSLATION("ApprovedTranslation"),
    
    LOCKED("Locked"),
    
    SIGNEDOFF("SignedOff");

    private String value;

    ConfNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfNameEnum fromValue(String value) {
      for (ConfNameEnum b : ConfNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConfNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConfNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONF_NAME = "confName";
  @SerializedName(SERIALIZED_NAME_CONF_NAME)
  private ConfNameEnum confName;

  public static final String SERIALIZED_NAME_ALLOWABLE_PERCENTAGE = "allowablePercentage";
  @SerializedName(SERIALIZED_NAME_ALLOWABLE_PERCENTAGE)
  private Integer allowablePercentage;

  public static final String SERIALIZED_NAME_ALLOW_UNLOCKED_SEGMENTS = "allowUnlockedSegments";
  @SerializedName(SERIALIZED_NAME_ALLOW_UNLOCKED_SEGMENTS)
  private Boolean allowUnlockedSegments;


  public SDLXLIFFFilter confName(ConfNameEnum confName) {
    
    this.confName = confName;
    return this;
  }

   /**
   * the current state of the SDLXLIFF Trans Unit.
   * @return confName
  **/
  @ApiModelProperty(required = true, value = "the current state of the SDLXLIFF Trans Unit.")

  public ConfNameEnum getConfName() {
    return confName;
  }


  public void setConfName(ConfNameEnum confName) {
    this.confName = confName;
  }


  public SDLXLIFFFilter allowablePercentage(Integer allowablePercentage) {
    
    this.allowablePercentage = allowablePercentage;
    return this;
  }

   /**
   * This represents for the current conf_name what percentage the filter applies to.  If you pass -1 it will take any value for this field and won&#39;t ignore blank values. If you pass 50, Lilt will only import Segments that have a 50 percent match or better.
   * @return allowablePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This represents for the current conf_name what percentage the filter applies to.  If you pass -1 it will take any value for this field and won't ignore blank values. If you pass 50, Lilt will only import Segments that have a 50 percent match or better.")

  public Integer getAllowablePercentage() {
    return allowablePercentage;
  }


  public void setAllowablePercentage(Integer allowablePercentage) {
    this.allowablePercentage = allowablePercentage;
  }


  public SDLXLIFFFilter allowUnlockedSegments(Boolean allowUnlockedSegments) {
    
    this.allowUnlockedSegments = allowUnlockedSegments;
    return this;
  }

   /**
   * Boolean that tells Lilt whether we should allow unlocked Segments for this conf_name.
   * @return allowUnlockedSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean that tells Lilt whether we should allow unlocked Segments for this conf_name.")

  public Boolean getAllowUnlockedSegments() {
    return allowUnlockedSegments;
  }


  public void setAllowUnlockedSegments(Boolean allowUnlockedSegments) {
    this.allowUnlockedSegments = allowUnlockedSegments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDLXLIFFFilter sdLXLIFFFilter = (SDLXLIFFFilter) o;
    return Objects.equals(this.confName, sdLXLIFFFilter.confName) &&
        Objects.equals(this.allowablePercentage, sdLXLIFFFilter.allowablePercentage) &&
        Objects.equals(this.allowUnlockedSegments, sdLXLIFFFilter.allowUnlockedSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confName, allowablePercentage, allowUnlockedSegments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDLXLIFFFilter {\n");
    sb.append("    confName: ").append(toIndentedString(confName)).append("\n");
    sb.append("    allowablePercentage: ").append(toIndentedString(allowablePercentage)).append("\n");
    sb.append("    allowUnlockedSegments: ").append(toIndentedString(allowUnlockedSegments)).append("\n");
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

