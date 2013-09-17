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
public interface ByteBufClassSerializer<T> {

    /**
     * serializeToByteBuffer.
     *
     * @param aSrcObjet
     * @return
     */
    ByteBuf serializeToByteBuf(final T aSrcObjet);
    
    /**
     * serializeToByteBuffer.
     *
     * @param aSrcObjet
     * @param aDestByteBuffer
     */
    void serializeToByteBuf(final T aSrcObjet, final ByteBuf aDestByteBuf);
    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param offset
     * @param aSrcLength
     * @param aDestObject
     */
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf, final int aSrcLength, T aDestObject);
   
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param srcLength
     * @return
     */
    T deserializeFromByteBuf(final ByteBuf srcByteBuf, final int srcLength);
    
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param srcLength
     * @param aClass
     * @return
     */
    <S> S deserializeFromByteBuf(final ByteBuf srcByteBuf, final int srcLength, final Class<S> aClass);
    
    
}
