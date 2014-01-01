package com.github.hermod.ser;

/**
 * <p>MsgSerializer.</p>
 * 
 * The interface MsgSerializer is used to serialize a Msg.
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public interface MsgSerializer {

    /**
     * <p>getLength.</p>
     * 
     * @param srcMsg the src Msg
     * @return the length of the srcMsg
     */
    int getLength(final Msg srcMsg);

}
