package com.github.hermod.ser;

import java.nio.ByteBuffer;


/**
 * <p>IMsgByteBufferSerializer. </p>
 *
 * @author anavarro - Apr 10, 2013
 *
 */
public interface IMsgByteBufferSerializer {
    
    /**
     * serializeToByteBuffer.
     *
     * @param srcMsg
     * @param destByteBuffer
     */
    void serializeToByteBuffer(final IMsg srcMsg, ByteBuffer destByteBuffer);
    
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param offset
     * @param length
     * @param destMsg
     */
    void deserializeFrom(final ByteBuffer srcByteBuffer, final int offset, final int length, IMsg destMsg);
    
    
}
