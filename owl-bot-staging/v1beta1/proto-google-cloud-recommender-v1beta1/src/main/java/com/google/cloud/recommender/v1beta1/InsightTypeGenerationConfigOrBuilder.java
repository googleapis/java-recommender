// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/insight_type_config.proto

package com.google.cloud.recommender.v1beta1;

public interface InsightTypeGenerationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.InsightTypeGenerationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parameters for this InsightTypeGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * Parameters for this InsightTypeGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   * @return The params.
   */
  com.google.protobuf.Struct getParams();
  /**
   * <pre>
   * Parameters for this InsightTypeGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();
}
