package com.github.hermod.ser;

import java.util.List;

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
     * @param aKey a int.
     * @return a boolean.
     */
    boolean getAsBoolean(final int aKey);
    
    
    /**
     * <p>getAsByte.</p>
     *
     * @param aKey a int.
     * @return a byte.
     */
    byte getAsByte(final int aKey);
    
    /**
     * <p>getAsShort.</p>
     *
     * @param aKey a int.
     * @return a short.
     */
    short getAsShort(final int aKey);
    
    /**
     * <p>getAsInt.</p>
     *
     * @param aKey a int.
     * @param defaultValue
     * @return a int.
     */
    int getAsInt(final int aKey);
     
    /**
     * <p>getAsLong.</p>
     *
     * @param aKey a int.
     * @return a long.
     */
    long getAsLong(final int aKey);

    /**
     * <p>getAsFloat.</p>
     *
     * @param aKey a int.
     * @return a float.
     */
    float getAsFloat(final int aKey);

    /**
     * <p>getAsDouble.</p>
     *
     * @param aKey a int.
     * @return a double.
     */
    double getAsDouble(final int aKey);

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
     * getAsObject.
     *
     * @param aKey
     * @param clazz
     * @param destObj
     */
    //TODO to add?
    //<T> void getAsObject(final int aKey, final Class<T> clazz, final T destObj);
    
    /**
     * <p>getAsBooleans.</p>
     *
     * @param aKey
     * @return
     */
    boolean[] getAsBooleans(final int aKey);
    
    /**
     * <p>getAsBytes.</p>
     *
     * @param aKey
     * @return
     */
    byte[] getAsBytes(final int aKey);
    
    
    /**
     * getAsBytes.
     *
     * @param aKey
     * @param aSerializer
     * @return
     */
    //TODO
    //<T extends IMsg> T getAsBytes(final int aKey, final ISerializer aSerializer);
    <T> T getAsBytes(final int aKey, final ISerializer2<T> aSerializer);
    <T> void getAsBytes(final int aKey, final T dest, final ISerializer2<T> aSerializer);
    /**
     * <p>getAsShorts.</p>
     *
     * @param aKey
     * @return
     */
    short[] getAsShorts(final int aKey);
    
    /**
     * <p>getAsInts.</p>
     *
     * @param aKey
     * @return
     */
    int[] getAsInts(final int aKey);
    
    /**
     * <p>getAsLongs.</p>
     *
     * @param aKey
     * @return
     */
    long[] getAsLongs(final int aKey);
    
    /**
     * <p>getAsFloats.</p>
     *
     * @param aKey
     * @return
     */
    float[] getAsFloats(final int aKey);
    
    /**
     * <p>getAsDoubles.</p>
     *
     * @param aKey
     * @return
     */
    double[] getAsDoubles(final int aKey);
    
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
    void getAsMsgs(final int aKey, IMsg[] destMsgs);
    

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
     * @param aShort a short.
     */
    void set(final int aKey, final short aShort);

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
     * @param aLong a long.
     */
    void set(final int aKey, final long aLong);

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
     * @param aDouble a double.
     */
    void set(final int aKey, final double aDouble);

    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param aDouble a double.
     * @param nbDigit a int.
     */
    void set(final int aKey, final double aDouble, final int nbDigit);

    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param aString a {@link java.lang.String} object.
     */
    void set(final int aKey, final String aString);

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
     * @param anArray a byte[]
     */
    void set(final int aKey, final byte... aBytes);
    
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
     * @param anArray a int[]
     */
    void set(final int aKey, final int... aInts);

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
     * @param anArray a float[]
     */
    void set(final int aKey, final float... aFloats);
    
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
     * @param anArray a string[]
     */
    void set(final int aKey, final String... aStrings);
    
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
    void remove(final int aKey);
    
    /**
     * <p>removeAll.</p>
     *
     */
    void removeAll();
    
    /**
     * <p>removeAll.</p>
     *
     * @param aKey a int[].
     */
    void removeAll(final int[] aKey);

}
