// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: taglib.proto

package org.cocolian.mysql.taglib;

/**
 * <pre>
 **
 * 存储配置支持，标识对应的表
 * </pre>
 *
 * Protobuf type {@code TableMessageOption}
 */
public  final class TableMessageOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TableMessageOption)
    TableMessageOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableMessageOption.newBuilder() to construct.
  private TableMessageOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableMessageOption() {
    tableName_ = "";
    namePattern_ = "";
    primaryKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TableMessageOption(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            tableName_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            namePattern_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            primaryKey_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.cocolian.mysql.taglib.Taglib.internal_static_TableMessageOption_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.cocolian.mysql.taglib.Taglib.internal_static_TableMessageOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.cocolian.mysql.taglib.TableMessageOption.class, org.cocolian.mysql.taglib.TableMessageOption.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <pre>
   *标识数据库中的表名
   * </pre>
   *
   * <code>required string table_name = 1;</code>
   */
  public boolean hasTableName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   *标识数据库中的表名
   * </pre>
   *
   * <code>required string table_name = 1;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        tableName_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *标识数据库中的表名
   * </pre>
   *
   * <code>required string table_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_PATTERN_FIELD_NUMBER = 2;
  private volatile java.lang.Object namePattern_;
  /**
   * <pre>
   *分表分库时的表名pattern;
   * </pre>
   *
   * <code>optional string name_pattern = 2;</code>
   */
  public boolean hasNamePattern() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   *分表分库时的表名pattern;
   * </pre>
   *
   * <code>optional string name_pattern = 2;</code>
   */
  public java.lang.String getNamePattern() {
    java.lang.Object ref = namePattern_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        namePattern_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *分表分库时的表名pattern;
   * </pre>
   *
   * <code>optional string name_pattern = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNamePatternBytes() {
    java.lang.Object ref = namePattern_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namePattern_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIMARY_KEY_FIELD_NUMBER = 3;
  private volatile java.lang.Object primaryKey_;
  /**
   * <pre>
   *主键字段， 默认为空
   * </pre>
   *
   * <code>optional string primary_key = 3;</code>
   */
  public boolean hasPrimaryKey() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   *主键字段， 默认为空
   * </pre>
   *
   * <code>optional string primary_key = 3;</code>
   */
  public java.lang.String getPrimaryKey() {
    java.lang.Object ref = primaryKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        primaryKey_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *主键字段， 默认为空
   * </pre>
   *
   * <code>optional string primary_key = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPrimaryKeyBytes() {
    java.lang.Object ref = primaryKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      primaryKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTableName()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, namePattern_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, primaryKey_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, namePattern_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, primaryKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.cocolian.mysql.taglib.TableMessageOption)) {
      return super.equals(obj);
    }
    org.cocolian.mysql.taglib.TableMessageOption other = (org.cocolian.mysql.taglib.TableMessageOption) obj;

    boolean result = true;
    result = result && (hasTableName() == other.hasTableName());
    if (hasTableName()) {
      result = result && getTableName()
          .equals(other.getTableName());
    }
    result = result && (hasNamePattern() == other.hasNamePattern());
    if (hasNamePattern()) {
      result = result && getNamePattern()
          .equals(other.getNamePattern());
    }
    result = result && (hasPrimaryKey() == other.hasPrimaryKey());
    if (hasPrimaryKey()) {
      result = result && getPrimaryKey()
          .equals(other.getPrimaryKey());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTableName()) {
      hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTableName().hashCode();
    }
    if (hasNamePattern()) {
      hash = (37 * hash) + NAME_PATTERN_FIELD_NUMBER;
      hash = (53 * hash) + getNamePattern().hashCode();
    }
    if (hasPrimaryKey()) {
      hash = (37 * hash) + PRIMARY_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getPrimaryKey().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.cocolian.mysql.taglib.TableMessageOption parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.cocolian.mysql.taglib.TableMessageOption prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   **
   * 存储配置支持，标识对应的表
   * </pre>
   *
   * Protobuf type {@code TableMessageOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TableMessageOption)
      org.cocolian.mysql.taglib.TableMessageOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.cocolian.mysql.taglib.Taglib.internal_static_TableMessageOption_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.cocolian.mysql.taglib.Taglib.internal_static_TableMessageOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.cocolian.mysql.taglib.TableMessageOption.class, org.cocolian.mysql.taglib.TableMessageOption.Builder.class);
    }

    // Construct using org.cocolian.mysql.taglib.TableMessageOption.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      tableName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      namePattern_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      primaryKey_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.cocolian.mysql.taglib.Taglib.internal_static_TableMessageOption_descriptor;
    }

    public org.cocolian.mysql.taglib.TableMessageOption getDefaultInstanceForType() {
      return org.cocolian.mysql.taglib.TableMessageOption.getDefaultInstance();
    }

    public org.cocolian.mysql.taglib.TableMessageOption build() {
      org.cocolian.mysql.taglib.TableMessageOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.cocolian.mysql.taglib.TableMessageOption buildPartial() {
      org.cocolian.mysql.taglib.TableMessageOption result = new org.cocolian.mysql.taglib.TableMessageOption(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.tableName_ = tableName_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.namePattern_ = namePattern_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.primaryKey_ = primaryKey_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.cocolian.mysql.taglib.TableMessageOption) {
        return mergeFrom((org.cocolian.mysql.taglib.TableMessageOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.cocolian.mysql.taglib.TableMessageOption other) {
      if (other == org.cocolian.mysql.taglib.TableMessageOption.getDefaultInstance()) return this;
      if (other.hasTableName()) {
        bitField0_ |= 0x00000001;
        tableName_ = other.tableName_;
        onChanged();
      }
      if (other.hasNamePattern()) {
        bitField0_ |= 0x00000002;
        namePattern_ = other.namePattern_;
        onChanged();
      }
      if (other.hasPrimaryKey()) {
        bitField0_ |= 0x00000004;
        primaryKey_ = other.primaryKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasTableName()) {
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.cocolian.mysql.taglib.TableMessageOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.cocolian.mysql.taglib.TableMessageOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object tableName_ = "";
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public boolean hasTableName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public Builder clearTableName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *标识数据库中的表名
     * </pre>
     *
     * <code>required string table_name = 1;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tableName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object namePattern_ = "";
    /**
     * <pre>
     *分表分库时的表名pattern;
     * </pre>
     *
     * <code>optional string name_pattern = 2;</code>
     */
    public boolean hasNamePattern() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *分表分库时的表名pattern;
     * </pre>
     *
     * <code>optional string name_pattern = 2;</code>
     */
    public java.lang.String getNamePattern() {
      java.lang.Object ref = namePattern_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          namePattern_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *分表分库时的表名pattern;
     * </pre>
     *
     * <code>optional string name_pattern = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNamePatternBytes() {
      java.lang.Object ref = namePattern_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namePattern_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *分表分库时的表名pattern;
     * </pre>
     *
     * <code>optional string name_pattern = 2;</code>
     */
    public Builder setNamePattern(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      namePattern_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *分表分库时的表名pattern;
     * </pre>
     *
     * <code>optional string name_pattern = 2;</code>
     */
    public Builder clearNamePattern() {
      bitField0_ = (bitField0_ & ~0x00000002);
      namePattern_ = getDefaultInstance().getNamePattern();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *分表分库时的表名pattern;
     * </pre>
     *
     * <code>optional string name_pattern = 2;</code>
     */
    public Builder setNamePatternBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      namePattern_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object primaryKey_ = "";
    /**
     * <pre>
     *主键字段， 默认为空
     * </pre>
     *
     * <code>optional string primary_key = 3;</code>
     */
    public boolean hasPrimaryKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     *主键字段， 默认为空
     * </pre>
     *
     * <code>optional string primary_key = 3;</code>
     */
    public java.lang.String getPrimaryKey() {
      java.lang.Object ref = primaryKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          primaryKey_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *主键字段， 默认为空
     * </pre>
     *
     * <code>optional string primary_key = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPrimaryKeyBytes() {
      java.lang.Object ref = primaryKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        primaryKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *主键字段， 默认为空
     * </pre>
     *
     * <code>optional string primary_key = 3;</code>
     */
    public Builder setPrimaryKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      primaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *主键字段， 默认为空
     * </pre>
     *
     * <code>optional string primary_key = 3;</code>
     */
    public Builder clearPrimaryKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      primaryKey_ = getDefaultInstance().getPrimaryKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *主键字段， 默认为空
     * </pre>
     *
     * <code>optional string primary_key = 3;</code>
     */
    public Builder setPrimaryKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      primaryKey_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TableMessageOption)
  }

  // @@protoc_insertion_point(class_scope:TableMessageOption)
  private static final org.cocolian.mysql.taglib.TableMessageOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.cocolian.mysql.taglib.TableMessageOption();
  }

  public static org.cocolian.mysql.taglib.TableMessageOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TableMessageOption>
      PARSER = new com.google.protobuf.AbstractParser<TableMessageOption>() {
    public TableMessageOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TableMessageOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TableMessageOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableMessageOption> getParserForType() {
    return PARSER;
  }

  public org.cocolian.mysql.taglib.TableMessageOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

