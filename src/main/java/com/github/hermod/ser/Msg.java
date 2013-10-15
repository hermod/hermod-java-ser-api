package com.github.hermod.ser;

import checkers.nullness.quals.NonNull;
import checkers.nullness.quals.Nullable;

/**
 * <p>Msg interface.</p>
 * 
 * @author anavarro
 */
public interface Msg {

    // Read operations

    /**
     * <p>contains.</p>
     * 
     * @param aKey a int.
     * @return a boolean.
     */
    boolean contains(final int aKey);

    /**
     * <p>getAsBoolean.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableBoolean(final int aKey); if you want to have directy null
     * 
     * @param aKey a int.
     * @return a boolean.
     */
    boolean getAsBoolean(final int aKey);

    /**
     * getAsNullableBoolean.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Boolean getAsNullableBoolean(final int aKey);

    /**
     * <p>getAsByte.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableByte(final int aKey, final Class<T> clazz); if you want to have directy null.
     * 
     * @param aKey a int.
     * @return a byte.
     */
    byte getAsByte(final int aKey);

    /**
     * getAsNullableByte.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Byte getAsNullableByte(final int aKey);

    /**
     * <p>getAsShort.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableShort(final int aKey); if you want to have directy null
     * 
     * @param aKey a int.
     * @return a short.
     */
    short getAsShort(final int aKey);

    /**
     * getAsNullableShort.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Short getAsNullableShort(final int aKey);

    /**
     * <p>getAsInt.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableInteger(final int aKey); if you want to have directy null
     * 
     * @param aKey a int.
     * @param defaultValue
     * @return a int.
     */
    int getAsInt(final int aKey);

    /**
     * getAsNullableInt.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Integer getAsNullableInteger(final int aKey);

    /**
     * <p>getAsLong.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableLong(final int aKey); if you want to have directy null
     * 
     * @param aKey a int.
     * @return a long.
     */
    long getAsLong(final int aKey);

    /**
     * getAsNullableLong.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Long getAsNullableLong(final int aKey);

    /**
     * <p>getAsFloat.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableFloat(final int aKey); if you want to have directy null
     * 
     * @param aKey a int.
     * @return a float.
     */
    float getAsFloat(final int aKey);

    /**
     * getAsNullableFloat.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Float getAsNullableFloat(final int aKey);

    /**
     * <p>getAsDouble.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableDouble(final int aKey); if you want to have directy null
     * 
     * @param aKey a int.
     * @return a double.
     */
    double getAsDouble(final int aKey);

    /**
     * getAsNullableDouble.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Double getAsNullableDouble(final int aKey);

    /**
     * <p>getAsString.</p>
     * 
     * @param aKey a int.
     * @return a {@link java.lang.String} object.
     */
    @Nullable
    String getAsString(final int aKey);

    /**
     * <p>getAsMsg.</p>
     * 
     * @param aKey a int.
     * @return a {@link com.github.hermod.ser.Msg} object.
     */
    @Nullable
    Msg getAsMsg(final int aKey);

    /**
     * <p>getAsMsg.</p>
     * 
     * @param aKey a int.
     * @return a {@link com.github.hermod.ser.Msg} object.
     */
    void getAsMsg(final int aKey, final Msg destMsg);

    /**
     * <p>get.</p>
     * 
     * @param aKey a int.
     * @return a {@link java.lang.Object} object.
     */
    @Nullable
    Object getAsObject(final int aKey);

    /**
     * <p>getAsObject.</p>
     * 
     * @param aKey a int
     * @param clazz
     * @return a {@link java.lang.Object} object.
     */
    @Nullable
    <T> T getAsObject(final int aKey, final Class<T> clazz);

    /**
     * <p>getAsBooleans.</p>
     * 
     * @param aKey
     * @return
     */
    /* @Nullable */boolean[] getAsBooleans(final int aKey);

    /**
     * getAsNullableBooleans.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Boolean[] getAsNullableBooleans(final int aKey);

    /**
     * <p>getAsBytes.</p>
     * 
     * @param aKey
     * @return
     */
    /* @Nullable */byte[] getAsBytes(final int aKey);

    /**
     * getAsNullableBytes.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Byte[] getAsNullableBytes(final int aKey);

    /**
     * <p>getAsShorts.</p>
     * 
     * @param aKey
     * @return
     */
    /* @Nullable */short[] getAsShorts(final int aKey);

    /**
     * getAsNullableShorts.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Short[] getAsNullableShorts(final int aKey);

    /**
     * <p>getAsInts.</p>
     * 
     * @param aKey
     * @return
     */
    /* @Nullable */int[] getAsInts(final int aKey);

    /**
     * getAsNullableIntegers.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Integer[] getAsNullableIntegers(final int aKey);

    /**
     * <p>getAsLongs.</p>
     * 
     * @param aKey
     * @return
     */
    /* @Nullable */long[] getAsLongs(final int aKey);

    /**
     * getAsNullableLongs.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Long[] getAsNullableLongs(final int aKey);

    /**
     * <p>getAsFloats.</p>
     * 
     * @param aKey
     * @return
     */
    /* @Nullable */float[] getAsFloats(final int aKey);

    /**
     * getAsNullableFloats.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Float[] getAsNullableFloats(final int aKey);

    /**
     * <p>getAsDoubles.</p>
     * 
     * @param aKey
     * @return
     */
    /* @Nullable */double[] getAsDoubles(final int aKey);

