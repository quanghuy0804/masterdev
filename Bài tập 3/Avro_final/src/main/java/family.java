/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package src.main.java;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class family extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2276437650118843934L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"family\",\"namespace\":\"src.main.java\",\"fields\":[{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"phonenumber\",\"type\":\"int\"},{\"name\":\"culture\",\"type\":\"boolean\"},{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"Memlist\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Member\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<family> ENCODER =
      new BinaryMessageEncoder<family>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<family> DECODER =
      new BinaryMessageDecoder<family>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<family> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<family> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<family> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<family>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this family to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a family from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a family instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static family fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence host;
  private int id;
  private int phonenumber;
  private boolean culture;
  private java.lang.CharSequence address;
  private java.util.List<src.main.java.Member> Memlist;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public family() {}

  /**
   * All-args constructor.
   * @param host The new value for host
   * @param id The new value for id
   * @param phonenumber The new value for phonenumber
   * @param culture The new value for culture
   * @param address The new value for address
   * @param Memlist The new value for Memlist
   */
  public family(java.lang.CharSequence host, java.lang.Integer id, java.lang.Integer phonenumber, java.lang.Boolean culture, java.lang.CharSequence address, java.util.List<src.main.java.Member> Memlist) {
    this.host = host;
    this.id = id;
    this.phonenumber = phonenumber;
    this.culture = culture;
    this.address = address;
    this.Memlist = Memlist;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return host;
    case 1: return id;
    case 2: return phonenumber;
    case 3: return culture;
    case 4: return address;
    case 5: return Memlist;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: host = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.Integer)value$; break;
    case 2: phonenumber = (java.lang.Integer)value$; break;
    case 3: culture = (java.lang.Boolean)value$; break;
    case 4: address = (java.lang.CharSequence)value$; break;
    case 5: Memlist = (java.util.List<src.main.java.Member>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'host' field.
   * @return The value of the 'host' field.
   */
  public java.lang.CharSequence getHost() {
    return host;
  }


  /**
   * Sets the value of the 'host' field.
   * @param value the value to set.
   */
  public void setHost(java.lang.CharSequence value) {
    this.host = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public int getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(int value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'phonenumber' field.
   * @return The value of the 'phonenumber' field.
   */
  public int getPhonenumber() {
    return phonenumber;
  }


  /**
   * Sets the value of the 'phonenumber' field.
   * @param value the value to set.
   */
  public void setPhonenumber(int value) {
    this.phonenumber = value;
  }

  /**
   * Gets the value of the 'culture' field.
   * @return The value of the 'culture' field.
   */
  public boolean getCulture() {
    return culture;
  }


  /**
   * Sets the value of the 'culture' field.
   * @param value the value to set.
   */
  public void setCulture(boolean value) {
    this.culture = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }


  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'Memlist' field.
   * @return The value of the 'Memlist' field.
   */
  public java.util.List<src.main.java.Member> getMemlist() {
    return Memlist;
  }


  /**
   * Sets the value of the 'Memlist' field.
   * @param value the value to set.
   */
  public void setMemlist(java.util.List<src.main.java.Member> value) {
    this.Memlist = value;
  }

  /**
   * Creates a new family RecordBuilder.
   * @return A new family RecordBuilder
   */
  public static src.main.java.family.Builder newBuilder() {
    return new src.main.java.family.Builder();
  }

  /**
   * Creates a new family RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new family RecordBuilder
   */
  public static src.main.java.family.Builder newBuilder(src.main.java.family.Builder other) {
    if (other == null) {
      return new src.main.java.family.Builder();
    } else {
      return new src.main.java.family.Builder(other);
    }
  }

  /**
   * Creates a new family RecordBuilder by copying an existing family instance.
   * @param other The existing instance to copy.
   * @return A new family RecordBuilder
   */
  public static src.main.java.family.Builder newBuilder(src.main.java.family other) {
    if (other == null) {
      return new src.main.java.family.Builder();
    } else {
      return new src.main.java.family.Builder(other);
    }
  }

  /**
   * RecordBuilder for family instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<family>
    implements org.apache.avro.data.RecordBuilder<family> {

    private java.lang.CharSequence host;
    private int id;
    private int phonenumber;
    private boolean culture;
    private java.lang.CharSequence address;
    private java.util.List<src.main.java.Member> Memlist;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(src.main.java.family.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.phonenumber)) {
        this.phonenumber = data().deepCopy(fields()[2].schema(), other.phonenumber);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.culture)) {
        this.culture = data().deepCopy(fields()[3].schema(), other.culture);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.Memlist)) {
        this.Memlist = data().deepCopy(fields()[5].schema(), other.Memlist);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing family instance
     * @param other The existing instance to copy.
     */
    private Builder(src.main.java.family other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.phonenumber)) {
        this.phonenumber = data().deepCopy(fields()[2].schema(), other.phonenumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.culture)) {
        this.culture = data().deepCopy(fields()[3].schema(), other.culture);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Memlist)) {
        this.Memlist = data().deepCopy(fields()[5].schema(), other.Memlist);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'host' field.
      * @return The value.
      */
    public java.lang.CharSequence getHost() {
      return host;
    }


    /**
      * Sets the value of the 'host' field.
      * @param value The value of 'host'.
      * @return This builder.
      */
    public src.main.java.family.Builder setHost(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.host = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'host' field has been set.
      * @return True if the 'host' field has been set, false otherwise.
      */
    public boolean hasHost() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'host' field.
      * @return This builder.
      */
    public src.main.java.family.Builder clearHost() {
      host = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public int getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public src.main.java.family.Builder setId(int value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public src.main.java.family.Builder clearId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'phonenumber' field.
      * @return The value.
      */
    public int getPhonenumber() {
      return phonenumber;
    }


    /**
      * Sets the value of the 'phonenumber' field.
      * @param value The value of 'phonenumber'.
      * @return This builder.
      */
    public src.main.java.family.Builder setPhonenumber(int value) {
      validate(fields()[2], value);
      this.phonenumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'phonenumber' field has been set.
      * @return True if the 'phonenumber' field has been set, false otherwise.
      */
    public boolean hasPhonenumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'phonenumber' field.
      * @return This builder.
      */
    public src.main.java.family.Builder clearPhonenumber() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'culture' field.
      * @return The value.
      */
    public boolean getCulture() {
      return culture;
    }


    /**
      * Sets the value of the 'culture' field.
      * @param value The value of 'culture'.
      * @return This builder.
      */
    public src.main.java.family.Builder setCulture(boolean value) {
      validate(fields()[3], value);
      this.culture = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'culture' field has been set.
      * @return True if the 'culture' field has been set, false otherwise.
      */
    public boolean hasCulture() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'culture' field.
      * @return This builder.
      */
    public src.main.java.family.Builder clearCulture() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }


    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public src.main.java.family.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.address = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public src.main.java.family.Builder clearAddress() {
      address = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'Memlist' field.
      * @return The value.
      */
    public java.util.List<src.main.java.Member> getMemlist() {
      return Memlist;
    }


    /**
      * Sets the value of the 'Memlist' field.
      * @param value The value of 'Memlist'.
      * @return This builder.
      */
    public src.main.java.family.Builder setMemlist(java.util.List<src.main.java.Member> value) {
      validate(fields()[5], value);
      this.Memlist = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'Memlist' field has been set.
      * @return True if the 'Memlist' field has been set, false otherwise.
      */
    public boolean hasMemlist() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'Memlist' field.
      * @return This builder.
      */
    public src.main.java.family.Builder clearMemlist() {
      Memlist = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public family build() {
      try {
        family record = new family();
        record.host = fieldSetFlags()[0] ? this.host : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.Integer) defaultValue(fields()[1]);
        record.phonenumber = fieldSetFlags()[2] ? this.phonenumber : (java.lang.Integer) defaultValue(fields()[2]);
        record.culture = fieldSetFlags()[3] ? this.culture : (java.lang.Boolean) defaultValue(fields()[3]);
        record.address = fieldSetFlags()[4] ? this.address : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.Memlist = fieldSetFlags()[5] ? this.Memlist : (java.util.List<src.main.java.Member>) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<family>
    WRITER$ = (org.apache.avro.io.DatumWriter<family>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<family>
    READER$ = (org.apache.avro.io.DatumReader<family>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.host);

    out.writeInt(this.id);

    out.writeInt(this.phonenumber);

    out.writeBoolean(this.culture);

    out.writeString(this.address);

    long size0 = this.Memlist.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (src.main.java.Member e0: this.Memlist) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.host = in.readString(this.host instanceof Utf8 ? (Utf8)this.host : null);

      this.id = in.readInt();

      this.phonenumber = in.readInt();

      this.culture = in.readBoolean();

      this.address = in.readString(this.address instanceof Utf8 ? (Utf8)this.address : null);

      long size0 = in.readArrayStart();
      java.util.List<src.main.java.Member> a0 = this.Memlist;
      if (a0 == null) {
        a0 = new SpecificData.Array<src.main.java.Member>((int)size0, SCHEMA$.getField("Memlist").schema());
        this.Memlist = a0;
      } else a0.clear();
      SpecificData.Array<src.main.java.Member> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<src.main.java.Member>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          src.main.java.Member e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new src.main.java.Member();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.host = in.readString(this.host instanceof Utf8 ? (Utf8)this.host : null);
          break;

        case 1:
          this.id = in.readInt();
          break;

        case 2:
          this.phonenumber = in.readInt();
          break;

        case 3:
          this.culture = in.readBoolean();
          break;

        case 4:
          this.address = in.readString(this.address instanceof Utf8 ? (Utf8)this.address : null);
          break;

        case 5:
          long size0 = in.readArrayStart();
          java.util.List<src.main.java.Member> a0 = this.Memlist;
          if (a0 == null) {
            a0 = new SpecificData.Array<src.main.java.Member>((int)size0, SCHEMA$.getField("Memlist").schema());
            this.Memlist = a0;
          } else a0.clear();
          SpecificData.Array<src.main.java.Member> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<src.main.java.Member>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              src.main.java.Member e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new src.main.java.Member();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










