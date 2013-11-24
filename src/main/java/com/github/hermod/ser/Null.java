package com.github.hermod.ser;

/**
 * <p>Null. </p>
 * 
 * @author anavarro - Oct 29, 2013
 * 
 */
public final class Null {

    private static final Null[] LENGTH_NULLS = new Null[30];

    private static final Null NULL = new Null(Type.NULL);
    private static final Null INTEGER_NULL = new Null(Type.INTEGER);
    private static final Null BYTE_NULL = new Null(Type.BYTE);
    private static final Null SHORT_NULL = new Null(Type.SHORT);
    private static final Null INT_NULL = new Null(Type.INT);
    private static final Null LONG_NULL = new Null(Type.LONG);
    private static final Null DECIMAL_NULL = new Null(Type.DECIMAL);
    private static final Null FLOAT_NULL = new Null(Type.FLOAT);
    private static final Null DOUBLE_NULL = new Null(Type.DOUBLE);
    private static final Null FIVE_BITS_DECIMAL_NULL = new Null(Type.FIVE_BITS_DECIMAL);
    private static final Null STRING_UTF8_NULL = new Null(Type.STRING_UTF8);
    private static final Null MSG_NULL = new Null(Type.MSG);
    private static final Null ARRAY_FIXED_VALUE_NULL = new Null(Type.ARRAY_FIXED_VALUE);
    private static final Null ARRAY_VARIABLE_VALUE_NULL = new Null(Type.ARRAY_VARIABLE_VALUE);

    static {
        for (int i = 0; i < LENGTH_NULLS.length; i++) {
            LENGTH_NULLS[i] = new Null(i);
        }
    }

    private final int length;
    private final Type type;

    /**
     * Constructor.
     * 
     * @param aLength
     */
    private Null(final int aLength) {
        super();
        if (aLength < 0) {
            throw new IllegalArgumentException("The length must be superior to 0.");
        }
        this.type = Type.NULL;
        this.length = aLength;
    }

    /**
     * Constructor.
     * 
     * @param aType
     */
    private Null(final Type aType) {
        super();
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
    }

    /**
     * getLength.
     * 
     * @return
     */
    public int getLength() {
        return this.length;
    }

    /**
     * getType.
     * 
     * @return
     */
    public Type getType() {
        return this.type;
    }

    /**
     * valueOf.
     * 
     * @param aLength
     * @return
     */
    public static Null valueOf(final int aLength) {
        try {
            return LENGTH_NULLS[aLength];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return new Null(aLength);
        }
    }

    /**
     * valueOf.
     *
     * @param aType
     * @return
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
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.length;
        return result;
    }

    /**
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Null other = (Null) obj;
        if (this.length != other.length)
            return false;
        return true;
    }

}
