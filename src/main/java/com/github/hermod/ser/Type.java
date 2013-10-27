package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>Type.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum Type {

    NULL(Types.NULL_TYPE), 
    //TODO to add 
    //SKIPPED_KEYS_TYPE(Types.SKIPPED_KEYS_TYPE), 
    INTEGER(Types.INTEGER_TYPE), DECIMAL(Types.DECIMAL_TYPE), 
    //TODO to remove
    STRING_ISO_8859_1(Types.STRING_ISO_8859_1_TYPE), STRING_UTF16(Types.STRING_UTF_16_TYPE), 
    //TODO to add
    //STRING_UTF8(Types.STRING_UTF_8_TYPE), 
    MSG(Types.MSG_TYPE), ARRAY_FIXED_VALUE(Types.ARRAY_FIXED_VALUE_TYPE), ARRAY_VARIABLE_VALUE(Types.ARRAY_VARIABLE_VALUE_TYPE);

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

}
