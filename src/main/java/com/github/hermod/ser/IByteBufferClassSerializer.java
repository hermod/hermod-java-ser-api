package com.github.hermod.ser;

import java.nio.ByteBuffer;



/**
 * <p>IByteBufferClassSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 * @param <T>
 *
 */
public interface IByteBufferClassSerializer<T> {

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
    void deserializeFrom(final ByteBuffer aSrcByteBuffer, final int aSrcLength, T aDestObject);
   
    //T deserializeFrom(final ByteBuffer srcByteBuffer, final int srcLength);
    
    //<S> S deserializeFrom(final ByteBuffer srcByteBuffer, final int srcLength, final Class<S> aClass);
    
    
}
