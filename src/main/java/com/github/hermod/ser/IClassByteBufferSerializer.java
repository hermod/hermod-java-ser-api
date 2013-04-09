package com.github.hermod.ser;

import java.nio.ByteBuffer;


/**
 * <p>IClassByteBufferSerializer. </p>
 *
 * @author anavarro - Apr 10, 2013
 * @param <T>
 *
 */
public interface IClassByteBufferSerializer<T> {
    
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
     * @param length
     * @param destObject
     */
    void deserializeFrom(final ByteBuffer srcByteBuffer, final int offset, final int length, T destObject);
   
    //T deserializeFrom(final ByteBuffer srcByteBuffer, final int offset, final int length);
    
    //<S> S deserializeFrom(final ByteBuffer srcByteBuffer, final int offset, final int length, final Class<S> aClass);
    
    
}
