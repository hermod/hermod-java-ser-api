package com.github.hermod.ser;



/**
 * <p>IBytesMsgSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface IBytesMsgSerializer extends IMsgSerializer {

    /**
     * serializeToBytes.
     *
     * @param aSrcMsg
     * @return
     */
    byte[] serializeToBytes(final IMsg aSrcMsg);
    
    /**
     * serializeToBytes.
     *
     * @param aDestBytes
     * @param aDestOffset
     * @param aSrcMsg
     * @return
     */
    int serializeToBytes(final IMsg aSrcMsg, byte[] aDestBytes, int aDestOffset);
    
    /**
     * deserializeFrom.
     *
     * @param aSrcBytes
     * @param aSrcOffset
     * @param aSrcLength
     * @param aDestMsg
     */
    void deserializeFrom(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength, IMsg aDestMsg);
    
    
}
