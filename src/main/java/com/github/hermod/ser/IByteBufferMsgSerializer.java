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
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param aDestMsg
     */
    void deserializeFrom(final ByteBuffer aSrcByteBuffer, IMsg aDestMsg);
    
    
}
