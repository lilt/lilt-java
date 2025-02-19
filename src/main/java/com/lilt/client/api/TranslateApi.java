/*
 * Lilt REST API
 * Lilt REST API Support: https://lilt.atlassian.net/servicedesk/customer/portals    The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:   * Training of and translating with interactive, adaptive machine translation   * Large-scale translation memory   * The Lexicon (a large-scale termbase)   * Programmatic control of the Lilt CAT environment   * Translation memory synchronization  Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests.  The base url for this REST API is `https://api.lilt.com/`.  ## Authentication  Requests are authenticated via REST API key, which requires the Business plan.  Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.  For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.  ## Quotas  Our services have a general quota of 4000 requests per minute. Should you hit the maximum requests per minute, you will need to wait 60 seconds before you can send another request. 
 *
 * The version of the OpenAPI document: v3.0
 * 
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


import java.math.BigDecimal;
import com.lilt.client.model.Error;
import com.lilt.client.model.TranslateSegmentBody;
import com.lilt.client.model.TranslationInfo;
import com.lilt.client.model.TranslationList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranslateApi {
    private ApiClient localVarApiClient;

    public TranslateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TranslateApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for batchTranslateFile
     * @param fileId List of File ids to be translated, comma separated. (required)
     * @param memoryId Id of Memory to use in translation. (required)
     * @param configId An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file. (optional)
     * @param withTM An optional boolean parameter to toggle the use of Translation Memory in the translation of the file. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchTranslateFileCall(String fileId, String memoryId, BigDecimal configId, Boolean withTM, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/translate/file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fileId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fileId", fileId));
        }

        if (memoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("memoryId", memoryId));
        }

        if (configId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("configId", configId));
        }

        if (withTM != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("withTM", withTM));
        }

        final String[] localVarAccepts = {
            "application/json", "application/octet-stream", "text/plain"
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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchTranslateFileValidateBeforeCall(String fileId, String memoryId, BigDecimal configId, Boolean withTM, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling batchTranslateFile(Async)");
        }
        
        // verify the required parameter 'memoryId' is set
        if (memoryId == null) {
            throw new ApiException("Missing the required parameter 'memoryId' when calling batchTranslateFile(Async)");
        }
        

        okhttp3.Call localVarCall = batchTranslateFileCall(fileId, memoryId, configId, withTM, _callback);
        return localVarCall;

    }

    /**
     * Translate a File
     * Start machine translation of one or more Files that have previously been uploaded.  The response will include an &#x60;id&#x60; parameter that can be used to monitor and download the translations in subsequent calls.  Example CURL: &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;fileId&#x3D;583&amp;memoryId&#x3D;2495&amp;configId&#x3D;123&amp;withTM&#x3D;true&#39; &#x60;&#x60;&#x60;  
     * @param fileId List of File ids to be translated, comma separated. (required)
     * @param memoryId Id of Memory to use in translation. (required)
     * @param configId An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file. (optional)
     * @param withTM An optional boolean parameter to toggle the use of Translation Memory in the translation of the file. (optional)
     * @return List&lt;TranslationInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<TranslationInfo> batchTranslateFile(String fileId, String memoryId, BigDecimal configId, Boolean withTM) throws ApiException {
        ApiResponse<List<TranslationInfo>> localVarResp = batchTranslateFileWithHttpInfo(fileId, memoryId, configId, withTM);
        return localVarResp.getData();
    }

    /**
     * Translate a File
     * Start machine translation of one or more Files that have previously been uploaded.  The response will include an &#x60;id&#x60; parameter that can be used to monitor and download the translations in subsequent calls.  Example CURL: &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;fileId&#x3D;583&amp;memoryId&#x3D;2495&amp;configId&#x3D;123&amp;withTM&#x3D;true&#39; &#x60;&#x60;&#x60;  
     * @param fileId List of File ids to be translated, comma separated. (required)
     * @param memoryId Id of Memory to use in translation. (required)
     * @param configId An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file. (optional)
     * @param withTM An optional boolean parameter to toggle the use of Translation Memory in the translation of the file. (optional)
     * @return ApiResponse&lt;List&lt;TranslationInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TranslationInfo>> batchTranslateFileWithHttpInfo(String fileId, String memoryId, BigDecimal configId, Boolean withTM) throws ApiException {
        okhttp3.Call localVarCall = batchTranslateFileValidateBeforeCall(fileId, memoryId, configId, withTM, null);
        Type localVarReturnType = new TypeToken<List<TranslationInfo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Translate a File (asynchronously)
     * Start machine translation of one or more Files that have previously been uploaded.  The response will include an &#x60;id&#x60; parameter that can be used to monitor and download the translations in subsequent calls.  Example CURL: &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;fileId&#x3D;583&amp;memoryId&#x3D;2495&amp;configId&#x3D;123&amp;withTM&#x3D;true&#39; &#x60;&#x60;&#x60;  
     * @param fileId List of File ids to be translated, comma separated. (required)
     * @param memoryId Id of Memory to use in translation. (required)
     * @param configId An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file. (optional)
     * @param withTM An optional boolean parameter to toggle the use of Translation Memory in the translation of the file. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchTranslateFileAsync(String fileId, String memoryId, BigDecimal configId, Boolean withTM, final ApiCallback<List<TranslationInfo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchTranslateFileValidateBeforeCall(fileId, memoryId, configId, withTM, _callback);
        Type localVarReturnType = new TypeToken<List<TranslationInfo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for downloadFile
     * @param id A translation id. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A file. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadFileCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/translate/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        final String[] localVarAccepts = {
            "application/octet-stream", "text/plain", "application/json"
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
    private okhttp3.Call downloadFileValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling downloadFile(Async)");
        }
        

        okhttp3.Call localVarCall = downloadFileCall(id, _callback);
        return localVarCall;

    }

    /**
     * Download translated file
     * Download a translated File.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/files?key&#x3D;API_KEY&amp;id&#x3D;1&#39; &#x60;&#x60;&#x60;  
     * @param id A translation id. (required)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A file. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public byte[] downloadFile(String id) throws ApiException {
        ApiResponse<byte[]> localVarResp = downloadFileWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Download translated file
     * Download a translated File.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/files?key&#x3D;API_KEY&amp;id&#x3D;1&#39; &#x60;&#x60;&#x60;  
     * @param id A translation id. (required)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A file. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> downloadFileWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = downloadFileValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download translated file (asynchronously)
     * Download a translated File.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/files?key&#x3D;API_KEY&amp;id&#x3D;1&#39; &#x60;&#x60;&#x60;  
     * @param id A translation id. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A file. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadFileAsync(String id, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadFileValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for monitorFileTranslation
     * @param translationIds List of translation ids, comma separated (optional)
     * @param status One of the translation statuses - &#x60;InProgress&#x60;, &#x60;Completed&#x60;, &#x60;Failed&#x60;, &#x60;ReadyForDownload&#x60; (optional)
     * @param fromTime Results after this time (inclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @param toTime Results before this time (exclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call monitorFileTranslationCall(String translationIds, String status, BigDecimal fromTime, BigDecimal toTime, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/translate/file";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (translationIds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("translationIds", translationIds));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (fromTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromTime", fromTime));
        }

        if (toTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toTime", toTime));
        }

        final String[] localVarAccepts = {
            "application/json", "application/octet-stream", "text/plain"
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
    private okhttp3.Call monitorFileTranslationValidateBeforeCall(String translationIds, String status, BigDecimal fromTime, BigDecimal toTime, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = monitorFileTranslationCall(translationIds, status, fromTime, toTime, _callback);
        return localVarCall;

    }

    /**
     * Monitor file translation
     * Get information about the one or more Files that are being translated with machine translation. Query filters are optional but at least one must be provided.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;translationIds&#x3D;1,2&amp;fromTime&#x3D;1607966744&amp;toTime&#x3D;1707966744&amp;status&#x3D;InProgress&#39; &#x60;&#x60;&#x60;  
     * @param translationIds List of translation ids, comma separated (optional)
     * @param status One of the translation statuses - &#x60;InProgress&#x60;, &#x60;Completed&#x60;, &#x60;Failed&#x60;, &#x60;ReadyForDownload&#x60; (optional)
     * @param fromTime Results after this time (inclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @param toTime Results before this time (exclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @return List&lt;TranslationInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public List<TranslationInfo> monitorFileTranslation(String translationIds, String status, BigDecimal fromTime, BigDecimal toTime) throws ApiException {
        ApiResponse<List<TranslationInfo>> localVarResp = monitorFileTranslationWithHttpInfo(translationIds, status, fromTime, toTime);
        return localVarResp.getData();
    }

    /**
     * Monitor file translation
     * Get information about the one or more Files that are being translated with machine translation. Query filters are optional but at least one must be provided.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;translationIds&#x3D;1,2&amp;fromTime&#x3D;1607966744&amp;toTime&#x3D;1707966744&amp;status&#x3D;InProgress&#39; &#x60;&#x60;&#x60;  
     * @param translationIds List of translation ids, comma separated (optional)
     * @param status One of the translation statuses - &#x60;InProgress&#x60;, &#x60;Completed&#x60;, &#x60;Failed&#x60;, &#x60;ReadyForDownload&#x60; (optional)
     * @param fromTime Results after this time (inclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @param toTime Results before this time (exclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @return ApiResponse&lt;List&lt;TranslationInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TranslationInfo>> monitorFileTranslationWithHttpInfo(String translationIds, String status, BigDecimal fromTime, BigDecimal toTime) throws ApiException {
        okhttp3.Call localVarCall = monitorFileTranslationValidateBeforeCall(translationIds, status, fromTime, toTime, null);
        Type localVarReturnType = new TypeToken<List<TranslationInfo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Monitor file translation (asynchronously)
     * Get information about the one or more Files that are being translated with machine translation. Query filters are optional but at least one must be provided.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;translationIds&#x3D;1,2&amp;fromTime&#x3D;1607966744&amp;toTime&#x3D;1707966744&amp;status&#x3D;InProgress&#39; &#x60;&#x60;&#x60;  
     * @param translationIds List of translation ids, comma separated (optional)
     * @param status One of the translation statuses - &#x60;InProgress&#x60;, &#x60;Completed&#x60;, &#x60;Failed&#x60;, &#x60;ReadyForDownload&#x60; (optional)
     * @param fromTime Results after this time (inclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @param toTime Results before this time (exclusive) will be returned, specified as seconds since the Unix epoch. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Translation Info </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call monitorFileTranslationAsync(String translationIds, String status, BigDecimal fromTime, BigDecimal toTime, final ApiCallback<List<TranslationInfo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = monitorFileTranslationValidateBeforeCall(translationIds, status, fromTime, toTime, _callback);
        Type localVarReturnType = new TypeToken<List<TranslationInfo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for translateSegmentPost
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TranslationList object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call translateSegmentPostCall(TranslateSegmentBody body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/translate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/octet-stream", "text/plain"
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
    private okhttp3.Call translateSegmentPostValidateBeforeCall(TranslateSegmentBody body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = translateSegmentPostCall(body, _callback);
        return localVarCall;

    }

    /**
     * Translate a segment
     * Translate a source string.  Setting the &#x60;rich&#x60; parameter to &#x60;true&#x60; will change the response format to include additional information about each translation including a model score, word alignments,  and formatting information. The rich format can be seen in the example response on this page.  By default, this endpoint also returns translation memory (TM) fuzzy matches, along with associated scores. Fuzzy matches always appear ahead of machine translation output in the response.  The maximum source length is 5,000 characters.  Usage charges apply to this endpoint for production REST API keys.  
     * @param body  (optional)
     * @return TranslationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TranslationList object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public TranslationList translateSegmentPost(TranslateSegmentBody body) throws ApiException {
        ApiResponse<TranslationList> localVarResp = translateSegmentPostWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Translate a segment
     * Translate a source string.  Setting the &#x60;rich&#x60; parameter to &#x60;true&#x60; will change the response format to include additional information about each translation including a model score, word alignments,  and formatting information. The rich format can be seen in the example response on this page.  By default, this endpoint also returns translation memory (TM) fuzzy matches, along with associated scores. Fuzzy matches always appear ahead of machine translation output in the response.  The maximum source length is 5,000 characters.  Usage charges apply to this endpoint for production REST API keys.  
     * @param body  (optional)
     * @return ApiResponse&lt;TranslationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TranslationList object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TranslationList> translateSegmentPostWithHttpInfo(TranslateSegmentBody body) throws ApiException {
        okhttp3.Call localVarCall = translateSegmentPostValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<TranslationList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Translate a segment (asynchronously)
     * Translate a source string.  Setting the &#x60;rich&#x60; parameter to &#x60;true&#x60; will change the response format to include additional information about each translation including a model score, word alignments,  and formatting information. The rich format can be seen in the example response on this page.  By default, this endpoint also returns translation memory (TM) fuzzy matches, along with associated scores. Fuzzy matches always appear ahead of machine translation output in the response.  The maximum source length is 5,000 characters.  Usage charges apply to this endpoint for production REST API keys.  
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A TranslationList object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call translateSegmentPostAsync(TranslateSegmentBody body, final ApiCallback<TranslationList> _callback) throws ApiException {

        okhttp3.Call localVarCall = translateSegmentPostValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<TranslationList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
