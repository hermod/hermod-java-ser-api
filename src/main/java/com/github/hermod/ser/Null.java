package com.github.hermod.ser;

/**
 * <p>Null.</p>
 * 
 * The Class Null represents a Null field for a Msg with potential different length value.
 * 
 * @author anavarro - Oct 29, 2013
 * 
 */
public final class Null {

    /**
     * THIRTY.
     */
    private static final int    THIRTY                    = 30;

    /**
     * LENGTH_NULLS.
     */
    private static final Null[] LENGTH_NULLS              = new Null[THIRTY];

    /**
     * NULL.
     */
    public static final Null    NULL                      = new Null(Type.NULL);

    /**
     * INTEGER_NULL.
     */
    public static final Null    INTEGER_NULL              = new Null(Type.INTEGER);

    /**
     * BYTE_NULL.
     */
    public static final Null    BYTE_NULL                 = new Null(Type.BYTE);

    /**
     * SHORT_NULL.
     */
    public static final Null    SHORT_NULL                = new Null(Type.SHORT);

    /**
     * INT_NULL.
     */
    public static final Null    INT_NULL                  = new Null(Type.INT);

    /**
     * LONG_NULL.
     */
    public static final Null    LONG_NULL                 = new Null(Type.LONG);

    /**
     * DECIMAL_NULL.
     */
    public static final Null    DECIMAL_NULL              = new Null(Type.DECIMAL);

    /**
     * FLOAT_NULL.
     */
    public static final Null    FLOAT_NULL                = new Null(Type.FLOAT);

    /**
     * DOUBLE_NULL.
     */
    public static final Null    DOUBLE_NULL               = new Null(Type.DOUBLE);

    /**
     * FIVE_BITS_DECIMAL_NULL.
     */
    public static final Null    FIVE_BITS_DECIMAL_NULL    = new Null(Type.FIVE_BITS_DECIMAL);

    /**
     * STRING_UTF8_NULL.
     */
    public static final Null    STRING_UTF8_NULL          = new Null(Type.STRING_UTF8);

    /**
     * MSG_NULL.
     */
    public static final Null    MSG_NULL                  = new Null(Type.MSG);

    /**
     * ARRAY_FIXED_VALUE_NULL.
     */
    public static final Null    ARRAY_FIXED_VALUE_NULL    = new Null(Type.ARRAY_FIXED_VALUE);

    /**
     * ARRAY_VARIABLE_VALUE_NULL.
     */
    public static final Null    ARRAY_VARIABLE_VALUE_NULL = new Null(Type.ARRAY_VARIABLE_VALUE);

    static {
        LENGTH_NULLS[0] = NULL;
        for (int i = 1; i < LENGTH_NULLS.length; i++) {
            LENGTH_NULLS[i] = new Null(i);
        }
    }

    /**
     * length.
     */
    private final int           length;

    /**
     * type.
     */
    private final Type          type;

    /**
     * hashcode.
     */
    private final int           hashcode;

    /**
     * Constructor.
     * 
     * @param aLength the length of the Null field.
     */
    private Null(final int aLength) {
        super();
        if (aLength < 0) {
            throw new IllegalArgumentException("The length must be superior to 0.");
        }
        this.type = Type.NULL;
        this.length = aLength;
        this.hashcode = computeHashCode();
    }

    /**
     * Constructor.
     * 
     * @param aType the Type of the Null field.
     */
    private Null(final Type aType) {
        super();
        if (aType == null) {
            throw new IllegalArgumentException("The type must not be null.");
        }
        this.type = aType;
        switch (aType) {
            case BYTE:
                this.length = Types.ONE;
                break;
            case SHORT:
                this.length = Types.TWO;
                break;
            case INT:
                this.length = Types.FOUR;
                break;
            case LONG:
                this.length = Types.EIGHT;
                break;
            case FLOAT:
                this.length = Types.FOUR;
                break;
            case DOUBLE:
                this.length = Types.EIGHT;
                break;
            case FIVE_BITS_DECIMAL:
                this.length = Types.FIVE;
                break;
            default:
                this.length = Types.ZERO;
                break;
        }
        this.hashcode = computeHashCode();
    }

    /**
     * <p>getLength.</p>
     * 
     * @return the length of the Null Field.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * <p>getType.</p>
     * 
     * @return the Type
     */
    public Type getType() {
        return this.type;
    }

    /**
     * <p>valueOf (creation/retrieve of a Null).</p>
     * 
     * @param aLength The length of the Null Type.
     * @return the Null with a aLength.
     */
    @SuppressWarnings("all")
    public static Null valueOf(final int aLength) {
        try {
            return LENGTH_NULLS[aLength];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return new Null(aLength);
        }
    }

    /**
     * <p>valueOf (creation/retrieve of a Null).<p>
     * 
     * @param aType the Type of Null.
     * @return the Null object created/retrived.
     */
    public static Null valueOf(final Type aType) {
        if (aType == null) {
            throw new IllegalArgumentException("The Type must not be null.");
        }
        switch (aType) {
            case SKIPPED_KEYS:
                throw new IllegalArgumentException("This makes no sense to create a Null for type SKIPPED_KEYS_TYPE");
            case INTEGER:
                return INTEGER_NULL;
            case BYTE:
                return BYTE_NULL;
            case SHORT:
                return SHORT_NULL;
            case INT:
                return INT_NULL;
            case LONG:
                return LONG_NULL;
            case DECIMAL:
                return DECIMAL_NULL;
            case FLOAT:
                return FLOAT_NULL;
            case DOUBLE:
                return DOUBLE_NULL;
            case FIVE_BITS_DECIMAL:
                return FIVE_BITS_DECIMAL_NULL;
            case STRING_UTF8:
                return STRING_UTF8_NULL;
            case MSG:
                return MSG_NULL;
            case ARRAY_FIXED_VALUE:
                return ARRAY_FIXED_VALUE_NULL;
            case ARRAY_VARIABLE_VALUE:
                return ARRAY_VARIABLE_VALUE_NULL;
            default:
                return NULL;
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return this.hashcode;
    }

    /**
     * <p>computeHashCode.</p>
     * 
     * @return a hashcode
     */
    public int computeHashCode() {
        return (this.length << Types.EIGHT) | type.getId();
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        // TODO to change with Objects.equals when we will be in jdk 1.7
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Null other = (Null) obj;
        if (this.length != other.length) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Null [length=" + this.length + ", type=" + this.type + ", toString()=" + super.toString() + "]";
    }

}
