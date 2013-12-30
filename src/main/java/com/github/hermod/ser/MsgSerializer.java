package com.github.hermod.ser;

/**
 * <p>MsgSerializer.</p>
 *
 * Class MsgSerializer is used to serialized Msg.
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public interface MsgSerializer {

    /**
     * getLength.
     *
     * @param srcMsg the src Msg
     * @return the length of the srcMsg
     */
    int getLength(final Msg srcMsg);

}
