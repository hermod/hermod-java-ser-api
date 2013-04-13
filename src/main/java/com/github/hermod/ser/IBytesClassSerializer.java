package com.github.hermod.ser;



/**
 * <p>IBytesClassSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 * @param <T>
 *
 */
public interface IBytesClassSerializer<T> {

    /**
     * serializeToBytes.
     *
     * @param srcObject
     * @return
     */
    byte[] serializeToBytes(final T srcObject);
    
    
    /**
     * serializeToBytes.
     *
     * @param srcObject
     * @param destBytes
     * @param destOffset
     * @return
     */
    int serializeToBytes(final T srcObject, byte[] destBytes, int destOffset);
    
    
    /**
     * deserializeFrom.
     *
     * @param srcBytes
     * @param srcOffset
     * @param srcLength
     * @param destObject
     */
    void deserializeFrom(final byte[] srcBytes, final int srcOffset, final int srcLength, T destObject);
    
    //T deserializeFrom(final byte[] srcBytes, final int srcOffset, final int srcLength);
    
    //<S> S deserializeFrom(final byte[] srcBytes, final int srcOffset, final int srcLength, final Class<S> aClass);
    
    
}
