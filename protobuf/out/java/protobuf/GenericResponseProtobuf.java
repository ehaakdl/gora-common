// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response/GenericResponse.proto

// Protobuf Java Version: 3.25.0-rc2
package protobuf;

public final class GenericResponseProtobuf {
  private GenericResponseProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenericResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.GenericResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 요청에 대한 결과 코드
     * </pre>
     *
     * <code>required uint32 status = 1;</code>
     * @return Whether the status field is set.
     */
    boolean hasStatus();
    /**
     * <pre>
     * 요청에 대한 결과 코드
     * </pre>
     *
     * <code>required uint32 status = 1;</code>
     * @return The status.
     */
    int getStatus();

    /**
     * <pre>
     * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
     * </pre>
     *
     * <code>optional string accessToken = 2;</code>
     * @return Whether the accessToken field is set.
     */
    boolean hasAccessToken();
    /**
     * <pre>
     * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
     * </pre>
     *
     * <code>optional string accessToken = 2;</code>
     * @return The accessToken.
     */
    java.lang.String getAccessToken();
    /**
     * <pre>
     * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
     * </pre>
     *
     * <code>optional string accessToken = 2;</code>
     * @return The bytes for accessToken.
     */
    com.google.protobuf.ByteString
        getAccessTokenBytes();
  }
  /**
   * Protobuf type {@code protobuf.GenericResponse}
   */
  public static final class GenericResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.GenericResponse)
      GenericResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenericResponse.newBuilder() to construct.
    private GenericResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenericResponse() {
      accessToken_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenericResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.GenericResponseProtobuf.internal_static_protobuf_GenericResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.GenericResponseProtobuf.internal_static_protobuf_GenericResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.GenericResponseProtobuf.GenericResponse.class, protobuf.GenericResponseProtobuf.GenericResponse.Builder.class);
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_ = 0;
    /**
     * <pre>
     * 요청에 대한 결과 코드
     * </pre>
     *
     * <code>required uint32 status = 1;</code>
     * @return Whether the status field is set.
     */
    @java.lang.Override
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 요청에 대한 결과 코드
     * </pre>
     *
     * <code>required uint32 status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }

    public static final int ACCESSTOKEN_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object accessToken_ = "";
    /**
     * <pre>
     * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
     * </pre>
     *
     * <code>optional string accessToken = 2;</code>
     * @return Whether the accessToken field is set.
     */
    @java.lang.Override
    public boolean hasAccessToken() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
     * </pre>
     *
     * <code>optional string accessToken = 2;</code>
     * @return The accessToken.
     */
    @java.lang.Override
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          accessToken_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
     * </pre>
     *
     * <code>optional string accessToken = 2;</code>
     * @return The bytes for accessToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
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

      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, status_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accessToken_);
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
          .computeUInt32Size(1, status_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accessToken_);
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
      if (!(obj instanceof protobuf.GenericResponseProtobuf.GenericResponse)) {
        return super.equals(obj);
      }
      protobuf.GenericResponseProtobuf.GenericResponse other = (protobuf.GenericResponseProtobuf.GenericResponse) obj;

      if (hasStatus() != other.hasStatus()) return false;
      if (hasStatus()) {
        if (getStatus()
            != other.getStatus()) return false;
      }
      if (hasAccessToken() != other.hasAccessToken()) return false;
      if (hasAccessToken()) {
        if (!getAccessToken()
            .equals(other.getAccessToken())) return false;
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus();
      }
      if (hasAccessToken()) {
        hash = (37 * hash) + ACCESSTOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getAccessToken().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static protobuf.GenericResponseProtobuf.GenericResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static protobuf.GenericResponseProtobuf.GenericResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf.GenericResponseProtobuf.GenericResponse parseFrom(
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
    public static Builder newBuilder(protobuf.GenericResponseProtobuf.GenericResponse prototype) {
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
     * Protobuf type {@code protobuf.GenericResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.GenericResponse)
        protobuf.GenericResponseProtobuf.GenericResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.GenericResponseProtobuf.internal_static_protobuf_GenericResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.GenericResponseProtobuf.internal_static_protobuf_GenericResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf.GenericResponseProtobuf.GenericResponse.class, protobuf.GenericResponseProtobuf.GenericResponse.Builder.class);
      }

      // Construct using protobuf.GenericResponseProtobuf.GenericResponse.newBuilder()
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
        status_ = 0;
        accessToken_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.GenericResponseProtobuf.internal_static_protobuf_GenericResponse_descriptor;
      }

      @java.lang.Override
      public protobuf.GenericResponseProtobuf.GenericResponse getDefaultInstanceForType() {
        return protobuf.GenericResponseProtobuf.GenericResponse.getDefaultInstance();
      }

      @java.lang.Override
      public protobuf.GenericResponseProtobuf.GenericResponse build() {
        protobuf.GenericResponseProtobuf.GenericResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public protobuf.GenericResponseProtobuf.GenericResponse buildPartial() {
        protobuf.GenericResponseProtobuf.GenericResponse result = new protobuf.GenericResponseProtobuf.GenericResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(protobuf.GenericResponseProtobuf.GenericResponse result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.status_ = status_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.accessToken_ = accessToken_;
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof protobuf.GenericResponseProtobuf.GenericResponse) {
          return mergeFrom((protobuf.GenericResponseProtobuf.GenericResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf.GenericResponseProtobuf.GenericResponse other) {
        if (other == protobuf.GenericResponseProtobuf.GenericResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasAccessToken()) {
          accessToken_ = other.accessToken_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasStatus()) {
          return false;
        }
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
                status_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                accessToken_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private int status_ ;
      /**
       * <pre>
       * 요청에 대한 결과 코드
       * </pre>
       *
       * <code>required uint32 status = 1;</code>
       * @return Whether the status field is set.
       */
      @java.lang.Override
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * 요청에 대한 결과 코드
       * </pre>
       *
       * <code>required uint32 status = 1;</code>
       * @return The status.
       */
      @java.lang.Override
      public int getStatus() {
        return status_;
      }
      /**
       * <pre>
       * 요청에 대한 결과 코드
       * </pre>
       *
       * <code>required uint32 status = 1;</code>
       * @param value The status to set.
       * @return This builder for chaining.
       */
      public Builder setStatus(int value) {

        status_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 요청에 대한 결과 코드
       * </pre>
       *
       * <code>required uint32 status = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object accessToken_ = "";
      /**
       * <pre>
       * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
       * </pre>
       *
       * <code>optional string accessToken = 2;</code>
       * @return Whether the accessToken field is set.
       */
      public boolean hasAccessToken() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
       * </pre>
       *
       * <code>optional string accessToken = 2;</code>
       * @return The accessToken.
       */
      public java.lang.String getAccessToken() {
        java.lang.Object ref = accessToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            accessToken_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
       * </pre>
       *
       * <code>optional string accessToken = 2;</code>
       * @return The bytes for accessToken.
       */
      public com.google.protobuf.ByteString
          getAccessTokenBytes() {
        java.lang.Object ref = accessToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          accessToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
       * </pre>
       *
       * <code>optional string accessToken = 2;</code>
       * @param value The accessToken to set.
       * @return This builder for chaining.
       */
      public Builder setAccessToken(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        accessToken_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
       * </pre>
       *
       * <code>optional string accessToken = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccessToken() {
        accessToken_ = getDefaultInstance().getAccessToken();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 계정 인증 토큰(재발급될때 이 필드가 채워짐)
       * </pre>
       *
       * <code>optional string accessToken = 2;</code>
       * @param value The bytes for accessToken to set.
       * @return This builder for chaining.
       */
      public Builder setAccessTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        accessToken_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:protobuf.GenericResponse)
    }

    // @@protoc_insertion_point(class_scope:protobuf.GenericResponse)
    private static final protobuf.GenericResponseProtobuf.GenericResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protobuf.GenericResponseProtobuf.GenericResponse();
    }

    public static protobuf.GenericResponseProtobuf.GenericResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GenericResponse>
        PARSER = new com.google.protobuf.AbstractParser<GenericResponse>() {
      @java.lang.Override
      public GenericResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenericResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenericResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public protobuf.GenericResponseProtobuf.GenericResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_GenericResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_GenericResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036response/GenericResponse.proto\022\010protob" +
      "uf\"6\n\017GenericResponse\022\016\n\006status\030\001 \002(\r\022\023\n" +
      "\013accessToken\030\002 \001(\tB\031B\027GenericResponsePro" +
      "tobuf"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protobuf_GenericResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_GenericResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_GenericResponse_descriptor,
        new java.lang.String[] { "Status", "AccessToken", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
