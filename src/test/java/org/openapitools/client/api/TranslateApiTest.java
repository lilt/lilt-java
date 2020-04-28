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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.TranslateRegisterResponse;
import org.openapitools.client.model.TranslationList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TranslateApi
 */
@Ignore
public class TranslateApiTest {

    private final TranslateApi api = new TranslateApi();

    
    /**
     * Register a segment
     *
     * Register a source string for interactive translation. The &#x60;source_hash&#x60; value that is returned by this request is required by the &#x60;prefix&#x60; parameter for the translation endpoint. The maximum source length is 5,000 characters. Usage charges apply to this endpoint for production REST API keys.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerSegmentTest() throws ApiException {
        String source = null;
        String srclang = null;
        String trglang = null;
        TranslateRegisterResponse response = api.registerSegment(source, srclang, trglang);

        // TODO: test validations
    }
    
    /**
     * Translate a segment
     *
     * Translate a source string.  Setting the &#x60;rich&#x60; parameter to &#x60;true&#x60; will change the response format to include additional information about each translation including a model score, word alignments,  and formatting information. The rich format can be seen in the example response on this page.  By default, this endpoint also returns translation memory (TM) fuzzy matches, along with associated scores. Fuzzy matches always appear ahead of machine translation output in the response.  The maximum source length is 5,000 characters.  Usage charges apply to this endpoint for production REST API keys.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translateSegmentTest() throws ApiException {
        Integer memoryId = null;
        String source = null;
        Integer sourceHash = null;
        String prefix = null;
        Integer n = null;
        Boolean rich = null;
        Boolean tmMatches = null;
        Boolean projectTags = null;
        TranslationList response = api.translateSegment(memoryId, source, sourceHash, prefix, n, rich, tmMatches, projectTags);

        // TODO: test validations
    }
    
}
