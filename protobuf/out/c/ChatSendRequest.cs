// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: request/chat/ChatSendRequest.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Protobuf {

  /// <summary>Holder for reflection information generated from request/chat/ChatSendRequest.proto</summary>
  public static partial class ChatSendRequestReflection {

    #region Descriptor
    /// <summary>File descriptor for request/chat/ChatSendRequest.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ChatSendRequestReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiJyZXF1ZXN0L2NoYXQvQ2hhdFNlbmRSZXF1ZXN0LnByb3RvEghwcm90b2J1",
            "ZiKBAQoPQ2hhdFNlbmRSZXF1ZXN0EhAKCGNoYXRUeXBlGAEgAigJEhEKCWdy",
            "b3VwVHlwZRgCIAEoCRIRCglncm91cENvZGUYAyABKAkSEAoIdXNlckNvZGUY",
            "BCABKAkSDwoHbWVzc2FnZRgFIAIoCRITCgthY2Nlc3NUb2tlbhgGIAIoCUJB",
            "CiZvcmcuZ29yYS5zZXJ2ZXIubW9kZWwubmV0d29yay5wcm90b2J1ZkIXQ2hh",
            "dFNlbmRSZXF1ZXN0UHJvdG9CdWY="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Protobuf.ChatSendRequest), global::Protobuf.ChatSendRequest.Parser, new[]{ "ChatType", "GroupType", "GroupCode", "UserCode", "Message", "AccessToken" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class ChatSendRequest : pb::IMessage<ChatSendRequest>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<ChatSendRequest> _parser = new pb::MessageParser<ChatSendRequest>(() => new ChatSendRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<ChatSendRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Protobuf.ChatSendRequestReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ChatSendRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ChatSendRequest(ChatSendRequest other) : this() {
      chatType_ = other.chatType_;
      groupType_ = other.groupType_;
      groupCode_ = other.groupCode_;
      userCode_ = other.userCode_;
      message_ = other.message_;
      accessToken_ = other.accessToken_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public ChatSendRequest Clone() {
      return new ChatSendRequest(this);
    }

    /// <summary>Field number for the "chatType" field.</summary>
    public const int ChatTypeFieldNumber = 1;
    private readonly static string ChatTypeDefaultValue = "";

    private string chatType_;
    /// <summary>
    /// 채팅 유형(1:1, 그룹, 전체(1:1, 그룹))
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string ChatType {
      get { return chatType_ ?? ChatTypeDefaultValue; }
      set {
        chatType_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }
    /// <summary>Gets whether the "chatType" field is set</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool HasChatType {
      get { return chatType_ != null; }
    }
    /// <summary>Clears the value of the "chatType" field</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void ClearChatType() {
      chatType_ = null;
    }

    /// <summary>Field number for the "groupType" field.</summary>
    public const int GroupTypeFieldNumber = 2;
    private readonly static string GroupTypeDefaultValue = "";

    private string groupType_;
    /// <summary>
    /// 어떤 그룹 유형으로 보내는지 나타낸다(미사용 - 나중에 구현 예정)
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string GroupType {
      get { return groupType_ ?? GroupTypeDefaultValue; }
      set {
        groupType_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }
    /// <summary>Gets whether the "groupType" field is set</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool HasGroupType {
      get { return groupType_ != null; }
    }
    /// <summary>Clears the value of the "groupType" field</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void ClearGroupType() {
      groupType_ = null;
    }

    /// <summary>Field number for the "groupCode" field.</summary>
    public const int GroupCodeFieldNumber = 3;
    private readonly static string GroupCodeDefaultValue = "";

    private string groupCode_;
    /// <summary>
    /// 어떤 그룹으로 보내는지 나타낸다(미사용 - 나중에 구현 예정)
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string GroupCode {
      get { return groupCode_ ?? GroupCodeDefaultValue; }
      set {
        groupCode_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }
    /// <summary>Gets whether the "groupCode" field is set</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool HasGroupCode {
      get { return groupCode_ != null; }
    }
    /// <summary>Clears the value of the "groupCode" field</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void ClearGroupCode() {
      groupCode_ = null;
    }

    /// <summary>Field number for the "userCode" field.</summary>
    public const int UserCodeFieldNumber = 4;
    private readonly static string UserCodeDefaultValue = "";

    private string userCode_;
    /// <summary>
    /// 어떤 유저에게 보낼지 지정한다.(1:1 채팅에서 사용, 미사용 - 나중에 구현 예정)
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string UserCode {
      get { return userCode_ ?? UserCodeDefaultValue; }
      set {
        userCode_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }
    /// <summary>Gets whether the "userCode" field is set</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool HasUserCode {
      get { return userCode_ != null; }
    }
    /// <summary>Clears the value of the "userCode" field</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void ClearUserCode() {
      userCode_ = null;
    }

    /// <summary>Field number for the "message" field.</summary>
    public const int MessageFieldNumber = 5;
    private readonly static string MessageDefaultValue = "";

    private string message_;
    /// <summary>
    /// 전송할 메시지 담는곳
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Message {
      get { return message_ ?? MessageDefaultValue; }
      set {
        message_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }
    /// <summary>Gets whether the "message" field is set</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool HasMessage {
      get { return message_ != null; }
    }
    /// <summary>Clears the value of the "message" field</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void ClearMessage() {
      message_ = null;
    }

    /// <summary>Field number for the "accessToken" field.</summary>
    public const int AccessTokenFieldNumber = 6;
    private readonly static string AccessTokenDefaultValue = "";

    private string accessToken_;
    /// <summary>
    /// 계정 인증토큰
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string AccessToken {
      get { return accessToken_ ?? AccessTokenDefaultValue; }
      set {
        accessToken_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }
    /// <summary>Gets whether the "accessToken" field is set</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool HasAccessToken {
      get { return accessToken_ != null; }
    }
    /// <summary>Clears the value of the "accessToken" field</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void ClearAccessToken() {
      accessToken_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as ChatSendRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(ChatSendRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (ChatType != other.ChatType) return false;
      if (GroupType != other.GroupType) return false;
      if (GroupCode != other.GroupCode) return false;
      if (UserCode != other.UserCode) return false;
      if (Message != other.Message) return false;
      if (AccessToken != other.AccessToken) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (HasChatType) hash ^= ChatType.GetHashCode();
      if (HasGroupType) hash ^= GroupType.GetHashCode();
      if (HasGroupCode) hash ^= GroupCode.GetHashCode();
      if (HasUserCode) hash ^= UserCode.GetHashCode();
      if (HasMessage) hash ^= Message.GetHashCode();
      if (HasAccessToken) hash ^= AccessToken.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (HasChatType) {
        output.WriteRawTag(10);
        output.WriteString(ChatType);
      }
      if (HasGroupType) {
        output.WriteRawTag(18);
        output.WriteString(GroupType);
      }
      if (HasGroupCode) {
        output.WriteRawTag(26);
        output.WriteString(GroupCode);
      }
      if (HasUserCode) {
        output.WriteRawTag(34);
        output.WriteString(UserCode);
      }
      if (HasMessage) {
        output.WriteRawTag(42);
        output.WriteString(Message);
      }
      if (HasAccessToken) {
        output.WriteRawTag(50);
        output.WriteString(AccessToken);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (HasChatType) {
        output.WriteRawTag(10);
        output.WriteString(ChatType);
      }
      if (HasGroupType) {
        output.WriteRawTag(18);
        output.WriteString(GroupType);
      }
      if (HasGroupCode) {
        output.WriteRawTag(26);
        output.WriteString(GroupCode);
      }
      if (HasUserCode) {
        output.WriteRawTag(34);
        output.WriteString(UserCode);
      }
      if (HasMessage) {
        output.WriteRawTag(42);
        output.WriteString(Message);
      }
      if (HasAccessToken) {
        output.WriteRawTag(50);
        output.WriteString(AccessToken);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      if (HasChatType) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ChatType);
      }
      if (HasGroupType) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(GroupType);
      }
      if (HasGroupCode) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(GroupCode);
      }
      if (HasUserCode) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(UserCode);
      }
      if (HasMessage) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Message);
      }
      if (HasAccessToken) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(AccessToken);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(ChatSendRequest other) {
      if (other == null) {
        return;
      }
      if (other.HasChatType) {
        ChatType = other.ChatType;
      }
      if (other.HasGroupType) {
        GroupType = other.GroupType;
      }
      if (other.HasGroupCode) {
        GroupCode = other.GroupCode;
      }
      if (other.HasUserCode) {
        UserCode = other.UserCode;
      }
      if (other.HasMessage) {
        Message = other.Message;
      }
      if (other.HasAccessToken) {
        AccessToken = other.AccessToken;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            ChatType = input.ReadString();
            break;
          }
          case 18: {
            GroupType = input.ReadString();
            break;
          }
          case 26: {
            GroupCode = input.ReadString();
            break;
          }
          case 34: {
            UserCode = input.ReadString();
            break;
          }
          case 42: {
            Message = input.ReadString();
            break;
          }
          case 50: {
            AccessToken = input.ReadString();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            ChatType = input.ReadString();
            break;
          }
          case 18: {
            GroupType = input.ReadString();
            break;
          }
          case 26: {
            GroupCode = input.ReadString();
            break;
          }
          case 34: {
            UserCode = input.ReadString();
            break;
          }
          case 42: {
            Message = input.ReadString();
            break;
          }
          case 50: {
            AccessToken = input.ReadString();
            break;
          }
        }
      }
    }
    #endif

  }

  #endregion

}

#endregion Designer generated code
