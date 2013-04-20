package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>EType.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum EType {

    NULL(Types.NULL_TYPE), MSG(Types.MSG_TYPE), INTEGER(Types.INTEGER_TYPE), DECIMAL(Types.DECIMAL_TYPE), STRING_ISO_8859_1(Types.STRING_ISO_8859_1_TYPE), STRING_UTF16(Types.STRING_UTF_16_TYPE), ARRAY_FIXED_VALUE(
            Types.ARRAY_FIXED_VALUE_TYPE), ARRAY_VARIABLE_VALUE(Types.ARRAY_VARIABLE_VALUE_TYPE);

    private final byte id;

    
    /**
     * Constructor.
     * 
     * @param aId
     */
    private EType(byte aId) {
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
    public static EType valueOf(final byte aId) {
        for (final EType type : EType.values()) {
            if (type.getId() == aId) {
                return type;
            }
        }
        throw new IllegalArgumentException("The type with id=" + aId + " not found in EType.values()=" + Arrays.asList(EType.values()));
    }

}
