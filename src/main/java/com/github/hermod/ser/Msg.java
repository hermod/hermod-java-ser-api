package com.github.hermod.ser;

import checkers.nullness.quals.NonNull;
import checkers.nullness.quals.Nullable;

/**
 * <p>Msg interface.</p>
 * 
 * @author anavarro
 */
public interface Msg {

    
    // Read methods
    
    // Msg Inforation methods
    /**
     * isEmpty.
     * 
     * @return
     */
    boolean isEmpty();
    
    /**
     * isBytesSerializable.
     *
     * @return
     */
    boolean isBytesSerializable();
    
    /**
     * isByteBufferSerializable.
     *
     * @return
     */
    boolean isByteBufferSerializable();
    
    /**
     * isByteBufSerializable.
     *
     * @return
     */
    boolean isByteBufSerializable();
    
    // Keys Information methods
    /**
     * <p>retrieveKeys.</p>
     * 
     * @return an array of int.
     */
    int[] retrieveKeys();
    
    /**
     * retrieveKeyMax.
     *
     * @return
     */
    int retrieveKeyMax();

    /**
     * size.
     * 
     * @return the number of keys
     */
    int countKeys();

    
    // Value Information methods
    
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
     * @param aKey an unsigned int.
     * @return
     */
    boolean isArray(final int aKey);

    /**
     * getArrayLength.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    int getArrayLength(final int aKey);
    
    /**
     * <p>contains.</p>
     * 
     * @param aKey an unsigned int.
     * @return a boolean.
     */
    boolean contains(final int aKey);


    // Read Value Operations
    
    /**
     * <p>get.</p>
     * 
     * @param aKey an unsigned int.
     * @return a {@link java.lang.Object} object.
     */
    @Nullable
    Object get(final int aKey);

    /**
     * <p>get.</p>
     * 
     * @param aKey an unsigned int
     * @param clazz
     * @return a {@link java.lang.Object} object.
     */
    @Nullable
    //TODO to modify get
    <T> T get(final int aKey, final Class<T> clazz);
    
    /**
     * <p>getAsBoolean.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableBoolean(final int aKey); if you want to have directy null
     * 
     * @param aKey an unsigned int.
     * @return a boolean.
     */
    boolean getAsBoolean(final int aKey);

    /**
     * getAsNullableBoolean.
     * 
     * @param aKey an unsigned int.
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
     * @param aKey an unsigned int.
     * @return a byte.
     */
    byte getAsByte(final int aKey);

    /**
     * getAsNullableByte.
     * 
     * @param aKey an unsigned int.
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
     * @param aKey an unsigned int.
     * @return a short.
     */
    short getAsShort(final int aKey);

    /**
     * getAsNullableShort.
     * 
     * @param aKey an unsigned int.
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
     * @param aKey an unsigned int.
     * @param defaultValue
     * @return a int.
     */
    int getAsInt(final int aKey);

    /**
     * getAsNullableInt.
     * 
     * @param aKey an unsigned int.
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
     * @param aKey an unsigned int.
     * @return a long.
     */
    long getAsLong(final int aKey);

    /**
     * getAsNullableLong.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Long getAsNullableLong(final int aKey);
    
    
    // TODO to add
    /**
     * getAsVarInteger.
     *
     * @param aKey an unsigned int.
     * @return
     */
    //@Nullable long getAsVarInteger(final int aKey);
    
    /**
     * getAsInteger.
     *
     * @param aKey an unsigned int.
     * @return
     */
    //@Nullable Long getAsNullableVarInteger(final int aKey);

    /**
     * <p>getAsFloat.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableFloat(final int aKey); if you want to have directy null
     * 
     * @param aKey an unsigned int.
     * @return a float.
     */
    float getAsFloat(final int aKey);

    /**
     * getAsNullableFloat.
     * 
     * @param aKey an unsigned int.
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
     * @param aKey an unsigned int.
     * @return a double.
     */
    double getAsDouble(final int aKey);

    /**
     * getAsNullableDouble.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Double getAsNullableDouble(final int aKey);
    
    //TODO to add
    /**
     * getAsDecimal.
     *
     * @param aKey an unsigned int.
     * @return
     */
    //@Nullable double getAsVarDecimal(final int aKey);
    
    /**
     * getAsNullableDecimal.
     *
     * @param aKey an unsigned int.
     * @return
     */
    //@Nullable Double getAsNullableVarDecimal(final int aKey);
    
    /**
     * <p>getAsString.</p>
     * 
     * @param aKey an unsigned int.
     * @return a {@link java.lang.String} object.
     */
    @Nullable
    String getAsString(final int aKey);

