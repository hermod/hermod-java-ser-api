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
     * @param aSrcObject
     * @return
     */
    byte[] serializeToBytes(final T aSrcObject);
    
    
    /**
     * serializeToBytes.
     *
     * @param aSrcObject
     * @param aDestBytes
     * @param aDestOffset
     * @return
     */
    int serializeToBytes(final T aSrcObject, byte[] aDestBytes, int aDestOffset);
    
    
    /**
     * deserializeFrom.
     *
     * @param aSrcBytes
     * @param aSrcOffset
     * @param aSrcLength
     * @param aDestObject
     */
    void deserializeFrom(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength, T aDestObject);
    
    //T deserializeFrom(final byte[] srcBytes, final int srcOffset, final int srcLength);
    
    //<S> S deserializeFrom(final byte[] srcBytes, final int srcOffset, final int srcLength, final Class<S> aClass);
    
    
}
