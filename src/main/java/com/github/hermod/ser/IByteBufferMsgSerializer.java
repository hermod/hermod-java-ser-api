package com.github.hermod.ser;

import java.nio.ByteBuffer;



/**
 * <p>IByteBufferMsgSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface IByteBufferMsgSerializer extends IMsgSerializer {
    
    /**
     * serializeToByteBuffer.
     *
     * @param srcMsg
     * @param destByteBuffer
     */
    int serializeToByteBuffer(final IMsg srcMsg, ByteBuffer destByteBuffer);
    
    /**
     * serializeToByteBuffer.
     *
     * @param srcMsg
     * @return
     */
    ByteBuffer serializeToByteBuffer(final IMsg srcMsg);
    
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param srcOffset
     * @param srcLength
     * @param destMsg
     */
    void deserializeFrom(final ByteBuffer srcByteBuffer, final int srcOffset, final int srcLength, IMsg destMsg);
    
    
}
