/*
 * Copyright 2020 Google LLC
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
 * Contains various matching options for values for a GCP resource field.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.ValueMatcher}
 */
public final class ValueMatcher extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.ValueMatcher)
    ValueMatcherOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValueMatcher.newBuilder() to construct.
  private ValueMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValueMatcher() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValueMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ValueMatcher(
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
              java.lang.String s = input.readStringRequireUtf8();
              matchVariantCase_ = 1;
              matchVariant_ = s;
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
        .internal_static_google_cloud_recommender_v1beta1_ValueMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
        .internal_static_google_cloud_recommender_v1beta1_ValueMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.ValueMatcher.class,
            com.google.cloud.recommender.v1beta1.ValueMatcher.Builder.class);
  }

  private int matchVariantCase_ = 0;
  private java.lang.Object matchVariant_;

  public enum MatchVariantCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MATCHES_PATTERN(1),
    MATCHVARIANT_NOT_SET(0);
    private final int value;

    private MatchVariantCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MatchVariantCase valueOf(int value) {
      return forNumber(value);
    }

    public static MatchVariantCase forNumber(int value) {
      switch (value) {
        case 1:
          return MATCHES_PATTERN;
        case 0:
          return MATCHVARIANT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public MatchVariantCase getMatchVariantCase() {
    return MatchVariantCase.forNumber(matchVariantCase_);
  }

  public static final int MATCHES_PATTERN_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * To be used for full regex matching. The regular expression is using the
   * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
   * used with RE2::FullMatch
   * </pre>
   *
   * <code>string matches_pattern = 1;</code>
   *
   * @return Whether the matchesPattern field is set.
   */
  public boolean hasMatchesPattern() {
    return matchVariantCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * To be used for full regex matching. The regular expression is using the
   * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
   * used with RE2::FullMatch
   * </pre>
   *
   * <code>string matches_pattern = 1;</code>
   *
   * @return The matchesPattern.
   */
  public java.lang.String getMatchesPattern() {
    java.lang.Object ref = "";
    if (matchVariantCase_ == 1) {
      ref = matchVariant_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (matchVariantCase_ == 1) {
        matchVariant_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * To be used for full regex matching. The regular expression is using the
   * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
   * used with RE2::FullMatch
   * </pre>
   *
   * <code>string matches_pattern = 1;</code>
   *
   * @return The bytes for matchesPattern.
   */
  public com.google.protobuf.ByteString getMatchesPatternBytes() {
    java.lang.Object ref = "";
    if (matchVariantCase_ == 1) {
      ref = matchVariant_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (matchVariantCase_ == 1) {
        matchVariant_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (matchVariantCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, matchVariant_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (matchVariantCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, matchVariant_);
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
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.ValueMatcher)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.ValueMatcher other =
        (com.google.cloud.recommender.v1beta1.ValueMatcher) obj;

    if (!getMatchVariantCase().equals(other.getMatchVariantCase())) return false;
    switch (matchVariantCase_) {
      case 1:
        if (!getMatchesPattern().equals(other.getMatchesPattern())) return false;
        break;
      case 0:
      default:
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
    switch (matchVariantCase_) {
      case 1:
        hash = (37 * hash) + MATCHES_PATTERN_FIELD_NUMBER;
        hash = (53 * hash) + getMatchesPattern().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher parseFrom(
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

  public static Builder newBuilder(com.google.cloud.recommender.v1beta1.ValueMatcher prototype) {
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
   * Contains various matching options for values for a GCP resource field.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.ValueMatcher}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.ValueMatcher)
      com.google.cloud.recommender.v1beta1.ValueMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_ValueMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_ValueMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.ValueMatcher.class,
              com.google.cloud.recommender.v1beta1.ValueMatcher.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.ValueMatcher.newBuilder()
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
      matchVariantCase_ = 0;
      matchVariant_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_ValueMatcher_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ValueMatcher getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.ValueMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ValueMatcher build() {
      com.google.cloud.recommender.v1beta1.ValueMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ValueMatcher buildPartial() {
      com.google.cloud.recommender.v1beta1.ValueMatcher result =
          new com.google.cloud.recommender.v1beta1.ValueMatcher(this);
      if (matchVariantCase_ == 1) {
        result.matchVariant_ = matchVariant_;
      }
      result.matchVariantCase_ = matchVariantCase_;
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
      if (other instanceof com.google.cloud.recommender.v1beta1.ValueMatcher) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.ValueMatcher) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1beta1.ValueMatcher other) {
      if (other == com.google.cloud.recommender.v1beta1.ValueMatcher.getDefaultInstance())
        return this;
      switch (other.getMatchVariantCase()) {
        case MATCHES_PATTERN:
          {
            matchVariantCase_ = 1;
            matchVariant_ = other.matchVariant_;
            onChanged();
            break;
          }
        case MATCHVARIANT_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.recommender.v1beta1.ValueMatcher parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.recommender.v1beta1.ValueMatcher) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int matchVariantCase_ = 0;
    private java.lang.Object matchVariant_;

    public MatchVariantCase getMatchVariantCase() {
      return MatchVariantCase.forNumber(matchVariantCase_);
    }

    public Builder clearMatchVariant() {
      matchVariantCase_ = 0;
      matchVariant_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * To be used for full regex matching. The regular expression is using the
     * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
     * used with RE2::FullMatch
     * </pre>
     *
     * <code>string matches_pattern = 1;</code>
     *
     * @return Whether the matchesPattern field is set.
     */
    @java.lang.Override
    public boolean hasMatchesPattern() {
      return matchVariantCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * To be used for full regex matching. The regular expression is using the
     * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
     * used with RE2::FullMatch
     * </pre>
     *
     * <code>string matches_pattern = 1;</code>
     *
     * @return The matchesPattern.
     */
    @java.lang.Override
    public java.lang.String getMatchesPattern() {
      java.lang.Object ref = "";
      if (matchVariantCase_ == 1) {
        ref = matchVariant_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (matchVariantCase_ == 1) {
          matchVariant_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * To be used for full regex matching. The regular expression is using the
     * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
     * used with RE2::FullMatch
     * </pre>
     *
     * <code>string matches_pattern = 1;</code>
     *
     * @return The bytes for matchesPattern.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMatchesPatternBytes() {
      java.lang.Object ref = "";
      if (matchVariantCase_ == 1) {
        ref = matchVariant_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (matchVariantCase_ == 1) {
          matchVariant_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * To be used for full regex matching. The regular expression is using the
     * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
     * used with RE2::FullMatch
     * </pre>
     *
     * <code>string matches_pattern = 1;</code>
     *
     * @param value The matchesPattern to set.
     * @return This builder for chaining.
     */
    public Builder setMatchesPattern(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      matchVariantCase_ = 1;
      matchVariant_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * To be used for full regex matching. The regular expression is using the
     * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
     * used with RE2::FullMatch
     * </pre>
     *
     * <code>string matches_pattern = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMatchesPattern() {
      if (matchVariantCase_ == 1) {
        matchVariantCase_ = 0;
        matchVariant_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * To be used for full regex matching. The regular expression is using the
     * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
     * used with RE2::FullMatch
     * </pre>
     *
     * <code>string matches_pattern = 1;</code>
     *
     * @param value The bytes for matchesPattern to set.
     * @return This builder for chaining.
     */
    public Builder setMatchesPatternBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      matchVariantCase_ = 1;
      matchVariant_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.ValueMatcher)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.ValueMatcher)
  private static final com.google.cloud.recommender.v1beta1.ValueMatcher DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.ValueMatcher();
  }

  public static com.google.cloud.recommender.v1beta1.ValueMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValueMatcher> PARSER =
      new com.google.protobuf.AbstractParser<ValueMatcher>() {
        @java.lang.Override
        public ValueMatcher parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ValueMatcher(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ValueMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValueMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.ValueMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
