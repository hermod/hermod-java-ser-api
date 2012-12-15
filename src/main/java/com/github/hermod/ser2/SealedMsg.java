package com.github.hermod.ser2;

/**
 * SealedMsg.
 * 
 * Choice the best name
 * Unmodifiable
 * Readeable
 * Immutable
 * Fixed
 * 
 * 
 * @author anavarro - Dec 15, 2012
 * 
 */
public interface SealedMsg
{
    /**
     * writeTo.
     * 
     * @return
     */
    byte[] writeTo();
   
    /**
     * writeTo.
     * 
     * @param bytes
     * @param offset
     * @return
     */
    int writeTo(byte[] bytes, final int offset);
    
}
