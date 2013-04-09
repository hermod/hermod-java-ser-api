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
    
    // Integer (long / int / short / byte / boolean)
    public static final byte INTEGER_TYPE = 0b0100_0000;
    
//    // byte / boolean
//    public static final byte BYTE_TYPE = (byte) (INTEGER_TYPE | 1);
//    
//    // short
//    public static final byte SHORT_TYPE = (byte) (INTEGER_TYPE | 2);
//    
//    // int
//    public static final byte INT_TYPE = (byte) (INTEGER_TYPE | 4);
//    
//    // long
//    public static final byte LONG_TYPE = (byte) (INTEGER_TYPE | 8);
    
    // float / double or double encoded on 5 bits
    public static final byte DECIMAL_TYPE = 0b0110_0000;
    
//    // float
//    public static final byte FLOAT_TYPE = (byte) (DECIMAL_TYPE | 4);
//    
//    // double
//    public static final byte DOUBLE_TYPE = (byte) (DECIMAL_TYPE | 8);
//    
//    // double (encoded on 3 bits)
//    public static final byte THREE_BITS_DECIMAL_TYPE = (byte) (DECIMAL_TYPE | 3);
//    
//    // double (encoded on 5 bits)
//    public static final byte FIVE_BITS_DECIMAL_TYPE = (byte) (DECIMAL_TYPE | 5);
    
    // String (Extended ASCII) or byte[]
    public static final byte STRING_ISO_8859_1_TYPE = (byte) 0b1000_0000;
    
    // TODO not implement
    // String (UTF16) or char[]
    public static final byte STRING_UTF16_TYPE = (byte) 0b1010_0000;
    
    // TODO not implemented
    // Fixed Value Length Array
    public static final byte FIXED_VALUE_LENGTH_ARRAY_TYPE = (byte) 0b1100_0000;
    
    // TODO not implemented
    // Variable Value Length Array
    public static final byte VARIABLE_VALUE_LENGTH_ARRAY_TYPE = (byte) 0b1110_0000;
    
    /**
     * TYPE_MASK
     */
    public static final byte TYPE_MASK = (byte) 0b1110_0000;
    
    
}
