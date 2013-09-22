package com.github.hermod.ser;


import java.nio.ByteBuffer;

import com.github.hermod.ser.Serializable;




/**
 * <p>ByteBufferSerializable. </p>
 *
 * @author anavarro - Sep 22, 2013
 *
 */
public interface ByteBufferSerializable extends Serializable {

    /**
     * serializeToByteBuffer.
     *
     * @param aSrcObjet
     * @return
     */
    ByteBuffer serializeToByteBuffer();
    
    /**
     * serializeToByteBuffer.
     *
     * @param aSrcObjet
     * @param aDestByteBuffer
     */
    void serializeToByteBuffer(final ByteBuffer aDestByteBuffer);
    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param offset
     * @param aSrcLength
     * @param aDestObject
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer);
   
    
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param srcLength
     * @param aClass
     * @return
     */
    //<S> S deserializeFromByteBuffer(final ByteBuffer srcByteBuffer, final Class<S> aClass);
    
    
}
