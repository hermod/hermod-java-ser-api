package com.github.hermod.ser;

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
        super();
    }

    // Null key
    public static final byte NULL_TYPE = 0b0000_0000;
    
    // Msg
    public static final byte MSG_TYPE = 0b0010_0000;
    
    // Integer (long / int / short / byte / boolean / Enum)
    public static final byte INTEGER_TYPE = 0b0100_0000;
    
    // Decimal (float / double or double encoded on 3/5 bits)
    public static final byte DECIMAL_TYPE = 0b0110_0000;
    
    // String (charset = ISO_8859_1)
    public static final byte STRING_ISO_8859_1_TYPE = (byte) 0b1000_0000;
    
    // TODO not implement
    // String (UTF16 by default as it is in a String)
    public static final byte STRING_TYPE = (byte) 0b1010_0000;
    
    // TODO not implemented
    // Fixed Value Length Array
    public static final byte ARRAY_FIXED_VALUE_TYPE = (byte) 0b1100_0000;
    
    // TODO not implemented
    // Variable Value Length Array
    public static final byte ARRAY_VARIABLE_VALUE_TYPE = (byte) 0b1110_0000;
    
    /**
     * TYPE_MASK
     */
    public static final byte TYPE_MASK = (byte) 0b1110_0000;
    
    
}
