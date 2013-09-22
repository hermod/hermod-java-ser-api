package com.github.hermod.ser;

import java.nio.ByteBuffer;



/**
 * <p>ByteBufferClassSerializer. </p>
 *
 * @author anavarro - Sep 22, 2013
 * @param <T>
 *
 */
public interface ByteBufferClassSerializer<T> {

    /**
     * serializeToByteBuffer.
     *
     * @param aSrcObjet
     * @return
     */
    ByteBuffer serializeToByteBuffer(final T aSrcObjet);
    
    /**
     * serializeToByteBuffer.
     *
     * @param aSrcObjet
     * @param aDestByteBuffer
     */
    void serializeToByteBuffer(final T aSrcObjet, final ByteBuffer aDestByteBuffer);
    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param offset
     * @param aSrcLength
     * @param aDestObject
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer, final int aSrcLength, T aDestObject);
   
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param srcLength
     * @return
     */
    T deserializeFromByteBuffer(final ByteBuffer srcByteBuffer, final int srcLength);
    
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param srcLength
     * @param aClass
     * @return
     */
    <S> S deserializeFromByteBuffer(final ByteBuffer srcByteBuffer, final int srcLength, final Class<S> aClass);
    
    
}
