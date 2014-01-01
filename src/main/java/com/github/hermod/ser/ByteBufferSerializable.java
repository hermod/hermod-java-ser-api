package com.github.hermod.ser;

import java.nio.ByteBuffer;

/**
 * <p>ByteBufferSerializable.</p>
 * 
 * The interface ByteBufferSerializable when it is implemented in a msg implementation is used to serialize/deserialize from/to a Msg to/from
 * ByteBuffer.
 * 
 * @author anavarro - Sep 22, 2013
 * 
 */
public interface ByteBufferSerializable extends Serializable {

    /**
     * <p>serializeToByteBuffer.</p>
     * 
     * @return the serialized ByteBuffer of the Msg.
     */
    ByteBuffer serializeToByteBuffer();

    /**
     * <p>serializeToByteBuffer.</p>
     * 
     * @param aDestByteBuffer the aDestByteBuffer to serialize.
     */
    void serializeToByteBuffer(final ByteBuffer aDestByteBuffer);

    /**
     * <p>deserializeFromByteBuffer.</p>
     * 
     * @param aSrcByteBuffer the aSrcByteBuffer to deserialize.
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer);

}
