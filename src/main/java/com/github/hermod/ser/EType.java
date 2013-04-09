package com.github.hermod.ser;

import static com.github.hermod.ser.Types.DECIMAL_TYPE;
import static com.github.hermod.ser.Types.FIXED_VALUE_LENGTH_ARRAY_TYPE;
import static com.github.hermod.ser.Types.INTEGER_TYPE;
import static com.github.hermod.ser.Types.MSG_TYPE;
import static com.github.hermod.ser.Types.NULL_TYPE;
import static com.github.hermod.ser.Types.STRING_ISO_8859_1_TYPE;
import static com.github.hermod.ser.Types.STRING_UTF16_TYPE;
import static com.github.hermod.ser.Types.VARIABLE_VALUE_LENGTH_ARRAY_TYPE;

/**
 * <p>EType.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum EType {
    
    NULL(NULL_TYPE), MSG(MSG_TYPE), INTEGER(INTEGER_TYPE), DECIMAL(DECIMAL_TYPE), STRING_ISO_8859_1(STRING_ISO_8859_1_TYPE), STRING_UTF16(STRING_UTF16_TYPE), FIXED_VALUE_LENGTH_ARRAY(
            FIXED_VALUE_LENGTH_ARRAY_TYPE), VARIABLE_VALUE_LENGTH_ARRAY(VARIABLE_VALUE_LENGTH_ARRAY_TYPE);

    private final byte id;


    /**
     * Constructor.
     *
     * @param aId
     */
    EType(byte aId) {
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

}
