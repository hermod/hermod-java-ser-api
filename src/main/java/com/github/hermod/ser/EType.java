package com.github.hermod.ser;

/**
 * <p>EType.</p>
 * 
 * @author anavarro - Apr 4, 2013
 * 
 */
public enum EType {

    NULL((byte) 0x0), MSG((byte) 0x20), INTEGER((byte) 0x40), DECIMAL((byte) 0x60), STRING_ISO_8859_1((byte) 0x80), STRING_UTF16((byte) 0xA0), FIXED_VALUE_ARRAY(
            (byte) 0xC0), VARIABLE_VALUE_ARRAY((byte) 0xE0);

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
    public int getId() {
        return this.id;
    }

}
