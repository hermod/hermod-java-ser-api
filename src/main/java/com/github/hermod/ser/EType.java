package com.github.hermod.ser;

/**
 * <p>EType.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum EType {

    NULL((byte) 0b0000_0000), MSG((byte) 0b0010_0000), INTEGER((byte) 0b0100_0000), DECIMAL((byte) 0b0110_0000), STRING_ISO_8859_1((byte) 0b1000_0000), STRING_UTF16((byte) 0b1010_0000), FIXED_VALUE_LENGTH_ARRAY(
            (byte) 0b1100_0000), VARIABLE_VALUE_LENGTH_ARRAY((byte) 0b1110_0000);

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
    public byte getId() {
        return this.id;
    }

}
