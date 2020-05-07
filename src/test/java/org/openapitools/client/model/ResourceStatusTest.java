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


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ResourceStatus
 */
public class ResourceStatusTest {
    private final ResourceStatus model = new ResourceStatus();

    /**
     * Model tests for ResourceStatus
     */
    @Test
    public void testResourceStatus() {
        // TODO: test ResourceStatus
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'numWordsConfirmed'
     */
    @Test
    public void numWordsConfirmedTest() {
        // TODO: test numWordsConfirmed
    }

    /**
     * Test the property 'numWordsNew'
     */
    @Test
    public void numWordsNewTest() {
        // TODO: test numWordsNew
    }

    /**
     * Test the property 'numWordsFuzzy'
     */
    @Test
    public void numWordsFuzzyTest() {
        // TODO: test numWordsFuzzy
    }

    /**
     * Test the property 'numWordsExact'
     */
    @Test
    public void numWordsExactTest() {
        // TODO: test numWordsExact
    }

    /**
     * Test the property 'numWordsReviewed'
     */
    @Test
    public void numWordsReviewedTest() {
        // TODO: test numWordsReviewed
    }

    /**
     * Test the property 'timeElapsed'
     */
    @Test
    public void timeElapsedTest() {
        // TODO: test timeElapsed
    }

    /**
     * Test the property 'timeElapsedTranslation'
     */
    @Test
    public void timeElapsedTranslationTest() {
        // TODO: test timeElapsedTranslation
    }

    /**
     * Test the property 'timeElapsedResearch'
     */
    @Test
    public void timeElapsedResearchTest() {
        // TODO: test timeElapsedResearch
    }

    /**
     * Test the property 'timeElapsedReview'
     */
    @Test
    public void timeElapsedReviewTest() {
        // TODO: test timeElapsedReview
    }

    /**
     * Test the property 'numSegmentsConfirmed'
     */
    @Test
    public void numSegmentsConfirmedTest() {
        // TODO: test numSegmentsConfirmed
    }

    /**
     * Test the property 'numSegmentsReviewed'
     */
    @Test
    public void numSegmentsReviewedTest() {
        // TODO: test numSegmentsReviewed
    }

}
