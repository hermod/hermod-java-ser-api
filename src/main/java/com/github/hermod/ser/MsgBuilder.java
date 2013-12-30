package com.github.hermod.ser;

/**
 * <p>MsgBuilder.</p>
 *
 * @author anavarro - Dec 29, 2013
 *
 */
public interface MsgBuilder {

    /**
     * set .
     *
     * @param aKey an unsigned int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Null aNull);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anObject
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Object anObject);

    /**
     * set.
     *
     * @param aKey
     * @param aObject
     * @param optimizeLength
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Object aObject, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aBoolean a aBoolean.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final boolean aBoolean);

    /**
     * set.
     *
     * @param aKey an unsigned int.
     * @param aBoolean
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Boolean aBoolean);

    /**
     * set.
     *
     * @param aKey an unsigned int.
     * @param aBoolean
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Boolean aBoolean, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aByte a byte.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final byte aByte);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aByte a byte.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Byte aByte);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aByte a byte.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Byte aByte, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aShort a short.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final short aShort);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aShort a short.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final short aShort, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aShort a short.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Short aShort);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aShort a short.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Short aShort, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aInt a int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final int aInt);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aInt a int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final int aInt, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aInt a int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Integer aInt);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aInt a int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Integer aInt, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aLong a long.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final long aLong);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aLong a long.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final long aLong, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aLong a long.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Long aLong);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aLong a long.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Long aLong, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aFloat a float.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final float aFloat);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aFloat a float.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Float aFloat);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aFloat a float.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Float aFloat, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final double aDouble);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final double aDouble, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Double aDouble);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Double aDouble, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param aScale a int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final double aDouble, final int aScale);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param aScale a int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Double aDouble, final int aScale);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param aScale a int.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Double aDouble, final int aScale, final boolean optimizeLength);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aString a {@link java.lang.String} object.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final String aString);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aString a {@link java.lang.String} object.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final String aString, final boolean forceAsciiEncoding);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Msg aMsg);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a boolean[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final boolean... aBooleans);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a boolean[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Boolean... aBooleans);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a byte[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final byte... aBytes);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a byte[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Byte... aBytes);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a short[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final short... aShorts);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a short[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Short... aShorts);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a int[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final int... aInts);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a int[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Integer... aInts);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a long[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final long... aLongs);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a long[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Long... aLongs);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a float[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final float... aFloats);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a float[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Float... aFloats);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a double[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final double... aDoubles);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a double[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Double... aDoubles);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a string[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final String... aStrings);

    /**
     * <p>set.</p>
     *
     * @param aKey an unsigned int.
     * @param anArray a string[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final String[] aStrings, final boolean forceAsciiEncoding);

    /**
     * <p>set</p>.
     *
     * @param aKey an unsigned int.
     * @param anArray a IMsg[]
     * @return a MsgBuilder
     */
    MsgBuilder set(final int aKey, final Msg... aMsgs);

    /**
     * <p>removeAll</p>.
     *
     * @return a MsgBuilder
     */
    MsgBuilder removeAll();

    /**
     * build.
     *
     * @return a Msg
     */
    Msg build();
}
