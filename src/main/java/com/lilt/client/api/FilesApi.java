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
import com.lilt.client.model.FileDeleteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private ApiClient localVarApiClient;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteFile
     * @param id A unique File identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFileCall(Integer id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/files";

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
    private okhttp3.Call deleteFileValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteFile(Async)");
        }
        

        okhttp3.Call localVarCall = deleteFileCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete a File
     * Delete a File.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  
     * @param id A unique File identifier. (required)
     * @return FileDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public FileDeleteResponse deleteFile(Integer id) throws ApiException {
        ApiResponse<FileDeleteResponse> localVarResp = deleteFileWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Delete a File
     * Delete a File.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  
     * @param id A unique File identifier. (required)
     * @return ApiResponse&lt;FileDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileDeleteResponse> deleteFileWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = deleteFileValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<FileDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a File (asynchronously)
     * Delete a File.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  
     * @param id A unique File identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFileAsync(Integer id, final ApiCallback<FileDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFileValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<FileDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFiles
     * @param id A unique File identifier. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of files. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> File deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFilesCall(Integer id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/files";

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
    private okhttp3.Call getFilesValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFilesCall(id, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a File
     * Retrieves one or more files available to your user. Files are not associated with a project or a memory. They are unprocessed and can be used later in the project/document creation workflow step.  To retrieve a specific file, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all files, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;
     * @param id A unique File identifier. (optional)
     * @return List&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of files. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> File deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public List<java.io.File> getFiles(Integer id) throws ApiException {
        ApiResponse<List<java.io.File>> localVarResp = getFilesWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Retrieve a File
     * Retrieves one or more files available to your user. Files are not associated with a project or a memory. They are unprocessed and can be used later in the project/document creation workflow step.  To retrieve a specific file, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all files, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;
     * @param id A unique File identifier. (optional)
     * @return ApiResponse&lt;List&lt;java.io.File&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of files. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> File deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<java.io.File>> getFilesWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = getFilesValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<List<java.io.File>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a File (asynchronously)
     * Retrieves one or more files available to your user. Files are not associated with a project or a memory. They are unprocessed and can be used later in the project/document creation workflow step.  To retrieve a specific file, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all files, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;
     * @param id A unique File identifier. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of files. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> File deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFilesAsync(Integer id, final ApiCallback<List<java.io.File>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFilesValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<List<java.io.File>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadFile
     * @param name A file name. (required)
     * @param body The file contents to be uploaded. The entire POST body will be treated as the file. (required)
     * @param exportUri A webhook endpoint that will export the translated document back to the source repository. (optional)
     * @param fileHash A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn&#39;t provided. (optional)
     * @param langId Flag indicating whether to perform language detection on the uploaded file. Default is false. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A File object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadFileCall(String name, String body, String exportUri, String fileHash, Boolean langId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (exportUri != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("export_uri", exportUri));
        }

        if (fileHash != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("file_hash", fileHash));
        }

        if (langId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("langId", langId));
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
            "application/octet-stream"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadFileValidateBeforeCall(String name, String body, String exportUri, String fileHash, Boolean langId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling uploadFile(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling uploadFile(Async)");
        }
        

        okhttp3.Call localVarCall = uploadFileCall(name, body, exportUri, fileHash, langId, _callback);
        return localVarCall;

    }

    /**
     * Upload a File
     * Upload a File in any of the formats [documented in our knowledge base](https://support.lilt.com/hc/en-us/articles/360020816253-File-Formats). Request parameters should be passed in as query string parameters.  When uploading a file, any parameters needed to issue a request to the specified export_uri can be encoded in the export_uri itself as query parameters. Typical examples of parameters that may be required are an access token to authorize requests to a third-party HTTP API and the unique identifier of a resource available via the third-party HTTP API that corresponds to the file. An example export_uri that encodes a target resource identifier (i.e., source_id) of an associated resource behind a third party HTTP API is given in the CURL command below.  Example CURL command: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/files?key&#x3D;API_KEY&amp;name&#x3D;en_US.json&amp;export_uri&#x3D;https://example.com/export?source_id&#x3D;12345 \\   --header \&quot;Content-Type: application/octet-stream\&quot; \\   --data-binary @en_US.json &#x60;&#x60;&#x60; Calls to GET /files are used to monitor the language detection results. The API response will be augmented to include detected language and confidence score.  The language detection will complete asynchronously. Prior to completion, the &#x60;detected_lang&#x60; value will be &#x60;zxx&#x60;, the reserved ISO 639-2 code for \&quot;No linguistic content/not applicable\&quot;.  If the language can not be determined, or the detection process fails, the &#x60;detected_lang&#x60; field will return &#x60;und&#x60;, the reserved ISO 639-2 code for undetermined language, and the &#x60;detected_lang_confidence&#x60; score will be &#x60;0&#x60;.  
     * @param name A file name. (required)
     * @param body The file contents to be uploaded. The entire POST body will be treated as the file. (required)
     * @param exportUri A webhook endpoint that will export the translated document back to the source repository. (optional)
     * @param fileHash A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn&#39;t provided. (optional)
     * @param langId Flag indicating whether to perform language detection on the uploaded file. Default is false. (optional)
     * @return java.io.File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A File object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public java.io.File uploadFile(String name, String body, String exportUri, String fileHash, Boolean langId) throws ApiException {
        ApiResponse<java.io.File> localVarResp = uploadFileWithHttpInfo(name, body, exportUri, fileHash, langId);
        return localVarResp.getData();
    }

    /**
     * Upload a File
     * Upload a File in any of the formats [documented in our knowledge base](https://support.lilt.com/hc/en-us/articles/360020816253-File-Formats). Request parameters should be passed in as query string parameters.  When uploading a file, any parameters needed to issue a request to the specified export_uri can be encoded in the export_uri itself as query parameters. Typical examples of parameters that may be required are an access token to authorize requests to a third-party HTTP API and the unique identifier of a resource available via the third-party HTTP API that corresponds to the file. An example export_uri that encodes a target resource identifier (i.e., source_id) of an associated resource behind a third party HTTP API is given in the CURL command below.  Example CURL command: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/files?key&#x3D;API_KEY&amp;name&#x3D;en_US.json&amp;export_uri&#x3D;https://example.com/export?source_id&#x3D;12345 \\   --header \&quot;Content-Type: application/octet-stream\&quot; \\   --data-binary @en_US.json &#x60;&#x60;&#x60; Calls to GET /files are used to monitor the language detection results. The API response will be augmented to include detected language and confidence score.  The language detection will complete asynchronously. Prior to completion, the &#x60;detected_lang&#x60; value will be &#x60;zxx&#x60;, the reserved ISO 639-2 code for \&quot;No linguistic content/not applicable\&quot;.  If the language can not be determined, or the detection process fails, the &#x60;detected_lang&#x60; field will return &#x60;und&#x60;, the reserved ISO 639-2 code for undetermined language, and the &#x60;detected_lang_confidence&#x60; score will be &#x60;0&#x60;.  
     * @param name A file name. (required)
     * @param body The file contents to be uploaded. The entire POST body will be treated as the file. (required)
     * @param exportUri A webhook endpoint that will export the translated document back to the source repository. (optional)
     * @param fileHash A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn&#39;t provided. (optional)
     * @param langId Flag indicating whether to perform language detection on the uploaded file. Default is false. (optional)
     * @return ApiResponse&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A File object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<java.io.File> uploadFileWithHttpInfo(String name, String body, String exportUri, String fileHash, Boolean langId) throws ApiException {
        okhttp3.Call localVarCall = uploadFileValidateBeforeCall(name, body, exportUri, fileHash, langId, null);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload a File (asynchronously)
     * Upload a File in any of the formats [documented in our knowledge base](https://support.lilt.com/hc/en-us/articles/360020816253-File-Formats). Request parameters should be passed in as query string parameters.  When uploading a file, any parameters needed to issue a request to the specified export_uri can be encoded in the export_uri itself as query parameters. Typical examples of parameters that may be required are an access token to authorize requests to a third-party HTTP API and the unique identifier of a resource available via the third-party HTTP API that corresponds to the file. An example export_uri that encodes a target resource identifier (i.e., source_id) of an associated resource behind a third party HTTP API is given in the CURL command below.  Example CURL command: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/files?key&#x3D;API_KEY&amp;name&#x3D;en_US.json&amp;export_uri&#x3D;https://example.com/export?source_id&#x3D;12345 \\   --header \&quot;Content-Type: application/octet-stream\&quot; \\   --data-binary @en_US.json &#x60;&#x60;&#x60; Calls to GET /files are used to monitor the language detection results. The API response will be augmented to include detected language and confidence score.  The language detection will complete asynchronously. Prior to completion, the &#x60;detected_lang&#x60; value will be &#x60;zxx&#x60;, the reserved ISO 639-2 code for \&quot;No linguistic content/not applicable\&quot;.  If the language can not be determined, or the detection process fails, the &#x60;detected_lang&#x60; field will return &#x60;und&#x60;, the reserved ISO 639-2 code for undetermined language, and the &#x60;detected_lang_confidence&#x60; score will be &#x60;0&#x60;.  
     * @param name A file name. (required)
     * @param body The file contents to be uploaded. The entire POST body will be treated as the file. (required)
     * @param exportUri A webhook endpoint that will export the translated document back to the source repository. (optional)
     * @param fileHash A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn&#39;t provided. (optional)
     * @param langId Flag indicating whether to perform language detection on the uploaded file. Default is false. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A File object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadFileAsync(String name, String body, String exportUri, String fileHash, Boolean langId, final ApiCallback<java.io.File> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadFileValidateBeforeCall(name, body, exportUri, fileHash, langId, _callback);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
