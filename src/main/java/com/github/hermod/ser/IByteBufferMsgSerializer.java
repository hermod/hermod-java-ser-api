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
     * @param aSrcMsg
     * @param aDestByteBuffer
     */
    int serializeToByteBuffer(final IMsg aSrcMsg, ByteBuffer aDestByteBuffer);
    
    /**
     * serializeToByteBuffer.
     *
     * @param aSrcMsg
     * @return
     */
    ByteBuffer serializeToByteBuffer(final IMsg aSrcMsg);
    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param aSrcOffset
     * @param aSrcLength
     * @param aDestMsg
     */
    void deserializeFrom(final ByteBuffer aSrcByteBuffer, final int aSrcOffset, final int aSrcLength, IMsg aDestMsg);
    
    
}
