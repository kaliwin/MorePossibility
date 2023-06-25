// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 *服务路由表 包含零号以及第三方拓展愿意向burp提供的服务
 * </pre>
 *
 * Protobuf type {@code burpApi.serviceRoutingTable}
 */
public final class serviceRoutingTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:burpApi.serviceRoutingTable)
    serviceRoutingTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use serviceRoutingTable.newBuilder() to construct.
  private serviceRoutingTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private serviceRoutingTable() {
    routing_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new serviceRoutingTable();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_serviceRoutingTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_serviceRoutingTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable.class, BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable.Builder.class);
  }

  public static final int ROUTING_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting> routing_;
  /**
   * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
   */
  @java.lang.Override
  public java.util.List<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting> getRoutingList() {
    return routing_;
  }
  /**
   * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingOrBuilder> 
      getRoutingOrBuilderList() {
    return routing_;
  }
  /**
   * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
   */
  @java.lang.Override
  public int getRoutingCount() {
    return routing_.size();
  }
  /**
   * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting getRouting(int index) {
    return routing_.get(index);
  }
  /**
   * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingOrBuilder getRoutingOrBuilder(
      int index) {
    return routing_.get(index);
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
    for (int i = 0; i < routing_.size(); i++) {
      output.writeMessage(1, routing_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < routing_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, routing_.get(i));
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
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable other = (BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable) obj;

    if (!getRoutingList()
        .equals(other.getRoutingList())) return false;
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
    if (getRoutingCount() > 0) {
      hash = (37 * hash) + ROUTING_FIELD_NUMBER;
      hash = (53 * hash) + getRoutingList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable parseFrom(
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
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable prototype) {
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
   *服务路由表 包含零号以及第三方拓展愿意向burp提供的服务
   * </pre>
   *
   * Protobuf type {@code burpApi.serviceRoutingTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:burpApi.serviceRoutingTable)
      BurpGrpc.proto.BurpApiGrpc.serviceRoutingTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_serviceRoutingTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_serviceRoutingTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable.class, BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable.newBuilder()
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
      if (routingBuilder_ == null) {
        routing_ = java.util.Collections.emptyList();
      } else {
        routing_ = null;
        routingBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_serviceRoutingTable_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable build() {
      BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable result = new BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable result) {
      if (routingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          routing_ = java.util.Collections.unmodifiableList(routing_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.routing_ = routing_;
      } else {
        result.routing_ = routingBuilder_.build();
      }
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable.getDefaultInstance()) return this;
      if (routingBuilder_ == null) {
        if (!other.routing_.isEmpty()) {
          if (routing_.isEmpty()) {
            routing_ = other.routing_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRoutingIsMutable();
            routing_.addAll(other.routing_);
          }
          onChanged();
        }
      } else {
        if (!other.routing_.isEmpty()) {
          if (routingBuilder_.isEmpty()) {
            routingBuilder_.dispose();
            routingBuilder_ = null;
            routing_ = other.routing_;
            bitField0_ = (bitField0_ & ~0x00000001);
            routingBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoutingFieldBuilder() : null;
          } else {
            routingBuilder_.addAllMessages(other.routing_);
          }
        }
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
              BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting m =
                  input.readMessage(
                      BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.parser(),
                      extensionRegistry);
              if (routingBuilder_ == null) {
                ensureRoutingIsMutable();
                routing_.add(m);
              } else {
                routingBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting> routing_ =
      java.util.Collections.emptyList();
    private void ensureRoutingIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        routing_ = new java.util.ArrayList<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting>(routing_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingOrBuilder> routingBuilder_;

    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public java.util.List<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting> getRoutingList() {
      if (routingBuilder_ == null) {
        return java.util.Collections.unmodifiableList(routing_);
      } else {
        return routingBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public int getRoutingCount() {
      if (routingBuilder_ == null) {
        return routing_.size();
      } else {
        return routingBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting getRouting(int index) {
      if (routingBuilder_ == null) {
        return routing_.get(index);
      } else {
        return routingBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder setRouting(
        int index, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting value) {
      if (routingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutingIsMutable();
        routing_.set(index, value);
        onChanged();
      } else {
        routingBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder setRouting(
        int index, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder builderForValue) {
      if (routingBuilder_ == null) {
        ensureRoutingIsMutable();
        routing_.set(index, builderForValue.build());
        onChanged();
      } else {
        routingBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder addRouting(BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting value) {
      if (routingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutingIsMutable();
        routing_.add(value);
        onChanged();
      } else {
        routingBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder addRouting(
        int index, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting value) {
      if (routingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoutingIsMutable();
        routing_.add(index, value);
        onChanged();
      } else {
        routingBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder addRouting(
        BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder builderForValue) {
      if (routingBuilder_ == null) {
        ensureRoutingIsMutable();
        routing_.add(builderForValue.build());
        onChanged();
      } else {
        routingBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder addRouting(
        int index, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder builderForValue) {
      if (routingBuilder_ == null) {
        ensureRoutingIsMutable();
        routing_.add(index, builderForValue.build());
        onChanged();
      } else {
        routingBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder addAllRouting(
        java.lang.Iterable<? extends BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting> values) {
      if (routingBuilder_ == null) {
        ensureRoutingIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, routing_);
        onChanged();
      } else {
        routingBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder clearRouting() {
      if (routingBuilder_ == null) {
        routing_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        routingBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public Builder removeRouting(int index) {
      if (routingBuilder_ == null) {
        ensureRoutingIsMutable();
        routing_.remove(index);
        onChanged();
      } else {
        routingBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder getRoutingBuilder(
        int index) {
      return getRoutingFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingOrBuilder getRoutingOrBuilder(
        int index) {
      if (routingBuilder_ == null) {
        return routing_.get(index);  } else {
        return routingBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public java.util.List<? extends BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingOrBuilder> 
         getRoutingOrBuilderList() {
      if (routingBuilder_ != null) {
        return routingBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(routing_);
      }
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder addRoutingBuilder() {
      return getRoutingFieldBuilder().addBuilder(
          BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.getDefaultInstance());
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder addRoutingBuilder(
        int index) {
      return getRoutingFieldBuilder().addBuilder(
          index, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.getDefaultInstance());
    }
    /**
     * <code>repeated .burpApi.serviceRegisterRouting Routing = 1;</code>
     */
    public java.util.List<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder> 
         getRoutingBuilderList() {
      return getRoutingFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingOrBuilder> 
        getRoutingFieldBuilder() {
      if (routingBuilder_ == null) {
        routingBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRouting.Builder, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingOrBuilder>(
                routing_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        routing_ = null;
      }
      return routingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:burpApi.serviceRoutingTable)
  }

  // @@protoc_insertion_point(class_scope:burpApi.serviceRoutingTable)
  private static final BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable();
  }

  public static BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<serviceRoutingTable>
      PARSER = new com.google.protobuf.AbstractParser<serviceRoutingTable>() {
    @java.lang.Override
    public serviceRoutingTable parsePartialFrom(
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

  public static com.google.protobuf.Parser<serviceRoutingTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<serviceRoutingTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.serviceRoutingTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

