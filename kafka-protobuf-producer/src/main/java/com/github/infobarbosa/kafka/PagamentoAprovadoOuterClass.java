// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/proto/pagamento-aprovado.proto

package com.github.infobarbosa.kafka;

public final class PagamentoAprovadoOuterClass {
  private PagamentoAprovadoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PagamentoAprovadoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.github.infobarbosa.kafka.PagamentoAprovado)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <pre>
     *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string idPedido = 2;</code>
     */
    java.lang.String getIdPedido();
    /**
     * <pre>
     *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string idPedido = 2;</code>
     */
    com.google.protobuf.ByteString
        getIdPedidoBytes();

    /**
     * <pre>
     *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
     * </pre>
     *
     * <code>string data = 3;</code>
     */
    java.lang.String getData();
    /**
     * <pre>
     *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
     * </pre>
     *
     * <code>string data = 3;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();

    /**
     * <pre>
     *Valor do pagamento 
     * </pre>
     *
     * <code>double valor = 4;</code>
     */
    double getValor();
  }
  /**
   * Protobuf type {@code com.github.infobarbosa.kafka.PagamentoAprovado}
   */
  public  static final class PagamentoAprovado extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.github.infobarbosa.kafka.PagamentoAprovado)
      PagamentoAprovadoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PagamentoAprovado.newBuilder() to construct.
    private PagamentoAprovado(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PagamentoAprovado() {
      id_ = "";
      idPedido_ = "";
      data_ = "";
      valor_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PagamentoAprovado(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              idPedido_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              data_ = s;
              break;
            }
            case 33: {

              valor_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado.class, com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IDPEDIDO_FIELD_NUMBER = 2;
    private volatile java.lang.Object idPedido_;
    /**
     * <pre>
     *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string idPedido = 2;</code>
     */
    public java.lang.String getIdPedido() {
      java.lang.Object ref = idPedido_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idPedido_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
     * </pre>
     *
     * <code>string idPedido = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdPedidoBytes() {
      java.lang.Object ref = idPedido_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idPedido_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private volatile java.lang.Object data_;
    /**
     * <pre>
     *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
     * </pre>
     *
     * <code>string data = 3;</code>
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
     * </pre>
     *
     * <code>string data = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALOR_FIELD_NUMBER = 4;
    private double valor_;
    /**
     * <pre>
     *Valor do pagamento 
     * </pre>
     *
     * <code>double valor = 4;</code>
     */
    public double getValor() {
      return valor_;
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
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (!getIdPedidoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, idPedido_);
      }
      if (!getDataBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, data_);
      }
      if (valor_ != 0D) {
        output.writeDouble(4, valor_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (!getIdPedidoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, idPedido_);
      }
      if (!getDataBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, data_);
      }
      if (valor_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, valor_);
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
      if (!(obj instanceof com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado)) {
        return super.equals(obj);
      }
      com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado other = (com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
      result = result && getIdPedido()
          .equals(other.getIdPedido());
      result = result && getData()
          .equals(other.getData());
      result = result && (
          java.lang.Double.doubleToLongBits(getValor())
          == java.lang.Double.doubleToLongBits(
              other.getValor()));
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + IDPEDIDO_FIELD_NUMBER;
      hash = (53 * hash) + getIdPedido().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + VALOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValor()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parseFrom(
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
    public static Builder newBuilder(com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado prototype) {
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
     * Protobuf type {@code com.github.infobarbosa.kafka.PagamentoAprovado}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.github.infobarbosa.kafka.PagamentoAprovado)
        com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovadoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado.class, com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado.Builder.class);
      }

      // Construct using com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = "";

        idPedido_ = "";

        data_ = "";

        valor_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_descriptor;
      }

      @java.lang.Override
      public com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado getDefaultInstanceForType() {
        return com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado.getDefaultInstance();
      }

      @java.lang.Override
      public com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado build() {
        com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado buildPartial() {
        com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado result = new com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado(this);
        result.id_ = id_;
        result.idPedido_ = idPedido_;
        result.data_ = data_;
        result.valor_ = valor_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado) {
          return mergeFrom((com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado other) {
        if (other == com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getIdPedido().isEmpty()) {
          idPedido_ = other.idPedido_;
          onChanged();
        }
        if (!other.getData().isEmpty()) {
          data_ = other.data_;
          onChanged();
        }
        if (other.getValor() != 0D) {
          setValor(other.getValor());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <pre>
       *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Identificação do pagamento em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object idPedido_ = "";
      /**
       * <pre>
       *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string idPedido = 2;</code>
       */
      public java.lang.String getIdPedido() {
        java.lang.Object ref = idPedido_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          idPedido_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string idPedido = 2;</code>
       */
      public com.google.protobuf.ByteString
          getIdPedidoBytes() {
        java.lang.Object ref = idPedido_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          idPedido_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string idPedido = 2;</code>
       */
      public Builder setIdPedido(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        idPedido_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string idPedido = 2;</code>
       */
      public Builder clearIdPedido() {
        
        idPedido_ = getDefaultInstance().getIdPedido();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Identificação do pedido em formato uuid. Ex.: 3185c802-a708-4455-9315-dbf095108d64
       * </pre>
       *
       * <code>string idPedido = 2;</code>
       */
      public Builder setIdPedidoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        idPedido_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object data_ = "";
      /**
       * <pre>
       *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
       * </pre>
       *
       * <code>string data = 3;</code>
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
       * </pre>
       *
       * <code>string data = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
       * </pre>
       *
       * <code>string data = 3;</code>
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
       * </pre>
       *
       * <code>string data = 3;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *A data do pedido no formato dd/MM/yyyy HH:mm:ss. Exemplo: 06/03/2007 13:44:25
       * </pre>
       *
       * <code>string data = 3;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        data_ = value;
        onChanged();
        return this;
      }

      private double valor_ ;
      /**
       * <pre>
       *Valor do pagamento 
       * </pre>
       *
       * <code>double valor = 4;</code>
       */
      public double getValor() {
        return valor_;
      }
      /**
       * <pre>
       *Valor do pagamento 
       * </pre>
       *
       * <code>double valor = 4;</code>
       */
      public Builder setValor(double value) {
        
        valor_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Valor do pagamento 
       * </pre>
       *
       * <code>double valor = 4;</code>
       */
      public Builder clearValor() {
        
        valor_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.github.infobarbosa.kafka.PagamentoAprovado)
    }

    // @@protoc_insertion_point(class_scope:com.github.infobarbosa.kafka.PagamentoAprovado)
    private static final com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado();
    }

    public static com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PagamentoAprovado>
        PARSER = new com.google.protobuf.AbstractParser<PagamentoAprovado>() {
      @java.lang.Override
      public PagamentoAprovado parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PagamentoAprovado(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PagamentoAprovado> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PagamentoAprovado> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.github.infobarbosa.kafka.PagamentoAprovadoOuterClass.PagamentoAprovado getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-main/resources/proto/pagamento-aprovad" +
      "o.proto\022\034com.github.infobarbosa.kafka\"N\n" +
      "\021PagamentoAprovado\022\n\n\002id\030\001 \001(\t\022\020\n\010idPedi" +
      "do\030\002 \001(\t\022\014\n\004data\030\003 \001(\t\022\r\n\005valor\030\004 \001(\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_infobarbosa_kafka_PagamentoAprovado_descriptor,
        new java.lang.String[] { "Id", "IdPedido", "Data", "Valor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
