package com.github.hermod.ser;

import io.netty.buffer.ByteBuf;

/**
 * <p>ByteBufClassSerializer.</p>
 * 
 * The interface ByteBufSerializable is used to serialize/deserialize from/to an object to/from ByteBuf.
 * 
 * @author anavarro - Dec 29, 2013
 * @param <T>
 * 
 */
public interface ByteBufClassSerializer<T> {

    /**
     * <p>serializeToByteBuf.</p>
     * 
     * @param aSrcObject an object to serialize.
     * @return the serialized ByteBuf of the Msg.
     */
    ByteBuf serializeToByteBuf(final T aSrcObject);

    /**
     * <p>serializeToByteBuf.</p>
     * 
     * @param aSrcObject an object to serialize.
     * @param aDestByteBuf the aDestByteBuf to serialize.
     */
    void serializeToByteBuf(final T aSrcObject, final ByteBuf aDestByteBuf);

    /**
     * <p>deserializeFromByteBuf.</p>
     * 
     * @param aSrcByteBuf the aSrcByteBuf to deserialize.
     * @param aDestObject an object to deserialize.
     */
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf, T aDestObject);

}
