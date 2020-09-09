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


import com.lilt.client.model.Error;
import com.lilt.client.model.QARuleMatches;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QaApi {
    private ApiClient localVarApiClient;

    public QaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QaApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for qaCheck
     * @param target A target string to be checked. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param source An optional source string. (optional)
     * @param srclang An ISO 639-1 language code. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A QARuleMatches object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qaCheckCall(String target, String trglang, String source, String srclang, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/qa";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (target != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target", target));
        }

        if (trglang != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("trglang", trglang));
        }

        if (source != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("source", source));
        }

        if (srclang != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("srclang", srclang));
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
    private okhttp3.Call qaCheckValidateBeforeCall(String target, String trglang, String source, String srclang, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'target' is set
        if (target == null) {
            throw new ApiException("Missing the required parameter 'target' when calling qaCheck(Async)");
        }
        
        // verify the required parameter 'trglang' is set
        if (trglang == null) {
            throw new ApiException("Missing the required parameter 'trglang' when calling qaCheck(Async)");
        }
        

        okhttp3.Call localVarCall = qaCheckCall(target, trglang, source, srclang, _callback);
        return localVarCall;

    }

    /**
     * Perform QA check
     * Perform QA checks on a target string. Optionally, you can specify a source string for additional bilingual checks, e.g. number consistency. 
     * @param target A target string to be checked. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param source An optional source string. (optional)
     * @param srclang An ISO 639-1 language code. (optional)
     * @return QARuleMatches
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A QARuleMatches object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public QARuleMatches qaCheck(String target, String trglang, String source, String srclang) throws ApiException {
        ApiResponse<QARuleMatches> localVarResp = qaCheckWithHttpInfo(target, trglang, source, srclang);
        return localVarResp.getData();
    }

    /**
     * Perform QA check
     * Perform QA checks on a target string. Optionally, you can specify a source string for additional bilingual checks, e.g. number consistency. 
     * @param target A target string to be checked. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param source An optional source string. (optional)
     * @param srclang An ISO 639-1 language code. (optional)
     * @return ApiResponse&lt;QARuleMatches&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A QARuleMatches object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QARuleMatches> qaCheckWithHttpInfo(String target, String trglang, String source, String srclang) throws ApiException {
        okhttp3.Call localVarCall = qaCheckValidateBeforeCall(target, trglang, source, srclang, null);
        Type localVarReturnType = new TypeToken<QARuleMatches>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Perform QA check (asynchronously)
     * Perform QA checks on a target string. Optionally, you can specify a source string for additional bilingual checks, e.g. number consistency. 
     * @param target A target string to be checked. (required)
     * @param trglang An ISO 639-1 language code. (required)
     * @param source An optional source string. (optional)
     * @param srclang An ISO 639-1 language code. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A QARuleMatches object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call qaCheckAsync(String target, String trglang, String source, String srclang, final ApiCallback<QARuleMatches> _callback) throws ApiException {

        okhttp3.Call localVarCall = qaCheckValidateBeforeCall(target, trglang, source, srclang, _callback);
        Type localVarReturnType = new TypeToken<QARuleMatches>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}