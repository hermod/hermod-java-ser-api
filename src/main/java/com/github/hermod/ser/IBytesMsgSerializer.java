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
     * @param srcMsg
     * @return
     */
    byte[] serializeToBytes(final IMsg srcMsg);
    
    /**
     * serializeToBytes.
     *
     * @param destBytes
     * @param destOffset
     * @param srcMsg
     * @return
     */
    int serializeToBytes(final IMsg srcMsg, byte[] destBytes, int destOffset);
    
    /**
     * deserializeFrom.
     *
     * @param srcBytes
     * @param srcOffset
     * @param srcLength
     * @param destMsg
     */
    void deserializeFrom(final byte[] srcBytes, final int srcOffset, final int srcLength, IMsg destMsg);
    
    
}
