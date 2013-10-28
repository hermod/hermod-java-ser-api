package com.github.hermod.ser;

import java.nio.charset.Charset;

/**
 * <p>Types. </p>
 *
 * @author anavarro - Apr 9, 2013
 *
 */
public final class Types {

    /**
     * Constructor.
     *
     */
    private Types() {
    }

    
    /**
     * NULL_TYPE
     */
    public static final byte NULL_TYPE = 0b0000_0000;
    
    /**
     * SKIPPED_KEYS_TYPE
     */
    public static final byte SKIPPED_KEYS_TYPE = 0b0010_0000;
    
    /**
     * INTEGER_TYPE (long / int / short / byte / boolean / Enum)
     */
    public static final byte INTEGER_TYPE = 0b0100_0000;
    
    /**
     * DECIMAL_TYPE (float / double or double encoded on 3/5 bits)
     */
    public static final byte DECIMAL_TYPE = 0b0110_0000;

    
    /**
     * STRING_TYPE (UTF8 by default as it is in a String)
     */
    public static final byte STRING_UTF_8_TYPE = (byte) 0b1000_0000;
    
    /**
     * UTF_8_CHARSET_NAME
     */
    public static final String UTF_8_CHARSET_NAME = "UTF-8";
    
    /**
     * UTF_8_CHARSET
     */
    public static final Charset UTF_8_CHARSET = Charset.forName(UTF_8_CHARSET_NAME);
    
    /**
     * MSG_TYPE
     */
    // TODO to change
    public static final byte MSG_TYPE = (byte) 0b1010_0000; // should be 0b1010_0000
    
    /**
     * ARRAY_FIXED_VALUE_TYPE Array with fixde length value like byte[] ...
     */
    public static final byte ARRAY_FIXED_VALUE_TYPE = (byte) 0b1100_0000;
    
    /**
     * ARRAY_VARIABLE_VALUE_TYPE Array with variable length value (nullable value is accepted), like Integer[] ...
     */
    public static final byte ARRAY_VARIABLE_VALUE_TYPE = (byte) 0b1110_0000;
    
    /**
     * TYPE_MASK Mask do determine the type of the field
     */
    public static final byte TYPE_MASK = (byte) 0b1110_0000;
    
    
}
