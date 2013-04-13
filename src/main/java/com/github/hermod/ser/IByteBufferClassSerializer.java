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
     * @param srcMsg
     * @return
     */
    ByteBuffer serializeToByteBuffer(final T srcObjet);
    
    /**
     * serializeToByteBuffer.
     *
     * @param srcObjet
     * @param destByteBuffer
     */
    void serializeToByteBuffer(final T srcObjet, final ByteBuffer destByteBuffer);
    

    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param offset
     * @param srcLength
     * @param destObject
     */
    void deserializeFrom(final ByteBuffer srcByteBuffer, final int srcLength, T destObject);
   
    //T deserializeFrom(final ByteBuffer srcByteBuffer, final int srcLength);
    
    //<S> S deserializeFrom(final ByteBuffer srcByteBuffer, final int srcLength, final Class<S> aClass);
    
    
}
