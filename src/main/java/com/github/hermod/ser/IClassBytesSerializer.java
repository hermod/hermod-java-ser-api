package com.github.hermod.ser;


/**
 * <p>IClassBytesSerializer. </p>
 *
 * @author anavarro - Apr 10, 2013
 * @param <T>
 *
 */
public interface IClassBytesSerializer<T> {

    /**
     * serializeToBytes.
     *
     * @param srcObject
     * @return
     */
    byte[] serializeToBytes(final T srcObject);
    
    /**
     * deserializeFrom.
     *
     * @param srcBytes
     * @param offset
     * @param length
     * @param destObject
     */
    void deserializeFrom(final byte[] srcBytes, final int offset, final int length, T destObject);
    
    //T deserializeFrom(final byte[] srcBytes, final int offset, final int length);
    
    //<S> S deserializeFrom(final byte[] srcBytes, final int offset, final int length, final Class<S> aClass);
    
    
}
