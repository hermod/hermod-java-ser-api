package com.github.hermod.ser;

import java.nio.ByteBuffer;



/**
 * <p>IByteBufferMsgSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface ByteBufferMsgSerializer extends MsgSerializer {
    
    /**
     * serializeToByteBuffer.
     *
     * @param aSrcMsg
     * @param aDestByteBuffer
     */
    int serializeToByteBuffer(final Msg aSrcMsg, ByteBuffer aDestByteBuffer);
    
    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param aDestMsg
     */
    void deserializeFromBuffer(final ByteBuffer aSrcByteBuffer, Msg aDestMsg);
    
    
}
