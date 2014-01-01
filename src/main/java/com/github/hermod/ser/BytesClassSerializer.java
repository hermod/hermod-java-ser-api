package com.github.hermod.ser;

/**
 * <p>BytesClassSerializer. </p>
 * 
 * The interface BytesClassSerializer is used to serialize/deserialize from/to an abject <T> to/from byte[].
 *
 * @author anavarro - Apr 13, 2013
 * @param <T>
 * 
 */
public interface BytesClassSerializer<T> {

    /**
     * <p>serializeToBytes.</p>
     * 
     * @param aSrcObject an object to serialize.
     * @return the serialized byte[] of the Msg.
     */
    byte[] serializeToBytes(final T aSrcObject);

    /**
     * <p>serializeToBytes.</p>
     * 
     * @param aSrcObject an object to serialize.
     * @param aDestBytes a destBytes to serialize.
     * @param aDestOffset a destOffset to serialize.
     * @return the end position of the Msg in the destBytes.
     */
    int serializeToBytes(final T aSrcObject, byte[] aDestBytes, int aDestOffset);

    /**
     * <p>deserializeFrom.</p>
     * 
     * @param aDestObject a object to deserialize.
     * @param aSrcBytes a srcBytes to deserialize.
     * @param aSrcOffset a srcOffset to deserialize.
     * @param aSrcLength the srcLength to deserialize.
     */
    void deserializeFromBytes(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength, T aDestObject);

}
