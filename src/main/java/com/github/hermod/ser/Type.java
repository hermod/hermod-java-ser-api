package com.github.hermod.ser;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * <p>Type.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum Type {

    NULL(Types.NULL_TYPE), SKIPPED_KEYS(Types.SKIPPED_KEYS_TYPE), INTEGER(Types.INTEGER_TYPE), BYTE(Types.BYTE_TYPE), SHORT(Types.SHORT_TYPE), INT(
            Types.INT_TYPE), LONG(Types.LONG_TYPE), DECIMAL(Types.DECIMAL_TYPE), FLOAT(Types.FLOAT_TYPE), DOUBLE(Types.DOUBLE_TYPE), FIVE_BITS_DECIMAL(
            Types.FIVE_BITS_DECIMAL_TYPE), STRING_UTF8(Types.STRING_UTF_8_TYPE), MSG(Types.MSG_TYPE), ARRAY_FIXED_VALUE(Types.ARRAY_FIXED_VALUE_TYPE), ARRAY_VARIABLE_VALUE(
            Types.ARRAY_VARIABLE_VALUE_TYPE);

    private final byte id;

    /**
     * Constructor.
     * 
     * @param aId
     */
    private Type(byte aId) {
        this.id = aId;
    }

    /**
     * getId.
     * 
     * @return
     */
    public final byte getId() {
        return this.id;
    }

    /**
     * get5ShiftId.
     * 
     * @return
     */
    public final byte getShiftId() {
        return (byte) (this.id >> 5);
    }

    /**
     * valueOf.
     * 
     * @param aId
     * @return
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
     * valueOf.
     * 
     * @param clazz
     * @return
     */
    public static <T> Type valueOf(final Class<T> clazz) {
        if (Byte.class.equals(clazz) || Boolean.class.equals(clazz)) {
            return Type.BYTE;
        } else if (Short.class.equals(clazz) ) {
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
            final Class[] interfaces = clazz.getInterfaces();
            for (Class msgInterface : interfaces) {
                if (Msg.class.equals(msgInterface)) {
                    return Type.MSG;
                }
            }
        }
        throw new IllegalArgumentException("The type with class=" + clazz + " not found in Type.values()=" + Arrays.asList(Type.values()));
    }
    

    
    

}
