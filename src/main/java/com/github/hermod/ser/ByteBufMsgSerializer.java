package com.github.hermod.ser;

import io.netty.buffer.ByteBuf;

/**
 * <p>ByteBufferMsgSerializer.</p>
 * 
 * The interface ByteBufSerializable is used to serialize/deserialize from/to a Msg to/from ByteBuf.
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public interface ByteBufMsgSerializer extends MsgSerializer {

    /**
     * <p>serializeToByteBuf.</p>
     * 
     * @param aSrcMsg a msg to serialize.
     * @return the serialized ByteBuf of the Msg.
     */
    ByteBuf serializeToByteBuf(final Msg aSrcMsg);

    /**
     * <p>serializeToByteBuf.</p>
     * 
     * @param aSrcMsg a msg to serialize.
     * @param aDestByteBuf the aDestByteBuf to serialize.
     * @return the end position of the Msg in the aDestByteBuf.
     */
    int serializeToByteBuf(final Msg aSrcMsg, ByteBuf aDestByteBuf);

    /**
     * <p>deserializeFromByteBuf.</p>
     * 
     * @param aSrcByteBuf the aSrcByteBuf to deserialize.
     * @param aDestMsg a msg to deserialize.
     */
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf, Msg aDestMsg);

}
