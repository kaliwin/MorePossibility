// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 *迭代生成器 数据
 * </pre>
 *
 * Protobuf type {@code burpApi.IntruderGeneratorData}
 */
public final class IntruderGeneratorData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:burpApi.IntruderGeneratorData)
    IntruderGeneratorDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntruderGeneratorData.newBuilder() to construct.
  private IntruderGeneratorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntruderGeneratorData() {
    contentData_ = com.google.protobuf.ByteString.EMPTY;
    insertionPointOffsets_ = java.util.Collections.emptyList();
    intruderInsertionPoint_ = com.google.protobuf.ByteString.EMPTY;
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntruderGeneratorData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_IntruderGeneratorData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_IntruderGeneratorData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.class, BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.Builder.class);
  }

  public static final int CONTENTDATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString contentData_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * http 请求模板
   * </pre>
   *
   * <code>bytes contentData = 1;</code>
   * @return The contentData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentData() {
    return contentData_;
  }

  public static final int INSERTIONPOINTOFFSETS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets> insertionPointOffsets_;
  /**
   * <pre>
   * 插入点列表
   * </pre>
   *
   * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets> getInsertionPointOffsetsList() {
    return insertionPointOffsets_;
  }
  /**
   * <pre>
   * 插入点列表
   * </pre>
   *
   * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsetsOrBuilder> 
      getInsertionPointOffsetsOrBuilderList() {
    return insertionPointOffsets_;
  }
  /**
   * <pre>
   * 插入点列表
   * </pre>
   *
   * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
   */
  @java.lang.Override
  public int getInsertionPointOffsetsCount() {
    return insertionPointOffsets_.size();
  }
  /**
   * <pre>
   * 插入点列表
   * </pre>
   *
   * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets getInsertionPointOffsets(int index) {
    return insertionPointOffsets_.get(index);
  }
  /**
   * <pre>
   * 插入点列表
   * </pre>
   *
   * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsetsOrBuilder getInsertionPointOffsetsOrBuilder(
      int index) {
    return insertionPointOffsets_.get(index);
  }

  public static final int INTRUDERINSERTIONPOINT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString intruderInsertionPoint_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   *插入点基值
   * </pre>
   *
   * <code>bytes IntruderInsertionPoint = 3;</code>
   * @return The intruderInsertionPoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIntruderInsertionPoint() {
    return intruderInsertionPoint_;
  }

  public static final int NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!contentData_.isEmpty()) {
      output.writeBytes(1, contentData_);
    }
    for (int i = 0; i < insertionPointOffsets_.size(); i++) {
      output.writeMessage(2, insertionPointOffsets_.get(i));
    }
    if (!intruderInsertionPoint_.isEmpty()) {
      output.writeBytes(3, intruderInsertionPoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!contentData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, contentData_);
    }
    for (int i = 0; i < insertionPointOffsets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, insertionPointOffsets_.get(i));
    }
    if (!intruderInsertionPoint_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, intruderInsertionPoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
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
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData other = (BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData) obj;

    if (!getContentData()
        .equals(other.getContentData())) return false;
    if (!getInsertionPointOffsetsList()
        .equals(other.getInsertionPointOffsetsList())) return false;
    if (!getIntruderInsertionPoint()
        .equals(other.getIntruderInsertionPoint())) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + CONTENTDATA_FIELD_NUMBER;
    hash = (53 * hash) + getContentData().hashCode();
    if (getInsertionPointOffsetsCount() > 0) {
      hash = (37 * hash) + INSERTIONPOINTOFFSETS_FIELD_NUMBER;
      hash = (53 * hash) + getInsertionPointOffsetsList().hashCode();
    }
    hash = (37 * hash) + INTRUDERINSERTIONPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getIntruderInsertionPoint().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData parseFrom(
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
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData prototype) {
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
   *迭代生成器 数据
   * </pre>
   *
   * Protobuf type {@code burpApi.IntruderGeneratorData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:burpApi.IntruderGeneratorData)
      BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_IntruderGeneratorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_IntruderGeneratorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.class, BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.newBuilder()
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
      contentData_ = com.google.protobuf.ByteString.EMPTY;
      if (insertionPointOffsetsBuilder_ == null) {
        insertionPointOffsets_ = java.util.Collections.emptyList();
      } else {
        insertionPointOffsets_ = null;
        insertionPointOffsetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      intruderInsertionPoint_ = com.google.protobuf.ByteString.EMPTY;
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_IntruderGeneratorData_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData build() {
      BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData result = new BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData result) {
      if (insertionPointOffsetsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          insertionPointOffsets_ = java.util.Collections.unmodifiableList(insertionPointOffsets_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.insertionPointOffsets_ = insertionPointOffsets_;
      } else {
        result.insertionPointOffsets_ = insertionPointOffsetsBuilder_.build();
      }
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contentData_ = contentData_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.intruderInsertionPoint_ = intruderInsertionPoint_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.getDefaultInstance()) return this;
      if (other.getContentData() != com.google.protobuf.ByteString.EMPTY) {
        setContentData(other.getContentData());
      }
      if (insertionPointOffsetsBuilder_ == null) {
        if (!other.insertionPointOffsets_.isEmpty()) {
          if (insertionPointOffsets_.isEmpty()) {
            insertionPointOffsets_ = other.insertionPointOffsets_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInsertionPointOffsetsIsMutable();
            insertionPointOffsets_.addAll(other.insertionPointOffsets_);
          }
          onChanged();
        }
      } else {
        if (!other.insertionPointOffsets_.isEmpty()) {
          if (insertionPointOffsetsBuilder_.isEmpty()) {
            insertionPointOffsetsBuilder_.dispose();
            insertionPointOffsetsBuilder_ = null;
            insertionPointOffsets_ = other.insertionPointOffsets_;
            bitField0_ = (bitField0_ & ~0x00000002);
            insertionPointOffsetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInsertionPointOffsetsFieldBuilder() : null;
          } else {
            insertionPointOffsetsBuilder_.addAllMessages(other.insertionPointOffsets_);
          }
        }
      }
      if (other.getIntruderInsertionPoint() != com.google.protobuf.ByteString.EMPTY) {
        setIntruderInsertionPoint(other.getIntruderInsertionPoint());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              contentData_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets m =
                  input.readMessage(
                      BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.parser(),
                      extensionRegistry);
              if (insertionPointOffsetsBuilder_ == null) {
                ensureInsertionPointOffsetsIsMutable();
                insertionPointOffsets_.add(m);
              } else {
                insertionPointOffsetsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              intruderInsertionPoint_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.google.protobuf.ByteString contentData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * http 请求模板
     * </pre>
     *
     * <code>bytes contentData = 1;</code>
     * @return The contentData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContentData() {
      return contentData_;
    }
    /**
     * <pre>
     * http 请求模板
     * </pre>
     *
     * <code>bytes contentData = 1;</code>
     * @param value The contentData to set.
     * @return This builder for chaining.
     */
    public Builder setContentData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      contentData_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * http 请求模板
     * </pre>
     *
     * <code>bytes contentData = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContentData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contentData_ = getDefaultInstance().getContentData();
      onChanged();
      return this;
    }

    private java.util.List<BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets> insertionPointOffsets_ =
      java.util.Collections.emptyList();
    private void ensureInsertionPointOffsetsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        insertionPointOffsets_ = new java.util.ArrayList<BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets>(insertionPointOffsets_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsetsOrBuilder> insertionPointOffsetsBuilder_;

    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public java.util.List<BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets> getInsertionPointOffsetsList() {
      if (insertionPointOffsetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(insertionPointOffsets_);
      } else {
        return insertionPointOffsetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public int getInsertionPointOffsetsCount() {
      if (insertionPointOffsetsBuilder_ == null) {
        return insertionPointOffsets_.size();
      } else {
        return insertionPointOffsetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets getInsertionPointOffsets(int index) {
      if (insertionPointOffsetsBuilder_ == null) {
        return insertionPointOffsets_.get(index);
      } else {
        return insertionPointOffsetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder setInsertionPointOffsets(
        int index, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets value) {
      if (insertionPointOffsetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsertionPointOffsetsIsMutable();
        insertionPointOffsets_.set(index, value);
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder setInsertionPointOffsets(
        int index, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder builderForValue) {
      if (insertionPointOffsetsBuilder_ == null) {
        ensureInsertionPointOffsetsIsMutable();
        insertionPointOffsets_.set(index, builderForValue.build());
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder addInsertionPointOffsets(BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets value) {
      if (insertionPointOffsetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsertionPointOffsetsIsMutable();
        insertionPointOffsets_.add(value);
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder addInsertionPointOffsets(
        int index, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets value) {
      if (insertionPointOffsetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsertionPointOffsetsIsMutable();
        insertionPointOffsets_.add(index, value);
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder addInsertionPointOffsets(
        BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder builderForValue) {
      if (insertionPointOffsetsBuilder_ == null) {
        ensureInsertionPointOffsetsIsMutable();
        insertionPointOffsets_.add(builderForValue.build());
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder addInsertionPointOffsets(
        int index, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder builderForValue) {
      if (insertionPointOffsetsBuilder_ == null) {
        ensureInsertionPointOffsetsIsMutable();
        insertionPointOffsets_.add(index, builderForValue.build());
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder addAllInsertionPointOffsets(
        java.lang.Iterable<? extends BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets> values) {
      if (insertionPointOffsetsBuilder_ == null) {
        ensureInsertionPointOffsetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, insertionPointOffsets_);
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder clearInsertionPointOffsets() {
      if (insertionPointOffsetsBuilder_ == null) {
        insertionPointOffsets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public Builder removeInsertionPointOffsets(int index) {
      if (insertionPointOffsetsBuilder_ == null) {
        ensureInsertionPointOffsetsIsMutable();
        insertionPointOffsets_.remove(index);
        onChanged();
      } else {
        insertionPointOffsetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder getInsertionPointOffsetsBuilder(
        int index) {
      return getInsertionPointOffsetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsetsOrBuilder getInsertionPointOffsetsOrBuilder(
        int index) {
      if (insertionPointOffsetsBuilder_ == null) {
        return insertionPointOffsets_.get(index);  } else {
        return insertionPointOffsetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public java.util.List<? extends BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsetsOrBuilder> 
         getInsertionPointOffsetsOrBuilderList() {
      if (insertionPointOffsetsBuilder_ != null) {
        return insertionPointOffsetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(insertionPointOffsets_);
      }
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder addInsertionPointOffsetsBuilder() {
      return getInsertionPointOffsetsFieldBuilder().addBuilder(
          BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.getDefaultInstance());
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder addInsertionPointOffsetsBuilder(
        int index) {
      return getInsertionPointOffsetsFieldBuilder().addBuilder(
          index, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.getDefaultInstance());
    }
    /**
     * <pre>
     * 插入点列表
     * </pre>
     *
     * <code>repeated .burpApi.InsertionPointOffsets insertionPointOffsets = 2;</code>
     */
    public java.util.List<BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder> 
         getInsertionPointOffsetsBuilderList() {
      return getInsertionPointOffsetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsetsOrBuilder> 
        getInsertionPointOffsetsFieldBuilder() {
      if (insertionPointOffsetsBuilder_ == null) {
        insertionPointOffsetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsets.Builder, BurpGrpc.proto.BurpApiGrpc.InsertionPointOffsetsOrBuilder>(
                insertionPointOffsets_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        insertionPointOffsets_ = null;
      }
      return insertionPointOffsetsBuilder_;
    }

    private com.google.protobuf.ByteString intruderInsertionPoint_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     *插入点基值
     * </pre>
     *
     * <code>bytes IntruderInsertionPoint = 3;</code>
     * @return The intruderInsertionPoint.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getIntruderInsertionPoint() {
      return intruderInsertionPoint_;
    }
    /**
     * <pre>
     *插入点基值
     * </pre>
     *
     * <code>bytes IntruderInsertionPoint = 3;</code>
     * @param value The intruderInsertionPoint to set.
     * @return This builder for chaining.
     */
    public Builder setIntruderInsertionPoint(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      intruderInsertionPoint_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *插入点基值
     * </pre>
     *
     * <code>bytes IntruderInsertionPoint = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntruderInsertionPoint() {
      bitField0_ = (bitField0_ & ~0x00000004);
      intruderInsertionPoint_ = getDefaultInstance().getIntruderInsertionPoint();
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 4;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:burpApi.IntruderGeneratorData)
  }

  // @@protoc_insertion_point(class_scope:burpApi.IntruderGeneratorData)
  private static final BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData();
  }

  public static BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntruderGeneratorData>
      PARSER = new com.google.protobuf.AbstractParser<IntruderGeneratorData>() {
    @java.lang.Override
    public IntruderGeneratorData parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntruderGeneratorData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntruderGeneratorData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

