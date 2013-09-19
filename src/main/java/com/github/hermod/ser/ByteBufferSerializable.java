package com.github.hermod.ser;

import io.netty.buffer.ByteBuf;

import java.nio.ByteBuffer;



/**
 * <p>IByteBufferClassSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 * @param <T>
 *
 */
/**
 * <p>IByteBufferClassSerializer. </p>
 *
 * @author anavarro - Apr 20, 2013
 * @param <T>
 *
 */
/**
 * <p>IByteBufferClassSerializer. </p>
 *
 * @author anavarro - Apr 20, 2013
 * @param <T>
 *
 */
public interface ByteBufferSerializable {

    /**
     * serializeToByteBuffer.
     *
     * @param aSrcObjet
     * @return
     */
    ByteBuf serializeToByteBuffer();
    
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
   
    
    
    
}
