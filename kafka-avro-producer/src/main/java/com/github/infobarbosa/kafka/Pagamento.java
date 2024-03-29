/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.github.infobarbosa.kafka;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Pagamento extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5914566347356949976L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pagamento\",\"namespace\":\"com.github.infobarbosa.kafka\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"identificação do pagamento\",\"logicalType\":\"uuid\"},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"Status\",\"symbols\":[\"APROVADO\",\"RECUSADO\",\"SOLICITADO\"]}],\"doc\":\"status do pagamento\"},{\"name\":\"idPedido\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"identificação do pedido a que o pagamento se refere\",\"logicalType\":\"uuid\"},{\"name\":\"data\",\"type\":\"long\",\"doc\":\"data/hora do pagamento\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"valor\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"valor do pagamento\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Pagamento> ENCODER =
      new BinaryMessageEncoder<Pagamento>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Pagamento> DECODER =
      new BinaryMessageDecoder<Pagamento>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Pagamento> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Pagamento> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Pagamento> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Pagamento>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Pagamento to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Pagamento from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Pagamento instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Pagamento fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** identificação do pagamento */
   private java.lang.String id;
  /** status do pagamento */
   private com.github.infobarbosa.kafka.Status status;
  /** identificação do pedido a que o pagamento se refere */
   private java.lang.String idPedido;
  /** data/hora do pagamento */
   private long data;
  /** valor do pagamento */
   private java.lang.String valor;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Pagamento() {}

  /**
   * All-args constructor.
   * @param id identificação do pagamento
   * @param status status do pagamento
   * @param idPedido identificação do pedido a que o pagamento se refere
   * @param data data/hora do pagamento
   * @param valor valor do pagamento
   */
  public Pagamento(java.lang.String id, com.github.infobarbosa.kafka.Status status, java.lang.String idPedido, java.lang.Long data, java.lang.String valor) {
    this.id = id;
    this.status = status;
    this.idPedido = idPedido;
    this.data = data;
    this.valor = valor;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return status;
    case 2: return idPedido;
    case 3: return data;
    case 4: return valor;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = value$ != null ? value$.toString() : null; break;
    case 1: status = (com.github.infobarbosa.kafka.Status)value$; break;
    case 2: idPedido = value$ != null ? value$.toString() : null; break;
    case 3: data = (java.lang.Long)value$; break;
    case 4: valor = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return identificação do pagamento
   */
  public java.lang.String getId() {
    return id;
  }



  /**
   * Gets the value of the 'status' field.
   * @return status do pagamento
   */
  public com.github.infobarbosa.kafka.Status getStatus() {
    return status;
  }



  /**
   * Gets the value of the 'idPedido' field.
   * @return identificação do pedido a que o pagamento se refere
   */
  public java.lang.String getIdPedido() {
    return idPedido;
  }



  /**
   * Gets the value of the 'data' field.
   * @return data/hora do pagamento
   */
  public long getData() {
    return data;
  }



  /**
   * Gets the value of the 'valor' field.
   * @return valor do pagamento
   */
  public java.lang.String getValor() {
    return valor;
  }



  /**
   * Creates a new Pagamento RecordBuilder.
   * @return A new Pagamento RecordBuilder
   */
  public static com.github.infobarbosa.kafka.Pagamento.Builder newBuilder() {
    return new com.github.infobarbosa.kafka.Pagamento.Builder();
  }

  /**
   * Creates a new Pagamento RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Pagamento RecordBuilder
   */
  public static com.github.infobarbosa.kafka.Pagamento.Builder newBuilder(com.github.infobarbosa.kafka.Pagamento.Builder other) {
    if (other == null) {
      return new com.github.infobarbosa.kafka.Pagamento.Builder();
    } else {
      return new com.github.infobarbosa.kafka.Pagamento.Builder(other);
    }
  }

  /**
   * Creates a new Pagamento RecordBuilder by copying an existing Pagamento instance.
   * @param other The existing instance to copy.
   * @return A new Pagamento RecordBuilder
   */
  public static com.github.infobarbosa.kafka.Pagamento.Builder newBuilder(com.github.infobarbosa.kafka.Pagamento other) {
    if (other == null) {
      return new com.github.infobarbosa.kafka.Pagamento.Builder();
    } else {
      return new com.github.infobarbosa.kafka.Pagamento.Builder(other);
    }
  }

  /**
   * RecordBuilder for Pagamento instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pagamento>
    implements org.apache.avro.data.RecordBuilder<Pagamento> {

    /** identificação do pagamento */
    private java.lang.String id;
    /** status do pagamento */
    private com.github.infobarbosa.kafka.Status status;
    /** identificação do pedido a que o pagamento se refere */
    private java.lang.String idPedido;
    /** data/hora do pagamento */
    private long data;
    /** valor do pagamento */
    private java.lang.String valor;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.github.infobarbosa.kafka.Pagamento.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.idPedido)) {
        this.idPedido = data().deepCopy(fields()[2].schema(), other.idPedido);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.valor)) {
        this.valor = data().deepCopy(fields()[4].schema(), other.valor);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Pagamento instance
     * @param other The existing instance to copy.
     */
    private Builder(com.github.infobarbosa.kafka.Pagamento other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.idPedido)) {
        this.idPedido = data().deepCopy(fields()[2].schema(), other.idPedido);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.valor)) {
        this.valor = data().deepCopy(fields()[4].schema(), other.valor);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * identificação do pagamento
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * identificação do pagamento
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * identificação do pagamento
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * identificação do pagamento
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * status do pagamento
      * @return The value.
      */
    public com.github.infobarbosa.kafka.Status getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * status do pagamento
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder setStatus(com.github.infobarbosa.kafka.Status value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * status do pagamento
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'status' field.
      * status do pagamento
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'idPedido' field.
      * identificação do pedido a que o pagamento se refere
      * @return The value.
      */
    public java.lang.String getIdPedido() {
      return idPedido;
    }


    /**
      * Sets the value of the 'idPedido' field.
      * identificação do pedido a que o pagamento se refere
      * @param value The value of 'idPedido'.
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder setIdPedido(java.lang.String value) {
      validate(fields()[2], value);
      this.idPedido = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'idPedido' field has been set.
      * identificação do pedido a que o pagamento se refere
      * @return True if the 'idPedido' field has been set, false otherwise.
      */
    public boolean hasIdPedido() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'idPedido' field.
      * identificação do pedido a que o pagamento se refere
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder clearIdPedido() {
      idPedido = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * data/hora do pagamento
      * @return The value.
      */
    public long getData() {
      return data;
    }


    /**
      * Sets the value of the 'data' field.
      * data/hora do pagamento
      * @param value The value of 'data'.
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder setData(long value) {
      validate(fields()[3], value);
      this.data = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * data/hora do pagamento
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'data' field.
      * data/hora do pagamento
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder clearData() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'valor' field.
      * valor do pagamento
      * @return The value.
      */
    public java.lang.String getValor() {
      return valor;
    }


    /**
      * Sets the value of the 'valor' field.
      * valor do pagamento
      * @param value The value of 'valor'.
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder setValor(java.lang.String value) {
      validate(fields()[4], value);
      this.valor = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'valor' field has been set.
      * valor do pagamento
      * @return True if the 'valor' field has been set, false otherwise.
      */
    public boolean hasValor() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'valor' field.
      * valor do pagamento
      * @return This builder.
      */
    public com.github.infobarbosa.kafka.Pagamento.Builder clearValor() {
      valor = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Pagamento build() {
      try {
        Pagamento record = new Pagamento();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (com.github.infobarbosa.kafka.Status) defaultValue(fields()[1]);
        record.idPedido = fieldSetFlags()[2] ? this.idPedido : (java.lang.String) defaultValue(fields()[2]);
        record.data = fieldSetFlags()[3] ? this.data : (java.lang.Long) defaultValue(fields()[3]);
        record.valor = fieldSetFlags()[4] ? this.valor : (java.lang.String) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Pagamento>
    WRITER$ = (org.apache.avro.io.DatumWriter<Pagamento>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Pagamento>
    READER$ = (org.apache.avro.io.DatumReader<Pagamento>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    if (this.status == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.status.ordinal());
    }

    out.writeString(this.idPedido);

    out.writeLong(this.data);

    out.writeString(this.valor);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.status = null;
      } else {
        this.status = com.github.infobarbosa.kafka.Status.values()[in.readEnum()];
      }

      this.idPedido = in.readString();

      this.data = in.readLong();

      this.valor = in.readString();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString();
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.status = null;
          } else {
            this.status = com.github.infobarbosa.kafka.Status.values()[in.readEnum()];
          }
          break;

        case 2:
          this.idPedido = in.readString();
          break;

        case 3:
          this.data = in.readLong();
          break;

        case 4:
          this.valor = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










