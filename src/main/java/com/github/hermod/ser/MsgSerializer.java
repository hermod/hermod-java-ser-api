package com.github.hermod.ser;

/**
 * <p>IMsgSerializer. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface MsgSerializer {

    /**
     * getLength.
     *
     * @param srcMsg
     * @return
     */
    int getLength(final Msg srcMsg);
    
}