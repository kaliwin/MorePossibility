// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * 注释信息
 * </pre>
 *
 * Protobuf type {@code burpApi.annotationsText}
 */
public final class annotationsText extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:burpApi.annotationsText)
    annotationsTextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use annotationsText.newBuilder() to construct.
  private annotationsText(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private annotationsText() {
    notes_ = "";
    color_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new annotationsText();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_annotationsText_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_annotationsText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.annotationsText.class, BurpGrpc.proto.BurpApiGrpc.annotationsText.Builder.class);
  }

  public static final int ISINFO_FIELD_NUMBER = 1;
  private boolean isInfo_ = false;
  /**
   * <pre>
   * 是否有注解信息
   * </pre>
   *
   * <code>bool isInfo = 1;</code>
   * @return The isInfo.
   */
  @java.lang.Override
  public boolean getIsInfo() {
    return isInfo_;
  }

  public static final int NOTES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object notes_ = "";
  /**
   * <pre>
   * 注解文本
   * </pre>
   *
   * <code>string notes = 2;</code>
   * @return The notes.
   */
  @java.lang.Override
  public java.lang.String getNotes() {
    java.lang.Object ref = notes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notes_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 注解文本
   * </pre>
   *
   * <code>string notes = 2;</code>
   * @return The bytes for notes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotesBytes() {
    java.lang.Object ref = notes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notes_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLOR_FIELD_NUMBER = 3;
  private int color_ = 0;
  /**
   * <pre>
   * 颜色
   * </pre>
   *
   * <code>.burpApi.highlightColor color = 3;</code>
   * @return The enum numeric value on the wire for color.
   */
  @java.lang.Override public int getColorValue() {
    return color_;
  }
  /**
   * <pre>
   * 颜色
   * </pre>
   *
   * <code>.burpApi.highlightColor color = 3;</code>
   * @return The color.
   */
  @java.lang.Override public BurpGrpc.proto.BurpApiGrpc.highlightColor getColor() {
    BurpGrpc.proto.BurpApiGrpc.highlightColor result = BurpGrpc.proto.BurpApiGrpc.highlightColor.forNumber(color_);
    return result == null ? BurpGrpc.proto.BurpApiGrpc.highlightColor.UNRECOGNIZED : result;
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
    if (isInfo_ != false) {
      output.writeBool(1, isInfo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notes_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, notes_);
    }
    if (color_ != BurpGrpc.proto.BurpApiGrpc.highlightColor.NONE.getNumber()) {
      output.writeEnum(3, color_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isInfo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isInfo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notes_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, notes_);
    }
    if (color_ != BurpGrpc.proto.BurpApiGrpc.highlightColor.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, color_);
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
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.annotationsText)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.annotationsText other = (BurpGrpc.proto.BurpApiGrpc.annotationsText) obj;

    if (getIsInfo()
        != other.getIsInfo()) return false;
    if (!getNotes()
        .equals(other.getNotes())) return false;
    if (color_ != other.color_) return false;
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
    hash = (37 * hash) + ISINFO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsInfo());
    hash = (37 * hash) + NOTES_FIELD_NUMBER;
    hash = (53 * hash) + getNotes().hashCode();
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + color_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.annotationsText parseFrom(
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
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.annotationsText prototype) {
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
   * 注释信息
   * </pre>
   *
   * Protobuf type {@code burpApi.annotationsText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:burpApi.annotationsText)
      BurpGrpc.proto.BurpApiGrpc.annotationsTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_annotationsText_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_annotationsText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.annotationsText.class, BurpGrpc.proto.BurpApiGrpc.annotationsText.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.annotationsText.newBuilder()
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
      isInfo_ = false;
      notes_ = "";
      color_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_burpApi_annotationsText_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.annotationsText getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.annotationsText.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.annotationsText build() {
      BurpGrpc.proto.BurpApiGrpc.annotationsText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.annotationsText buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.annotationsText result = new BurpGrpc.proto.BurpApiGrpc.annotationsText(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.annotationsText result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isInfo_ = isInfo_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.notes_ = notes_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.color_ = color_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.annotationsText) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.annotationsText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.annotationsText other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.annotationsText.getDefaultInstance()) return this;
      if (other.getIsInfo() != false) {
        setIsInfo(other.getIsInfo());
      }
      if (!other.getNotes().isEmpty()) {
        notes_ = other.notes_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.color_ != 0) {
        setColorValue(other.getColorValue());
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
            case 8: {
              isInfo_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              notes_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              color_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private boolean isInfo_ ;
    /**
     * <pre>
     * 是否有注解信息
     * </pre>
     *
     * <code>bool isInfo = 1;</code>
     * @return The isInfo.
     */
    @java.lang.Override
    public boolean getIsInfo() {
      return isInfo_;
    }
    /**
     * <pre>
     * 是否有注解信息
     * </pre>
     *
     * <code>bool isInfo = 1;</code>
     * @param value The isInfo to set.
     * @return This builder for chaining.
     */
    public Builder setIsInfo(boolean value) {

      isInfo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否有注解信息
     * </pre>
     *
     * <code>bool isInfo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isInfo_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object notes_ = "";
    /**
     * <pre>
     * 注解文本
     * </pre>
     *
     * <code>string notes = 2;</code>
     * @return The notes.
     */
    public java.lang.String getNotes() {
      java.lang.Object ref = notes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 注解文本
     * </pre>
     *
     * <code>string notes = 2;</code>
     * @return The bytes for notes.
     */
    public com.google.protobuf.ByteString
        getNotesBytes() {
      java.lang.Object ref = notes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 注解文本
     * </pre>
     *
     * <code>string notes = 2;</code>
     * @param value The notes to set.
     * @return This builder for chaining.
     */
    public Builder setNotes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      notes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 注解文本
     * </pre>
     *
     * <code>string notes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotes() {
      notes_ = getDefaultInstance().getNotes();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 注解文本
     * </pre>
     *
     * <code>string notes = 2;</code>
     * @param value The bytes for notes to set.
     * @return This builder for chaining.
     */
    public Builder setNotesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      notes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int color_ = 0;
    /**
     * <pre>
     * 颜色
     * </pre>
     *
     * <code>.burpApi.highlightColor color = 3;</code>
     * @return The enum numeric value on the wire for color.
     */
    @java.lang.Override public int getColorValue() {
      return color_;
    }
    /**
     * <pre>
     * 颜色
     * </pre>
     *
     * <code>.burpApi.highlightColor color = 3;</code>
     * @param value The enum numeric value on the wire for color to set.
     * @return This builder for chaining.
     */
    public Builder setColorValue(int value) {
      color_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 颜色
     * </pre>
     *
     * <code>.burpApi.highlightColor color = 3;</code>
     * @return The color.
     */
    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.highlightColor getColor() {
      BurpGrpc.proto.BurpApiGrpc.highlightColor result = BurpGrpc.proto.BurpApiGrpc.highlightColor.forNumber(color_);
      return result == null ? BurpGrpc.proto.BurpApiGrpc.highlightColor.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 颜色
     * </pre>
     *
     * <code>.burpApi.highlightColor color = 3;</code>
     * @param value The color to set.
     * @return This builder for chaining.
     */
    public Builder setColor(BurpGrpc.proto.BurpApiGrpc.highlightColor value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      color_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 颜色
     * </pre>
     *
     * <code>.burpApi.highlightColor color = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearColor() {
      bitField0_ = (bitField0_ & ~0x00000004);
      color_ = 0;
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


    // @@protoc_insertion_point(builder_scope:burpApi.annotationsText)
  }

  // @@protoc_insertion_point(class_scope:burpApi.annotationsText)
  private static final BurpGrpc.proto.BurpApiGrpc.annotationsText DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.annotationsText();
  }

  public static BurpGrpc.proto.BurpApiGrpc.annotationsText getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<annotationsText>
      PARSER = new com.google.protobuf.AbstractParser<annotationsText>() {
    @java.lang.Override
    public annotationsText parsePartialFrom(
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

  public static com.google.protobuf.Parser<annotationsText> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<annotationsText> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.annotationsText getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

