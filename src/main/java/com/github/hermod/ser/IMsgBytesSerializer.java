package com.github.hermod.ser;


/**
 * <p>IMsgBytesSerializer. </p>
 *
 * @author anavarro - Apr 10, 2013
 *
 */
public interface IMsgBytesSerializer {

    /**
     * serializeToBytes.
     *
     * @param srcMsg
     * @return
     */
    byte[] serializeToBytes(final IMsg srcMsg);
    
    /**
     * deserializeFrom.
     *
     * @param srcBytes
     * @param offset
     * @param length
     * @param destMsg
     */
    void deserializeFrom(final byte[] srcBytes, final int offset, final int length, IMsg destMsg);
    
}
