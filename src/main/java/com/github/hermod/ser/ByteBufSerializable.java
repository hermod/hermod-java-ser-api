package com.github.hermod.ser;

import io.netty.buffer.ByteBuf;

/**
 * <p>ByteBufSerializable.</p>
 * 
 * The interface ByteBufSerializable when it is implemented in a msg implementation is used to serialize/deserialize from/to a Msg to/from ByteBuf.
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public interface ByteBufSerializable extends Serializable {

    /**
     * <p>serializeToByteBuf.</p>
     * 
     * @return the serialized ByteBuf of the Msg.
     */
    ByteBuf serializeToByteBuf();

    /**
     * <p>serializeToByteBuf.</p>
     * 
     * @param aDestByteBuf the aDestByteBuf to serialize.
     */
    void serializeToByteBuf(final ByteBuf aDestByteBuf);

    /**
     * <p>deserializeFromByteBuf.</p>
     * 
     * @param aSrcByteBuf the aSrcByteBuf to deserialize.
     */
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf);

}
