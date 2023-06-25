// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * 载荷生成器结果
 * </pre>
 *
 * Protobuf type {@code burpApi.PayloadGeneratorResult}
 */
public final class PayloadGeneratorResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:burpApi.PayloadGeneratorResult)
    PayloadGeneratorResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PayloadGeneratorResult.newBuilder() to construct.
  private PayloadGeneratorResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PayloadGeneratorResult() {
    byteData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PayloadGeneratorResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_PayloadGeneratorResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_PayloadGeneratorResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.class, BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.Builder.class);
  }

  public static final int BYTEDATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString byteData_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 生成的载荷
   * </pre>
   *
   * <code>bytes byteData = 1;</code>
   * @return The byteData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getByteData() {
    return byteData_;
  }

  public static final int ISEND_FIELD_NUMBER = 2;
  private boolean isEnd_ = false;
  /**
   * <pre>
   * 是否结束 true 为结束
   * </pre>
   *
   * <code>bool IsEnd = 2;</code>
   * @return The isEnd.
   */
  @java.lang.Override
  public boolean getIsEnd() {
    return isEnd_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!byteData_.isEmpty()) {
      output.writeBytes(1, byteData_);
    }
    if (isEnd_ != false) {
      output.writeBool(2, isEnd_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!byteData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, byteData_);
    }
    if (isEnd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isEnd_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult other = (BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult) obj;

    if (!getByteData()
        .equals(other.getByteData())) return false;
    if (getIsEnd()
        != other.getIsEnd()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BYTEDATA_FIELD_NUMBER;
    hash = (53 * hash) + getByteData().hashCode();
    hash = (37 * hash) + ISEND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsEnd());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 载荷生成器结果
   * </pre>
   *
   * Protobuf type {@code burpApi.PayloadGeneratorResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:burpApi.PayloadGeneratorResult)
      BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_PayloadGeneratorResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_PayloadGeneratorResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.class, BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      byteData_ = com.google.protobuf.ByteString.EMPTY;
      isEnd_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_PayloadGeneratorResult_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult build() {
      BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult result = new BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.byteData_ = byteData_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isEnd_ = isEnd_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.getDefaultInstance()) return this;
      if (other.getByteData() != com.google.protobuf.ByteString.EMPTY) {
        setByteData(other.getByteData());
      }
      if (other.getIsEnd() != false) {
        setIsEnd(other.getIsEnd());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              byteData_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              isEnd_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString byteData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 生成的载荷
     * </pre>
     *
     * <code>bytes byteData = 1;</code>
     * @return The byteData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getByteData() {
      return byteData_;
    }
    /**
     * <pre>
     * 生成的载荷
     * </pre>
     *
     * <code>bytes byteData = 1;</code>
     * @param value The byteData to set.
     * @return This builder for chaining.
     */
    public Builder setByteData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      byteData_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 生成的载荷
     * </pre>
     *
     * <code>bytes byteData = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearByteData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      byteData_ = getDefaultInstance().getByteData();
      onChanged();
      return this;
    }

    private boolean isEnd_ ;
    /**
     * <pre>
     * 是否结束 true 为结束
     * </pre>
     *
     * <code>bool IsEnd = 2;</code>
     * @return The isEnd.
     */
    @java.lang.Override
    public boolean getIsEnd() {
      return isEnd_;
    }
    /**
     * <pre>
     * 是否结束 true 为结束
     * </pre>
     *
     * <code>bool IsEnd = 2;</code>
     * @param value The isEnd to set.
     * @return This builder for chaining.
     */
    public Builder setIsEnd(boolean value) {

      isEnd_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否结束 true 为结束
     * </pre>
     *
     * <code>bool IsEnd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isEnd_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:burpApi.PayloadGeneratorResult)
  }

  // @@protoc_insertion_point(class_scope:burpApi.PayloadGeneratorResult)
  private static final BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult();
  }

  public static BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PayloadGeneratorResult>
      PARSER = new com.google.protobuf.AbstractParser<PayloadGeneratorResult>() {
    @java.lang.Override
    public PayloadGeneratorResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PayloadGeneratorResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PayloadGeneratorResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

