package com.github.hermod.ser;

import java.nio.ByteBuffer;



/**
 * <p>IByteBufferSerializable. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface IByteBufferSerializable extends ISerializable {

    /**
     * serializeToByteBuffer.
     *
     * @param aDestByteBuffer
     */
    void serializeToByteBuffer(final ByteBuffer aDestByteBuffer);

    /**
     * serializeToByteBuffer.
     *
     * @return
     */
    ByteBuffer serializeToByteBuffer();
    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     * @param offset
     * @param aSrcLength
     */
    void deserializeFrom(final ByteBuffer aSrcByteBuffer, final int aSrcLength);
    
}
