package com.github.hermod.ser;

import io.netty.buffer.ByteBuf;

/**
 * <p>ByteBufClassSerializer.</p>
 *
 * @author anavarro - Dec 29, 2013
 * @param <T>
 *
 */
public interface ByteBufClassSerializer<T> {

    /**
     * <p>serializeToByteBuffer.</p>
     *
     * @param aSrcObject a src object T to serialize
     * @return a ByteBuf to serialize
     */
    ByteBuf serializeToByteBuf(final T aSrcObject);

    /**
     * <p>serializeToByteBuffer.</p>
     *
     * @param aSrcObject a src object T to serialize
     * @param aDestByteBuf a ByteBuf to serialize
     */
    void serializeToByteBuf(final T aSrcObject, final ByteBuf aDestByteBuf);

    /**
     * <p>deserializeFrom.</p>
     *
     * @param aSrcByteBuf a src ByteBuf to deserialize
     * @param aSrcLength a src length to deserialize
     * @param aDestObject a object T to serialize
     */
    void deserializeFromByteBuf(final ByteBuf aSrcByteBuf, final int aSrcLength, T aDestObject);

    /**
     * <p>deserializeFrom.</p>
     *
     * @param srcByteBuf a src ByteBuf to deserialize
     * @param srcLength a src length to deserialize
     * @return a object T to serialize
     */

    T deserializeFromByteBuf(final ByteBuf srcByteBuf, final int srcLength);

    /**
     * <p>deserializeFrom.</p>
     *
     * @param srcByteBuf a src ByteBuf to deserialize
     * @param srcLength a src length to deserialize
     * @param aClass a class to serialize
     * @param <S> the type of aClass
     * @return a S to serialize
     */
    <S> S deserializeFromByteBuf(final ByteBuf srcByteBuf, final int srcLength, final Class<S> aClass);

}
