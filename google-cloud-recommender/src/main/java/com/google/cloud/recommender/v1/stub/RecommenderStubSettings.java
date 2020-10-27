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
package com.google.cloud.recommender.v1.stub;

import static com.google.cloud.recommender.v1.RecommenderClient.ListInsightsPagedResponse;
import static com.google.cloud.recommender.v1.RecommenderClient.ListRecommendationsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.recommender.v1.GetInsightRequest;
import com.google.cloud.recommender.v1.GetRecommendationRequest;
import com.google.cloud.recommender.v1.Insight;
import com.google.cloud.recommender.v1.ListInsightsRequest;
import com.google.cloud.recommender.v1.ListInsightsResponse;
import com.google.cloud.recommender.v1.ListRecommendationsRequest;
import com.google.cloud.recommender.v1.ListRecommendationsResponse;
import com.google.cloud.recommender.v1.MarkInsightAcceptedRequest;
import com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest;
import com.google.cloud.recommender.v1.MarkRecommendationFailedRequest;
import com.google.cloud.recommender.v1.MarkRecommendationSucceededRequest;
import com.google.cloud.recommender.v1.Recommendation;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RecommenderStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (recommender.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getInsight to 30 seconds:
 *
 * <pre>
 * <code>
 * RecommenderStubSettings.Builder recommenderSettingsBuilder =
 *     RecommenderStubSettings.newBuilder();
 * recommenderSettingsBuilder
 *     .getInsightSettings()
 *     .setRetrySettings(
 *         recommenderSettingsBuilder.getInsightSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RecommenderStubSettings recommenderSettings = recommenderSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RecommenderStubSettings extends StubSettings<RecommenderStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<
          ListInsightsRequest, ListInsightsResponse, ListInsightsPagedResponse>
      listInsightsSettings;
  private final UnaryCallSettings<GetInsightRequest, Insight> getInsightSettings;
  private final UnaryCallSettings<MarkInsightAcceptedRequest, Insight> markInsightAcceptedSettings;
  private final PagedCallSettings<
          ListRecommendationsRequest, ListRecommendationsResponse, ListRecommendationsPagedResponse>
      listRecommendationsSettings;
  private final UnaryCallSettings<GetRecommendationRequest, Recommendation>
      getRecommendationSettings;
  private final UnaryCallSettings<MarkRecommendationClaimedRequest, Recommendation>
      markRecommendationClaimedSettings;
  private final UnaryCallSettings<MarkRecommendationSucceededRequest, Recommendation>
      markRecommendationSucceededSettings;
  private final UnaryCallSettings<MarkRecommendationFailedRequest, Recommendation>
      markRecommendationFailedSettings;

  /** Returns the object with the settings used for calls to listInsights. */
  public PagedCallSettings<ListInsightsRequest, ListInsightsResponse, ListInsightsPagedResponse>
      listInsightsSettings() {
    return listInsightsSettings;
  }

  /** Returns the object with the settings used for calls to getInsight. */
  public UnaryCallSettings<GetInsightRequest, Insight> getInsightSettings() {
    return getInsightSettings;
  }

  /** Returns the object with the settings used for calls to markInsightAccepted. */
  public UnaryCallSettings<MarkInsightAcceptedRequest, Insight> markInsightAcceptedSettings() {
    return markInsightAcceptedSettings;
  }

  /** Returns the object with the settings used for calls to listRecommendations. */
  public PagedCallSettings<
          ListRecommendationsRequest, ListRecommendationsResponse, ListRecommendationsPagedResponse>
      listRecommendationsSettings() {
    return listRecommendationsSettings;
  }

  /** Returns the object with the settings used for calls to getRecommendation. */
  public UnaryCallSettings<GetRecommendationRequest, Recommendation> getRecommendationSettings() {
    return getRecommendationSettings;
  }

  /** Returns the object with the settings used for calls to markRecommendationClaimed. */
  public UnaryCallSettings<MarkRecommendationClaimedRequest, Recommendation>
      markRecommendationClaimedSettings() {
    return markRecommendationClaimedSettings;
  }

  /** Returns the object with the settings used for calls to markRecommendationSucceeded. */
  public UnaryCallSettings<MarkRecommendationSucceededRequest, Recommendation>
      markRecommendationSucceededSettings() {
    return markRecommendationSucceededSettings;
  }

  /** Returns the object with the settings used for calls to markRecommendationFailed. */
  public UnaryCallSettings<MarkRecommendationFailedRequest, Recommendation>
      markRecommendationFailedSettings() {
    return markRecommendationFailedSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RecommenderStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcRecommenderStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "recommender.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RecommenderStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RecommenderStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listInsightsSettings = settingsBuilder.listInsightsSettings().build();
    getInsightSettings = settingsBuilder.getInsightSettings().build();
    markInsightAcceptedSettings = settingsBuilder.markInsightAcceptedSettings().build();
    listRecommendationsSettings = settingsBuilder.listRecommendationsSettings().build();
    getRecommendationSettings = settingsBuilder.getRecommendationSettings().build();
    markRecommendationClaimedSettings = settingsBuilder.markRecommendationClaimedSettings().build();
    markRecommendationSucceededSettings =
        settingsBuilder.markRecommendationSucceededSettings().build();
    markRecommendationFailedSettings = settingsBuilder.markRecommendationFailedSettings().build();
  }

  private static final PagedListDescriptor<ListInsightsRequest, ListInsightsResponse, Insight>
      LIST_INSIGHTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListInsightsRequest, ListInsightsResponse, Insight>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInsightsRequest injectToken(ListInsightsRequest payload, String token) {
              return ListInsightsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListInsightsRequest injectPageSize(ListInsightsRequest payload, int pageSize) {
              return ListInsightsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListInsightsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListInsightsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Insight> extractResources(ListInsightsResponse payload) {
              return payload.getInsightsList() != null
                  ? payload.getInsightsList()
                  : ImmutableList.<Insight>of();
            }
          };

  private static final PagedListDescriptor<
          ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
      LIST_RECOMMENDATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRecommendationsRequest injectToken(
                ListRecommendationsRequest payload, String token) {
              return ListRecommendationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListRecommendationsRequest injectPageSize(
                ListRecommendationsRequest payload, int pageSize) {
              return ListRecommendationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListRecommendationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListRecommendationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Recommendation> extractResources(ListRecommendationsResponse payload) {
              return payload.getRecommendationsList() != null
                  ? payload.getRecommendationsList()
                  : ImmutableList.<Recommendation>of();
            }
          };

  private static final PagedListResponseFactory<
          ListInsightsRequest, ListInsightsResponse, ListInsightsPagedResponse>
      LIST_INSIGHTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInsightsRequest, ListInsightsResponse, ListInsightsPagedResponse>() {
            @Override
            public ApiFuture<ListInsightsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInsightsRequest, ListInsightsResponse> callable,
                ListInsightsRequest request,
                ApiCallContext context,
                ApiFuture<ListInsightsResponse> futureResponse) {
              PageContext<ListInsightsRequest, ListInsightsResponse, Insight> pageContext =
                  PageContext.create(callable, LIST_INSIGHTS_PAGE_STR_DESC, request, context);
              return ListInsightsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListRecommendationsRequest, ListRecommendationsResponse, ListRecommendationsPagedResponse>
      LIST_RECOMMENDATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRecommendationsRequest,
              ListRecommendationsResponse,
              ListRecommendationsPagedResponse>() {
            @Override
            public ApiFuture<ListRecommendationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRecommendationsRequest, ListRecommendationsResponse> callable,
                ListRecommendationsRequest request,
                ApiCallContext context,
                ApiFuture<ListRecommendationsResponse> futureResponse) {
              PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
                  pageContext =
                      PageContext.create(
                          callable, LIST_RECOMMENDATIONS_PAGE_STR_DESC, request, context);
              return ListRecommendationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for RecommenderStubSettings. */
  public static class Builder extends StubSettings.Builder<RecommenderStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<
            ListInsightsRequest, ListInsightsResponse, ListInsightsPagedResponse>
        listInsightsSettings;
    private final UnaryCallSettings.Builder<GetInsightRequest, Insight> getInsightSettings;
    private final UnaryCallSettings.Builder<MarkInsightAcceptedRequest, Insight>
        markInsightAcceptedSettings;
    private final PagedCallSettings.Builder<
            ListRecommendationsRequest,
            ListRecommendationsResponse,
            ListRecommendationsPagedResponse>
        listRecommendationsSettings;
    private final UnaryCallSettings.Builder<GetRecommendationRequest, Recommendation>
        getRecommendationSettings;
    private final UnaryCallSettings.Builder<MarkRecommendationClaimedRequest, Recommendation>
        markRecommendationClaimedSettings;
    private final UnaryCallSettings.Builder<MarkRecommendationSucceededRequest, Recommendation>
        markRecommendationSucceededSettings;
    private final UnaryCallSettings.Builder<MarkRecommendationFailedRequest, Recommendation>
        markRecommendationFailedSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listInsightsSettings = PagedCallSettings.newBuilder(LIST_INSIGHTS_PAGE_STR_FACT);

      getInsightSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      markInsightAcceptedSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listRecommendationsSettings =
          PagedCallSettings.newBuilder(LIST_RECOMMENDATIONS_PAGE_STR_FACT);

      getRecommendationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      markRecommendationClaimedSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      markRecommendationSucceededSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      markRecommendationFailedSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listInsightsSettings,
              getInsightSettings,
              markInsightAcceptedSettings,
              listRecommendationsSettings,
              getRecommendationSettings,
              markRecommendationClaimedSettings,
              markRecommendationSucceededSettings,
              markRecommendationFailedSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .listInsightsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getInsightSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .markInsightAcceptedSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listRecommendationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getRecommendationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .markRecommendationClaimedSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .markRecommendationSucceededSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .markRecommendationFailedSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      return builder;
    }

    protected Builder(RecommenderStubSettings settings) {
      super(settings);

      listInsightsSettings = settings.listInsightsSettings.toBuilder();
      getInsightSettings = settings.getInsightSettings.toBuilder();
      markInsightAcceptedSettings = settings.markInsightAcceptedSettings.toBuilder();
      listRecommendationsSettings = settings.listRecommendationsSettings.toBuilder();
      getRecommendationSettings = settings.getRecommendationSettings.toBuilder();
      markRecommendationClaimedSettings = settings.markRecommendationClaimedSettings.toBuilder();
      markRecommendationSucceededSettings =
          settings.markRecommendationSucceededSettings.toBuilder();
      markRecommendationFailedSettings = settings.markRecommendationFailedSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listInsightsSettings,
              getInsightSettings,
              markInsightAcceptedSettings,
              listRecommendationsSettings,
              getRecommendationSettings,
              markRecommendationClaimedSettings,
              markRecommendationSucceededSettings,
              markRecommendationFailedSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listInsights. */
    public PagedCallSettings.Builder<
            ListInsightsRequest, ListInsightsResponse, ListInsightsPagedResponse>
        listInsightsSettings() {
      return listInsightsSettings;
    }

    /** Returns the builder for the settings used for calls to getInsight. */
    public UnaryCallSettings.Builder<GetInsightRequest, Insight> getInsightSettings() {
      return getInsightSettings;
    }

    /** Returns the builder for the settings used for calls to markInsightAccepted. */
    public UnaryCallSettings.Builder<MarkInsightAcceptedRequest, Insight>
        markInsightAcceptedSettings() {
      return markInsightAcceptedSettings;
    }

    /** Returns the builder for the settings used for calls to listRecommendations. */
    public PagedCallSettings.Builder<
            ListRecommendationsRequest,
            ListRecommendationsResponse,
            ListRecommendationsPagedResponse>
        listRecommendationsSettings() {
      return listRecommendationsSettings;
    }

    /** Returns the builder for the settings used for calls to getRecommendation. */
    public UnaryCallSettings.Builder<GetRecommendationRequest, Recommendation>
        getRecommendationSettings() {
      return getRecommendationSettings;
    }

    /** Returns the builder for the settings used for calls to markRecommendationClaimed. */
    public UnaryCallSettings.Builder<MarkRecommendationClaimedRequest, Recommendation>
        markRecommendationClaimedSettings() {
      return markRecommendationClaimedSettings;
    }

    /** Returns the builder for the settings used for calls to markRecommendationSucceeded. */
    public UnaryCallSettings.Builder<MarkRecommendationSucceededRequest, Recommendation>
        markRecommendationSucceededSettings() {
      return markRecommendationSucceededSettings;
    }

    /** Returns the builder for the settings used for calls to markRecommendationFailed. */
    public UnaryCallSettings.Builder<MarkRecommendationFailedRequest, Recommendation>
        markRecommendationFailedSettings() {
      return markRecommendationFailedSettings;
    }

    @Override
    public RecommenderStubSettings build() throws IOException {
      return new RecommenderStubSettings(this);
    }
  }
}
