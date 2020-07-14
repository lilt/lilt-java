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
import com.lilt.model.Comment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for SegmentWithComments
 */
public class SegmentWithCommentsTest {
    private final SegmentWithComments model = new SegmentWithComments();

    /**
     * Model tests for SegmentWithComments
     */
    @Test
    public void testSegmentWithComments() {
        // TODO: test SegmentWithComments
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'documentId'
     */
    @Test
    public void documentIdTest() {
        // TODO: test documentId
    }

    /**
     * Test the property 'memoryId'
     */
    @Test
    public void memoryIdTest() {
        // TODO: test memoryId
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'srclang'
     */
    @Test
    public void srclangTest() {
        // TODO: test srclang
    }

    /**
     * Test the property 'target'
     */
    @Test
    public void targetTest() {
        // TODO: test target
    }

    /**
     * Test the property 'trglang'
     */
    @Test
    public void trglangTest() {
        // TODO: test trglang
    }

    /**
     * Test the property 'isConfirmed'
     */
    @Test
    public void isConfirmedTest() {
        // TODO: test isConfirmed
    }

    /**
     * Test the property 'isReviewed'
     */
    @Test
    public void isReviewedTest() {
        // TODO: test isReviewed
    }

    /**
     * Test the property 'comments'
     */
    @Test
    public void commentsTest() {
        // TODO: test comments
    }

}
