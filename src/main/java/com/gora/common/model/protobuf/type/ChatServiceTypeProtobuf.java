// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: type/ChatServiceType.proto

// Protobuf Java Version: 3.25.0-rc2
package com.gora.common.model.protobuf.type;

public final class ChatServiceTypeProtobuf {
  private ChatServiceTypeProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.gora.common.model.protobuf.type.ChatServiceType}
   */
  public enum ChatServiceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 전체 채팅
     * </pre>
     *
     * <code>all = 0;</code>
     */
    all(0),
    /**
     * <pre>
     * 그룹 채팅
     * </pre>
     *
     * <code>group = 1;</code>
     */
    group(1),
    /**
     * <pre>
     * 1:1 채팅
     * </pre>
     *
     * <code>direct = 2;</code>
     */
    direct(2),
    ;

    /**
     * <pre>
     * 전체 채팅
     * </pre>
     *
     * <code>all = 0;</code>
     */
    public static final int all_VALUE = 0;
    /**
     * <pre>
     * 그룹 채팅
     * </pre>
     *
     * <code>group = 1;</code>
     */
    public static final int group_VALUE = 1;
    /**
     * <pre>
     * 1:1 채팅
     * </pre>
     *
     * <code>direct = 2;</code>
     */
    public static final int direct_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ChatServiceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChatServiceType forNumber(int value) {
      switch (value) {
        case 0: return all;
        case 1: return group;
        case 2: return direct;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChatServiceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChatServiceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChatServiceType>() {
            public ChatServiceType findValueByNumber(int number) {
              return ChatServiceType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.gora.common.model.protobuf.type.ChatServiceTypeProtobuf.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChatServiceType[] VALUES = values();

    public static ChatServiceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ChatServiceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.gora.common.model.protobuf.type.ChatServiceType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032type/ChatServiceType.proto\022#com.gora.c" +
      "ommon.model.protobuf.type*1\n\017ChatService" +
      "Type\022\007\n\003all\020\000\022\t\n\005group\020\001\022\n\n\006direct\020\002B\031B\027" +
      "ChatServiceTypeProtobuf"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
