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
public interface ByteBufSerializable extends Serializable {

    /**
* serializeToByteBuffer.
*
* @param aSrcObjet
* @return
*/
    ByteBuf serializeToByteBuf();
    
    /**
* serializeToByteBuffer.
*
* @param aSrcObjet
* @param aDestByteBuffer
*/
    void serializeToByteBuf(final ByteBuf aDestByteBuf);
    
    /**
* deserializeFrom.
*
* @param aSrcByteBuffer
* @param offset
* @param aSrcLength
* @param aDestObject
*/
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf);
   
    
    
}