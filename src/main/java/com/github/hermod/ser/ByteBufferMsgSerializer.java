package com.github.hermod.ser;

import java.nio.ByteBuffer;

/**
 * <p>ByteBufferMsgSerializer.</p>
 * 
 * The interface ByteBufferMsgSerializer is used to serialize/deserialize from/to a Msg to/from ByteBuffer.
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public interface ByteBufferMsgSerializer extends MsgSerializer {

    /**
     * <p>serializeToByteBuffer.</p>
     * 
     * @param aSrcMsg a msg to serialize.
     * @return the serialized ByteBuffer of the Msg.
     */
    ByteBuffer serializeToByteBuffer(final Msg aSrcMsg);

    /**
     * <p>serializeToByteBuffer.</p>
     * 
     * @param aSrcMsg a msg to serialize.
     * @param aDestByteBuffer the aDestByteBuffer to serialize.
     */
    void serializeToByteBuffer(final Msg aSrcMsg, ByteBuffer aDestByteBuffer);

    /**
     * <p>deserializeFromByteBuffer.</p>
     * 
     * @param aSrcByteBuffer the aSrcByteBuffer to deserialize.
     * @param aDestMsg a msg to deserialize.
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer, Msg aDestMsg);

}
