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
 * Model definition for SymbidriveCreateRouteRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the symbidrive. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SymbidriveCreateRouteRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("driver_socialID")
  private java.lang.String driverSocialID;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("route_points_lat")
  private java.util.List<java.lang.Double> routePointsLat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("route_points_long")
  private java.util.List<java.lang.Double> routePointsLong;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDriverSocialID() {
    return driverSocialID;
  }

  /**
   * @param driverSocialID driverSocialID or {@code null} for none
   */
  public SymbidriveCreateRouteRequest setDriverSocialID(java.lang.String driverSocialID) {
    this.driverSocialID = driverSocialID;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public SymbidriveCreateRouteRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getRoutePointsLat() {
    return routePointsLat;
  }

  /**
   * @param routePointsLat routePointsLat or {@code null} for none
   */
  public SymbidriveCreateRouteRequest setRoutePointsLat(java.util.List<java.lang.Double> routePointsLat) {
    this.routePointsLat = routePointsLat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getRoutePointsLong() {
    return routePointsLong;
  }

  /**
   * @param routePointsLong routePointsLong or {@code null} for none
   */
  public SymbidriveCreateRouteRequest setRoutePointsLong(java.util.List<java.lang.Double> routePointsLong) {
    this.routePointsLong = routePointsLong;
    return this;
  }

  @Override
  public SymbidriveCreateRouteRequest set(String fieldName, Object value) {
    return (SymbidriveCreateRouteRequest) super.set(fieldName, value);
  }

  @Override
  public SymbidriveCreateRouteRequest clone() {
    return (SymbidriveCreateRouteRequest) super.clone();
  }

}
