/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.tests.model.DnsTraceTest;
import com.thousandeyes.sdk.tests.model.DnsTraceTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateDnsTraceTest;
import com.thousandeyes.sdk.tests.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DnsTraceApi {
  private final ApiClient apiClient;

  public DnsTraceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create DNS Trace test
   * Creates a new DNS Trace test. This method requires Account Admin permissions. 
   * @param updateDnsTraceTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsTraceTest
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTest createDnsTraceTest(UpdateDnsTraceTest updateDnsTraceTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsTraceTest> response = createDnsTraceTestWithHttpInfo(updateDnsTraceTest, aid, expand);
    return response.getData();
  }

  /**
   * Create DNS Trace test
   * Creates a new DNS Trace test. This method requires Account Admin permissions. 
   * @param updateDnsTraceTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsTraceTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTest> createDnsTraceTestWithHttpInfo(UpdateDnsTraceTest updateDnsTraceTest, String aid, List<Expand> expand) throws ApiException {
    createDnsTraceTestValidateRequest(updateDnsTraceTest);

    var requestBuilder = createDnsTraceTestRequestBuilder(updateDnsTraceTest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsTraceTest.class);
  }

  private void createDnsTraceTestValidateRequest(UpdateDnsTraceTest updateDnsTraceTest) throws ApiException {
      // verify the required parameter 'updateDnsTraceTest' is set
      if (updateDnsTraceTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateDnsTraceTest' when calling createDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createDnsTraceTestRequestBuilder(UpdateDnsTraceTest updateDnsTraceTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/dns-trace";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(updateDnsTraceTest);
    return requestBuilder;
  }
  /**
   * Delete DNS Trace test
   * Deletes the specified DNS Trace test. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDnsTraceTest(String testId, String aid) throws ApiException {
    deleteDnsTraceTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete DNS Trace test
   * Deletes the specified DNS Trace test. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDnsTraceTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteDnsTraceTestValidateRequest(testId);

    var requestBuilder = deleteDnsTraceTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDnsTraceTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDnsTraceTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/dns-trace/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Get DNS Trace test
   * Returns details for a DNS Trace test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsTraceTest
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTest getDnsTraceTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsTraceTest> response = getDnsTraceTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get DNS Trace test
   * Returns details for a DNS Trace test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsTraceTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTest> getDnsTraceTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getDnsTraceTestValidateRequest(testId);

    var requestBuilder = getDnsTraceTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsTraceTest.class);
  }

  private void getDnsTraceTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getDnsTraceTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/dns-trace/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List DNS Trace tests
   * Returns a list of all DNS Trace tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DnsTraceTests
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTests getDnsTraceTests(String aid) throws ApiException {
    ApiResponse<DnsTraceTests> response = getDnsTraceTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List DNS Trace tests
   * Returns a list of all DNS Trace tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DnsTraceTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTests> getDnsTraceTestsWithHttpInfo(String aid) throws ApiException {
    getDnsTraceTestsValidateRequest();

    var requestBuilder = getDnsTraceTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), DnsTraceTests.class);
  }

  private void getDnsTraceTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getDnsTraceTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/dns-trace";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update DNS Trace test
   * Updates a DNS Trace test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param updateDnsTraceTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsTraceTest
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTest updateDnsTraceTest(String testId, UpdateDnsTraceTest updateDnsTraceTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsTraceTest> response = updateDnsTraceTestWithHttpInfo(testId, updateDnsTraceTest, aid, expand);
    return response.getData();
  }

  /**
   * Update DNS Trace test
   * Updates a DNS Trace test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param updateDnsTraceTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsTraceTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTest> updateDnsTraceTestWithHttpInfo(String testId, UpdateDnsTraceTest updateDnsTraceTest, String aid, List<Expand> expand) throws ApiException {
    updateDnsTraceTestValidateRequest(testId, updateDnsTraceTest);

    var requestBuilder = updateDnsTraceTestRequestBuilder(testId, updateDnsTraceTest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsTraceTest.class);
  }

  private void updateDnsTraceTestValidateRequest(String testId, UpdateDnsTraceTest updateDnsTraceTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateDnsTraceTest");
      }
      // verify the required parameter 'updateDnsTraceTest' is set
      if (updateDnsTraceTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateDnsTraceTest' when calling updateDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateDnsTraceTestRequestBuilder(String testId, UpdateDnsTraceTest updateDnsTraceTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/dns-trace/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(updateDnsTraceTest);
    return requestBuilder;
  }
}
