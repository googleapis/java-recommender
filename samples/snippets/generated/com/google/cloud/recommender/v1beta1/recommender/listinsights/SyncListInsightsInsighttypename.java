/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.recommender.v1beta1.samples;

// [START recommender_v1beta1_generated_Recommender_ListInsights_Insighttypename_sync]
import com.google.cloud.recommender.v1beta1.Insight;
import com.google.cloud.recommender.v1beta1.InsightTypeName;
import com.google.cloud.recommender.v1beta1.RecommenderClient;

public class SyncListInsightsInsighttypename {

  public static void main(String[] args) throws Exception {
    syncListInsightsInsighttypename();
  }

  public static void syncListInsightsInsighttypename() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RecommenderClient recommenderClient = RecommenderClient.create()) {
      InsightTypeName parent =
          InsightTypeName.ofProjectLocationInsightTypeName(
              "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]");
      for (Insight element : recommenderClient.listInsights(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END recommender_v1beta1_generated_Recommender_ListInsights_Insighttypename_sync]
