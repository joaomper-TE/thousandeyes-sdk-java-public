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

import com.thousandeyes.sdk.tests.model.DnsServerTest;
import com.thousandeyes.sdk.tests.model.DnsServerTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateDnsServerTest;
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
public class DnsServerApi {
  private final ApiClient apiClient;

  public DnsServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create DNS Server test
   * Creates a new DNS Server test. This method requires Account Admin permissions.
   * @param updateDnsServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsServerTest
   * @throws ApiException if fails to make API call
   */
  public DnsServerTest createDnsServerTest(UpdateDnsServerTest updateDnsServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsServerTest> response = createDnsServerTestWithHttpInfo(updateDnsServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Create DNS Server test
   * Creates a new DNS Server test. This method requires Account Admin permissions.
   * @param updateDnsServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsServerTest> createDnsServerTestWithHttpInfo(UpdateDnsServerTest updateDnsServerTest, String aid, List<Expand> expand) throws ApiException {
    createDnsServerTestValidateRequest(updateDnsServerTest);

    var requestBuilder = createDnsServerTestRequestBuilder(updateDnsServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsServerTest.class);
  }

  private void createDnsServerTestValidateRequest(UpdateDnsServerTest updateDnsServerTest) throws ApiException {
      // verify the required parameter 'updateDnsServerTest' is set
      if (updateDnsServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateDnsServerTest' when calling createDnsServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createDnsServerTestRequestBuilder(UpdateDnsServerTest updateDnsServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/dns-server";
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
    requestBuilder.requestBody(updateDnsServerTest);
    return requestBuilder;
  }
  /**
   * Delete DNS Server test
   * Deletes the specified DNS Server test. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDnsServerTest(String testId, String aid) throws ApiException {
    deleteDnsServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete DNS Server test
   * Deletes the specified DNS Server test. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDnsServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteDnsServerTestValidateRequest(testId);

    var requestBuilder = deleteDnsServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDnsServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteDnsServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDnsServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/dns-server/{testId}"
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
   * Get DNS Server test
   * Returns details for a DNS Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsServerTest
   * @throws ApiException if fails to make API call
   */
  public DnsServerTest getDnsServerTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsServerTest> response = getDnsServerTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get DNS Server test
   * Returns details for a DNS Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsServerTest> getDnsServerTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getDnsServerTestValidateRequest(testId);

    var requestBuilder = getDnsServerTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsServerTest.class);
  }

  private void getDnsServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getDnsServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getDnsServerTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/dns-server/{testId}"
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
   * List DNS Server tests
   * Returns a list of all DNS Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DnsServerTests
   * @throws ApiException if fails to make API call
   */
  public DnsServerTests getDnsServerTests(String aid) throws ApiException {
    ApiResponse<DnsServerTests> response = getDnsServerTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List DNS Server tests
   * Returns a list of all DNS Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DnsServerTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsServerTests> getDnsServerTestsWithHttpInfo(String aid) throws ApiException {
    getDnsServerTestsValidateRequest();

    var requestBuilder = getDnsServerTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), DnsServerTests.class);
  }

  private void getDnsServerTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getDnsServerTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/dns-server";
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
   * Update DNS Server test
   * Updates a DNS Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateDnsServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsServerTest
   * @throws ApiException if fails to make API call
   */
  public DnsServerTest updateDnsServerTest(String testId, UpdateDnsServerTest updateDnsServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsServerTest> response = updateDnsServerTestWithHttpInfo(testId, updateDnsServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Update DNS Server test
   * Updates a DNS Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateDnsServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsServerTest> updateDnsServerTestWithHttpInfo(String testId, UpdateDnsServerTest updateDnsServerTest, String aid, List<Expand> expand) throws ApiException {
    updateDnsServerTestValidateRequest(testId, updateDnsServerTest);

    var requestBuilder = updateDnsServerTestRequestBuilder(testId, updateDnsServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsServerTest.class);
  }

  private void updateDnsServerTestValidateRequest(String testId, UpdateDnsServerTest updateDnsServerTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateDnsServerTest");
      }
      // verify the required parameter 'updateDnsServerTest' is set
      if (updateDnsServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateDnsServerTest' when calling updateDnsServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateDnsServerTestRequestBuilder(String testId, UpdateDnsServerTest updateDnsServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/dns-server/{testId}"
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
    requestBuilder.requestBody(updateDnsServerTest);
    return requestBuilder;
  }
}
