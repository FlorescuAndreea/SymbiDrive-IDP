/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-07-05 at 21:15:26 UTC 
 * Modify at your own risk.
 */

package com.appspot.symbidrive_997.symbidrive.model;

/**
 * Model definition for SymbidriveRegisterUserRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the symbidrive. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SymbidriveRegisterUserRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceID;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profile;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String socialID;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceID() {
    return deviceID;
  }

  /**
   * @param deviceID deviceID or {@code null} for none
   */
  public SymbidriveRegisterUserRequest setDeviceID(java.lang.String deviceID) {
    this.deviceID = deviceID;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProfile() {
    return profile;
  }

  /**
   * @param profile profile or {@code null} for none
   */
  public SymbidriveRegisterUserRequest setProfile(java.lang.String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSocialID() {
    return socialID;
  }

  /**
   * @param socialID socialID or {@code null} for none
   */
  public SymbidriveRegisterUserRequest setSocialID(java.lang.String socialID) {
    this.socialID = socialID;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * @param username username or {@code null} for none
   */
  public SymbidriveRegisterUserRequest setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public SymbidriveRegisterUserRequest set(String fieldName, Object value) {
    return (SymbidriveRegisterUserRequest) super.set(fieldName, value);
  }

  @Override
  public SymbidriveRegisterUserRequest clone() {
    return (SymbidriveRegisterUserRequest) super.clone();
  }

}
