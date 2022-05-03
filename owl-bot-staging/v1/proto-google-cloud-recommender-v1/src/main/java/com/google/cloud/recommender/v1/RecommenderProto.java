// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1/recommender_service.proto

package com.google.cloud.recommender.v1;

public final class RecommenderProto {
  private RecommenderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_ListInsightsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListInsightsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_ListInsightsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListInsightsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_GetInsightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_GetInsightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_GetRecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_GetRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/recommender/v1/recommende" +
      "r_service.proto\022\033google.cloud.recommende" +
      "r.v1\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      ")google/cloud/recommender/v1/insight.pro" +
      "to\0320google/cloud/recommender/v1/recommen" +
      "dation.proto\"\233\001\n\023ListInsightsRequest\022>\n\006" +
      "parent\030\001 \001(\tB.\340A\002\372A(\n&recommender.google" +
      "apis.com/InsightType\022\026\n\tpage_size\030\002 \001(\005B" +
      "\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030" +
      "\004 \001(\tB\003\340A\001\"g\n\024ListInsightsResponse\0226\n\010in" +
      "sights\030\001 \003(\0132$.google.cloud.recommender." +
      "v1.Insight\022\027\n\017next_page_token\030\002 \001(\t\"M\n\021G" +
      "etInsightRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"" +
      "recommender.googleapis.com/Insight\"\210\002\n\032M" +
      "arkInsightAcceptedRequest\0228\n\004name\030\001 \001(\tB" +
      "*\340A\002\372A$\n\"recommender.googleapis.com/Insi" +
      "ght\022g\n\016state_metadata\030\002 \003(\0132J.google.clo" +
      "ud.recommender.v1.MarkInsightAcceptedReq" +
      "uest.StateMetadataEntryB\003\340A\001\022\021\n\004etag\030\003 \001" +
      "(\tB\003\340A\002\0324\n\022StateMetadataEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\235\001\n\032ListRecommenda" +
      "tionsRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372A(\n&re" +
      "commender.googleapis.com/Recommender\022\026\n\t" +
      "page_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\t" +
      "B\003\340A\001\022\016\n\006filter\030\005 \001(\t\"|\n\033ListRecommendat" +
      "ionsResponse\022D\n\017recommendations\030\001 \003(\0132+." +
      "google.cloud.recommender.v1.Recommendati" +
      "on\022\027\n\017next_page_token\030\002 \001(\t\"[\n\030GetRecomm" +
      "endationRequest\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)r" +
      "ecommender.googleapis.com/Recommendation" +
      "\"\226\002\n MarkRecommendationClaimedRequest\022?\n" +
      "\004name\030\001 \001(\tB1\340A\002\372A+\n)recommender.googlea" +
      "pis.com/Recommendation\022h\n\016state_metadata" +
      "\030\002 \003(\0132P.google.cloud.recommender.v1.Mar" +
      "kRecommendationClaimedRequest.StateMetad" +
      "ataEntry\022\021\n\004etag\030\003 \001(\tB\003\340A\002\0324\n\022StateMeta" +
      "dataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"\232\002\n\"MarkRecommendationSucceededRequest" +
      "\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)recommender.goog" +
      "leapis.com/Recommendation\022j\n\016state_metad" +
      "ata\030\002 \003(\0132R.google.cloud.recommender.v1." +
      "MarkRecommendationSucceededRequest.State" +
      "MetadataEntry\022\021\n\004etag\030\003 \001(\tB\003\340A\002\0324\n\022Stat" +
      "eMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\t:\0028\001\"\224\002\n\037MarkRecommendationFailedReque" +
      "st\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)recommender.go" +
      "ogleapis.com/Recommendation\022g\n\016state_met" +
      "adata\030\002 \003(\0132O.google.cloud.recommender.v" +
      "1.MarkRecommendationFailedRequest.StateM" +
      "etadataEntry\022\021\n\004etag\030\003 \001(\tB\003\340A\002\0324\n\022State" +
      "MetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\0012\354\035\n\013Recommender\022\213\003\n\014ListInsights\0220" +
      ".google.cloud.recommender.v1.ListInsight" +
      "sRequest\0321.google.cloud.recommender.v1.L" +
      "istInsightsResponse\"\225\002\202\323\344\223\002\205\002\022;/v1/{pare" +
      "nt=projects/*/locations/*/insightTypes/*" +
      "}/insightsZD\022B/v1/{parent=billingAccount" +
      "s/*/locations/*/insightTypes/*}/insights" +
      "Z<\022:/v1/{parent=folders/*/locations/*/in" +
      "sightTypes/*}/insightsZB\022@/v1/{parent=or" +
      "ganizations/*/locations/*/insightTypes/*" +
      "}/insights\332A\006parent\022\370\002\n\nGetInsight\022..goo" +
      "gle.cloud.recommender.v1.GetInsightReque" +
      "st\032$.google.cloud.recommender.v1.Insight" +
      "\"\223\002\202\323\344\223\002\205\002\022;/v1/{name=projects/*/locatio" +
      "ns/*/insightTypes/*/insights/*}ZD\022B/v1/{" +
      "name=billingAccounts/*/locations/*/insig" +
      "htTypes/*/insights/*}Z<\022:/v1/{name=folde" +
      "rs/*/locations/*/insightTypes/*/insights" +
      "/*}ZB\022@/v1/{name=organizations/*/locatio" +
      "ns/*/insightTypes/*/insights/*}\332A\004name\022\336" +
      "\003\n\023MarkInsightAccepted\0227.google.cloud.re" +
      "commender.v1.MarkInsightAcceptedRequest\032" +
      "$.google.cloud.recommender.v1.Insight\"\347\002" +
      "\202\323\344\223\002\305\002\"H/v1/{name=projects/*/locations/" +
      "*/insightTypes/*/insights/*}:markAccepte" +
      "d:\001*ZT\"O/v1/{name=billingAccounts/*/loca" +
      "tions/*/insightTypes/*/insights/*}:markA" +
      "ccepted:\001*ZL\"G/v1/{name=folders/*/locati" +
      "ons/*/insightTypes/*/insights/*}:markAcc" +
      "epted:\001*ZR\"M/v1/{name=organizations/*/lo" +
      "cations/*/insightTypes/*/insights/*}:mar" +
      "kAccepted:\001*\332A\030name,state_metadata,etag\022" +
      "\314\003\n\023ListRecommendations\0227.google.cloud.r" +
      "ecommender.v1.ListRecommendationsRequest" +
      "\0328.google.cloud.recommender.v1.ListRecom" +
      "mendationsResponse\"\301\002\202\323\344\223\002\241\002\022B/v1/{paren" +
      "t=projects/*/locations/*/recommenders/*}" +
      "/recommendationsZK\022I/v1/{parent=billingA" +
      "ccounts/*/locations/*/recommenders/*}/re" +
      "commendationsZC\022A/v1/{parent=folders/*/l" +
      "ocations/*/recommenders/*}/recommendatio" +
      "nsZI\022G/v1/{parent=organizations/*/locati" +
      "ons/*/recommenders/*}/recommendations\332A\006" +
      "parent\332A\rparent,filter\022\251\003\n\021GetRecommenda" +
      "tion\0225.google.cloud.recommender.v1.GetRe" +
      "commendationRequest\032+.google.cloud.recom" +
      "mender.v1.Recommendation\"\257\002\202\323\344\223\002\241\002\022B/v1/" +
      "{name=projects/*/locations/*/recommender" +
      "s/*/recommendations/*}ZK\022I/v1/{name=bill" +
      "ingAccounts/*/locations/*/recommenders/*" +
      "/recommendations/*}ZC\022A/v1/{name=folders" +
      "/*/locations/*/recommenders/*/recommenda" +
      "tions/*}ZI\022G/v1/{name=organizations/*/lo" +
      "cations/*/recommenders/*/recommendations" +
      "/*}\332A\004name\022\211\004\n\031MarkRecommendationClaimed" +
      "\022=.google.cloud.recommender.v1.MarkRecom" +
      "mendationClaimedRequest\032+.google.cloud.r" +
      "ecommender.v1.Recommendation\"\377\002\202\323\344\223\002\335\002\"N" +
      "/v1/{name=projects/*/locations/*/recomme" +
      "nders/*/recommendations/*}:markClaimed:\001" +
      "*ZZ\"U/v1/{name=billingAccounts/*/locatio" +
      "ns/*/recommenders/*/recommendations/*}:m" +
      "arkClaimed:\001*ZR\"M/v1/{name=folders/*/loc" +
      "ations/*/recommenders/*/recommendations/" +
      "*}:markClaimed:\001*ZX\"S/v1/{name=organizat" +
      "ions/*/locations/*/recommenders/*/recomm" +
      "endations/*}:markClaimed:\001*\332A\030name,state" +
      "_metadata,etag\022\225\004\n\033MarkRecommendationSuc" +
      "ceeded\022?.google.cloud.recommender.v1.Mar" +
      "kRecommendationSucceededRequest\032+.google" +
      ".cloud.recommender.v1.Recommendation\"\207\003\202" +
      "\323\344\223\002\345\002\"P/v1/{name=projects/*/locations/*" +
      "/recommenders/*/recommendations/*}:markS" +
      "ucceeded:\001*Z\\\"W/v1/{name=billingAccounts" +
      "/*/locations/*/recommenders/*/recommenda" +
      "tions/*}:markSucceeded:\001*ZT\"O/v1/{name=f" +
      "olders/*/locations/*/recommenders/*/reco" +
      "mmendations/*}:markSucceeded:\001*ZZ\"U/v1/{" +
      "name=organizations/*/locations/*/recomme" +
      "nders/*/recommendations/*}:markSucceeded" +
      ":\001*\332A\030name,state_metadata,etag\022\203\004\n\030MarkR" +
      "ecommendationFailed\022<.google.cloud.recom" +
      "mender.v1.MarkRecommendationFailedReques" +
      "t\032+.google.cloud.recommender.v1.Recommen" +
      "dation\"\373\002\202\323\344\223\002\331\002\"M/v1/{name=projects/*/l" +
      "ocations/*/recommenders/*/recommendation" +
      "s/*}:markFailed:\001*ZY\"T/v1/{name=billingA" +
      "ccounts/*/locations/*/recommenders/*/rec" +
      "ommendations/*}:markFailed:\001*ZQ\"L/v1/{na" +
      "me=folders/*/locations/*/recommenders/*/" +
      "recommendations/*}:markFailed:\001*ZW\"R/v1/" +
      "{name=organizations/*/locations/*/recomm" +
      "enders/*/recommendations/*}:markFailed:\001" +
      "*\332A\030name,state_metadata,etag\032N\312A\032recomme" +
      "nder.googleapis.com\322A.https://www.google" +
      "apis.com/auth/cloud-platformB\242\001\n\037com.goo" +
      "gle.cloud.recommender.v1B\020RecommenderPro" +
      "toP\001ZFgoogle.golang.org/genproto/googlea" +
      "pis/cloud/recommender/v1;recommender\242\002\004C" +
      "REC\252\002\033Google.Cloud.Recommender.V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.recommender.v1.InsightProto.getDescriptor(),
          com.google.cloud.recommender.v1.RecommendationOuterClass.getDescriptor(),
        });
    internal_static_google_cloud_recommender_v1_ListInsightsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommender_v1_ListInsightsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_ListInsightsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_cloud_recommender_v1_ListInsightsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommender_v1_ListInsightsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_ListInsightsResponse_descriptor,
        new java.lang.String[] { "Insights", "NextPageToken", });
    internal_static_google_cloud_recommender_v1_GetInsightRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommender_v1_GetInsightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_GetInsightRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor,
        new java.lang.String[] { "Name", "StateMetadata", "Etag", });
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_descriptor =
      internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkInsightAcceptedRequest_StateMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_ListRecommendationsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_ListRecommendationsResponse_descriptor,
        new java.lang.String[] { "Recommendations", "NextPageToken", });
    internal_static_google_cloud_recommender_v1_GetRecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommender_v1_GetRecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_GetRecommendationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor,
        new java.lang.String[] { "Name", "StateMetadata", "Etag", });
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_descriptor =
      internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor,
        new java.lang.String[] { "Name", "StateMetadata", "Etag", });
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_descriptor =
      internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkRecommendationSucceededRequest_StateMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor,
        new java.lang.String[] { "Name", "StateMetadata", "Etag", });
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_descriptor =
      internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_recommender_v1_MarkRecommendationFailedRequest_StateMetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.recommender.v1.InsightProto.getDescriptor();
    com.google.cloud.recommender.v1.RecommendationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
