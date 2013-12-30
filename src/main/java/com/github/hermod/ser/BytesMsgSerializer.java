package com.github.hermod.ser;

/**
 * <p>BytesMsgSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface BytesMsgSerializer extends MsgSerializer {

    /**
     * serializeToBytes.
     *
     * @param aSrcMsg
     * @return
     */
    byte[] serializeToBytes(final Msg aSrcMsg);

    /**
     * serializeToBytes.
     *
     * @param aDestBytes
     * @param aDestOffset
     * @param aSrcMsg
     * @return
     */
    int serializeToBytes(final Msg aSrcMsg, byte[] aDestBytes, int aDestOffset);

    /**
     * deserializeFrom.
     *
     * @param aSrcBytes
     * @param aSrcOffset
     * @param aSrcLength
     * @param aDestMsg
     */
    void deserializeFromBytes(final byte[] aSrcBytes, final int aSrcOffset, final int aSrcLength, Msg aDestMsg);

}
