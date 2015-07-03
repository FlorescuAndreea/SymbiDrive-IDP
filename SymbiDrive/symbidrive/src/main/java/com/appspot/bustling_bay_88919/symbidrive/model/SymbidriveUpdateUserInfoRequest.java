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
 * on 2015-07-03 at 19:00:40 UTC 
 * Modify at your own risk.
 */

package com.appspot.bustling_bay_88919.symbidrive.model;

/**
 * Model definition for SymbidriveUpdateUserInfoRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the symbidrive. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SymbidriveUpdateUserInfoRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String car;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSmoker;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean listenToMusic;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String socialID;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telephone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCar() {
    return car;
  }

  /**
   * @param car car or {@code null} for none
   */
  public SymbidriveUpdateUserInfoRequest setCar(java.lang.String car) {
    this.car = car;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSmoker() {
    return isSmoker;
  }

  /**
   * @param isSmoker isSmoker or {@code null} for none
   */
  public SymbidriveUpdateUserInfoRequest setIsSmoker(java.lang.Boolean isSmoker) {
    this.isSmoker = isSmoker;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getListenToMusic() {
    return listenToMusic;
  }

  /**
   * @param listenToMusic listenToMusic or {@code null} for none
   */
  public SymbidriveUpdateUserInfoRequest setListenToMusic(java.lang.Boolean listenToMusic) {
    this.listenToMusic = listenToMusic;
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
  public SymbidriveUpdateUserInfoRequest setSocialID(java.lang.String socialID) {
    this.socialID = socialID;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelephone() {
    return telephone;
  }

  /**
   * @param telephone telephone or {@code null} for none
   */
  public SymbidriveUpdateUserInfoRequest setTelephone(java.lang.String telephone) {
    this.telephone = telephone;
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
  public SymbidriveUpdateUserInfoRequest setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public SymbidriveUpdateUserInfoRequest set(String fieldName, Object value) {
    return (SymbidriveUpdateUserInfoRequest) super.set(fieldName, value);
  }

  @Override
  public SymbidriveUpdateUserInfoRequest clone() {
    return (SymbidriveUpdateUserInfoRequest) super.clone();
  }

}
