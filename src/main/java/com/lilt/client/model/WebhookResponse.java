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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * WebhookResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-20T18:21:58.742Z[GMT]")
public class WebhookResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_WEBHOOK_NAME = "webhookName";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NAME)
  private String webhookName;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhookUrl";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private URI webhookUrl;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    JOB_DELIVER("JOB_DELIVER"),
    
    JOB_UPDATE("JOB_UPDATE"),
    
    PROJECT_DELIVER("PROJECT_DELIVER"),
    
    PROJECT_UPDATE("PROJECT_UPDATE");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private List<EventTypeEnum> eventType = new ArrayList<EventTypeEnum>();


  public WebhookResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the webhook configuration.
   * @return id
  **/
  @ApiModelProperty(example = "12345", required = true, value = "The unique identifier for the webhook configuration.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookResponse webhookName(String webhookName) {
    
    this.webhookName = webhookName;
    return this;
  }

   /**
   * The name of the webhook configuration.
   * @return webhookName
  **/
  @ApiModelProperty(required = true, value = "The name of the webhook configuration.")

  public String getWebhookName() {
    return webhookName;
  }


  public void setWebhookName(String webhookName) {
    this.webhookName = webhookName;
  }


  public WebhookResponse webhookUrl(URI webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The URL to which the webhook notifications will be sent.
   * @return webhookUrl
  **/
  @ApiModelProperty(required = true, value = "The URL to which the webhook notifications will be sent.")

  public URI getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(URI webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public WebhookResponse eventType(List<EventTypeEnum> eventType) {
    
    this.eventType = eventType;
    return this;
  }

  public WebhookResponse addEventTypeItem(EventTypeEnum eventTypeItem) {
    this.eventType.add(eventTypeItem);
    return this;
  }

   /**
   * The list of event types that will trigger the webhook notification.
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "The list of event types that will trigger the webhook notification.")

  public List<EventTypeEnum> getEventType() {
    return eventType;
  }


  public void setEventType(List<EventTypeEnum> eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.id, webhookResponse.id) &&
        Objects.equals(this.webhookName, webhookResponse.webhookName) &&
        Objects.equals(this.webhookUrl, webhookResponse.webhookUrl) &&
        Objects.equals(this.eventType, webhookResponse.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webhookName, webhookUrl, eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webhookName: ").append(toIndentedString(webhookName)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

