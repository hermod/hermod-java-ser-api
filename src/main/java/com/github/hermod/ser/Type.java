package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>Type.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum Type {

    NULL(Types.NULL_TYPE), SKIPPED_KEYS_TYPE(Types.SKIPPED_KEYS_TYPE), INTEGER(Types.INTEGER_TYPE), DECIMAL(Types.DECIMAL_TYPE), STRING_UTF8(
            Types.STRING_UTF_8_TYPE), MSG(Types.MSG_TYPE), ARRAY_FIXED_VALUE(Types.ARRAY_FIXED_VALUE_TYPE), ARRAY_VARIABLE_VALUE(
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
        // TODO to optimize Type valueOf(final String className) and a switch
        if (Integer.class.equals(clazz) || Long.class.equals(clazz) || Short.class.equals(clazz) || Byte.class.equals(clazz)
                || Boolean.class.equals(clazz)) {
            return Type.INTEGER;
        } else if (Double.class.equals(clazz) || Float.class.equals(clazz)) {
            return Type.DECIMAL;
        } else if (String.class.equals(clazz)) {
            // TODO change on Type.STRING_UTF8
            return Type.STRING_UTF8;
        } else if (Msg.class.equals(clazz)) {
            return Type.MSG;
        } else if (int[].class.equals(clazz) || long[].class.equals(clazz) || short[].class.equals(clazz) || byte[].class.equals(clazz)
                || boolean[].class.equals(clazz) || double[].class.equals(clazz) || float[].class.equals(clazz)) {
            return Type.ARRAY_FIXED_VALUE;
        } else if (Integer[].class.equals(clazz) || Long[].class.equals(clazz) || Short[].class.equals(clazz) || Byte[].class.equals(clazz)
                || Boolean[].class.equals(clazz) || Double[].class.equals(clazz) || Float[].class.equals(clazz) || String[].class.equals(clazz)
                || Msg[].class.equals(clazz)) {
            return Type.ARRAY_VARIABLE_VALUE;
        }
        throw new IllegalArgumentException("The type with class=" + clazz + " not found in EType.values()=" + Arrays.asList(Type.values()));
    }

}
