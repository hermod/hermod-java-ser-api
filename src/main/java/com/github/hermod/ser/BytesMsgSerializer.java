package com.github.hermod.ser;

/**
 * <p>BytesMsgSerializer. </p>
 * 
 * The interface BytesMsgSerializer is used to serialize/deserialize from/to a Msg to/from byte[].
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public interface BytesMsgSerializer extends MsgSerializer {

    /**
     * <p>serializeToBytes.</p>
     * 
     * @param aSrcMsg a msg to serialize.
     * @return the serialized byte[] of the Msg.
     */
    byte[] serializeToBytes(final Msg aSrcMsg);

    /**
     * <p>serializeToBytes.</p>
     * 
     * @param aSrcMsg a msg to serialize.
     * @param aDestBytes a destBytes to serialize.
     * @param aDestOffset a destOffset to serialize.
     * @return the end position of the Msg in the destBytes.
     */
    int serializeToBytes(final Msg aSrcMsg, byte[] aDestBytes, int aDestOffset);

    /**
     * <p>deserializeFrom.</p>
     * 
     * @param aSrcBytes a srcBytes to deserialize.
     * @param aSrcOffset a srcOffset to deserialize.
     * @param aSrcLength the srcLength to deserialize.
     * @param aDestMsg a msg to deserialize.
     */
    void deserializeFromBytes(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength, Msg aDestMsg);

}
