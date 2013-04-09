package com.github.hermod.ser;

import java.nio.ByteBuffer;


/**
 * <p>IByteBufferSerializable. </p>
 *
 * @author anavarro - Apr 10, 2013
 *
 */
public interface IByteBufferSerializable {

    /**
     * serializeToByteBuffer.
     *
     * @param destByteBuffer
     */
    void serializeToByteBuffer(final ByteBuffer destByteBuffer);
    //ByteBuffer serializeToByteBuffer();
    
    /**
     * deserializeFrom.
     *
     * @param srcByteBuffer
     * @param offset
     * @param length
     */
    void deserializeFrom(final ByteBuffer srcByteBuffer, final int offset, final int length);
    
}
