// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

public interface MenuInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:burpApi.MenuInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *  string name = 1;  // 名称
   * </pre>
   *
   * <code>string tarGet = 2;</code>
   * @return The tarGet.
   */
  java.lang.String getTarGet();
  /**
   * <pre>
   *  string name = 1;  // 名称
   * </pre>
   *
   * <code>string tarGet = 2;</code>
   * @return The bytes for tarGet.
   */
  com.google.protobuf.ByteString
      getTarGetBytes();

  /**
   * <pre>
   * 菜单项
   * </pre>
   *
   * <code>.burpApi.Menu menu = 3;</code>
   * @return Whether the menu field is set.
   */
  boolean hasMenu();
  /**
   * <pre>
   * 菜单项
   * </pre>
   *
   * <code>.burpApi.Menu menu = 3;</code>
   * @return The menu.
   */
  BurpGrpc.proto.BurpApiGrpc.Menu getMenu();
  /**
   * <pre>
   * 菜单项
   * </pre>
   *
   * <code>.burpApi.Menu menu = 3;</code>
   */
  BurpGrpc.proto.BurpApiGrpc.MenuOrBuilder getMenuOrBuilder();
}