    /**
     * <p>getAsMsg.</p>
     * 
     * @param aKey an unsigned int.
     * @return a {@link com.github.hermod.ser.Msg} object.
     */
    @Nullable
    Msg getAsMsg(final int aKey);

    /**
     * <p>getAsMsg.</p>
     * 
     * @param aKey an unsigned int.
     * @return a {@link com.github.hermod.ser.Msg} object.
     */
    void getAsMsg(final int aKey, final Msg destMsg);

    /**
     * <p>getAsBooleans.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    /* @Nullable */boolean[] getAsBooleans(final int aKey);

    /**
     * getAsNullableBooleans.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Boolean[] getAsNullableBooleans(final int aKey);

    /**
     * <p>getAsBytes.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    /* @Nullable */byte[] getAsBytes(final int aKey);

    /**
     * getAsNullableBytes.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Byte[] getAsNullableBytes(final int aKey);

    /**
     * <p>getAsShorts.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    /* @Nullable */short[] getAsShorts(final int aKey);

    /**
     * getAsNullableShorts.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Short[] getAsNullableShorts(final int aKey);

    /**
     * <p>getAsInts.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    /* @Nullable */int[] getAsInts(final int aKey);

    /**
     * getAsNullableIntegers.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Integer[] getAsNullableIntegers(final int aKey);

    /**
     * <p>getAsLongs.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    /* @Nullable */long[] getAsLongs(final int aKey);

    /**
     * getAsNullableLongs.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Long[] getAsNullableLongs(final int aKey);

    /**
     * <p>getAsFloats.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    /* @Nullable */float[] getAsFloats(final int aKey);

    /**
     * getAsNullableFloats.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Float[] getAsNullableFloats(final int aKey);

    /**
     * <p>getAsDoubles.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    /* @Nullable */double[] getAsDoubles(final int aKey);

    /**
     * getAsNullableDoubles.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Double[] getAsNullableDoubles(final int aKey);

    /**
     * <p>getAsStrings.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    String[] getAsStrings(final int aKey);

    /**
     * <p>getAsMsgs.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Msg[] getAsMsgs(final int aKey);

    /**
     * getAsMsgs.
     * 
     * @param aKey an unsigned int.
     * @param destMsgs
     */
    void getAsMsgs(final int aKey, @Nullable Msg... destMsgs);
    
    /**
     * <p>getAsObjects.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    @Nullable
    Object[] getAsObjects(final int aKey);

    /**
     * getAsObjects.
     * 
     * @param aKey an unsigned int.
     * @param destObjects
     */
    void getAsObjects(final int aKey, @Nullable Object... destObjects);

    /**
     * getAll.
     * 
     * @return
     */
    @NonNull
    Msg getAllAsMsg();
    
    /**
     * getAllAsObjects.
     * 
     * Each key is representing with the index of the array and each value is representing with the values of the array return.
     *
     * @return
     */
    @NonNull
    Object[] getAllAsObjects();
    
    /**
     * getAllAsObjects.
     * 
     * Each key is representing with the index of the array and each value is representing with the values of the array return.
     * Use retrieveKeyMax before to allocate before the right number in the anObjects
     *
     * @return
     */
    void getAllAsObjects(@NonNull final Object... aObjects);



