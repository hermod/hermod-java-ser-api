package com.github.hermod.ser;


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
     * isSerializable.
     *
     * @return
     */
    boolean isSerializable();
    
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
     * <p>getKeysArray.</p>
     * 
     * @return an array of int.
     */
    int[] getKeysArray();
    
    /**
     * getKeyMax.
     *
     * @return
     */
    int getKeyMax();

    /**
     * getKeysLength.
     * 
     * @return the number of keys
     */
    int getKeysLength();

    
    // Value Information methods
    
    /**
     * getType.
     * 
     * @param key
     * @return
     */
    Type getType(final int key);

    /**
     * getTypeAsByte.
     * 
     * @param key
     * @return
     */
    byte getTypeAsByte(final int key);


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
     * getLength.
     *
     * @param aKey
     * @return
     */
    //TODO to add?
    //int getLength(final int aKey);
    
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
    
    Object get(final int aKey);

    /**
     * <p>get.</p>
     * 
     * @param aKey an unsigned int
     * @param clazz
     * @return a {@link java.lang.Object} object.
     */
    
    <T> T get(final int aKey, final Class<T> clazz);
    
    /**
     * getAsNull.
     *
     * @param aKey
     * @return
     */
    Null getAsNull(final int aKey);
    
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
    
    Long getAsNullableLong(final int aKey);
    
    
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
    
    Double getAsNullableDouble(final int aKey);
    
    /**
     * getAsBigDecimal.
     *
     * @param aKey an unsigned int.
     * @return
     */
    //TODO to add?
    //BigDecimal getAsBigDecimal(final int aKey);
      
    /**
     * <p>getAsString.</p>
     * 
     * @param aKey an unsigned int.
     * @return a {@link java.lang.String} object.
     */
    
    String getAsString(final int aKey);

    /**
     * <p>getAsMsg.</p>
     * 
     * @param aKey an unsigned int.
     * @return a {@link com.github.hermod.ser.Msg} object.
     */
    
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
    boolean[] getAsBooleans(final int aKey);

    /**
     * getAsNullableBooleans.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Boolean[] getAsNullableBooleans(final int aKey);

    /**
     * <p>getAsBytes.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    byte[] getAsBytes(final int aKey);

    /**
     * getAsNullableBytes.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Byte[] getAsNullableBytes(final int aKey);

    /**
     * <p>getAsShorts.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    short[] getAsShorts(final int aKey);

    /**
     * getAsNullableShorts.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Short[] getAsNullableShorts(final int aKey);

    /**
     * <p>getAsInts.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    int[] getAsInts(final int aKey);

    /**
     * getAsNullableIntegers.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Integer[] getAsNullableIntegers(final int aKey);

    /**
     * <p>getAsLongs.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    long[] getAsLongs(final int aKey);

    /**
     * getAsNullableLongs.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Long[] getAsNullableLongs(final int aKey);

    /**
     * <p>getAsFloats.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    float[] getAsFloats(final int aKey);

    /**
     * getAsNullableFloats.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Float[] getAsNullableFloats(final int aKey);

    /**
     * <p>getAsDoubles.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    double[] getAsDoubles(final int aKey);

    /**
     * getAsNullableDoubles.
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Double[] getAsNullableDoubles(final int aKey);

    
    /**
     * <p>getAsBigDecimals.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    //TODO to add
    //BigDecimal[] getAsBigDecimals(final int aKey);
    
    /**
     * <p>getAsStrings.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    String[] getAsStrings(final int aKey);

    /**
     * <p>getAsMsgs.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Msg[] getAsMsgs(final int aKey);

    /**
     * getAsMsgs.
     * 
     * @param aKey an unsigned int.
     * @param destMsgs
     */
    void getAsMsgs(final int aKey, Msg... destMsgs);
    
    /**
     * <p>getAsObjects.</p>
     * 
     * @param aKey an unsigned int.
     * @return
     */
    
    Object[] getAsObjects(final int aKey);

    /**
     * getAsObjects.
     * 
     * @param aKey an unsigned int.
     * @param destObjects
     */
    //void getAsObjects(final int aKey, Object... destObjects);

    /**
     * getAll.
     * 
     * @return a Msg
     */
    
    Msg getAllAsMsg();
    
    /**
     * getAllAsObjects.
     * 
     * Each key is representing with the index of the array and each value is representing with the values of the array return.
     *
     * @return Object[]
     */
    Object[] getAllAsObjects();
    
    /**
     * getAllAsObjects.
     * 
     * Each key is representing with the index of the array and each value is representing with the values of the array return.
     * Use retrieveKeyMax before to allocate before the right number in the anObjects
     *
     * @return
     */
    void getAllAsObjects( final Object... aObjects);



    
    //  Write Value Methods
    /**
     * set .
     *
     * @param aKey an unsigned int.
     */
    void set(final int aKey, final Null aNull);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anObject
     */
    void set(final int aKey, final Object anObject);
    
    /**
     * set.
     *
     * @param aKey
     * @param aObject
     * @param optimizeLength
     */
    void set(final int aKey, final Object aObject, final boolean optimizeLength);
    
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
    void set(final int aKey, final Boolean aBoolean);
    
    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aBoolean
     */
    void set(final int aKey, final Boolean aBoolean, final boolean optimizeLength);

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
    void set(final int aKey, final Byte aByte);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte.
     */
    void set(final int aKey, final Byte aByte, final boolean optimizeLength);

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
    void set(final int aKey, final short aShort, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short.
     */
    void set(final int aKey, final Short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short.
     */
    void set(final int aKey, final Short aShort, final boolean optimizeLength);
    
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
    void set(final int aKey, final int aInt, final boolean optimizeLength);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a int.
     */
    void set(final int aKey, final Integer aInt);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a int.
     */
    void set(final int aKey, final Integer aInt, final boolean optimizeLength);

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
    void set(final int aKey, final long aLong, final boolean optimizeLength);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long.
     */
    void set(final int aKey, final Long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long.
     */
    void set(final int aKey, final Long aLong, final boolean optimizeLength);
    
    
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
    void set(final int aKey, final Float aFloat);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a float.
     */
    void set(final int aKey, final Float aFloat, final boolean optimizeLength);

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
    void set(final int aKey, final double aDouble, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     */
    void set(final int aKey, final Double aDouble);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     */
    void set(final int aKey, final Double aDouble, final boolean optimizeLength);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param aScale a int.
     */
    void set(final int aKey, final double aDouble, final int aScale);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param aScale a int.
     */
    void set(final int aKey, final Double aDouble, final int aScale);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param aScale a int.
     */
    //void set(final int aKey, final double aDouble, final int aScale, final boolean optimizeLength);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double.
     * @param aScale a int.
     */
    void set(final int aKey, final Double aDouble, final int aScale, final boolean optimizeLength);

    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBigDecimal a BigDecimal.
     */
    //TODO to add ?
    //void set(final int aKey, final BigDecimal aBigDecimal);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBigDecimal a BigDecimal.
     * @param optimizeLength .
     */
    //TODO to add
    //void set(final int aKey, final BigDecimal aBigDecimal, final boolean optimizeLength);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aString a {@link java.lang.String} object.
     */
    void set(final int aKey, final String aString);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aString a {@link java.lang.String} object.
     */
    void set(final int aKey, final String aString, final boolean forceAsciiEncoding);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void set(final int aKey, final Msg aMsg);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, final boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, final Boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a byte[]
     */
    void set(final int aKey, final byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a byte[]
     */
    void set(final int aKey, final Byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a short[]
     */
    void set(final int aKey, final short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a short[]
     */
    void set(final int aKey, final Short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a int[]
     */
    void set(final int aKey, final int... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a int[]
     */
    void set(final int aKey, final Integer... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a long[]
     */
    void set(final int aKey, final long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a long[]
     */
    void set(final int aKey, final Long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a float[]
     */
    void set(final int aKey, final float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a float[]
     */
    void set(final int aKey, final Float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a double[]
     */
    void set(final int aKey, final double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a double[]
     */
    void set(final int aKey, final Double... aDoubles);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a double[]
     */
    //TODO to add ?
    //void set(final int aKey, final BigDecimal... aBigDecimal);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a string[]
     */
    void set(final int aKey, final String... aStrings);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a string[]
     */
    void set(final int aKey, final String[] aStrings, final boolean forceAsciiEncoding);
    
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anArray a IMsg[]
     */
    void set(final int aKey, final Msg... aMsgs);
    
    /**
     * <p>setAll.</p>
     * 
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void setAll(final Msg aMsg);
    
    /**
     * setAll.
     * 
     * Each key is representing with the index of the array and each value is representing with the value of the array in argument.
     *
     * @param anObjects
     */
    void setAll(final Object... anObjects);

    /**
     * <p>remove.</p>
     * 
     * @param aKey an unsigned int... 
     */
    void remove(final int... aKeys);

    /**
     * <p>removeAll.</p>
     * 
     */
    void removeAll();

}
