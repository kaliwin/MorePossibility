// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

public interface MenuItemsReturnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:burpApi.MenuItemsReturn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 继续不做任何处理
   * </pre>
   *
   * <code>bool IsContinue = 1;</code>
   * @return The isContinue.
   */
  boolean getIsContinue();

  /**
   * <pre>
   * 修改选中数据
   * </pre>
   *
   * <code>bool IsReviseSelect = 2;</code>
   * @return The isReviseSelect.
   */
  boolean getIsReviseSelect();

  /**
   * <pre>
   * 修改请求
   * </pre>
   *
   * <code>bool IsReviseReq = 3;</code>
   * @return The isReviseReq.
   */
  boolean getIsReviseReq();

  /**
   * <pre>
   * 修改响应 此前burp 可修改重放器响应现在不能 先保留
   * </pre>
   *
   * <code>bool IsReviseRes = 4;</code>
   * @return The isReviseRes.
   */
  boolean getIsReviseRes();

  /**
   * <pre>
   * 请求数据用于覆盖burp 请求   用于修改 http编辑框
   * </pre>
   *
   * <code>bytes ReqData = 5;</code>
   * @return The reqData.
   */
  com.google.protobuf.ByteString getReqData();

  /**
   * <pre>
   * 请求数据用于覆盖burp 请求   用于修改 http编辑框
   * </pre>
   *
   * <code>bytes ResData = 6;</code>
   * @return The resData.
   */
  com.google.protobuf.ByteString getResData();

  /**
   * <pre>
   * 选中数据 用于替换 用户在重放器选中的数据
   * </pre>
   *
   * <code>bytes SelectDate = 7;</code>
   * @return The selectDate.
   */
  com.google.protobuf.ByteString getSelectDate();
}
