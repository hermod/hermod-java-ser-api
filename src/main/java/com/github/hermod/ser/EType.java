package com.github.hermod.ser;

import static com.github.hermod.ser.Types.ARRAY_FIXED_VALUE_TYPE;
import static com.github.hermod.ser.Types.ARRAY_VARIABLE_VALUE_TYPE;
import static com.github.hermod.ser.Types.DECIMAL_TYPE;
import static com.github.hermod.ser.Types.INTEGER_TYPE;
import static com.github.hermod.ser.Types.MSG_TYPE;
import static com.github.hermod.ser.Types.NULL_TYPE;
import static com.github.hermod.ser.Types.STRING_ISO_8859_1_TYPE;
import static com.github.hermod.ser.Types.STRING_TYPE;

import java.util.Arrays;

/**
 * <p>EType.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum EType {

    NULL(NULL_TYPE), MSG(MSG_TYPE), INTEGER(INTEGER_TYPE), DECIMAL(DECIMAL_TYPE), STRING_ISO_8859_1(STRING_ISO_8859_1_TYPE), STRING(STRING_TYPE), ARRAY_FIXED_VALUE(
            ARRAY_FIXED_VALUE_TYPE), ARRAY_VARIABLE_VALUE(ARRAY_VARIABLE_VALUE_TYPE);

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
