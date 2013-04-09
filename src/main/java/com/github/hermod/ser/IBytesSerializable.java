package com.github.hermod.ser;

/**
 * <p>IBytesSerializable. </p>
 *
 * @author anavarro - Apr 10, 2013
 *
 */
//TODO Name IBytesConvertible?
public interface IBytesSerializable {

    // convertToBytes()
    /**
     * serializeToBytes.
     *
     * @return
     */
    byte[] serializeToBytes();
    
    //TODO inverse args
    void serializeToBytes(final byte[] destBytes, final int offset);
    
    // getLength();
    // convertTo()
    /**
     * deserializeFrom.
     *
     * @param srcBytes
     * @param offset
     * @param length
     */
  //TODO inverse args
    void deserializeFrom(final byte[] srcBytes, final int offset, final int length);
    
}
