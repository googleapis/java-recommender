/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

public interface ImpactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.Impact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Category that is being targeted.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.Impact.Category category = 1;</code>
   */
  int getCategoryValue();
  /**
   *
   *
   * <pre>
   * Category that is being targeted.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.Impact.Category category = 1;</code>
   */
  com.google.cloud.recommender.v1beta1.Impact.Category getCategory();

  /**
   *
   *
   * <pre>
   * Use with CategoryType.COST
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.CostProjection cost_projection = 100;</code>
   */
  boolean hasCostProjection();
  /**
   *
   *
   * <pre>
   * Use with CategoryType.COST
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.CostProjection cost_projection = 100;</code>
   */
  com.google.cloud.recommender.v1beta1.CostProjection getCostProjection();
  /**
   *
   *
   * <pre>
   * Use with CategoryType.COST
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.CostProjection cost_projection = 100;</code>
   */
  com.google.cloud.recommender.v1beta1.CostProjectionOrBuilder getCostProjectionOrBuilder();

  public com.google.cloud.recommender.v1beta1.Impact.ProjectionCase getProjectionCase();
}
