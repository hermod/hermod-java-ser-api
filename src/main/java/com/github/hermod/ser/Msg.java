package com.github.hermod.ser;

/**
 * <p>Msg interface.</p>
 * 
 * The interface Msg is used to set/get field in a message which you can serialize/deserialize through a Serializer.
 * 
 * @author anavarro
 */
public interface Msg {

    // Read methods

    // Msg Inforation methods
    /**
     * <p>isEmpty.</p>
     * 
     * @return true if the msg contains no key.
     */
    boolean isEmpty();

    /**
     * <p>isSerializable.</p>
     * 
     * @return true if the class implements Serializable.
     */
    boolean isSerializable();

    /**
     * <p>isBytesSerializable.</p>
     * 
     * @return true if the class implements BytesSerializable.
     */
    boolean isBytesSerializable();

    /**
     * <p>isByteBufferSerializable.</p>
     * 
     * @return true if the class implements ByteBufferSerializable.
     */
    boolean isByteBufferSerializable();

    /**
     * <p>isByteBufSerializable.</p>
     * 
     * @return true if the class implements ByteBufSerializable.
     */
    boolean isByteBufSerializable();

    // Keys Information methods
    /**
     * <p>getKeysArray.</p>
     * 
     * @return the array of keys of the msg.
     */
    int[] getKeysArray();

    /**
     * <p>getKeyMax.</p>
     * 
     * @return the key max of the msg.
     */
    int getKeyMax();

    /**
     * <p>getKeysLength.</p>
     * 
     * @return the number of keys of the msg.
     */
    int getKeysLength();

    // Value Information methods

    /**
     * <p>getType.</p>
     * 
     * @param aKey a unsigned int.
     * @return the Type of the field of aKey.
     */
    Type getType(final int aKey);

    /**
     * <p>getTypeAsByte.</p>
     * 
     * @param aKey a unsigned int.
     * @return the Type as byte of the field of aKey.
     */
    byte getTypeAsByte(final int aKey);

    /**
     * <p>isArray.</p>
     * 
     * @param aKey an unsigned int.
     * @return true if the field of aKey is an array.
     */
    boolean isArray(final int aKey);

    /**
     * <p>getArrayLength.</p>
     * 
     * @param aKey an unsigned int.
     * @return the length of the array of the field of aKey.
     */
    int getArrayLength(final int aKey);

    /**
     * <p>contains.</p>
     * 
     * @param aKey an unsigned int.
     * @return true if the field of aKey is set.
     */
    boolean contains(final int aKey);

    // Read Value Operations

    /**
     * <p>get.</p>
     * 
     * @param aKey an unsigned int.
     * @return the object of the field of aKey (a copy).
     */
    Object get(final int aKey);

    /**
     * <p>get.</p>
     * 
     * @param aKey an unsigned int.
     * @param clazz a class you want to get.
     * @param <T> the type you want to get.
     * @return the object of the field of aKey with clazz type (a copy).
     */
    <T> T get(final int aKey, final Class<T> clazz);

    /**
     * <p>getAsNull.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Null object of the field of aKey (a copy).
     */
    Null getAsNull(final int aKey);

    /**
     * <p>getAsBoolean.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableBoolean(final int aKey); if you want to have directy null.
     * 
     * @param aKey an unsigned int.
     * @return the boolean of the field of aKey.
     */
    boolean getAsBoolean(final int aKey);

    /**
     * <p>getAsNullableBoolean.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Boolean of the field of aKey (a copy).
     */
    Boolean getAsNullableBoolean(final int aKey);

    /**
     * <p>getAsByte.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableByte(final int aKey, final Class<T> clazz); if you want to have directy null.
     * 
     * @param aKey an unsigned int aKey.
     * @return the byte of the field of aKey.
     */
    byte getAsByte(final int aKey);

    /**
     * <p>getAsNullableByte.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Byte of the field of aKey (a copy).
     */
    Byte getAsNullableByte(final int aKey);

    /**
     * <p>getAsShort.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableShort(final int aKey); if you want to have directy null.
     * 
     * @param aKey an unsigned int.
     * @return the short of the field of aKey.
     */
    short getAsShort(final int aKey);

    /**
     * <p>getAsNullableShort.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Short of the field of aKey (a copy).
     */
    Short getAsNullableShort(final int aKey);

    /**
     * <p>getAsInt.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableInteger(final int aKey); if you want to have directy null.
     * 
     * @param aKey an unsigned int.
     * @return the int of the field of aKey.
     */
    int getAsInt(final int aKey);

    /**
     * <p>getAsNullableInt.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Integer of the field of aKey (a copy).
     */
    Integer getAsNullableInteger(final int aKey);

    /**
     * <p>getAsLong.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableLong(final int aKey); if you want to have directy null.
     * 
     * @param aKey an unsigned int.
     * @return the long of the field of aKey.
     */
    long getAsLong(final int aKey);

