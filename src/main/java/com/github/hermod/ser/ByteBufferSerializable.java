package com.github.hermod.ser;

import java.nio.ByteBuffer;

/**
 * <p>ByteBufferSerializable.</p>
 *
 * Interface ByteBufferSerializable is used to serialize/deserialize from/to a Msg to/from ByteBuffer.
 *
 * @author anavarro - Sep 22, 2013
 *
 */
public interface ByteBufferSerializable extends Serializable {

    /**
     * serializeToByteBuffer.
     *
     * @return the serialized ByteBuffer of the Msg.
     */
    ByteBuffer serializeToByteBuffer();

    /**
     * serializeToByteBuffer.
     *
     * @param aDestByteBuffer the aDestByteBuffer to serialize.
     */
    void serializeToByteBuffer(final ByteBuffer aDestByteBuffer);

    /**
     * deserializeFromByteBuffer.
     *
     * @param aSrcByteBuffer  the aSrcByteBuffer to deserialize.
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer);

}
