package com.github.hermod.ser;

import java.nio.ByteBuffer;

/**
 * <p>ByteBufferClassSerializer.</p>
 *
 * @author anavarro - Sep 22, 2013
 * @param <T>
 *
 */
public interface ByteBufferClassSerializer<T> {

    /**
     * <p>serializeToByteBuffer.</p>
     *
     * @param aSrcObjet
     * @return
     */
    ByteBuffer serializeToByteBuffer(final T aSrcObjet);

    /**
     * <p>serializeToByteBuffer.</p>
     *
     * @param aSrcObjet
     * @param aDestByteBuffer
     */
    void serializeToByteBuffer(final T aSrcObjet, final ByteBuffer aDestByteBuffer);

    /**
     * <p>deserializeFromByteBuffer.</p>
     *
     * @param aSrcByteBuffer
     * @param aSrcLength
     * @param aDestObject
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer, final int aSrcLength, T aDestObject);

    /**
     * <p>deserializeFromByteBuffer.</p>
     *
     * @param srcByteBuffer
     * @param srcLength
     * @return
     */
    T deserializeFromByteBuffer(final ByteBuffer srcByteBuffer, final int srcLength);

    /**
     * <p>deserializeFromByteBuffer.</p>
     *
     * @param srcByteBuffer
     * @param srcLength
     * @param aClass
     * @param <S>
     * @return
     */
    <S> S deserializeFromByteBuffer(final ByteBuffer srcByteBuffer, final int srcLength, final Class<S> aClass);

}
