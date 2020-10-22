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


import com.lilt.client.model.Connector;
import com.lilt.client.model.ConnectorArguments;
import com.lilt.client.model.ConnectorDeleteResponse;
import com.lilt.client.model.ConnectorJob;
import com.lilt.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectorsApi {
    private ApiClient localVarApiClient;

    public ConnectorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectorsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createConnector
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConnectorCall(Connector body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/connectors";

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
    private okhttp3.Call createConnectorValidateBeforeCall(Connector body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createConnector(Async)");
        }
        

        okhttp3.Call localVarCall = createConnectorCall(body, _callback);
        return localVarCall;

    }

    /**
     * Upload a Connector
     * Create a new connector linked to a supported external cms. 
     * @param body  (required)
     * @return Connector
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Connector createConnector(Connector body) throws ApiException {
        ApiResponse<Connector> localVarResp = createConnectorWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Upload a Connector
     * Create a new connector linked to a supported external cms. 
     * @param body  (required)
     * @return ApiResponse&lt;Connector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Connector> createConnectorWithHttpInfo(Connector body) throws ApiException {
        okhttp3.Call localVarCall = createConnectorValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload a Connector (asynchronously)
     * Create a new connector linked to a supported external cms. 
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createConnectorAsync(Connector body, final ApiCallback<Connector> _callback) throws ApiException {

        okhttp3.Call localVarCall = createConnectorValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConnector
     * @param id A unique Connector identifier. (required)
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
    public okhttp3.Call deleteConnectorCall(Integer id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connectors";

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
    private okhttp3.Call deleteConnectorValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteConnector(Async)");
        }
        

        okhttp3.Call localVarCall = deleteConnectorCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete a Connector
     * Delete a Connector.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  
     * @param id A unique Connector identifier. (required)
     * @return ConnectorDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ConnectorDeleteResponse deleteConnector(Integer id) throws ApiException {
        ApiResponse<ConnectorDeleteResponse> localVarResp = deleteConnectorWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Delete a Connector
     * Delete a Connector.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  
     * @param id A unique Connector identifier. (required)
     * @return ApiResponse&lt;ConnectorDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> A status object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConnectorDeleteResponse> deleteConnectorWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = deleteConnectorValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ConnectorDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a Connector (asynchronously)
     * Delete a Connector.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  
     * @param id A unique Connector identifier. (required)
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
    public okhttp3.Call deleteConnectorAsync(Integer id, final ApiCallback<ConnectorDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteConnectorValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ConnectorDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConnectors
     * @param id A unique Connector identifier. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Connectors. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> Connector deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectorsCall(Integer id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connectors";

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
    private okhttp3.Call getConnectorsValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getConnectorsCall(id, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a Connector
     * Retrieves one or more connectors available to your user. Connectors are not associated with a project or a memory.  To retrieve a specific connector, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all connectors, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;
     * @param id A unique Connector identifier. (optional)
     * @return List&lt;Connector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Connectors. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> Connector deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public List<Connector> getConnectors(Integer id) throws ApiException {
        ApiResponse<List<Connector>> localVarResp = getConnectorsWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Retrieve a Connector
     * Retrieves one or more connectors available to your user. Connectors are not associated with a project or a memory.  To retrieve a specific connector, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all connectors, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;
     * @param id A unique Connector identifier. (optional)
     * @return ApiResponse&lt;List&lt;Connector&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Connectors. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> Connector deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Connector>> getConnectorsWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = getConnectorsValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<List<Connector>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a Connector (asynchronously)
     * Retrieves one or more connectors available to your user. Connectors are not associated with a project or a memory.  To retrieve a specific connector, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all connectors, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;
     * @param id A unique Connector identifier. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Connectors. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 410 </td><td> Connector deleted. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConnectorsAsync(Integer id, final ApiCallback<List<Connector>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConnectorsValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<List<Connector>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for syncConnector
     * @param id A unique Connector identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector Job object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncConnectorCall(Integer id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connectors/sync";

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call syncConnectorValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling syncConnector(Async)");
        }
        

        okhttp3.Call localVarCall = syncConnectorCall(id, _callback);
        return localVarCall;

    }

    /**
     * Sync a Connector
     * Request an import job for the given connector ID. This will check the target system for new content to pull into Lilt. 
     * @param id A unique Connector identifier. (required)
     * @return ConnectorJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector Job object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ConnectorJob syncConnector(Integer id) throws ApiException {
        ApiResponse<ConnectorJob> localVarResp = syncConnectorWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Sync a Connector
     * Request an import job for the given connector ID. This will check the target system for new content to pull into Lilt. 
     * @param id A unique Connector identifier. (required)
     * @return ApiResponse&lt;ConnectorJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector Job object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConnectorJob> syncConnectorWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = syncConnectorValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ConnectorJob>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sync a Connector (asynchronously)
     * Request an import job for the given connector ID. This will check the target system for new content to pull into Lilt. 
     * @param id A unique Connector identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector Job object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call syncConnectorAsync(Integer id, final ApiCallback<ConnectorJob> _callback) throws ApiException {

        okhttp3.Call localVarCall = syncConnectorValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ConnectorJob>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConnector
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateConnectorCall(ConnectorArguments body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/connectors";

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
    private okhttp3.Call updateConnectorValidateBeforeCall(ConnectorArguments body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateConnector(Async)");
        }
        

        okhttp3.Call localVarCall = updateConnectorCall(body, _callback);
        return localVarCall;

    }

    /**
     * Upload a Connector
     * Create a new connector linked to a supported external content source. 
     * @param body  (required)
     * @return Connector
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public Connector updateConnector(ConnectorArguments body) throws ApiException {
        ApiResponse<Connector> localVarResp = updateConnectorWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Upload a Connector
     * Create a new connector linked to a supported external content source. 
     * @param body  (required)
     * @return ApiResponse&lt;Connector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Connector> updateConnectorWithHttpInfo(ConnectorArguments body) throws ApiException {
        okhttp3.Call localVarCall = updateConnectorValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload a Connector (asynchronously)
     * Create a new connector linked to a supported external content source. 
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> A Connector object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateConnectorAsync(ConnectorArguments body, final ApiCallback<Connector> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateConnectorValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
