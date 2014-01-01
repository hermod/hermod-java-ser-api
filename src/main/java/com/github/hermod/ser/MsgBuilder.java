package com.github.hermod.ser;

/**
 * <p>MsgBuilder.</p>
 * 
 * The interface MsgBuilder is used to build a Msg with Method Chaining pattern.
 * 
 * @author anavarro - Dec 29, 2013
 * 
 */
public interface MsgBuilder {

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aNull a Null object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Null aNull);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anObject a Object object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Object anObject);

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aObject a Object object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength an boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Object aObject, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a boolean to set in the field of aKey.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final boolean aBoolean);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a Boolean object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Boolean aBoolean);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a Boolean object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Boolean aBoolean, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte to set in the field of aKey.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a Byte object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Byte aByte, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short to set in the field of aKey.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final short aShort, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a Short object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a Short object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Short aShort, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt an int to set in the field of aKey.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final int aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt an int to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final int aInt, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a Integer object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Integer aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt the Integer object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Integer aInt, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long to set in the field of aKey.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final long aLong, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a Long object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a Long object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Long aLong, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a float to set in the field of aKey.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a Float object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a Float object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Float aFloat, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double to set in the field of aKey.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a short to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final double aDouble, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Double aDouble, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double to set in the field of aKey.
     * @param aScale a int which represents the number after the dot if positive and before the dot if negative.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final double aDouble, final int aScale);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     * @param aScale a int which represents the number after the dot if positive and before the dot if negative.
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Double aDouble, final int aScale);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     * @param aScale a int which represents the number after the dot if positive and before the dot if negative.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Double aDouble, final int aScale, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aString a String object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final String aString);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aString a String object to set in the field of aKey (a reference, not a copy).
     * @param forceAsciiEncoding boolean to consider the aString is encoded in ASCII (default is false, UTF8 is used).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final String aString, final boolean forceAsciiEncoding);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aMsg a Msg object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Msg aMsg);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBooleans a boolean... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBooleans a Boolean[] object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBytes a byte... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBytes a Byte... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShorts a short... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShorts a Short... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInts a int... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final int... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInts a Integer... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Integer... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLongs a long... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLongs a Long... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloats a float... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloats a Float... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDoubles a double... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDoubles a Double... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aStrings a String... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final String... aStrings);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aStrings a String... object to set in the field of aKey (a reference, not a copy).
     * @param forceAsciiEncoding boolean to consider the aString is encoded in ASCII (default is false, UTF8 is used).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final String[] aStrings, final boolean forceAsciiEncoding);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aMsgs a Msg... object to set in the field of aKey (a reference, not a copy).
     * @return the MsgBuilder.
     */
    MsgBuilder set(final int aKey, final Msg... aMsgs);

    /**
     * <p>removeAll</p>.
     * 
     * @return the MsgBuilder.
     */
    MsgBuilder removeAll();

    /**
     * <p>build.</p>
     * 
     * @return the Msg.
     */
    Msg build();
}
