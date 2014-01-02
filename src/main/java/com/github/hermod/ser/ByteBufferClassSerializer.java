package com.github.hermod.ser;

import java.nio.ByteBuffer;

/**
 * <p>ByteBufferClassSerializer.</p>
 * 
 * The interface ByteBufferClassSerializer is used to serialize/deserialize from/to an Object to/from ByteBuffer.
 * 
 * @author anavarro - Sep 22, 2013
 * @param <T>
 * 
 */
public interface ByteBufferClassSerializer<T> {

    /**
     * <p>serializeToByteBuffer.</p>
     * 
     * @param aSrcObjet an object to serialize.
     * @return the serialized ByteBuffer of the Msg.
     */
    ByteBuffer serializeToByteBuffer(final T aSrcObjet);

    /**
     * <p>serializeToByteBuffer.</p>
     * 
     * @param aSrcObjet an object to serialize.
     * @param aDestByteBuffer the aDestByteBuffer to serialize.
     */
    void serializeToByteBuffer(final T aSrcObjet, final ByteBuffer aDestByteBuffer);

    /**
     * <p>deserializeFromByteBuffer.</p>
     * 
     * @param aSrcByteBuffer the aSrcByteBuffer to deserialize.
     * @param aDestObject an object to deserialize.
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer, T aDestObject);

}
