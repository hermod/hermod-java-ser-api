package com.github.hermod.ser;



/**
 * <p>Msg interface.</p>
 *
 * @author anavarro
 * @version $Id: $Id
 */
public interface Msg extends Serializable {

    // super instead of extends because of PECS (see Java Effective)

    /**
     * <p>contains.</p>
     *
     * @param aKey a int.
     * @return a boolean.
     */
    boolean contains(final int aKey);

    /**
     * <p>get.</p>
     *
     * @param aKey a int.
     * @return a {@link java.lang.Object} object.
     */
    Object get(final int aKey);

    /**
     * <p>getAsByte.</p>
     *
     * @param aKey a int.
     * @return a byte.
     */
    byte getAsByte(final int aKey);

    /**
     * <p>getAsInt.</p>
     *
     * @param aKey a int.
     * @return a int.
     */
    int getAsInt(final int aKey);

    /**
     * <p>getAsShort.</p>
     *
     * @param aKey a int.
     * @return a short.
     */
    short getAsShort(final int aKey);

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
     * @return a {@link com.github.hermod.ser.Msg} object.
     */
    Msg getAsMsg(final int aKey);
    

    /**
     * <p>getAsArray.</p>
     *
     * @param aKey
     * @return
     */
    Object[] getAsArray(final int aKey);

    /**
     * <p>getKeys.</p>
     *
     * @return an array of int.
     */
    int[] getKeys();
    

    /**
     * <p>clear.</p>
     */
    void clear();

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
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void set(final int aKey, final Msg aMsg);
    
    /**
     * <p>set.</p>
     *
     * @param aKey a int.
     * @param anArray a Object[]
     */
    void set(final int aKey, final Object[] anArray);
    
    /**
     * <p>set.</p>
     *
     * @param aKey
     * @param anObject
     */
    void set(final int aKey, final Object anObject);

    /**
     * <p>setAll.</p>
     *
     * @param aMsg a {@link com.github.hermod.ser.Msg} object.
     */
    void setAll(final Msg aMsg);

    /**
     * <p>remove.</p>
     *
     * @param aKey a int.
     */
    void remove(final int aKey);

}
