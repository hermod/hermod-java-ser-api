package com.github.hermod.ser2.intmap;

import com.github.hermod.ser.intmap.IntMapValue;

/**
 * IntMap.
 * 
 * @author anavarro - Dec 16, 2012
 * @param <T>
 * 
 */
@SuppressWarnings("rawtypes")
public interface IntMap<T extends IntMap> extends SealedIntMap<T>
{

    //super instead of extends because of PECS (see Java Effective)
    
    /**
     * clear.
     * 
     */
    void clear();

    
    /**
     * set.
     * 
     * @param aKey
     * @param aByte
     */
    void set(final int aKey, final byte aByte);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aShort
     */
    void set(final int aKey, final short aShort);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aInt
     */
    void set(final int aKey, final int aInt);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aLong
     */
    void set(final int aKey, final long aLong);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aFloat
     */
    void set(final int aKey, final float aFloat);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aDouble
     */
    void set(final int aKey, final double aDouble);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aDouble
     * @param nbDigit
     */
    void set(final int aKey, final double aDouble, final int nbDigit);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aString
     */
    void set(final int aKey, final String aString);
    
    /**
     * set.
     * 
     * @param aKey
     * @param aString
     */
    void set(final int aKey, final IntMapValue aString);

    
    /**
     * set.
     * 
     * @param aKey
     * @param aIntMap
     */
    void set(final int aKey, final T aIntMap);
 
    /**
     * setAll.
     * 
     * @param aKey
     * @param aIntMap
     */
    void setAll(final T aIntMap);
    
    /**
     * remove.
     * 
     * @param aKey
     */
    void remove(final int aKey);
    


    
}