    /**
     * getAsNullableLong.
     * 
     * @param aKey an unsigned int.
     * @return the Long of the field of aKey (a copy).
     */
    Long getAsNullableLong(final int aKey);

    /**
     * <p>getAsFloat.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableFloat(final int aKey); if you want to have directy null.
     * 
     * @param aKey an unsigned int.
     * @return the float of the field of aKey.
     */
    float getAsFloat(final int aKey);

    /**
     * <p>getAsNullableFloat.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Float of the field of aKey (a copy).
     */

    Float getAsNullableFloat(final int aKey);

    /**
     * <p>getAsDouble.</p>
     * 
     * Can throw new IllegalArgumentException if the key is not present in the Msg (can return null for a primitive type). Use <T> T
     * getAsNullableDouble(final int aKey); if you want to have directy null.
     * 
     * @param aKey an unsigned int.
     * @return the double of the field of aKey.
     */
    double getAsDouble(final int aKey);

    /**
     * <p>getAsNullableDouble.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Double of the field of aKey (a copy).
     */
    Double getAsNullableDouble(final int aKey);

    /**
     * <p>getAsString.</p>
     * 
     * @param aKey an unsigned int.
     * @return the String of the field of aKey (a copy).
     */
    String getAsString(final int aKey);

    /**
     * <p>getAsMsg.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Msg of the field of aKey (a copy).
     */
    Msg getAsMsg(final int aKey);

    /**
     * <p>getAsMsg.</p>
     * 
     * @param aKey an unsigned int.
     * @param destMsg the msg to set the field of aKey.
     */
    void getAsMsg(final int aKey, final Msg destMsg);

    /**
     * <p>getAsBooleans.</p>
     * 
     * @param aKey an unsigned int.
     * @return the boolean[] of the field of aKey (a copy).
     */
    boolean[] getAsBooleans(final int aKey);

    /**
     * <p>getAsNullableBooleans.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Boolean[] of the field of aKey (a copy).
     */
    Boolean[] getAsNullableBooleans(final int aKey);

    /**
     * <p>getAsBytes.</p>
     * 
     * @param aKey an unsigned int.
     * @return the byte[] of the field of aKey (a copy).
     */
    byte[] getAsBytes(final int aKey);

    /**
     * <p>getAsNullableBytes.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Byte[] of the field of aKey (a copy).
     */
    Byte[] getAsNullableBytes(final int aKey);

    /**
     * <p>getAsShorts.</p>
     * 
     * @param aKey an unsigned int.
     * @return the short[] of the field of aKey (a copy).
     */
    short[] getAsShorts(final int aKey);

    /**
     * <p>getAsNullableShorts.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Short[] of the field of aKey (a copy).
     */
    Short[] getAsNullableShorts(final int aKey);

    /**
     * <p>getAsInts.</p>
     * 
     * @param aKey an unsigned int.
     * @return the int[] of the field of aKey (a copy).
     */
    int[] getAsInts(final int aKey);

    /**
     * <p>getAsNullableIntegers.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Integer[] of the field of aKey (a copy).
     */
    Integer[] getAsNullableIntegers(final int aKey);

    /**
     * <p>getAsLongs.</p>
     * 
     * @param aKey an unsigned int.
     * @return the long[] of the field of aKey (a copy).
     */
    long[] getAsLongs(final int aKey);

    /**
     * <p>getAsNullableLongs.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Long[] of the field of aKey (a copy).
     */
    Long[] getAsNullableLongs(final int aKey);

    /**
     * <p>getAsFloats.</p>
     * 
     * @param aKey an unsigned int.
     * @return the float[] of the field of aKey (a copy).
     */
    float[] getAsFloats(final int aKey);

    /**
     * <p>getAsNullableFloats.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Float[] of the field of aKey (a copy).
     */
    Float[] getAsNullableFloats(final int aKey);

    /**
     * <p>getAsDoubles.</p>
     * 
     * @param aKey an unsigned int.
     * @return the double[] of the field of aKey (a copy).
     */
    double[] getAsDoubles(final int aKey);

    /**
     * <p>getAsNullableDoubles.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Double[] of the field of aKey (a copy).
     */
    Double[] getAsNullableDoubles(final int aKey);

    /**
     * <p>getAsStrings.</p>
     * 
     * @param aKey an unsigned int.
     * @return the String[] of the field of aKey (a copy).
     */
    String[] getAsStrings(final int aKey);

    /**
     * <p>getAsMsgs.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Msg[] of the field of aKey (a copy).
     */
    Msg[] getAsMsgs(final int aKey);

    /**
     * <p>getAsMsgs.</p>
     * 
     * @param aKey an unsigned int.
     * @param destMsgs a Msg... to set the field of aKey (a copy).
     */
    void getAsMsgs(final int aKey, Msg... destMsgs);

    /**
     * <p>getAsObjects.</p>
     * 
     * @param aKey an unsigned int.
     * @return the Object[] of the field of aKey (a copy).
     */
    Object[] getAsObjects(final int aKey);

