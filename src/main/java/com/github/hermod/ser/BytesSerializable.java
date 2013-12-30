package com.github.hermod.ser;

/**
 * <p>BytesSerializable.</p>
 *
 * Interface BytesSerializable is used to serialize/deserialize from/to a Msg to/from byte[].
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface BytesSerializable extends Serializable {

    /**
     * serializeToBytes.
     *
     * @return the serialized byte[] of the Msg.
     */
    byte[] serializeToBytes();

    /**
     * serializeToBytes.
     *
     * @param aDestBytes the destBytes to serialize.
     * @param aDestOffset the destOffset to serialize.
     * @return the end position of the Msg in the destBytes.
     */
    int serializeToBytes(byte[] aDestBytes, int aDestOffset);

    /**
     * deserializeFrom.
     *
     * @param aSrcBytes the srcBytes to deserialize.
     * @param aSrcOffset the srcOffset to deserialize.
     * @param aSrcLength the srcLength to deserialize.
     */
    void deserializeFromBytes(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength);

}
