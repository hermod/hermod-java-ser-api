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
     * @param aDestBytes
     * @param aDestOffset
     * @return
     */
    int serializeToBytes(byte[] aDestBytes, int aDestOffset);
    
    /**
     * deserializeFrom.
     *
     * @param aSrcBytes
     * @param aSrcOffset
     * @param aSrcLength
     */
    void deserializeFrom(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength);

    
}
