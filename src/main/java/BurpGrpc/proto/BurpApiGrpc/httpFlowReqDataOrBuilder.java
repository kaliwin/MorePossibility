// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

public interface httpFlowReqDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:burpApi.httpFlowReqData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.burpApi.httpReqGroup httpReqGroup = 1;</code>
   * @return Whether the httpReqGroup field is set.
   */
  boolean hasHttpReqGroup();
  /**
   * <code>.burpApi.httpReqGroup httpReqGroup = 1;</code>
   * @return The httpReqGroup.
   */
  BurpGrpc.proto.BurpApiGrpc.httpReqGroup getHttpReqGroup();
  /**
   * <code>.burpApi.httpReqGroup httpReqGroup = 1;</code>
   */
  BurpGrpc.proto.BurpApiGrpc.httpReqGroupOrBuilder getHttpReqGroupOrBuilder();

  /**
   * <code>.burpApi.httpFlowSource httpFlowSource = 2;</code>
   * @return The enum numeric value on the wire for httpFlowSource.
   */
  int getHttpFlowSourceValue();
  /**
   * <code>.burpApi.httpFlowSource httpFlowSource = 2;</code>
   * @return The httpFlowSource.
   */
  BurpGrpc.proto.BurpApiGrpc.httpFlowSource getHttpFlowSource();
}
