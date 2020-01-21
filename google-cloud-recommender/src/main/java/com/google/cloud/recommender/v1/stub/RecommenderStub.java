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

import static com.google.cloud.recommender.v1.RecommenderClient.ListRecommendationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.recommender.v1.GetRecommendationRequest;
import com.google.cloud.recommender.v1.ListRecommendationsRequest;
import com.google.cloud.recommender.v1.ListRecommendationsResponse;
import com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest;
import com.google.cloud.recommender.v1.MarkRecommendationFailedRequest;
import com.google.cloud.recommender.v1.MarkRecommendationSucceededRequest;
import com.google.cloud.recommender.v1.Recommendation;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Recommender API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class RecommenderStub implements BackgroundResource {

  public UnaryCallable<ListRecommendationsRequest, ListRecommendationsPagedResponse>
      listRecommendationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRecommendationsPagedCallable()");
  }

  public UnaryCallable<ListRecommendationsRequest, ListRecommendationsResponse>
      listRecommendationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listRecommendationsCallable()");
  }

  public UnaryCallable<GetRecommendationRequest, Recommendation> getRecommendationCallable() {
    throw new UnsupportedOperationException("Not implemented: getRecommendationCallable()");
  }

  public UnaryCallable<MarkRecommendationClaimedRequest, Recommendation>
      markRecommendationClaimedCallable() {
    throw new UnsupportedOperationException("Not implemented: markRecommendationClaimedCallable()");
  }

  public UnaryCallable<MarkRecommendationSucceededRequest, Recommendation>
      markRecommendationSucceededCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: markRecommendationSucceededCallable()");
  }

  public UnaryCallable<MarkRecommendationFailedRequest, Recommendation>
      markRecommendationFailedCallable() {
    throw new UnsupportedOperationException("Not implemented: markRecommendationFailedCallable()");
  }

  @Override
  public abstract void close();
}
