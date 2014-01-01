package com.github.hermod.ser;

/**
 * <p>BytesSerializable.</p>
 * 
 * The interface BytesSerializable when it is implemented in a msg implementation is used to serialize/deserialize from/to a Msg to/from byte[].
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public interface BytesSerializable extends Serializable {

    /**
     * <p>serializeToBytes.</p>
     * 
     * @return the serialized byte[] of the Msg.
     */
    byte[] serializeToBytes();

    /**
     * <p>serializeToBytes.</p>
     * 
     * @param aDestBytes a destBytes to serialize.
     * @param aDestOffset a destOffset to serialize.
     * @return the end position of the Msg in the destBytes.
     */
    int serializeToBytes(byte[] aDestBytes, int aDestOffset);

    /**
     * <p>deserializeFrom.</p>
     * 
     * @param aSrcBytes a srcBytes to deserialize.
     * @param aSrcOffset a srcOffset to deserialize.
     * @param aSrcLength the srcLength to deserialize.
     */
    void deserializeFromBytes(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength);

}
