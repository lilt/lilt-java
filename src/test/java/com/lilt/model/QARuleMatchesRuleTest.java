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


package com.lilt.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lilt.model.QARuleMatchesRuleCategory;
import com.lilt.model.QARuleMatchesRuleUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for QARuleMatchesRule
 */
public class QARuleMatchesRuleTest {
    private final QARuleMatchesRule model = new QARuleMatchesRule();

    /**
     * Model tests for QARuleMatchesRule
     */
    @Test
    public void testQARuleMatchesRule() {
        // TODO: test QARuleMatchesRule
    }

    /**
     * Test the property 'category'
     */
    @Test
    public void categoryTest() {
        // TODO: test category
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'issueType'
     */
    @Test
    public void issueTypeTest() {
        // TODO: test issueType
    }

    /**
     * Test the property 'subId'
     */
    @Test
    public void subIdTest() {
        // TODO: test subId
    }

    /**
     * Test the property 'urls'
     */
    @Test
    public void urlsTest() {
        // TODO: test urls
    }

}
