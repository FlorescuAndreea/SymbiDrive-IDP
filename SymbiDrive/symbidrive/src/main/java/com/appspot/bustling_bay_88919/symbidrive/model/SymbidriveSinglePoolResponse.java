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
 * on 2015-06-22 at 19:26:08 UTC 
 * Modify at your own risk.
 */

package com.appspot.bustling_bay_88919.symbidrive.model;

/**
 * Model definition for SymbidriveSinglePoolResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the symbidrive. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SymbidriveSinglePoolResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime date;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("destination_point_lat")
  private java.lang.Double destinationPointLat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("destination_point_lon")
  private java.lang.Double destinationPointLon;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("driver_id")
  private java.lang.String driverId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("pool_id") @com.google.api.client.json.JsonString
  private java.lang.Long poolId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long seats;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("source_point_lat")
  private java.lang.Double sourcePointLat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("source_point_lon")
  private java.lang.Double sourcePointLon;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDate() {
    return date;
  }

  /**
   * @param date date or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setDate(com.google.api.client.util.DateTime date) {
    this.date = date;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getDestinationPointLat() {
    return destinationPointLat;
  }

  /**
   * @param destinationPointLat destinationPointLat or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setDestinationPointLat(java.lang.Double destinationPointLat) {
    this.destinationPointLat = destinationPointLat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getDestinationPointLon() {
    return destinationPointLon;
  }

  /**
   * @param destinationPointLon destinationPointLon or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setDestinationPointLon(java.lang.Double destinationPointLon) {
    this.destinationPointLon = destinationPointLon;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDriverId() {
    return driverId;
  }

  /**
   * @param driverId driverId or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setDriverId(java.lang.String driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPoolId() {
    return poolId;
  }

  /**
   * @param poolId poolId or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setPoolId(java.lang.Long poolId) {
    this.poolId = poolId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getSeats() {
    return seats;
  }

  /**
   * @param seats seats or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setSeats(java.lang.Long seats) {
    this.seats = seats;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getSourcePointLat() {
    return sourcePointLat;
  }

  /**
   * @param sourcePointLat sourcePointLat or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setSourcePointLat(java.lang.Double sourcePointLat) {
    this.sourcePointLat = sourcePointLat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getSourcePointLon() {
    return sourcePointLon;
  }

  /**
   * @param sourcePointLon sourcePointLon or {@code null} for none
   */
  public SymbidriveSinglePoolResponse setSourcePointLon(java.lang.Double sourcePointLon) {
    this.sourcePointLon = sourcePointLon;
    return this;
  }

  @Override
  public SymbidriveSinglePoolResponse set(String fieldName, Object value) {
    return (SymbidriveSinglePoolResponse) super.set(fieldName, value);
  }

  @Override
  public SymbidriveSinglePoolResponse clone() {
    return (SymbidriveSinglePoolResponse) super.clone();
  }

}
