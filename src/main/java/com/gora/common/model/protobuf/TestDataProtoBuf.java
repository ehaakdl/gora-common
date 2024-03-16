// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response/TestData.proto

// Protobuf Java Version: 3.25.0-rc2
package com.gora.common.model.protobuf;

public final class TestDataProtoBuf {
  private TestDataProtoBuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.gora.common.model.protobuf.TestData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes msg = 1;</code>
     * @return Whether the msg field is set.
     */
    boolean hasMsg();
    /**
     * <code>optional bytes msg = 1;</code>
     * @return The msg.
     */
    com.google.protobuf.ByteString getMsg();
  }
  /**
   * Protobuf type {@code com.gora.common.model.protobuf.TestData}
   */
  public static final class TestData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.gora.common.model.protobuf.TestData)
      TestDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestData.newBuilder() to construct.
    private TestData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestData() {
      msg_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TestData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gora.common.model.protobuf.TestDataProtoBuf.internal_static_com_gora_common_model_protobuf_TestData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gora.common.model.protobuf.TestDataProtoBuf.internal_static_com_gora_common_model_protobuf_TestData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gora.common.model.protobuf.TestDataProtoBuf.TestData.class, com.gora.common.model.protobuf.TestDataProtoBuf.TestData.Builder.class);
    }

    private int bitField0_;
    public static final int MSG_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString msg_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes msg = 1;</code>
     * @return Whether the msg field is set.
     */
    @java.lang.Override
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes msg = 1;</code>
     * @return The msg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMsg() {
      return msg_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBytes(1, msg_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, msg_);
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
      if (!(obj instanceof com.gora.common.model.protobuf.TestDataProtoBuf.TestData)) {
        return super.equals(obj);
      }
      com.gora.common.model.protobuf.TestDataProtoBuf.TestData other = (com.gora.common.model.protobuf.TestDataProtoBuf.TestData) obj;

      if (hasMsg() != other.hasMsg()) return false;
      if (hasMsg()) {
        if (!getMsg()
            .equals(other.getMsg())) return false;
      }
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
      if (hasMsg()) {
        hash = (37 * hash) + MSG_FIELD_NUMBER;
        hash = (53 * hash) + getMsg().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData parseFrom(
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
    public static Builder newBuilder(com.gora.common.model.protobuf.TestDataProtoBuf.TestData prototype) {
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
     * Protobuf type {@code com.gora.common.model.protobuf.TestData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.gora.common.model.protobuf.TestData)
        com.gora.common.model.protobuf.TestDataProtoBuf.TestDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.gora.common.model.protobuf.TestDataProtoBuf.internal_static_com_gora_common_model_protobuf_TestData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.gora.common.model.protobuf.TestDataProtoBuf.internal_static_com_gora_common_model_protobuf_TestData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.gora.common.model.protobuf.TestDataProtoBuf.TestData.class, com.gora.common.model.protobuf.TestDataProtoBuf.TestData.Builder.class);
      }

      // Construct using com.gora.common.model.protobuf.TestDataProtoBuf.TestData.newBuilder()
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
        msg_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.gora.common.model.protobuf.TestDataProtoBuf.internal_static_com_gora_common_model_protobuf_TestData_descriptor;
      }

      @java.lang.Override
      public com.gora.common.model.protobuf.TestDataProtoBuf.TestData getDefaultInstanceForType() {
        return com.gora.common.model.protobuf.TestDataProtoBuf.TestData.getDefaultInstance();
      }

      @java.lang.Override
      public com.gora.common.model.protobuf.TestDataProtoBuf.TestData build() {
        com.gora.common.model.protobuf.TestDataProtoBuf.TestData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.gora.common.model.protobuf.TestDataProtoBuf.TestData buildPartial() {
        com.gora.common.model.protobuf.TestDataProtoBuf.TestData result = new com.gora.common.model.protobuf.TestDataProtoBuf.TestData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.gora.common.model.protobuf.TestDataProtoBuf.TestData result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.msg_ = msg_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.gora.common.model.protobuf.TestDataProtoBuf.TestData) {
          return mergeFrom((com.gora.common.model.protobuf.TestDataProtoBuf.TestData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.gora.common.model.protobuf.TestDataProtoBuf.TestData other) {
        if (other == com.gora.common.model.protobuf.TestDataProtoBuf.TestData.getDefaultInstance()) return this;
        if (other.hasMsg()) {
          setMsg(other.getMsg());
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
                msg_ = input.readBytes();
                bitField0_ |= 0x00000001;
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

      private com.google.protobuf.ByteString msg_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes msg = 1;</code>
       * @return Whether the msg field is set.
       */
      @java.lang.Override
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional bytes msg = 1;</code>
       * @return The msg.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMsg() {
        return msg_;
      }
      /**
       * <code>optional bytes msg = 1;</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        msg_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes msg = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msg_ = getDefaultInstance().getMsg();
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


      // @@protoc_insertion_point(builder_scope:com.gora.common.model.protobuf.TestData)
    }

    // @@protoc_insertion_point(class_scope:com.gora.common.model.protobuf.TestData)
    private static final com.gora.common.model.protobuf.TestDataProtoBuf.TestData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.gora.common.model.protobuf.TestDataProtoBuf.TestData();
    }

    public static com.gora.common.model.protobuf.TestDataProtoBuf.TestData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TestData>
        PARSER = new com.google.protobuf.AbstractParser<TestData>() {
      @java.lang.Override
      public TestData parsePartialFrom(
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

    public static com.google.protobuf.Parser<TestData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TestData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.gora.common.model.protobuf.TestDataProtoBuf.TestData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gora_common_model_protobuf_TestData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gora_common_model_protobuf_TestData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027response/TestData.proto\022\036com.gora.comm" +
      "on.model.protobuf\"\027\n\010TestData\022\013\n\003msg\030\001 \001" +
      "(\014B\022B\020TestDataProtoBuf"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_gora_common_model_protobuf_TestData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_gora_common_model_protobuf_TestData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gora_common_model_protobuf_TestData_descriptor,
        new java.lang.String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
