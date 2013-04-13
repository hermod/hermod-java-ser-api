package com.github.hermod.ser;


/**
 * <p>IBytesSerializable. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface IBytesSerializable extends ISerializable {

    /**
     * serializeToBytes.
     *
     * @return
     */
    byte[] serializeToBytes();
    
    /**
     * serializeToBytes.
     *
     * @param destBytes
     * @param destOffset
     * @return
     */
    int serializeToBytes(final byte[] destBytes, final int destOffset);
    
    /**
     * deserializeFrom.
     *
     * @param srcBytes
     * @param srcOffset
     * @param srcLength
     */
    void deserializeFrom(final byte[] srcBytes, final int srcOffset, final int srcLength);

    
}
