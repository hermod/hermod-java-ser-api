package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>Type.</p>
 * 
 * The enum Type represents the different potential types of a field of the Msg : Null, SkippedKeys (technical type), Integer(boolean, byte, short,
 * int, long), Decimal (float, double), String (UTF8), Msg (a unsigned int/Value Map), Array with fixed size Values, Array with variable size Values.
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum Type {

    /**
     * NULL.
     */
    NULL(Types.NULL_TYPE),

    /**
     * SKIPPED_KEYS.
     */
    SKIPPED_KEYS(Types.SKIPPED_KEYS_TYPE),

    /**
     * INTEGER.
     */
    INTEGER(Types.INTEGER_TYPE),

    /**
     * BYTE.
     */
    BYTE(Types.BYTE_TYPE),

    /**
     * SHORT.
     */
    SHORT(Types.SHORT_TYPE),

    /**
     * INT.
     */
    INT(Types.INT_TYPE),

    /**
     * LONG.
     */
    LONG(Types.LONG_TYPE),

    /**
     * DECIMAL.
     */
    DECIMAL(Types.DECIMAL_TYPE),

    /**
     * FLOAT.
     */
    FLOAT(Types.FLOAT_TYPE),

    /**
     * DOUBLE.
     */
    DOUBLE(Types.DOUBLE_TYPE),

    /**
     * FIVE_BITS_DECIMAL.
     */
    FIVE_BITS_DECIMAL(Types.FIVE_BITS_DECIMAL_TYPE),

    /**
     * STRING_UTF8.
     */
    STRING_UTF8(Types.STRING_UTF_8_TYPE),

    /**
     * MSG.
     */
    MSG(Types.MSG_TYPE),

    /**
     * ARRAY_FIXED_VALUE.
     */
    ARRAY_FIXED_VALUE(Types.ARRAY_FIXED_VALUE_TYPE),

    /**
     * ARRAY_VARIABLE_VALUE.
     */
    ARRAY_VARIABLE_VALUE(Types.ARRAY_VARIABLE_VALUE_TYPE);

    /**
     * id.
     */
    private final byte id;

    /**
     * Constructor.
     * 
     * @param aId the id of the type.
     */
    private Type(final byte aId) {
        this.id = aId;
    }

    /**
     * <p>getId.</p>
     * 
     * @return the byte representing the id of the type.
     */
    public final byte getId() {
        return this.id;
    }

    /**
     * <p>get5ShiftId.</p>
     * 
     * @return the byte representing the type shifted by 5 (only type, no length)
     */
    public final byte getShiftId() {
        return (byte) (this.id >> Types.FIVE);
    }

    /**
     * <p>valueOf</p> (creation/retrieve of a Type).
     * 
     * @param aId a byte representing the id of the Type which wants to retrieve.
     * @return the Type
     */
    public static Type valueOf(final byte aId) {
        for (final Type type : Type.values()) {
            if (type.getId() == aId) {
                return type;
            }
        }
        throw new IllegalArgumentException("The type with id=" + aId + " not found in EType.values()=" + Arrays.asList(Type.values()));
    }

    /**
     * <p>valueOf</p> (creation/retrieve of a Type).
     * 
     * @param clazz representing the Type which wants to retrieve the Type.
     * @param <T> type of class
     * @return the Type
     */
    public static <T> Type valueOf(final Class<T> clazz) {
        if (Byte.class.equals(clazz) || Boolean.class.equals(clazz)) {
            return Type.BYTE;
        } else if (Short.class.equals(clazz)) {
            return Type.SHORT;
        } else if (Integer.class.equals(clazz)) {
            return Type.INT;
        } else if (Long.class.equals(clazz)) {
            return Type.LONG;
        } else if (Float.class.equals(clazz)) {
            return Type.FLOAT;
        } else if (Double.class.equals(clazz)) {
            return Type.DOUBLE;
        } else if (String.class.equals(clazz)) {
            return Type.STRING_UTF8;
        } else if (int[].class.equals(clazz) || long[].class.equals(clazz) || short[].class.equals(clazz) || byte[].class.equals(clazz)
        || boolean[].class.equals(clazz) || double[].class.equals(clazz) || float[].class.equals(clazz)) {
            return Type.ARRAY_FIXED_VALUE;
        } else if (Integer[].class.equals(clazz) || Long[].class.equals(clazz) || Short[].class.equals(clazz) || Byte[].class.equals(clazz)
        || Boolean[].class.equals(clazz) || Double[].class.equals(clazz) || Float[].class.equals(clazz) || String[].class.equals(clazz)
        || Msg[].class.equals(clazz)) {
            return Type.ARRAY_VARIABLE_VALUE;
        } else if (Null.class.equals(clazz)) {
            return Type.NULL;
        } else if (Msg.class.equals(clazz)) {
            return Type.MSG;
        } else {
            final boolean isArray = clazz.isArray();
            final Class classToAnalyse = isArray ? clazz.getComponentType() : clazz;
            final Class[] interfaces = classToAnalyse.getInterfaces();
            for (final Class msgInterface : interfaces) {
                if (Msg.class.equals(msgInterface)) {
                    return isArray ? Type.ARRAY_VARIABLE_VALUE : Type.MSG;
                }
            }
        }
        throw new IllegalArgumentException("The type with class=" + clazz + " not found in Type.values()=" + Arrays.asList(Type.values()));
    }

}
