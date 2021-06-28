/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.sribaabu;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 41975485634389005L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"com.sribaabu\",\"fields\":[{\"name\":\"first_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"First Name of Employee\"},{\"name\":\"last_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Last Name of Employee\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"Age at the time of registration\"},{\"name\":\"height\",\"type\":\"float\",\"doc\":\"Height at the time of registration in cm\"},{\"name\":\"weight\",\"type\":\"float\",\"doc\":\"Weight at the time of registration in kg\"},{\"name\":\"city\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Primary City of the Employee\"},{\"name\":\"country\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Primary Country of the Employee\"},{\"name\":\"automated_email\",\"type\":\"boolean\",\"doc\":\"Field indicating if the user is enrolled in marketing emails\",\"default\":true}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Employee> ENCODER =
      new BinaryMessageEncoder<Employee>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Employee> DECODER =
      new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Employee> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Employee> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Employee to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Employee from a ByteBuffer. */
  public static Employee fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** First Name of Employee */
   private java.lang.String first_name;
  /** Last Name of Employee */
   private java.lang.String last_name;
  /** Age at the time of registration */
   private int age;
  /** Height at the time of registration in cm */
   private float height;
  /** Weight at the time of registration in kg */
   private float weight;
  /** Primary City of the Employee */
   private java.lang.String city;
  /** Primary Country of the Employee */
   private java.lang.String country;
  /** Field indicating if the user is enrolled in marketing emails */
   private boolean automated_email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Employee() {}

  /**
   * All-args constructor.
   * @param first_name First Name of Employee
   * @param last_name Last Name of Employee
   * @param age Age at the time of registration
   * @param height Height at the time of registration in cm
   * @param weight Weight at the time of registration in kg
   * @param city Primary City of the Employee
   * @param country Primary Country of the Employee
   * @param automated_email Field indicating if the user is enrolled in marketing emails
   */
  public Employee(java.lang.String first_name, java.lang.String last_name, java.lang.Integer age, java.lang.Float height, java.lang.Float weight, java.lang.String city, java.lang.String country, java.lang.Boolean automated_email) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.city = city;
    this.country = country;
    this.automated_email = automated_email;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return first_name;
    case 1: return last_name;
    case 2: return age;
    case 3: return height;
    case 4: return weight;
    case 5: return city;
    case 6: return country;
    case 7: return automated_email;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: first_name = (java.lang.String)value$; break;
    case 1: last_name = (java.lang.String)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: height = (java.lang.Float)value$; break;
    case 4: weight = (java.lang.Float)value$; break;
    case 5: city = (java.lang.String)value$; break;
    case 6: country = (java.lang.String)value$; break;
    case 7: automated_email = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'first_name' field.
   * @return First Name of Employee
   */
  public java.lang.String getFirstName() {
    return first_name;
  }


  /**
   * Gets the value of the 'last_name' field.
   * @return Last Name of Employee
   */
  public java.lang.String getLastName() {
    return last_name;
  }


  /**
   * Gets the value of the 'age' field.
   * @return Age at the time of registration
   */
  public java.lang.Integer getAge() {
    return age;
  }


  /**
   * Gets the value of the 'height' field.
   * @return Height at the time of registration in cm
   */
  public java.lang.Float getHeight() {
    return height;
  }


  /**
   * Gets the value of the 'weight' field.
   * @return Weight at the time of registration in kg
   */
  public java.lang.Float getWeight() {
    return weight;
  }


  /**
   * Gets the value of the 'city' field.
   * @return Primary City of the Employee
   */
  public java.lang.String getCity() {
    return city;
  }


  /**
   * Gets the value of the 'country' field.
   * @return Primary Country of the Employee
   */
  public java.lang.String getCountry() {
    return country;
  }


  /**
   * Gets the value of the 'automated_email' field.
   * @return Field indicating if the user is enrolled in marketing emails
   */
  public java.lang.Boolean getAutomatedEmail() {
    return automated_email;
  }


  /**
   * Creates a new Employee RecordBuilder.
   * @return A new Employee RecordBuilder
   */
  public static com.sribaabu.Employee.Builder newBuilder() {
    return new com.sribaabu.Employee.Builder();
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Employee RecordBuilder
   */
  public static com.sribaabu.Employee.Builder newBuilder(com.sribaabu.Employee.Builder other) {
    return new com.sribaabu.Employee.Builder(other);
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Employee instance.
   * @param other The existing instance to copy.
   * @return A new Employee RecordBuilder
   */
  public static com.sribaabu.Employee.Builder newBuilder(com.sribaabu.Employee other) {
    return new com.sribaabu.Employee.Builder(other);
  }

  /**
   * RecordBuilder for Employee instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
    implements org.apache.avro.data.RecordBuilder<Employee> {

    /** First Name of Employee */
    private java.lang.String first_name;
    /** Last Name of Employee */
    private java.lang.String last_name;
    /** Age at the time of registration */
    private int age;
    /** Height at the time of registration in cm */
    private float height;
    /** Weight at the time of registration in kg */
    private float weight;
    /** Primary City of the Employee */
    private java.lang.String city;
    /** Primary Country of the Employee */
    private java.lang.String country;
    /** Field indicating if the user is enrolled in marketing emails */
    private boolean automated_email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.sribaabu.Employee.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.city)) {
        this.city = data().deepCopy(fields()[5].schema(), other.city);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.country)) {
        this.country = data().deepCopy(fields()[6].schema(), other.country);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.automated_email)) {
        this.automated_email = data().deepCopy(fields()[7].schema(), other.automated_email);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Employee instance
     * @param other The existing instance to copy.
     */
    private Builder(com.sribaabu.Employee other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.city)) {
        this.city = data().deepCopy(fields()[5].schema(), other.city);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.country)) {
        this.country = data().deepCopy(fields()[6].schema(), other.country);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.automated_email)) {
        this.automated_email = data().deepCopy(fields()[7].schema(), other.automated_email);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'first_name' field.
      * First Name of Employee
      * @return The value.
      */
    public java.lang.String getFirstName() {
      return first_name;
    }

    /**
      * Sets the value of the 'first_name' field.
      * First Name of Employee
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setFirstName(java.lang.String value) {
      validate(fields()[0], value);
      this.first_name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * First Name of Employee
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'first_name' field.
      * First Name of Employee
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * Last Name of Employee
      * @return The value.
      */
    public java.lang.String getLastName() {
      return last_name;
    }

    /**
      * Sets the value of the 'last_name' field.
      * Last Name of Employee
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setLastName(java.lang.String value) {
      validate(fields()[1], value);
      this.last_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * Last Name of Employee
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'last_name' field.
      * Last Name of Employee
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Age at the time of registration
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Age at the time of registration
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * Age at the time of registration
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * Age at the time of registration
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * Height at the time of registration in cm
      * @return The value.
      */
    public java.lang.Float getHeight() {
      return height;
    }

    /**
      * Sets the value of the 'height' field.
      * Height at the time of registration in cm
      * @param value The value of 'height'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setHeight(float value) {
      validate(fields()[3], value);
      this.height = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * Height at the time of registration in cm
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'height' field.
      * Height at the time of registration in cm
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearHeight() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @return The value.
      */
    public java.lang.Float getWeight() {
      return weight;
    }

    /**
      * Sets the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @param value The value of 'weight'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setWeight(float value) {
      validate(fields()[4], value);
      this.weight = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'weight' field has been set.
      * Weight at the time of registration in kg
      * @return True if the 'weight' field has been set, false otherwise.
      */
    public boolean hasWeight() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearWeight() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * Primary City of the Employee
      * @return The value.
      */
    public java.lang.String getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * Primary City of the Employee
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setCity(java.lang.String value) {
      validate(fields()[5], value);
      this.city = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * Primary City of the Employee
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'city' field.
      * Primary City of the Employee
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearCity() {
      city = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * Primary Country of the Employee
      * @return The value.
      */
    public java.lang.String getCountry() {
      return country;
    }

    /**
      * Sets the value of the 'country' field.
      * Primary Country of the Employee
      * @param value The value of 'country'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setCountry(java.lang.String value) {
      validate(fields()[6], value);
      this.country = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * Primary Country of the Employee
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'country' field.
      * Primary Country of the Employee
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearCountry() {
      country = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'automated_email' field.
      * Field indicating if the user is enrolled in marketing emails
      * @return The value.
      */
    public java.lang.Boolean getAutomatedEmail() {
      return automated_email;
    }

    /**
      * Sets the value of the 'automated_email' field.
      * Field indicating if the user is enrolled in marketing emails
      * @param value The value of 'automated_email'.
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder setAutomatedEmail(boolean value) {
      validate(fields()[7], value);
      this.automated_email = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'automated_email' field has been set.
      * Field indicating if the user is enrolled in marketing emails
      * @return True if the 'automated_email' field has been set, false otherwise.
      */
    public boolean hasAutomatedEmail() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'automated_email' field.
      * Field indicating if the user is enrolled in marketing emails
      * @return This builder.
      */
    public com.sribaabu.Employee.Builder clearAutomatedEmail() {
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Employee build() {
      try {
        Employee record = new Employee();
        record.first_name = fieldSetFlags()[0] ? this.first_name : (java.lang.String) defaultValue(fields()[0]);
        record.last_name = fieldSetFlags()[1] ? this.last_name : (java.lang.String) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.height = fieldSetFlags()[3] ? this.height : (java.lang.Float) defaultValue(fields()[3]);
        record.weight = fieldSetFlags()[4] ? this.weight : (java.lang.Float) defaultValue(fields()[4]);
        record.city = fieldSetFlags()[5] ? this.city : (java.lang.String) defaultValue(fields()[5]);
        record.country = fieldSetFlags()[6] ? this.country : (java.lang.String) defaultValue(fields()[6]);
        record.automated_email = fieldSetFlags()[7] ? this.automated_email : (java.lang.Boolean) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Employee>
    WRITER$ = (org.apache.avro.io.DatumWriter<Employee>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Employee>
    READER$ = (org.apache.avro.io.DatumReader<Employee>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