    /**
     * <p>getAll</p>.
     * 
     * @return a Msg (a copy).
     */
    Msg getAllAsMsg();

    /**
     * <p>getAllAsObjects.</p>
     * 
     * Each key is representing with the index of the array and each value is representing with the values of the array return.
     * 
     * @return the Object[] representing the msg (a copy).
     */
    Object[] getAllAsObjects();

    /**
     * <p>getAllAsObjects.</p>
     * 
     * Each key is representing with the index of the array and each value is representing with the values of the array return. Use retrieveKeyMax
     * before to allocate before the right number in the anObjects.
     * 
     * @param aObjects objects representing the msg to set.
     */
    void getAllAsObjects(final Object... aObjects);

    //  Write Value Methods
    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aNull a Null object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Null aNull);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param anObject a Object object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Object anObject);

    /**
     * set.
     * 
     * @param aKey an unsigned int.
     * @param aObject a Object object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength an boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Object aObject, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a boolean to set in the field of aKey.
     */
    void set(final int aKey, final boolean aBoolean);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a Boolean object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Boolean aBoolean);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBoolean a Boolean object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Boolean aBoolean, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte to set in the field of aKey.
     */
    void set(final int aKey, final byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a Byte object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Byte aByte);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aByte a byte.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Byte aByte, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short to set in the field of aKey.
     */
    void set(final int aKey, final short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a short to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final short aShort, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a Short object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Short aShort);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShort a Short object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Short aShort, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt an int to set in the field of aKey.
     */
    void set(final int aKey, final int aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt an int to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final int aInt, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt a Integer object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Integer aInt);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInt the Integer object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Integer aInt, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long to set in the field of aKey.
     */
    void set(final int aKey, final long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a long to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final long aLong, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a Long object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Long aLong);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLong a Long object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Long aLong, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a float to set in the field of aKey.
     */
    void set(final int aKey, final float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a Float object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Float aFloat);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloat a Float object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Float aFloat, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double to set in the field of aKey.
     */
    void set(final int aKey, final double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a short to set in the field of aKey.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final double aDouble, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Double aDouble);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Double aDouble, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a double to set in the field of aKey.
     * @param aScale a int which represents the number after the dot if positive and before the dot if negative.
     */
    void set(final int aKey, final double aDouble, final int aScale);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     * @param aScale a int which represents the number after the dot if positive and before the dot if negative.
     */
    void set(final int aKey, final Double aDouble, final int aScale);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDouble a Double object to set in the field of aKey (a reference, not a copy).
     * @param aScale a int which represents the number after the dot if positive and before the dot if negative.
     * @param optimizeLength a boolean to force/unforce optimization of length notably of null object or when the value of the object permits it (the
     *            default is true).
     */
    void set(final int aKey, final Double aDouble, final int aScale, final boolean optimizeLength);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aString a String object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final String aString);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aString a String object to set in the field of aKey (a reference, not a copy).
     * @param forceAsciiEncoding boolean to consider the aString is encoded in ASCII (default is false, UTF8 is used).
     */
    void set(final int aKey, final String aString, final boolean forceAsciiEncoding);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aMsg a Msg object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Msg aMsg);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBooleans a boolean... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBooleans a Boolean[] object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Boolean... aBooleans);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBytes a byte... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aBytes a Byte... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Byte... aBytes);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShorts a short... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aShorts a Short... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Short... aShorts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInts a int... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final int... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aInts a Integer... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Integer... aInts);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLongs a long... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aLongs a Long... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Long... aLongs);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloats a float... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aFloats a Float... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Float... aFloats);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDoubles a double... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aDoubles a Double... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Double... aDoubles);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aStrings a String... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final String... aStrings);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aStrings a String... object to set in the field of aKey (a reference, not a copy).
     * @param forceAsciiEncoding boolean to consider the aString is encoded in ASCII (default is false, UTF8 is used).
     */
    void set(final int aKey, final String[] aStrings, final boolean forceAsciiEncoding);

    /**
     * <p>set.</p>
     * 
     * @param aKey an unsigned int.
     * @param aMsgs a Msg... object to set in the field of aKey (a reference, not a copy).
     */
    void set(final int aKey, final Msg... aMsgs);

    /**
     * <p>setAll.</p>
     * 
     * @param aMsg the fields of aMsg to set in the msg.
     */
    void setAll(final Msg aMsg);

    /**
     * <p>setAll.</p>
     * 
     * Each key is representing with the index of the array and each value is representing with the value of the array in argument.
     * 
     * @param aObjects the fields to set in the msg.
     */
    void setAll(final Object... aObjects);

    /**
     * <p>remove.</p>
     * 
     * @param aKeys an unsigned int...
     */
    void remove(final int... aKeys);

    /**
     * <p>removeAll.</p>
     * 
     */
    void removeAll();

}
