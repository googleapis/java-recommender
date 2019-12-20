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

/**
 *
 *
 * <pre>
 * Contains metadata about how much money a recommendation can save or incur.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.CostProjection}
 */
public final class CostProjection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.CostProjection)
    CostProjectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CostProjection.newBuilder() to construct.
  private CostProjection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CostProjection() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CostProjection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CostProjection(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.type.Money.Builder subBuilder = null;
              if (cost_ != null) {
                subBuilder = cost_.toBuilder();
              }
              cost_ = input.readMessage(com.google.type.Money.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cost_);
                cost_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (duration_ != null) {
                subBuilder = duration_.toBuilder();
              }
              duration_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(duration_);
                duration_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
        .internal_static_google_cloud_recommender_v1beta1_CostProjection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
        .internal_static_google_cloud_recommender_v1beta1_CostProjection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.CostProjection.class,
            com.google.cloud.recommender.v1beta1.CostProjection.Builder.class);
  }

  public static final int COST_FIELD_NUMBER = 1;
  private com.google.type.Money cost_;
  /**
   *
   *
   * <pre>
   * An approximate projection on amount saved or amount incurred. Negative cost
   * units indicate cost savings and positive cost units indicate increase.
   * See google.type.Money documentation for positive/negative units.
   * </pre>
   *
   * <code>.google.type.Money cost = 1;</code>
   *
   * @return Whether the cost field is set.
   */
  public boolean hasCost() {
    return cost_ != null;
  }
  /**
   *
   *
   * <pre>
   * An approximate projection on amount saved or amount incurred. Negative cost
   * units indicate cost savings and positive cost units indicate increase.
   * See google.type.Money documentation for positive/negative units.
   * </pre>
   *
   * <code>.google.type.Money cost = 1;</code>
   *
   * @return The cost.
   */
  public com.google.type.Money getCost() {
    return cost_ == null ? com.google.type.Money.getDefaultInstance() : cost_;
  }
  /**
   *
   *
   * <pre>
   * An approximate projection on amount saved or amount incurred. Negative cost
   * units indicate cost savings and positive cost units indicate increase.
   * See google.type.Money documentation for positive/negative units.
   * </pre>
   *
   * <code>.google.type.Money cost = 1;</code>
   */
  public com.google.type.MoneyOrBuilder getCostOrBuilder() {
    return getCost();
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration duration_;
  /**
   *
   *
   * <pre>
   * Duration for which this cost applies.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return Whether the duration field is set.
   */
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   *
   *
   * <pre>
   * Duration for which this cost applies.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   *
   * @return The duration.
   */
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   *
   *
   * <pre>
   * Duration for which this cost applies.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return getDuration();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (cost_ != null) {
      output.writeMessage(1, getCost());
    }
    if (duration_ != null) {
      output.writeMessage(2, getDuration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cost_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCost());
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDuration());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.CostProjection)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.CostProjection other =
        (com.google.cloud.recommender.v1beta1.CostProjection) obj;

    if (hasCost() != other.hasCost()) return false;
    if (hasCost()) {
      if (!getCost().equals(other.getCost())) return false;
    }
    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration().equals(other.getDuration())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCost()) {
      hash = (37 * hash) + COST_FIELD_NUMBER;
      hash = (53 * hash) + getCost().hashCode();
    }
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.recommender.v1beta1.CostProjection prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Contains metadata about how much money a recommendation can save or incur.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.CostProjection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.CostProjection)
      com.google.cloud.recommender.v1beta1.CostProjectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_CostProjection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_CostProjection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.CostProjection.class,
              com.google.cloud.recommender.v1beta1.CostProjection.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.CostProjection.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (costBuilder_ == null) {
        cost_ = null;
      } else {
        cost_ = null;
        costBuilder_ = null;
      }
      if (durationBuilder_ == null) {
        duration_ = null;
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_CostProjection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.CostProjection getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.CostProjection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.CostProjection build() {
      com.google.cloud.recommender.v1beta1.CostProjection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.CostProjection buildPartial() {
      com.google.cloud.recommender.v1beta1.CostProjection result =
          new com.google.cloud.recommender.v1beta1.CostProjection(this);
      if (costBuilder_ == null) {
        result.cost_ = cost_;
      } else {
        result.cost_ = costBuilder_.build();
      }
      if (durationBuilder_ == null) {
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.recommender.v1beta1.CostProjection) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.CostProjection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1beta1.CostProjection other) {
      if (other == com.google.cloud.recommender.v1beta1.CostProjection.getDefaultInstance())
        return this;
      if (other.hasCost()) {
        mergeCost(other.getCost());
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.recommender.v1beta1.CostProjection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.recommender.v1beta1.CostProjection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.type.Money cost_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Money, com.google.type.Money.Builder, com.google.type.MoneyOrBuilder>
        costBuilder_;
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     *
     * @return Whether the cost field is set.
     */
    public boolean hasCost() {
      return costBuilder_ != null || cost_ != null;
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     *
     * @return The cost.
     */
    public com.google.type.Money getCost() {
      if (costBuilder_ == null) {
        return cost_ == null ? com.google.type.Money.getDefaultInstance() : cost_;
      } else {
        return costBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     */
    public Builder setCost(com.google.type.Money value) {
      if (costBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cost_ = value;
        onChanged();
      } else {
        costBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     */
    public Builder setCost(com.google.type.Money.Builder builderForValue) {
      if (costBuilder_ == null) {
        cost_ = builderForValue.build();
        onChanged();
      } else {
        costBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     */
    public Builder mergeCost(com.google.type.Money value) {
      if (costBuilder_ == null) {
        if (cost_ != null) {
          cost_ = com.google.type.Money.newBuilder(cost_).mergeFrom(value).buildPartial();
        } else {
          cost_ = value;
        }
        onChanged();
      } else {
        costBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     */
    public Builder clearCost() {
      if (costBuilder_ == null) {
        cost_ = null;
        onChanged();
      } else {
        cost_ = null;
        costBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     */
    public com.google.type.Money.Builder getCostBuilder() {

      onChanged();
      return getCostFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     */
    public com.google.type.MoneyOrBuilder getCostOrBuilder() {
      if (costBuilder_ != null) {
        return costBuilder_.getMessageOrBuilder();
      } else {
        return cost_ == null ? com.google.type.Money.getDefaultInstance() : cost_;
      }
    }
    /**
     *
     *
     * <pre>
     * An approximate projection on amount saved or amount incurred. Negative cost
     * units indicate cost savings and positive cost units indicate increase.
     * See google.type.Money documentation for positive/negative units.
     * </pre>
     *
     * <code>.google.type.Money cost = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Money, com.google.type.Money.Builder, com.google.type.MoneyOrBuilder>
        getCostFieldBuilder() {
      if (costBuilder_ == null) {
        costBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Money,
                com.google.type.Money.Builder,
                com.google.type.MoneyOrBuilder>(getCost(), getParentForChildren(), isClean());
        cost_ = null;
      }
      return costBuilder_;
    }

    private com.google.protobuf.Duration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        durationBuilder_;
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     *
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return durationBuilder_ != null || duration_ != null;
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     *
     * @return The duration.
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (duration_ != null) {
          duration_ =
              com.google.protobuf.Duration.newBuilder(duration_).mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        durationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = null;
        onChanged();
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {

      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     *
     *
     * <pre>
     * Duration for which this cost applies.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getDuration(), getParentForChildren(), isClean());
        duration_ = null;
      }
      return durationBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.CostProjection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.CostProjection)
  private static final com.google.cloud.recommender.v1beta1.CostProjection DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.CostProjection();
  }

  public static com.google.cloud.recommender.v1beta1.CostProjection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CostProjection> PARSER =
      new com.google.protobuf.AbstractParser<CostProjection>() {
        @java.lang.Override
        public CostProjection parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CostProjection(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CostProjection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CostProjection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.CostProjection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
