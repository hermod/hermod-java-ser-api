package com.github.hermod.ser;

import io.netty.buffer.ByteBuf;

import java.nio.ByteBuffer;



/**
 * <p>IByteBufferMsgSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface ByteBufMsgSerializer extends MsgSerializer {
    
    /**
     * serializeToByteBuffer.
     *
     * @param aSrcMsg
     */
    ByteBuf serializeToByteBuf(final Msg aSrcMsg);
    
    /**
     * serializeToByteBuffer.
     *
     * @param aSrcMsg
     * @param aDestByteBuffer
     */
    int serializeToByteBuf(final Msg aSrcMsg, ByteBuf aDestByteBuf);
    
    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param aDestMsg
     */
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf, Msg aDestMsg);
    
    
}
