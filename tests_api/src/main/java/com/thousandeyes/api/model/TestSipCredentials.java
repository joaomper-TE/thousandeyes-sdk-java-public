/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.SipTestProtocol;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.JSON;

/**
 * TestSipCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:15.741232Z[Europe/London]")
public class TestSipCredentials {
  public static final String SERIALIZED_NAME_AUTH_USER = "authUser";
  @SerializedName(SERIALIZED_NAME_AUTH_USER)
  private String authUser;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private SipTestProtocol protocol = SipTestProtocol.TCP;

  public static final String SERIALIZED_NAME_SIP_REGISTRAR = "sipRegistrar";
  @SerializedName(SERIALIZED_NAME_SIP_REGISTRAR)
  private String sipRegistrar;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public TestSipCredentials() {
  }

  public TestSipCredentials authUser(String authUser) {
    
    this.authUser = authUser;
    return this;
  }

   /**
   * Username for authentication with SIP server.
   * @return authUser
  **/
  @javax.annotation.Nullable
  public String getAuthUser() {
    return authUser;
  }


  public void setAuthUser(String authUser) {
    this.authUser = authUser;
  }


  public TestSipCredentials password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for authentication with SIP server.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public TestSipCredentials port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number for the chosen protocol.
   * minimum: 1024
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nonnull
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public TestSipCredentials protocol(SipTestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public SipTestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(SipTestProtocol protocol) {
    this.protocol = protocol;
  }


  public TestSipCredentials sipRegistrar(String sipRegistrar) {
    
    this.sipRegistrar = sipRegistrar;
    return this;
  }

   /**
   * SIP server to be tested, specified by domain name or IP address.
   * @return sipRegistrar
  **/
  @javax.annotation.Nullable
  public String getSipRegistrar() {
    return sipRegistrar;
  }


  public void setSipRegistrar(String sipRegistrar) {
    this.sipRegistrar = sipRegistrar;
  }


  public TestSipCredentials user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Username for SIP registration, should be unique within a ThousandEyes account group.
   * @return user
  **/
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSipCredentials testSipCredentials = (TestSipCredentials) o;
    return Objects.equals(this.authUser, testSipCredentials.authUser) &&
        Objects.equals(this.password, testSipCredentials.password) &&
        Objects.equals(this.port, testSipCredentials.port) &&
        Objects.equals(this.protocol, testSipCredentials.protocol) &&
        Objects.equals(this.sipRegistrar, testSipCredentials.sipRegistrar) &&
        Objects.equals(this.user, testSipCredentials.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authUser, password, port, protocol, sipRegistrar, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSipCredentials {\n");
    sb.append("    authUser: ").append(toIndentedString(authUser)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sipRegistrar: ").append(toIndentedString(sipRegistrar)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("authUser");
    openapiFields.add("password");
    openapiFields.add("port");
    openapiFields.add("protocol");
    openapiFields.add("sipRegistrar");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("port");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestSipCredentials
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestSipCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestSipCredentials is not found in the empty JSON string", TestSipCredentials.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestSipCredentials.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestSipCredentials` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestSipCredentials.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authUser") != null && !jsonObj.get("authUser").isJsonNull()) && !jsonObj.get("authUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authUser").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("sipRegistrar") != null && !jsonObj.get("sipRegistrar").isJsonNull()) && !jsonObj.get("sipRegistrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sipRegistrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sipRegistrar").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestSipCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestSipCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestSipCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestSipCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<TestSipCredentials>() {
           @Override
           public void write(JsonWriter out, TestSipCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestSipCredentials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestSipCredentials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestSipCredentials
  * @throws IOException if the JSON string is invalid with respect to TestSipCredentials
  */
  public static TestSipCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestSipCredentials.class);
  }

 /**
  * Convert an instance of TestSipCredentials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

