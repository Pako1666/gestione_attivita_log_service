/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package it.gestore_attivita.log_service.kafka.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AttivitaRequestGenerated extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5063135824262778237L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AttivitaRequestGenerated\",\"namespace\":\"it.gestore_attivita.log_service.kafka.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"alias\",\"type\":\"string\",\"avro.java.string\":\"String\"},{\"name\":\"lavorata\",\"type\":\"boolean\"},{\"name\":\"attivitaPadre\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AttivitaRequestGenerated> ENCODER =
      new BinaryMessageEncoder<AttivitaRequestGenerated>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AttivitaRequestGenerated> DECODER =
      new BinaryMessageDecoder<AttivitaRequestGenerated>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AttivitaRequestGenerated> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AttivitaRequestGenerated> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AttivitaRequestGenerated> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AttivitaRequestGenerated>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AttivitaRequestGenerated to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AttivitaRequestGenerated from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AttivitaRequestGenerated instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AttivitaRequestGenerated fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long id;
   private java.lang.CharSequence alias;
   private boolean lavorata;
   private java.lang.Long attivitaPadre;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AttivitaRequestGenerated() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param alias The new value for alias
   * @param lavorata The new value for lavorata
   * @param attivitaPadre The new value for attivitaPadre
   */
  public AttivitaRequestGenerated(java.lang.Long id, java.lang.CharSequence alias, java.lang.Boolean lavorata, java.lang.Long attivitaPadre) {
    this.id = id;
    this.alias = alias;
    this.lavorata = lavorata;
    this.attivitaPadre = attivitaPadre;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return alias;
    case 2: return lavorata;
    case 3: return attivitaPadre;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: alias = (java.lang.CharSequence)value$; break;
    case 2: lavorata = (java.lang.Boolean)value$; break;
    case 3: attivitaPadre = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'alias' field.
   * @return The value of the 'alias' field.
   */
  public java.lang.CharSequence getAlias() {
    return alias;
  }


  /**
   * Sets the value of the 'alias' field.
   * @param value the value to set.
   */
  public void setAlias(java.lang.CharSequence value) {
    this.alias = value;
  }

  /**
   * Gets the value of the 'lavorata' field.
   * @return The value of the 'lavorata' field.
   */
  public boolean getLavorata() {
    return lavorata;
  }


  /**
   * Sets the value of the 'lavorata' field.
   * @param value the value to set.
   */
  public void setLavorata(boolean value) {
    this.lavorata = value;
  }

  /**
   * Gets the value of the 'attivitaPadre' field.
   * @return The value of the 'attivitaPadre' field.
   */
  public java.lang.Long getAttivitaPadre() {
    return attivitaPadre;
  }


  /**
   * Sets the value of the 'attivitaPadre' field.
   * @param value the value to set.
   */
  public void setAttivitaPadre(java.lang.Long value) {
    this.attivitaPadre = value;
  }

  /**
   * Creates a new AttivitaRequestGenerated RecordBuilder.
   * @return A new AttivitaRequestGenerated RecordBuilder
   */
  public static it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder newBuilder() {
    return new it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder();
  }

  /**
   * Creates a new AttivitaRequestGenerated RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AttivitaRequestGenerated RecordBuilder
   */
  public static it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder newBuilder(it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder other) {
    if (other == null) {
      return new it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder();
    } else {
      return new it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder(other);
    }
  }

  /**
   * Creates a new AttivitaRequestGenerated RecordBuilder by copying an existing AttivitaRequestGenerated instance.
   * @param other The existing instance to copy.
   * @return A new AttivitaRequestGenerated RecordBuilder
   */
  public static it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder newBuilder(it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated other) {
    if (other == null) {
      return new it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder();
    } else {
      return new it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder(other);
    }
  }

  /**
   * RecordBuilder for AttivitaRequestGenerated instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AttivitaRequestGenerated>
    implements org.apache.avro.data.RecordBuilder<AttivitaRequestGenerated> {

    private long id;
    private java.lang.CharSequence alias;
    private boolean lavorata;
    private java.lang.Long attivitaPadre;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.alias)) {
        this.alias = data().deepCopy(fields()[1].schema(), other.alias);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.lavorata)) {
        this.lavorata = data().deepCopy(fields()[2].schema(), other.lavorata);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.attivitaPadre)) {
        this.attivitaPadre = data().deepCopy(fields()[3].schema(), other.attivitaPadre);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing AttivitaRequestGenerated instance
     * @param other The existing instance to copy.
     */
    private Builder(it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.alias)) {
        this.alias = data().deepCopy(fields()[1].schema(), other.alias);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lavorata)) {
        this.lavorata = data().deepCopy(fields()[2].schema(), other.lavorata);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.attivitaPadre)) {
        this.attivitaPadre = data().deepCopy(fields()[3].schema(), other.attivitaPadre);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'alias' field.
      * @return The value.
      */
    public java.lang.CharSequence getAlias() {
      return alias;
    }


    /**
      * Sets the value of the 'alias' field.
      * @param value The value of 'alias'.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder setAlias(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.alias = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'alias' field has been set.
      * @return True if the 'alias' field has been set, false otherwise.
      */
    public boolean hasAlias() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'alias' field.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder clearAlias() {
      alias = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lavorata' field.
      * @return The value.
      */
    public boolean getLavorata() {
      return lavorata;
    }


    /**
      * Sets the value of the 'lavorata' field.
      * @param value The value of 'lavorata'.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder setLavorata(boolean value) {
      validate(fields()[2], value);
      this.lavorata = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lavorata' field has been set.
      * @return True if the 'lavorata' field has been set, false otherwise.
      */
    public boolean hasLavorata() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lavorata' field.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder clearLavorata() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'attivitaPadre' field.
      * @return The value.
      */
    public java.lang.Long getAttivitaPadre() {
      return attivitaPadre;
    }


    /**
      * Sets the value of the 'attivitaPadre' field.
      * @param value The value of 'attivitaPadre'.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder setAttivitaPadre(java.lang.Long value) {
      validate(fields()[3], value);
      this.attivitaPadre = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'attivitaPadre' field has been set.
      * @return True if the 'attivitaPadre' field has been set, false otherwise.
      */
    public boolean hasAttivitaPadre() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'attivitaPadre' field.
      * @return This builder.
      */
    public it.gestore_attivita.log_service.kafka.avro.AttivitaRequestGenerated.Builder clearAttivitaPadre() {
      attivitaPadre = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AttivitaRequestGenerated build() {
      try {
        AttivitaRequestGenerated record = new AttivitaRequestGenerated();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.alias = fieldSetFlags()[1] ? this.alias : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lavorata = fieldSetFlags()[2] ? this.lavorata : (java.lang.Boolean) defaultValue(fields()[2]);
        record.attivitaPadre = fieldSetFlags()[3] ? this.attivitaPadre : (java.lang.Long) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AttivitaRequestGenerated>
    WRITER$ = (org.apache.avro.io.DatumWriter<AttivitaRequestGenerated>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AttivitaRequestGenerated>
    READER$ = (org.apache.avro.io.DatumReader<AttivitaRequestGenerated>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.alias);

    out.writeBoolean(this.lavorata);

    if (this.attivitaPadre == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.attivitaPadre);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.alias = in.readString(this.alias instanceof Utf8 ? (Utf8)this.alias : null);

      this.lavorata = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.attivitaPadre = null;
      } else {
        this.attivitaPadre = in.readLong();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.alias = in.readString(this.alias instanceof Utf8 ? (Utf8)this.alias : null);
          break;

        case 2:
          this.lavorata = in.readBoolean();
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.attivitaPadre = null;
          } else {
            this.attivitaPadre = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










