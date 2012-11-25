package com.github.hermod.ser;

/**
 * IWriteMsg.
 * 
 * @author anavarro - Nov 11, 2011
 * 
 */
public interface WriteMsg
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
