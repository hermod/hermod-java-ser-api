package com.github.hermod.ser2.intmap;


/**
 * SealedIntMap.
 * 
 * @author anavarro - Dec 15, 2012
 * @param <T>
 * 
 */
@SuppressWarnings("rawtypes")
public interface SealedIntMap<T extends SealedIntMap>
{

    
    /**
     * containsKey.
     * 
     * @param aKey
     * @return
     */
    boolean contains(final int aKey);
    
    /**
     * get.
     * 
     * @param aKey
     * @return
     */
    Object get(final int aKey);

    /**
     * getAsByte.
     * 
     * @param aKey
     * @return
     */
    byte getAsByte(final int aKey);

    /**
     * getAsInt.
     * 
     * @param aKey
     * @return
     */
    int getAsInt(final int aKey);
    
    /**
     * getAsShort.
     * 
     * @param aKey
     * @return
     */
    short getAsShort(final int aKey);

    /**
     * getAsLong.
     * 
     * @param aKey
     * @return
     */
    long getAsLong(final int aKey);
    
    /**
     * getAsFloat.
     * 
     * @param aKey
     * @return
     */
    float getAsFloat(final int aKey);
    
    /**
     * getAsDouble.
     * 
     * @param aKey
     * @return
     */
    double getAsDouble(final int aKey);
    
    
    /**
     * getAsString.
     * 
     * @param aKey
     * @return
     */
    String getAsString(final int aKey);

    
    /**
     * getAsByteString.
     * 
     * @param aKey
     * @return
     */
    //IntMapValue getAsIntMapValue(final int aKey);
    
    /**
     * getAsIntMap.
     * 
     * @param aKey
     * @return
     */
    T getAsMap(final int aKey);
    
    /**
     * getKeys.
     * 
     * @return
     */
    int[] getKeys();
    

    /**
     * getIterator.
     * 
     * @return
     */
 //   IntMapIterator<T> getIterator();
    
}
    