    /**
     * getAsNullableDoubles.
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Double[] getAsNullableDoubles(final int aKey);

    /**
     * <p>getAsStrings.</p>
     * 
     * @param aKey
     * @return
     */
    @Nullable
    String[] getAsStrings(final int aKey);

    /**
     * <p>getAsMsgs.</p>
     * 
     * @param aKey
     * @return
     */
    @Nullable
    Msg[] getAsMsgs(final int aKey);

    /**
     * getAsMsgs.
     * 
     * @param aKey
     * @param destMsgs
     */
    void getAsMsgs(final int aKey, @Nullable Msg... destMsgs);

    /**
     * getAll.
     * 
     * @return
     */
    // TODO is it clone?
    @NonNull
    Msg getAll();

    /**
     * getType.
     * 
     * @param key
     * @return
     */
    @NonNull
    Type getType(final int key);

    /**
     * getTypeAsByte.
     * 
     * @param key
     * @return
     */
    byte getTypeAsByte(final int key);

    // TODO
    // Add it or not?
    // with lenghtOfLenght / type
    // int getLength(final int key)

    /**
     * isArray.
     * 
     * @param key
     * @return
     */
    boolean isArray(final int key);

    /**
     * getArrayLength.
     * 
     * @param key
     * @return
     */
    int getArrayLength(final int key);

    /**
     * <p>retrieveKeys.</p>
     * 
     * @return an array of int.
     */
    int[] retrieveKeys();

    /**
     * size.
     * 
     * @return the number of keys
     */
    int countKeys();

    /**
     * isEmpty.
     * 
     * @return
     */
    boolean isEmpty();

    //  Write opertations
    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aBoolean a aBoolean.
     */
    void set(final int aKey, final boolean aBoolean);

    /**
     * set.
     * 
     * @param aKey
     * @param aBoolean
     */
    void set(final int aKey, @Nullable final Boolean aBoolean);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aByte a byte.
     */
    void set(final int aKey, final byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aByte a byte.
     */
    void set(final int aKey, @Nullable final Byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aShort a short.
     */
    void set(final int aKey, final short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aShort a short.
     */
    void set(final int aKey, @Nullable final Short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aInt a int.
     */
    void set(final int aKey, final int aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aInt a int.
     */
    void set(final int aKey, @Nullable final Integer aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aLong a long.
     */
    void set(final int aKey, final long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aLong a long.
     */
    void set(final int aKey, @Nullable final Long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aFloat a float.
     */
    void set(final int aKey, final float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aFloat a float.
     */
    void set(final int aKey, @Nullable final Float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aDouble a double.
     */
    void set(final int aKey, final double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aDouble a double.
     */
    void set(final int aKey, @Nullable final Double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aDouble a double.
     * @param nbDigit a int.
     */
    void set(final int aKey, final double aDouble, final int nbDigit);

    /**
     * set.
     * 
     * @param aKey
     * @param aDouble
     * @param aPrecision
     */
    void set(final int aKey, final double aDouble, @NonNull final Precision aPrecision);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aDouble a double.
     * @param nbDigit a int.
     */
    void set(final int aKey, @Nullable final Double aDouble, final int nbDigit);

    /**
     * set.
     * 
     * @param aKey
     * @param aDouble
     * @param aPrecision
     */
    void set(final int aKey, @Nullable final Double aDouble, @NonNull final Precision aPrecision);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aString a {@link java.lang.String} object.
     */
    void set(final int aKey, @Nullable final String aString);

    /**
     * set.
     * 
     * @param aKey
     * @param aString
     * @param forceIso88591Charset
     */
    void set(final int aKey, @Nullable final String aString, final boolean forceIso88591Charset);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void set(final int aKey, @Nullable final Msg aMsg);

    /**
     * <p>set.</p>
     * 
     * @param aKey
     * @param anObject
     */
    void set(final int aKey, @Nullable final Object anObject);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, @Nullable final boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, @Nullable final Boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a byte[]
     */
    void set(final int aKey, @Nullable final byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a byte[]
     */
    void set(final int aKey, @Nullable final Byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a short[]
     */
    void set(final int aKey, @Nullable final short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a short[]
     */
    void set(final int aKey, @Nullable final Short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a int[]
     */
    void set(final int aKey, @Nullable final int... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a int[]
     */
    void set(final int aKey, @Nullable final Integer... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a long[]
     */
    void set(final int aKey, @Nullable final long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a long[]
     */
    void set(final int aKey, @Nullable final Long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a float[]
     */
    void set(final int aKey, @Nullable final float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a float[]
     */
    void set(final int aKey, @Nullable final Float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a double[]
     */
    void set(final int aKey, @Nullable final double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a double[]
     */
    void set(final int aKey, @Nullable final Double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a string[]
     */
    void set(final int aKey, @Nullable final String... aStrings);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a string[]
     */
    void set(final int aKey, @Nullable final String[] aStrings, final boolean forceIso88591Charset);

    /**
     * <p>set.</p>
     * 
     * @param aKey a int.
     * @param anArray a IMsg[]
     */
    void set(final int aKey, @Nullable final Msg... aMsgs);

    /**
     * <p>setAll.</p>
     * 
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void setAll(@Nullable final Msg aMsg);

    /**
     * <p>remove.</p>
     * 
     * @param aKey a int.
     */
    void remove(@Nullable final int... aKeys);

    /**
     * <p>removeAll.</p>
     * 
     */
    void removeAll();

}
