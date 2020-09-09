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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lilt.client.model.QARuleMatchesContext;
import com.lilt.client.model.QARuleMatchesReplacements;
import com.lilt.client.model.QARuleMatchesRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for QARuleMatchesMatches
 */
public class QARuleMatchesMatchesTest {
    private final QARuleMatchesMatches model = new QARuleMatchesMatches();

    /**
     * Model tests for QARuleMatchesMatches
     */
    @Test
    public void testQARuleMatchesMatches() {
        // TODO: test QARuleMatchesMatches
    }

    /**
     * Test the property 'context'
     */
    @Test
    public void contextTest() {
        // TODO: test context
    }

    /**
     * Test the property 'length'
     */
    @Test
    public void lengthTest() {
        // TODO: test length
    }

    /**
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
        // TODO: test message
    }

    /**
     * Test the property 'offset'
     */
    @Test
    public void offsetTest() {
        // TODO: test offset
    }

    /**
     * Test the property 'replacements'
     */
    @Test
    public void replacementsTest() {
        // TODO: test replacements
    }

    /**
     * Test the property 'rule'
     */
    @Test
    public void ruleTest() {
        // TODO: test rule
    }

    /**
     * Test the property 'shortMessage'
     */
    @Test
    public void shortMessageTest() {
        // TODO: test shortMessage
    }

}