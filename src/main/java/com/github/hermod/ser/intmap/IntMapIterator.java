package com.github.hermod.ser.intmap;


/**
 * IntMapIterator.
 * 
 * @author anavarro - Nov 11, 2011
 * @param <T>
 * 
 */
@SuppressWarnings("rawtypes")
public interface IntMapIterator<T extends ReadIntMap>
{

    /**
     * nextIndex.
     * 
     * @return
     */
    int nextKey();

    /**
     * getCurrentIndex.
     * 
     * @return
     */
    int getCurrentKey();

    /**
     * hasNext.
     * 
     * @return
     */
    boolean hasNext();
    
    /**
     * getCurrentType.
     * 
     * @return
     */
    byte getCurrentType();

    /**
     * get.
     * 
     * @param aKey
     * @return
     */
    Object get();

    /**
     * getAsByte.
     * 
     * @param aKey
     * @return
     */
    byte getAsByte();

    /**
     * getAsInt.
     * 
     * @param aKey
     * @return
     */
    int getAsInt();

    /**
     * getAsShort.
     * 
     * @param aKey
     * @return
     */
    short getAsShort();

    /**
     * getAsLong.
     * 
     * @param aKey
     * @return
     */
    long getAsLong();

    /**
     * getAsFloat.
     * 
     * @param aKey
     * @return
     */
    float getAsFloat();

    /**
     * getAsDouble.
     * 
     * @param aKey
     * @return
     */
    double getAsDouble();

    /**
     * getAsString.
     * 
     * @param aKey
     * @return
     */
    String getAsString();
    
    /**
     * getAsByteString.
     * 
     * @return
     */
    IntMapValue getAsByteString();

    /**
     * getAsIntMap.
     * 
     * @param aKey
     * @return
     */
    T getAsMap();

}