    //  Write Value Methods
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anObject
     */
    void set(final int aKey, @Nullable final Object anObject);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a aBoolean.
     */
    void set(final int aKey, final boolean aBoolean);

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aBoolean
     */
    void set(final int aKey, @Nullable final Boolean aBoolean);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte.
     */
    void set(final int aKey, final byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte.
     */
    void set(final int aKey, @Nullable final Byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short.
     */
    void set(final int aKey, final short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short.
     */
    void set(final int aKey, @Nullable final Short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a int.
     */
    void set(final int aKey, final int aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a int.
     */
    void set(final int aKey, @Nullable final Integer aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long.
     */
    void set(final int aKey, final long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long.
     */
    void set(final int aKey, @Nullable final Long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a float.
     */
    void set(final int aKey, final float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a float.
     */
    void set(final int aKey, @Nullable final Float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     */
    void set(final int aKey, final double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     */
    void set(final int aKey, @Nullable final Double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
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
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param nbDigit a int.
     */
    void set(final int aKey, @Nullable final Double aDouble, final int nbDigit);

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aDouble
     * @param aPrecision
     */
    void set(final int aKey, @Nullable final Double aDouble, @NonNull final Precision aPrecision);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aString a {@link java.lang.String} object.
     */
    void set(final int aKey, @Nullable final String aString);
    

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aString
     * @param forceIso88591Charset
     */
    // TODO remove this method (use setAsciiString instead)
    void set(final int aKey, @Nullable final String aString, final boolean forceIso88591Charset);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void set(final int aKey, @Nullable final Msg aMsg);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, @Nullable final boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, @Nullable final Boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a byte[]
     */
    void set(final int aKey, @Nullable final byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a byte[]
     */
    void set(final int aKey, @Nullable final Byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a short[]
     */
    void set(final int aKey, @Nullable final short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a short[]
     */
    void set(final int aKey, @Nullable final Short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a int[]
     */
    void set(final int aKey, @Nullable final int... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a int[]
     */
    void set(final int aKey, @Nullable final Integer... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a long[]
     */
    void set(final int aKey, @Nullable final long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a long[]
     */
    void set(final int aKey, @Nullable final Long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a float[]
     */
    void set(final int aKey, @Nullable final float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a float[]
     */
    void set(final int aKey, @Nullable final Float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a double[]
     */
    void set(final int aKey, @Nullable final double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a double[]
     */
    void set(final int aKey, @Nullable final Double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a string[]
     */
    void set(final int aKey, @Nullable final String... aStrings);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a string[]
     */
    // TODO remove this method (use setAsciiString instead)
    void set(final int aKey, @Nullable final String[] aStrings, final boolean forceIso88591Charset);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a IMsg[]
     */
    void set(final int aKey, @Nullable final Msg... aMsgs);

    
    // TODO add it
    /**
     * setNull.
     *
     * @param aKey an unsigned int.
     */
    //void setNull(final int aKey);
    
    /**
     * set.
     *
     * @param aKey an unsigned int.
     * @param aLength
     */
    //void setNull(final int aKey, final int aLength);
    
    
    // TODO add it
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a aBoolean.
     */
    //void setAsVarInteger(final int aKey, final boolean aBoolean);

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aBoolean
     */
    //void setAsVarInteger(final int aKey, @Nullable final Boolean aBoolean);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte.
     */
    //void setAsVarInteger(final int aKey, final byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte.
     */
    //void setAsVarInteger(final int aKey, @Nullable final Byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short.
     */
    //void setAsVarInteger(final int aKey, final short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short.
     */
    //void setAsVarInteger(final int aKey, @Nullable final Short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a int.
     */
    //void setAsVarInteger(final int aKey, final int aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a int.
     */
    //void setAsVarInteger(final int aKey, @Nullable final Integer aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long.
     */
    //void setAsVarInteger(final int aKey, final long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long.
     */
    //void setAsVarInteger(final int aKey, @Nullable final Long aLong);
    
    
    
    //TODO add it
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a float.
     */
    //void setAsVarDecimal(final int aKey, final float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a float.
     */
    //void setAsVarDecimal(final int aKey, @Nullable final Float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     */
    //void setAsVarDecimal(final int aKey, final double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     */
    //void setAsVarDecimal(final int aKey, @Nullable final Double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param nbDigit a int.
     */
    //void setAsVarDecimal(final int aKey, final double aDouble, final int nbDigit);

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aDouble
     * @param aPrecision
     */
    //void setAsVarDecimal(final int aKey, final double aDouble, @NonNull final Precision aPrecision);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param nbDigit a int.
     */
    //void setAsVarDecimal(final int aKey, @Nullable final Double aDouble, final int nbDigit);

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aDouble
     * @param aPrecision
     */
    //void setAsVarDecimal(final int aKey, @Nullable final Double aDouble, @NonNull final Precision aPrecision);

    //TODO to add it
    /**
     * setAsciiString.
     *
     * @param aKey an unsigned int.
     * @param aString
     */
    //void setAsAsciiString(final int aKey, @Nullable final String aString);
    
    /**
     * setAsAsciiString.
     *
     * @param aKey an unsigned int.
     * @param aStrings
     */
    //void setAsAsciiString(final int aKey, @Nullable final String... aStrings);
    
    /**
     * <p>setAll.</p>
     * 
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void setAll(@Nullable final Msg aMsg);
    
    /**
     * setAll.
     * 
     * Each key is representing with the index of the array and each value is representing with the value of the array in argument.
     *
     * @param anObjects
     */
    void setAll(@Nullable final Object... anObjects);

    /**
     * <p>remove.</p>
     * 
     * @param aKey an unsigned int... 
     */
    void remove(@Nullable final int... aKeys);

    /**
     * <p>removeAll.</p>
     * 
     */
    void removeAll();

}
