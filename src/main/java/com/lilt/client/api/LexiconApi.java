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


package com.lilt.client.api;

import com.lilt.client.ApiCallback;
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.ApiResponse;
import com.lilt.client.Configuration;
import com.lilt.client.Pair;
import com.lilt.client.ProgressRequestBody;
import com.lilt.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.lilt.client.model.LexiconUpdateParameters;
import com.lilt.client.model.LexiconUpdateResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LexiconApi {
    private ApiClient localVarApiClient;

    public LexiconApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LexiconApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for queryLexicon
     * @param memoryId A unique Memory identifier. (required)
     * @param srclang An ISO 639-1 language code. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param query The query term. (required)
     * @param n The maximum number of results to return. (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of LexiconEntry objects. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryLexiconCall(Integer memoryId, String srclang, String trglang, String query, Integer n, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lexicon";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (memoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("memory_id", memoryId));
        }

        if (srclang != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("srclang", srclang));
        }

        if (trglang != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("trglang", trglang));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

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
    private okhttp3.Call queryLexiconValidateBeforeCall(Integer memoryId, String srclang, String trglang, String query, Integer n, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'memoryId' is set
        if (memoryId == null) {
            throw new ApiException("Missing the required parameter 'memoryId' when calling queryLexicon(Async)");
        }
        
        // verify the required parameter 'srclang' is set
        if (srclang == null) {
            throw new ApiException("Missing the required parameter 'srclang' when calling queryLexicon(Async)");
        }
        
        // verify the required parameter 'trglang' is set
        if (trglang == null) {
            throw new ApiException("Missing the required parameter 'trglang' when calling queryLexicon(Async)");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling queryLexicon(Async)");
        }
        

        okhttp3.Call localVarCall = queryLexiconCall(memoryId, srclang, trglang, query, n, _callback);
        return localVarCall;

    }

    /**
     * Query a Lexicon
     * Query the Lexicon. The Lexicon is an editable termbase / concordance that is integrated with the Memory.  
     * @param memoryId A unique Memory identifier. (required)
     * @param srclang An ISO 639-1 language code. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param query The query term. (required)
     * @param n The maximum number of results to return. (optional, default to 1)
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of LexiconEntry objects. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<Object> queryLexicon(Integer memoryId, String srclang, String trglang, String query, Integer n) throws ApiException {
        ApiResponse<List<Object>> localVarResp = queryLexiconWithHttpInfo(memoryId, srclang, trglang, query, n);
        return localVarResp.getData();
    }

    /**
     * Query a Lexicon
     * Query the Lexicon. The Lexicon is an editable termbase / concordance that is integrated with the Memory.  
     * @param memoryId A unique Memory identifier. (required)
     * @param srclang An ISO 639-1 language code. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param query The query term. (required)
     * @param n The maximum number of results to return. (optional, default to 1)
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of LexiconEntry objects. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Object>> queryLexiconWithHttpInfo(Integer memoryId, String srclang, String trglang, String query, Integer n) throws ApiException {
        okhttp3.Call localVarCall = queryLexiconValidateBeforeCall(memoryId, srclang, trglang, query, n, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Query a Lexicon (asynchronously)
     * Query the Lexicon. The Lexicon is an editable termbase / concordance that is integrated with the Memory.  
     * @param memoryId A unique Memory identifier. (required)
     * @param srclang An ISO 639-1 language code. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param query The query term. (required)
     * @param n The maximum number of results to return. (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of LexiconEntry objects. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryLexiconAsync(Integer memoryId, String srclang, String trglang, String query, Integer n, final ApiCallback<List<Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryLexiconValidateBeforeCall(memoryId, srclang, trglang, query, n, _callback);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateLexicon
     * @param body  (required)
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
    public okhttp3.Call updateLexiconCall(LexiconUpdateParameters body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/lexicon";

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
    private okhttp3.Call updateLexiconValidateBeforeCall(LexiconUpdateParameters body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateLexicon(Async)");
        }
        

        okhttp3.Call localVarCall = updateLexiconCall(body, _callback);
        return localVarCall;

    }

    /**
     * Update a Lexicon
     * Update the Lexicon (Termbase as displayed in the ui) with a new term. The maximum source length is 250 characters.  
     * @param body  (required)
     * @return LexiconUpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public LexiconUpdateResponse updateLexicon(LexiconUpdateParameters body) throws ApiException {
        ApiResponse<LexiconUpdateResponse> localVarResp = updateLexiconWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Update a Lexicon
     * Update the Lexicon (Termbase as displayed in the ui) with a new term. The maximum source length is 250 characters.  
     * @param body  (required)
     * @return ApiResponse&lt;LexiconUpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LexiconUpdateResponse> updateLexiconWithHttpInfo(LexiconUpdateParameters body) throws ApiException {
        okhttp3.Call localVarCall = updateLexiconValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<LexiconUpdateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a Lexicon (asynchronously)
     * Update the Lexicon (Termbase as displayed in the ui) with a new term. The maximum source length is 250 characters.  
     * @param body  (required)
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
    public okhttp3.Call updateLexiconAsync(LexiconUpdateParameters body, final ApiCallback<LexiconUpdateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateLexiconValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<LexiconUpdateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
