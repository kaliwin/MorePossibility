// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

public interface PayloadProcessorDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:burpApi.PayloadProcessorData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 载荷
   * </pre>
   *
   * <code>bytes payload = 2;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}
