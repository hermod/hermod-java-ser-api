package com.github.hermod.ser.intmap;



/**
 * IntMapMsgFactory.
 * 
 * @author anavarro - Jun 6, 2011
 * 
 */
public interface ReadWriteIntMapMsgFactory<T extends ReadWriteIntMapMsg>
{
    /**
     * create.
     * 
     * @return
     */
    T create();
}
