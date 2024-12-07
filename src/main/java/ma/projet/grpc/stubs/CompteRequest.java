// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

/**
 * <pre>
 * Message pour la requête de création ou mise à jour d'un compte
 * </pre>
 *
 * Protobuf type {@code CompteRequest}
 */
public  final class CompteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CompteRequest)
    CompteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompteRequest.newBuilder() to construct.
  private CompteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompteRequest() {
    dateCreation_ = "";
    type_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompteRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompteRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
          case 13: {

            solde_ = input.readFloat();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            dateCreation_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return CompteOuterClass.internal_static_CompteRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CompteOuterClass.internal_static_CompteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CompteRequest.class, Builder.class);
  }

  public static final int SOLDE_FIELD_NUMBER = 1;
  private float solde_;
  /**
   * <code>float solde = 1;</code>
   * @return The solde.
   */
  public float getSolde() {
    return solde_;
  }

  public static final int DATECREATION_FIELD_NUMBER = 2;
  private volatile Object dateCreation_;
  /**
   * <code>string dateCreation = 2;</code>
   * @return The dateCreation.
   */
  public String getDateCreation() {
    Object ref = dateCreation_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      dateCreation_ = s;
      return s;
    }
  }
  /**
   * <code>string dateCreation = 2;</code>
   * @return The bytes for dateCreation.
   */
  public com.google.protobuf.ByteString
      getDateCreationBytes() {
    Object ref = dateCreation_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      dateCreation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>.TypeCompte type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.TypeCompte type = 3;</code>
   * @return The type.
   */
  public TypeCompte getType() {
    @SuppressWarnings("deprecation")
    TypeCompte result = TypeCompte.valueOf(type_);
    return result == null ? TypeCompte.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (solde_ != 0F) {
      output.writeFloat(1, solde_);
    }
    if (!getDateCreationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dateCreation_);
    }
    if (type_ != TypeCompte.COURANT.getNumber()) {
      output.writeEnum(3, type_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (solde_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, solde_);
    }
    if (!getDateCreationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dateCreation_);
    }
    if (type_ != TypeCompte.COURANT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof CompteRequest)) {
      return super.equals(obj);
    }
    CompteRequest other = (CompteRequest) obj;

    if (Float.floatToIntBits(getSolde())
        != Float.floatToIntBits(
            other.getSolde())) return false;
    if (!getDateCreation()
        .equals(other.getDateCreation())) return false;
    if (type_ != other.type_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SOLDE_FIELD_NUMBER;
    hash = (53 * hash) + Float.floatToIntBits(
        getSolde());
    hash = (37 * hash) + DATECREATION_FIELD_NUMBER;
    hash = (53 * hash) + getDateCreation().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CompteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CompteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CompteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CompteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CompteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CompteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(CompteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message pour la requête de création ou mise à jour d'un compte
   * </pre>
   *
   * Protobuf type {@code CompteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CompteRequest)
      CompteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CompteOuterClass.internal_static_CompteRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CompteOuterClass.internal_static_CompteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CompteRequest.class, Builder.class);
    }

    // Construct using ma.projet.grpc.stubs.CompteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      solde_ = 0F;

      dateCreation_ = "";

      type_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CompteOuterClass.internal_static_CompteRequest_descriptor;
    }

    @Override
    public CompteRequest getDefaultInstanceForType() {
      return CompteRequest.getDefaultInstance();
    }

    @Override
    public CompteRequest build() {
      CompteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public CompteRequest buildPartial() {
      CompteRequest result = new CompteRequest(this);
      result.solde_ = solde_;
      result.dateCreation_ = dateCreation_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof CompteRequest) {
        return mergeFrom((CompteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CompteRequest other) {
      if (other == CompteRequest.getDefaultInstance()) return this;
      if (other.getSolde() != 0F) {
        setSolde(other.getSolde());
      }
      if (!other.getDateCreation().isEmpty()) {
        dateCreation_ = other.dateCreation_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      CompteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (CompteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float solde_ ;
    /**
     * <code>float solde = 1;</code>
     * @return The solde.
     */
    public float getSolde() {
      return solde_;
    }
    /**
     * <code>float solde = 1;</code>
     * @param value The solde to set.
     * @return This builder for chaining.
     */
    public Builder setSolde(float value) {
      
      solde_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float solde = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSolde() {
      
      solde_ = 0F;
      onChanged();
      return this;
    }

    private Object dateCreation_ = "";
    /**
     * <code>string dateCreation = 2;</code>
     * @return The dateCreation.
     */
    public String getDateCreation() {
      Object ref = dateCreation_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        dateCreation_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string dateCreation = 2;</code>
     * @return The bytes for dateCreation.
     */
    public com.google.protobuf.ByteString
        getDateCreationBytes() {
      Object ref = dateCreation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        dateCreation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateCreation = 2;</code>
     * @param value The dateCreation to set.
     * @return This builder for chaining.
     */
    public Builder setDateCreation(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateCreation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateCreation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateCreation() {
      
      dateCreation_ = getDefaultInstance().getDateCreation();
      onChanged();
      return this;
    }
    /**
     * <code>string dateCreation = 2;</code>
     * @param value The bytes for dateCreation to set.
     * @return This builder for chaining.
     */
    public Builder setDateCreationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateCreation_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.TypeCompte type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.TypeCompte type = 3;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.TypeCompte type = 3;</code>
     * @return The type.
     */
    public TypeCompte getType() {
      @SuppressWarnings("deprecation")
      TypeCompte result = TypeCompte.valueOf(type_);
      return result == null ? TypeCompte.UNRECOGNIZED : result;
    }
    /**
     * <code>.TypeCompte type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(TypeCompte value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.TypeCompte type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CompteRequest)
  }

  // @@protoc_insertion_point(class_scope:CompteRequest)
  private static final CompteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CompteRequest();
  }

  public static CompteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompteRequest>
      PARSER = new com.google.protobuf.AbstractParser<CompteRequest>() {
    @Override
    public CompteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompteRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CompteRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public CompteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
