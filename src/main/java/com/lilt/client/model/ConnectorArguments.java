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
 * ConnectorArguments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-20T00:13:26.792Z[GMT]")
public class ConnectorArguments {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Object args;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;


  public ConnectorArguments id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique Connector identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46530", value = "A unique Connector identifier.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ConnectorArguments name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of connector.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zendesk", value = "Name of connector.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConnectorArguments args(Object args) {
    
    this.args = args;
    return this;
  }

   /**
   * Connector parameters.
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Connector parameters.")

  public Object getArgs() {
    return args;
  }


  public void setArgs(Object args) {
    this.args = args;
  }


  public ConnectorArguments schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Cron string
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0 0 * * *", value = "Cron string")

  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorArguments connectorArguments = (ConnectorArguments) o;
    return Objects.equals(this.id, connectorArguments.id) &&
        Objects.equals(this.name, connectorArguments.name) &&
        Objects.equals(this.args, connectorArguments.args) &&
        Objects.equals(this.schedule, connectorArguments.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, args, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorArguments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

