package com.github.hermod.ser2;

/**
 * Msg.
 * 
 * @author anavarro - Dec 15, 2012
 * 
 */
public interface Msg extends SealedMsg
{
    /**
     * readFrom.
     * 
     * @param bytes
     * @param offset
     * @param length
     */
    void readFrom(final byte[] bytes, final int offset, final int length);
    
}
