package com.github.hermod.ser;

import io.netty.buffer.ByteBuf;

/**
 * <p>ByteBufSerializable.</p>
 *
 * Interface ByteBufSerializable is used to serialize/deserialize from/to a Msg to/from ByteBuf.
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface ByteBufSerializable extends Serializable {

    /**
     * serializeToByteBuf.
     *
     * @return the serialized ByteBuf of the Msg.
     */
    ByteBuf serializeToByteBuf();

    /**
     * serializeToByteBuf.
     *
     * @param aDestByteBuf the aDestByteBuf to serialize.
     */
    void serializeToByteBuf(final ByteBuf aDestByteBuf);

    /**
     * deserializeFromByteBuf.
     *
     * @param aSrcByteBuf the aSrcByteBuf to deserialize.
     */
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf);

}
