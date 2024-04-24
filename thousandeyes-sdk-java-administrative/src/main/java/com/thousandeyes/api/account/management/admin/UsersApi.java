/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.account.management.admin;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.account.management.admin.model.CreateUser201Response;
import com.thousandeyes.api.account.management.admin.model.Error;
import com.thousandeyes.api.account.management.admin.model.GetUser200Response;
import com.thousandeyes.api.account.management.admin.model.GetUsers200Response;
import java.net.URI;
import com.thousandeyes.api.account.management.admin.model.UnauthorizedError;
import com.thousandeyes.api.account.management.admin.model.UserRequestBody;
import com.thousandeyes.api.account.management.admin.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:34:29.033819+01:00[Europe/Lisbon]")
public class UsersApi {
  private final ApiClient apiClient;

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create user
   * Creates a new user.  The following applies when creating a user:  * If the user is already a member of another ThousandEyes customer organization, the user must set their own login account group.  * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
   * @param userRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return CreateUser201Response
   * @throws ApiException if fails to make API call
   */
  public CreateUser201Response createUser(UserRequestBody userRequestBody, String aid) throws ApiException {
    ApiResponse<CreateUser201Response> response = createUserWithHttpInfo(userRequestBody, aid);
    return response.getData();
  }

  /**
   * Create user
   * Creates a new user.  The following applies when creating a user:  * If the user is already a member of another ThousandEyes customer organization, the user must set their own login account group.  * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
   * @param userRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;CreateUser201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateUser201Response> createUserWithHttpInfo(UserRequestBody userRequestBody, String aid) throws ApiException {
    createUserValidateRequest(userRequestBody);

    var requestBuilder = createUserRequestBuilder(userRequestBody, aid);

    return apiClient.send(requestBuilder.build(), CreateUser201Response.class);
  }

  private void createUserValidateRequest(UserRequestBody userRequestBody) throws ApiException {
      // verify the required parameter 'userRequestBody' is set
      if (userRequestBody == null) {
        throw new ApiException(400, "Missing the required parameter 'userRequestBody' when calling createUser");
      }
  }

  private ApiRequest.ApiRequestBuilder createUserRequestBuilder(UserRequestBody userRequestBody, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/users";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(userRequestBody);
    return requestBuilder;
  }
  /**
   * Delete user
   * Deletes a user using the user ID. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.
   * @param id Identifier for the user. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteUser(String id, String aid) throws ApiException {
    deleteUserWithHttpInfo(id, aid);
  }

  /**
   * Delete user
   * Deletes a user using the user ID. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.
   * @param id Identifier for the user. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserWithHttpInfo(String id, String aid) throws ApiException {
    deleteUserValidateRequest(id);

    var requestBuilder = deleteUserRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteUserValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteUser");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteUserRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/users/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Retrieve user
   * Retrieves detailed information about a user. This operation requires the &#x60;API Access&#x60; and &#x60;View All Users&#x60; permissions.
   * @param id Identifier for the user. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetUser200Response
   * @throws ApiException if fails to make API call
   */
  public GetUser200Response getUser(String id, String aid) throws ApiException {
    ApiResponse<GetUser200Response> response = getUserWithHttpInfo(id, aid);
    return response.getData();
  }

  /**
   * Retrieve user
   * Retrieves detailed information about a user. This operation requires the &#x60;API Access&#x60; and &#x60;View All Users&#x60; permissions.
   * @param id Identifier for the user. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetUser200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetUser200Response> getUserWithHttpInfo(String id, String aid) throws ApiException {
    getUserValidateRequest(id);

    var requestBuilder = getUserRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), GetUser200Response.class);
  }

  private void getUserValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getUser");
      }
  }

  private ApiRequest.ApiRequestBuilder getUserRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/users/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * List users
   * Retrieves a list of users in the organization the account group ID belongs to. This operation requires the &#x60;API Access&#x60; and &#x60;View all users&#x60; permissions. See [Account Context](https://developer.thousandeyes.com/v7/#/accountcontext) for more information on changing the account group context.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetUsers200Response
   * @throws ApiException if fails to make API call
   */
  public GetUsers200Response getUsers(String aid) throws ApiException {
    ApiResponse<GetUsers200Response> response = getUsersWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List users
   * Retrieves a list of users in the organization the account group ID belongs to. This operation requires the &#x60;API Access&#x60; and &#x60;View all users&#x60; permissions. See [Account Context](https://developer.thousandeyes.com/v7/#/accountcontext) for more information on changing the account group context.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetUsers200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetUsers200Response> getUsersWithHttpInfo(String aid) throws ApiException {
    getUsersValidateRequest();

    var requestBuilder = getUsersRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetUsers200Response.class);
  }

  private void getUsersValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getUsersRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/users";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Update user
   * Updates a user using the user ID. You can update the user name, email address, account group assignments, or roles. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.   When updating a user, the following applies: * When updating a user&#39;s email address, the user must confirm the username change before they can subsequently log in or perform API operations. * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
   * @param id Identifier for the user. (required)
   * @param userRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetUser200Response
   * @throws ApiException if fails to make API call
   */
  public GetUser200Response updateUser(String id, UserRequestBody userRequestBody, String aid) throws ApiException {
    ApiResponse<GetUser200Response> response = updateUserWithHttpInfo(id, userRequestBody, aid);
    return response.getData();
  }

  /**
   * Update user
   * Updates a user using the user ID. You can update the user name, email address, account group assignments, or roles. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.   When updating a user, the following applies: * When updating a user&#39;s email address, the user must confirm the username change before they can subsequently log in or perform API operations. * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
   * @param id Identifier for the user. (required)
   * @param userRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetUser200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetUser200Response> updateUserWithHttpInfo(String id, UserRequestBody userRequestBody, String aid) throws ApiException {
    updateUserValidateRequest(id, userRequestBody);

    var requestBuilder = updateUserRequestBuilder(id, userRequestBody, aid);

    return apiClient.send(requestBuilder.build(), GetUser200Response.class);
  }

  private void updateUserValidateRequest(String id, UserRequestBody userRequestBody) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateUser");
      }
      // verify the required parameter 'userRequestBody' is set
      if (userRequestBody == null) {
        throw new ApiException(400, "Missing the required parameter 'userRequestBody' when calling updateUser");
      }
  }

  private ApiRequest.ApiRequestBuilder updateUserRequestBuilder(String id, UserRequestBody userRequestBody, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/users/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(userRequestBody);
    return requestBuilder;
  }
}
