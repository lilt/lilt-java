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
import com.lilt.client.model.LexiconEntryExamples;
import com.lilt.client.model.LexiconEntryTranslations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An Lexicon entry for a source term or phrase. 
 */
@ApiModel(description = "An Lexicon entry for a source term or phrase. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-04T23:50:13.754Z[GMT]")
public class LexiconEntry {
  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private List<LexiconEntryTranslations> translations = null;

  public static final String SERIALIZED_NAME_EXAMPLES = "examples";
  @SerializedName(SERIALIZED_NAME_EXAMPLES)
  private List<LexiconEntryExamples> examples = null;


  public LexiconEntry translations(List<LexiconEntryTranslations> translations) {
    
    this.translations = translations;
    return this;
  }

  public LexiconEntry addTranslationsItem(LexiconEntryTranslations translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<LexiconEntryTranslations>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * A list of translations for the query term.
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "A list of translations for the query term.")

  public List<LexiconEntryTranslations> getTranslations() {
    return translations;
  }


  public void setTranslations(List<LexiconEntryTranslations> translations) {
    this.translations = translations;
  }


  public LexiconEntry examples(List<LexiconEntryExamples> examples) {
    
    this.examples = examples;
    return this;
  }

  public LexiconEntry addExamplesItem(LexiconEntryExamples examplesItem) {
    if (this.examples == null) {
      this.examples = new ArrayList<LexiconEntryExamples>();
    }
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * A list of concordance examples for the query term.
   * @return examples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of concordance examples for the query term.")

  public List<LexiconEntryExamples> getExamples() {
    return examples;
  }


  public void setExamples(List<LexiconEntryExamples> examples) {
    this.examples = examples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexiconEntry lexiconEntry = (LexiconEntry) o;
    return Objects.equals(this.translations, lexiconEntry.translations) &&
        Objects.equals(this.examples, lexiconEntry.examples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translations, examples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexiconEntry {\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
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

