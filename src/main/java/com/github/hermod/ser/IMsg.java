package com.github.hermod.ser;


/**
 * <p>IMsg interface.</p>
 *
 * @author anavarro
 */
public interface IMsg {

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
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type).
     * Use <T> T getAsNullableBoolean(final int aKey); if you want to have directy null
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
    Boolean getAsNullableBoolean(final int aKey);
    
    /**
     * <p>getAsByte.</p>
     *
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type).
     * Use <T> T getAsNullableByte(final int aKey, final Class<T> clazz); if you want to have directy null.
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
    Byte getAsNullableByte(final int aKey);
    
    
    /**
     * <p>getAsShort.</p>
     *
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type).
     * Use <T> T getAsNullableShort(final int aKey); if you want to have directy null
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
    Short getAsNullableShort(final int aKey);
    
    /**
     * <p>getAsInt.</p>
     *
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type).
     * Use <T> T getAsNullableInteger(final int aKey); if you want to have directy null
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
    Integer getAsNullableInteger(final int aKey);
     
    /**
     * <p>getAsLong.</p>
     *
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type).
     * Use <T> T getAsNullableLong(final int aKey); if you want to have directy null
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
    Long getAsNullableLong(final int aKey);

    /**
     * <p>getAsFloat.</p>
     *
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type).
     * Use <T> T getAsNullableFloat(final int aKey); if you want to have directy null
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
    Float getAsNullableFloat(final int aKey);

    /**
     * <p>getAsDouble.</p>
     *
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type).
     * Use <T> T getAsNullableDouble(final int aKey); if you want to have directy null
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
    Double getAsNullableDouble(final int aKey);

    /**
     * <p>getAsString.</p>
     *
     * @param aKey a int.
     * @return a {@link java.lang.String} object.
     */
    String getAsString(final int aKey);

    /**
     * <p>getAsMsg.</p>
     *
     * @param aKey a int.
     * @return a {@link com.github.hermod.ser.IMsg} object.
     */
    IMsg getAsMsg(final int aKey);
    
    
    /**
     * <p>getAsMsg.</p>
     *
     * @param aKey a int.
     * @return a {@link com.github.hermod.ser.IMsg} object.
     */
    void getAsMsg(final int aKey, final IMsg destMsg);
    
    
    /**
     * <p>get.</p>
     *
     * @param aKey a int.
     * @return a {@link java.lang.Object} object.
     */
    Object getAsObject(final int aKey);
    
    /**
     * <p>getAsObject.</p>
     *
     * @param aKey a int
     * @param clazz
     * @return a {@link java.lang.Object} object.
     */
    <T> T getAsObject(final int aKey, final Class<T> clazz);
    
    
    /**
     * <p>getAsBooleans.</p>
     *
     * @param aKey
     * @return
     */
    boolean[] getAsBooleans(final int aKey);
    
    /**
     * getAsNullableBooleans.
     *
     * @param aKey
     * @return
     */
    Boolean[] getAsNullableBooleans(final int aKey);
    
    /**
     * <p>getAsBytes.</p>
     *
     * @param aKey
     * @return
     */
    byte[] getAsBytes(final int aKey);
    
    /**
     * getAsNullableBytes.
     *
     * @param aKey
     * @return
     */
    Byte[] getAsNullableBytes(final int aKey);
    
    /**
     * <p>getAsShorts.</p>
     *
     * @param aKey
     * @return
     */
    short[] getAsShorts(final int aKey);
    
    
    /**
     * getAsNullableShorts.
     *
     * @param aKey
     * @return
     */
    Short[] getAsNullableShorts(final int aKey);
    
    /**
     * <p>getAsInts.</p>
     *
     * @param aKey
     * @return
     */
    int[] getAsInts(final int aKey);
    
    /**
     * getAsNullableIntegers.
     *
     * @param aKey
     * @return
     */
    Integer[] getAsNullableIntegers(final int aKey);
    
    /**
     * <p>getAsLongs.</p>
     *
     * @param aKey
     * @return
     */
    long[] getAsLongs(final int aKey);
    
    /**
     * getAsNullableLongs.
     *
     * @param aKey
     * @return
     */
    Long[] getAsNullableLongs(final int aKey);
    
    /**
     * <p>getAsFloats.</p>
     *
     * @param aKey
     * @return
     */
    float[] getAsFloats(final int aKey);
    
    /**
     * getAsNullableFloats.
     *
     * @param aKey
     * @return
     */
    Float[] getAsNullableFloats(final int aKey);
    
    /**
     * <p>getAsDoubles.</p>
     *
     * @param aKey
     * @return
     */
    double[] getAsDoubles(final int aKey);
    
    /**
     * getAsNullableDoubles.
     *
     * @param aKey
     * @return
     */
    Double[] getAsNullableDoubles(final int aKey);
    
    /**
     * <p>getAsStrings.</p>
     *
     * @param aKey
     * @return
     */
    String[] getAsStrings(final int aKey);

    /**
     * <p>getAsMsgs.</p>
     *
     * @param aKey
     * @return
     */
    IMsg[] getAsMsgs(final int aKey);

    /**
     * getAsMsgs.
     *
     * @param aKey
     * @param destMsgs
     */
    void getAsMsgs(final int aKey, IMsg... destMsgs);
    
    /**
     * getAll.
     *
     * @return
     */
    //TODO is it clone?
    IMsg getAll(); 
    
    /**
     * getType.
     *
     * @param key
     * @return
     */
    EType getType(final int key);
    
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
    //int getLength(final int key)
    
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
     * <p>getKeys.</p>
     *
     * @return an array of int.
     */
    int[] getKeys();
    
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
    
    
    
    
    // Write opertations
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
    void set(final int aKey, final Boolean aBoolean);

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
    void set(final int aKey, final Byte aByte);

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
    void set(final int aKey, final Short aShort);

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
    void set(final int aKey, final Integer aInt);

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
    void set(final int aKey, final Long aLong);

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
    void set(final int aKey, final Float aFloat);

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
    void set(final int aKey, final Double aDouble);

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
    void set(final int aKey, final double aDouble, final EPrecision aPrecision);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param aDouble a double.
     * @param nbDigit a int.
     */
    void set(final int aKey, final Double aDouble, final int nbDigit);
    
    /**
     * set.
     *
     * @param aKey
     * @param aDouble
     * @param aPrecision
     */
    void set(final int aKey, final Double aDouble, final EPrecision aPrecision);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param aString a {@link java.lang.String} object.
     */
    void set(final int aKey, final String aString);
    
    /**
     * set.
     *
     * @param aKey
     * @param aString
     * @param forceIso88591Charset
     */
    void set(final int aKey, final String aString, final boolean forceIso88591Charset);
    

    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param aMsg a {@link com.github.hermod.ser.IMsg} object.
     */
    void set(final int aKey, final IMsg aMsg);
    
    /**
     * <p>set.</p>
     *
     * @param aKey
     * @param anObject
     */
    void set(final int aKey, final Object anObject);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, final boolean... aBooleans);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a boolean[]
     */
    void set(final int aKey, final Boolean... aBooleans);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a byte[]
     */
    void set(final int aKey, final byte... aBytes);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a byte[]
     */
    void set(final int aKey, final Byte... aBytes);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a short[]
     */
    void set(final int aKey, final short... aShorts);
   
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a short[]
     */
    void set(final int aKey, final Short... aShorts);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a int[]
     */
    void set(final int aKey, final int... aInts);

    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a int[]
     */
    void set(final int aKey, final Integer... aInts);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a long[]
     */
    void set(final int aKey, final long... aLongs);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a long[]
     */
    void set(final int aKey, final Long... aLongs);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a float[]
     */
    void set(final int aKey, final float... aFloats);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a float[]
     */
    void set(final int aKey, final Float... aFloats);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a double[]
     */
    void set(final int aKey, final double... aDoubles);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a double[]
     */
    void set(final int aKey, final Double... aDoubles);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a string[]
     */
    void set(final int aKey, final String... aStrings);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a string[]
     */
    void set(final int aKey, final String[] aStrings, final boolean forceIso88591Charset);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a IMsg[]
     */
    void set(final int aKey, final IMsg... aMsgs);
    
    /**
     * <p>setAll.</p>
     *
     * @param aMsg a {@link com.github.hermod.ser.IMsg} object.
     */
    void setAll(final IMsg aMsg);

    /**
     * <p>remove.</p>
     *
     * @param aKey a int.
     */
    void remove(final int... aKeys);
    
    /**
     * <p>removeAll.</p>
     *
     */
    void removeAll();


}
