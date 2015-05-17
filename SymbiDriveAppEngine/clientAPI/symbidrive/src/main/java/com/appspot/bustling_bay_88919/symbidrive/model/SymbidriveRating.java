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
 * (build: 2015-05-05 20:00:12 UTC)
 * on 2015-05-16 at 14:53:55 UTC 
 * Modify at your own risk.
 */

package com.appspot.bustling_bay_88919.symbidrive.model;

/**
 * Model definition for SymbidriveRating.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the symbidrive. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SymbidriveRating extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double average;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long number;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getAverage() {
    return average;
  }

  /**
   * @param average average or {@code null} for none
   */
  public SymbidriveRating setAverage(java.lang.Double average) {
    this.average = average;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumber() {
    return number;
  }

  /**
   * @param number number or {@code null} for none
   */
  public SymbidriveRating setNumber(java.lang.Long number) {
    this.number = number;
    return this;
  }

  @Override
  public SymbidriveRating set(String fieldName, Object value) {
    return (SymbidriveRating) super.set(fieldName, value);
  }

  @Override
  public SymbidriveRating clone() {
    return (SymbidriveRating) super.clone();
  }

}