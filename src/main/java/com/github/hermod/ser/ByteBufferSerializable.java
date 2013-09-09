package com.github.hermod.ser;

import java.nio.ByteBuffer;



/**
 * <p>IByteBufferSerializable. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface ByteBufferSerializable extends Serializable {

    /**
     * serializeToByteBuffer.
     *
     * @param aDestByteBuffer
     */
    void serializeToByteBuffer(final ByteBuffer aDestByteBuffer);

    
    /**
     * deserializeFrom.
     *
     * @param aSrcByteBuffer
     */
    void deserializeFromByteBuffer(final ByteBuffer aSrcByteBuffer);
    
}
