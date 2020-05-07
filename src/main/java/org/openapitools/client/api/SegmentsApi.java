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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Error;
import org.openapitools.client.model.Segment;
import org.openapitools.client.model.SegmentCreateParameters;
import org.openapitools.client.model.SegmentDeleteResponse;
import org.openapitools.client.model.SegmentUpdateParameters;
import org.openapitools.client.model.TaggedSegment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SegmentsApi {
    private ApiClient localVarApiClient;

    public SegmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SegmentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createSegment
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSegmentCall(SegmentCreateParameters body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/segments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSegmentValidateBeforeCall(SegmentCreateParameters body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSegment(Async)");
        }
        

        okhttp3.Call localVarCall = createSegmentCall(body, _callback);
        return localVarCall;

    }

    /**
     * Create a Segment
     * Create a Segment and add it to a Memory. A Segment is a source/target pair that is used to train the machine translation system and populate the translation memory. This is not intended to be used on documents and will throw an error.  The maximum source length is 5,000 characters.  
     * @param body  (required)
     * @return Segment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Segment createSegment(SegmentCreateParameters body) throws ApiException {
        ApiResponse<Segment> localVarResp = createSegmentWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Create a Segment
     * Create a Segment and add it to a Memory. A Segment is a source/target pair that is used to train the machine translation system and populate the translation memory. This is not intended to be used on documents and will throw an error.  The maximum source length is 5,000 characters.  
     * @param body  (required)
     * @return ApiResponse&lt;Segment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Segment> createSegmentWithHttpInfo(SegmentCreateParameters body) throws ApiException {
        okhttp3.Call localVarCall = createSegmentValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Segment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a Segment (asynchronously)
     * Create a Segment and add it to a Memory. A Segment is a source/target pair that is used to train the machine translation system and populate the translation memory. This is not intended to be used on documents and will throw an error.  The maximum source length is 5,000 characters.  
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSegmentAsync(SegmentCreateParameters body, final ApiCallback<Segment> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSegmentValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Segment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSegment
     * @param id A unique Segment identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSegmentCall(Integer id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/segments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSegmentValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteSegment(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSegmentCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete a Segment
     * Delete a Segment from memory. This will not delete a segment from a document. 
     * @param id A unique Segment identifier. (required)
     * @return SegmentDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public SegmentDeleteResponse deleteSegment(Integer id) throws ApiException {
        ApiResponse<SegmentDeleteResponse> localVarResp = deleteSegmentWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Delete a Segment
     * Delete a Segment from memory. This will not delete a segment from a document. 
     * @param id A unique Segment identifier. (required)
     * @return ApiResponse&lt;SegmentDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SegmentDeleteResponse> deleteSegmentWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = deleteSegmentValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<SegmentDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a Segment (asynchronously)
     * Delete a Segment from memory. This will not delete a segment from a document. 
     * @param id A unique Segment identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSegmentAsync(Integer id, final ApiCallback<SegmentDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSegmentValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<SegmentDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSegment
     * @param id A unique Segment identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSegmentCall(Integer id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/segments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSegmentValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSegment(Async)");
        }
        

        okhttp3.Call localVarCall = getSegmentCall(id, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a Segment
     * Retrieve a Segment.  
     * @param id A unique Segment identifier. (required)
     * @return Segment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Segment getSegment(Integer id) throws ApiException {
        ApiResponse<Segment> localVarResp = getSegmentWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Retrieve a Segment
     * Retrieve a Segment.  
     * @param id A unique Segment identifier. (required)
     * @return ApiResponse&lt;Segment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Segment> getSegmentWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = getSegmentValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Segment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a Segment (asynchronously)
     * Retrieve a Segment.  
     * @param id A unique Segment identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSegmentAsync(Integer id, final ApiCallback<Segment> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSegmentValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Segment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for tagSegment
     * @param sourceTagged The tagged source string. (required)
     * @param target The target string. (required)
     * @param memoryId A unique Memory identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TaggedSegment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tagSegmentCall(String sourceTagged, String target, Integer memoryId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/segments/tag";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (sourceTagged != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("source_tagged", sourceTagged));
        }

        if (target != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target", target));
        }

        if (memoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("memory_id", memoryId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tagSegmentValidateBeforeCall(String sourceTagged, String target, Integer memoryId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sourceTagged' is set
        if (sourceTagged == null) {
            throw new ApiException("Missing the required parameter 'sourceTagged' when calling tagSegment(Async)");
        }
        
        // verify the required parameter 'target' is set
        if (target == null) {
            throw new ApiException("Missing the required parameter 'target' when calling tagSegment(Async)");
        }
        
        // verify the required parameter 'memoryId' is set
        if (memoryId == null) {
            throw new ApiException("Missing the required parameter 'memoryId' when calling tagSegment(Async)");
        }
        

        okhttp3.Call localVarCall = tagSegmentCall(sourceTagged, target, memoryId, _callback);
        return localVarCall;

    }

    /**
     * Tag a Segment
     * Project tags for a segment. The &#x60;source_tagged&#x60; string contains one or more SGML tags. The &#x60;target&#x60; string is untagged. This endpoint will automatically place the source tags in the target.  Usage charges apply to this endpoint for production REST API keys.  
     * @param sourceTagged The tagged source string. (required)
     * @param target The target string. (required)
     * @param memoryId A unique Memory identifier. (required)
     * @return TaggedSegment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TaggedSegment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public TaggedSegment tagSegment(String sourceTagged, String target, Integer memoryId) throws ApiException {
        ApiResponse<TaggedSegment> localVarResp = tagSegmentWithHttpInfo(sourceTagged, target, memoryId);
        return localVarResp.getData();
    }

    /**
     * Tag a Segment
     * Project tags for a segment. The &#x60;source_tagged&#x60; string contains one or more SGML tags. The &#x60;target&#x60; string is untagged. This endpoint will automatically place the source tags in the target.  Usage charges apply to this endpoint for production REST API keys.  
     * @param sourceTagged The tagged source string. (required)
     * @param target The target string. (required)
     * @param memoryId A unique Memory identifier. (required)
     * @return ApiResponse&lt;TaggedSegment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TaggedSegment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaggedSegment> tagSegmentWithHttpInfo(String sourceTagged, String target, Integer memoryId) throws ApiException {
        okhttp3.Call localVarCall = tagSegmentValidateBeforeCall(sourceTagged, target, memoryId, null);
        Type localVarReturnType = new TypeToken<TaggedSegment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Tag a Segment (asynchronously)
     * Project tags for a segment. The &#x60;source_tagged&#x60; string contains one or more SGML tags. The &#x60;target&#x60; string is untagged. This endpoint will automatically place the source tags in the target.  Usage charges apply to this endpoint for production REST API keys.  
     * @param sourceTagged The tagged source string. (required)
     * @param target The target string. (required)
     * @param memoryId A unique Memory identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TaggedSegment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tagSegmentAsync(String sourceTagged, String target, Integer memoryId, final ApiCallback<TaggedSegment> _callback) throws ApiException {

        okhttp3.Call localVarCall = tagSegmentValidateBeforeCall(sourceTagged, target, memoryId, _callback);
        Type localVarReturnType = new TypeToken<TaggedSegment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSegment
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSegmentCall(SegmentUpdateParameters body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/segments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateSegmentValidateBeforeCall(SegmentUpdateParameters body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateSegment(Async)");
        }
        

        okhttp3.Call localVarCall = updateSegmentCall(body, _callback);
        return localVarCall;

    }

    /**
     * Update a Segment
     * Update a Segment in memory. The Memory will be updated with the new target string.  
     * @param body  (required)
     * @return Segment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Segment updateSegment(SegmentUpdateParameters body) throws ApiException {
        ApiResponse<Segment> localVarResp = updateSegmentWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Update a Segment
     * Update a Segment in memory. The Memory will be updated with the new target string.  
     * @param body  (required)
     * @return ApiResponse&lt;Segment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Segment> updateSegmentWithHttpInfo(SegmentUpdateParameters body) throws ApiException {
        okhttp3.Call localVarCall = updateSegmentValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Segment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a Segment (asynchronously)
     * Update a Segment in memory. The Memory will be updated with the new target string.  
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A Segment object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSegmentAsync(SegmentUpdateParameters body, final ApiCallback<Segment> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSegmentValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Segment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
