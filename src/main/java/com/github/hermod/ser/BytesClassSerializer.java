package com.github.hermod.ser;

/**
 * <p>BytesClassSerializer. </p>
 * 
 * @author anavarro - Apr 13, 2013
 * @param <T>
 * 
 */
public interface BytesClassSerializer<T> {

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
    void deserializeFromBytes(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength, T aDestObject);

    /**
     * deserializeFrom.
     * 
     * @param srcBytes
     * @param srcOffset
     * @param srcLength
     * @return
     */
    T deserializeFromBytes(final byte[] srcBytes, final int srcOffset, final int srcLength);

    /**
     * deserializeFrom.
     * 
     * @param srcBytes
     * @param srcOffset
     * @param srcLength
     * @param aClass
     * @return
     */
    <S> S deserializeFromBytes(final byte[] srcBytes, final int srcOffset, final int srcLength, final Class<S> aClass);

}
