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
     * @param destByteBuffer
     */
    void serializeToByteBuffer(final ByteBuffer destByteBuffer);

    /**
     * serializeToByteBuffer.
     *
     * @return
     */
    ByteBuffer serializeToByteBuffer();
    
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param offset
     * @param srcLength
     */
    void deserializeFrom(final ByteBuffer srcByteBuffer, final int srcLength);
    
}
