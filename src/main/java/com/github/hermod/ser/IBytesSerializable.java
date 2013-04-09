package com.github.hermod.ser;

/**
 * <p>IBytesSerializable. </p>
 *
 * @author anavarro - Apr 10, 2013
 *
 */
//TODO Name IBytesConvertible?
public interface IBytesSerializable {

    // convertToBytes()
    /**
     * serializeToBytes.
     *
     * @return
     */
    byte[] serializeToBytes();
    
    // convertTo()
    /**
     * deserializeFrom.
     *
     * @param srcBytes
     * @param offset
     * @param length
     */
    void deserializeFrom(final byte[] srcBytes, final int offset, final int length);
    
}
