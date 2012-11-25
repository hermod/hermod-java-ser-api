package com.github.hermod.ser.intmap;

/**
 * @author anavarro
 *
 */
public interface IntMapValue
{
    
    /**
     * byteAt.
     * 
     * @param index
     * @return
     */
    public abstract byte byteAt(final int index);
    
    /**
     * charAt.
     * 
     * @param index
     * @return
     */
    public abstract char charAt(final int index);
    
    /**
     * size.
     * 
     * @return
     */
    public abstract int size();
    
    /**
     * isEmpty.
     * 
     * @return
     */
    public abstract boolean isEmpty();
    
    /**
     * writeTo.
     * 
     * @param dest
     * @param sourceOffset
     * @param destOffset
     * @param size
     */
    public abstract void writeTo(final byte[] dest, final int sourceOffset, final int destOffset);
    
    /**
     * readFrom.
     * 
     * @param aBytes
     * @param aKeyOffset
     * @param aValueOffset
     * @param aValueSize
     */
    public void readFrom(final byte[] aBytes, final int aKeyOffset, final int aValueOffset, final int aValueSize);
    
    
}